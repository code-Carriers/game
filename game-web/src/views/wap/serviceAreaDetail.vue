<template>
  <div class="container">
    <Header></Header>
    <div class="container-banner">
      <img src="../../assets/front/images/wap/船舶代理@10x.png" alt=""
           class="container-banner-img" v-if="selectItem==='船舶代理'"/>
      <img src="../../assets/front/images/wap/国际货运@10x.png" alt=""
           class="container-banner-img" v-if="selectItem==='国际货运'"/>
      <img src="../../assets/front/images/wap/保税仓储@10x.png" alt=""
           class="container-banner-img" v-if="selectItem==='保税仓储'"/>
      <img src="../../assets/front/images/wap/报关报检@10x.png" alt=""
           class="container-banner-img" v-if="selectItem==='报关报检'"/>
      <img src="../../assets/front/images/wap/招商邮服@10x.png" alt=""
           class="container-banner-img" v-if="selectItem==='招商邮服'"/>
    </div>

    <div class="container-body" v-if="selectItem==='船舶代理'">
      <van-collapse accordion v-model="itemName" style="width: 100%" :border="false">
        <van-collapse-item title="班轮及非班轮" name="班轮及非班轮" style="width: 100%">
          <div class="container-body-title1">
            代理货物
          </div>
          <div class="container-body-substance1">
            集装箱、钢材、铁矿、粮食、化肥、油脂、化工品、设备、原木
          </div>
          <div class="container-body-title2">
            提供的服务
          </div>
          <div class="container-body-substance2">
            <div style="text-indent: -1em;padding-left: 1em">1. 办理船舶进出港的口岸申报和审批手续，联系安排泊位、装卸等；</div>
            <div style="text-indent: -1em;padding-left: 1em">2. 代理船公司箱管操作；代签提单、运输合同、代办订舱业务；</div>
            <div style="text-indent: -1em;padding-left: 1em">3. 缮制进出口舱单；向海关、国检等口岸单位申报进出口舱单；办理进口放提货单手续；</div>
            <div style="text-indent: -1em;padding-left: 1em">4. 代办国内转关业务；海关空箱调拨申报；</div>
            <div style="text-indent: -1em;padding-left: 1em">5. 代办危险品申报；</div>
            <div style="text-indent: -1em;padding-left: 1em">6. 代收运费、代办结算；</div>
            <div style="text-indent: -1em;padding-left: 1em">7. 洽办船舶检验、修理；安排淡水、代购和转送船用备件、海图等；</div>
            <div style="text-indent: -1em;padding-left: 1em">8. 安排船员就医、遣返；</div>
            <div style="text-indent: -1em;padding-left: 1em">9. 洽办海事处理。</div>
          </div>
        </van-collapse-item>
        <van-collapse-item title="总代理" name="总代理">
          <div class="container-body-substance1">
            在船舶总代理方面具备丰富的操作经验，熟悉中国各大港口情况，对各型船舶有强效的协调控管能力。深圳外代以专业、高效、经济为目标，为客户提供量身定制的增值服务，为客户创造价值。<br/>
            <div style="text-indent: -3.5em;padding-left: 3.5em;margin-top: 10px">经济：
              各大港口丰富的代理资源积累整合，可提供更贴心到位的服务和优惠的价格，以降低客户成本
            </div>
            <div style="text-indent: -3.5em;padding-left: 3.5em">高效： 及时向客户汇总及更新各港口政策执行及变化情况，以便客户进行统筹调配安排</div>
            <div style="text-indent: -3.5em;padding-left: 3.5em">专业： 客户船舶出现任何紧急状况时，将以最快速度提供其在相应港口的最佳解决方案</div>
          </div>
          <div class="container-body-title2">
            服务产品
          </div>
          <div class="container-body-substance2">
            <div>1.　船舶装卸货、坞修、交接总代理</div>
            <div>2.　船东事务保护代理，包括：</div>
            <div style="margin-left: 2em">船员事宜、备件清关送船、人员访船访港、船长借支、安排各种船舶检验以及客户各类委办事项</div>
          </div>
        </van-collapse-item>
        <van-collapse-item title="修船" name="修船">
          <div class="container-body-substance1">
            同各国船东和国内各大船厂保持良好的关系，在全国范围内同友联船厂保持战略合作关系，熟悉修船代理业务流程为船东提供专业、迅捷、贴心的服务。
          </div>
          <div class="container-body-title3">
            代理各式船型
          </div>
          <div class="container-body-substance2">
            集装箱船舶、散杂货船舶、邮轮、液化石油气船、钻井平台、浮式储油轮
          </div>
          <div class="container-body-title4">
            服务产品
          </div>
          <div class="container-body-substance2">
            船舶进出船厂手续、船东登轮、船员事宜、船长借支、备件清关、船舶供应
          </div>
        </van-collapse-item>
        <van-collapse-item title="海洋工程" name="海洋工程">
          <div class="container-body-substance1">
            具备丰富经验的专业团队为海洋工程项目提供代理服务
          </div>
          <div class="container-body-title2">
            提供的服务
          </div>
          <div class="container-body-substance2">
            <div style="text-indent: -1em;padding-left: 1em">1. 办理海洋工程船的进、出港手续</div>
            <div style="text-indent: -1em;padding-left: 1em">2. 办理海洋工程船舶或设备的海关暂进出许可</div>
            <div style="text-indent: -1em;padding-left: 1em">3. 办理工程技术人员居留许可，办理上、下船或平台手续和接送食宿安排</div>
            <div style="text-indent: -1em;padding-left: 1em">4. 办理备件海关监管手续、船用物料的上船清关手续</div>
            <div style="text-indent: -1em;padding-left: 1em">5. 安排办理无动力工程船的拖带证书，航行警告发布</div>
            <div style="text-indent: -1em;padding-left: 1em">6. 安排陆上到海上平台的陆路、水路和直升机运输服务</div>
            <div style="text-indent: -1em;padding-left: 1em">7. 提供施工材物料的物流服务和物料供应</div>
            <div style="text-indent: -1em;padding-left: 1em">8. 项目专业咨询服务</div>
            <div style="text-indent: -1em;padding-left: 1em">9. 其他委托事项</div>
          </div>
        </van-collapse-item>
      </van-collapse>
    </div>


    <div class="container-body" v-if="selectItem==='国际货运'">
      <div class="container-body-titleBox">
        <div :class="itemName1==='简介'?'container-body-titleBox-leftClick':'container-body-titleBox-left'"
             @click="itemName1='简介'">简介
        </div>
        <div :class="itemName1==='业务范围'?'container-body-titleBox-rightClick':'container-body-titleBox-right'"
             @click="itemName1='业务范围'">业务范围
        </div>
      </div>

      <div v-if="itemName1==='简介'">
        <div class="container-body-content">
          深圳市外代国际货运有限公司成立于1993年，是深圳外代的全资子公司。早在1993年即已获得国家外经贸部批准的一级货代资质，也是深圳市最早获得交通部国际货运代理业务资格的企业之一，公司一直专注于打造现代综合物流服务，目前在中国的华东、华北、华南等沿海城市已设立有了二十多家分支机构；公司一直秉承着“WE
          ARE FOR
          YOU”的经营理念，经过多年的业务发展，公司形成了以海运和空运为核心，以仓储、跨境电商、小包快递、国内物流、拼箱、船东代理、海外代理、铁路货物运输、散杂货运输、海铁联运、江海联运及特种柜为补充的新型业务结构，为客户提供最佳物流方案和一站式全程物流服务。
        </div>

        <div class="container-body-content">
          公司配备有先进、完善的货运作业设施和操作系统，与全球数十家航运公司和航空公司建立了长期的合作关系，与海外近200个国家的代理建立起了长年的密切合作关系，能够给客户提供富有竞争力的运价，全方位地为广大客户提供海陆空一条龙配套服务。
        </div>
      </div>

      <div v-if="itemName1==='业务范围'">
        <div class="container-body-subTitle">经营范围</div>
        <div style="overflow: hidden">
          <div class="container-body-row">
            <div class="container-body-row-box">
              <img src="../../assets/front/images/wap/国际货运1@9x.png" alt="" class="container-body-row-box-img"/>
              <div class="container-body-row-box-text">海运服务</div>
            </div>
            <div class="container-body-row-box">
              <img src="../../assets/front/images/wap/国际货运2@9x.png" alt="" class="container-body-row-box-img"/>
              <div class="container-body-row-box-text">空运服务</div>
            </div>
            <div class="container-body-row-box">
              <img src="../../assets/front/images/wap/国际货运3@9x.png" alt="" class="container-body-row-box-img"/>
              <div class="container-body-row-box-text">拼箱服务</div>
            </div>
            <div class="container-body-row-box" style="border-right: none">
              <img src="../../assets/front/images/wap/国际货运4@9x.png" alt="" class="container-body-row-box-img"/>
              <div class="container-body-row-box-text">仓储服务</div>
            </div>
          </div>
          <div class="container-body-row1">
            <div class="container-body-row1-box">
              <img src="../../assets/front/images/wap/国际货运5@9x.png" alt="" class="container-body-row1-box-img"/>
              <div class="container-body-row1-box-text">海外代理</div>
            </div>
            <div class="container-body-row1-box">
              <img src="../../assets/front/images/wap/国际货运6@9x.png" alt="" class="container-body-row1-box-img"/>
              <div class="container-body-row1-box-text">多式联运</div>
            </div>
            <div class="container-body-row1-box">
              <img src="../../assets/front/images/wap/国际货运7@9x.png" alt="" class="container-body-row1-box-img"/>
              <div class="container-body-row1-box-text">特种柜</div>
            </div>
            <div class="container-body-row1-box" style="border-right: none">
              <img src="../../assets/front/images/wap/国际货运8@9x.png" alt="" class="container-body-row1-box-img"/>
              <div class="container-body-row1-box-text">医疗器械运输</div>
            </div>
          </div>
        </div>
        <div class="container-body-subTitle2">优势和资源</div>
        <div class="container-body-row2">
          <div class="container-body-row2-left">
            分布在全国的25家分公司和300多家遍布全球的海外嗲里可以在不同的地区提供优质的服务，满足客户多样化的需求。这种链接式的操作使得原本方便、快捷、经济的高效服务更加天衣无缝。
          </div>
          <img class="container-body-row2-right" alt=""
               src="../../assets/front/images/wap/国际货运-业务范围配图@2x.png"/>

        </div>
        <div class="container-body-row2-left2">
          具有丰富知识及经验的专业人员能及时有效的跟客户提供海运、空运、报关、内陆运输、仓储等全面的服务。多元化的海运增值服务。

        </div>

      </div>
    </div>

    <div class="container-body" v-if="selectItem==='保税仓储'">

      <div class="container-body-titleBox">
        <div :class="itemName1==='简介'?'container-body-titleBox-leftClick':'container-body-titleBox-left'"
             @click="itemName1='简介'">简介
        </div>
        <div :class="itemName1==='业务范围'?'container-body-titleBox-rightClick':'container-body-titleBox-right'"
             @click="itemName1='业务范围'">业务范围
        </div>
      </div>

      <div v-if="itemName1==='简介'">
        <div class="container-body-content">
          深圳市外代仓储有限公司成立于2010年，是深圳外代的全资子公司，海关AEO高级认证企业。前海保税仓库总面积6.6万平方米，总投资2.5亿元人民币。公司在前海湾保税港区海关的政策支持下，敢于创新和探索，在传统保税仓储业务模式之外，还拓展了“全球中心仓”、“港店深仓”、“跨境电商服务”、“供应链及供应链金融”、“保税+邮轮物料供应”等亮点业务模式，为解决客户多元化的业务需求提供专业周到的服务。
        </div>
      </div>

      <div v-if="itemName1==='业务范围'">
        <div class="container-body-subTitle">业务类型一</div>
        <div class="container-body-box1">
          <div class="container-body-box1-text">进口分销仓储-案例</div>
        </div>
        <div class="container-body-content3">某客户在国内有很多的买家，客户一次性的将进口货物放到深圳外代前海保税仓库，然后分批分量的报关进口，然后送货给到买家，节省物流费用。</div>
        <div class="container-body-box2">
          <div class="container-body-box2-text">进口分销仓储-优势</div>
        </div>
        <div class="container-body-content4">A：无需一次性缴纳关税，分批进口分批缴纳，为企业节省大量的积压税款。</div>
        <div class="container-body-content5">B：仓库的堆存费用远低于码头的费用。</div>
        <div class="container-body-img3">
          <img src="../../assets/front/images/wap/保税仓储-业务范围1@2x.png" alt="" class="container-body-img3-img"/>
        </div>

        <div class="container-body-subTitle" style="margin-top: 30px">业务类型二</div>
        <div class="container-body-box1">
          <div class="container-body-box1-text">提前办理出口退税-案例</div>
        </div>
        <div class="container-body-content3">
          某出口企业，产品完成生产急需出口却未找到买家或需要提前退税。由于深圳外代前海仓库所属的前海保税港区有入区（视为出口）即退税的政策，该企业先把产品出口到深圳外代前海的保税仓库，然后根据实际情况进行出口到国外。相比直接出口到国外，企业能提前办理出口退税，而其中仅需付出一点点仓库的使用费用，对于好多靠出口退税生存的企业无疑是一个非常好的解决方案。
        </div>
        <div class="container-body-img3">
          <img src="../../assets/front/images/wap/保税仓储-业务范围2@2x.png" alt="" class="container-body-img3-img"/>
        </div>

        <div class="container-body-subTitle" style="margin-top: 30px">业务类型三</div>
        <div class="container-body-box1">
          <div class="container-body-box1-text">出口转内销-案例</div>
        </div>
        <div class="container-body-content3">
          某企业的产品需要出口转内销，之前的操作模式是出口到香港或境外，然后再从香港或境外进口到国内。现在利用深圳外代前海保税仓库的政策，入区即视为出口。相比直接出口到香港或境外，给企业大大的减少了物流成本。
        </div>
        <div class="container-body-img3">
          <img src="../../assets/front/images/wap/保税仓储-业务范围3@2x.png" alt="" class="container-body-img3-img"/>
        </div>

        <div class="container-body-subTitle" style="margin-top: 30px">业务类型四</div>
        <div class="container-body-box1">
          <div class="container-body-box1-text">两个企业之间的转厂</div>
        </div>
        <div class="container-body-content3">
          广州A公司的产品如显示屏要卖给深圳的B公司作为料件，如直接办理从A公司到B公司，手续很繁琐，时间也比较长。现在利用深圳外代前海保税仓库来转厂，手续非常简便。A公司直接把产品出口到外代保税仓库，B公司从外代保税仓库进口这批货物。
        </div>
        <div class="container-body-img3">
          <img src="../../assets/front/images/wap/保税仓储-业务范围4@2x.png" alt="" class="container-body-img3-img"/>
        </div>
      </div>
    </div>

    <div class="container-body" v-if="selectItem==='报关报检'">
      <div class="container-body-titleBox">
        <div :class="itemName1==='简介'?'container-body-titleBox-leftClick':'container-body-titleBox-left'"
             @click="itemName1='简介'">简介
        </div>
        <div :class="itemName1==='业务范围'?'container-body-titleBox-rightClick':'container-body-titleBox-right'"
             @click="itemName1='业务范围'">业务范围
        </div>
      </div>

      <div v-if="itemName1==='简介'">
        <div class="container-body-content">
          深圳市外代报关有限公司成立于2005年，是深圳外代下属全资子公司，海关AEO高级认证企业。公司以从事货物进出口代理关务及“云极通”线上增值服务为主，业务主要涉及食品、酒、生鲜果蔬、日用品、服装、大型机械、大宗产品、化妆品及母婴用品等，以专业化的团队为广大客户提供优质、高效的服务。
        </div>
      </div>

      <div v-if="itemName1==='业务范围'">
        <div class="container-body-box1">
          <div class="container-body-box1-text">进出口报关</div>
        </div>
        <div class="container-body-row3">
          <div class="container-body-row3-text">从事货物进出口报关、报检、查验和传播服务。主要为客户办理进出口货物和进出境运输工具的报关、报检、预录入保税仓报关业务及关务检务咨询等业务
          </div>
        </div>
        <div class="container-body-box2">
          <div class="container-body-box2-text">修船</div>
        </div>
        <div class="container-body-row3">
          <div class="container-body-row3-text">提供船舶修理、船用给养、备件供应、能源供应以及其他相关的船舶服务业务。</div>
        </div>
        <div class="container-body-box3">
          <div class="container-body-box3-text">海洋工程</div>
        </div>
        <div class="container-body-row3">
          <div class="container-body-row3-text">海洋工程船舶和海工设备的海关暂进出报关手续。</div>
        </div>
        <div class="container-body-box4">
          <div class="container-body-box4-text">货物类型</div>
        </div>
        <div class="container-body-row3">
          <div class="container-body-row3-text">代理货物进出口报关：<br/>集装箱/钢材/铁矿/煤炭/粮食 /设备/石油</div>
        </div>
      </div>
    </div>

    <div class="container-body" v-if="selectItem==='招商邮服'">
      <div class="container-body-titleBox">
        <div :class="itemName1==='简介'?'container-body-titleBox-leftClick':'container-body-titleBox-left'"
             @click="itemName1='简介'">简介
        </div>
        <div :class="itemName1==='业务范围'?'container-body-titleBox-rightClick':'container-body-titleBox-right'"
             @click="itemName1='业务范围'">业务范围
        </div>
      </div>
      <div v-if="itemName1==='简介'">
        <div class="container-body-content">
          深圳招商邮轮服务有限公司于2016年应运而生，是招商局集团进军高端旅游产业链的标志性企业，自投入运作以来，招商邮服以港航服务一体化和资源整合为导向充分发挥物流供应链方面的优势，着力为加快推进和拓展集团邮轮全产业链布局作出重要贡献。主营邮轮伙食、酒店用品供应、航海物料供应、保税供应服务、游艇船舶代理，并为供应商、旅行团等提供货物报关、转关、ATA单证册等专业服务。
        </div>
      </div>

      <div v-if="itemName1==='业务范围'">
        <div class="container-body-box1">
          <div class="container-body-box1-text">保税物流</div>
        </div>
        <div class="container-body-row5">
          <div class="container-body-row5-radius"></div>
          <div class="container-body-row5-text">邮轮全球采购商品的集中配送
          </div>
        </div>
        <div class="container-body-row5" style="margin-top: -20px">
          <div class="container-body-row5-radius"></div>
          <div class="container-body-row5-text">保税货物转运
          </div>
        </div>
        <div class="container-body-row5" style="margin-top: -20px">
          <div class="container-body-row5-radius"></div>
          <div class="container-body-row5-text">免税商品转运等
          </div>
        </div>
        <div class="container-body-box2">
          <div class="container-body-box2-text">邮轮物资物料采购</div>
        </div>
        <div class="container-body-row6">
          <div class="container-body-row6-left">
            <div class="container-body-row6-left-radius"></div>
            <div class="container-body-row6-left-text">供船食品
            </div>


          </div>
          <div class="container-body-row6-right">
            <div class="container-body-row6-right-radius"></div>
            <div class="container-body-row6-right-text">酒店用品
            </div>


          </div>

        </div>
        <div class="container-body-row6" style="margin-top: -30px">
          <div class="container-body-row6-left">
            <div class="container-body-row6-left-radius"></div>
            <div class="container-body-row6-left-text">
              船舶配件
            </div>


          </div>
          <div class="container-body-row6-right">
            <div class="container-body-row6-right-radius"></div>
            <div class="container-body-row6-right-text">船舶油料等采购及申报
            </div>


          </div>

        </div>
        <div class="container-body-box3">
          <div class="container-body-box3-text">海洋工程</div>
        </div>
        <div class="container-body-row6">
          <div class="container-body-row6-left">
            <div class="container-body-row6-left-radius"></div>
            <div class="container-body-row6-left-text">船舶联检
            </div>


          </div>
          <div class="container-body-row6-right">
            <div class="container-body-row6-right-radius"></div>
            <div class="container-body-row6-right-text">船员及旅客申报手续
            </div>


          </div>


        </div>
        <div class="container-body-row6" style="margin-top: -30px">
          <div class="container-body-row6-left">
            <div class="container-body-row6-left-radius"></div>
            <div class="container-body-row6-left-text">
              船东服务等
            </div>


          </div>

        </div>
        <div class="container-body-box4">
          <div class="container-body-box4-text">相关配套服务</div>
        </div>
        <div class="container-body-row6">
          <div class="container-body-row6-left">
            <div class="container-body-row6-left-radius"></div>
            <div class="container-body-row6-left-text">船员接送
            </div>


          </div>
          <div class="container-body-row6-right">
            <div class="container-body-row6-right-radius"></div>
            <div class="container-body-row6-right-text">污油水、洗舱水接收
            </div>


          </div>

        </div>
      </div>
    </div>
    <Footer/>
  </div>
</template>

<script>
  import Header from '@/views/wap/component/header'
  import Footer from '@/views/wap/component/FloatBall'

  export default {
    name: 'wap-serviceAreaDetail',
    components: {
      Footer,
      Header
    },
    data() {
      return {
        selectItem: '',
        itemName: '班轮及非班轮',
        itemName1: '简介'
      }
    },
    created() {
      !(function (window) {
        setTimeout(function () {
          /* 设计图文档宽度 */
          const docWidth = 750
          // eslint-disable-next-line one-var
          const doc = window.document,
            // eslint-disable-next-line prefer-const
            docEl = doc.documentElement,
            // eslint-disable-next-line prefer-const
            resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize'
          const recalc = (function refreshRem() {
            /* 窗口当前宽度 */
            let clientWidth = docEl.getBoundingClientRect().width
            /* 页面宽度大于 750 时不再放大 */
            clientWidth = clientWidth > 750 ? 750 : clientWidth
            const oldSize = (clientWidth / docWidth * 100) + 'px'
            docEl.style.fontSize = oldSize

            /* 获取设置后的字体大小情况 - 因微信设置APP字体大小后会影响该设置 */
            const nowSize = window.getComputedStyle(document.getElementsByTagName('html')[0]).fontSize
            const oldSizeValue = parseFloat(oldSize, 10)
            const nowSizeValue = parseFloat(nowSize, 10)

            /* 当差值大于1时重新按差比计算出正确的px值 */
            if ((nowSizeValue - oldSizeValue) > 1 || (nowSizeValue - oldSizeValue) < -1) {
              const diff = (oldSizeValue / nowSizeValue)
              docEl.style.fontSize = ((clientWidth / docWidth * 100) * diff) + 'px'
            }
            return refreshRem
          })()
          /* 添加倍屏标识，安卓为1 */
          docEl.setAttribute('data-dpr', window.navigator.appVersion.match(/iphone/gi) ? window.devicePixelRatio : 1)
          if (/iP(hone|od|ad)/.test(window.navigator.userAgent)) {
            /* 添加IOS标识 */
            doc.documentElement.classList.add('ios')
            /* IOS8以上给html添加hairline样式，以便特殊处理 */
            if (parseInt(window.navigator.appVersion.match(/OS (\d+)_(\d+)_?(\d+)?/)[1], 10) >= 8) {doc.documentElement.classList.add('hairline')}
          }
          if (!doc.addEventListener) return
          window.addEventListener(resizeEvt, recalc, false)
          doc.addEventListener('DOMContentLoaded', recalc, false)
        }, 0)
      }(window))
      this.selectItem = this.$route.query.selectItem
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .container {
    &-banner {
      width: 100%;
      height: 170px;

      &-img {
        width: 100%;
        height: 170px;
      }


    }

    &-body {
      padding: 20px 40px 40px 40px;

      &-subTitle {
        color: #000;
        font-size: 28px;
        margin-bottom: 25px;

      }

      &-row3 {
        position: relative;

        &-radius {
          position: absolute;
          top: 50%;
          margin-top: -10px;
          width: 20px;
          height: 20px;
          border-radius: 50%;
          background-color: #277AE3;
        }

        &-text {
          margin-top: 15px;
          color: #3B3F47;
          font-size: 25px;
          font-family: '微软雅黑', sans-serif;
          line-height: 40px;
          margin-bottom: 30px;
        }
      }

      &-row6 {
        width: 100%;
        overflow: hidden;
        margin-bottom: 6px;

        &-left {
          float: left;
          width: 40%;
          position: relative;



          &-radius {
            position: absolute;
            top: 50%;
            margin-top: -16px;
            width: 16px;
            height: 16px;
            border-radius: 50%;
            background-color: #277AE3;
          }

          &-text {
            margin-top: 10px;
            color: #3B3F47;
            font-size: 25px;
            font-family: '微软雅黑', sans-serif;
            line-height: 42px;
            margin-bottom: 30px;
            padding-left: 28px;
          }
        }

        &-right {
          float: left;
          width: 60%;
          position: relative;


          &-radius {
            position: absolute;
            top: 50%;
            margin-top: -16px;
            width: 16px;
            height: 16px;
            border-radius: 50%;
            background-color: #277AE3;
          }

          &-text {
            margin-top: 10px;
            color: #3B3F47;
            font-size: 25px;
            font-family: '微软雅黑', sans-serif;
            line-height: 42px;
            margin-bottom: 30px;
            padding-left: 28px;
          }
        }
      }

      &-row5 {
        position: relative;

        &-radius {
          position: absolute;
          top: 50%;
          margin-top: -8px;
          width: 16px;
          height: 16px;
          border-radius: 50%;
          background-color: #277AE3;
        }

        &-text {
          margin-top: 10px;
          color: #3B3F47;
          font-size: 25px;
          font-family: '微软雅黑', sans-serif;
          line-height: 42px;
          margin-bottom: 30px;
          padding-left: 28px;
        }
      }

      &-box1 {
        width: 100%;
        height: 70px;
        background-image: url('../../assets/front/images/serviceArea/serviceArea-01.png');
        background-repeat: no-repeat;
        background-size: 70px 70px;
        position: relative;

        &-text {
          font-size: 30px;
          color: #000;
          font-weight: bold;
          position: absolute;
          bottom: 0;
          left: 0;
        }
      }

      &-box2 {
        width: 100%;
        height: 70px;
        background-image: url('../../assets/front/images/serviceArea/serviceArea-02.png');
        background-repeat: no-repeat;
        background-size: 70px 70px;
        position: relative;

        &-text {
          font-size: 30px;
          color: #000;
          font-weight: bold;
          position: absolute;
          bottom: 0;
          left: 0;
        }
      }

      &-box3 {
        width: 100%;
        height: 70px;
        background-image: url('../../assets/front/images/serviceArea/serviceArea-03.png');
        background-repeat: no-repeat;
        background-size: 70px 70px;
        position: relative;

        &-text {
          font-size: 30px;
          color: #000;
          font-weight: bold;
          position: absolute;
          bottom: 0;
          left: 0;
        }
      }

      &-box4 {
        width: 100%;
        height: 70px;
        background-image: url('../../assets/front/images/serviceArea/serviceArea-04.png');
        background-repeat: no-repeat;
        background-size: 70px 70px;
        position: relative;

        &-text {
          font-size: 30px;
          color: #000;
          font-weight: bold;
          position: absolute;
          bottom: 0;
          left: 0;
        }
      }

      &-content3 {
        margin-top: 20px;
        color: #3B3F47;
        font-size: 25px;
        font-family: '微软雅黑', sans-serif;
        line-height: 40px;
        margin-bottom: 30px;
      }

      &-content4 {
        margin-top: 20px;
        color: #3B3F47;
        font-size: 25px;
        font-family: '微软雅黑', sans-serif;
        line-height: 40px;
        margin-bottom: 30px;
        text-indent: -43px;
        padding-left: 43px;
      }

      &-img3 {
        width: 100%;

        &-img {
          max-width: 100%;
        }
      }

      &-content5 {
        margin-top: -28px;
        color: #3B3F47;
        font-size: 25px;
        font-family: '微软雅黑', sans-serif;
        line-height: 40px;
        margin-bottom: 30px;
        text-indent: -43px;
        padding-left: 43px;
      }

      &-row2 {
        width: 100%;
        overflow: hidden;

        &-left {
          margin-top: 20px;
          line-height: 30px;
          width: 60%;
          color: #999;
          font-size: 22px;
          margin-right: 3%;
          float: left;
          letter-spacing: 3px;

        }

        &-right {
          margin-top: 20px;
          height: 200px;
          width: 37%;
          float: right;
        }

        &-left2 {
          margin-top: 20px;
          line-height: 30px;
          color: #999;
          font-size: 22px;
          letter-spacing: 3px;
        }


      }

      &-row {
        width: 100%;

        &-box {
          width: 25%;
          height: 150px;
          float: left;
          position: relative;
          border-right: 1px solid #E4E4E4;
          border-bottom: 1px solid #E4E4E4;

          &-img {
            left: 50%;
            margin-left: -40px;
            width: 80px;
            height: 80px;
            position: absolute;
            top: 10%;
          }

          &-text {
            width: 100%;
            color: #000;
            font-size: 20px;
            position: absolute;
            bottom: 19px;
            text-align: center;
          }
        }
      }

      &-subTitle2 {
        margin-top: 35px;
        color: #000;
        font-size: 30px;
      }

      &-row1 {
        width: 100%;

        &-box {
          width: 25%;
          height: 150px;
          float: left;
          position: relative;
          border-right: 1px solid #E4E4E4;

          &-img {
            left: 50%;
            margin-left: -40px;
            width: 80px;
            height: 80px;
            position: absolute;
            top: 10%;
          }

          &-text {
            width: 100%;
            color: #000;
            font-size: 19px;
            position: absolute;
            bottom: 20px;
            text-align: center;
          }
        }
      }

      &-titleBox {
        width: 100%;
        height: 60px;
        margin-bottom: 25px;

        &-leftClick {
          background-color: #277AE3;
          color: #FFFFFF;
          width: 50%;
          height: 60px;
          font-size: 32px;
          text-align: center;
          line-height: 60px;
          border: 1px solid #E4E4E4;
          float: left;


        }

        &-left {
          width: 50%;
          height: 60px;
          font-size: 32px;
          text-align: center;
          line-height: 60px;
          border: 1px solid #E4E4E4;
          float: left;


        }

        &-rightClick {
          background-color: #277AE3;
          color: #FFFFFF;
          width: 50%;
          height: 60px;
          font-size: 32px;
          text-align: center;
          line-height: 60px;
          border-top: 1px solid #E4E4E4;
          border-bottom: 1px solid #E4E4E4;
          border-right: 1px solid #E4E4E4;
          float: right;
        }

        &-right {
          width: 50%;
          height: 60px;
          font-size: 32px;
          text-align: center;
          line-height: 60px;
          border-top: 1px solid #E4E4E4;
          border-bottom: 1px solid #E4E4E4;
          border-right: 1px solid #E4E4E4;
          float: right;
        }


      }

      &-title {
        color: #3B3F47;
        font-size: 45px;
        font-family: '微软雅黑', sans-serif;
        margin-bottom: 40px;
      }

      &-content {
        text-indent: 2em;
        color: #3B3F47;
        font-size: 25px;
        font-family: '微软雅黑', sans-serif;
        line-height: 45px;
        margin-bottom: 40px;
      }

      &-title1 {
        margin-top: 15px;
        margin-bottom: 15px;
        font-family: PingFangSC-Regular, sans-serif;
        font-size: 26px;
        color: #5F6F77;
        letter-spacing: 0.38px;
        padding-left: 45px;
        background-size: 35px 35px;
        background-repeat: no-repeat;
        background-image: url('../../assets/front/icon/serviceArea-icon6.png');
      }

      &-substance1 {
        font-family: PingFangSC-Regular, sans-serif;
        font-size: 23px;
        color: #7D929D;
        letter-spacing: 0.38px;
        line-height: 40px;
        margin-top: 15px;
      }
      &-title5 {
        font-weight: 600;
        color: #000;
        font-size: 48px;
        margin: 30px 0;



      }
      &-title2 {
        font-size: 26px;
        margin-top: 25px;
        margin-bottom: 12px;
        font-family: PingFangSC-Regular, sans-serif;
        color: #5F6F77;
        letter-spacing: 0.38px;
        padding-left: 45px;
        background-size: 35px 35px;
        background-repeat: no-repeat;
        background-image: url('../../assets/front/icon/serviceArea-icon2.png');
      }

      &-title3 {
        font-size: 28px;
        margin-top: 25px;
        margin-bottom: 12px;
        font-family: PingFangSC-Regular, sans-serif;
        color: #5F6F77;
        letter-spacing: 0.38px;
        padding-left: 45px;
        background-size: 35px 35px;
        background-repeat: no-repeat;
        background-image: url('../../assets/front/icon/serviceArea-icon4.png');
      }

      &-title4 {
        font-size: 28px;
        margin-top: 25px;
        margin-bottom: 12px;
        font-family: PingFangSC-Regular, sans-serif;
        color: #5F6F77;
        letter-spacing: 0.38px;
        padding-left: 45px;
        background-size: 35px 35px;
        background-repeat: no-repeat;
        background-image: url('../../assets/front/icon/serviceArea-icon3.png');
      }

      &-substance3 {
        margin-top: 20px;
        font-family: PingFangSC-Regular, sans-serif;
        font-size: 15px;
        color: #888888;
        letter-spacing: 0.38px;
        line-height: 28px;
      }

      &-substance2 {
        font-family: PingFangSC-Regular, sans-serif;
        font-size: 22px;
        color: #7D929D;
        letter-spacing: 0.38px;
        line-height: 42px;
        margin-bottom: 20px;
      }

      &-substance4 {
        font-family: PingFangSC-Regular, sans-serif;
        font-size: 14px;
        color: #7D929D;
        letter-spacing: 0.38px;
        line-height: 25px;
      }

    }

    /deep/ .van-hairline--top-bottom {
      position: unset!important;
    }

    /deep/ .van-cell {
      position: relative;
      display: -webkit-box;
      display: -webkit-flex;
      display: flex;
      box-sizing: border-box;
      width: 100%;
      padding: 25px 0;
      overflow: hidden;
      line-height: 28px;
      background-color: #fff;
      color: #3B3F47;
      font-size: 30px;
      font-family: '微软雅黑', sans-serif;
      border-bottom: 1px solid #ebedf0;
    }

    /deep/ .van-cell::after {
      border-bottom: unset !important;
    }

    /deep/ .van-collapse-item--border::after {
      border-top: unset !important;
    }

    /deep/ .van-collapse-item__content {
      padding: 0 0;
      font-size: 32px;
      line-height: 1.5;
      background-color: #fff;
    }

    /deep/ .van-cell__right-icon {
      margin-left: 4px;
      color: #969799;
    }

    /deep/ .van-cell__right-icon {
      height: 24px;
      font-size: 26px;
      line-height: 24px;
    }
  }
</style>
