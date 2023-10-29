import request from '@/utils/request'

export function apiGetActivityList(criteria) {
  return request({
    url: '/news/index',
    method: 'post',
    data: criteria
  })
}
