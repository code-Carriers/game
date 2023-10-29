import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export const constantRouterMap = [
  {path: '*', redirect: '/index', hidden: true},
  {path: '/index', component: () => import('@/views/web-CN/index'), hidden: true},
  {path: '/web-EN/index', component: () => import('@/views/web-EN/index'), hidden: true},
  {path: '/web-EN/aboutUs-new', component: () => import('@/views/web-EN/aboutUs-new/index'), hidden: true},
  {path: '/web-EN/serviceArea', component: () => import('@/views/web-EN/serviceArea/index'), hidden: true},
  {path: '/web-EN/newsTendency', component: () => import('@/views/web-EN/newsTendency/index'), hidden: true},
  {path: '/web-EN/portGuide', component: () => import('@/views/web-EN/portGuide/index'), hidden: true},
  {path: '/web-EN/businessCulture', component: () => import('@/views/web-EN/businessCulture/index'), hidden: true},
  {path: '/web-EN/contactUs', component: () => import('@/views/web-EN/contactUs/index'), hidden: true},
  {path: '/404', component: () => import('@/views/error/404'), hidden: true},
  {path: '/serviceArea', component: () => import('@/views/web-CN/serviceArea/index'), hidden: true},
  {path: '/newsTendency', component: () => import('@/views/web-CN/newsTendency/index'), hidden: true},
  {path: '/activityDetail',component: () => import('@/views/web-CN/businessCulture/detail'),hidden: true},
  {path: '/web-EN/activityDetail',component: () => import('@/views/web-EN/businessCulture/detail'),hidden: true},
  {path: '/newsDetail',component: () => import('@/views/web-CN/newsTendency/detail'),hidden: true},
  {path: '/web-EN/newsDetail',component: () => import('@/views/web-EN/newsTendency/detail'),hidden: true},
  {path: '/activityDetail',component: () => import('@/views/web-CN/businessCulture/detail'),hidden: true},
  {path: '/portGuide', component: () => import('@/views/web-CN/portGuide/index'), hidden: true},
  {path: '/aboutUs-new', component: () => import('@/views/web-CN/aboutUs-new/index'), hidden: true},
  {path: '/businessCulture', component: () => import('@/views/web-CN/businessCulture/index'), hidden: true},
  {path: '/contactUs',component: () => import('@/views/web-CN/contactUs/index'),hidden: true},
  {path: '/wap/index',component: () => import('@/views/wap/index'),hidden: true},
  {path: '/wap/aboutUs',component: () => import('@/views/wap/aboutUs'),hidden: true},
  {path: '/wap/contactUs',component: () => import('@/views/wap/contactUs'),hidden: true},
  {path: '/wap/news',component: () => import('@/views/wap/news'),hidden: true},
  {path: '/wap/instructions',component: () => import('@/views/wap/instructions'),hidden: true},
  {path: '/wap/serviceArea',component: () => import('@/views/wap/serviceArea'),hidden: true},
  {path: '/wap/newsDetail',component: () => import('@/views/wap/newsDetail'),hidden: true},
  {path: '/wap/serviceAreaDetail',component: () => import('@/views/wap/serviceAreaDetail'),hidden: true},
  {path: '/wap/aboutUsDetail',component: () => import('@/views/wap/aboutUsDetail'),hidden: true},
  {path: '/wap/contactUsDetail',component: () => import('@/views/wap/contactUsDetail'),hidden: true},
  {path: '/wap/guideBrokerHandle',component: () => import('@/views/wap/guideBrokerHandle'),hidden: true},
  {path: '/wap/guideBrokerApply',component: () => import('@/views/wap/guideBrokerApply'),hidden: true},
  {path: '/wap/guideManifestChange',component: () => import('@/views/wap/guideManifestChange'),hidden: true},
  {path: '/wap/guideManifestChangeF',component: () => import('@/views/wap/guideManifestChangeF'),hidden: true},
  {path: '/wap/guideManifestModify',component: () => import('@/views/wap/guideManifestModify'),hidden: true},
  {path: '/wap/guideManifestList',component: () => import('@/views/wap/guideManifestList'),hidden: true},
  {path: '/wap/guideInBoundUpdateBill',component: () => import('@/views/wap/guideInBoundUpdateBill'),hidden: true},
  {path: '/wap/guideInBoundChangeBill',component: () => import('@/views/wap/guideInBoundChangeBill'),hidden: true},
  {path: '/wap/guideMklRecord',component: () => import('@/views/wap/guideMklRecord'),hidden: true},
  {path: '/wap/guideMklAttention',component: () => import('@/views/wap/guideMklAttention'),hidden: true},
  {path: '/wap/guideEirApply',component: () => import('@/views/wap/guideEirApply'),hidden: true},
  {path: '/wap/guideEirNotice',component: () => import('@/views/wap/guideEirNotice'),hidden: true}
]

export default new Router({
  // mode: 'history', // 后端支持可开
  scrollBehavior: () => ({y: 0}),
  routes: constantRouterMap
})
