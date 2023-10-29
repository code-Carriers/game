<template>
  <div class="container-footer">
    <el-row class="container-footer-box1">
      <!--关于我们子模块-->
      <el-col :span="3">
        <div class="container-footer-box1-item">
          <div class="container-footer-box1-item-header"><a @click="goPage('#/web-EN/aboutUs-new')">About Us</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/aboutUs-new?selectItem=Message from the Chairman')">Board</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/aboutUs-new?selectItem=Company Profile')">Company
            Profile</a></div>
          <div class="container-footer-box1-item-info"><a
            @click="goPage('#/web-EN/aboutUs-new?selectItem=Organization')">Organization</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/aboutUs-new?selectItem=Industry Organization')">Industry
            Organization</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/aboutUs-new?selectItem=Honor')">Honor</a>
          </div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/aboutUs-new?selectItem=Company Qualification')">Company
            Qualification</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/aboutUs-new?selectItem=Customer Introduction')">Partners</a></div>
        </div>
      </el-col>
      <!--服务范围子模块-->
      <el-col :span="3">
        <div class="container-footer-box1-item">
          <div class="container-footer-box1-item-header"><a @click="goPage('#/web-EN/serviceArea')">Service Bu</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/serviceArea?selectItem=船舶代理')">Shipping Agency</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/serviceArea?selectItem=国际货运')">Cargo Forwarding</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/serviceArea?selectItem=报税仓储')">Bonded Warehouse</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/serviceArea?selectItem=报关报检')">Customs Clearance</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/serviceArea?selectItem=招商邮服')">Cruise Business</a></div>
        </div>
      </el-col>
      <!--新闻中心子模块-->
      <el-col :span="3">
        <div class="container-footer-box1-item">
          <div class="container-footer-box1-item-header"><a @click="goPage('#/web-EN/newsTendency')">News Center</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/newsTendency?selectItem=公司新闻')">Company News</a></div>
<!--          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/newsTendency?selectItem=公司公告')">Announcement</a></div>-->
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/newsTendency?selectItem=行业动态')">Industry News</a></div>
        </div>
      </el-col>
      <!--港口指南子模块-->
      <el-col :span="3">
        <div class="container-footer-box1-item">
          <div class="container-footer-box1-item-header"><a @click="goPage('#/web-EN/portGuide')">Port Guide</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/portGuide?selectItem=港口信息')">Port Information</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/portGuide?selectItem=港口使费')">Port Commission</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/portGuide?selectItem=常用链接')">Most Used Link</a></div>
          <!--<div class="container-footer-box1-item-info"><a @click="goPage('#/news?selectItem=天气潮水')">天气潮水</a></div>-->
        </div>
      </el-col>
      <!--企业文化子模块-->
      <el-col :span="3">
        <div class="container-footer-box1-item">
          <div class="container-footer-box1-item-header"><a @click="goPage('#/web-EN/businessCulture')">Company Culture</a></div>
<!--          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/businessCulture?selectItem=公司理念')">Company Philosophy</a></div>-->
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/businessCulture?selectItem=员工活动')">Employee Activity</a></div>
        </div>
      </el-col>
      <!--联系我们子模块-->
      <el-col :span="3">
        <div class="container-footer-box1-item">
          <div class="container-footer-box1-item-header"><a @click="goPage('#/web-EN/contactUs')">Contact Us</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/contactUs')">Contact Us</a></div>
          <div class="container-footer-box1-item-info"><a @click="goPage('#/web-EN/contactUs')">Information Feedback</a></div>
          <!--<div class="container-footer-box1-item-info"><a @click="goPage('#/business?selectItem=服务质量调查')">服务质量调查</a></div>-->
        </div>
      </el-col>
      <!--地址、邮编、电话、传真、邮箱信息-->
      <div class="container-footer-box1-item2">
        <div class="container-footer-box1-item2-info-first"><img class="container-footer-box1-item2-info-icon1"
                                                                 src="../../../assets/front/icon/address.png"
                                                                 alt=""/><div style="text-indent: -39px;padding-left: 39px">Add：1,8,9/F.,PENAVICO SHENZHEN Lianhe Building,Nanhai Road,Shekou,Shenzhen,PRC.</div>
        </div>
        <div class="container-footer-box1-item2-info-text"></div>
        <div class="container-footer-box1-item2-info2"><img class="container-footer-box1-item2-info-icon6"
                                                            src="../../../assets/front/icon/zip.png" alt=""/><span>P.C.：518066</span>
        </div>
        <div class="container-footer-box1-item2-info2"><img class="container-footer-box1-item2-info-icon3"
                                                            src="../../../assets/front/icon/phone.png" alt=""/><span>Tel：+86-755-26688998/26880935</span>
        </div>
        <div class="container-footer-box1-item2-info2"><img class="container-footer-box1-item2-info-icon4"
                                                            src="../../../assets/front/icon/fax.png" alt=""/><span>Fax：+86-755-26692769/26689946</span>
        </div>
        <div class="container-footer-box1-item2-info2"><img class="container-footer-box1-item2-info-icon5"
                                                            src="../../../assets/front/icon/email.png" alt=""/><span>Email：<a title="Click send email" href="mailto:hq@penavicosz.com.cn?subject=Please enter the subject name&body=Please enter the message">hq@penavicosz.com.cn</a></span>
        </div>
      </div>
    </el-row>
    <!--页尾最后一行内容-->
    <div class="container-footer-box2">
      <span class="container-footer-box2-content">Copyright © China Ocean Shipping Agency Shenzhen Co.,Ltd

        <a href="https://beian.miit.gov.cn/#/Integrated/index" target="_blank"> ICP No. 06,064,558</a>

        <img src="../../../assets/front/images/beian.png"/>
        <a target="_blank" href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=44030502010357">No. 44030502010357</a>
      </span>
      <a @mouseover="selectQRCode='招商邮服'" @mouseout="selectQRCode=''"><img class="container-footer-box2-img2"
                                                  src="../../../assets/front/icon/PostalService.png" alt=""/></a>
      <a @mouseover="selectQRCode='云极通'" @mouseout="selectQRCode=''"><img class="container-footer-box2-img1"
                                                 src="../../../assets/front/icon/云极通.png" alt=""/></a>
      <a @mouseover="selectQRCode='深圳外代2'" @mouseout="selectQRCode=''"><img class="container-footer-box2-img3"
                                                   src="../../../assets/front/icon/深圳外代.png" alt=""/></a>
      <a @mouseover="selectQRCode='深圳外代1'" @mouseout="selectQRCode=''"><img class="container-footer-box2-img4"
                                                   src="../../../assets/front/icon/深圳外代.png" alt=""/></a>
      <div v-if="selectQRCode==='深圳外代2'">
        <img class="container-footer-box2-img5" src="../../../assets/front/images/homepage/外代货运二维码.png" alt=""/>
        <div class="container-footer-box2-word">Qr code for freight forwarding</div>
        <div class="container-footer-box2-triangle1"></div>
      </div>
      <div v-if="selectQRCode==='招商邮服'">
        <img class="container-footer-box2-img6" src="../../../assets/front/images/homepage/招商船代二维码.png" alt=""/>
        <div class="container-footer-box2-word2">Qr code for China Merchants Shipping Agent</div>
        <img class="container-footer-box2-img26" src="../../../assets/front/images/homepage/招商邮服公众号二维码.png" alt=""/>
        <div class="container-footer-box2-word22">Qr code for China merchants mail service</div>
        <div class="container-footer-box2-triangle2"></div>
      </div>
      <div v-if="selectQRCode==='云极通'">
        <img class="container-footer-box2-img7" src="../../../assets/front/images/homepage/云极通二维码.png" alt=""/>
        <div class="container-footer-box2-word3">Cloud pole small program</div>
        <div class="container-footer-box2-triangle3"></div>
      </div>

      <div v-if="selectQRCode==='深圳外代1'">
        <img class="container-footer-box2-img8" src="../../../assets/front/images/homepage/深圳外代官微二维码.png" alt=""/>
        <img class="container-footer-box2-img9" src="../../../assets/front/images/homepage/深圳外代公众号二维码.png" alt=""/>
        <div class="container-footer-box2-word4">external agent official micro QR code</div>
        <div class="container-footer-box2-word5">Qr code for public account of Shenzhen Foreign Agency</div>
        <div class="container-footer-box2-triangle4"></div>
      </div>
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
      },
      handleSelectQRCode(item) {
        if (this.selectQRCode === item) {
          this.selectQRCode = ''
        } else {
          this.selectQRCode = item
        }
      }
    }
  }

</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .container {
    min-width: 1300px;

    .row {
      width: 84%;
      margin: 0 8% 0 8%;
    }

    a:hover {
      color: #538ED9;
    }

    &-footer {
      background-color: #1F1F1F;

      &-box1 {
        padding: 80px 8% 60px 8%;

        &-item2 {
          width: 221px;
          position: relative;
          float: right;

          &-info-first {
            font-family: PingFangSC-Regular, sans-serif;
            color: #fff;
            font-size: 13px;
            opacity: 0.6;
            word-break: break-all;
          }

          &-info-icon1 {
            display: inline-block;
            position: absolute;
            top: -2%;
            left: -10%;
            width: 17.3px;
            height: 16.9px;
          }

          &-info-text {
            font-family: PingFangSC-Regular, sans-serif;
            color: #fff;
            font-size: 13px;
            opacity: 0.6;
            margin-left: 42px;
            margin-top: 5px;
          }

          &-info2 {
            vertical-align: center;
            font-family: PingFangSC-Regular, sans-serif;
            color: #fff;
            font-size: 13px;
            margin-top: 22px;
            opacity: 0.6;
          }

          &-info-icon2 {
            display: inline-block;
            position: absolute;
            top: 30%;
            left: -10%;
            width: 17.3px;
            height: 16.9px;
          }

          &-info-icon3 {
            display: inline-block;
            position: absolute;
            top: 51%;
            left: -10%;
            width: 17.3px;
            height: 16.9px;
          }

          &-info-icon4 {
            display: inline-block;
            position: absolute;
            top: 71%;
            left: -10%;
            width: 17.3px;
            height: 16.9px;
          }

          &-info-icon5 {
            display: inline-block;
            position: absolute;
            top: 92%;
            left: -10%;
            width: 17.3px;
            height: 16.9px;
          }

          &-info-icon6 {
            display: inline-block;
            position: absolute;
            top: 34%;
            left: -10%;
            width: 17.3px;
            height: 16.9px;
          }


        }

        &-item {

          &-header {
            font-size: 16px;
            font-family: PingFangSC-Regular, sans-serif;
            color: #fff;
            opacity: 0.8;
            letter-spacing: 0;
            margin-bottom: 20px;
          }

          &-info-first {
            vertical-align: center !important;
            font-family: PingFangSC-Regular, sans-serif;
            color: #fff;
            font-size: 13px;
            opacity: 0.6;
          }

          &-info-text {
            font-family: PingFangSC-Regular, sans-serif;
            color: #fff;
            font-size: 13px;
            opacity: 0.6;
            margin-left: 17%;
            margin-top: 5px;
          }

          &-info2 {
            vertical-align: center;
            font-family: PingFangSC-Regular, sans-serif;
            color: #fff;
            font-size: 13px;
            margin-top: 22px;
            opacity: 0.6;
          }


          &-info-icon1 {
            position: absolute;
            top: -1%;
            left: 74%;
            width: 17.3px;
            height: 16.9px;
            margin-right: 3px;
          }

          &-info-icon2 {
            position: absolute;
            top: 27%;
            left: 74%;
            width: 17.3px;
            height: 16.9px;
          }

          &-info-icon3 {
            position: absolute;
            top: 46%;
            left: 74%;
            width: 17.3px;
            height: 16.9px;
          }

          &-info-icon4 {
            position: absolute;
            top: 65%;
            left: 74%;
            width: 17.3px;
            height: 16.9px;
          }

          &-info-icon5 {
            position: absolute;
            top: 83%;
            left: 74%;
            width: 17.3px;
            height: 16.9px;
          }

          &-info {
            font-family: PingFangSC-Regular, sans-serif;
            color: #fff;
            font-size: 13px;
            margin-top: 10px;
            opacity: 0.6;
          }
        }
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

        &-img1 {
          width: 38px;
          height: 38px;
          margin-right: 10%;
          position: absolute;
          top: 50%;
          margin-top: -19px;
          right: 0;
          display: inline-block;
        }

        &-img2 {
          margin-right: 10%;
          position: absolute;
          top: 50%;
          margin-top: -19px;
          right: 50px;
          width: 38px;
          height: 38px;
          display: inline-block;
        }

        &-img3 {
          margin-right: 10%;
          position: absolute;
          top: 50%;
          margin-top: -19px;
          right: 102px;
          width: 38px;
          height: 38px;
          display: inline-block;
        }

        &-img4 {
          margin-right: 10%;
          position: absolute;
          top: 50%;
          margin-top: -19px;
          right: 152px;
          width: 38px;
          height: 38px;
          display: inline-block;
        }

        &-img5 {
          width: 185px;
          height: 170px;
          position: absolute;
          top: -15px;
          right: 35px;
          margin-right: 10%;
          margin-top: -196px;


        }

        &-word {
          font-family: PingFangSC-Regular, sans-serif;
          font-size: 14px;
          color: #303030;
          width: 185px;
          height: 41px;
          background-color: #fff;
          text-align: center;
          position: absolute;
          top: -15px;
          right: 35px;
          margin-right: 10%;
          margin-top: -26px;

        }

        &-triangle1 {
          width: 0;
          height: 0;
          border-left: 15px solid transparent;
          border-top: 15px solid #FFFFFF;
          border-right: 15px solid transparent;
          border-bottom: 10px solid transparent;
          position: absolute;
          top: 0;
          right: 109px;
          margin-right: 10%;
        }

        &-img6 {
          width: 185px;
          height: 170px;
          position: absolute;
          top: -10px;
          right: 70px;
          margin-right: 10%;
          margin-top: -196px;
        }

        &-word2 {
          font-family: PingFangSC-Regular, sans-serif;
          font-size: 14px;
          color: #303030;
          width: 185px;
          height: 41px;
          background-color: #fff;
          text-align: center;
          position: absolute;
          top: -15px;
          right: 70px;
          margin-right: 10%;
          margin-top: -26px;

        }

        &-img26 {
          width: 185px;
          height: 170px;
          position: absolute;
          top: -10px;
          right: -19px;
          margin-right: 5%;
          margin-top: -196px;
        }

        &-word22 {
          font-family: PingFangSC-Regular, sans-serif;
          font-size: 14px;
          color: #303030;
          width: 185px;
          height: 41px;
          background-color: #fff;
          text-align: center;
          position: absolute;
          top: -15px;
          right: -19px;
          margin-right: 5%;
          margin-top: -26px;

        }


        &-triangle2 {
          width: 0;
          height: 0;
          border-left: 15px solid transparent;
          border-top: 15px solid #FFFFFF;
          border-right: 15px solid transparent;
          border-bottom: 10px solid transparent;
          position: absolute;
          top: 0;
          right: 55px;
          margin-right: 10%;
        }

        &-img7 {
          width: 185px;
          height: 170px;
          position: absolute;
          top: -3px;
          right: -71px;
          margin-right: 10%;
          margin-top: -196px;
        }

        &-word3 {
          font-family: PingFangSC-Regular, sans-serif;
          font-size: 14px;
          color: #303030;
          width: 185px;
          height: 30px;
          background-color: #fff;
          text-align: center;
          position: absolute;
          top: -4px;
          right: -71px;
          margin-right: 10%;
          margin-top: -26px;

        }

        &-triangle3 {
          width: 0;
          height: 0;
          border-left: 15px solid transparent;
          border-top: 15px solid #FFFFFF;
          border-right: 15px solid transparent;
          border-bottom: 10px solid transparent;
          position: absolute;
          top: 0;
          right: 5px;
          margin-right: 10%;
        }

        &-img8 {
          width: 185px;
          height: 170px;
          position: absolute;
          top: -18px;
          right: 173px;
          margin-right: 10%;
          margin-top: -196px;


        }

        &-img9 {
          width: 185px;
          height: 170px;
          position: absolute;
          top: -18px;
          right: -10px;
          margin-right: 10%;
          margin-top: -196px;
        }

        &-word4 {
          font-family: PingFangSC-Regular, sans-serif;
          font-size: 14px;
          color: #303030;
          width: 185px;
          height: 50px;
          background-color: #fff;
          text-align: center;
          position: absolute;
          top: -24px;
          right: 173px;
          margin-right: 10%;
          margin-top: -26px;

        }

        &-word5 {
          font-family: PingFangSC-Regular, sans-serif;
          font-size: 14px;
          color: #303030;
          width: 185px;
          height: 50px;
          background-color: #fff;
          text-align: center;
          position: absolute;
          top: -24px;
          right: -10px;
          margin-right: 10%;
          margin-top: -26px;

        }

        &-triangle4 {
          width: 0;
          height: 0;
          border-left: 15px solid transparent;
          border-top: 15px solid #FFFFFF;
          border-right: 15px solid transparent;
          border-bottom: 10px solid transparent;
          position: absolute;
          top: 0;
          right: 158px;
          margin-right: 10%;
        }
      }
    }
  }
  @media screen and (max-width: 1865px) {
    .container-footer-box2-img26 {
      right: -20px;
    }
    .container-footer-box2-word22 {
      right: -20px;
    }
  }
  @media screen and (max-width: 1830px) {
    .container-footer-box2-img26 {
      right: -23px;
    }
    .container-footer-box2-word22 {
      right: -23px;
    }
  }
  @media screen and (max-width: 1786px) {
    .container-footer-box2-img26 {
      right: -25px;
    }
    .container-footer-box2-word22 {
      right: -25px;
    }
  }
  @media screen and (max-width: 1720px) {
    .container-footer-box2-img26 {
      right: -27px;
    }
    .container-footer-box2-word22 {
      right: -27px;
    }
  }
  @media screen and (max-width: 1689px) {
    .container-footer-box2-img26 {
      right: -30px;
    }
    .container-footer-box2-word22 {
      right: -30px;
    }
  }
  @media screen and (max-width: 1630px) {
    .container-footer-box2-img26 {
      right: -33px;
    }
    .container-footer-box2-word22 {
      right: -33px;
    }
  }
  @media screen and (max-width: 1560px) {
    .container-footer-box2-img26 {
      right: -36px;
    }
    .container-footer-box2-word22 {
      right: -36px;
    }
  }
  @media screen and (max-width: 1511px) {
    .container-footer-box2-img26 {
      right: -38px;
    }
    .container-footer-box2-word22 {
      right: -38px;
    }
  }
  @media screen and (max-width: 1450px) {
    .container-footer-box2-img26 {
      right: -40px;
    }
    .container-footer-box2-word22 {
      right: -40px;
    }
  }
  @media screen and (max-width: 1430px) {
    .container-footer-box2-img26 {
      right: -42px;
    }
    .container-footer-box2-word22 {
      right: -42px;
    }
  }
  @media screen and (max-width: 1380px) {
    .container-footer-box2-img26 {
      right: -45px;
    }
    .container-footer-box2-word22 {
      right: -45px;
    }
  }
  @media screen and (max-width: 1315px) {
    .container-footer-box2-img26 {
      right: -47px;
    }
    .container-footer-box2-word22 {
      right: -47px;
    }
  }
  @media screen and (max-width: 1300px){
    .container-footer-box1 {
      padding: 80px 8% 22px 8%;
    }
  }

</style>
