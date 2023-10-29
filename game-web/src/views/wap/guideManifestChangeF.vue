<template>
  <div class="container">
    <div class="container-body">
      <div align="center">
        <img src="../../assets/front/images/wap/guidemanifestchangef.png" alt="" class="container-body-img"/>
      </div>
      <div class="container-body-link">
        <a href="./static/file/201705241622.xls">舱单变更申请表--外代留底.xls</a>
      </div>
    </div>
    <Footer/>
  </div>
</template>

<script>
  import Footer from '@/views/wap/component/FloatBall'

  export default {
    name: 'wap-guideManifestChangeF',
    components: {
      Footer
    }
  }
</script>

<style  rel="stylesheet/scss" lang="scss"  scoped>
  .container {
    height: auto;
    width: 100%;
    padding: 20px 15px 30px;
    border: 1px solid #ECECEC;
    border-radius: 10px 10px 10px 10px;


    &-body {
      padding: 20px 25px;
      &-img {
        max-width: 100%;
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
