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
      <img src="../../../assets/front/images/business/banner.jpg" alt="banner" class="bannerImg"/>
    </div>
    <div class="container-body">
      <el-row>
        <el-col :span="4">
          <div style="font-size: 30px;color: #D7A335;padding-left: 20px">综合业务</div>
          <div class="container-body-menu">
            <div :class="selectItem==='集装箱'?'menu-item-check':'menu-item'"><a @click="handleSelectMenu('集装箱')">集装箱</a>
            </div>
            <div :class="selectItem==='散杂货'?'menu-item-check':'menu-item'"><a @click="handleSelectMenu('散杂货')">散杂货</a>
            </div>
            <div :class="selectItem==='重大件'?'menu-item-check':'menu-item'"><a @click="handleSelectMenu('重大件')">重大件</a>
            </div>
            <div :class="selectItem==='修船'?'menu-item-check':'menu-item'"><a @click="handleSelectMenu('修船')">修船</a>
            </div>
            <div :class="selectItem==='船员更换'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('船员更换')">船员更换</a></div>
            <div :class="selectItem==='报关'?'menu-item-check':'menu-item'"><a @click="handleSelectMenu('报关')">报关</a>
            </div>
          </div>
        </el-col>
        <el-col :span="20">
          <div style="border-left: 2px #F2F2F2 solid;padding-left: 30px">
            <div class="container-body-content" v-if="selectItem==='集装箱'">
              <div class="title">集装箱</div>
              <div class="content" style="display: flex">
                <div style="width: 48%;">
                  <p style="font-size: 16px;color: #888888;letter-spacing: 0.38px;line-height: 26px;">
                    招商船代以深圳总部为核心，在深圳蛇口、大铲、盐田，广州黄埔、南沙，东莞虎门、沙田，广东湛江、汕头都有
                    开展班轮代理业务，服务网络已经覆盖全广东省有集装箱业务的涉外港口，合作船公司有十家，年代理船舶2000艘
                    次以上，代理箱量100万标箱。
                  </p>
                  <p>
                    招商船代在班轮代理业务中信息化程度高，对信息技术的使用走在行业前列。
                  </p>
                  <div style="margin: 20px 0">
                    <div style="display: flex">
                      <img src="../../../assets/front/icon/polIcon.png" style="width:20px;height: 20px" alt=""/>
                      <div style="font-size: 18px;color: #5F6F77;letter-spacing: 0.38px;padding-left: 20px">Polaris系统
                      </div>
                    </div>
                    <p style="font-size: 15px;color: #7D929D;letter-spacing: 0.38px;">
                      Polaris系统连通各班轮公司和政府部门，信息传递及时、准确、安全。
                    </p>
                  </div>
                  <div>
                    <div style="display: flex">
                      <img src="../../../assets/front/icon/EIRIcon.png" style="width:20px;height: 20px" alt=""/>
                      <div style="font-size: 18px;color: #5F6F77;letter-spacing: 0.38px;padding-left: 20px">EIR SMART系统
                      </div>
                    </div>
                    <p style="font-size: 15px;color: #7D929D;letter-spacing: 0.38px;">
                      EIR SMART系统连接进出口客户、码头、拖车公司实现24小时无纸化办公。
                    </p>
                  </div>
                  <div>
                    <div style="display: flex">
                      <img src="../../../assets/front/icon/56masterIcon.png" style="width:20px;height: 20px" alt=""/>
                      <div style="font-size: 18px;color: #5F6F77;letter-spacing: 0.38px;padding-left: 20px">56Master
                      </div>
                    </div>
                    <p style="font-size: 15px;color: #7D929D;letter-spacing: 0.38px;">
                      56Master信息平台实现进口网上补料、实时查询等一站式服务。
                    </p>
                  </div>
                </div>
                <div style="width: 52%;padding: 30px;">
                  <img src="../../../assets/front/images/business/jizhuanxiang.jpg" style="width: 100%" alt=""/>
                </div>
              </div>
            </div>
            <div class="container-body-content" v-if="selectItem==='散杂货'">
              <div class="title">散杂货</div>
              <div class="content" style="display: flex">
                <div style="width: 48%;">
                  <p style="font-size: 16px;color: #888888;letter-spacing: 0.38px;line-height: 26px;">
                    招商船代经过20多年的发展，积累了代理各类散杂货船舶的丰富经验，尤其在超大型专用船、大型矿石船、干散货船、木材船、河砂船、重大件运输等方面积累了丰富的实操经验，
                    是第一家散杂货代理业务覆盖全中国港口的船代公司。
                  </p>
                  <div style="margin: 20px 0">
                    <div style="display: flex">
                      <img src="../../../assets/front/icon/tiekuangshi.png" style="width:20px;height: 20px" alt=""/>
                      <div style="font-size: 18px;color: #5F6F77;letter-spacing: 0.38px;padding-left: 20px">铁矿石
                      </div>
                    </div>
                    <p style="font-size: 15px;color: #7D929D;letter-spacing: 0.38px;">
                      我们搭建了一个覆盖中国港口的铁矿石代理网络。
                    </p>
                  </div>
                  <div>
                    <div style="display: flex">
                      <img src="../../../assets/front/icon/hesha.png" style="width:20px;height: 20px" alt=""/>
                      <div style="font-size: 18px;color: #5F6F77;letter-spacing: 0.38px;padding-left: 20px">进口河砂
                      </div>
                    </div>
                    <p style="font-size: 15px;color: #7D929D;letter-spacing: 0.38px;">
                      中国河砂进口业务的开创者，珠三角最有经验的河砂船代公司。
                    </p>
                  </div>
                  <div>
                    <div style="display: flex">
                      <img src="../../../assets/front/icon/yuanmu.png" style="width:20px;height: 20px" alt=""/>
                      <div style="font-size: 18px;color: #5F6F77;letter-spacing: 0.38px;padding-left: 20px">进口原木</div>
                    </div>
                    <p style="font-size: 15px;color: #7D929D;letter-spacing: 0.38px;">
                      从深圳到东莞到漳州，我们提供给客户的是深圳的服务水准，深得客户信赖。
                    </p>
                  </div>
                </div>
                <div style="width: 52%;padding: 30px;">
                  <img src="../../../assets/front/images/business/zahuo1.jpg" style="width: 100%" alt=""/>
                </div>
              </div>
            </div>
            <div class="container-body-content" v-if="selectItem==='修船'">
              <div class="title">修船</div>
              <div class="content" style="display: flex">
                <div style="width: 48%;">
                  <p style="font-size: 16px;color: #888888;letter-spacing: 0.38px;line-height: 36px;">
                    招商船代与各国船东和国内各大船厂都保持良好的业务关系，在全国范围内同友联船厂保持战略合作关系，熟悉修船代理业务流程，为船东提供专业、迅捷、贴心的服务。
                  </p>
                </div>
                <div style="width: 52%;padding: 30px;">
                  <img src="../../../assets/front/images/business/fixCarrier.jpg" alt="" style="width: 100%"/>
                </div>
              </div>
            </div>
            <div class="container-body-content" v-if="selectItem==='船员更换'">
              <div class="title">船员更换</div>
              <div class="content" style="display: flex">
                <div style="width: 48%;padding-top: 10px">
                  <p style="font-size: 16px;color: #888888;letter-spacing: 0.38px;line-height: 36px;">
                    船员更换、就医、遣返等等事项是船代公司的基本业务，招商船代自成立以来就秉承“人性化服务”的宗旨，
                    每次涉及船员事项都尽心尽力让船员感受到家庭般的温暖。
                  </p>
                </div>
                <div style="width: 52%;padding: 30px;">
                  <img src="../../../assets/front/images/business/changecarriers.jpg" alt="" style="width: 100%"/>
                </div>
              </div>
            </div>
            <div class="container-body-content" v-if="selectItem==='报关'">
              <div class="title">报关</div>
              <div class="content" style="display: flex">
                <div style="width: 48%;padding-top: 10px">
                  <p style="font-size: 16px;color: #888888;letter-spacing: 0.38px;line-height: 36px;">
                    招商船代与口岸海关、海事、检测机构、码头等政府部门和企业建立了良好的工作关系。
                  </p>
                  <p style="font-size: 16px;color: #888888;letter-spacing: 0.38px;line-height: 36px;">
                    主要为客户提供进出口货物、船舶配件及保税仓报关业务。
                  <p style="font-size: 16px;color: #888888;letter-spacing: 0.38px;line-height: 36px;">
                    此外还提供船用给养、备件供应、能源供应以及其他相关的船舶服务业务。
                  </p>
                </div>
                <div style="width: 52%;padding: 30px;">
                  <img src="../../../assets/front/images/business/baoguan.jpg" alt="" style="width: 100%"/>
                </div>
              </div>
              <div>
                <div class="itemimg">
                </div>
              </div>
            </div>
            <div class="container-body-content" v-if="selectItem==='重大件'">
              <div class="title">重大件</div>
              <div class="content" style="display: flex">
                <div style="width: 48%;">
                  <p style="font-size: 16px;color: #888888;letter-spacing: 0.38px;line-height: 36px;">
                    招商船代为开展重大件业务成立了专门的运营团队，业务从无到有，经过多年的实际操作积累了多次成功运作项目的经营，目前是整个行业重大件项目操作的佼佼者。
                  </p>
                </div>
                <div style="width: 52%;padding: 30px;">
                  <img src="../../../assets/front/images/business/zhongdajian.jpg" alt="" style="width: 100%"/>
                </div>
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
            <div class="container-footer-item-info"><a href="http://www.penavicosz.com.cn" target="_blank">深圳外代</a>
            </div>
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
    name: 'business',
    data() {
      return {
        activeIndex: '4',
        imgs: ['banner01.jpg', 'banner02.jpg', 'banner04.jpg'],
        selectItem: '集装箱'
      }
    },
    created() {
      this.selectItem = this.$route.query.selectItem
      if (this.selectItem === undefined) {
        this.selectItem = '集装箱'
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
          font-size: 16px;
          color: #8F8F8F;
          line-height: 22px;
          padding: 10px;
        }

        .itemimg {
          margin-top: 30px;
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
