import request from '@/utils/request'

// 统一登陆认证
export function apiLogin(username, password, browser, redirect_uri) {
  const vmForm = new FormData()
  vmForm.append('username', username)
  vmForm.append('password', password)
  vmForm.append('browser', browser)
  return request({
    url: '/cas/login',
    method: 'post',
    data: vmForm,
    params: {
      redirect_uri
    }
  })
}

// 统一验证码登陆认证
export function apiLoginSms(username, captchaId, code, browser, redirect_uri) {
  const vmForm = new FormData()
  vmForm.append('username', username)
  vmForm.append('captchaId', captchaId)
  vmForm.append('code', code)
  vmForm.append('browser', browser)
  return request({
    url: '/cas/login/sms',
    method: 'post',
    data: vmForm,
    params: {
      redirect_uri
    }
  })
}

// 系统网关退出
export function apiLogout() {
  return request({
    url: '/vesta/me/logout',
    method: 'get'
  })
}

