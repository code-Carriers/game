import Vue from 'vue'
import SvgIcon from '@/components/SvgIcon'// svg组件

Vue.component('svg-icon', SvgIcon)// 全局注册

const requireAll = requireContext => requireContext.keys().map(requireContext)
const req = require.context('./svg', true, /\.svg$/)
requireAll(req)
