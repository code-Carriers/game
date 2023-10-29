<template>
  <div class="container">
    <Header></Header>

    <div class="container-banner">
      <img src="../../assets/front/images/wap/新闻中心配图@2x.png" alt="" class="container-banner-img">
    </div>

    <div class="container-body" v-if="newsList.length!==0">
      <div v-for="item in newsList">
        <router-link
          :to="'/wap/newsDetail?id='+item.id+'&page='+newsCriteria.page+'&totalElements='+data.totalElements+'&totalPages='+data.totalPages">
          <div class="container-body-newsBox">
            <div class="container-body-newsBox-left">
              <div class="container-body-newsBox-left-title">{{item.title}}</div>
              <div class="container-body-newsBox-left-time">{{item.publishDt}}</div>
            </div>

            <div class="container-body-newsBox-right">
              <img class="container-body-newsBox-right-img" src="../../assets/front/images/homepage/newPic1.png" alt=""
                   v-if="item.titleImage===''"/>
              <img class="container-body-newsBox-right-img" :src="item.titleImage" alt="" v-else/>
            </div>
          </div>
        </router-link>
      </div>
    </div>


    <van-pagination v-model="currentPage" :page-count=data.totalPages mode="simple" @change="changePage(currentPage)"/>

    <div class="container-pagination">
    </div>
    <Footer />
  </div>
</template>


<script>
  import Header from '@/views/wap/component/header'
  import Footer from '@/views/wap/component/FloatBall'
  import {apiGetNewsList} from '@/api/news'

  export default {
    name: 'wap-news',
    components: {
      Header,
      Footer
    },
    data() {
      return {
        menuOpen: true,
        menuName: '新闻中心',
        titleName: '公司新闻',
        newsList: [],
        currentPage: 1,
        data: {
          totalElements: 0,
          totalPages: 0
        },
        newsCriteria: {
          type: 'list',
          web: 'PENAVICOSZ',
          language: '中文',
          catalog: '公司新闻',
          keyword: '',
          page: 0,//当前页
          size: 5 //初始化每页显示10条记录
        }
      }
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
      this.getNewsData(this.newsCriteria)
    },
    methods: {
      changePage(val) {
        this.newsCriteria.page=val-1
        this.getNewsData(this.newsCriteria)
        window.scrollTo(0, 0)//跳转到顶部
      },
      getNewsData(data) {
        apiGetNewsList(data).then((res) => {
          this.data = res
          this.newsList = res.content
          for (let i = 0; i < this.newsList.length; i++) {
            if (this.newsList[i].titleImage !== '') {
              this.newsList[i].titleImage = 'data:image/jpeg;base64,' + this.newsList[i].titleImage
            }
            const year = this.newsList[i].publishDt.substring(0, 4)
            const month = this.newsList[i].publishDt.substring(5, 7)
            const day = this.newsList[i].publishDt.substring(8, 10)
            this.newsList[i].publishDt = year + '年' + month + '月' + day + '日'
          }
        })
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .container {
    &-banner {
      &-img {
        width: 100%;
        height: 170px;
        margin-top: 10px;
      }
    }

    &-body {
      padding: 28px 40px 6px 40px;
      width: 100%;

      &-newsBox {
        height: 175px;
        padding-bottom: 30px;
        margin-bottom: 30px;
        border-bottom: 3px solid #F8F8F8;

        &-left {
          height: 140px;
          float: left;
          width: 60%;
          margin-right: 3%;
          position: relative;

          &-title {
            font-size: 28px;
            line-height: 42px;
            color: #3B3F47;
            letter-spacing: 3px;
            overflow: hidden;
            text-overflow: ellipsis;
            display: -webkit-box;
            -webkit-line-clamp: 2; // 控制多行的行数
            /*! autoprefixer: off */
            -webkit-box-orient: vertical;
            /* autoprefixer: on */
          }

          &-time {
            font-size: 23px;
            color: #888888;
            position: absolute;
            bottom: 0;
            left: 0;
          }
        }

        &-right {
          float: right;
          width: 37%;
          height: 140px;

          &-img {
            width: 100%;
            height: 140px;
          }
        }
      }
    }

    &-pagination {
      margin-top: 17px;
      height: 35px;
      width: 100%;
    }

  }

</style>
