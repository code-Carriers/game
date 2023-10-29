<template>
  <div class="container">
    <div class="container-nav">
      <el-row>
        <el-col :span="10">
          <img src="../../../assets/front/images/logo.png" alt="logo" style="width: 340px;margin-top: 15px"/>
        </el-col>
        <el-col :span="14">
          <div style="float: right">
            <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect">
              <el-menu-item index="1"><a @click="goPage('#/index')">首页</a></el-menu-item>
              <!-- <el-submenu index="2">
                 <template slot="title">关于我们</template>
                 <el-menu-item index="2-1"><a @click="goPage('#/aboutUs')">百年招商</a></el-menu-item>
                 <el-menu-item index="2-2"><a @click="goPage('#/aboutUs')">公司概况</a></el-menu-item>
                 <el-menu-item index="2-3"><a @click="goPage('#/aboutUs')">企业文化</a></el-menu-item>
                 <el-menu-item index="2-3"><a @click="goPage('#/aboutUs')">人才招聘</a></el-menu-item>
                 <el-menu-item index="2-3"><a @click="goPage('#/aboutUs')">客户介绍</a></el-menu-item>
               </el-submenu>-->
              <el-menu-item index="2"><a @click="goPage('#/aboutUs')">关于我们</a></el-menu-item>
              <el-menu-item index="3"><a @click="goPage('#/serviceWeb')">服务网络</a></el-menu-item>
              <el-menu-item index="4"><a @click="goPage('#/business')">综合业务</a></el-menu-item>
              <el-menu-item index="5"><a @click="goPage('#/news')">信息分享</a></el-menu-item>
              <el-submenu index="7">
                <template slot="title">在线服务</template>
                <el-menu-item index="7-1"><a href="http://www.56master.com/login.jsp" target="_blank">56Master</a>
                </el-menu-item>
                <el-menu-item index="7-2"><a href="http://www.penavicosz.com.cn" target="_blank">进出口业务查询</a>
                </el-menu-item>
              </el-submenu>
              <el-menu-item index="6">
                <el-button @click="goPage('#/web-EN/index')" class="tabLang">English</el-button>
              </el-menu-item>
            </el-menu>
          </div>
        </el-col>
      </el-row>
    </div>
    <div class="container-banner">
      <img src="../../../assets/front/images/news/banner-list.jpg" alt="banner" class="bannerImg"/>
    </div>
    <div class="container-body">
      <el-row>
        <el-col :span="4">
          <div style="font-size: 30px;color: #D7A335;padding-left: 20px">信息分享</div>
          <div class="container-body-menu">
            <div :class="selectItem==='企业动态'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('企业动态')">企业动态</a></div>
            <div :class="selectItem==='行业资讯'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('行业资讯')">行业资讯</a></div>
            <div :class="selectItem==='政策法规'?'menu-item-check':'menu-item'">
              <a @click="handleSelectMenu('政策法规')">政策法规</a></div>
          </div>
        </el-col>
        <el-col :span="20">
          <div style="padding-left: 30px;border-left: 2px #F2F2F2 solid;">
            <div class="container-body-head">
              <!--<el-carousel height="400px" v-if="titleImage.length !== 0">
                <el-carousel-item v-for="(item) in titleImage" :key="item.id">
                  <router-link :to="'/detail?id='+item.id">
                  <img style="width: 100%"
                       v-if="item.titleImage !== ''"
                       :src=" 'data:image/jpeg;base64,' + item.titleImage"
                       alt="">
                  </router-link>
                </el-carousel-item>
              </el-carousel>-->
            </div>
            <div class="container-body-news" v-loading="listLoading">
              <div class="container-body-news-item" v-for="item in news">
                <router-link :to="'/detail?id='+item.id" target="_blank">
                  <div class="title">{{item.title}}</div>
                  <div class="content">{{item.summary}}</div>
                  <div class="date">{{item.publishDt}}</div>
                </router-link>
              </div>
              <div class="container-body-news-pagination">
                <el-pagination @current-change="handleCurrentChange"
                               :current-page="currentPage"
                               layout="prev, pager, next"
                               :total="data.totalElements">
                </el-pagination>
              </div>
            </div>
          </div>
        </el-col>
      </el-row>
    </div>
    <div class="container-footer">
      <el-row>
        <el-col :span="6">
          <img src="../../../assets/front/images/bottom-logo.png" style="width: 280px;" alt=""/>
          <div style="color: #fff;margin-top: 10px;opacity: 0.5">版权所有©2016 招商国际船舶代理有限公司</div>
        </el-col>
        <el-col :span="3" :offset=1>
          <div class="container-footer-item">
            <div class="container-footer-item-header"><a @click="goPage('#/aboutUs')">关于我们</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/aboutUs?selectItem=百年招商')">百年招商</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/aboutUs?selectItem=公司概况')">公司概况</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/aboutUs?selectItem=企业文化')">企业文化</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/aboutUs?selectItem=百年招商')">查看更多</a></div>
          </div>
        </el-col>
        <el-col :span="3">
          <div class="container-footer-item">
            <div class="container-footer-item-header"><a @click="goPage('#/serviceWeb')">服务网络</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/serviceWeb?selectItem=深圳总部')">深圳总部</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/serviceWeb?selectItem=广州公司')">广州公司</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/serviceWeb?selectItem=上海公司')">上海公司</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/serviceWeb?selectItem=深圳总部')">查看更多</a></div>
          </div>
        </el-col>
        <el-col :span="3">
          <div class="container-footer-item">
            <div class="container-footer-item-header"><a @click="goPage('#/business')">综合业务</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/business?selectItem=集装箱')">集装箱</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/business?selectItem=散杂货')">散杂货</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/business?selectItem=重大件')">重大件</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/business?selectItem=集装箱')">查看更多</a></div>
          </div>
        </el-col>
        <el-col :span="3">
          <div class="container-footer-item">
            <div class="container-footer-item-header"><a @click="goPage('#/news')">信息分享</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/news?selectItem=企业动态')">企业动态</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/news?selectItem=行业资讯')">行业资讯</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/news?selectItem=政策法规')">政策法规</a></div>
          </div>
        </el-col>
        <el-col :span="3">
          <div class="container-footer-item">
            <div class="container-footer-item-header"><span>友情链接</span></div>
            <div class="container-footer-item-info">
              <a href="https://www.cmhk.com" target="_blank">招商局集团</a>
            </div>
            <div class="container-footer-item-info"><a href="http://www.cmport.com.hk/" target="_blank">招商港口</a></div>
            <div class="container-footer-item-info"><a href="http://www.penavicosz.com.cn" target="_blank">深圳外代</a></div>
          </div>
        </el-col>
        <el-col :span="2">
          <div class="container-footer-item" style="float: right">
             <div style="width: 130px;height: 130px;background-color: #fff;">
              <img src="../../../assets/front/images/QRCode.jpg" style="width:130px;" alt=""/></div>
            <div style="color:#fff;font-size: 12px;text-align: center;margin-top: 10px">招商船代官微二维码</div>
          </div>
        </el-col>
      </el-row>
    </div>
    <el-backtop>
      <img src="src/assets/front/icon/goTop.png" alt=""/>
    </el-backtop>
  </div>
</template>

<script>
  import {apiGetNewsList} from '@/api/news'
  import {isEmpty} from '@/utils'

  export default {
    name: 'news',
    data() {
      return {
        activeIndex: '5',
        imgs: ['banner01.jpg', 'banner02.jpg', 'banner04.jpg'],
        selectItem: '企业动态',
        newsCriteria: {
          type: 'list',
          web: 'PENAVICOSZ',
          language: '中文',
          catalog: '企业动态',
          keyword: '',
          page: 0,
          size: 8
        },
        news: [],
        titleImage: [], //首页图片
        data: {totalElements: 0},
        currentPage: 1, // 当前页数
        listLoading: false
      }
    },
    created() {
      this.selectItem = this.$route.query.selectItem
      if (this.selectItem === undefined) {
        this.selectItem = '企业动态'
      }
      this.newsCriteria.catalog = this.selectItem
      this.fetchData()
    },
    mounted() {
    },
    methods: {
      handleSelect(key) {
        if (key === '1') {
          this.goPage('#/index')
        }
        if (key === '2') {
          this.goPage('#/aboutUs')
        }
        if (key === '3') {
          this.goPage('#/serviceWeb')
        }
        if (key === '4') {
          this.goPage('#/business')
        }
        if (key === '5') {
          this.goPage('#/news')
        }
        if (key === '6') {
          this.goPage('#/web-EN/index')
        }
      },
      handleSelectMenu(item) {
        this.selectItem = item
        this.newsCriteria.catalog = this.selectItem
        this.fetchData()
      },
      goPage(url) {
        window.open(url, '_self') // 路由跳转
      },
      // 页面跳转
      handleCurrentChange(val) {
        this.currentPage = val
        this.newsCriteria.page = val - 1
        this.fetchData()
      },
      fetchData() {
        this.listLoading = true
        apiGetNewsList(this.newsCriteria).then((res) => {
          this.data = res
          this.news = res.content
          //处理日期
          for (let i = 0; i < this.news.length; i++) {
            if (!isEmpty(this.news[i].publishDt)) {
              const year = this.news[i].publishDt.substring(0, 4)
              const month = this.news[i].publishDt.substring(5, 7)
              const day = this.news[i].publishDt.substring(8, 10)
              this.news[i].publishDt = year + '年' + month + '月' + day + '日'
            }
          }
          // 处理首页图片
          this.titleImage = []
          for (let i = 0; i < this.news.length; i++) {
            if (!isEmpty(this.news[i].titleImage)) {
              this.titleImage.push(this.news[i])
            }
          }
          this.listLoading = false
        })
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .container {

    min-width: 1300px;

    &-nav {
      padding: 10px 10%;

      .el-menu-item:hover {
        color: #538ED9;
      }
    }

    &-banner {

      .bannerImg {
        height: 300px;
        width: 100%;
      }
    }

    &-body {
      padding: 50px 10%;

      &-menu {
        margin-top: 50px;

        a:hover {
          color: #538ED9;
        }

        .menu-item {
          padding: 5px 20px;
          font-size: 16px;
          color: #3B3F47;
          margin-top: 20px;
        }

        .menu-item-check {
          font-size: 16px;
          color: #538ED9;
          margin-top: 20px;
          padding: 5px 20px;
          background: #FBF5EA;
          line-height: 38px;
          border-right: 2px #538ED9 solid;
        }
      }

      &-head {
        padding: 20px 10px;
      }

      &-news {
        padding: 20px 10px;

        &-item {
          margin: 30px 0;
          padding: 20px;
          background: #F8F8F8;

          .title {
            font-size: 18px;
            color: #3B3F47;
            padding: 10px;
            font-weight: bolder;
          }

          .content {
            font-size: 15px;
            color: #8F8F8F;
            line-height: 22px;
            padding: 10px;
          }

          .date {
            font-size: 13px;
            padding: 10px;
            opacity: 0.5;
          }
        }

        &-pagination {
          text-align: center;
          margin: 30px;

        }
      }
    }

    &-footer {
      height: 360px;
      background-color: #1F1F1F;
      padding: 80px 10%;

      &-item {
        margin-left: 10px;

        &-header {
          font-size: 16px;
          font-family: PingFangSC-Regular;
          color: #fff;
          opacity: 0.8;
          letter-spacing: 0;
          margin-bottom: 20px;
        }

        &-info {
          font-family: PingFangSC-Regular;
          color: #fff;
          font-size: 13px;
          margin-top: 10px;
          opacity: 0.6;
        }
      }
    }

  }
</style>
