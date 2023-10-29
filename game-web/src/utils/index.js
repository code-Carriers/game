/**
 * change by leehl on 12/06/18.
 */

/**
 * 格式化日期
 * @param {Date} time 时间
 * @param {String} cFormat 格式
 */
export function parseTime(time, cFormat) {
  if (arguments.length === 0) {
    return null
  }
  const format = cFormat || '{y}-{m}-{d} {h}:{i}:{s}'
  let date
  if (typeof time === 'object') {
    date = time
  } else {
    if (('' + time).length === 10) time = parseInt(time) * 1000
    date = new Date(time)
  }
  const formatObj = {
    y: date.getFullYear(),
    m: date.getMonth() + 1,
    d: date.getDate(),
    h: date.getHours(),
    i: date.getMinutes(),
    s: date.getSeconds(),
    a: date.getDay(),
    M: date.getMilliseconds()
  }
  return format.replace(/{([ymdhisaM])+}/g, (result, key) => {
    let value = formatObj[key]
    if (key === 'a') return ['一', '二', '三', '四', '五', '六', '日'][value - 1]
    if (result.length > 0 && value < 10) {
      value = '0' + value
    }
    return value || 0
  })
}

/**
 * 格式化时间
 * @param {Date} time 时间
 * @param {String} cFormat 格式
 */
export function formatTime(time, cFormat) {
  time = +time * 1000
  const d = new Date(time)
  const now = Date.now()
  const diff = (now - d) / 1000
  if (diff < 30) {
    return '刚刚'
  } else if (diff < 3600) { // less 1 hour
    return Math.ceil(diff / 60) + '分钟前'
  } else if (diff < 3600 * 24) {
    return Math.ceil(diff / 3600) + '小时前'
  } else if (diff < 3600 * 24 * 2) {
    return '1天前'
  }
  if (cFormat) {
    return parseTime(time, cFormat)
  } else {
    return d.getMonth() + 1 + '月' + d.getDate() + '日' + d.getHours() + '时' + d.getMinutes() + '分'
  }
}

/** 格式化时间
 * @author leehl
 * @date 2019-08-26 10:58
 * @param {String} 日期字符串
 */
export function formatDate(dataStr) {
  return isEmpty(dataStr) ? dataStr : dataStr.replace('T', ' ')
}

/** 判断空值
 * @author leehl
 * @date 2019-08-26 11:05
 * @param val
 * @return
 */
export function isEmpty(val) {
  return val === null || val === '' || val === undefined
}

/** 深度克隆对象
 * @author leehl
 * @date 2019-08-26 11:04
 * @param {Object} source 源数据
 */
export function deepClone(source) {
  if (isEmpty(source)) {
    return null
  }
  if (!source && typeof source !== 'object') {
    // noinspection JSCheckFunctionSignatures
    throw new Error('error arguments', 'shallowClone')
  }
  const targetObj = source.constructor === Array ? [] : {}
  Object.keys(source).forEach((keys) => {
    if (source[keys] && typeof source[keys] === 'object') {
      targetObj[keys] = source[keys].constructor === Array ? [] : {}
      targetObj[keys] = deepClone(source[keys])
    } else {
      targetObj[keys] = source[keys]
    }
  })
  return targetObj
}

/** 保存文件
 * @author leehl
 * @date 2019-08-26 11:02
 * @param {Blob} data 二进制流
 * @param {String} fileName 保存的文件名
 */
export function saveFile(data, fileName) {
  if (!data) {
    return
  }
  const url = window.URL.createObjectURL(new Blob([data]))
  const link = document.createElement('a')
  link.style.display = 'none'
  link.href = url
  link.setAttribute('download', fileName)
  document.body.appendChild(link)
  link.click()
  link.remove()
}

/** 复写样式 0、class 1、id
 * @author leehl
 * @date 2019-08-26 11:05
 */
export function overrideCss(type, node, allCss, tag) {
  if (isEmpty(allCss)) {
    return
  }
  const parent = (type === 0) ? document.getElementsByClassName(node)[0] : document.getElementById(node)
  if (!isEmpty(tag)) {
    const childs = parent.getElementsByTagName(tag)
    for (const child of childs) {
      child.style.cssText = allCss
    }
  } else {
    parent.style.cssText = allCss
  }
}

/**
 * 判断此对象是否是Object类型
 * @param {Object} obj
 */
function isObject(obj) {
  return Object.prototype.toString.call(obj) === '[object Object]'
}

/**
 * 判断此类型是否是Array类型
 * @param {Object} arr
 */
function isArray(arr) {
  return Object.prototype.toString.call(arr) === '[object Array]'
}

/**
 *  深度比较两个对象是否相同
 * @param {Object} target
 * @param {Object} resource
 * @param {Array} excludeFields
 */
export function equalsObj(target, resource, excludeFields) {
  if (isEmpty(target)) {
    return isEmpty(resource)
  }
  if (excludeFields === undefined || excludeFields === null) {
    excludeFields = ['createdBy', 'createdDt', 'modifiedBy', 'modifiedDt']
  }
  //       类型为基本类型时,如果相同,则返回true
  if (target === resource) return true
  if (isObject(target) && isObject(resource) && Object.keys(target).length === Object.keys(resource).length) {
    //      类型为对象并且元素个数相同

    //      遍历所有对象中所有属性,判断元素是否相同
    for (const key in target) {
      if (target.hasOwnProperty(key) && excludeFields.indexOf(key) === -1) {
        // noinspection JSCheckFunctionSignatures
        if (!equalsObj(target[key], resource[key])) {
          //      对象中具有不相同属性 返回false
          return false
        }
      }
    }
  } else if (isArray(target) && isArray(target) && target.length === resource.length) {
    //      类型为数组并且数组长度相同
    for (let i = 0, length = target.length; i < length; i++) {
      // noinspection JSCheckFunctionSignatures
      if (!equalsObj(target[i], resource[i])) {
        //      如果数组元素中具有不相同元素,返回false
        return false
      }
    }
  } else {
    // 其它类型,均返回false
    return false
  }
  // 走到这里,说明数组或者对象中所有元素都相同,返回true
  return true
}

/** 校验输入正负数， 保留指定位小数 传来的需要是string类型，默认两位
 * @param {String} value
 * @param {Number} num
 */
export function fixedNumber(value, num) {
  // 防止删除为空 一些错误金额输入的判断
  if (isEmpty(value)) {
    return ''
  }
  value = value.toString()
  const reg = new RegExp('/\b(0+){' + num + ',}/g')
  const reg2 = new RegExp('/\\-{' + num + ',}/g')
  const reg3 = new RegExp('/\\.{' + num + ',}/g')
  let newValue
  if (!(/[^0-9.-]/g.test(value))) {
    newValue = value.replace(/[^\-\d.]/g, '').replace(reg, '0').replace(reg2, '-').replace(/^\./g, '').replace(reg3, '.').replace('.', '$#$').replace(/\./g, '').replace('$#$', '.')
    if (newValue.toString().indexOf('.') > 0 && Number(newValue.toString().split('.')[1].length) > num) {
      newValue = parseInt(parseFloat(newValue) * 100) / 100
    }
    if ((newValue.toString().split('-').length - 1) > 1) {
      newValue = parseFloat(newValue) || ''
    }
    if ((newValue.toString().split('-').length) > 1 && newValue.toString().split('-')[0].length > 0) {
      newValue = parseFloat(newValue) || ''
    }
    if (newValue.toString().length > 1 && (newValue.toString().charAt(0) === '0' || (newValue.toString().length > num && newValue.toString().charAt(0) === '-' && newValue.toString().charAt(1) === '0' && newValue.toString().charAt(num) !== '.')) && newValue.toString().indexOf('.') < 1) {
      newValue = parseFloat(newValue) || ''
    }
    // 判断整数位最多为9位
    if (newValue.toString().indexOf('.') > 0 && Number(newValue.toString().split('.')[0].length) > 9) {
      newValue = newValue.toString().substring(0, 9) + '.' + newValue.toString().split('.')[1]
    } else if (newValue.toString().indexOf('.') < 0 && Number(newValue.toString().split('.')[0].length) > 9) {
      newValue = newValue.toString().substring(0, 9)
    }
  } else {
    newValue = value.replace(/[^0-9.-]/g, '')
  }
  return parseFloat(newValue).toFixed(num)
}

/** 转大写金额
 * @author leehl
 * @date 2019-08-26 11:01
 * @param {Number} num
 * @return
 */
export function transMoney(num) {
  const fraction = ['角', '分']
  const digit = [
    '零', '壹', '贰', '叁', '肆',
    '伍', '陆', '柒', '捌', '玖'
  ]
  const unit = [
    ['元', '万', '亿'],
    ['', '拾', '佰', '仟']
  ]
  const head = num < 0 ? '欠' : ''
  num = Math.abs(num)
  let s = ''
  for (let i = 0; i < fraction.length; i++) {
    s += (digit[Math.floor(num * 10 * Math.pow(10, i)) % 10] + fraction[i]).replace(/零./, '')
  }
  s = s || '整'
  num = Math.floor(num)
  for (let i = 0; i < unit[0].length && num > 0; i++) {
    let p = ''
    for (let j = 0; j < unit[1].length && num > 0; j++) {
      p = digit[num % 10] + unit[1][j] + p
      num = Math.floor(num / 10)
    }
    s = p.replace(/(零.)*零$/, '').replace(/^$/, '零') + unit[0][i] + s
  }
  return head + s.replace(/(零.)*零元/, '元')
    .replace(/(零.)+/g, '零')
    .replace(/^整$/, '零元整')
}

// byte[]转base64
export function arrayBufferToBase64(buffer) {
  let binary = ''
  const bytes = new Uint8Array(buffer)
  for (let len = bytes.byteLength, i = 0; i < len; i++) {
    binary += String.fromCharCode(bytes[i])
  }
  return window.btoa(binary)
}
