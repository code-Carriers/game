import {Message} from 'element-ui'

const cover = function (Vue) {
  // Message cover
  Vue.prototype.$message.success = function (msg) {
    Message({
      message: msg,
      type: 'success',
      duration: 3 * 1000,
      showClose: true
    })
  }

  Vue.prototype.$message.info = function (msg) {
    Message({
      message: msg,
      type: 'info',
      duration: 3 * 1000,
      showClose: true
    })
  }

  Vue.prototype.$message.error = function (msg) {
    if (typeof msg === 'object') {
      console.error(msg)
    } else {
      Message({
        message: msg,
        type: 'error',
        duration: 3 * 1000,
        showClose: true
      })
    }
  }

  Vue.prototype.$message.warning = function (msg) {
    Message({
      message: msg,
      type: 'warning',
      duration: 3 * 1000,
      showClose: true
    })
  }
}

export default cover
