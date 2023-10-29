import Vue from 'vue'
import Vuex from 'vuex'
import app from './modules/app'
import appGetters from './modules/app/getters'

Vue.use(Vuex)
const getters = Object.assign(
  appGetters
)
const store = new Vuex.Store({
  modules: {
    app
  },
  getters
})

export default store
