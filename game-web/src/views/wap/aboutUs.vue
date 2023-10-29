<template>
  <div class="container">
    <Header></Header>
    <div class="container-banner">
      <img src="../../assets/front/images/wap/关于我们配图@2x.png" alt=""
           class="container-banner-img"/>
    </div>

    <div class="container-text">关于我们</div>
    <div class="container-nav">
      <div class="container-nav-row">
        <div class="container-nav-row-col" @click="goPage('#/wap/aboutUsDetail?selectItem=董事会致辞')">
          <img src="../../assets/front/images/wap/董事会致辞@5x.png" alt="" class="container-nav-row-col-img"/>
          <div class="container-nav-row-col-text">董事会致辞</div>
        </div>
        <div style="border-left: none" class="container-nav-row-col" @click="goPage('#/wap/aboutUsDetail?selectItem=公司简介')"><img
          src="../../assets/front/images/wap/公司简介@5x.png" alt=""
          class="container-nav-row-col-img"/>
          <div class="container-nav-row-col-text">公司简介</div>
        </div>
        <div style="border-left: none" class="container-nav-row-col" @click="goPage('#/wap/aboutUsDetail?selectItem=组织架构')"><img
          src="../../assets/front/images/wap/组织架构@5x.png" alt="" class="container-nav-row-col-img"/>
          <div class="container-nav-row-col-text">组织架构</div>
        </div>

      </div>
      <div class="container-nav-row">
        <div class="container-nav-row-col" @click="goPage('#/wap/aboutUsDetail?selectItem=行业组织')">
          <img src="../../assets/front/images/wap/行业组织@5x.png" alt="" class="container-nav-row-col-img"/>
          <div class="container-nav-row-col-text">行业组织</div>

        </div>
        <div style="border-left: none;border-bottom: 1px solid #E4E4E4;" class="container-nav-row-col" @click="goPage('#/wap/aboutUsDetail?selectItem=公司荣誉')"><img
          src="../../assets/front/images/wap/公司荣誉@5x.png" alt=""
          class="container-nav-row-col-img"/>
          <div class="container-nav-row-col-text">公司荣誉</div>
        </div>
        <div style="border-bottom: 1px solid #E4E4E4;border-top: 1px solid #E4E4E4;border-right: 1px solid #E4E4E4;border-left: none" class="container-nav-row-col" @click="goPage('#/wap/aboutUsDetail?selectItem=公司资质')"><img
          src="../../assets/front/images/wap/公司资质@5x.png" alt="" class="container-nav-row-col-img"/>
          <div class="container-nav-row-col-text">公司资质</div>
        </div>

      </div>
      <div class="container-nav-row">
        <div style="border: 1px solid #E4E4E4;" class="container-nav-row-col" @click="goPage('#/wap/aboutUsDetail?selectItem=合作伙伴')">
          <img src="../../assets/front/images/wap/合作伙伴@5x.png" alt="" class="container-nav-row-col-img"/>
          <div class="container-nav-row-col-text">合作伙伴</div>
        </div>
      </div>
    </div>

    <Footer></Footer>


  </div>
</template>

<script>
  import Header from '@/views/wap/component/header'
  import Footer from '@/views/wap/component/FloatBall'

  export default {
    name: 'wap-aboutUs',
    components: {
      Header,
      Footer
    },
    data() {
      return {
        companyName: '1'
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
    },
    methods: {
      handleSelectItem(item) {
        this.selectItem = item
        this.titleName = item
        this.imgHeight=200
      },
      goPage(url) {
        window.open(url, '_self') // 路由跳转
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  * {
    margin: 0;
    padding: 0;
  }

  .container {
    width: 100%;
    &-text {
      margin: 35px 0 30px 0;
      width: 100%;
      padding: 0 5%;
      font-size: 35px;
    }

    &-banner {
      width: 100%;
      height: 170px;

      &-img {
        width: 100%;
        height: 170px;
      }


    }

    &-nav {
      /*white-space: nowrap;*/
      /*overflow-x: scroll;*/
      width: 100%;
      /*border-bottom: 1px solid #E4E4E4;*/
      /*padding:0 38px;*/
      padding: 0 5%;

      &-row {
        width: 100%;

        &-col {
          height: 170px;
          width: 33%;
          float: left;
          position: relative;
          padding: 35px 0;
          border: 1px solid #E4E4E4;
          border-bottom: none;

          &-img {
            width: 60px;
            height: 60px;
            position: absolute;
            left: 50%;
            margin-left: -30px;
          }

          &-text {
            font-size: 22px;
            color: #000;
            width: 100%;
            text-align: center;
            position: absolute;
            bottom: 30px;

          }
        }

      }

      &-box {
        display: inline-block;
        color: #888888;
        padding: 16px;
        font-size: 35px;
      }

      &-boxClick {
        position: relative;
        height: 100px;
        color: #277AE3;
        display: inline-block;
        padding: 16px;
        font-size: 35px;

        &-line {
          position: absolute;
          bottom: 0;
          left: 50%;
          margin-left: -40px;
          width: 80px;
          height: 5px;
          background-color: #277AE3;
        }
      }
    }

    &-body {
      padding: 40px 40px 40px 40px;

      &-title {
        color: #3B3F47;
        font-size: 45px;
        font-family: '微软雅黑', sans-serif;
        margin-bottom: 40px;
      }

      &-content {
        text-indent: 2em;
        color: #3B3F47;
        font-size: 32px;
        font-family: '微软雅黑', sans-serif;
        line-height: 50px;
        margin-bottom: 40px;
      }

      &-img1 {
        width: 100%;
      }

      &-img2 {
        width: 100%;
      }
    }
  }
</style>
