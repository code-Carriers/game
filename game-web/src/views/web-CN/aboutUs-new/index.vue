<template>
  <div class="container">
    <!--导航栏模块-->
    <Header :active-index="activeIndex"></Header>

    <!--横幅banner模块-->
    <div class="container-banner">
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-title animate__animated animate__bounceInDown">关于我们</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-content animate__animated animate__bounceInDown">ABOUT US</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
    </div>

    <!--关于我们主体内容-->
    <div class="container-body">
      <!--关于我们——选择栏-->
      <el-row class="container-body-box">
        <el-col style="width: 15%"
                :class="selectTitle==='董事长致辞'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='董事长致辞'?'aClass1':'aClass2'" @click="handleSelectTitle('董事长致辞')">董事会致辞</div>
        </el-col>
        <el-col style="width: 14%"
                :class="selectTitle==='公司简介'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='公司简介'?'aClass1':'aClass2'" @click="handleSelectTitle('公司简介')">公司简介</div>
        </el-col>
        <el-col style="width: 14%;"
                :class="selectTitle==='组织架构'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='组织架构'?'aClass1':'aClass2'" @click="handleSelectTitle('组织架构')">组织架构</div>
        </el-col>
        <el-col style="width: 14%"
                :class="selectTitle==='行业组织'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='行业组织'?'aClass1':'aClass2'" @click="handleSelectTitle('行业组织')">行业组织</div>
        </el-col>
        <el-col style="width: 14%;"
                :class="selectTitle==='公司荣誉'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='公司荣誉'?'aClass1':'aClass2'" @click="handleSelectTitle('公司荣誉')">公司荣誉</div>
        </el-col>
        <el-col style="width: 14%"
                :class="selectTitle==='公司资质'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='公司资质'?'aClass1':'aClass2'" @click="handleSelectTitle('公司资质')">公司资质</div>
        </el-col>
        <el-col style="width: 15%;"
                :class="selectTitle==='客户介绍'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='客户介绍'?'aClass1':'aClass2'" @click="handleSelectTitle('客户介绍')">合作伙伴</div>
        </el-col>
      </el-row>

      <!--关于我们——董事长致辞-->
      <div v-if="selectTitle==='董事长致辞'">
        <div class="container-body-content">
          <div class="container-body-content-box">
            <el-row>
              <!--                <el-col class="container-body-content-box-col1">-->
              <!--                  <img class="container-body-content-box-col1-img"-->
              <!--                       src="../../../assets/front/images/aboutUS-new/董事长.jpg" alt=""/>-->
              <!--                </el-col>-->

              <el-col class="container-body-content-box-col2">
                <div class="container-body-content-box-col2-title"></div>
              </el-col>

              <el-col class="container-body-content-box-col3">
                <!--                  <div class="container-body-content-box-col3-position">董事长</div>-->
                <div class="container-body-content-box-col3-content">
                  <p>
                    自1992年成立以来，中国深圳外轮代理有限公司（简称：深圳外代）乘着中国改革开放和港航事业蓬勃发展的东风，承蒙广大客户、各界朋友的鼎力支持，从蛇口出发，不断发展壮大，服务网络现已覆盖全国30多个口岸和城市，合作伙伴遍布全球，业务领域涵盖船舶代理、货运代理、保税仓储、进出口报关、报检、国际贸易、海运租船经纪、供应链管理、邮轮服务、项目物流、电商物流、物流应用软件开发及信息服务等多元化业务板块，已由传统的公共船务代理企业，发展成为在业内享有较高声誉的现代综合型海运物流服务供应商。</p>
                  <p>
                    近年来，深圳外代积极投身于一带一路建设，全面响应并主动融入粤港澳大湾区、中国特色社会主义先行示范区建设发展战略当中。在新的历史机遇和挑战面前，深圳外代人锐意进取，开拓创新，充分发挥“敢闯敢试、敢为人先、埋头苦干”的特区精神和“时间就是金钱、效率就是生命”、“空谈误国、实干兴邦”的蛇口精神，以国际化视野和信心，秉承“准确、及时、文明、周到”的服务理念，在强大服务网络和多元化业务平台的支持下，致力于为船舶所有人和经营人、生产制造企业、贸易流通企业、电商企业、以及终端消费者提供更专业、更便捷、更安全、更具个性化的线上、线下优质服务，不断降低客户的物流成本，与客户共同成长，立志成为客户首选的船舶代理人、物流供应商和战略合作者，共同促进世界的互联互通。</p>
                  <p>
                    董事会谨此代表深圳外代全体同仁，向与我们风雨兼程、一路同行的客户，向给予我们关心、支持的社会各界朋友致以诚挚的感谢！ 在这伟大的新时代，让我们不忘初心，牢记使命，继续携手，共创辉煌！
                  </p>
                  <!--               <img src="../../../assets/front/images/aboutUS-new/签名@2x.png" alt=""  class="container-body-content-box-col3-content-img"/>-->
                  <div class="container-body-content-box-col3-content-textBox">
                    <p class="container-body-content-box-col3-content-textBox-text1">董事长 李世础</p>
                    <p class="container-body-content-box-col3-content-textBox-text">董事总经理 蒋海声</p>
                  </div>
                </div>
              </el-col>
            </el-row>
          </div>
        </div>
      </div>
      <!--关于我们——公司简介-->
      <div v-if="selectTitle==='公司简介'">
        <div class="container-body-content">
          <div class="container-body-content-title animate__animated animate__fadeInLeftBig">立足华南，综合型的海运物流服务商</div>
          <div class="container-body-content-body">
            <div>
              <img class="container-body-content-body-img"
                   src="../../../assets/front/images/aboutUS-new/中文-发展历程@2x4.png" alt=""/>
            </div>
            <div class="container-body-content-body-word">
              <div class="container-body-content-body-word-word1 animate__animated animate__fadeInLeftBig">
                中国深圳外轮代理有限公司（简称“深圳外代”）成立于1992年，其前身可追溯至1983年成立的中国外轮代理公司蛇口分公司，由中国外轮代理有限公司、中外运物流有限公司、招商局港口集团股份有限公司、深圳市盐田港集团有限公司、深圳市南油（集团）有限公司、深圳市航运集团有限公司六家股东出资组建，注册资本6000万元人民币，是深圳第一家从事国际船舶代理业务的龙头企业，专业水准和市场声誉被业界所公认。
              </div>
              <div class="container-body-content-body-word-word2 animate__animated animate__fadeInLeftBig">
                在历经30多个春秋的风雨洗礼之后，深圳外代现已从传统的船舶代理企业成长为综合型的海运物流服务商，业务范围涵盖船舶代理、货运代理、进出口报关、保税仓储、供应链管理、项目物流、邮轮服务、物流应用软件开发及信息服务等多个领域，服务网络覆盖国内30多个城市和口岸，海外代理近200家，公司秉承“专家型代理，人性化服务”的理念，竭诚为客户提供“准确、文明、及时、周到”的服务，荣获“深圳市交通系统先进集体”、“深圳市物流和货运诚信企业”、“中国货运业大奖最佳船代公司华南区综合类优秀奖”、“马士基中国区最佳船代服务商”、“深圳市重点物流企业”、“南山区绿色通道企业”、“WCA2016年度亚洲最佳合作伙伴奖”。深圳外代1996年就建立了ISO质量管理体系并通过了英国标准局（BSI）认证，管理水平在业内一直保持领先地位，公司还建立起HSE管理体系并通过了相关标准认证，公司同时也是海关AEO高级认证企业。
              </div>
              <div class="container-body-content-body-word-word3 animate__animated animate__fadeInLeftBig">
                近年来，深圳外代本着为客户创造价值的理念，深入践行国家“一带一路”倡议，依托自身多年在海运物流领域的深厚积淀，将服务范围进一步向供应链上下游延伸，持续打造全程物流服务能力，深度挖掘质效提升的潜能，为客户提供最便捷、最安全、最经济的物流解决方案，与客户共同成长、发展。
              </div>
            </div>
          </div>
        </div>
      </div>

      <!--关于我们——组织机构-->
      <div v-if="selectTitle==='组织架构'">
        <div class="container-body-content2">
          <div class="container-body-content2-box">
            <img class="container-body-content2-box-img animate__animated animate__fadeInDown"
                 src="../../../assets/front/images/aboutUS-new/aboutUs-new-image3.png" alt=""/>
          </div>
        </div>
      </div>

      <!--关于我们——行业组织-->
      <div v-if="selectTitle==='行业组织'">
        <div class="container-body-content">
          <div
            :class="organizeFlag===true?'container-body-content-title animate__animated animate__shakeX':'container-body-content-title'"
            @click="organizeFlag=true" @mouseout="organizeFlag=false">行业组织
          </div>
          <div class="container-body-content-word">
            <!--中国深圳外轮代理有限公司（以下简称"深圳外代" ）创立于1982年，是华南地区国际船舶代理的领军者，其专业水准和市场声誉被业界公认。-->
          </div>
          <div class="container-body-content-subTitleBox">
            <div
              :class="selectSubTitle==='中国深圳外轮代理有限公司'?'container-body-content-subTitleBox-subTitleCheck':'container-body-content-subTitleBox-subTitle'"
              @click="handleSelectSubTitle('中国深圳外轮代理有限公司')">
              <span :class="selectSubTitle==='中国深圳外轮代理有限公司'?'aClass1':'aClass2'">中国深圳外轮代理有限公司</span>
            </div>
            <div
              :class="selectSubTitle==='深圳市外代仓储有限公司'?'container-body-content-subTitleBox-subTitleCheck':'container-body-content-subTitleBox-subTitle'"
              @click="handleSelectSubTitle('深圳市外代仓储有限公司')">
              <span :class="selectSubTitle==='深圳市外代仓储有限公司'?'aClass1':'aClass2'">深圳市外代仓储有限公司</span>
            </div>
            <div
              :class="selectSubTitle==='深圳市外代国际货运有限公司'?'container-body-content-subTitleBox-subTitleCheck':'container-body-content-subTitleBox-subTitle'"
              @click="handleSelectSubTitle('深圳市外代国际货运有限公司')">
              <span :class="selectSubTitle==='深圳市外代国际货运有限公司'?'aClass1':'aClass2'">深圳市外代国际货运有限公司</span>
            </div>
            <div
              :class="selectSubTitle==='深圳市外代报关有限公司'?'container-body-content-subTitleBox-subTitleLastCheck':'container-body-content-subTitleBox-subTitleLast'"
              @click="handleSelectSubTitle('深圳市外代报关有限公司')">
              <span :class="selectSubTitle==='深圳市外代报关有限公司'?'aClass1':'aClass2'">深圳市外代报关有限公司</span>
            </div>
          </div>
          <!--行业组织——中国深圳外轮代理有限公司-->
          <div class="container-body-content-box1" v-if="selectSubTitle==='中国深圳外轮代理有限公司'">
            <el-row :gutter="80">


              <!--03—深圳市船舶代理学会会长单位-->
              <el-col :span="7">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox" @click="flag3=true" @mouseout="flag3=false">
                    <div>
                      <img
                        :class="flag3===true?'container-body-content-box1-body-titleBox-img animate__animated animate__wobble':'container-body-content-box1-body-titleBox-img'"
                        src="../../../assets/front/images/aboutUS-new/aboutUs-new-01.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">深圳市船舶代理学会会长单位</div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      海洋工程船舶和海工设备的海关暂进出报关手续。-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/index')" class="container-body-content-box1-body-wordBox-link">了解更多进入网站</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>

              <!--01—中国船舶代理及无船承运人协会会员-->
              <el-col :span="8">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox" @click="flag1=true" @mouseout="flag1=false">
                    <div>
                      <img
                        :class="flag1===true?'container-body-content-box1-body-titleBox-img animate__animated animate__wobble':'container-body-content-box1-body-titleBox-img'"
                        src="../../../assets/front/images/aboutUS-new/aboutUs-new-02.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">中国船舶代理及无船承运人协会会员</div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      从事货物进出口报关、报检、查验和传播服务。<br/>-->
                  <!--                      主要为客户办理进出口货物和进出境运输工具的报关。-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/index')" class="container-body-content-box1-body-wordBox-link">了解更多进入网站</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>

              <!--                &lt;!&ndash;02—深圳市报检企业协会副会长单位&ndash;&gt;-->
              <!--                <el-col :span="6">-->
              <!--                  <div class="container-body-content-box1-body">-->
              <!--                    <div class="container-body-content-box1-body-titleBox" @click="flag2=true" @mouseout="flag2=false">-->
              <!--                      <div>-->
              <!--                        <img-->
              <!--                          :class="flag2===true?'container-body-content-box1-body-titleBox-img animate__animated animate__wobble':'container-body-content-box1-body-titleBox-img'"-->
              <!--                          src="../../../assets/front/images/aboutUS-new/aboutUs-new-02.png" alt=""/>-->
              <!--                      </div>-->
              <!--                      <div class="container-body-content-box1-body-titleBox-title">深圳市报检企业协会副会长单位</div>-->
              <!--                    </div>-->
              <!--                    &lt;!&ndash;                  <div class="container-body-content-box1-body-wordBox">&ndash;&gt;-->
              <!--                    &lt;!&ndash;                    <div class="container-body-content-box1-body-wordBox-word">&ndash;&gt;-->
              <!--                    &lt;!&ndash;                      提供船舶修理、船用给养、备件供应、能源供应以及其他相关的船舶服务业务。&ndash;&gt;-->
              <!--                    &lt;!&ndash;                    </div>&ndash;&gt;-->
              <!--                    &lt;!&ndash;                    <div @click="goPage('#/index')" class="container-body-content-box1-body-wordBox-link">了解更多进入网站</div>&ndash;&gt;-->
              <!--                    &lt;!&ndash;                  </div>&ndash;&gt;-->
              <!--                  </div>-->
              <!--                </el-col>-->


              <!--04—深圳海运协会会员-->
              <el-col :span="7">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox" @click="flag4=true" @mouseout="flag4=false">
                    <div>
                      <img
                        :class="flag4===true?'container-body-content-box1-body-titleBox-img animate__animated animate__wobble':'container-body-content-box1-body-titleBox-img'"
                        src="../../../assets/front/images/aboutUS-new/aboutUs-new-03.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">深圳海运协会会员</div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      代理货物进出口报关：<br/>-->
                  <!--                      集装箱/钢材/铁矿/煤炭/粮食/设备/石油-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/index')" class="container-body-content-box1-body-wordBox-link">了解更多进入网站</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>
            </el-row>
          </div>

          <!--行业组织—深圳市外代仓储有限公司-->
          <div class="container-body-content-box1" v-if="selectSubTitle==='深圳市外代仓储有限公司'">
            <el-row :gutter="80">
              <!--01—深圳市进出口商会会员-->
              <el-col :span="6">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox" @click="flag5=true" @mouseout="flag5=false">
                    <div>
                      <img
                        :class="flag5===true?'container-body-content-box1-body-titleBox-img animate__animated animate__wobble':'container-body-content-box1-body-titleBox-img'"
                        src="../../../assets/front/images/aboutUS-new/aboutUs-new-01.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">深圳市进出口商会会员</div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      从事代理报关、报检、国际采购、分销、配送、装卸、搬运、集装箱拼装拆箱、清扫船舱、船员生活用品的清洗及消毒、船员对外技术服务等业务。-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/index')" class="container-body-content-box1-body-wordBox-link">了解更多进入网站</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>

              <!--02—深圳盐田区物流商会会员-->
              <el-col :span="6">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox" @click="flag6=true" @mouseout="flag6=false">
                    <div>
                      <img
                        :class="flag6===true?'container-body-content-box1-body-titleBox-img animate__animated animate__wobble':'container-body-content-box1-body-titleBox-img'"
                        src="../../../assets/front/images/aboutUS-new/aboutUs-new-02.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">深圳盐田区物流商会会员</div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      船舶物料、汽车零配件的购销，物业租赁及相关信息咨询和国内贸易。-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/index')" class="container-body-content-box1-body-wordBox-link">了解更多进入网站</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>

              <!--03—中国仓储协会会员-->
              <el-col :span="6">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox" @click="flag7=true" @mouseout="flag7=false">
                    <div>
                      <img
                        :class="flag7===true?'container-body-content-box1-body-titleBox-img animate__animated animate__wobble':'container-body-content-box1-body-titleBox-img'"
                        src="../../../assets/front/images/aboutUS-new/aboutUs-new-03.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">中国仓储协会会员</div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      仓储代理，经营进出口业务。-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/index')" class="container-body-content-box1-body-wordBox-link">了解更多进入网站</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>
            </el-row>
          </div>

          <!--行业组织—深圳市外代国际货运有限公司-->
          <div class="container-body-content-box1" v-if="selectSubTitle==='深圳市外代国际货运有限公司'">
            <el-row>
              <!--01—深圳市国际货运代理协会副会长单位-->
              <el-col :span="24">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox" @click="flag8=true" @mouseout="flag8=false">
                    <div>
                      <img
                        :class="flag8===true?'container-body-content-box1-body-titleBox-img animate__animated animate__wobble':'container-body-content-box1-body-titleBox-img'"
                        src="../../../assets/front/images/aboutUS-new/aboutUs-new-01.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">深圳市国际货运代理协会副会长单位</div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      为客户提供海运、空运、报关、内陆运输、仓储等全面的服务。-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage2('http://www.penavicocargo.com/china/index.jsp')"-->
                  <!--                         class="container-body-content-box1-body-wordBox-link">了解更多进入网站-->
                  <!--                    </div>-->
                  <!--                  </div>-->
                </div>
              </el-col>
            </el-row>
          </div>

          <!--行业组织—深圳市外代报关有限公司-->
          <div class="container-body-content-box1" v-if="selectSubTitle==='深圳市外代报关有限公司'">
            <el-row :gutter="80">
              <!--01—深圳市进出口商会会员-->
              <el-col :span="6">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox" @click="flag9=true" @mouseout="flag9=false">
                    <div>
                      <img
                        :class="flag9===true?'container-body-content-box1-body-titleBox-img animate__animated animate__wobble':'container-body-content-box1-body-titleBox-img'"
                        src="../../../assets/front/images/aboutUS-new/aboutUs-new-01.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">深圳市进出口商会会员</div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      从事代理报关、报检、国际采购、分销、配送、装卸、搬运、集装箱拼装拆箱、清扫船舱、船员生活用品的清洗及消毒、船员对外技术服务等业务。-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/index')" class="container-body-content-box1-body-wordBox-link">了解更多进入网站</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>
              <!--02—广东深圳报关协会会员-->
              <el-col :span="6">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox" @click="flag10=true"
                       @mouseout="flag10=false">
                    <div>
                      <img
                        :class="flag10===true?'container-body-content-box1-body-titleBox-img animate__animated animate__wobble':'container-body-content-box1-body-titleBox-img'"
                        src="../../../assets/front/images/aboutUS-new/aboutUs-new-02.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">广东深圳报关协会会员</div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      船舶物料、汽车零配件的购销，物业租赁及相关信息咨询和国内贸易。-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/index')" class="container-body-content-box1-body-wordBox-link">了解更多进入网站</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>
            </el-row>
          </div>
        </div>
      </div>

      <!--关于我们—公司荣誉-->
      <!--      <div v-if="selectTitle==='公司荣誉'">-->
      <!--        <div class="container-body-content3">-->
      <!--          <div-->
      <!--            :class="honourFlag===true?'container-body-content3-title animate__animated animate__shakeX':'container-body-content3-title'"-->
      <!--            @click="honourFlag=true" @mouseout="honourFlag=false">公司荣誉-->
      <!--          </div>-->
      <!--          <el-row :gutter="100">-->
      <!--            <el-col style="width: 50%;">-->
      <!--              <div class="container-body-content3-left">-->
      <!--                <div class="container-body-content3-left-box">-->
      <!--                  <div class="container-body-content3-left-box-title">2019</div>-->
      <!--                  <div class="container-body-content3-left-box-blankBox"></div>-->
      <!--                  <img class="container-body-content3-left-box-circle1" src="../../../assets/front/icon/circle-1.png"-->
      <!--                       alt=""/>-->
      <!--                  <img class="container-body-content3-left-box-circle2" src="../../../assets/front/icon/circle-1.png"-->
      <!--                       alt=""/>-->
      <!--                  <div class="container-body-content3-left-box-word">-->
      <!--                    2019年，招商局集团利润总额、净利润和总资产在央企中均排名第一。-->
      <!--                  </div>-->
      <!--                  <div class="container-body-content3-left-box-word">-->
      <!--                    2019年发布的《财富》世界500强榜单中。-->
      <!--                  </div>-->
      <!--                  <div class="container-body-content3-left-box-imgBox">-->
      <!--                    <img class="container-body-content3-left-box-imgBox-img"-->
      <!--                         src="../../../assets/front/images/homepage/newPic1.png" alt=""/>-->
      <!--                  </div>-->
      <!--                </div>-->
      <!--              </div>-->
      <!--              <div class="container-body-content3-left">-->
      <!--                <div class="container-body-content3-left-box">-->
      <!--                  <div class="container-body-content3-left-box-title">2019</div>-->
      <!--                  <div class="container-body-content3-left-box-word">-->
      <!--                    2019年，招商局集团利润总额、净利润和总资产在央企中均排名第一。-->
      <!--                  </div>-->
      <!--                  <div class="container-body-content3-left-box-word">-->
      <!--                    2019年发布的《财富》世界500强榜单中。-->
      <!--                  </div>-->
      <!--                  <div class="container-body-content3-left-box-imgBox">-->
      <!--                    <img class="container-body-content3-left-box-imgBox-img"-->
      <!--                         src="../../../assets/front/images/homepage/newPic1.png" alt=""/>-->
      <!--                  </div>-->
      <!--                </div>-->
      <!--              </div>-->
      <!--            </el-col>-->
      <!--            <el-col style="width: 50%;margin-top: 70px">-->
      <!--              <div class="container-body-content3-right">-->
      <!--                <div class="container-body-content3-right-box">-->
      <!--                  <div class="container-body-content3-right-box-title">2019</div>-->
      <!--                  <div class="container-body-content3-right-box-blankBox"></div>-->
      <!--                  <img class="container-body-content3-right-box-circle1" src="../../../assets/front/icon/circle-1.png"-->
      <!--                       alt=""/>-->
      <!--                  <img class="container-body-content3-right-box-circle2" src="../../../assets/front/icon/circle-1.png"-->
      <!--                       alt=""/>-->
      <!--                  <div class="container-body-content3-right-box-word">-->
      <!--                    2019年，招商局集团利润总额、净利润和总资产在央企中均排名第一。-->
      <!--                  </div>-->
      <!--                  <div class="container-body-content3-right-box-word">-->
      <!--                    2019年发布的《财富》世界500强榜单中。-->
      <!--                  </div>-->
      <!--                  <div class="container-body-content3-right-box-imgBox">-->
      <!--                    <img class="container-body-content3-right-box-imgBox-img"-->
      <!--                         src="../../../assets/front/images/homepage/newPic1.png" alt=""/>-->
      <!--                  </div>-->
      <!--                </div>-->
      <!--              </div>-->
      <!--              <div class="container-body-content3-right">-->
      <!--                <div class="container-body-content3-right-box">-->
      <!--                  <div class="container-body-content3-right-box-title">2019</div>-->
      <!--                  <div class="container-body-content3-right-box-word">-->
      <!--                    2019年，招商局集团利润总额、净利润和总资产在央企中均排名第一。-->
      <!--                  </div>-->
      <!--                  <div class="container-body-content3-right-box-word">-->
      <!--                    2019年发布的《财富》世界500强榜单中。-->
      <!--                  </div>-->
      <!--                  <div class="container-body-content3-right-box-imgBox">-->
      <!--                    <img class="container-body-content3-right-box-imgBox-img"-->
      <!--                         src="../../../assets/front/images/homepage/newPic1.png" alt=""/>-->
      <!--                  </div>-->
      <!--                </div>-->
      <!--              </div>-->
      <!--            </el-col>-->
      <!--          </el-row>-->
      <!--        </div>-->
      <!--      </div>-->
      <div v-if="selectTitle==='公司荣誉'">
        <div class="container-body-content">
          <div
            :class="honourFlag===true?'container-body-content-title animate__animated animate__shakeX':'container-body-content-title'"
            @click="honourFlag=true" @mouseout="honourFlag=false">公司荣誉
          </div>
          <el-row>
            <el-col :span="24">
              <img class="container-body-content-certification"
                   src="../../../assets/front/images/aboutUS-new/公司荣誉图.png" alt=""/>
            </el-col>
          </el-row>
        </div>
      </div>


      <!--关于我们—公司资质-->
      <div v-if="selectTitle==='公司资质'">
        <div class="container-body-content">
          <div
            :class="certificationsFlag===true?'container-body-content-title animate__animated animate__shakeX':'container-body-content-title'"
            @click="certificationsFlag=true" @mouseout="certificationsFlag=false">资质证书
          </div>
          <el-row>
            <el-col :span="24">
              <img class="container-body-content-certification"
                   src="../../../assets/front/images/aboutUS-new/certification.png" alt=""/>
            </el-col>
          </el-row>
        </div>
      </div>

      <!--关于我们—客户介绍-->
      <div v-if="selectTitle==='客户介绍'">
        <div class="container-body-content4">
          <div
            :class="partnerFlag===true?'container-body-content-title animate__animated animate__shakeX':'container-body-content-title'"
            @click="partnerFlag=true" @mouseout="partnerFlag=false">合作伙伴
          </div>
          <!--<div class="container-body-content4-word">与我们合作多年，相互信任的客户伙伴，我们也用专业的态度以及服务完成客户的托付。</div>-->
          <div class="container-body-content4-box">
            <el-row>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/23@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/31@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/25@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/29@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col" style="border-right: 1px solid #F0F0F0">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/26@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
            <el-row>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/27@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/28@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/80@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/32@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col" style="border-right: 1px solid #F0F0F0">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/33@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
            <el-row>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/82@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/24@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/30@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/81@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col" style="border-right: 1px solid #F0F0F0;">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/15@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
            <el-row>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/16@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/17@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/18@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/19@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col" style="border-right: 1px solid #F0F0F0;">
                <div class="container-body-content4-box-col-imgBox">
                  <img class="container-body-content4-box-col-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/20@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
            <el-row>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/21@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/22@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/1@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/14@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1" style="border-right: 1px solid #F0F0F0">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/2@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
            <el-row>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/6@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/7@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/8@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/9@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1" style="border-right: 1px solid #F0F0F0">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/10@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
            <el-row>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/11@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/12@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/13@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/34@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1" style="border-right: 1px solid #F0F0F0">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/35@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
            <el-row>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/36@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/38@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/39@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/40@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1" style="border-right: 1px solid #F0F0F0">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/41@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
            <el-row>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/42@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/43@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/44@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/45@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1" style="border-right: 1px solid #F0F0F0">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/48@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
            <el-row>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/50@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/51@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/52@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/53@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1" style="border-right: 1px solid #F0F0F0">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/54@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
            <el-row>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/55@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/56@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/57@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/58@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1" style="border-right: 1px solid #F0F0F0">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/59@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
            <el-row>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/60@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/61@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/62@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/63@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1" style="border-right: 1px solid #F0F0F0">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/64@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
            <el-row>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/65@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/66@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/67@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/68@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1" style="border-right: 1px solid #F0F0F0">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/69@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
            <el-row>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/70@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/71@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/72@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/73@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1" style="border-right: 1px solid #F0F0F0">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/74@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
            <el-row>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/75@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/76@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/77@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1" style="border-bottom: 1px solid #F0F0F0;">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/78@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1"
                      style="border-right: 1px solid #F0F0F0;border-bottom: 1px solid #F0F0F0;">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/79@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
            <el-row>
              <el-col class="container-body-content4-box-col1" style="border-bottom: 1px solid #F0F0F0;">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/3@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1" style="border-bottom: 1px solid #F0F0F0;">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/4@2x.png" alt=""/>
                </div>
              </el-col>
              <el-col class="container-body-content4-box-col1"
                      style="border-right: 1px solid #F0F0F0;border-bottom: 1px solid #F0F0F0;">
                <div class="container-body-content4-box-col1-imgBox">
                  <img class="container-body-content4-box-col1-imgBox-img"
                       src="../../../assets/front/images/aboutUS-new/5@2x.png" alt=""/>
                </div>
              </el-col>
            </el-row>
          </div>
          <!--<div class="container-body-content4-title2">深圳外轮代理有限公司牵手华夏基金　全面深化货运领域合作</div>-->
          <!--<div class="container-body-content4-word2">-->
          <!--深圳外代与华夏基金签署合作协议，全面深化资管科技领域合作。双方联合携手打造企业级大数据平台，提升数据整合及开放能力，满足市场资产定价及风险相关的数据需求，提升金融数据挖掘、人工智能应用的效率。<br/>-->
          <!--深圳外代和华夏基金还在资产组合管理、风险管理、投资研究、客户服务等方面开展全方位合作，增强新技术在基金行业中的更多应用，推动科技与资管业务的深度融合，提升彼此的竞争力。</div>-->
        </div>
      </div>
    </div>

    <!--页尾模块-->
    <Footer></Footer>

  </div>
</template>

<script>
  import Header from '@/views/public/header/header'  //引入页头组件
  import Footer from '@/views/public/footer/footer'  //引入页尾组件
  export default {
    name: 'about-us',
    components: {Footer, Header},
    data() {
      return {
        partnerFlag: false,//点击合作伙伴出现动效
        certificationsFlag: false,//点击资质证书出现动效
        flag1: false,//点击行业组织的内容出现动效
        flag2: false,
        flag3: false,
        flag4: false,
        flag5: false,
        flag6: false,
        flag7: false,
        flag8: false,
        flag9: false,
        flag10: false,
        organizeFlag: false, //点击行业组织标题出现动效
        honourFlag: false,//点击公司荣誉出现标题
        activeIndex: '2',//当前页面为关于我们
        selectTitle: '董事长致辞', //默认打开关于我们页面显示董事长致辞模块
        selectSubTitle: '中国深圳外轮代理有限公司'//默认打开行业组织显示中国深圳外轮代理有限公司模块
      }
    },
    created() {
      // 如果不是根据 #/serviceArea?selectItem=''这种链接传来的话，默认显示内容为董事长致辞
      if (this.$route.query.selectItem !== undefined) {
        this.selectTitle = this.$route.query.selectItem
      } else {
        this.selectTitle = '董事长致辞'
      }
    },
    // 监听路由变化时，页面跳转
    watch: {
      '$route'(to) {
        if (to.query.selectItem !== undefined) {
          this.selectTitle = to.query.selectItem
          to.query.selectItem = undefined
        } else {
          this.selectTitle = '董事长致辞'
        }
      }
    },
    methods: {
      // 关于我们菜单选择栏
      handleSelectTitle(item) {
        this.selectTitle = item
        if (this.selectTitle === '行业组织') {
          this.selectSubTitle = '中国深圳外轮代理有限公司'
        }
      },
      // 行业组织选择栏
      handleSelectSubTitle(item) {
        this.selectSubTitle = item
      },
      // 以本窗口打开到新页面
      goPage(url) {
        window.open(url, '_self')
      },
      //以新窗口打开行业组织中的了解详情
      goPage2(url) {
        window.open(url, '_blank')
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .aClass1 {
    cursor: pointer;
  }

  .aClass2:hover {
    color: #538ED9;
    cursor: pointer;
  }

  .container {
    min-width: 1300px;

    a:hover {
      color: #538ED9;
    }

    /*导航栏样式*/
    &-nav {
      padding: 10px 8% 10px 8%;

      .el-menu-item:hover {
        color: #538ED9;
      }
    }

    /*banner样式*/
    &-banner {
      width: 100%;
      background-size: 100% auto;
      height: 0;
      padding-top: 18.75%;
      background-image: url("../../../assets/front/images/aboutUS-new/aboutUs-banner-new.png");

      &-title {
        font-family: FZZCHJW--GB1-0, sans-serif;
        font-size: 72px;
        color: #FFFFFF;
        letter-spacing: 70px;
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
      &-box {
        padding: 0 8%;

        &-title {
          height: 60px;
          background: #FFFFFF;
          font-size: 18px;
          font-family: PingFangSC-Regular, sans-serif;
          font-weight: 400;
          color: #3B3F47;
          text-align: center;
          line-height: 60px;
        }

        &-title-check {
          height: 60px;
          background: #3281E4;
          font-size: 18px;
          font-family: PingFangSC-Semibold, sans-serif;
          font-weight: 600;
          color: #FFFFFF;
          line-height: 60px;
          text-align: center;
        }
      }

      &-content {
        box-shadow: -2px 4px 5px 0px #f2f2f2 inset;
        width: 100%;
        padding: 50px 8% 100px 8%;

        &-box {
          padding: 5% 5% 100px 5%;
          height: 100%;
          background: #F6F7FA;


          &-col1 {
            width: 20%;
            margin-right: 5%;
            margin-top: 33px;
            margin-bottom: 34px;

            img {
              width: 100%;
            }
          }

          &-col2 {
            width: 61px;

            &-title {
              text-align: center;
              font-size: 26px;
              font-family: PingFangSC-Semibold, sans-serif;
              font-weight: 600;
              color: #3B3F47;
              border-bottom: 3px solid #3281E4;
              margin-top: 5%;
            }
          }

          &-col3 {
            width: 93%;
            padding-left: 2%;

            &-position {
              font-size: 18px;
              font-family: PingFangSC-Semibold, sans-serif;
              font-weight: 600;
              color: #3B3F47;
              height: 100px;
              line-height: 100px;
            }

            &-content {
              margin-top: -21px;
              font-size: 16px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #333;
              line-height: 30px;


              &-textBox {
                float: right;

                &-text {
                  font-size: 18px;
                  font-family: PingFangSC-Semibold, sans-serif;
                  font-weight: 600;
                  color: #3B3F47;
                  margin-top: -10px;
                }

                &-text1 {
                  margin-top: 30px;
                  font-size: 18px;
                  font-family: PingFangSC-Semibold, sans-serif;
                  font-weight: 600;
                  color: #3B3F47;
                  text-align: right;
                }
              }

              &-img {
                float: right;
                width: 80px;
                margin-bottom: 30px;
              }
            }
          }


        }

        &-title {
          font-size: 26px;
          font-family: PingFangSC-Semibold, sans-serif;
          font-weight: 600;
          color: #3B3F47;
          margin-bottom: 20px;
        }

        &-title:hover {
          cursor: pointer;
        }

        &-certification {
          width: 100%;
          display: inline-block;

        }

        &-word {
          font-size: 16px;
          font-family: PingFangSC-Regular, sans-serif;
          font-weight: 400;
          color: #888888;
          margin-bottom: 30px;
        }

        &-subTitleBox {
          /*padding-left: 34px;*/
          height: 60px;
          border-bottom: 1px solid #E8E9EA;

          &-subTitleCheck {
            height: 60px;
            display: inline-block;
            font-size: 17px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #3281E4;
            margin-right: 7%;
            line-height: 60px;
            border-bottom: 3px solid #3281E4;
          }

          &-subTitleLastCheck {
            height: 60px;
            display: inline-block;
            font-size: 17px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #3281E4;
            line-height: 60px;
            border-bottom: 3px solid #3281E4;
          }

          &-subTitle {
            height: 60px;
            display: inline-block;
            font-size: 17px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #3B3F47;
            margin-right: 7%;
            line-height: 60px;
          }

          &-subTitleLast {
            height: 60px;
            display: inline-block;
            font-size: 17px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #3B3F47;
            line-height: 60px;
          }
        }

        &-body {
          position: relative;

          &-word {
            position: absolute;
            top: 0;
            left: 0;

            &-word1 {
              width: 100%;
              font-size: 16px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #333;
              line-height: 30px;
              margin-top: 10px;
            }

            &-word2 {
              margin-top: 20px;
              width: 100%;
              font-size: 16px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #333;
              line-height: 30px;
            }

            &-word3 {
              margin-top: 20px;
              width: 80%;
              font-size: 16px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #333;
              line-height: 30px;
            }
          }

          &-img {
            width: 100%;
          }
        }

        &-box1 {
          width: 100%;
          margin-top: 50px;

          &-body:hover {
            cursor: pointer;
          }

          &-body {
            width: 100%;

            &-titleBox {
              position: relative;
              width: 100%;
              height: 65px;

              &-img {
                width: 65px;
                height: 65px;
              }

              &-title {
                font-size: 20px;
                font-family: PingFangSC-Semibold, sans-serif;
                font-weight: 600;
                color: #3B3F47;
                position: absolute;
                top: 65px;
                margin-top: -25px;
                left: 0;
                letter-spacing: 3px;
              }

              &-img1 {
                width: 65px;
                height: 65px;
              }

              &-title1 {
                font-size: 22px;
                font-family: PingFangSC-Semibold, sans-serif;
                font-weight: 600;
                color: #3B3F47;
                position: absolute;
                top: 65px;
                margin-top: -25px;
                left: 0;
              }

            }

            &-wordBox {
              margin-top: 40px;
              width: 80%;

              &-word {
                font-size: 15px;
                font-family: PingFangSC-Regular, sans-serif;
                font-weight: 400;
                color: #3B3F47;
              }

              &-link {
                padding-right: 25px;
                background-position: right center;
                display: inline-block;
                height: 25px;
                background-repeat: no-repeat;
                background-size: 22px 22px;
                background-image: url('../../../assets/front/images/aboutUS-new/triangle_right.png');
                font-size: 15px;
                font-family: PingFangSC-Regular, sans-serif;
                font-weight: 400;
                color: #3281E4;
                line-height: 25px;
                margin-top: 12px;
              }

              &-link:hover {
                cursor: pointer;
              }
            }

          }
        }

      }

      &-content2 {
        box-shadow: -2px 4px 5px 0px #f2f2f2 inset;
        width: 100%;
        padding: 70px 8% 120px 8%;

        &-box {
          position: relative;
          width: 100%;
          height: 500px;

          &-img {
            width: 680px;
            height: 500px;
            display: inline-block;
            position: absolute;
            top: 0;
            left: 50%;
            margin-left: -340px;
          }
        }
      }

      &-content3 {

        box-shadow: -2px 4px 5px 0px #f2f2f2 inset;
        width: 100%;
        padding: 50px 14% 100px 14%;

        &-title {
          font-size: 26px;
          font-family: PingFangSC-Semibold, sans-serif;
          font-weight: 600;
          color: #3B3F47;
          margin-bottom: 40px;
        }

        &-title:hover {
          cursor: pointer;
        }

        &-right {
          margin-bottom: 30px;

          &-box {
            position: relative;
            width: 100%;
            background: #FFFFFF;
            border-radius: 4px;
            padding: 30px;
            box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.1);

            &-title {
              font-family: PingFangSC-Semibold, sans-serif;
              font-weight: 600;
              font-size: 22px;
              color: #373D42;
              float: left;
              margin-bottom: 20px;
            }

            &-word {
              clear: both;
              float: left;
              font-size: 15px;
              color: #373D42;
              font-family: PingFangSC-Regular, sans-serif;
              margin-bottom: 20px;
            }

            &-imgBox {
              width: 100%;
              overflow: hidden;

              &-img {
                transition: all 0.7s;
                width: 100%;
                display: inline-block;
              }

              &-img:hover {
                transform: scale(1.2);
                cursor: pointer;
              }
            }

            &-blankBox {
              margin-right: -2px;
              height: 110%;
              width: 50px;
              border-top: 2px solid #F2F2F2;
              border-bottom: 2px solid #F2F2F2;
              border-left: 2px solid #F2F2F2;
              position: absolute;
              top: 20px;
              left: 0;
              margin-left: -50px;
            }

            &-circle1 {
              display: inline-block;
              width: 18px;
              height: 18px;
              position: absolute;
              top: 20px;
              margin-top: -9px;
              left: 0;
              margin-left: -58px;
            }

            &-circle2 {
              display: inline-block;
              width: 18px;
              height: 18px;
              position: absolute;
              top: 110%;
              margin-top: 9px;
              left: 0;
              margin-left: -58px;

            }
          }
        }

        &-left {
          margin-bottom: 30px;

          &-box {
            position: relative;
            width: 100%;
            background: #FFFFFF;
            border-radius: 4px;
            padding: 30px;
            box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.1);

            &-title {
              font-family: PingFangSC-Semibold, sans-serif;
              font-weight: 600;
              font-size: 22px;
              color: #373D42;
              float: right;
              margin-bottom: 20px;
            }

            &-word {
              clear: both;
              float: right;
              font-size: 15px;
              color: #373D42;
              font-family: PingFangSC-Regular, sans-serif;
              margin-bottom: 20px;
            }

            &-imgBox {
              width: 100%;
              overflow: hidden;

              &-img {
                width: 100%;
                display: inline-block;
                transition: all 0.7s;
              }

              &-img:hover {
                transform: scale(1.2);
                cursor: pointer;
              }
            }

            &-blankBox {
              height: 110%;
              width: 50px;
              border-top: 2px solid #F2F2F2;
              border-bottom: 2px solid #F2F2F2;
              border-right: 2px solid #F2F2F2;
              position: absolute;
              top: 20px;
              right: 0;
              margin-right: -52px;
            }

            &-circle1 {
              display: inline-block;
              width: 24px;
              height: 24px;
              position: absolute;
              top: 20px;
              margin-top: -11px;
              right: 0;
              margin-right: -62px;
            }

            &-circle2 {
              display: inline-block;
              width: 24px;
              height: 24px;
              position: absolute;
              top: 110%;
              margin-top: 8px;
              right: 0;
              margin-right: -62px;
              z-index: 10;
            }
          }
        }

      }

      &-content4 {
        box-shadow: -2px 4px 5px 0px #f2f2f2 inset;
        width: 100%;
        padding: 50px 8% 120px 8%;

        &-title {
          font-size: 26px;
          font-family: PingFangSC-Semibold, sans-serif;
          font-weight: 600;
          color: #3B3F47;
          margin-bottom: 38px;
        }

        &-word {
          font-size: 16px;
          font-family: PingFangSC-Regular, sans-serif;
          font-weight: 400;
          color: #888888;
          margin-bottom: 30px;
        }

        &-box {
          margin-bottom: 45px;

          &-col:hover {
            position: relative;
            cursor: pointer;
            background: #FFFFFF;
            box-shadow: 0 2px 10px 0 rgba(39, 122, 227, 0.2);
            border: 1px solid #277AE3 !important;
          }

          &-col:hover .container-body-content4-box-col-imgBox-img {
            transform: scale(1.2);
          }

          &-col1:hover {
            position: relative;
            cursor: pointer;
            background: #FFFFFF;
            box-shadow: 0 2px 10px 0 rgba(39, 122, 227, 0.2);
            border: 1px solid #277AE3 !important;
          }

          &-col1:hover .container-body-content4-box-col1-imgBox-img {
            transform: scale(1.2);
          }

          &-col {
            width: 20%;
            height: 140px;
            background: #FFFFFF;
            border-top: 1px solid #F0F0F0;
            border-left: 1px solid #F0F0F0;
            position: relative;

            &-imgBox {
              position: absolute;
              top: 50%;
              margin-top: -33px;
              left: 50%;
              margin-left: -76px;
              height: 66px;
              width: 152px;
              display: inline-block;

              &-img {
                display: block;
                width: 150px;
                height: 64px;
                transition: all 0.7s;
              }
            }

          }

          &-col1 {
            width: 20%;
            height: 140px;
            background: #FFFFFF;
            border-top: 1px solid #F0F0F0;
            border-left: 1px solid #F0F0F0;
            position: relative;

            &-imgBox {
              position: absolute;
              top: 50%;
              margin-top: -33px;
              left: 50%;
              margin-left: -76px;
              height: 66px;
              width: 152px;
              display: inline-block;

              &-img {
                display: block;
                width: 150px;
                height: 64px;
                transition: all 0.7s;
              }
            }
          }
        }

        &-title2 {
          font-family: PingFangSC-Regular, sans-serif;
          font-size: 24px;
          color: #3B3F47;
          line-height: 20px;
          margin-bottom: 25px;
        }

        &-word2 {
          width: 70%;
          font-family: PingFangSC-Regular, sans-serif;
          font-size: 16px;
          color: #888888;
          line-height: 24px;
        }
      }
    }
  }
  @media screen and (max-width: 1500px){
      .container-body-content-body-word-word1 {
        line-height: 29px;
        font-size: 15px;
      }
      .container-body-content-body-word-word2 {
        line-height: 29px;
        font-size: 15px;
        margin-top: 10px;
      }
      .container-body-content-body-word-word3 {
        line-height: 29px;
        font-size: 15px;
        margin-top: 10px;
      }
  }

  @media screen and (max-width: 1370px){
    .container-body-content-body-word-word1 {
      line-height: 27px;
      font-size: 15px;
    }
    .container-body-content-body-word-word2 {
      line-height: 27px;
      font-size: 15px;
      margin-top: 10px;
    }
    .container-body-content-body-word-word3 {
      line-height: 27px;
      font-size: 15px;
      margin-top: 10px;
    }
  }

  /*@media screen and (max-width: 1600px) {*/
  /*  .container-body-content-body-img {*/
  /*    !*height: 725px;*!*/
  /*  }*/
  /*  .container-body-content-body-word-word1 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*  }*/
  /*  .container-body-content-body-word-word2 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*    margin-top: 10px;*/
  /*  }*/
  /*  .container-body-content-body-word-word3 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*    margin-top: 10px;*/
  /*  }*/
  /*}*/

  /*@media screen and (max-width: 1500px) {*/

  /*  .container-body-content-body-img {*/
  /*    !*height: 750px;*!*/
  /*  }*/
  /*  .container-body-content-body-word-word1 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*  }*/
  /*  .container-body-content-body-word-word2 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*    margin-top: 10px;*/
  /*  }*/
  /*  .container-body-content-body-word-word3 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*    margin-top: 10px;*/
  /*  }*/
  /*}*/

  /*@media screen and (max-width: 1470px) {*/

  /*  .container-body-content-body-img {*/
  /*    height: 672px;*/
  /*  }*/
  /*  .container-body-content-body-word-word1 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*  }*/
  /*  .container-body-content-body-word-word2 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*    margin-top: 10px;*/
  /*  }*/
  /*  .container-body-content-body-word-word3 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*    margin-top: 10px;*/
  /*  }*/
  /*}*/

  /*@media screen and (max-width: 1431px) {*/

  /*  .container-body-content-body-img {*/
  /*    height: 672px;*/
  /*  }*/
  /*  .container-body-content-body-word-word1 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*  }*/
  /*  .container-body-content-body-word-word2 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*    margin-top: 10px;*/
  /*  }*/
  /*  .container-body-content-body-word-word3 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*    margin-top: 10px;*/
  /*  }*/
  /*}*/
  /*@media screen and (max-width: 1412px) {*/
  /*  .container-body-content-body-img {*/
  /*    height: 690px;*/
  /*  }*/
  /*  .container-body-content-body-word-word1 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*  }*/
  /*  .container-body-content-body-word-word2 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*    margin-top: 10px;*/
  /*  }*/
  /*  .container-body-content-body-word-word3 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*    margin-top: 10px;*/
  /*  }*/
  /*}*/
  /*@media screen and (max-width: 1350px) {*/
  /*  .container-body-content-body-img {*/
  /*    height: 700px;*/
  /*  }*/
  /*  .container-body-content-body-word-word1 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*  }*/
  /*  .container-body-content-body-word-word2 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*    margin-top: 10px;*/
  /*  }*/
  /*  .container-body-content-body-word-word3 {*/
  /*    line-height: 29px;*/
  /*    font-size: 15px;*/
  /*    margin-top: 10px;*/
  /*  }*/
  /*}*/

  @media screen and (max-width:1343px) {
    .container-body-content-box1-body-titleBox-title {
      font-size: 19px;
    }
  }
</style>
