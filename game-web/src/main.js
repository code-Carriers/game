import Vue from 'vue'

import 'babel-polyfill' // es6处理，转es5
// noinspection ES6CheckImport
import promise from 'es6-promise' // es6 处理
import 'normalize.css/normalize.css' // 保留浏览器的原来样式
import ElementUI from 'element-ui' // 引入element-ui库
import 'element-ui/lib/theme-chalk/index.css'
import locale from 'element-ui/lib/locale/lang/zh-CN' // UI库语言
import '@/styles/index.scss' // 全局样式
import App from './App' // 项目主组件
import router from './router' // 路由F
import store from './store' // vuex状态管理
import '@/icons' // icon //svg图标
import '@/permission' // 权限管理
import Directive from '@/directive' // 自定义指令
import VueClipboard from 'vue-clipboard2' // 复制
import BaiduMap from 'vue-baidu-map' // 百度地图
import VueI18n from 'vue-i18n' // 国际化
import animated from 'animate.css' //动画
import hoverEffect from 'hover-effect' //悬停效果
import VueAwesomeSwiper from 'vue-awesome-swiper'
import 'swiper/dist/css/swiper.css'
// import {TweenMax,TimelineLite,TweenLite,TimelineMax} from 'gsap'
import TweenMax from 'gsap'
import Vant from 'vant' //引入vant移动端框架
import 'vant/lib/index.css'//引入vant样式
import 'amfe-flexible'//引入移动端自适应

import 'viewerjs/dist/viewer.css'
import Viewer from 'v-viewer' // 预览图片组件
Vue.use(Viewer)
Vue.use(Vant)// 使用vant
Vue.use(VueAwesomeSwiper, /* { default global options } */)
// 使用百度地图
Vue.use(BaiduMap, {
  // 暂不加密处理
  ak: 'KCzp8claYra8uYAvahElV9oKUT6j7Gx1'
})
// Vue.use(TweenMax,TimelineLite,TweenLite,TimelineMax)
// 国际化
Vue.use(TweenMax)
Vue.use(VueI18n)
// noinspection JSUnresolvedFunction
const i18n = new VueI18n({
  locale: localStorage.getItem('LANGUAGE') || 'zh',   //从localStorage里获取用户中英文选择，没有则默认中文
  messages: {
    'zh': require('./components/language/zh'),
    'en': require('./components/language/en')
  }
})
Vue.use(animated)
Vue.use(hoverEffect)
// 复制
VueClipboard.config.autoSetContainer = true
Vue.use(VueClipboard)
// 自定义指令
Directive.register(Vue)
// promise es6转换处理
promise.polyfill()
// 注入elementUI且指定语言
Vue.use(ElementUI, {locale}) // 使用组件
// 阻止 vue 在启动时生成生产提示
Vue.config.productionTip = false
// 开启debug模式
// noinspection JSUnresolvedVariable
Vue.config.devtools = process.env.NODE_ENV === 'development'
// 覆盖el参数
new Vue({ // 创建vue实例
  el: '#app', // 挂载到id为app的div里面
  router, // 路由
  i18n, // 国际化
  store, // vuex状态管理
  template: '<App/>', // 表示用<app></app>替换index.html里面的<div id="app"></div>
  components: {App} // 局部组件App
})

