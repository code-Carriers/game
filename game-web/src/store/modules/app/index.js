import Cookies from 'js-cookie'
import {setCache} from '@/utils/cached'

// noinspection JSUnusedGlobalSymbols
const app = {
  state: {
    sidebar: {
      opened: true
    },
    visitedViews: [],
    cachedViews: [],
    disCachedViews: [],
    activeMenuKey: '',
    msgNum: 0
  },
  mutations: {
    TOGGLE_SIDEBAR: state => {
      if (state.sidebar.opened) {
        Cookies.set('PENAVICOSZ_SIDEBAR_STATUS', 1)
      } else {
        Cookies.set('PENAVICOSZ_SIDEBAR_STATUS', 0)
      }
      state.sidebar.opened = !state.sidebar.opened
    },
    SET_SIDEBAR: (state, opened) => {
      state.sidebar.opened = opened === 'true'
      if (state.sidebar.opened) {
        Cookies.set('PENAVICOSZ_SIDEBAR_STATUS', 1)
      } else {
        Cookies.set('PENAVICOSZ_SIDEBAR_STATUS', 0)
      }
    },
    ADD_VISITED_VIEWS: (state, view) => {
      if (view.path.indexOf('dashboard') > -1) {
        return
      }
      if (state.visitedViews.some(v => v.path === view.path)) return
      state.visitedViews.push({
        name: view.name,
        path: view.path,
        title: view.meta.title || 'no-name'
      })
      // noinspection JSUnresolvedVariable
      if (!view.meta.noCache) {
        state.cachedViews.push(view.name)
        if (view.meta.depth > 2) {
          if (!state.cachedViews.some(v => v === view.meta.parentName)) {
            state.cachedViews.push(view.meta.parentName)
          }
        }
      }
      setCache('PENAVICOSZ_VISITED', state.visitedViews, true, true)
      setCache('PENAVICOSZ_CACHED', state.cachedViews, true, true)
    },
    DEL_VISITED_VIEWS: (state, view) => {
      for (const [i, v] of state.visitedViews.entries()) {
        if (v.path === view.path) {
          state.visitedViews.splice(i, 1)
          break
        }
      }
      for (const i of state.cachedViews) {
        if (i === view.name) {
          const index = state.cachedViews.indexOf(i)
          state.cachedViews.splice(index, 1)
          break
        }
      }
      setCache('PENAVICOSZ_VISITED', state.visitedViews, true, true)
      setCache('PENAVICOSZ_CACHED', state.cachedViews, true, true)
    },
    DEL_OTHERS_VIEWS: (state, view) => {
      for (const [i, v] of state.visitedViews.entries()) {
        if (v.path === view.path) {
          state.visitedViews = state.visitedViews.slice(i, i + 1)
          break
        }
      }
      for (const v of state.cachedViews) {
        if (v === view.name) {
          const index = state.cachedViews.indexOf(v)
          state.cachedViews = state.cachedViews.slice(index, index + 1)
          break
        }
      }
      setCache('PENAVICOSZ_VISITED', state.visitedViews, true, true)
      setCache('PENAVICOSZ_CACHED', state.cachedViews, true, true)
    },
    DEL_LEFT_VIEWS: (state, view) => {
      for (const [i, v] of state.visitedViews.entries()) {
        if (v.path === view.path) {
          state.visitedViews = state.visitedViews.slice(i)
        }
      }
      for (const v of state.cachedViews) {
        if (v === view.name) {
          const index = state.cachedViews.indexOf(v)
          state.cachedViews = state.cachedViews.slice(index)
          break
        }
      }
      setCache('PENAVICOSZ_VISITED', state.visitedViews, true, true)
      setCache('PENAVICOSZ_CACHED', state.cachedViews, true, true)
    },
    DEL_RIGHT_VIEWS: (state, view) => {
      for (const [i, v] of state.visitedViews.entries()) {
        if (v.path === view.path) {
          state.visitedViews = state.visitedViews.slice(0, i + 1)
          break
        }
      }
      for (const v of state.cachedViews) {
        if (v === view.name) {
          const index = state.cachedViews.indexOf(v)
          state.cachedViews = state.cachedViews.slice(0, index + 1)
          break
        }
      }
      setCache('PENAVICOSZ_VISITED', state.visitedViews, true, true)
      setCache('PENAVICOSZ_CACHED', state.cachedViews, true, true)
    },
    DEL_ALL_VIEWS: (state) => {
      state.visitedViews = []
      state.cachedViews = []
      setCache('PENAVICOSZ_VISITED', state.visitedViews, true, true)
      setCache('PENAVICOSZ_CACHED', state.cachedViews, true, true)
    },
    SET_ACTIVE_MENU_KEY: (state, key) => {
      state.activeMenuKey = key
    },
    SET_DIS_CACHED_VIEW: (state, name) => {
      state.disCachedViews.push(name)
    },
    DEL_DIS_CACHED_VIEW: (state, name) => {
      for (const [i, v] of state.disCachedViews.entries()) {
        if (v === name) {
          state.disCachedViews.splice(i, 1)
          break
        }
      }
    },
    SET_MSG_NUM: (state, msgNum) => {
      state.msgNum = msgNum
    },
    CHANGE_VIEW_TITLE: (state, options) => {
      for (const v of state.visitedViews) {
        if (v.name === options.name) {
          v.title = options.title
          break
        }
      }
      setCache('PENAVICOSZ_VISITED', state.visitedViews, true, true)
    }
  },
  actions: {
    toggleSideBar: ({commit}) => {
      commit('TOGGLE_SIDEBAR')
    },
    addVisitedViews({commit}, view) {
      commit('ADD_VISITED_VIEWS', view)
    },
    delVisitedViews({commit, state}, view) {
      return new Promise((resolve) => {
        commit('DEL_VISITED_VIEWS', view)
        resolve([...state.visitedViews])
      })
    },
    delOthersViews({commit, state}, view) {
      return new Promise((resolve) => {
        commit('DEL_OTHERS_VIEWS', view)
        resolve([...state.visitedViews])
      })
    },
    delLeftViews({commit, state}, view) {
      return new Promise((resolve) => {
        commit('DEL_LEFT_VIEWS', view)
        resolve([...state.visitedViews])
      })
    },
    delRightViews({commit, state}, view) {
      return new Promise((resolve) => {
        commit('DEL_RIGHT_VIEWS', view)
        resolve([...state.visitedViews])
      })
    },
    delAllViews({commit, state}) {
      return new Promise((resolve) => {
        commit('DEL_ALL_VIEWS')
        resolve([...state.visitedViews])
      })
    },
    addDisCachedViews({commit}, name) {
      commit('SET_DIS_CACHED_VIEW', name)
    },
    delDisCachedViews({commit}, name) {
      commit('DEL_DIS_CACHED_VIEW', name)
    },
    changeViewTitle({commit}, options) {
      commit('CHANGE_VIEW_TITLE', options)
    }
  }
}

export default app
