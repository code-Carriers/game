import lazyLoad from './lazyLoad'
import {getCustomRouterMap, getModuleUri} from '@/router'
import {isEmpty} from '@/utils/index'
import {getUUID} from '@/utils/encrypt'
import {getCache, hasCache} from '@/utils/cached'

const customRouterMap = getCustomRouterMap()

// 重组菜单结构
export function rebuildMenus(list) {
  const Menus = []
  list = list.sort(compare('seqNo'))
  const parentIdMap = getParentIds(list)
  for (const item of list) {
    if (item.menuUri.length < 2) {
      item.menuUri = getUUID()
    }
    const menu = {
      name: null,
      iconUri: null,
      menuUri: null
    }
    if (item.parentId === 'root') {
      menu.path = '/' + item.menuUri
      menu.component = lazyLoad('layout/Layout')
      menu.hidden = false
      menu.children = []
      if (parentIdMap.get(item.id) !== undefined) {
        menu.name = item.menuUri
        menu.children = (matchChildrens(list, menu.children, 2, item.id, parentIdMap, item.menuUri, menu.name))
        if (menu.children.length > 0) {
          menu.redirect = menu.children[0].path
        }
        menu.meta = {
          title: item.name,
          icon: isEmpty(item.iconUri) ? 'example' : item.iconUri,
          depth: 1
        }
      } else {
        menu.redirect = 'noredirect'
        const children = {}
        children.path = 'index'
        children.name = item.menuUri
        children.component = lazyLoad(getModuleUri(item.menuUri))
        children.meta = {
          title: item.name,
          icon: isEmpty(item.iconUri) ? 'example' : item.iconUri,
          depth: item.depth
        }
        menu.children.push(children)
      }
      // 处理自定义二级及以下菜单
      const customMenu = customRouterMap.get(item.menuUri)
      if (customMenu) {
        menu.children = menu.children.concat(customMenu)
      }
      Menus.push(menu)
    }
  }
  handleOceanRouter(Menus)
  handleAirRouter(Menus)
  handleObOceanRouter(Menus)
  handleObShipRouter(Menus)
  handleObBulkRouter(Menus)
  return Menus
}

// 匹配子菜单
export function matchChildrens(list, childrens, depth, parentId, parentIdMap, parentFullPath, parentName) {
  for (const item of list) {
    if (item.parentId === parentId) {
      const menu = {}
      if (item.menuUri.length === 36) {
        menu.component = lazyLoad('undefine/index')
      } else {
        menu.component = lazyLoad(parentFullPath + '/' + item.menuUri + '/index')
      }
      menu.name = item.menuUri
      menu.path = menu.name
      menu.hidden = false
      menu.meta = {
        title: item.name,
        icon: isEmpty(item.iconUri) ? 'example' : item.iconUri,
        depth: depth + 1,
        parentName: parentName
      }
      menu.children = []
      if (!isEmpty(parentIdMap.get(item.id))) {
        parentIdMap.set(item.id, '')
        menu.children = matchChildrens(list, menu.children, depth + 1, item.id, parentIdMap, parentFullPath + '/' + item.menuUri, menu.name)
      }
      // 处理自定义二级及以下菜单
      const customMenu = customRouterMap.get(item.menuUri)
      if (customMenu) {
        menu.children = menu.children.concat(customMenu)
      }
      childrens.push(menu)
    }
  }
  return childrens
}

// 菜单排序
function compare(property) {
  return function(a, b) {
    const value1 = a[property]
    const value2 = b[property]
    return value1 - value2
  }
}

// 获取有子菜单的菜单id
function getParentIds(list) {
  const map = new Map()
  for (const item of list) {
    map.set(item.parentId, item.parentId)
  }
  return map
}

// 处理海运工作单路由
function handleOceanRouter(list) {
  if (hasCache('OC_JOB_OPT')) {
    const oceanMap = new Map(getCache('OC_JOB_OPT', true, true))
    oceanMap.forEach(function(value) {
      value.menu.children[0].component = lazyLoad(value.componentUrl)
      value.menu.component = lazyLoad('layout/Layout')
      list.push(value.menu)
    })
  }
}

// 处理空运工作单路由
function handleAirRouter(list) {
  if (hasCache('AIR_JOB_OPT')) {
    const airMap = new Map(getCache('AIR_JOB_OPT', true, true))
    airMap.forEach(function(value) {
      value.menu.children[0].component = lazyLoad(value.componentUrl)
      value.menu.component = lazyLoad('layout/Layout')
      list.push(value.menu)
    })
  }
}

// 处理其它海运工作单路由
function handleObOceanRouter(list) {
  if (hasCache('OB_OC_OPT')) {
    const obOcMap = new Map(getCache('OB_OC_OPT', true, true))
    obOcMap.forEach(function(value) {
      value.menu.children[0].component = lazyLoad(value.componentUrl)
      value.menu.component = lazyLoad('layout/Layout')
      list.push(value.menu)
    })
  }
}

// 处理其它船舶工作单路由
function handleObShipRouter(list) {
  if (hasCache('OB_SHIP_OPT')) {
    const obShipMap = new Map(getCache('OB_SHIP_OPT', true, true))
    obShipMap.forEach(function(value) {
      value.menu.children[0].component = lazyLoad(value.componentUrl)
      value.menu.component = lazyLoad('layout/Layout')
      list.push(value.menu)
    })
  }
}

// 处理其它散货工作单路由
function handleObBulkRouter(list) {
  if (hasCache('OB_BULK_OPT')) {
    const obBulkMap = new Map(getCache('OB_BULK_OPT', true, true))
    obBulkMap.forEach(function(value) {
      value.menu.children[0].component = lazyLoad(value.componentUrl)
      value.menu.component = lazyLoad('layout/Layout')
      list.push(value.menu)
    })
  }
}
