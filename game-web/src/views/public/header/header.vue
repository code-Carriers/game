<template>
  <div class="container">
    <!--导航栏模块-->
    <div class="container-nav">
      <el-row>
        <!--导航栏左边Logo图片-->
        <el-col :span="5">
          <a @click="goPage('#/index')" title="首页"><img class="container-nav-img" src="../../../assets/front/icon/深圳外代2LOGO.png" alt="logo"/></a>
        </el-col>
        <!--导航栏右边菜单-->
        <el-col :span="19">
          <div class="container-nav-box">
            <el-menu :default-active=activeIndex mode="horizontal" @select="handleSelectItem">
              <el-menu-item index="1"><a @click="goPage('#/index')">首页</a></el-menu-item>
              <el-menu-item index="2"><a @click="goPage('#/aboutUs-new')">关于我们</a></el-menu-item>
              <el-menu-item index="3"><a @click="goPage('#/serviceArea')">服务范围</a></el-menu-item>
              <el-menu-item index="4"><a @click="goPage('#/newsTendency')">新闻动态</a></el-menu-item>
              <el-menu-item index="5"><a @click="goPage('#/portGuide')">港口指南</a></el-menu-item>
              <el-menu-item index="6"><a @click="goPage('#/businessCulture')">企业文化</a></el-menu-item>
              <el-submenu>
                <template slot="title">在线服务</template>
                <el-menu-item><a href="http://www.56master.com/login.jsp" target="_blank">物流大师</a>
                </el-menu-item>
                <el-menu-item><a href="https://www.cpoles.com/" target="_blank">云极通</a>
                </el-menu-item>
                <el-menu-item index="1"><a @click="goSearch()">进出口货物信息查询</a>
                </el-menu-item>
              </el-submenu>
              <el-menu-item index="7"><a @click="goPage('#/contactUs')">联系我们</a></el-menu-item>
            </el-menu>
            <div title="切换英文" class="changeLanguage"  @click="languageChange('英文')">En</div>
          </div>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
    export default {
      name: 'pageHeader',
      props: {
        'activeIndex':String   //父组件向子组件传值
      },
      data() {
        return {
          languageFlag:'英文'
        }
      },
      methods: {
        // 切换语言
        languageChange(item) {
          this.languageFlag=item
          if(this.languageFlag==='英文') {
            this.goPage('#/web-EN/index')
          }
        },
        // 页头菜单栏选择
        handleSelectItem(key) {
          if (key === '1') {
            this.goPage('#/index')
          }
          if (key === '2') {
            this.goPage('#/aboutUs-new')
          }
          if (key === '3') {
            this.goPage('#/serviceArea')
          }
          if (key === '4') {
            this.goPage('#/newsTendency')
          }
          if (key === '5') {
            this.goPage('#/portGuide')
          }
          if (key === '6') {
            this.goPage('#/businessCulture')
          }
          if (key === '7') {
            this.goPage('#/contactUs')
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
          if(this.$route.path === '/index'){
            this.$emit('jump','container-OnlineService')
          }else{
            this.$router.push({path: '/index',query:{jump: 'container-OnlineService'}})
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
  @media screen and (max-width: 1450px){
    .container-nav {
      padding: 18px 8% 18px 8%;
    }
    .el-menu-item {
      padding: 0 15px;
    }
  }

  @media screen and (max-width: 1350px){
    .container-nav {
      padding: 18px 8% 18px 8%;
    }
    .el-menu-item {
      padding: 0 12px;
    }
  }
</style>
