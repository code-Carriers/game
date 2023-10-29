import request from '@/utils/request'

// 获取新闻
export function apiGetNewsList(criteria) {
  return request({
    url: '/news/index',
    method: 'post',
    data: criteria
  })
}

// 获取新闻详情
export function apiGetNews(id) {
  return request({
    url: '/news/'+id,
    method: 'get'
  })
}
