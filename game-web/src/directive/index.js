import {removeLogin} from '@/utils/auth'
import {removeToken, getCache} from '@/utils/cached'
import {deleteEnCodeWorked} from '@/utils/worked'
import router from '../router'
import lodash from 'lodash'

const Directive =
  {
    register(Vue) {
      Vue.directive('drag', function (e) {
        const oDiv = e
        if (oDiv.style.display === 'none') {
          oDiv.style.left = 0 + 'px'
          oDiv.style.right = 0 + 'px'
          oDiv.style.top = 0 + 'px'
        }
        oDiv.onmousedown = lodash.debounce(function (ev) {
          if (ev.toElement._prevClass === 'el-dialog__header') {
            const disX = ev.clientX - oDiv.offsetLeft
            const disY = ev.clientY - oDiv.offsetTop
            document.onmousemove = function (ev) {
              const l = ev.clientX - disX
              const t = ev.clientY - disY
              oDiv.style.left = l + 'px'
              oDiv.style.top = t + 'px'
              oDiv.style.cursor = 'move'
              document.onmouseup = function () {
                document.onmousemove = null
                document.onmouseup = null
                oDiv.style.cursor = 'default'
              }
            }
            document.onmouseup = function () {
              oDiv.style.cursor = 'default'
              document.onmousemove = null
              document.onmouseup = null
            }
          }
        }, 50)
      })
      Vue.directive('arrow', function (e) {
        const input = e.getElementsByTagName('input')[0]
        const icon = e.getElementsByClassName('el-input__prefix')[0]
        input.onblur = function () {
          if (!handleMatchClass(icon, 'hover-down')) {
            if (handleMatchClass(icon, 'hover-up')) {
              icon.className = icon.className.replace(new RegExp('(\\s|^)hover-up(\\s|$)'), ' hover-down')
            } else {
              icon.className = icon.className === '' ? 'hover-down' : icon.className + ' ' + 'hover-down'
            }
          }
        }
        input.onfocus = function () {
          if (!handleMatchClass(icon, 'hover-up')) {
            if (handleMatchClass(icon, 'hover-down')) {
              icon.className = icon.className.replace(new RegExp('(\\s|^)hover-down(\\s|$)'), ' hover-up')
            } else {
              icon.className = icon.className === '' ? 'hover-up' : icon.className + ' ' + 'hover-up'
            }
          }
        }
      })
      Vue.directive('errmsg', function (e) {
        e.addEventListener('DOMSubtreeModified', function () {
          const formItems = e.getElementsByClassName('el-form-item')
          const domMap = new Map()
          for (const item of formItems) {
            const groupName = item.getAttribute('group')
            let list = [false]
            if (domMap.get(groupName) !== undefined) {
              list = domMap.get(groupName)
            }
            list.push(item)
            const errDoms = item.getElementsByClassName('el-form-item__error')
            if (errDoms.length > 0) {
              list[0] = true
            }
            domMap.set(groupName, list)
          }
          domMap.forEach(function (val) {
            const length = val.length
            for (let i = 1; i < length; i++) {
              val[i].style.marginBottom = val[0] ? '20px' : '4px'
            }
          })
        })
      })
      Vue.directive('timeout', function () {
        let currentTime = new Date().getTime()
        const timeOut = 60 * 60 * 1000 //设置超时时间： 1小时
        let lastTime = new Date().getTime()
        /* 鼠标移动事件 */
        document.addEventListener('mouseover', function () {
          lastTime = new Date().getTime() //更新操作时间
        })

        function flushTime() {
          currentTime = new Date().getTime() //更新当前时间
          if (currentTime - lastTime > timeOut) { //判断是否超时
            sessionStorage.clear()
            removeToken()
            removeLogin()
            window.location.reload()
          }
        }

        /* 定时器间隔1分钟检测是否长时间未操作页面*/
        window.setInterval(flushTime, 60 * 1000)
      })
      Vue.directive('debug', function () {
        const threshold = 160

        function flushDebug() {
          const widthThreshold = window.outerWidth - window.innerWidth > threshold
          const heightThreshold = window.outerHeight - window.innerHeight > threshold
          if (!(heightThreshold && widthThreshold) &&
            ((window.Firebug && window.Firebug.chrome &&
              window.Firebug.chrome.isInitialized) ||
              widthThreshold || heightThreshold)) {
            if (router.currentRoute.path !== '/') {
              removeToken()
              removeLogin()
              window.location.reload()
            }
          }

          function doCheck(a) {
            if (('' + a / a)['length'] !== 1 || a % 20 === 0) {
              (function () {
              }['constructor']('debugger')())
            } else {
              doCheck(++a)
            }
          }

          try {
            doCheck(0)
          } catch (err) {
            console.log(err)
          }
        }

        /* 定时器间隔检测*/
        if (process.env.NODE_ENV !== 'development') {
          window.setInterval(flushDebug, 2000)
        }
      })
      Vue.directive('jump', function (e) {
        let domMap = handleMatchJumpDom(e)
        const refreshes = e.getElementsByClassName('refresh-jump')
        if (refreshes != null && refreshes.length > 0) {
          for (const refresh of refreshes) {
            refresh.onclick = function () {
              setTimeout(() => {
                domMap = handleMatchJumpDom(e)
              }, 500)
            }
          }
        }
        e.onkeydown = function (event) {
          const dom = event.target
          const e = event || window.event
          if (e && e.keyCode === 13) { //回车键的键值为13
            let jumpTo = dom.getAttribute('jump')
            if (!jumpTo) {
              const parentDom = dom.parentElement
              jumpTo = parentDom.getAttribute('jump')
              if (!jumpTo) {
                jumpTo = parentDom.parentElement.getAttribute('jump')
              }
            }
            if (jumpTo) {
              const targetDom = domMap.get(jumpTo)
              if (targetDom) {
                targetDom.focus()
              }
            }
          }
        }
      })
      Vue.directive('number-format', {
        bind: function (el, binding, vnode) {
          const element = el.getElementsByTagName('input')[0]
          let len = 3  // 初始化设置
          let nullValue = ''
          let event = 'blur'
          if (binding.arg !== undefined) {
            len = binding.arg.len  // 初始化设置
            nullValue = binding.arg.nullValue
            event = binding.arg.event
            if (len === undefined) {
              len = 3
            }
            if (nullValue === undefined) {
              nullValue = ''
            }
            if (event === undefined) {
              event = 'blur'
            }
          }
          element.value = Number(element.value).toFixed(len)  // 失焦时候格式化
          element.addEventListener(event, function () {
            if (isNaN(element.value)) {
              vnode.data.model.callback(nullValue)
            } else {
              vnode.data.model.callback(Number(element.value).toFixed(len))
            }
          })
        }
      })
      Vue.directive('close', function () {
        if (process.env.NODE_ENV !== 'development') {
          window.onbeforeunload = function (e) {
            if (router.currentRoute.path !== '/') {
              const worked = getCache('PENAVICOSZ_WORKED')
              if (worked !== undefined) {
                deleteEnCodeWorked(worked)
              }
              e = e || window.event
              // 兼容IE8和Firefox 4之前的版本
              if (e) {
                e.returnValue = '关闭提示'
              }
              // Chrome, Safari, Firefox 4+, Opera 12+ , IE 9+
              return '关闭提示'
            }
          }
        }
      })
    }
  }

function handleMatchClass(el, cls) {
  return el.className.match(new RegExp('(\\s|^)' + cls + '(\\s|$)'))
}

function handleMatchJumpDom(e) {
  const inputs = e.getElementsByTagName('input')
  const domMap = new Map()
  for (const item of inputs) {
    const name = item.getAttribute('name')
    if (name) {
      domMap.set(name, item)
    }
  }
  return domMap
}

export default Directive
