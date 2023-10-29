<template>
  <div class="container">
    <div class="container-body">
      <div class="container-body-title">马士基备案操作流程</div>
      <div class="container-body-subTitle1">
        一.马士基申请备案须知
      </div>
      <div class="container-body-subTitle2">
        1.营业制造复印件，必须加盖公章并有法人代表签字；
      </div>
      <div class="container-body-subTitle3">
        2.备案申请，详见下面的格式，必须加盖公章并有法人代表签字；
      </div>
      <div class="container-body-subTitle3">
        3.法人或负责人身份证复印件，必须加盖公章并有法人代表签字；
      </div>
      <div class="container-body-subTitle3">
        4.备案打单员身份证复印件，必须加盖公章并有法人代表签字（如无需窗口办单业务,可不用提交打单员资料）；
      </div>

      <div class="container-body-line"></div>
      <div class="container-body-subTitle1">
        二.开通鹏海运马士基网上自助打单
      </div>
      <div class="container-body-subTitle1">
        请发邮件到：FEAEQUPRS@MAERSK.COM。
      </div>
      <div class="container-body-subTitle2">
        邮件需包含以下内容：
      </div>
      <div class="container-body-subTitle3">
        1.公司名称（全称）；
      </div>
      <div class="container-body-subTitle3">
        2.在马士基的备案号码（在柜台递交后,由外代提供）；
      </div>
      <div class="container-body-subTitle3">
        3.法人代表名称；
      </div>
      <div class="container-body-subTitle3">
        4.申请业务：网上自助打单；
      </div>
      <div class="container-body-subTitle3">
        5.申请人及其联系方式；
      </div>
      <div class="container-body-subTitle3">
        鹏海运服务电话：<b>4006400963-1</b>
      </div>
      <div class="container-body-line"></div>
      <div class="container-body-subTitle1" style="text-align: center">
        备案申请(样式)
      </div>
      <div class="container-body-subTitle2">
        致马士基航运(中国)有限公深圳分公司：
      </div>
      <div class="container-body-subTitle3" style="text-indent: 1em">
        因需在贵司办理出口打单业务，现申请在贵司备案以取得办理业务资格。
      </div>
      <div class="container-body-subTitle3">
        我司名称为XXX，主要业务为XXX。
      </div>
      <div class="container-body-subTitle3">
        我司法人代表为XXX，身份证号XXX，联系电话XXX。
      </div>
      <div class="container-body-subTitle3">
        我司法人代表为XXX，身份证号XXX，联系电话XXX。
      </div>
      <div class="container-body-subTitle3">
        我司法人代表为XXX，身份证号XXX，联系电话XXX。
      </div>
      <div class="container-body-subTitle3">
        打单员为XXX（如果不用在马士基窗口打单，可不用留打单员信息）<br/>
        性别：X；身份证号：XXX；联系电话：XXX
      </div>
      <div class="container-body-subTitle3">
        打单使用业务章为：（如果贵司不会来马士基窗口打单，可不用留打单员业务章，样章名称必须与营业执照公司名相同）
      </div>
      <div class="container-body-subTitle3" style="text-align: right">
        XXX物流有限公司<br/>
        （公章）
      </div>
      <div class="container-body-link" style="text-align: right">
        <div class="container-body-subTitle3" style="display: inline-block">
          下载链接：
        </div>
        <a href="./static/file/201705241627.docx">备案流程.doc</a>
      </div>
    </div>

    <Footer />
  </div>
</template>

<script>
  import Footer from '@/views/wap/component/FloatBall'

  export default {
    name: 'wap-guideMklRecord',
    components: {
      Footer
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>

  .container {
    height: auto;
    width: 100%;
    padding: 20px 15px 30px;
    border: 1px solid #ECECEC;
    border-radius: 10px 10px 10px 10px;

    &-body {
      padding: 20px 25px;


      &-title {
        color: #999;
        font-size: 32px;
        text-align: center;
        font-weight: 600;
        font-family: -apple-system-font, Helvetica Neue, sans-serif;
        margin-bottom: 30px;
      }

      &-subTitle {
        color: #999;
        font-size: 25px;
        font-weight: 600;
        margin-top: 15px;
      }

      &-subTitle1 {
        color: #999;
        font-size: 23px;
        font-weight: 600;
        margin-top: 15px;
      }

      &-subTitle2 {
        color: #999;
        font-size: 22px;
        margin-top: 12px;
        line-height: 35px;
      }

      &-subTitle3 {
        color: #999;
        font-size: 22px;
        margin-top: 6px;
        line-height: 35px;
      }
      &-link {
        margin-top: 10px;
        color:#0000EE;
        font-size: 25px;
        margin-bottom: 20px;
      }
      &-line {
        margin: 30px 0 30px 0;
        width: 100%;
        height: 1px;
        background-color: #E4E4E4;
      }

    }
  }
</style>
