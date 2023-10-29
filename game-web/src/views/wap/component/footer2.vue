<template>
  <div class="footer" @click="goBack">
    <img src="../../../assets/front/images/wap/返回.png" alt=""  class="footer-back" />
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
    &-back {
      width: 150px;
      height: 150px;
      bottom: 300px;
      right: 0;
      position: fixed;
      z-index: 999;
    }
  }
</style>
