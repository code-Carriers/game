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
              <el-menu-item index="1"><a @click="goPage('#/web-EN/index')">Home</a></el-menu-item>
              <!-- <el-submenu index="2">
                 <template slot="title">AboutUS</template>
                 <el-menu-item index="2-1"><a @click="goPage('#/web-EN/aboutUs')">百年招商</a></el-menu-item>
                 <el-menu-item index="2-2"><a @click="goPage('#/web-EN/aboutUs')">公司概况</a></el-menu-item>
                 <el-menu-item index="2-3"><a @click="goPage('#/web-EN/aboutUs')">企业文化</a></el-menu-item>
                 <el-menu-item index="2-3"><a @click="goPage('#/web-EN/aboutUs')">人才招聘</a></el-menu-item>
                 <el-menu-item index="2-3"><a @click="goPage('#/web-EN/aboutUs')">客户介绍</a></el-menu-item>
               </el-submenu>-->
              <el-menu-item index="2"><a @click="goPage('#/web-EN/aboutUs')">AboutUS</a></el-menu-item>
              <el-menu-item index="3"><a @click="goPage('#/web-EN/serviceWeb')">Service</a></el-menu-item>
              <el-menu-item index="4"><a @click="goPage('#/web-EN/business')">Business</a></el-menu-item>
              <el-menu-item index="5"><a @click="goPage('#/web-EN/news')">InfoShare</a></el-menu-item>
              <el-menu-item index="6"><el-button @click="goPage('#/index')" class="tabLang">中文</el-button></el-menu-item>
            </el-menu>
          </div>
        </el-col>
      </el-row>
    </div>
    <div class="container-banner">
      <!--<el-carousel height="500px">
        <el-carousel-item v-for="(item,index) in imgs" :key="item">
          <img src="../../../assets/front/images/banner01.jpg" alt="banner" v-if="index === 0" class="bannerImg"/>
          <img src="../../../assets/front/images/banner02.jpg" alt="banner" v-if="index === 1" class="bannerImg"/>
          <img src="../../../assets/front/images/banner04.jpg" alt="banner" v-if="index === 2" class="bannerImg"/>
        </el-carousel-item>
      </el-carousel>
-->
      <img src="../../../assets/front/images/banner-subpage.jpg" alt="banner" class="bannerImg"/>
    </div>
    <div class="container-body">
      <el-row>
        <el-col :span="4">
          <div style="font-size: 30px;color: #D7A335;">信息分享</div>
          <div class="container-body-menu">
            <div :class="selectItem==='政策法规'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('政策法规')">政策法规</a></div>
            <div :class="selectItem==='企业动态'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('企业动态')">企业动态</a></div>
            <div :class="selectItem==='行业资讯'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('行业资讯')">行业资讯</a></div>
          </div>
        </el-col>
        <el-col :span="20">
          <div style="padding-left: 30px">
          <div class="container-body-head">
            <el-carousel height="500px" v-if="titleImage.length !== 0">
              <el-carousel-item v-for="(item) in titleImage" :key="item.id">
                <router-link :to="'/web-EN/detail?id='+item.id">
                  <img style="width: 100%"
                       v-if="item.titleImage !== ''"
                       :src=" 'data:image/jpeg;base64,' + item.titleImage"
                       alt="">
                </router-link>
              </el-carousel-item>
            </el-carousel>
          </div>
          <div class="container-body-news" v-loading="listLoading">
            <div class="container-body-news-item" v-for="item in news">
              <router-link :to="'/web-EN/detail?id='+item.id">
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
          <div style="color: #fff;margin-top: 5px;opacity: 0.5">版权所有©2016 招商国际船舶代理有限公司</div>
        </el-col>
        <el-col :span="3" :offset=1>
          <div class="container-footer-item">
            <div class="container-footer-item-header">AboutUS</div>
            <div class="container-footer-item-info">Hundred Years of investment</div>
            <div class="container-footer-item-info">Company profile</div>
            <div class="container-footer-item-info">Corporate Culture</div>
            <div class="container-footer-item-info">Talent recruitment</div>
            <div class="container-footer-item-info">Customer introduction</div>
          </div>
        </el-col>
        <el-col :span="3">
          <div class="container-footer-item">
            <div class="container-footer-item-header">services</div>
            <div class="container-footer-item-info">Liner Agency</div>
            <div class="container-footer-item-info">Bulk goods</div>
            <div class="container-footer-item-info">Major parts business</div>
            <div class="container-footer-item-info">other</div>
          </div>
        </el-col>
        <el-col :span="3">
          <div class="container-footer-item">
            <div class="container-footer-item-header">business</div>
            <div class="container-footer-item-info">Containers</div>
            <div class="container-footer-item-info">Bulk goods</div>
            <div class="container-footer-item-info">Ship repair</div>
            <div class="container-footer-item-info">Crew replacement</div>
            <div class="container-footer-item-info">Customs Declaration</div>
          </div>
        </el-col>
        <el-col :span="3">
          <div class="container-footer-item">
            <div class="container-footer-item-header">InfoShare</div>
            <div class="container-footer-item-info">Policies and regulations</div>
            <div class="container-footer-item-info">Business Dynamics</div>
            <div class="container-footer-item-info">Industry Information</div>
          </div>
        </el-col>
        <el-col :span="5">
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
        selectItem: '政策法规',
        newsCriteria: {
          type: 'list',
          web: 'PENAVICOSZ',
          language: '英文',
          catalog: '',
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
      this.fetchData()
    },
    mounted() {
    },
    methods: {
      handleSelect(key) {
        if (key === '1') {
          this.goPage('#/web-EN/index')
        }
        if (key === '2') {
          this.goPage('#/web-EN/aboutUs')
        }
        if (key === '3') {
          this.goPage('#/web-EN/serviceWeb')
        }
        if (key === '4') {
          this.goPage('#/web-EN/business')
        }
        if (key === '5') {
          this.goPage('#/web-EN/news')
        }
        if (key === '6') {
          this.goPage('#/index')
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

      .el-menu-item:hover{
        color: #cfa54d;
      }
    }

    &-banner {

      .bannerImg {
        height: 340px;
        width: 100%;
      }
    }

    &-body {
      padding: 50px 10%;

      &-menu {
        margin-top: 50px;
        border-right: 2px #F2F2F2 solid;
        a:hover {
          color: #D7A335;
        }

       .menu-item {
          padding: 5px 20px;
          font-size: 16px;
          color: #3B3F47;
          margin-top: 20px;
        }

        .menu-item-check {
          font-size: 16px;
          color: #D7A335;
          margin-top: 20px;
          padding: 5px 20px;
          background: #FBF5EA;
          line-height: 38px;
          border-right: 2px #D7A335 solid;
        }
      }

      &-head {
        padding: 20px 10px;
      }

      &-news {
        padding: 20px 10px;

        &-item {
          margin: 30px 0;
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
          color: #fff;
          opacity: 0.6;
        }

        &-info {
          color: #fff;
          font-size: 13px;
          margin-top: 10px;
          opacity: 0.6;
        }
      }
    }

    .el-pager li.active {
      color: #fff;
      background: #D7A335;
      border-radius: 1px;
    }
  }
</style>
