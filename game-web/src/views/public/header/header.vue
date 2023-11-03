<template>
  <div class="container">
    <!--导航栏模块-->
    <div class="container-nav">
      <el-row>
        <!--导航栏左边Logo图片-->
        <el-col :span="5">
          <a @click="goPage('#/index')" title="首页">
            <img class="container-nav-img"
                 src="/src/assets/front/icon/logo.png"
                 alt="logo"/></a>
        </el-col>
        <!--导航栏右边菜单-->
        <el-col :span="19">
          <div class="container-nav-box">
            <el-menu :default-active=activeIndex mode="horizontal" @select="handleSelectItem">
              <el-menu-item index="1"><a @click="goPage('#/index')">首页</a></el-menu-item>
              <el-menu-item index="2"><a @click="goPage('#/allGame')">全部游戏</a></el-menu-item>
              <el-submenu>
                <template slot="title">账号交易</template>
                <el-menu-item index="3"><a @click="goSearch()">我要买号</a></el-menu-item>
                <el-menu-item index="3"><a @click="goSearch()">我要卖号</a></el-menu-item>
                <el-menu-item index="3"><a @click="goSearch()">账号回收</a></el-menu-item>
              </el-submenu>
              <el-menu-item index="4"><a @click="goPage('#/newsTendency')">担保中介</a></el-menu-item>
              <el-menu-item index="5"><a @click="goPage('#/portGuide')">交易必看</a></el-menu-item>
              <el-menu-item index="6"><a @click="goPage('#/businessCulture')">交易保障</a></el-menu-item>
              <el-menu-item index="7"><a @click="goPage('#/serviceArea')">帮助中心</a></el-menu-item>
              <el-menu-item index="8"><a @click="goPage('#/contactUs')">关于我们</a></el-menu-item>
            </el-menu>
          </div>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    activeIndex: {
      type: String,
      default: false
    }
  },
  data() {
    return {
      languageFlag: '英文'
    }
  },
  methods: {
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
    }
  }
}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
.container {
  min-width: 1300px;

  /*导航栏样式*/
  &-nav {
    padding: 18px 8% 18px 8%;

    &-img {
      width: 364px;
      //height: 41px;
      margin-top: 10px;
    }

    &-box {
      float: right;
      margin-right: 32px;
    }

    .el-menu-item:hover {
      color: #538ED9;
    }

  }
}
</style>
