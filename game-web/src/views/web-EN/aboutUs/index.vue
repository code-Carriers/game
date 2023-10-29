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
          <div style="font-size: 30px;color: #D7A335;">关于我们</div>
          <div class="container-body-menu">
            <div :class="selectItem==='百年招商'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('百年招商')">百年招商</a></div>
            <div :class="selectItem==='公司概况'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('公司概况')">公司概况</a></div>
            <div :class="selectItem==='企业文化'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('企业文化')">企业文化</a></div>
            <div :class="selectItem==='人才招聘'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('人才招聘')">人才招聘</a></div>
            <div :class="selectItem==='客户介绍'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('客户介绍')">客户介绍</a></div>
          </div>
        </el-col>
        <el-col :span="20">
          <div class="container-body-content" v-if="selectItem==='百年招商'">
            <div class="title">百年招商</div>
            <div class="content">
              <el-row>
                <el-col :span="12">
                  <p>
                    招商局集团创立于1872年12月26日，1873
                    年1月17日在上海正式开业，是中国民族工商
                    业的先驱，被誉为“中国民族企业百年历程缩
                    影”。招商局现为国家驻港大型企业集团、香
                    港四大中资企业之一，总部设于香港。

                    2019年，招商局集团利润总额、净利润和
                    总资产在央企中均排名第一。2019年发布的《
                    财富》世界500强榜单中，招商局和旗下招商
                    银行再次入围，招商局成为拥有两个世界500
                    强公司的企业。招商局集团为8家连续15年荣
                    获国务院国资委经营业绩考核A级的央企之一
                    和连续五个任期“业绩优秀企业”。
                  </p>
                </el-col>
                <el-col :span="12">
                  <div class="itemimg" style="float: right">
                    <img src="../../../assets/front/images/aboutUs/business-invitation.jpg" style="width: 350px"
                         alt=""/>
                  </div>
                </el-col>
              </el-row>

            </div>
          </div>
          <div class="container-body-content" v-if="selectItem==='公司概况'">
            <div class="title">公司概况</div>
            <div class="content">
              <p>
                招商局集团创立于1872年12月26日，1873
                年1月17日在上海正式开业，是中国民族工商
                业的先驱，被誉为“中国民族企业百年历程缩
                影”。招商局现为国家驻港大型企业集团、香
                港四大中资企业之一，总部设于香港。

                2019年，招商局集团利润总额、净利润和
                总资产在央企中均排名第一。2019年发布的《
                财富》世界500强榜单中，招商局和旗下招商
                银行再次入围，招商局成为拥有两个世界500
                强公司的企业。招商局集团为8家连续15年荣
                获国务院国资委经营业绩考核A级的央企之一
                和连续五个任期“业绩优秀企业”。
              </p>
            </div>
          </div>
          <div class="container-body-content" v-if="selectItem==='企业文化'">
            <div class="title">企业文化</div>
            <div class="content">
              <div style="margin: 30px 0;opacity: 0.7">
                <p>
                  招商局集团创立于1872年12月26日，1873年1月17日在上海正式开业，是中国民族工商业的先驱，
                  被誉为“中国民族企业百年历程缩影”。招商局现为国家驻港大型企业集团、香港四大中资企业之一，
                  总部设于香港。
                </p>
              </div>
              <el-row>
                <el-col :span="16">
                  <img src="../../../assets/front/images/aboutUs/culture1.jpg" style="width: 90%;" alt=""/>
                </el-col>
                <el-col :span="8">
                  <div>重要文化一</div>
                  <p>
                    招商局集团创立于1872年12月26日，
                    1873年1月17日在上海正式开业，
                    是中国民族工商业的先驱。
                  </p>
                </el-col>
              </el-row>
              <el-row style="padding: 30px 0">
                <el-col :span="8">
                  <div>重要文化二</div>
                  <p>
                    招商局集团创立于1872年12月26日，
                    1873年1月17日在上海正式开业，
                    是中国民族工商业的先驱。
                  </p>
                </el-col>
                <el-col :span="16">
                  <img src="../../../assets/front/images/aboutUs/culture2.jpg" style="width: 90%;float: right" alt=""/>
                </el-col>
              </el-row>
              <el-row>
                <el-col :span="16">
                  <img src="../../../assets/front/images/aboutUs/culture3.jpg" style="width: 90%;" alt=""/>
                </el-col>
                <el-col :span="8">
                  <div>重要文化三</div>
                  <p>
                    招商局集团创立于1872年12月26日，
                    1873年1月17日在上海正式开业，
                    是中国民族工商业的先驱。
                  </p>
                </el-col>
              </el-row>
            </div>
          </div>
          <div class="container-body-content" v-if="selectItem==='人才招聘'">
            <div class="title">人才招聘</div>
            <div class="content">
              <el-row>
                <el-col :span="24">
                  <el-popover width="500"
                              placement="right"
                              trigger="hover">
                    <div class="box" slot="reference">
                      <div>
                        <span style="font-size: 22px;color: #D7A335;padding: 20px;">后台程序猿</span>
                      </div>
                      <div class="box-request">
                        <span style="font-size: 14px;color: #FF6320;">4K-8K· 13薪   </span>&nbsp &nbsp
                        <span style="font-size: 14px;color: #3B3F47;">经验1-3年/本科</span>
                      </div>
                    </div>
                    <div class="box-description">
                      <div class="box-description-title" style="font-weight: bold"> 职位描述</div>
                      <div class="box-description-content">
                        <p>
                          岗位职责
                          1、负责参与和指导一个或多个子领域的服务端业务研发工作，包括但不
                          限于红包、活动、预算、精准营销等营销子领域；
                          2、分析和深入发掘现有系统的不足，定位系统瓶颈，提高系统性能和稳
                          定性；
                          3、深入思考研发过程中的各项问题，促进团队工作效率和开发质量的提
                          升；
                          4、参与产品讨论，根据业务实际需求，为团队引入新技术和新方案；
                          5、以自身良好的项目管理与协调沟通能力，负责跨团队的重点项目的推
                          进工作。
                        </p>
                      </div>
                      <div class="box-description-title" style="font-weight: bold"> 技能要求</div>
                      <div class="box-description-content">
                        <p>
                          分布式技术
                        </p>
                      </div>
                    </div>
                  </el-popover>
                </el-col>
              </el-row>
              <el-row>
                <el-col :span="24">
                  <el-popover width="500"
                              placement="right"
                              trigger="hover">
                    <div class="box" slot="reference">
                      <div>
                        <span style="font-size: 22px;color: #D7A335;padding: 20px;">船务人员</span>
                      </div>
                      <div class="box-request">
                        <span style="font-size: 14px;color: #FF6320;">4K-8K· 13薪  </span>&nbsp &nbsp
                        <span style="font-size: 14px;color: #3B3F47;">应届毕业生/本科</span>
                      </div>
                    </div>
                    <div class="box-description">
                      <div class="box-description-title" style="font-weight: bold"> 职位描述</div>
                      <div class="box-description-content">
                        <p>
                          岗位职责
                          1、负责参与和指导一个或多个子领域的服务端业务研发工作，包括但不
                          限于红包、活动、预算、精准营销等营销子领域；
                          2、分析和深入发掘现有系统的不足，定位系统瓶颈，提高系统性能和稳
                          定性；
                          3、深入思考研发过程中的各项问题，促进团队工作效率和开发质量的提
                          升；
                          4、参与产品讨论，根据业务实际需求，为团队引入新技术和新方案；
                          5、以自身良好的项目管理与协调沟通能力，负责跨团队的重点项目的推
                          进工作。
                        </p>
                      </div>
                      <div class="box-description-title" style="font-weight: bold"> 技能要求</div>
                      <div class="box-description-content">
                        <p>
                          分布式技术
                        </p>
                      </div>
                    </div>
                  </el-popover>
                </el-col>
              </el-row>
            </div>
          </div>
          <div class="container-body-content" v-if="selectItem==='客户介绍'">
            <div class="title">客户介绍</div>
            <div class="content">
              <img src="../../../assets/front/images/business/customers.jpg" style="width: 800px" alt=""/>
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
  export default {
    name: 'aboutUs',
    data() {
      return {
        activeIndex: '2',
        imgs: ['banner01.jpg', 'banner02.jpg', 'banner04.jpg'],
        selectItem: '百年招商'
      }
    },
    created() {
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
      },
      goPage(url) {
        window.open(url, '_self') // 路由跳转
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .container {

    min-width: 1300px;


    &-nav {
      padding: 10px 10%;
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

      &-content {
        padding: 0 30px;

        .title {
          font-size: 26px;
          color: #3B3F47;
          padding: 10px;
        }

        .content {
          font-size: 15px;
          color: #3B3F47;
          line-height: 22px;
          padding: 10px;

          .box {
            padding: 10px;
            margin: 10px;
            box-shadow: 1px 10px 5px #CCCCCC;

            .box-request {
              margin: 20px;
            }
          }

          .box-description {
            padding: 30px;

            .box-description-title {
              font-size: 15px;
              font-weight: bold;
              color: #190000;
              line-height: 28px;
            }

            .box-description-content {
              opacity: 0.6;
            }
          }

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
  }
</style>
