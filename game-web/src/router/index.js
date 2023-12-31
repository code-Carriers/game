import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export const constantRouterMap = [
  {path: '*', redirect: '/index', hidden: true},
  {path: '/login', component: () => import('@/views/login/index'), hidden: true},
  {path: '/index', component: () => import('@/views/web-CN/index/index'), hidden: true}
]

export default new Router({
  // mode: 'history', // 后端支持可开
  scrollBehavior: () => ({y: 0}),
  routes: constantRouterMap
})
