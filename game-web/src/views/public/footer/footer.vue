<template>
  <div class="container-footer">
    <div class="container-footer-box1">

    </div>
    <!--页尾最后一行内容-->
    <div class="container-footer-box2">
      <span class="container-footer-box2-content">
        版权所有 © 企业名称
        <a href="https://beian.miit.gov.cn/#/Integrated/index" target="_blank">粤ICP备06064558号</a>

        <img src="../../../assets/front/images/beian.png"/>
        <a target="_blank" href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=44030502010357">粤公网安备 44030502010357号</a>

      </span>
    </div>

    <!--返回顶部模块-->
    <el-backtop>
      <img src="../../../assets/front/icon/goTop.png" alt=""/>
    </el-backtop>
  </div>

</template>

<script>
  export default {
    name: 'pageFooter',
    data() {
      return {
        selectQRCode: ''
      }
    },
    methods: {
      goPage(url) {
        window.open(url, '_self') // 路由跳转
      }
    }
  }

</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .container {
    min-width: 1300px;

    &-footer {
      background-color: #1F1F1F;

      &-box1 {
        padding: 80px 8% 50px 8%;
      }

      &-box2 {
        border-top: 1px solid rgba(255, 255, 255, 0.1);
        width: 100%;
        background: #1F1F1F;
        padding: 0 10%;
        position: relative;

        &-content {
          line-height: 80px;
          opacity: 0.6;
          font-family: PingFangSC-Regular, sans-serif;
          font-size: 13px;
          color: #FFFFFF;
          letter-spacing: 0;
        }
      }
    }
  }
</style>
