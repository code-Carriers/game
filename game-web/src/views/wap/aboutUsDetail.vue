<template>
  <div class="container">
    <Header></Header>
    <div class="container-banner">
      <img src="../../assets/front/images/wap/关于我们配图@2x.png" alt=""
           class="container-banner-img"/>
    </div>

        <div class="container-body" v-if="selectItem==='董事会致辞'">
          <div class="container-body-title">董事会致辞</div>
          <div class="container-body-content">
            自1992年成立以来，中国深圳外轮代理有限公司（简称：深圳外代）乘着中国改革开放和港航事业蓬勃发展的东风，承蒙广大客户、各界朋友的鼎力支持，从蛇口出发，不断发展壮大，服务网络现已覆盖全国30多个口岸和城市，合作伙伴遍布全球，业务领域涵盖船舶代理、货运代理、保税仓储、进出口报关、报检、国际贸易、海运租船经纪、供应链管理、邮轮服务、项目物流、电商物流、物流应用软件开发及信息服务等多元化业务板块，已由传统的公共船务代理企业，发展成为在业内享有较高声誉的现代综合型海运物流服务供应商。
          </div>

          <div class="container-body-content">
            近年来，随着“一带一路”建设的发展，在新的历史机遇和挑战面前，深圳外代人锐意进取，开拓创新，以国际化视野和信心，秉承“准确、及时、文明、周到”的服务理念，在强大服务网络和多元化业务平台的支持下，致力于为船舶所有人和经营人、生产制造企业、贸易流通企业、电商企业、以及终端消费者提供更专业、更便捷、更安全、更具个性化的线上、线下优质服务，不断降低客户的物流成本，与客户共同成长，立志成为客户首选的船舶代理人、物流供应商和战略合作者，共同促进世界的互联互通。
          </div>

          <div class="container-body-content">
            在此，我谨代表深圳外代全体同仁，向与我们风雨兼程、一路同行的客户，向给予我们关心、支持的社会各界朋友致以诚挚的感谢！ 在这伟大的新时代，让我们不忘初心，牢记使命，继续携手，共创辉煌！
          </div>

        </div>
        <div class="container-body" v-if="selectItem==='公司简介'">
          <div class="container-body-title">综合型的海运物流服务商</div>
          <div class="container-body-content">
            中国深圳外轮代理有限公司（简称“深圳外代”）成立于1992年，其前身可追溯至1982年成立的中国外轮代理公司蛇口分公司，由中国外轮代理有限公司、中外运物流有限公司、招商局港口集团股份有限公司、深圳市盐田港集团有限公司、深圳市南油（集团）有限公司、深圳市航运集团有限公司六家股东出资组建，注册资本6000万元人民币，是深圳第一家从事国际船舶代理业务的龙头企业，专业水准和市场声誉被业界所公认。
          </div>

          <div class="container-body-content">
            在历经30多个春秋的风雨洗礼之后，深圳外代现已从传统的船舶代理企业成长为综合型的海运物流服务商，业务范围涵盖船舶代理、货运代理、进出口报关、保税仓储、供应链管理、项目物流、邮轮服务、物流应用软件开发及信息服务等多个领域，服务网络覆盖国内30多个城市和口岸，海外代理近200家，公司秉承“专家型代理，人性化服务”的理念，竭诚为客户提供“准确、文明、及时、周到”的服务，荣获“深圳市交通系统先进集体”、“深圳市物流和货运诚信企业”、“中国货运业大奖最佳船代公司华南区综合类优秀奖”、“马士基中国区最佳船代服务商”、“深圳市重点物流企业”、“南山区绿色通道企业”、“WCA2016年度亚洲最佳合作伙伴奖”。深圳外代1996年就建立了ISO质量管理体系并通过了英国标准局（BSI）认证，管理水平在业内一直保持领先地位，公司还建立起HSE管理体系并通过了相关标准认证，公司同时也是海关AEO高级认证企业。
          </div>

          <div class="container-body-content">
            近年来，深圳外代本着为客户创造价值的理念，深入践行国家“一带一路”倡议，依托自身多年在海运物流领域的深厚积淀，将服务范围进一步向供应链上下游延伸，持续打造全程物流服务能力，深度挖掘质效提升的潜能，为客户提供最便捷、最安全、最经济的物流解决方案，与客户共同成长、发展。
          </div>

        </div>

        <div class="container-body" v-if="selectItem==='组织架构'">
          <div class="container-body-title">组织架构</div>
          <img class="container-body-img1"
               src="../../assets/front/images/wap/组织架构@2x.png" alt=""/>
        </div>

        <div class="container-body" v-if="selectItem==='行业组织'">
          <div class="container-body-title">行业组织</div>
          <van-collapse accordion v-model="companyName">
            <van-collapse-item title="中国深圳外轮代理有限公司" name="1">
              <div>深圳市船舶代理学会会长单位</div>
              <div>中国船舶代理及无船承运人协会会员</div>
              <div>深圳海运协会会员</div>
            </van-collapse-item>
            <van-collapse-item title="深圳市外代仓储有限公司" name="2">
              <div>深圳市进出口商会会员</div>
              <div>深圳盐田区物流商会会员</div>
              <div>中国仓储协会会员</div>
            </van-collapse-item>
            <van-collapse-item title="深圳市外代国际货运有限公司" name="3">
              <div>深圳市国际货运代理协会副会长单位</div>
            </van-collapse-item>
            <van-collapse-item title="深圳市外代报关有限公司" name="4">
              <div>深圳市进出口商会会员</div>
              <div>广东深圳报关协会会员</div>
            </van-collapse-item>
          </van-collapse>
        </div>

        <div class="container-body" v-if="selectItem==='公司荣誉'">
          <div class="container-body-title">公司荣誉</div>
          <img class="container-body-img2"
               src="../../assets/front/images/wap/公司荣誉图@3x.png" alt=""/>
        </div>

        <div class="container-body" v-if="selectItem==='公司资质'">
          <div class="container-body-title">公司资质</div>
          <img class="container-body-img2"
               src="../../assets/front/images/wap/资质证书.png" alt=""/>
        </div>

        <div class="container-body" v-if="selectItem==='合作伙伴'">
          <div class="container-body-title">合作伙伴</div>
          <img class="container-body-img2"
               src="../../assets/front/images/wap/合作伙伴.png" alt=""/>
        </div>
    <Footer />
  </div>

</template>

<script>
  import Header from '@/views/wap/component/header'
  import Footer from '@/views/wap/component/FloatBall'

  export default {
    name: 'wap-aboutUsDetail',
    data() {
      return {
        selectItem: '',
        companyName: '1'
      }
    },
    components: {
      Header,
      Footer
    },created() {
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
      this.selectItem = this.$route.query.selectItem
    }
  }
</script>

<style  rel="stylesheet/scss" lang="scss" scoped>
  * {
    margin: 0;
    padding: 0;
  }
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
      padding: 30px 30px 30px 30px;

      &-title {
        font-weight: 600;
        color: #3B3F47;
        font-size: 32px;
        font-family: '微软雅黑', sans-serif;
        margin-bottom: 20px;
      }

      &-content {
        text-indent: 2em;
        color: #3B3F47;
        font-size: 25px;
        font-family: '微软雅黑', sans-serif;
        line-height: 40px;
        margin-bottom: 28px;
      }

      &-img1 {
        width: 100%;
      }

      &-img2 {
        width: 100%;
      }
    }
  }
  .van-collapse-item__content div {
    padding-top: 20px;
    padding-left: 30px;
    padding-bottom: 20px;
  }

  /deep/ .van-hairline--top-bottom {
    position: unset;
  }

  /deep/ .van-cell {
    position: relative;
    display: -webkit-box;
    display: -webkit-flex;
    display: flex;
    box-sizing: border-box;
    width: 100%;
    padding: 25px 30px;
    overflow: hidden;
    color: #323233;
    font-size: 26px;
    line-height: 28px;
    background-color: #fff;
  }

  /deep/ .van-collapse-item__content {
    padding: 0 25px;
    font-size: 22px;
    line-height: 1.5;
    background-color: #fff;
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
</style>
