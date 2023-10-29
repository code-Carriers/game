<template>
  <div class="container">
    <div class="container-body">
      <div class="container-body-title">出口舱单删改操作指引</div>
      <div class="container-body-subTitle">所有出口预配舱单的删单、改单，请先在海易通平台提交申请，并留意海关回执。</div>
      <div class="container-body-subTitle">一、可自由变更，在平台直接提交申请即可：</div>
      <div class="container-body-subTitle2">
        　1、改单：未出报关单，且未超出舱单自由变更时限未转人工审核。
      </div>
      <div class="container-body-subTitle3">
        　2、删单：未出报关单，且未超出舱单自由变更时限未转人工审核。
      </div>
      <div class="container-body-subTitle">二、不能自由变更，需递交书面资料给海关的删单、改单：</div>
      <div class="container-body-subTitle2">
        　1、未出报关单但超出舱单自由变更时限转人工审核。
      </div>
      <div class="container-body-subTitle3">
        　2、已出报关单。
      </div>
      <div class="container-body-subTitle3">
        　3、经海关查验科、处置科、风险科等相关部门处理过。
    </div>
      <div class="container-body-subTitle3">
        　4、退关、退场柜（退场柜的删单资料和退场申请需由报关行递交给海关）。
      </div>
      <div class="container-body-subTitle">三、递交海关的书面资料如下（报关公司需盖章）：</div>
      <div class="container-body-subTitle2">
        　  1、舱单变更申请表2份/可A4纸打印/一份贴条码，写明具体删改单的原因和报关单状态。
      </div>
      <div class="container-body-subTitle3">
        　  2、装船单2份/原件或A4纸复印件（改单的提供正确装船单，删单重报的提供旧船装船单）。
      </div>
      <div class="container-body-subTitle3">
        　3、报关行情况说明2份（删单重报的注明新船名航次且确保处置联系函已转到船管科）。
      </div>
      <div class="container-body-subTitle3">
        　4、报关单复印件1份（未出报关单和退场柜不要求）。
      </div>
      <div class="container-body-subTitle3">
        　5、查验记录单（如有）
      </div>
      <div class="container-body-subTitle1" style="margin-top: 7px">
        备注：在总关删改报关单且需要删改舱单的操作：
      </div>
      <div class="container-body-subTitle2">
        　1、先到船代确认删改舱单的书面资料;
      </div>
      <div class="container-body-subTitle3">
    　2、在网上向海关同时上传删改报关单和舱单的申请;
      </div>
      <div class="container-body-subTitle3">
        　3、将删改舱单的资料交回船代，待报关单删改成功后，联系船代发送删改舱单的报文;
      </div>
      <div class="container-body-subTitle3">
        　 4、查询到舱单回执转人工审核，报关行联系总关删改舱单。
      </div>
    </div>

    <Footer />
  </div>
</template>

<script>
  import Footer from '@/views/wap/component/FloatBall'

  export default {
    name: 'wap-guideManifestModify',
    components: {
      Footer
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>

  .container {
    height: auto;
    width: 100%;
    padding: 20px 15px 30px;
    border: 1px solid #ECECEC;
    border-radius: 10px 10px 10px 10px;

    &-body {
      padding: 20px 25px 50px 25px;

      &-title {
        color: #999;
        font-size: 32px;
        text-align: center;
        font-weight: 600;
        font-family: -apple-system-font, Helvetica Neue, sans-serif;
        margin-bottom: 30px;
      }

      &-subTitle {
        color: #999;
        font-size: 25px;
        font-weight: 600;
        margin-top: 15px;
        line-height: 32px;
      }

      &-subTitle1 {
        color: #999;
        font-size: 23px;
        font-weight: 600;
        margin-top: 15px;
      }

      &-subTitle2 {
        color: #999;
        font-size: 22px;
        margin-top: 12px;
        line-height: 35px;
      }

      &-subTitle3 {
        color: #999;
        font-size: 22px;
        margin-top: 6px;
        line-height: 35px;
      }

    }
  }
</style>
