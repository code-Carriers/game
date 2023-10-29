<template>
  <div class="footer" @click="goBack">
    <img src="../../../assets/front/images/wap/返回@2x.png" alt=""  class="footer-back" />
    <div class="footer-text">返回</div>
  </div>
</template>

<script>
  export default {
    name: 'footer',
    methods: {
      goBack() {
        if(window.history.length<=1) {
          this.$router.push({path:'/wap/index'})
        }else {
          this.$router.go(-1)
        }
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  * {
    margin: 0;
    padding: 0;
  }
  .footer {
    bottom: 300px;
    right: 0;
    position: fixed;
    z-index: 999;
    padding: 30px 35px 30px 70px;
    border: 1px #dbdbdb solid;
    border-radius: 60px 0 0 60px;
    box-shadow: 0 10px 15px -10px rgba(0, 0, 0, 0.20);
    background: #fff;

  &-back {
     width: 28px;
     height: 36px;
     position: absolute;
     left: 30px;
     top: 50%;
     margin-top: -18px;
   }
  &-text {
     font-size: 36px;
     line-height: 40px;
   }
  }
</style>
