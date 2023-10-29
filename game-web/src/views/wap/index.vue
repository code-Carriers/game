<template>
  <div class="container">
    <Header :menuName=menuName :titleName=titleName></Header>
    <van-swipe class="my-swipe" :autoplay="5000" indicator-color="white">
      <van-swipe-item>
        <el-row>
          <el-col :span="24">
            <div class="container-title1">
              <span>立足华南</span>
            </div>
            <div class="container-title2">
              <span>综合型的海运物流服务商</span>
            </div>
          </el-col>
        </el-row>
        <img src="../../assets/front/images/wap/banner1@2x.png" alt="" class="container-image"/>
      </van-swipe-item>
      <van-swipe-item>
        <el-row>
          <el-col :span="24">
            <div class="container-title1">
              <span>立足华南</span>
            </div>
            <div class="container-title2">
              <span>综合型的海运物流服务商</span>
            </div>
          </el-col>
        </el-row>
        <img src="../../assets/front/images/wap/banner4@2x.png" alt="" class="container-image"/>
      </van-swipe-item>
      <van-swipe-item>
        <el-row>
          <el-col :span="24">
            <div class="container-title1">
              <span>立足华南</span>
            </div>
            <div class="container-title2">
              <span>综合型的海运物流服务商</span>
            </div>
          </el-col>
        </el-row>
        <img src="../../assets/front/images/wap/banner2@2x.png" alt="" class="container-image"/>
      </van-swipe-item>
      <van-swipe-item>
        <el-row>
          <el-col :span="24">
            <div class="container-title1">
              <span>立足华南</span>
            </div>
            <div class="container-title2">
              <span>综合型的海运物流服务商</span>
            </div>
          </el-col>
        </el-row>
        <img src="../../assets/front/images/wap/banner3@2x.png" alt="" class="container-image"/>
      </van-swipe-item>
      <van-swipe-item>
        <el-row>
          <el-col :span="24">
            <div class="container-title1">
              <span>立足华南</span>
            </div>
            <div class="container-title2">
              <span>综合型的海运物流服务商</span>
            </div>
          </el-col>
        </el-row>
        <img src="../../assets/front/images/wap/banner5@2x.png" alt="" class="container-image"/>
      </van-swipe-item>
    </van-swipe>

    <div class="container-body">
      <div class="container-body-row">
        <div class="container-body-row-left" @click="goPage('#/wap/aboutUs')">
          <img src="../../assets/front/images/wap/关于我们@3x.png" alt="" class="container-body-row-left-img"/>
          <div class="container-body-row-left-text1">关于我们</div>
          <div class="container-body-row-left-text2">About Us</div>
        </div>
        <div class="container-body-row-right"  @click="goPage('#/wap/serviceArea')">
          <img src="../../assets/front/images/wap/服务范围@3x.png" alt="" class="container-body-row-left-img"/>
          <div class="container-body-row-left-text1">服务范围</div>
          <div class="container-body-row-left-text2">Scope Of Services</div>
        </div>
      </div>
      <div class="container-body-row">
        <div class="container-body-row-left" @click="goPage('#/wap/news')">
          <img src="../../assets/front/images/wap/新闻中心@3x.png" alt="" class="container-body-row-right-img"/>
          <div class="container-body-row-right-text1">新闻中心</div>
          <div class="container-body-row-right-text2">News Center</div>
        </div>
        <div class="container-body-row-right" @click="goPage('#/wap/instructions')">
          <img src="../../assets/front/images/wap/在线服务@3x.png" alt="" class="container-body-row-right-img"/>
          <div class="container-body-row-right-text1">操作指南</div>
          <div class="container-body-row-right-text2">Instructions</div>

        </div>
      </div>
      <div class="container-body-row">
        <div class="container-body-row-left" @click="goPage('#/wap/contactUs')">
          <img src="../../assets/front/images/wap/联系我们@3x.png" alt="" class="container-body-row-left-img"/>
          <div class="container-body-row-left-text1">联系我们</div>
          <div class="container-body-row-left-text2">Contact Us</div>
        </div>
      </div>


    </div>

  </div>
</template>

<script>
  import Header from '@/views/wap/component/header'
  export default {
    name: 'wap-index',
    components: {
      Header
    },
    data() {
      return {
        menuName: '首页',
        titleName: '首页'
      }
    },
    mounted() {
      const _this = this
      this.$nextTick(() => {
        _this.fx()
      })
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
      },
      fx() {
        this.imgFlag=false
        // if(this.imgFlag===true) {
        //   console.log(this.$refs.img[0])
        //   this.$refs.img[0].style.transition='transform 15s ease'
        //   this.$refs.img[0].style.transform='scale(1.1, 1.1)'
        // }else {
        //   this.$refs.img[0].style.transition=''
        //   this.$refs.img[0].style.transform=''
        // }
        // eslint-disable-next-line no-undef
        const obj2 = new window.SplitText($('.container-title1 span'), {type: 'chars'})
        // eslint-disable-next-line no-undef
        const obj3 = new window.SplitText($('.container-title2 span'), {type: 'chars'})
        // eslint-disable-next-line no-undef
        const tl = new TimelineMax()
        tl.staggerFrom(obj3.chars, 0.6, {
          delay: 0.6,
          scale: 4,
          autoAlpha: 0,
          rotationX: -180,
          transformOrigin: '100% 50%',
          ease: window.Back.easeOut
        }, 0.02, 1)
        // tl.staggerFrom(obj2.chars, 0.8, {y: 260, ease: window.Expo.easeOut},0.03, 0)
        tl.staggerFrom(obj2.chars, 1.5, {
          yPercent: 260,
          ease: window.Power4.easeInOut
        }, 0.05, 0.05)
        // tl.staggerFrom(obj3.chars, 0.8, {opacity:0, scale:0, y:80, rotationX:180, transformOrigin:'0% 50% -50',  ease:window.Back.easeOut}, 0.01, 2.1)
      }
    }

  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .container {
    width: 100%;

    &-title1 {
      display: block;
      width: 100%;
      text-align: center;
      font-size: 32px;
      height: 1.42em;
      overflow: hidden;
      margin: 40px auto 40px;
      color: #fff;
      font-family: source-Hans-sans, sans-serif;
      letter-spacing: 8px;
      z-index: 99;
      position: absolute;
    }
    &-title2 {
      display: block;
      width: 100%;
      text-align: center;
      font-size: 32px;
      height: 1.42em;
      overflow: hidden;
      margin: 100px auto 40px;
      color: #fff;
      font-family: source-Hans-sans, sans-serif;
      letter-spacing: 8px;
      z-index: 99;
      position: absolute;
    }
    &-image {
      position: absolute;
      top: 0;
      left: 0;
      width: 100%;
      height: 320px;
    }

    .my-swipe .van-swipe-item {
      width: 100%;
      height: 320px;
      position: relative;
    }

    &-body {
      width: 100%;
      &-row {
        width: 100%;
        &-left {
          display: inline-block;
          position: relative;
          height: 170px;
          width: 50%;
          float: left;
          padding-left: 5%;
          border-right: 1px solid #E4E4E4;
          border-bottom: 1px solid #E4E4E4;

          &-img {
            width:70px;
            height: 70px;
            position: absolute;
            top: 50%;
            margin-top: -41px;
          }

          &-text1 {
            color: #000000;
            font-size: 26px;
            font-weight: 600;
            position: absolute;
            top: 50%;
            margin-top: -40px;
            left: 38%;
          }

          &-text2 {
            color: #9B9B9B;
            font-size: 15px;
            font-weight: 600;
            position: absolute;
            top: 50%;
            margin-top: 7px;
            left: 38%;
          }
        }

        &-right {
          display: inline-block;
          position: relative;
          height: 170px;
          width: 50%;
          float: right;
          padding-left: 5%;
          border-bottom: 1px solid #E4E4E4;

          &-img {
            width:70px;
            height: 70px;
            position: absolute;
            top: 50%;
            margin-top: -41px;
          }

          &-text1 {
            color: #000000;
            font-size: 26px;
            font-weight: 600;
            position: absolute;
            top: 50%;
            margin-top: -40px;
            left: 38%;
          }

          &-text2 {
            color: #9B9B9B;
            font-size: 15px;
            font-weight: 600;
            position: absolute;
            top: 50%;
            margin-top: 7px;
            left: 38%;
          }
        }

      }
    }
  }
</style>
