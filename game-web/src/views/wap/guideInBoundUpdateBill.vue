<template>
  <div class="container">
    <div class="container-body">
      <div class="container-body-title">进口改单操作指引</div>
      <div class="container-body-subTitle2" style="text-indent: 2em">
        申报海关的舱单数据是记录相应航次所载货物明细，若发现舱单数据与实际不符应及时向海关申请更改舱单数据，否则将影响后续报关操作。
        为保证舱单资料修改的顺利进行，烦请提供齐备的资料以便我司向海关申请舱单数据更改，具体需要提供的资料信息如下：
      </div>
      <div align="center" >
        <table width="100%" height="100%" border="1" cellspacing="0" style="border-collapse: collapse">
          <tbody>
          <tr>
            <th class="container-body-subTitle4">责任方</th>
            <th class="container-body-subTitle5">材料准备</th>
          </tr>

          <tr>
            <td rowspan="8" align="center" class="container-body-subTitle4">客户</td>
            <td class="container-body-subTitle5">1.客户情况说明（加盖货主章）</td>
          </tr>
          <tr>
            <td class="container-body-subTitle5">2.船公司情况说明（加盖船公司章）</td>
          </tr>
          <tr>
            <td class="container-body-subTitle5">3.提单复印件（加盖船公司章）</td>
          </tr>
          <tr>
            <td class="container-body-subTitle5">4.装箱单（加盖货主或报关行章）</td>
          </tr>
          <tr>
            <td class="container-body-subTitle5" bgcolor="#D8D8D8">5.转船证明/航次证明（加盖船公司章）<br/>
              *若发生转船则另需提供<b>转船证明</b>/若情况说明航次与提单航次不一致则另需提供<b>航次证明</b>
            </td>
          </tr>

          <tr>
            <td class="container-body-subTitle5" bgcolor="#D8D8D8">6.报关单复印件、撤销审批表复印件（加盖货主或报关行章）<br/>
              *若提单<b>已报关</b>，则需向海关申请解除舱单与报关单的捆绑，并将报关单复印件、报关单撤销审批表复印件递交至我司；若报关单撤销审批表为无纸化，则无需提供。
            </td>
          </tr>

          <tr>
            <td class="container-body-subTitle5" bgcolor="#D8D8D8">7.查验记录单复印件（加盖货主或报关行章）
              *若提单所载集装箱经<b>海关查验</b>，则另需提供查验记录单
            </td>
          </tr>

          <tr>
            <td class="container-body-subTitle5" bgcolor="#D8D8D8">8.过磅单复印件（加盖货主或报关行章）<br/>
              *若提单所载集装箱经<b>海关过磅</b>发现重量与实际不符，则另需提供过磅单
            </td>
          </tr>

          <tr>
            <td rowspan="5" align="center" class="container-body-subTitle5">船公司</td>
            <td class="container-body-subTitle5">1.船公司情况说明（加盖船公司章）</td>
          </tr>

          <tr>
            <td class="container-body-subTitle5">2.提单复印件（加盖船公司章）</td>
          </tr>

          <tr>
            <td class="container-body-subTitle5">3.装箱单（加盖货主或报关行章）</td>
          </tr>

          <tr>
            <td class="container-body-subTitle5" bgcolor="#D8D8D8">4.转船证明/航次证明（加盖船公司章）<br/>
              *若发生转船则另需提供<b>转船证明</b>/若情况说明航次与提单航次不一致则另需提供<b>航次证明</b>
            </td>
          </tr>

          <tr>
            <td class="container-body-subTitle5" bgcolor="#D8D8D8">5.报关单复印件、撤销审批表复印件（加盖货主或报关行章）<br/>
              *若提单<b>已报关</b>，则需至海关出解除舱单与报关单的捆绑，并将报关单复印件、撤报关单撤销审批表复印件递交至我司；若报关单撤销审批表为无纸化，则无需提供。
            </td>
          </tr>
          </tbody>

        </table>

      </div>
      <div class="container-body-subTitle2">
        注1：上表灰底为非必须材料，当且仅当单证符合相应条件时提供；
      </div>
      <div class="container-body-subTitle3">
        注2：更改舱单材料需统一递交海关申请更改，数据更改成功后我司将以电话形式通知贵司至我司前台重新换单。为不耽误报关，烦请填写正确的联系方式。
      </div>
      <div class="container-body-link">
        <a href="./static/file/201705241625.docx">进口改单操作指引.doc</a>
      </div>
    </div>


    <Footer/>
  </div>
</template>

<script>
  import Footer from '@/views/wap/component/FloatBall'

  export default {
    name: 'wap-guideInBoundUpdateBill',
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
      &-subTitle4 {
        width: 20%;
        color: #999;
        font-size: 22px;
        margin-top: 10px;
        line-height: 40px;
      }
      &-subTitle5 {
        color: #999;
        font-size: 22px;
        margin-top: 10px;
        line-height: 40px;
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
