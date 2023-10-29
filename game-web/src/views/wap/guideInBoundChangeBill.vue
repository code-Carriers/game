<template>
  <div class="container">
    <div class="container-body">
      <div class="container-body-title">进口换单操作指引</div>
      <div class="container-body-subTitle">一、进口换单前请登录外代网站WWW.PENAVICOSZ.COM.CN
        通过柜号、提单号查询货物是否有舱单信息，有舱单信息代表可以换取提货单，
        但需留意查看是否扣货；是否有代收费用；副本提单是否存在电放编号。</div>
      <div class="container-body-subTitle2">
        1、显示扣货，请联系船公司确认相关后续操作；</div>
      <div class="container-body-subTitle3">
        2、有代收费用，请到外代财务部缴清相关费用；</div>
      <div class="container-body-subTitle3">
        3、有电放编号代表我司已经收到船公司的放货指示，可以凭副本提单换取提货单。</div>
      <div class="container-body-subTitle">二、进口换单船代主要是对提单信息进行审核，符合要求，才能够向客户签发提货单。
        为保证进口换单操作的顺畅，请提前按照以下要求准备换单资料：</div>

      <div class="container-body-subTitle2">
        1、提单必须是船公司的提单，正本海运提单要有ORIGINAL字样、船公司LOGO；提单背面要有运输条款；
        提单要有签发人的签章及签名；副本提单需是船公司的提单COPY;
      </div>

      <div class="container-body-subTitle3">
        2、客户委托第三方换单的，需填写换单委托书；
      </div>
      <div class="container-body-subTitle3">
        3、所有的提单上都要求有收货人和委托代理的背书，签名并填写真实有效的身份证号码。
      </div>

      <div class="container-body-subTitle3">
        4、正本提单换单的背书要求：
      </div>
      <div class="container-body-subTitle3">
        （1）记名提单的背书要求：
      </div>
      <div class="container-body-subTitle3">
        a.发货人背书不要求。
      </div>
      <div class="container-body-subTitle3">
        b.收货人背书：  如果实际收货人与提单记名收货人一致，记名收货人需在提单上背书；
        如果实际收货人与提单记名收货人不符，需收齐全套正本提单且必须要有提单记名收货人和实际收货人的背书以及提单记名收货人出具的物权转让书原件
        （货权转让书MKL、MOL、EGL有固定的格式，马士基可凭一套正本提单进行货权转让）。
      </div>
      <div class="container-body-subTitle3">
        （2）指示提单的背书要求：如果正本提单收货人一栏记明TO ORDER 或TO ORDER OF SHIPPER，
        则提单后面必须有SHIPPER的背书，如不具备应联系船公司依其指示放货；如果正本提单收货人一栏记明为TO ORDER OF XXX银行或公司，
        则提单后面必须有XXX银行或公司的背书签章或指示，如不具备应收回全套正本提单，若无法提供全套正本提单，应联系船公司外代依其指示放货，
        此时SHIPPER的背书将不再要求。如果指示方在背书时发生货权转让，则相应的背书应该连续有效。如不具备，则应提交全套正本提单，
        否则，请联系船公司外代依船公司提示放货。
      </div>
      <div class="container-body-subTitle3">
        5、副本提单换单的背书要求：
      </div>
      <div class="container-body-subTitle3">
        （1）、外代依据船公司的电放指示指定的收货人安排放货；
      </div>
      <div class="container-body-subTitle3">
        （2）、最终的收货人、电放指示指定的收货人以及委托人需在副本提单上背书。
      </div>
      <div class="container-body-subTitle3">
        （3）、MKL、MCC、SAF、MOL、OOCL、APL接受电放放货的货权转让，请按船公司要求提供正确的货权转让书原件。
      </div>
      <div class="container-body-subTitle3">
        6、 海裕驳船换单要求：
      </div>
      <div class="container-body-subTitle3">
        海裕驳船随船有两套二程驳船的副本提单，除依照上述要求提供换单资料外，收货人或其委托人需在一套副本提单上背书，另一套副本交给客户,供客户报关报检使用。
      </div>
      <div class="container-body-subTitle3">
        7、外运代理船舶承运的马士基货柜的放货操作：
      </div>
      <div class="container-body-subTitle3">
        （1）、客户按以上要求准备换单资料、同时准备一套有收货人背书的提单复印件用于在外运换单；
      </div>
      <div class="container-body-subTitle3">
        （2）、外代在对资料审核无误后，将以邮件的形式通知外运按照电放放货的流程安排放货；
      </div>
      <div class="container-body-subTitle3">
        （3）、如果无法向外运提供收货人背书的提单复印件，请在将换单资料递给外代时申明，外代将在给外运的邮件中注明凭无收货人背书的提单复印件换单。
      </div>
      <div class="container-body-link">
        <a href="./static/file/201705241625.docx">进口换单操作指引.doc</a>
      </div>
    </div>

    <Footer />
  </div>
</template>

<script>
  import Footer from '@/views/wap/component/FloatBall'

  export default {
    name: 'wap-guideInBoundChangeBill',
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
        line-height: 35px;
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

      &-img {
        max-width: 100%;
      }

      &-link {
        margin-top: 10px;
        color:#0000EE;
        font-size: 25px;
        margin-bottom: 20px;
      }
    }
  }
</style>
