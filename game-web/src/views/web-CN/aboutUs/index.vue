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
      <img src="../../../assets/front/images/aboutUs/banner.jpg" alt="banner" class="bannerImg"/>
    </div>
    <div class="container-body">
      <el-row>
        <el-col :span="4">
          <div style="font-size: 30px;color: #D7A335;padding-left: 20px">关于我们</div>
          <div class="container-body-menu">
            <div :class="selectItem==='百年招商'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('百年招商')">百年招商</a></div>
            <div :class="selectItem==='公司概况'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('公司概况')">公司概况</a></div>
            <div :class="selectItem==='企业文化'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('企业文化')">企业文化</a></div>
            <div :class="selectItem==='人才招聘'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('人才招聘')">人才招聘</a></div>
          </div>
        </el-col>
        <el-col :span="20">
          <div style="border-left: 2px #F2F2F2 solid;padding-left: 30px">
          <div class="container-body-content" v-if="selectItem==='百年招商'">
            <div class="title">百年招商</div>
            <div class="content">
              <el-row>
                <el-col :span="12">
                  <p style="font-size: 15px;color: #949494;line-height: 26px">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;招商局集团创立于1872年12月26日，1873年1月17日在上海正式开业，是中国民族工商业的先驱，
                    被誉为“中国民族企业百年历程缩影”。招商局总部设于香港，现为国家驻港大型企业集团、香港四大中资企业之一。<br/>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2019年，招商局集团利润总额、净利润和总资产在央企中均排名第一。
                    2019年发布的《财富》世界500强榜单中，招商局和旗下招商银行再次入围，招商局成为拥有两个世界500强公司的企业。
                    招商局集团是8家连续15年荣获国务院国资委经营业绩考核A级的央企之一和连续五个任期“业绩优秀企业”。
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
              <el-row>
                <el-col :span="12">
                  <p style="font-size: 15px;color: #949494;line-height: 26px;padding: 10px 20px">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;招商船代诞生于中国大陆经济发展速度最快的城市-深圳，立志在经营理念、服务意识、业务创新等方面走在行业之首。<br/>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;通过不断提高业务水平、服务质量和拓展网络布局，招商船代已经成长为一家服务覆盖全国港口的网络化公司，使得客户在中国港口都能享受同样的优质服务。<br/>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;招商船代用最新的网络技术使传统的服务项目更具效率，
                    大批训练有素的专业人才使委托方的资源增值计划得以实现。招商船代诚信、进取的精神，与委托方的有效沟通，
                    全力以赴的工作态度和以满足委托方需求为己任的理念，正赢得越来越多客户的信赖，我们愿和委托方一起前进。
                  </p>
                </el-col>
                <el-col :span="12">
                  <div style="padding: 10px;">
                    <img src="../../../assets/front/images/aboutUs/company-description2.jpg" style="width: 100%"
                         alt=""/>
                  </div>
                </el-col>
              </el-row>
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
                <el-col :span="14">
                  <img src="../../../assets/front/images/aboutUs/culture1.jpg"
                       style="width: 100%;height:26vh;float: right" alt=""/>
                </el-col>
                <el-col :span="10">
                  <div style="background-color: #fff;color: #181818;height: 26vh;padding: 60px">
                    <div style="font-size:30px;padding-bottom:10px  ">企业使命</div>
                    <p>
                      物畅其流，传递文明
                    </p>
                  </div>
                </el-col>
              </el-row>
              <el-row>
                <el-col :span="10">
                  <div style="background-color: #181818;color: #fff;height: 26vh;padding: 60px">
                    <div style="font-size:30px;padding-bottom:10px  ">企业愿景</div>
                    <p>
                      最强的物流服务商，最好的船务代理人
                    </p>
                  </div>
                </el-col>
                <el-col :span="14">
                  <img src="../../../assets/front/images/aboutUs/culture2.jpg"
                       style="width: 100%;height:26vh;float: right" alt=""/>
                </el-col>
              </el-row>
              <el-row>
                <el-col :span="14">
                  <img src="../../../assets/front/images/aboutUs/culture3.jpg"
                       style="width: 100%;height:26vh;float: right" alt=""/>
                </el-col>
                <el-col :span="10">
                  <div style="background-color: #fff;color: #181818;height: 26vh;padding: 60px">
                    <div style="font-size:30px;padding-bottom:10px  ">企业精神</div>
                    <p>
                      务实，协调，创新，进取
                    </p>
                  </div>
                </el-col>
              </el-row>
              <el-row>
                <el-col :span="10">
                  <div style="background-color: #181818;color: #fff;height: 26vh;padding: 60px">
                    <div style="font-size:30px;padding-bottom:10px ">经营理念</div>
                    <p>
                      卓越创新成就客户，精益管理贴心服务
                    </p>
                  </div>
                </el-col>
                <el-col :span="14">
                  <img src="../../../assets/front/images/aboutUs/culture4.jpg"
                       style="width: 100%;height: 26vh;float: right" alt=""/>
                </el-col>
              </el-row>
              <!-- <el-row>
                 <el-col :span="14">
                   <img src="../../../assets/front/images/aboutUs/culture5.jpg" style="width: 100%;" alt=""/>
                 </el-col>
                 <el-col :span="10">
                   <div>服务理念</div>
                   <p>
                      专业化个性设计，人性化增值服务
                   </p>
                 </el-col>
               </el-row>
               <el-row>
                 <el-col :span="10">
                   <div>人才理念</div>
                   <p>
                     取才多样化，育才多元化，成才多极化
                   </p>
                 </el-col>
                 <el-col :span="14">
                   <img src="../../../assets/front/images/aboutUs/culture6.jpg" style="width: 100%;float: right" alt=""/>
                 </el-col>
               </el-row>
               <el-row>
                 <el-col :span="14">
                   <img src="../../../assets/front/images/aboutUs/culture7.jpg" style="width: 100%;" alt=""/>
                 </el-col>
                 <el-col :span="10">
                   <div>企业价值观</div>
                   <p>
                      为企业创造效益，为股东创造回报，为客户创造价值，为社会创造财富
                   </p>
                 </el-col>
               </el-row>-->
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
                      <div class="box-name">
                        <span style="font-size: 22px;color: #D7A335;">后台程序猿</span>
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
                      <div class="box-name">
                        <span style="font-size: 22px;color: #D7A335;">船务人员</span>
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
      this.selectItem = this.$route.query.selectItem
      if (this.selectItem === undefined) {
        this.selectItem = '百年招商'
      }
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

    a:hover {
      color: #538ED9;
    }

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
            box-shadow: 0 00px 15px #e6e6e6;

            .box-name {
              margin: 20px;
            }

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
