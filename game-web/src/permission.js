import router from './router'
import NProgress from 'nprogress' // Progress 进度条
import 'nprogress/nprogress.css' // Progress 进度条样式

router.beforeResolve((to, from, next) => { // 路由跳转前
  NProgress.start() // 进度条开始滚动
  if (to.path === '/') {
    next({path: '/error/404'})
  } else {
    next()
    NProgress.done()
  }
})
router.afterEach(() => { // 路由跳转后
  NProgress.done() // 结束Progress
})
