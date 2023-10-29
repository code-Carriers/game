<template>
  <div class="container">
    <Header :menuName=menuName :titleName=titleName></Header>
    <div class="container-banner">
      <img src="../../assets/front/images/wap/新闻中心配图@2x.png" alt="" class="container-banner-img">
    </div>

    <div class="container-body">
      <div class="container-body-title">{{news.title}}</div>
      <div class="container-body-dateTime">{{news.publishDt}}</div>
      <div class="container-body-content">
        <p class="container-body-content-word" style="font-family: 微软雅黑,sans-serif!important;font-size: 20px;"
           v-html="news.content">{{news.content}}</p>
      </div>

      <div class="container-body-box">
        <div class="container-body-box-leftFirst" v-if="firstFlag===true">
          上一篇
        </div>

        <div class="container-body-box-left" v-else @click="getLastNews">
          上一篇
        </div>

        <div class="container-body-box-rightLast" v-if="lastFlag===true">
          下一篇
        </div>

        <div class="container-body-box-right" v-else @click="getNextNews">
          下一篇
        </div>
      </div>
    </div>

<Footer />
  </div>
</template>

<script>
  import Header from '@/views/wap/component/header'
  import Footer from '@/views/wap/component/FloatBall'
  import {apiGetNews, apiGetNewsList} from '@/api/news'

  export default {
    name: 'wap-newsDetail',
    data() {
      return {
        menuName: '新闻中心',
        titleName: '公司新闻',
        newsId: '',
        news: {},
        firstFlag: false,
        lastFlag: false,
        newsCriteria: {
          type: 'list',
          web: 'PENAVICOSZ',
          language: '中文',
          catalog: '公司新闻',
          keyword: '',
          page: '',//当前页
          size: 5 //初始化每页显示10条记录
        },
        firstList: [],
        lastList: [],
        newsList: [],
        newsLastList: [],
        newsNextList: [],
        data: {
          totalElements: 0,
          totalPages: 0
        }
      }
    },
    components: {
      Header,
      Footer
    },
    created() {
      !(function (window) {
        setTimeout(function () {
          /* 设计图文档宽度 */
          const docWidth = 750
          // eslint-disable-next-line one-var
          const doc = window.document,
            // eslint-disable-next-line prefer-const
            docEl = doc.documentElement,
            // eslint-disable-next-line prefer-const
            resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize'
          const recalc = (function refreshRem() {
            /* 窗口当前宽度 */
            let clientWidth = docEl.getBoundingClientRect().width
            /* 页面宽度大于 750 时不再放大 */
            clientWidth = clientWidth > 750 ? 750 : clientWidth
            const oldSize = (clientWidth / docWidth * 100) + 'px'
            docEl.style.fontSize = oldSize

            /* 获取设置后的字体大小情况 - 因微信设置APP字体大小后会影响该设置 */
            const nowSize = window.getComputedStyle(document.getElementsByTagName('html')[0]).fontSize
            const oldSizeValue = parseFloat(oldSize, 10)
            const nowSizeValue = parseFloat(nowSize, 10)

            /* 当差值大于1时重新按差比计算出正确的px值 */
            if ((nowSizeValue - oldSizeValue) > 1 || (nowSizeValue - oldSizeValue) < -1) {
              const diff = (oldSizeValue / nowSizeValue)
              docEl.style.fontSize = ((clientWidth / docWidth * 100) * diff) + 'px'
            }
            return refreshRem
          })()
          /* 添加倍屏标识，安卓为1 */
          docEl.setAttribute('data-dpr', window.navigator.appVersion.match(/iphone/gi) ? window.devicePixelRatio : 1)
          if (/iP(hone|od|ad)/.test(window.navigator.userAgent)) {
            /* 添加IOS标识 */
            doc.documentElement.classList.add('ios')
            /* IOS8以上给html添加hairline样式，以便特殊处理 */
            if (parseInt(window.navigator.appVersion.match(/OS (\d+)_(\d+)_?(\d+)?/)[1], 10) >= 8) {doc.documentElement.classList.add('hairline')}
          }
          if (!doc.addEventListener) return
          window.addEventListener(resizeEvt, recalc, false)
          doc.addEventListener('DOMContentLoaded', recalc, false)
        }, 0)
      }(window))
      this.newsId = this.$route.query.id         //把链接上的新闻Id赋值给当前页
      this.newsCriteria.page = this.$route.query.page//把链接上的页数赋值给当前页
      this.newsCriteria.page = parseInt(this.newsCriteria.page)//需要把字符型转换为整型
      this.data.totalElements = this.$route.query.totalElements//把链接上的总记录数赋值给当前页
      this.data.totalPages = this.$route.query.totalPages//把链接上的总页数赋值给当前页
      this.isFirstOrLast()
      this.getNewsDetail()
    },
    methods: {
      isFirstOrLast() {
        apiGetNewsList(this.newsCriteria).then((res) => {
          this.firstOrLastList = res.content
          for (let i = 0; i < this.firstOrLastList.length; i++) {
            if (this.newsId === this.firstOrLastList[i].id) {
              if (i === 0) {
                if (this.newsCriteria.page === 0) {
                  this.firstFlag = true
                }
              }
              if(i===this.firstOrLastList.length-1) {
                if (this.newsCriteria.page === parseInt(this.data.totalPages) - 1) {
                  this.lastFlag = true
                }
              }
            }
          }
        })
      },
      getLastNews() {
        this.lastFlag=false
        this.newsList = []
        this.newsLastList = []
        this.firstFlag = false
        apiGetNewsList(this.newsCriteria).then((res) => {
          this.newsList = res.content
          for (let i = 0; i < this.newsList.length; i++) {
            if (this.newsId === this.newsList[i].id) {
              if (i === 0) {
                if (this.newsCriteria.page === 0) {
                  this.firstFlag = true
                } else {
                  this.newsCriteria.page = this.newsCriteria.page - 1
                  apiGetNewsList(this.newsCriteria).then((res) => {
                    this.newsLastList = res.content
                    this.newsId = this.newsLastList[this.newsLastList.length - 1].id
                    this.getNewsDetail()
                  })
                }
              } else if (i !== 0) {
                this.newsId = this.newsList[i - 1].id
                this.getNewsDetail()
              }
              break
            }
          }
        })
      },
      getNextNews() {
        this.firstFlag=false
        this.newsList = []
        this.newsNextList = []
        this.lastFlag = false
        apiGetNewsList(this.newsCriteria).then((res) => {
          this.newsList = res.content
          for (let i = 0; i < this.newsList.length; i++) {
            if (this.newsId === this.newsList[i].id) {
              if (i === this.newsList.length - 1) {
                if (this.newsCriteria.page === parseInt(this.data.totalPages) - 1) {
                  this.lastFlag = true
                } else {
                  console.log('进入下一页')
                  this.newsCriteria.page = this.newsCriteria.page + 1
                  apiGetNewsList(this.newsCriteria).then((res) => {
                    this.newsNextList = res.content
                    this.newsId = this.newsNextList[0].id
                    this.getNewsDetail()
                  })
                }
              } else if (i !== this.newsList.length - 1) {
                console.log('进入下一篇')
                this.newsId = this.newsList[i + 1].id
                this.getNewsDetail()
              }
              break
            }
          }
        })
      },
      getNewsDetail() {
        apiGetNews(this.newsId).then((res) => {
          this.news = res
          const year = this.news.publishDt.substring(0, 4)
          const month = this.news.publishDt.substring(5, 7)
          const day = this.news.publishDt.substring(8, 10)
          this.news.publishDt = year + '年' + month + '月' + day + '日'
        })
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>

  .container {
    &-banner {
      margin-bottom: 20px;

      &-img {
        width: 100%;
        height: 170px;
        margin-top: 10px;
      }
    }
    &-body {
      padding: 10px 40px 40px 40px!important;

      &-box {
        margin-top: 20px;
        margin-bottom: 30px;
        height: 75px;
        width: 100%;

        &-leftFirst {
          line-height: 75px;
          text-align: center;
          color: #646566;
          font-size: 40px;
          float: left;
          width: 45%;
          height: 75px;
          border: 2px solid #888888;
          border-radius: 9px;
        }

        &-left {
          line-height: 75px;
          text-align: center;
          color: #1989FA;
          font-size: 40px;
          float: left;
          width: 45%;
          height: 75px;
          border: 2px solid #888888;
          border-radius: 9px;
        }

        &-rightLast {
          line-height: 75px;
          text-align: center;
          color: #646566;
          font-size: 40px;
          float: right;
          width: 45%;
          height: 75px;
          border: 2px solid #888888;
          border-radius: 9px;

        }

        &-right {
          /*color: 646566;*/
          line-height: 75px;
          text-align: center;
          color: #1989FA;
          font-size: 40px;
          float: right;
          width: 45%;
          height: 75px;
          border: 2px solid #888888;
          border-radius: 9px;
        }

      }

      &-title {
        color: #3B3F47;
        font-size: 32px;
        letter-spacing: 2px;
        overflow: hidden;
        text-overflow: ellipsis;
        display: -webkit-box;
        -webkit-line-clamp: 2; // 控制多行的行数
        /*! autoprefixer: off */
        -webkit-box-orient: vertical;
        /* autoprefixer: on */
        margin-bottom: 20px;
      }

      &-dateTime {
        color: #888888;
        font-size: 16px;
      }


    }


  }

  .container-body-content-word > > > div {
    /*max-width: 630px !important;*/
    font-size: 22px !important;
    font-family: 微软雅黑, sans-serif !important;
    color: #383F47 !important;
    line-height: 32px !important;
    text-align: unset !important;
    letter-spacing: 3px !important;
    text-indent: unset!important;
  }

  .container-body-content-word > > > img {
    width: 100% !important;
    height: 420px;
    text-align: unset;
  }

  .container-body-content-word > > > span {
    font-size: 22px !important;
    font-family: 微软雅黑, sans-serif !important;
    color: #383F47 !important;
    line-height: 32px !important;
    letter-spacing: 3px !important;
  }

  .container-body-content-word > > > p {
    font-size: 22px !important;
    font-family: 微软雅黑, sans-serif !important;
    color: #383F47 !important;
    line-height: 32px !important;
    letter-spacing: 3px !important;
  }


</style>
