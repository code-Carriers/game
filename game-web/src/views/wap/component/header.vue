<template>
  <div class="container">
    <div class="container-headerBox">
      <div class="container-headerBox-header">
        <img class="container-headerBox-header-img" src="../../../assets/front/icon/logo3.png" alt="">
        <!--        <van-icon name="wap-nav" class="container-headerBox-header-navMenu" size="0.8rem" v-if="menuOpen===true"-->
        <!--                  @click="menuOpen=false"/>-->
        <!--        <van-icon name="cross" class="container-headerBox-header-navMenu" size="0.7rem" v-else @click="menuOpen=true"/>-->
      </div>
    </div>
    <!--    <div class="container-menuBox">-->
    <!--      <div v-if="menuOpen===false" style="position:relative;">-->
    <!--        <van-collapse v-model="menuName" accordion>-->
    <!--          <van-collapse-item title="首页" name="首页" ref="abc">-->
    <!--            <div :class="titleName==='首页'?'container-menuBox-titleClick':''">首页</div>-->
    <!--          </van-collapse-item>-->
    <!--          <van-collapse-item title="关于我们" name="关于我们">-->
    <!--            <div :class="titleName==='董事会致辞'?'container-menuBox-titleClick':''" >董事会致辞</div>-->
    <!--            <div :class="titleName==='公司简介'?'container-menuBox-titleClick':''">公司简介</div>-->
    <!--            <div :class="titleName==='组织架构'?'container-menuBox-titleClick':''">组织架构</div>-->
    <!--            <div :class="titleName==='行业组织'?'container-menuBox-titleClick':''">行业组织</div>-->
    <!--            <div :class="titleName==='公司荣誉'?'container-menuBox-titleClick':''">公司荣誉</div>-->
    <!--            <div :class="titleName==='公司资质'?'container-menuBox-titleClick':''">公司资质</div>-->
    <!--            <div :class="titleName==='合作伙伴'?'container-menuBox-titleClick':''">合作伙伴</div>-->
    <!--          </van-collapse-item>-->

    <!--          <van-collapse-item title="服务范围" name="服务范围">-->
    <!--            <div :class="titleName==='船舶代理'?'container-menuBox-titleClick':''">船舶代理</div>-->
    <!--            <div :class="titleName==='国际货运'?'container-menuBox-titleClick':''">国际货运</div>-->
    <!--            <div :class="titleName==='报税仓储'?'container-menuBox-titleClick':''">保税仓储</div>-->
    <!--            <div :class="titleName==='报关报检'?'container-menuBox-titleClick':''">报关报检</div>-->
    <!--            <div :class="titleName==='招商邮服'?'container-menuBox-titleClick':''">招商邮服</div>-->
    <!--          </van-collapse-item>-->


    <!--          <van-collapse-item title="新闻中心" name="新闻中心">-->
    <!--            <div :class="titleName==='公司新闻'?'container-menuBox-titleClick':''">公司新闻</div>-->
    <!--          </van-collapse-item>-->

    <!--          <van-collapse-item title="操作指南" name="操作指南">-->
    <!--            <div :class="titleName==='操作指南'?'container-menuBox-titleClick':''">操作指南</div>-->
    <!--          </van-collapse-item>-->

    <!--          <van-collapse-item title="联系我们" name="联系我们">-->
    <!--            <div :class="titleName==='联系我们'?'container-menuBox-titleClick':''">联系我们</div>-->
    <!--          </van-collapse-item>-->
    <!--        </van-collapse>-->
    <!--      </div>-->
    <!--    </div>-->
  </div>
</template>


<script>
  export default {
    name: 'wap-header',
    props: {
      'menuName': String,   //父组件向子组件传值
      'titleName': String
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
    data() {
      return {
        menuOpen: true
      }
    }, mounted() {
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .container {

    &-headerBox {
      width: 100%;
      position: relative;

      &-header {
        width: 60%;
        margin: 0 auto;

        &-img {
          width: 100%;
          margin: 28px 0 28px 0;
        }

        &-navMenu {
          position: absolute;
          top: 33px;
          right: 38px;
        }

        &-navMenu:hover {
          cursor: pointer;
        }
      }
    }

    &-menuBox {
      position: absolute;
      top: 130px;
      left: 0;
      width: 100%;
      z-index: 99;

      &-titleClick {
        padding-top: 20px;
        padding-left: 30px;
        padding-bottom: 20px;
        border-top: 2px solid #F5F5F5;
        color: #277AE3;
      }

      &-menuClick {
        color: #277AE3;
      }

    }


    /deep/ .van-cell__right-icon {
      margin-left: 4px;
      color: #969799;
    }

    /deep/ .van-cell__right-icon {
      height: 24px;
      font-size: 28px;
      line-height: 24px;
    }

    .van-collapse-item__content div {
      padding-top: 20px !important;
      padding-left: 55px !important;
      padding-bottom: 20px !important;
      border-bottom: 1px solid #ebedf0 !important;
    }

    /deep/ .van-cell {
      position: relative !important;
      display: -webkit-box !important;
      display: -webkit-flex !important;
      display: flex !important;
      box-sizing: border-box !important;
      width: 100% !important;
      padding: 30px 35px !important;
      overflow: hidden !important;
      color: #323233 !important;
      font-size: 30px !important;
      line-height: 28px !important;
      background-color: #fff !important;
      border-bottom: 1px solid #ebedf0 !important;
    }

    /deep/ .van-cell::after {
      border-bottom: unset !important;
    }

    /deep/ .van-collapse-item--border::after {
      border-top: unset !important;
    }

    /deep/ .van-collapse-item__content {
      padding: 0 0 !important;
      color: #969799 !important;
      font-size: 27px !important;
      line-height: 1.5 !important;
      background-color: #fff !important;
    }
  }
</style>
