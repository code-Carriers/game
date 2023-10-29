<template>
  <div class="container">
    <Header></Header>
    <div class="container-banner">
      <img src="../../assets/front/images/wap/操作指南配图@2x.png" alt=""
           class="container-banner-img"/>
    </div>
    <div class="container-body">
      <div class="container-body-Box" style="margin-top: -7px">
        <div class="container-body-Box-title">出口业务</div>
        <div class="container-body-Box-subTitleBox" @click="goPage('#/wap/guideBrokerHandle')">
          <div class="container-body-Box-subTitleBox-subTitle">报关行开户备案办理须知</div>
         <img src="../../assets/front/images/wap/操作指南-更多@2x.png" alt="" class="container-body-Box-subTitleBox-arrow">
        </div>
        <div class="container-body-Box-subTitleBox" @click="goPage('#/wap/guideBrokerApply')">
          <div class="container-body-Box-subTitleBox-subTitle">报关行开户备案申请表</div>
          <img src="../../assets/front/images/wap/操作指南-更多@2x.png" alt="" class="container-body-Box-subTitleBox-arrow">
        </div>
        <div class="container-body-Box-subTitleBox" @click="goPage('#/wap/guideManifestChange')">
          <div class="container-body-Box-subTitleBox-subTitle">舱单变更申请表--海关留底</div>
          <img src="../../assets/front/images/wap/操作指南-更多@2x.png" alt="" class="container-body-Box-subTitleBox-arrow">
        </div>
        <div class="container-body-Box-subTitleBox" @click="goPage('#/wap/guideManifestChangeF')">
          <div class="container-body-Box-subTitleBox-subTitle">舱单变更申请表--外代留底</div>
          <img src="../../assets/front/images/wap/操作指南-更多@2x.png" alt="" class="container-body-Box-subTitleBox-arrow">
        </div>
        <div class="container-body-Box-subTitleBox" @click="goPage('#/wap/guideManifestModify')">
          <div class="container-body-Box-subTitleBox-subTitle">出口舱单删改操作指引</div>
          <img src="../../assets/front/images/wap/操作指南-更多@2x.png" alt="" class="container-body-Box-subTitleBox-arrow">
        </div>
        <div class="container-body-Box-subTitleBox" @click="goPage('#/wap/guideManifestList')">
          <div class="container-body-Box-subTitleBox-subTitle">出口舱单未结关所需资料清单</div>
          <img src="../../assets/front/images/wap/操作指南-更多@2x.png" alt="" class="container-body-Box-subTitleBox-arrow">
        </div>
      </div>

      <div class="container-body-Box">
        <div class="container-body-Box-title">进口业务</div>
        <div class="container-body-Box-subTitleBox" @click="goPage('#/wap/guideInBoundUpdateBill')">
          <div class="container-body-Box-subTitleBox-subTitle">进口海关改单操作指引</div>
          <img src="../../assets/front/images/wap/操作指南-更多@2x.png" alt="" class="container-body-Box-subTitleBox-arrow">
        </div>
        <div class="container-body-Box-subTitleBox" @click="goPage('#/wap/guideInBoundChangeBill')">
          <div class="container-body-Box-subTitleBox-subTitle">进口换单操作指引</div>
          <img src="../../assets/front/images/wap/操作指南-更多@2x.png" alt="" class="container-body-Box-subTitleBox-arrow">
        </div>
      </div>

      <div class="container-body-Box">
        <div class="container-body-Box-title">箱管业务</div>
        <div class="container-body-Box-subTitleBox" @click="goPage('#/wap/guideMklRecord')">
          <div class="container-body-Box-subTitleBox-subTitle">MKL备案流程</div>
          <img src="../../assets/front/images/wap/操作指南-更多@2x.png" alt="" class="container-body-Box-subTitleBox-arrow">
        </div>
        <div class="container-body-Box-subTitleBox" @click="goPage('#/wap/guideMklAttention')">
          <div class="container-body-Box-subTitleBox-subTitle">NYK网上打单指引及注意事项</div>
          <img src="../../assets/front/images/wap/操作指南-更多@2x.png" alt="" class="container-body-Box-subTitleBox-arrow">
        </div>
        <div class="container-body-Box-subTitleBox" @click="goPage('#/wap/guideEirApply')">
          <div class="container-body-Box-subTitleBox-subTitle">深圳外代EIR办单业务备案申请表</div>
          <img src="../../assets/front/images/wap/操作指南-更多@2x.png" alt="" class="container-body-Box-subTitleBox-arrow">
        </div>
        <div class="container-body-Box-subTitleBox" @click="goPage('#/wap/guideEirNotice')">
        <div class="container-body-Box-subTitleBox-subTitle">深圳外代EIR办单业务须知及操作指引</div>
        <img src="../../assets/front/images/wap/操作指南-更多@2x.png" alt="" class="container-body-Box-subTitleBox-arrow">
      </div>

      </div>
    </div>
    <Footer/>
  </div>
</template>

<script>
  import Header from '@/views/wap/component/header'
  import Footer from '@/views/wap/component/FloatBall'
  export default {
    name: 'wap-onlineService',
    components: {
      Header,
      Footer
    }, data() {
      return {}
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
      goPage(url) {
        window.open(url, '_self') // 路由跳转
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .container {
    width: 100%;

    &-banner {
      width: 100%;
      height: 170px;

      &-img {
        width: 100%;
        height: 170px;
      }


    }

    &-body {
    padding-bottom: 100px;
      &-Box {
        margin-top: 10px;
        &-title {
          height: auto;
          width: 100%;
          font-size: 32px;
          color: #000000;
          padding: 40px 5% 28px 5%;
          border-bottom: 1px solid #E4E4E4;
        }

        &-subTitleBox {
          width: 90%;
          margin: 0 5%;
          border-bottom: 1px solid #E4E4E4;
          padding: 22px 0;
          position: relative;
          &-subTitle {
            font-size: 22px;
            color: #9B9B9B;
          }
          &-arrow {
            width: 16px;
            height: 16px;
            position: absolute;
            right: 0;
            top: 50%;
            margin-top: -8px;
          }
        }


      }


    }
  }
</style>
