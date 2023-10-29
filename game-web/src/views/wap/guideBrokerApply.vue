<template>
  <div class="container">
    <div class="container-body">
      <div align="center">
        <img src="../../assets/front/images/wap/guidebrokerapply.png" alt="" class="container-body-img"/>
      </div>
      <div class="container-body-link">
        <a href="./static/file/201705241618.doc">报关行开户备案申请表.doc</a>
      </div>
    </div>
    <Footer/>
  </div>
</template>

<script>
  import Footer from '@/views/wap/component/FloatBall'

  export default {
    name: 'wap-guideBrokerApply',
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
        margin-top: 5px;
        color:#0000EE;
        font-size: 25px;
        margin-bottom: 20px;
      }
    }
  }
</style>
