import request from '@/utils/request'

// 提交信息反馈
export function apiSubmitForm(data) {
  return request({
    url: '/guest_books',
    method: 'post',
    data: data
  })
}
