import axios from 'axios'
import {Message} from 'element-ui'
import {getToken, removeToken} from '@/utils/cached'
import NProgress from 'nprogress' // Progress 进度条
import 'nprogress/nprogress.css'
import {isEmpty, equalsObj} from '@/utils/index' // Progress 进度条样式

// 创建axios实例
const service = axios.create({
  //baseURL: '/api/web-penavicosz/', // api的base_url
  baseURL: '/api/web-penavicosz', // api的base_url
  timeout: 30000, // 请求超时时间
  withCredentials: true // 用于携带cookies
})

const pendings = [] //声明一个数组用于存储每个ajax请求的取消函数和ajax标识
const CancelToken = axios.CancelToken
let startLimit = !isEmpty(getToken())

const removeRepeatUrl = (ever) => {
  for (const p in pendings) {
    const match = handleMatchRequest(pendings[p], ever)
    if (match) { // 当当前请求在数组中存在时执行函数体
      pendings[p].f() // 执行取消操作
      pendings.splice(p, 1) // 把这条记录从数组中移除
    }
  }
}

// request拦截器
service.interceptors.request.use(config => {
  NProgress.start()
  if (getToken()) {
    config.headers['token'] = getToken() // 让每个请求携带自定义token
  }
  if (isEmpty(config.params) || !config.params.concurrency) {
    removeRepeatUrl(config)
    config.cancelToken = new CancelToken((c) => {
      // 自定义唯一标识
      pendings.push({u: config.url, m: config.method, p: config.params, d: config.data, f: c})
    })
  }
  return config
}, error => {
  NProgress.done()
  console.error(error)
  // noinspection JSIgnoredPromiseFromCall
  Promise.reject(error)
})

// response拦截器
service.interceptors.response.use(
  response => {
    NProgress.done()
    if (startLimit || isEmpty(response.config.params) || !response.config.params.redirect_uri) {
      removeRepeatUrl(response.config) // 在一个ajax响应后再执行一下取消操作，把已经完成的请求从pendings中移除
    } else {
      startLimit = true
      pendings.splice(0)
    }
    if (response.status === 200) {
      return response.data
    } else if (response.status === 203) {
      return response
    } else if (response.status === 204) {
      return response
    } else if (response.status === 401) {
      removeToken()
      return response
    } else {
      Message({
        message: response.data.message === undefined ? response.data : response.data.message,
        type: 'error',
        duration: 3 * 1000,
        showClose: true
      })
      return Promise.reject('error')
    }
  }, (err) => { // 这里是返回状态码不为200时候的错误处理
    NProgress.done()
    if (err && err.response) {
      err.message = handleResponseState(err.response)
      if (!isEmpty(err.response.data.message)) {
        err.message = err.response.data.message
      }
      if (err.message.indexOf('optimistic') > -1) {
        err.message = '数据有变动，请刷新获取最新数据！'
      }
      Message({
        message: err.message,
        type: 'error',
        duration: 3 * 1000,
        showClose: true
      })
      console.error(err)
      return Promise.reject(err.message)
    }
  })

function handleResponseState(response) {
  switch (response.status) {
    case 400:
      return '请求错误'
    case 401:
      if (response.config.url === '/api/cas/login/sms') {
        return '手机号或邮箱号或验证码不正确'
      } else if (response.config.url === '/api/cas/login') {
        return '用户名或密码不正确'
      } else {
        return '未授权，请登录'
      }
    case 403:
      return '拒绝访问'
    case 404:
      return '请求地址出错'
    case 408:
      return '请求超时'
    case 423:
      return '账户已被锁定，请联系管理员'
    case 500:
      return '服务器内部错误'
    case 501:
      return '服务未实现'
    case 502:
      return '网关错误'
    case 503:
      return '服务不可用'
    case 504:
      return '网关超时'
    case 505:
      return 'HTTP版本不受支持'
    default:
      return ''
  }
}

function handleMatchRequest(target, resource) {
  if ('/api' + target.u === resource.url) {
    if (target.m === resource.method) {
      if (target.m === 'get' || target.m === 'GET') {
        // noinspection JSCheckFunctionSignatures
        return equalsObj(target.p, resource.params)
      } else {
        let resourceData = resource.data
        if (!isEmpty(resourceData) && Object.prototype.toString.call(resource.data) !== '[object FormData]') {
          resourceData = JSON.parse(resourceData)
        }
        // noinspection JSCheckFunctionSignatures
        return equalsObj(target.p, resource.params) && equalsObj(target.d, resourceData)
      }
    } else {
      return false
    }
  } else {
    return false
  }
}

export function axiosRequestAll(params) {
  return axios.all(params).then(axios.spread(function () {
    const aReturn = []
    for (const i of arguments) {
      aReturn.push(i)
    }
    return aReturn
  })).catch((err) => {
    return Promise.reject(err)
  })
}

export default service
