<template>
  <div class="container">
    <div class="container-body">
      <div class="container-body-title">NYK网上打单指引及注意事项</div>
      <div class="container-body-subTitle2">
        1．请凭提柜单的正本提柜，复印件还柜（网上打单的除外）；
      </div>
      <div class="container-body-subTitle3">
        2．蛇口，赤湾，大铲湾出口的订舱单，请至外代前海办公室换单；
      </div>
      <div class="container-body-subTitle3">
        3．下列情况请与NYK确认后，我司方可办理：
      </div>
      <div class="container-body-subTitle3">
        　A.封条遗失；
      </div>
      <div class="container-body-subTitle3">
           　B.出口返空，退场柜的办理；
      </div>
      <div class="container-body-subTitle3">
        　C.进口重柜提前打单，逾期费用的计算和缴纳；
      </div>
      <div class="container-body-subTitle3">
        4．出口如果是驳船单，大船单改单（包括改船，提柜地点，柜型，卸货港等）都必须在柜台重新出单；
      </div>

      <div class="container-body-subTitle3">
        5．出口大船单，都可以在外代的网站进行备案后自助打单：
      </div>
      <div class="container-body-subTitle3">
        　A.录入用户名和密码后登录网址：WWW.EIRSMART.COM，即可进行登录：
      </div>
      <div align="center">
        <img class="container-body-img" alt="" src="../../assets/front/images/wap/eirLogin.png" />
      </div>

      <div class="container-body-subTitle3">
        　B.登录 之后，在“单证操作”中的“出口缴费”进行检索缴费（费用为零）：
      </div>
      <div class="container-body-subTitle3">
        　　a.船公司：选择NYK日本邮船；
      </div>
      <div class="container-body-subTitle3">
        　　b.订舱编号：录入需要打单的出口订舱号；
      </div>
      <div class="container-body-subTitle3">
        　　c.点击查询，将会出来相关的出口订舱单的信息，包括船名航次，提还柜地点，柜型等；
      </div>
      <div class="container-body-subTitle3">
        　　d.点击缴费（费用为零）即可完成操作；
      </div>
      <div align="center">
        <img class="container-body-img" alt="" src="../../assets/front/images/wap/eir1.png" />
      </div>

      <div class="container-body-subTitle3">
        　C.缴费之后，点击“出口打单”：
      </div>
      <div class="container-body-subTitle3">
        　　a.在“缴费日期”中选择日期；
      </div>
      <div class="container-body-subTitle3">
        　　b.点击“检索单证”；
      </div>
      <div class="container-body-subTitle3">
        　　c.选择需要打印的单证，点击“打印单证”：
      </div>
      <div align="center">
        <img class="container-body-img" alt="" src="../../assets/front/images/wap/eir2.png" />
      </div>

      <div class="container-body-subTitle3">
        　D.网上打单可以在我司柜台凭备案卡预领封条，并可以在“单证操作”中“预派封条余量统计”查到自己手上的封条量：
      </div>
      <div align="center">
        <img class="container-body-img" alt="" src="../../assets/front/images/wap/eir3.png" />
      </div>

      <div class="container-body-subTitle3">
        　E.在“出口打单统计”可以查询所有的出口打单资料：
      </div>
      <div class="container-body-subTitle3">
        　　a.在“单证操作”下的“出口打单操作统计”，选择需要查询的“船公司”，选择“开始日期”和“结束日期”，点击“查找”即可；
      </div>
      <div class="container-body-subTitle3">
        　　b.也可以在“订舱编号”查询具体的订舱单打单信息；
      </div>
      <div align="center">
        <img class="container-body-img" alt="" src="../../assets/front/images/wap/eir4.png" />
      </div>

      <div class="container-body-subTitle3">
         　F.在“财务管理”，可以用“付款记录”查询到自己公司的消费记录
      </div>
      <div class="container-body-subTitle3">
        　　a.点击财务管理下的付款记录；
      </div>
      <div class="container-body-subTitle3">
        　　b.选择日期，系统可以查询选择日期往后一个月的打单记录，如选择2015年10月1日，则可以查询到从2015年10月1日到2015年11月1日：
      </div>
      <div align="center">
        <img class="container-body-img" alt="" src="../../assets/front/images/wap/eir5.png" />
      </div>

      <div class="container-body-subTitle3">
        　G.在“财务管理”中的“余额查询”可以看到本公司在外代的账户余额：
      </div>
      <div align="center">
        <img class="container-body-img" alt="" src="../../assets/front/images/wap/eir6.png" />
      </div>

      <div class="container-body-subTitle3">
         　H.可以用“充值记录查询”来查询自己公司的充值记录：
      </div>
      <div align="center">
        <img class="container-body-img" alt="" src="../../assets/front/images/wap/eir7.png" />
      </div>
      <div class="container-body-link" style="text-align: right">
        <div class="container-body-subTitle3" style="display: inline-block">
          下载链接：
        </div>
        <a href="./static/file/201705241628.doc">NYK网上打单指引及注意事项.doc</a>
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
        font-size: 22px;
        margin-bottom: 20px;
      }
      &-line {
        margin: 30px 0 30px 0;
        width: 100%;
        height: 1px;
        background-color: #E4E4E4;
      }
      &-img {
        max-width: 100%;
      }
    }
  }
</style>
