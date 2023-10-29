<template>
  <div class="container">
    <!--导航栏模块-->
    <div class="container-nav">
      <el-row>
        <!--导航栏左边Logo图片-->
        <el-col :span="5">
          <a title="Home" @click="goPage('#/web-EN/index')"><img class="container-nav-img" src="../../../assets/front/icon/深圳外代2LOGO.png" alt="logo"/></a>
        </el-col>
        <!--导航栏右边菜单-->
        <el-col :span="19">
          <div class="container-nav-box">
            <el-menu :default-active=activeIndex mode="horizontal" @select="handleSelectItem">
              <el-menu-item index="1"><a @click="goPage('#/web-EN/index')">Home</a></el-menu-item>
              <el-menu-item index="2"><a @click="goPage('#/web-EN/aboutUs-new')">About Us</a></el-menu-item>
              <el-menu-item index="3"><a @click="goPage('#/web-EN/serviceArea')">Service Bu</a></el-menu-item>
              <el-menu-item index="4"><a @click="goPage('#/web-EN/newsTendency')">News</a></el-menu-item>
              <el-menu-item index="5"><a @click="goPage('#/web-EN/portGuide')">Port Guide</a></el-menu-item>
              <el-menu-item index="6"><a @click="goPage('#/web-EN/businessCulture')">Company Culture</a></el-menu-item>
              <el-submenu>
                <template slot="title">Online Service</template>
                <el-menu-item><a href="http://www.56master.com/login.jsp" target="_blank">56Master</a>
                </el-menu-item>
                <el-menu-item><a href="https://www.cpoles.com/" target="_blank">CPOLES</a>
                </el-menu-item>
                <el-menu-item index="1"><a @click="goSearch()">Cargo  Information Inquiry
                </a>
                </el-menu-item>
              </el-submenu>
              <el-menu-item index="7"><a @click="goPage('#/web-EN/contactUs')">Contact Us</a></el-menu-item>
            </el-menu>
            <div title="Switch Chinese" class="changeLanguage"  @click="languageChange('中文')">中</div>
          </div>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
    export default {
      name: 'pageHeader-EN',
      props: {
        'activeIndex':String   //父组件向子组件传值
      },
      data() {
        return {
          languageFlag:'中文'
        }
      },
      watch: {
        '$route' (to, from) {
          this.$router.go(0)
        }
      },
      methods: {
        goto(url,select) {
          localStorage.setItem('toId',select)
          this.$router.push({path: url})
        },
        // 切换语言
        languageChange(item) {
          if(this.languageFlag==='中文') {
            this.goPage('#/index')
          }
        },
        // 页头菜单栏选择
        handleSelectItem(key) {
          if (key === '1') {
            this.goPage('#/web-EN/index')
          }
          if (key === '2') {
            this.goPage('#/web-EN/aboutUs-new')
          }
          if (key === '3') {
            this.goPage('#/web-EN/serviceArea')
          }
          if (key === '4') {
            this.goPage('#/web-EN/newsTendency')
          }
          if (key === '5') {
            this.goPage('#/web-EN/portGuide')
          }
          if (key === '6') {
            this.goPage('#/web-EN/businessCulture')
          }
          if (key === '7') {
            this.goPage('#/web-EN/contactUs')
          }
        },
        // 以自窗口的形式打开新页面
        goPage(url) {
          window.open(url, '_self') // 路由跳转
        },
        goSearch() {
          // const select = selectId
          // localStorage.setItem('toId',select)
          // window.open(url, '_self') // 路由跳转
          if(this.$route.path === '/web-EN/index'){
            this.$emit('jump','container-OnlineService')
          }else{
            this.$router.push({path: '/web-EN/index',query:{jump: 'container-OnlineService'}})
          }
        }
      }
    }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  /deep/.el-submenu.is-active .el-submenu__title {
    border-bottom-color: unset;
    border-bottom: unset;
  }
  .container {
    min-width: 1300px;

    a:hover {
      color: #538ED9;
    }

    /*导航栏样式*/
    &-nav {
      padding: 18px 8% 18px 8%;

      &-img {
        width: 364px;
        height: 41px;
        margin-top: 10px;
      }

      &-box {
        float: right;
        margin-right: 32px;
        /*切换中英文语言的样式*/
        .changeLanguage {
          position: absolute;
          display: inline-block;
          width: 28px;
          height: 28px;
          text-align: center;
          line-height: 28px;
          background-color: #F6F8FA;
          font-family: PingFangSC-Regular,sans-serif;
          font-size: 15px;
          color: #3B3F47;
          letter-spacing: 0;
          cursor: pointer;
          top: 50%;
          margin-top: -13px;
          right: 0;
        }
        .changeLanguage:hover {
          position: absolute;
          display: inline-block;
          width: 28px;
          height: 28px;
          text-align: center;
          line-height: 28px;
          background-color: #538ED9;
          font-family: PingFangSC-Regular,sans-serif;
          font-size: 15px;
          color: #FFFFFF;
          letter-spacing: 0;
          cursor: pointer;
          top: 50%;
          margin-top: -13px;
          right: 0;
        }
      }

      .el-menu-item:hover {
        color: #538ED9;
      }

    }
  }
  @media screen and (max-width: 1612px){
    .container-nav {
      padding: 18px 7% 18px 7%;
    }
    .el-menu-item {
      padding: 0 16px;
    }
  }
  @media screen and (max-width: 1550px){
    .container-nav {
      padding: 18px 6% 18px 6%;
    }
    .el-menu-item {
      padding: 0 15px;
    }
  }
  @media screen and (max-width: 1490px){
    .container-nav {
      padding: 18px 5% 18px 5%;
    }
    .el-menu-item {
      padding: 0 11px;
    }
  }
  @media screen and (max-width: 1390px){
    .container-nav {
      padding: 18px 4% 18px 4%;
    }
    .el-menu-item {
      padding: 0 10px;
    }
    .container-nav-img {
     min-width: 320px;
    }
  }
  @media screen and (max-width: 1342px){
    .container-nav {
      padding: 18px 3% 18px 3%;
    }
    .el-menu-item {
      padding: 0 9px;
    }
  }


</style>
