import request from '@/utils/request'

export function apiGetNewsList(pageSize,currentNum) {
  return request({
    url:'/news/finaNewsList',
    method: 'get',
    params: {pageSize,currentNum}
  })
}

export function apiGetNewsById(id) {
  return request({
    url: '/news/'+id,
    method: 'get'
  })
}

export function apiGetAllNews() {
  return request({
    url: '/news/findAll',
    method: 'get'
  })
}
