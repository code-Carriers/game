<template>
  <div class="container">
    <div class="container-body">
      <div class="container-body-title">出口舱单未结关所需资料清单</div>
      <div class="container-body-subTitle2">
        1.海关未结关作业审批表（签字、盖章、四个条码—包括IMO号、船次号、新流水号、中间不带杠的报关单号条码）
      </div>
      <div class="container-body-subTitle3">
        2.船代舱单数据确认表（一式两份）
      </div>
      <div class="container-body-subTitle3">
        3.海关情况说明（一式两份）
      </div>
      <div class="container-body-subTitle3">
        4.报关单复印件（一式两份）
      </div>
      <div class="container-body-subTitle3">
        5.装船单黄联
      </div>
      <div class="container-body-subTitle3">
        适用业务范围：大鹏海关
      </div>
      <div class="container-body-link">
        <a href="./static/file/201705241624.docx">出口舱单未结关所需资料清单.doc</a>
      </div>
    </div>

    <Footer />
  </div>
</template>

<script>
  import Footer from '@/views/wap/component/FloatBall'

  export default {
    name: 'wap-guideManifestList',
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
      padding: 20px 25px;

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
      &-link {
        margin-top: 10px;
        color:#0000EE;
        font-size: 25px;
        margin-bottom: 20px;
      }

    }
  }
</style>
