<template>
  <div class="container">
    <!--导航栏模块-->
    <Header :active-index="activeIndex"></Header>

    <!--横幅banner模块-->
    <div class="container-banner">
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-title animate__animated animate__bounceInDown">CONTACT US</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-content animate__animated animate__bounceInDown">联系我们</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
    </div>

    <!--联系我们模块-->
    <div class="container-body">
      <el-row :gutter="90">
        <!--联系我们—左边联系信息-->
        <el-col :span="12">
          <div class="container-body-left">
            <div class="container-body-left-title">Contact Us</div>
            <div class="container-body-left-line"></div>
            <div class="container-body-left-word">
              <el-row>
                <el-col style="width: 80px">Address: &nbsp;</el-col>
                <el-col style="width: 83%;">1,8,9/F.,PENAVICO SHENZHEN Lianhe Building,Nanhai Road,Shekou,Shenzhen,PRC.
                </el-col>
              </el-row>
              P.C.: 518066<br/>
              Tel: 86-755-26688998 / 26880935<br/>
              Fax: 86-755-26692769 / 26689946<br/>
              Email: hq@penavicosz.com.cn<br/>
              Website：www.penavicosz.com.cn<br/>
            </div>
          </div>
        </el-col>
        <!--联系我们—右边信息反馈-->
        <el-col :span="12">
          <div class="container-body-right">
            <div class="container-body-right-title">Information Feedback</div>
            <div class="container-body-right-describe">You are welcome to leave questions, and we will answer your
              questions as soon as possible!
            </div>
            <el-form :model="infoForm" ref="infoForm" :rules="rules" :show-message="true">
              <!--姓名-->
              <el-row>
                <el-col :span="24" class="container-body-right-box">
                  <div class="container-body-right-box-labelName">Your Name</div>
                  <el-form-item prop="name">
                    <el-input class="container-body-right-box-input" type="text" v-model="infoForm.name"
                              placeholder="Please type in your name">
                    </el-input>
                  </el-form-item>
                </el-col>
              </el-row>
              <!--手机号码-->
              <el-row>
                <el-col :span="24" class="container-body-right-box">
                  <div class="container-body-right-box-labelName">Phone</div>
                  <el-form-item prop="mobile">
                    <el-input class="container-body-right-box-input" type="tel" v-model="infoForm.mobile"
                              placeholder="Please enter the phone number">
                    </el-input>
                  </el-form-item>
                </el-col>
              </el-row>
              <!--图片验证码-->
              <el-row>
                <el-col :span="17" class="container-body-right-box">
                  <div class="container-body-right-box-labelName">Verification</div>
                  <el-form-item prop="imageVerification">
                    <el-input class="container-body-right-box-input" type="text" v-model="infoForm.imageVerification"
                              placeholder="Please enter the verification code">
                    </el-input>
                  </el-form-item>
                </el-col>
                <el-col :span="7">
                  <div class="container-body-right-box-code" @click="refreshCode()">
                    <SIdentify :identifyCode="identifyCode"></SIdentify>
                  </div>
                </el-col>
              </el-row>
              <!--手机验证码-->
              <!--<el-row>-->
              <!--<el-col :span="17" class="container-body-right-box">-->
              <!--<div class="container-body-right-box-labelName">手机验证码</div>-->
              <!--<el-form-item prop="phoneVerification">-->
              <!--<el-input class="container-body-right-box-input" type="text" v-model="infoForm.phoneVerification"-->
              <!--placeholder="请输入手机验证码">-->
              <!--</el-input>-->
              <!--</el-form-item>-->
              <!--</el-col>-->
              <!--<el-col :span="7" style="padding-left: 15px">-->
              <!--<div class="container-body-right-box-messageBox" v-if="codeClick===false" @click="getCode">-->
              <!--<div class="container-body-right-box-messageBox-word">获取验证码</div>-->
              <!--</div>-->
              <!--<div class="container-body-right-box-messageBoxClick" v-if="codeClick===true">-->
              <!--<div class="container-body-right-box-messageBoxClick-word">{{second}}s后获取</div>-->
              <!--</div>-->
              <!--</el-col>-->
              <!--</el-row>-->
              <!--电子邮箱-->
              <el-row>
                <el-col :span="24" class="container-body-right-box">
                  <div class="container-body-right-box-labelName">E-mail</div>
                  <el-form-item prop="email">
                    <el-input class="container-body-right-box-input" type="email" v-model="infoForm.email"
                              placeholder="Please enter email">
                    </el-input>
                  </el-form-item>
                </el-col>
              </el-row>
              <!--公司名称-->
              <el-row>
                <el-col :span="24" class="container-body-right-box">
                  <div class="container-body-right-box-labelName">Company</div>
                  <el-form-item prop="company">
                    <el-input class="container-body-right-box-input" type="text" v-model="infoForm.company"
                              placeholder="Please enter company name">
                    </el-input>
                  </el-form-item>
                </el-col>
              </el-row>
              <!--需求描述-->
              <el-row>
                <el-col :span="24" class="container-body-right-boxTextarea">
                  <div class="container-body-right-boxTextarea-labelName">Message</div>
                  <el-form-item prop="content">
                    <el-input class="container-body-right-boxTextarea-input" type="textarea" v-model="infoForm.content"
                              :rows="5" placeholder="Please enter the message content">

                    </el-input>
                  </el-form-item>
                </el-col>
              </el-row>
              <!--留言类型-->
              <div class="container-body-right-selectTitle">
                Please select the message type (single choice)
              </div>
              <div class="container-body-right-selectType">
                <el-form-item prop="business_type">
                  <el-radio-group v-model="infoForm.business_type" class="container-body-right-selectTitle-box">
                    <el-radio label="Business Consulting"></el-radio>
                    <el-radio label="Service Complaint"></el-radio>
                    <el-radio label="Other"></el-radio>
                  </el-radio-group>
                </el-form-item>
              </div>
              <!--提交框-->
              <el-row style="margin-top: 40px">
                <el-col :span="24">
                  <div class="container-body-right-submit">
                    <div class="container-body-right-submit-word" @click="submitClick('infoForm')">Submit</div>
                  </div>
                </el-col>
              </el-row>
            </el-form>
          </div>
        </el-col>
      </el-row>
    </div>

    <!--页尾模块-->
    <Footer></Footer>

  </div>
</template>

<script>
  import Header from '@/views/public/header-En/header'  //引入页头组件
  import Footer from '@/views/public/footer-En/footer'  //引入页尾组件
  import SIdentify from '@/views/public/sIdentify/sIdentify' //引入验证码组件
  import {apiSubmitForm} from '@/api/form'

  export default {
    name: 'contact-us-En',
    components: {Footer, Header, SIdentify},
    data() {
      // 手机号码自定义验证方法
      const validatePhone = (rule, value, callback) => {
        if (!value) {
          // this.phoneFlag = false
          return callback(new Error('Phone number can not be blank'))
        } else if (!(/^[1][3,4,5,7,8][0-9]{9}$/.test(value))) {
          // this.phoneFlag = false
          return callback(new Error('Please enter the correct phone number'))
        } else {
          // this.phoneFlag = true
          return callback()
        }
      }
      // 图片验证码自定义验证方法
      const validateCode = (rule, value, callback) => {
        if (!value) {
          return callback(new Error('Image verification code cannot be empty'))
        } else if (value !== this.identifyCode) {
          const num1 = value.toString().toLowerCase()
          const num2 = this.identifyCode.toLowerCase()
          if (num1 === num2) {
            return callback()
          } else {
            return callback(new Error('Image verification code error'))
          }
        } else {
          return callback()
        }
      }
      return {
        // phoneFlag: false, //判断是否已输入正确的手机号码，为拓展部分
        // second: 60,//获取手机验证码的倒计时，为拓展部分
        identifyCode: '',//图片验证码
        identifyCodes: '0123456789abcdwerwshdjeJKDHRJHKOOPLMKQ',//图片验证码随机字符
        // codeClick: false,
        activeIndex: '7',//当前为联系我们页面
        infoForm://表单字段
          {
            web: 'PENAVICOSZ',
            name: '',
            mobile: '',
            imageVerification: '',
            phoneVerification: '',
            email: '',
            company: '',
            content: '',
            business_type: 'Business Consulting'
          },
        //验证规则
        rules: {
          name: [{
            required: true, message: 'Name cannot be empty', trigger: 'blur'
          }],
          mobile: [
            {validator: validatePhone, trigger: 'blur'}
          ],
          imageVerification: [
            {validator: validateCode, trigger: 'blur'}
          ],
          // phoneVerification: [{
          //   required: true, trigger: 'blur', message: '手机验证码不能为空'
          // }],
          // email: [{
          //   required: true, trigger: 'blur', message: '电子邮箱不能为空'
          // }, {
          //   pattern: /[a-zA-Z0-9]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]+/,
          //   message: '请输入正确的电子邮箱'
          // }],
          // companyName: [{
          //   required: true, trigger: 'blur', message: '公司名称不能为空'
          // }],
          email: [{
            pattern: /[a-zA-Z0-9]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]+/,
            message: 'Please enter the correct email address'
          }],
          content: [{
            required: true, trigger: 'blur', message: 'Comment can not be empty'
          }]
          // selectType: [{
          //   required: true, trigger: 'change', message: '请选择留言类型'
          // }]
        }
      }
    },
    created() {
      this.refreshCode()
    },
    methods: {
      // 手机验证码
      // getCode() {
      //   const _this = this
      //   if (this.phoneFlag === true) {
      //     this.codeClick = true
      //     const codeInterval = window.setInterval(function () {
      //       if ((_this.second--) <= 0) {
      //         _this.codeClick = false
      //         window.clearInterval(codeInterval)
      //         _this.second = 60
      //       }
      //       console.log(_this.second)
      //     }, 1000)
      //     // eslint-disable-next-line no-empty
      //   } else {
      //     this.$message.warning('请先输入手机号码')
      //   }
      // },
      // 刷新图片验证码
      refreshCode() {
        this.identifyCode = ''
        this.makeCode(this.identifyCodes, 4)
      },
      randomNum(min, max) {
        max = max + 1
        return Math.floor(Math.random() * (max - min) + min)
      },
      // 随机生成验证码字符串
      makeCode(data, len) {
        for (let i = 0; i < len; i++) {
          this.identifyCode += data[this.randomNum(0, data.length - 1)]
        }
      },
      submitClick(formName) {
        const _this = this
        // 表单验证
        this.$refs[formName].validate(valid => {
          if (valid) {
            apiSubmitForm(this.infoForm).then(() => {
              this.$message.success('Your feedback has been submitted and we will contact you as soon as possible!')
              // this.infoForm={brand_right:0}
              setTimeout(function () {
                _this.$refs[formName].resetFields()
                _this.refreshCode()
              }, 500)
            })
          } else {
            return false
          }
        })
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

    /*banner样式*/
    &-banner {
      width: 100%;
      background-size: 100% auto;
      height: 0;
      padding-top: 18.75%;
      background-image: url("../../../assets/front/images/contactUs/contactUs-banner-new.png");

      &-title {
        font-family: FZZCHJW--GB1-0, sans-serif;
        font-size: 72px;
        color: #FFFFFF;
        letter-spacing: 40px;
        text-align: center;
        margin-bottom: 23px;
        margin-left: 27px;
      }

      &-content {
        font-family: PingFangSC-Regular, sans-serif;
        font-size: 15px;
        color: #FFFFFF;
        letter-spacing: 28px;
        text-align: center;
        line-height: 26px;
      }
    }

    /*body主体样式*/
    &-body {
      padding-right: 8%;
      width: 100%;
      padding-left: 19%;
      padding-bottom: 80px;
      background-size: 100% 100%;
      background-repeat: no-repeat;
      background-image: url('../../../assets/front/images/contactUs/contactUs.png');

      &-left {
        padding-top: 200px;
        padding-bottom: 384px;

        &-title {
          font-size: 28px;
          font-family: PingFangSC-Regular, sans-serif;
          font-weight: 400;
          color: #3B3F47;
        }

        &-line {
          margin-top: 30px;
          width: 100px;
          height: 2px;
          background: #3281E4;
          margin-bottom: 15px;
        }

        &-word {
          font-size: 20px;
          font-family: PingFangSC-Regular, sans-serif;
          font-weight: 400;
          color: #3A3F47;
          line-height: 54px;
        }
      }

      &-right {
        margin-top: 80px;
        background: #FFFFFF;
        box-shadow: 0 0 16px 0 rgba(60, 135, 229, 0.2);
        padding: 40px 8% 50px 8%;

        &-submit {
          height: 54px;
          background: #3C87E5;

          &-word {
            font-size: 18px;
            font-family: PingFangSC-Semibold, sans-serif;
            font-weight: 600;
            color: #FFFFFF;
            line-height: 54px;
            text-align: center;
          }
        }

        &-submit:hover {
          cursor: pointer;
        }

        &-title {
          font-size: 24px;
          font-family: PingFangSC-Regular, sans-serif;
          font-weight: 400;
          color: #0A0E24;
        }

        &-describe {
          margin-top: 10px;
          margin-bottom: 20px;
          font-size: 16px;
          font-family: PingFangSC-Regular, sans-serif;
          font-weight: 400;
          color: #B4B6BB;
        }

        &-box {
          height: 44px;
          position: relative;
          margin-bottom: 22px;

          &-code {
            width: 100%;
            height: 44px;
            padding-left: 18px;
          }

          &-code:hover {
            cursor: pointer;
          }

          &-labelName {
            margin-left: 10px;
            display: inline-block;
            font-size: 16px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #757575;
            position: absolute;
            top: 50%;
            left: 0;
            margin-top: -9px;
            z-index: 10;
          }

          &-messageBox {
            height: 42px;
            background: #FFFFFF;
            border: 1px solid #3C87E5;

            &-word {
              font-size: 16px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #3C87E5;
              line-height: 41px;
              text-align: center;
            }
          }

          &-messageBox:hover {
            cursor: pointer;
          }

          &-messageBoxClick {
            height: 42px;
            background: #3C87E5;
            border: 1px solid #FFFFFF;

            &-word {
              font-size: 16px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #FFFFFF;
              line-height: 41px;
              text-align: center;
            }
          }
        }

        &-boxTextarea {
          position: relative;

          &-labelName {
            margin-left: 10px;
            display: inline-block;
            font-size: 16px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #757575;
            position: absolute;
            top: 10px;
            left: 0;
            z-index: 10;
          }
        }

        &-selectTitle {
          padding-left: 10px;
          font-size: 16px;
          font-family: PingFangSC-Regular, sans-serif;
          font-weight: 400;
          color: #00041B;
          margin-bottom: 12px;

          &-box {
            width: 100%;
          }
        }
      }
    }

  }

  /*局部改变input输入框的样式*/
  .container-body-right-box-input > > > .el-input__inner {
    height: 44px;
    line-height: 44px;
    padding-left: 130px;
  }

  /*局部改变textarea文本域的样式*/
  .container-body-right-boxTextarea-input > > > .el-textarea__inner {
    padding-left: 130px;
  }

  /*局部改变input框的placeholder的样式*/
  .container-body-right-box-input > > > .el-input__inner::placeholder {
    font-size: 14px;
    font-family: PingFangSC-Regular, sans-serif;
    font-weight: 400;
    color: #CACBCF;
  }

  /*局部改变textarea文本域的placeholder的样式*/
  .container-body-right-boxTextarea-input > > > .el-textarea__inner::placeholder {
    font-size: 14px;
    font-family: PingFangSC-Regular, sans-serif;
    font-weight: 400;
    color: #CACBCF;
  }

  /*局部改变单选框圆框的样式*/
  .container-body-right-selectTitle-box > > > .el-radio__inner {
    margin-left: 20px;
    width: 20px;
    height: 20px;
    border-radius: 50%;
  }

  /*局部改变单选框的文本样式*/
  .container-body-right-selectTitle-box > > > .el-radio__label {
    font-size: 14px;
    font-family: PingFangSC-Regular, sans-serif;

    font-weight: 400;
    color: #4B4F5E;
  }

  /*局部改变单选框验证错误提示信息*/
  .container-body-right-selectType > > > .el-form-item__error {
    color: #F56C6C;
    font-size: 12px;
    line-height: 1;
    padding-top: 4px;
    position: absolute;
    top: -32px;
    left: 186px;
  }

  /*局部改变验证错误提示信息*/
  .container-body-right-box > > > .el-form-item__error {
    color: #F56C6C;
    font-size: 12px;
    line-height: 1;
    padding-top: 4px;
    position: absolute;
    top: 100%;
    left: 130px;
  }

  /*局部改变文本域验证错误提示信息*/
  .container-body-right-boxTextarea > > > .el-form-item__error {
    color: #F56C6C;
    font-size: 12px;
    line-height: 1;
    padding-top: 4px;
    position: absolute;
    top: 100%;
    left: 130px;
  }

  /*当分辨率少于1400px时，body样式改变*/
  @media screen and (max-width: 1400px) {
    .container-body {
      padding-bottom: 80px;
      padding-right: 8%;
      width: 100%;
      padding-left: 10%;
      background-size: 100% 100%;
      background-repeat: no-repeat;
      background-image: url('../../../assets/front/images/contactUs/contactUs.png');
    }
  }

  /*当分辨率少于1400px时，验证码的样式改变*/
  @media screen and (max-width: 1400px) {
    .container-body-right-box-code {
      width: 100%;
      height: 44px;
      padding-left: 10px;
    }

  }
</style>


