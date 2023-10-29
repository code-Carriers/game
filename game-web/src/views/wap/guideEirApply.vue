<template>
  <div class="container">
    <div class="container-body">
      <div align="center">
        <img src="../../assets/front/images/wap/eirapply.png" alt="" class="container-body-img"/>
      </div>
      <div class="container-body-link" style="text-align: right">
      <div class="container-body-subTitle3" style="display: inline-block">
        下载链接：
      </div>
      <a href="./static/file/201705241618%20(3).doc">EIR备案申请表.doc</a>
    </div>
    </div>
    <Footer/>
  </div>
</template>

<script>
  import Footer from '@/views/wap/component/FloatBall'

  export default {
    name: 'wap-guideEirApply',
    components: {
      Footer
    }
  }
</script>

<style  rel="stylesheet/scss" lang="scss"  scoped>
  .container {
    height: auto;

    &-body {
      &-img {
        max-width: 100%;
      }
      &-subTitle3 {
        color: #999;
        font-size: 22px;
      }
      &-link {
        margin-right: 38px;
        margin-top: 10px;
        color: #0000EE;
        font-size: 22px;
        margin-bottom: 20px;
      }
    }
  }
</style>
