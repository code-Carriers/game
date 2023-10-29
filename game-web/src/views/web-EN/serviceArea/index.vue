<template>
  <div class="container">
    <!--导航栏模块-->
    <Header :active-index="activeIndex"></Header>

    <!--横幅banner模块-->
    <div class="container-banner">
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-title animate__animated animate__bounceInDown">SCOPE OF SERVICES</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-content animate__animated animate__bounceInDown">服务范围</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
    </div>

    <!--服务范围内容模块-->
    <div class="container-body">
      <!--服务范围选择标题栏-->
      <el-row class="container-body-row">
        <el-col :class="selectItem==='船舶代理'?'container-body-row-box-check':'container-body-row-box'">
          <span :class="selectItem==='船舶代理'?'aClass1':'aClass2'"
                @click="handleSelectMenu('船舶代理')">Shipping Agency Business</span>
        </el-col>

        <el-col :class="selectItem==='国际货运'?'container-body-row-box-check':'container-body-row-box'">
          <span :class="selectItem==='国际货运'?'aClass1':'aClass2'"
                @click="handleSelectMenu('国际货运')">Cargo Forwarding</span>
        </el-col>

        <el-col :class="selectItem==='报税仓储'?'container-body-row-box-check':'container-body-row-box'">
          <span :class="selectItem==='报税仓储'?'aClass1':'aClass2'"
                @click="handleSelectMenu('报税仓储')">Qianhai Bonded Warehouse</span>
        </el-col>

        <el-col :class="selectItem==='报关报检'?'container-body-row-box-check':'container-body-row-box'">
          <span :class="selectItem==='报关报检'?'aClass1':'aClass2'" @click="handleSelectMenu('报关报检')">Cargo Customs Clearance</span>
        </el-col>

        <el-col :class="selectItem==='招商邮服'?'container-body-row-box-check':'container-body-row-box'">
          <span :class="selectItem==='招商邮服'?'aClass1':'aClass2'"
                @click="handleSelectMenu('招商邮服')">Cruise Business</span>
        </el-col>
      </el-row>

      <!--船舶代理模块-->
      <el-row class="container-body-content" v-if="selectItem==='船舶代理'">
        <!--船舶代理左边标题选择栏-->
        <el-col class="container-body-content-box">
          <div class="container-body-content-box-left">
            <div class="container-body-content-box-left-title">
              <span class="container-body-content-box-left-title-content">Shipping Agency</span>
              <span class="container-body-content-box-left-title-line"></span>
            </div>

            <div
              :class="selectSubItem==='班轮及非班轮'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem==='班轮及非班轮'?'aClass1':'aClass2'" @click="handleSelectSubTitle('班轮及非班轮')">
                Liner And non-Liner
              </div>
            </div>

            <div
              :class="selectSubItem==='总代理'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem==='总代理'?'aClass1':'aClass2'" @click="handleSelectSubTitle('总代理')">General
                Agent
              </div>
            </div>

            <div
              :class="selectSubItem==='修船'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem==='修船'?'aClass1':'aClass2'" @click="handleSelectSubTitle('修船')">Ship Repair
              </div>
            </div>

            <div
              :class="selectSubItem==='海洋工程'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem==='海洋工程'?'aClass1':'aClass2'" @click="handleSelectSubTitle('海洋工程')">Marine
                Engineering
              </div>
            </div>

            <!--            <div-->
            <!--              :class="selectSubItem==='驳运'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">-->
            <!--              <div :class="selectSubItem==='驳运'?'aClass1':'aClass2'" @click="handleSelectSubTitle('驳运')">Lighter</div>-->
            <!--            </div>-->

            <div
              :class="selectSubItem==='联系我们'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem==='联系我们'?'aClass1':'aClass2'" @click="handleSelectSubTitle('联系我们')">Contact
                Us
              </div>
            </div>
          </div>

        </el-col>
        <!--船舶代理——班轮及非班轮内容描述-->
        <el-col class="container-body-content-boxBig" v-if="selectSubItem==='班轮及非班轮'">
          <el-row :gutter="50">
            <!--船舶代理——班轮及非班轮内容描述-->
            <el-col class="container-body-content-boxBig-boxNew2" v-if="selectSubItem==='班轮及非班轮'">
              <div class="container-body-content-boxBig-boxNew2-center">
                <div class="container-body-content-boxBig-boxNew2-center-title">Liner And non-Liner</div>
                <div class="container-body-content-boxBig-boxNew2-center-content">
                  <div class="container-body-content-boxBig-boxNew2-center-content-title1">
                    Acting For The Goods
                  </div>
                  <div class="container-body-content-boxBig-boxNew2-center-content-substance1">
                    container、steel、iron ore、grain、fertilizer、oil、chemical、equipment、logs
                  </div>
                  <div class="container-body-content-boxBig-boxNew2-center-content-title2">
                    Service Provided
                  </div>
                  <div class="container-body-content-boxBig-boxNew2-center-content-substance2">
                    1、 Handle the port declaration and approval procedures for ships entering and leaving the port,
                    contact
                    and arrange piloting, berths, loading and unloading, etc.;<br/>
                    2、Acting for container management operations of the shipping company; signing bills of lading,
                    transportation contracts, and agent booking business;<br/>
                    3、Import and export cabins Declaration; Declare import and export manifests to customs, national
                    inspection and other port units; handle import bill of lading procedures;<br/>
                    4、handle customs procedures for changing ship names and voyages for export goods;<br/>
                    5、declaration of dangerous goods;<br/>
                    6、freight collection and agency Settlement;<br/>
                    7、Arrange for ship inspection and repair; arrange for fresh water, purchase and transfer of ship
                    spare
                    parts, charts, etc.;<br/>
                    8、Arrange for crew medical treatment and repatriation;<br/>
                    9、Arrange for maritime treatment.<br/>
                  </div>
                </div>
              </div>
            </el-col>
            <!-- 船舶代理——驳运内容描述-->
            <el-col class="container-body-content-boxBig-boxNew" v-if="selectSubItem==='班轮及非班轮'">
              <div class="container-body-content-boxBig-boxNew-center">
                <div class="container-body-content-boxBig-boxNew-center-title">Barge</div>
                <div class="container-body-content-boxBig-boxNew-center-content">
                  <div class="container-body-content-boxBig-boxNew-center-content-title1">
                    Agent Goods
                  </div>
                  <div class="container-body-content-boxBig-boxNew-center-content-substance1">
                    containers, steel, edible oil, machinery and equipment, yacht trading, yacht exhibition
                  </div>
                  <div class="container-body-content-boxBig-boxNew-center-content-title2">
                    Service Provided
                  </div>
                  <div class="container-body-content-boxBig-boxNew-center-content-substance2">
                    1. Handle the port declaration and approval procedures for ships entering and leaving the port,
                    contact
                    to arrange berths, loading and unloading, etc.;<br/>
                    2. Acting for container management operations of the shipping company; signing bills of lading,
                    transportation contracts , and agent booking business;<br/>
                    3. Import and export cabins Declaration; Declare import and export manifests to customs, national
                    inspection and other port units; handle import bill of lading procedures;<br/>
                    4. Handle customs procedures for changing ship names and voyages for export goods;<br/>
                    5. Declaration of dangerous goods;<br/>
                    6. Collection of freight and settlement;<br/>
                  </div>
                </div>
              </div>
            </el-col>
          </el-row>
        </el-col>
        <!--        <el-col class="container-body-content-box3" v-if="selectSubItem==='驳运'">-->
        <!--          <div class="container-body-content-box3-center">-->
        <!--            <div class="container-body-content-box3-center-title">Lighter</div>-->
        <!--            <div class="container-body-content-box3-center-content">-->
        <!--              <div class="container-body-content-box3-center-content-title1">-->
        <!--                Agent Goods-->
        <!--              </div>-->
        <!--              <div class="container-body-content-box3-center-content-substance1">-->
        <!--                containers, steel, edible oil, machinery and equipment, yacht trading, yacht exhibition-->
        <!--              </div>-->
        <!--              <div class="container-body-content-box3-center-content-title2">-->
        <!--                Service Provided-->
        <!--              </div>-->
        <!--              <div class="container-body-content-box3-center-content-substance2">-->
        <!--                1. Handle the port declaration and approval procedures for ships entering and leaving the port, contact-->
        <!--                to arrange berths, loading and unloading, etc.;<br/>-->
        <!--                2. Acting for container management operations of the shipping company; signing bills of lading,-->
        <!--                transportation contracts , and agent booking business;<br/>-->
        <!--                3. Import and export cabins Declaration; Declare import and export manifests to customs, national-->
        <!--                inspection and other port units; handle import bill of lading procedures;<br/>-->
        <!--                4. Handle customs procedures for changing ship names and voyages for export goods;<br/>-->
        <!--                5. Declaration of dangerous goods;<br/>-->
        <!--                6. Collection of freight and settlement;<br/>-->
        <!--              </div>-->
        <!--            </div>-->
        <!--          </div>-->
        <!--        </el-col>-->
        <!--船舶代理——班轮及非班轮右边图片-->
        <!--        <el-col class="container-body-content-box2" v-if="selectSubItem==='班轮及非班轮'">-->
        <!--          <div class="container-body-content-box2-right"></div>-->
        <!--        </el-col>-->
        <!--船舶代理——总代理内容描述-->
        <el-col  class="container-body-content-box3" v-if="selectSubItem==='总代理'">
          <div class="container-body-content-box3-center">
            <div class="container-body-content-box3-center-title">General Agent</div>
            <div class="container-body-content-box3-center-content">
              <div class="container-body-content-box3-center-content-substance3">
                As vessel general agent, Penavico Shenzhen has rich operation experience, which is familiar with Chinese major ports and has stronger coordination control ability for various ship types. With the goal of being “Professional, efficient and economical”, Penavico Shenzhen provides customized value-added services and create value for customers. <br/>
                <div style="text-indent: -95px;padding-left: 95px;margin-top: 10px;margin-left: 5px"><span>Economical: </span>The accumulation and integration of rich agent resources in major ports, can provide more considerate services and preferential prices to reduce customer costs.</div>
                <div style="text-indent: -70px;padding-left: 70px;margin-left: 30px"><span>Efficient: </span>Timely summarizing and updating the implementation and changes of port policy of each port, so that customers can make overall arrangement.</div>
                <div style="text-indent: -100px;padding-left: 100px"><span>Professional: </span>In case of any emergency, Penavico Shenzhen will provide the best solution at the earliest time</div>
              </div>
              <div class="container-body-content-box3-center-content-title3">
                Service scope:
              </div>
              <div class="container-body-content-box3-center-content-substance4">
                <div>1.　General agent for ship loading and unloading, dry docking, and handing over etc.</div>
                <div>2.　Protecting agent for Owners’ matters, including:</div><div style="margin-left: 27px">Crew handling, spare parts customs clearance and delivery, personnel visit to vessel and port, cash to Master, various ship inspections/surveys, as well as various customers’ entrusted matters. </div>
              </div>
            </div>
          </div>
        </el-col>
        <!--船舶代理——总代理右边图片-->
<!--        <el-col class="container-body-content-box2"-->
<!--                v-if="selectSubItem==='总代理'">-->
<!--          <div class="container-body-content-box2-right7"></div>-->
<!--        </el-col>-->
        <!--船舶代理——修船内容描述-->
        <el-col class="container-body-content-box3" v-if="selectSubItem==='修船'">
          <div class="container-body-content-box3-center">
            <div class="container-body-content-box3-center-title">Ship Repair</div>
            <div class="container-body-content-box3-center-content">
              <div class="container-body-content-box3-center-content-substance3">
                Maintain good relations with shipowners of various countries and major domestic shipyards, maintain
                strategic cooperative relations with allied shipyards in the whole country, be familiar with the
                business process of ship-repairing agency, and provide professional, prompt and considerate services for
                shipowners.
              </div>
              <div class="container-body-content-box3-center-content-title4">
                Agent For All Types Of Ships
              </div>
              <div class="container-body-content-box3-center-content-substance5">
                Container ships bulk cargo ships cruises LPG ships drilling platforms floating storage tankers
              </div>
              <div class="container-body-content-box3-center-content-title5">
                Service Products
              </div>
              <div class="container-body-content-box3-center-content-substance5">
                Ship entry and exit procedures at the shipyard, shipowner boarding, crew matters, captain loan,spare
                parts customs clearance, ship supply
              </div>
            </div>
          </div>
        </el-col>
        <el-col class="container-body-content-box2"
                v-if="selectSubItem==='修船'">
          <div class="container-body-content-box2-right2"></div>
        </el-col>
        <!--船舶代理——海洋工程内容描述-->
        <el-col class="container-body-content-box3" v-if="selectSubItem==='海洋工程'">
          <div class="container-body-content-box3-center">
            <div class="container-body-content-box3-center-title">Marine Engineering</div>
            <div class="container-body-content-box3-center-content">
              <div class="container-body-content-box3-center-content-substance3">
                The experienced professional team provides agency services for ocean engineering projects.
              </div>
              <div class="container-body-content-box3-center-content-title2">
                Service Provided
              </div>
              <div class="container-body-content-box3-center-content-substance2">
                1. Handle the entry and exit formalities of Marine engineering vessels<br/>
                2. Handle temporary customs entry and exit permits for offshore engineering vessels or equipment<br/>
                3. Handle engineering and technical personnel detention permits, handle embarkation, disembarkation or
                platform procedures, and arrange transportation and accommodation<br/>
                4. Handle spare parts customs Supervision procedures, shipboard customs clearance procedures for marine
                materials<br/>
                5. Arrange for towing certificates for unpowered engineering ships, and issuance of navigational
                warnings<br/>
                6. Arrange land, water and helicopter transportation services from land to offshore platforms<br/>
                7. Provide logistics services for construction materials and materials And material supply<br/>
                8. Project professional consulting service<br/>
                9. Other entrusted matters<br/>
              </div>
            </div>
          </div>
        </el-col>
        <!--船舶代理——海洋工程右边图片-->
        <el-col class="container-body-content-box2" v-if="selectSubItem==='海洋工程'">
          <div class="container-body-content-box2-right3"></div>
        </el-col>
        <!--船舶代理——驳运内容描述-->
        <!--        <el-col class="container-body-content-box3" v-if="selectSubItem==='驳运'">-->
        <!--          <div class="container-body-content-box3-center">-->
        <!--            <div class="container-body-content-box3-center-title">Lighter</div>-->
        <!--            <div class="container-body-content-box3-center-content">-->
        <!--              <div class="container-body-content-box3-center-content-title1">-->
        <!--                Agent Goods-->
        <!--              </div>-->
        <!--              <div class="container-body-content-box3-center-content-substance1">-->
        <!--                containers, steel, edible oil, machinery and equipment, yacht trading, yacht exhibition-->
        <!--              </div>-->
        <!--              <div class="container-body-content-box3-center-content-title2">-->
        <!--                Service Provided-->
        <!--              </div>-->
        <!--              <div class="container-body-content-box3-center-content-substance2">-->
        <!--                1. Handle the port declaration and approval procedures for ships entering and leaving the port, contact-->
        <!--                to arrange berths, loading and unloading, etc.;<br/>-->
        <!--                2. Acting for container management operations of the shipping company; signing bills of lading,-->
        <!--                transportation contracts , and agent booking business;<br/>-->
        <!--                3. Import and export cabins Declaration; Declare import and export manifests to customs, national-->
        <!--                inspection and other port units; handle import bill of lading procedures;<br/>-->
        <!--                4. Handle customs procedures for changing ship names and voyages for export goods;<br/>-->
        <!--                5. Declaration of dangerous goods;<br/>-->
        <!--                6. Collection of freight and settlement;<br/>-->
        <!--              </div>-->
        <!--            </div>-->
        <!--          </div>-->
        <!--        </el-col>-->
        <!--船舶代理——联系我们-->
        <el-col class="container-body-content-box4" v-if="selectSubItem==='联系我们'">
          <!--联系我们内容-->
          <div class="container-body-content-box4-contactUs">
            <!--联系我们选择标题栏-->
            <el-row :gutter="2">
              <el-col :span="8">
                <div
                  :class="contactUsItem==='西部港区（蛇口/赤湾/妈湾）'?'container-body-content-box4-contactUs-title-check':'container-body-content-box4-contactUs-title'"
                  @click="handleSelectContactUsItem('西部港区（蛇口/赤湾/妈湾）')">Western Port Area
                </div>
              </el-col>

              <el-col :span="8">
                <div
                  :class="contactUsItem==='东部港区（盐田/大鹏/华安/光汇）'?'container-body-content-box4-contactUs-title-check':'container-body-content-box4-contactUs-title'"
                  @click="handleSelectContactUsItem('东部港区（盐田/大鹏/华安/光汇）')">Eastern Port Area
                </div>
              </el-col>

              <el-col :span="8">
                <div
                  :class="contactUsItem==='大铲湾码头'?'container-body-content-box4-contactUs-title-check':'container-body-content-box4-contactUs-title'"
                  @click="handleSelectContactUsItem('大铲湾码头')">Da Chan Bay Pier
                </div>
              </el-col>
            </el-row>

            <!-- 联系我们——西部港区内容-->
            <div class="container-body-content-box4-contactUs-box" v-if="contactUsItem==='西部港区（蛇口/赤湾/妈湾）'">
              <el-row :gutter="20">
                <!--西部港区——班轮操作-->
                <el-col :span="12">
                  <div class="container-body-content-box4-contactUs-box1">
                    <div class="container-body-content-box4-contactUs-subTitle">Liner operation</div>
                    <div class="container-body-content-box4-contactUs-content">
                      Tel: +86-755-26676604<br/>
                      Fax: +86-755-26692769<br/>
                      E-mail：<a title="Click send email"
                                href="mailto:container@penavicosz.com.cn?subject=Please enter the subject name&body=Please enter the message">container@penavicosz.com.cn</a><br/>
                      Duty phone：+86-13925220028（24 hours online）<br/>
                    </div>
                  </div>
                </el-col>
                <!--西部港区——非班轮操作-->
                <el-col :span="12">
                  <div class="container-body-content-box4-contactUs-box1">
                    <div class="container-body-content-box4-contactUs-subTitle">Non-liner operation</div>
                    <div class="container-body-content-box4-contactUs-content">
                      Tel: +86-755-26695216<br/>
                      Fax: +86-755-26692769<br/>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+86-755-26689946<br/>
                      Email: <a title="Click send email"
                                href="mailto:shipping@penavicosz.com.cn?subject=Please enter the subject name&body=Please enter the message">shipping@penavicosz.com.cn</a><br/>
                    </div>
                  </div>
                </el-col>
              </el-row>

              <el-row :gutter="10" style="margin-top: 20px">
                <!--西部港区——驳船操作-->
                <el-col :span="8">
                  <div class="container-body-content-box4-contactUs-box3">
                    <div class="container-body-content-box4-contactUs-subTitle">Barge operation</div>
                    <div class="container-body-content-box4-contactUs-content2">
                      Tel: +86-755-26880915<br/>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+86-755-26694340<br/>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+86-755-26880911<br/>
                      Fax: +86-755-26692769<br/>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+86-755-26689946<br/>
                      Email: <a title="Click send email"
                                href="mailto:feederr@penavicosz.com.cn?subject=Please enter the subject name&body=Please enter the message">feederr@penavicosz.com.cn</a><br/>
                    </div>
                  </div>
                </el-col>
                <!--西部港区——财务结算-->
                <el-col :span="8">
                  <div class="container-body-content-box4-contactUs-box3">
                    <div class="container-body-content-box4-contactUs-subTitle">Financial settlement</div>
                    <div class="container-body-content-box4-contactUs-content2">
                      Tel: +86-755-26689771<br/>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+86-755-26880924<br/>
                      Fax: +86-755-26692769<br/>
                      E-mail: <a title="Click send email"
                                 href="mailto:mah@acct@penavicosz.com.cn?subject=Please enter the subject name&body=Please enter the message">acct@penavicosz.com.cn</a><br/>
                    </div>
                  </div>
                </el-col>
                <!--西部港区——单证操作-->
                <el-col :span="8">
                  <div class="container-body-content-box4-contactUs-box3">
                    <div class="container-body-content-box4-contactUs-subTitle">Document operation</div>
                    <div class="container-body-content-box4-contactUs-content2">
                      Tel: +86-755-26692731<br/>
                      Fax: +86-755-26687360<br/>
                      E-mail: <a title="Click send email"
                                 href="mailto:business@penavicosz.com.cn?subject=Please enter the subject name&body=Please enter the message">business@penavicosz.com.cn</a><br/>
                    </div>
                  </div>
                </el-col>
              </el-row>
              <baidu-map class="container-body-content-box4-contactUs-map"
                         :scroll-wheel-zoom="true" :center="center1" :zoom="19" id="aMap1">
                <bm-navigation anchor="BMAP_ANCHOR_TOP_RIGHT"></bm-navigation>
                <bm-overview-map anchor="BMAP_ANCHOR_BOTTOM_RIGHT" :isOpen="true"></bm-overview-map>
                <bm-scale anchor="BMAP_ANCHOR_TOP_LEFT"></bm-scale>
                <bm-marker :position="{   lng: '113.926748',lat: '22.50255'}" animation="BMAP_ANIMATION_BOUNCE"
                           :show="show5"
                           @click="infoWindowOpen5">
                  <bm-info-window :position="{   lng: '113.926748', lat: '22.50255'}" title="<h3>Address</h3>"
                                  :show="show5" @close="infoWindowClose5">
                    <p style="margin-top: 6px">1,8,9 / f, shenzhen wai dai united building, nanhai avenue, shekou, nanshan district, shenzhen</p>
                  </bm-info-window>
                </bm-marker>
              </baidu-map>
            </div>

            <!--联系我们——东部港区内容-->
            <div class="container-body-content-box4-contactUs-box" v-if="contactUsItem==='东部港区（盐田/大鹏/华安/光汇）'">
              <el-row :gutter="20">
                <!--东部港区——办公事务及信息服务-->
                <el-col :span="12">
                  <div class="container-body-content-box4-contactUs-box1">
                    <div class="container-body-content-box4-contactUs-subTitle">Office affairs and information
                      services
                    </div>
                    <div class="container-body-content-box4-contactUs-content">
                      Tel: +86-755-25290056<br/>
                      Fax: +86-755-25292870<br/>
                      Email: <a title="Click send email"
                                href="mailto:itytn@penavicosz.com.cn?subject=Please enter the subject name&body=Please enter the message">itytn@penavicosz.com.cn</a><br/>
                    </div>
                  </div>
                </el-col>
                <!--东部港区——船舶操作-->
                <el-col :span="12">
                  <div class="container-body-content-box4-contactUs-box1">
                    <div class="container-body-content-box4-contactUs-subTitle">Ship operation</div>
                    <div class="container-body-content-box4-contactUs-content">
                      Tel: +86-755-25290215<br/>
                      Fax: +86-755-25291400<br/>
                      Email: <a title="Click send email"
                                href="mailto:shippingytn@penavicosz.com.cn?subject=Please enter the subject name&body=Please enter the message">shippingytn@penavicosz.com.cn</a><br/>
                      Duty phone: +86-755-25290215（24 hours）
                    </div>
                  </div>
                </el-col>
              </el-row>
              <el-row :gutter="10" style="margin-top: 20px">
                <!--东部港区——单证操作-->
                <el-col :span="8">
                  <div class="container-body-content-box4-contactUs-box2">
                    <div class="container-body-content-box4-contactUs-subTitle">Document operation</div>
                    <div class="container-body-content-box4-contactUs-content2">
                      Tel: +86-755-25291016<br/>
                      Fax: +86-755-25290877<br/>
                      Email: <a title="Click send email"
                                href="mailto:businessytn@penavicosz.com.cn?subject=Please enter the subject name&body=Please enter the message">businessytn@penavicosz.com.cn</a><br/>
                    </div>
                  </div>
                </el-col>
                <!--东部港区——财务结算-->
                <el-col :span="8">
                  <div class="container-body-content-box4-contactUs-box2">
                    <div class="container-body-content-box4-contactUs-subTitle">Financial settlement</div>
                    <div class="container-body-content-box4-contactUs-content2">
                      Tel: +86-755-25290221<br/>
                      Fax: +86-755-25290219<br/>
                      Email: <a title="Click send email"
                                href="mailto:accountytn@penavicosz.com.cn?subject=Please enter the subject name&body=Please enter the message">accountytn@penavicosz.com.cn</a><br/>
                    </div>
                  </div>
                </el-col>
                <!--东部港区——货物报关-->
                <el-col :span="8">
                  <div class="container-body-content-box4-contactUs-box2">
                    <div class="container-body-content-box4-contactUs-subTitle">Cargo declaration</div>
                    <div class="container-body-content-box4-contactUs-content2">
                      Tel: +86-755-25292653<br/>
                      Fax: +86-755-25290075<br/>
                      E-mail: <a title="Click send email"
                                 href="mailto:brokerytn@penavicosz.com.cn?subject=Please enter the subject name&body=Please enter the message">brokerytn@penavicosz.com.cn</a><br/>
                    </div>
                  </div>
                </el-col>
              </el-row>
              <baidu-map class="container-body-content-box4-contactUs-map"
                         :scroll-wheel-zoom="true" :center="center2" :zoom="16" id="aMap2">
                <bm-navigation anchor="BMAP_ANCHOR_TOP_RIGHT"></bm-navigation>
                <bm-overview-map anchor="BMAP_ANCHOR_BOTTOM_RIGHT" :isOpen="true"></bm-overview-map>
                <bm-scale anchor="BMAP_ANCHOR_TOP_LEFT"></bm-scale>
                <bm-marker :position="{  lng: '114.26011',
          lat: '22.575021'}" animation="BMAP_ANIMATION_BOUNCE" :show="show6"
                           @click="infoWindowOpen6">
                  <bm-info-window :position="{   lng: '114.26011',
          lat: '22.575021'}" title="<h3>Address</h3>" :show="show6" @close="infoWindowClose6">
                    <p style="margin-top: 6px">Room 810, Main Building, Sha Tau Kok Seaport Building, Yantian District, Shenzhen</p>
                  </bm-info-window>
                </bm-marker>
              </baidu-map>
            </div>

            <!--联系我们——大铲湾码头　-->
            <div class="container-body-content-box4-contactUs-box" v-if="contactUsItem==='大铲湾码头'">
              <el-row :gutter="20">
                <!--大铲湾码头——船舶操作-->
                <el-col :span="12">
                  <div class="container-body-content-box4-contactUs-box1">
                    <div class="container-body-content-box4-contactUs-subTitle">Ship operation</div>
                    <div class="container-body-content-box4-contactUs-content">
                      Tel: +86-755-29035025<br/>
                      Fax: +86-755-29035027<br/>
                      E-mail: <a title="Click send email"
                                 href="mailto:shippingdcb@penavicosz.com.cn?subject=Please enter the subject name&body=Please enter the message">shippingdcb@penavicosz.com.cn</a><br/>
                      Duty phone: +86 13925220028<br/>
                    </div>
                  </div>
                </el-col>
                <!--大铲湾码头——单证操作-->
                <el-col :span="12">
                  <div class="container-body-content-box4-contactUs-box1">
                    <div class="container-body-content-box4-contactUs-subTitle">Document operation</div>
                    <div class="container-body-content-box4-contactUs-content">
                      Tel: +86-755-29035026<br/>
                      Fax: +86-755-29035027<br/>
                      E-mail: <a title="Click send email"
                                 href="mailto:dachan@penavicosz.com.cn?subject=Please enter the subject name&body=Please enter the message">dachan@penavicosz.com.cn</a><br/>
                    </div>
                  </div>
                </el-col>
              </el-row>
              <baidu-map class="container-body-content-box4-contactUs-map"
                         :scroll-wheel-zoom="true" :center="{lng: '113.869685',lat: '22.537454'}" :zoom="16" id="aMap3">
                <bm-navigation anchor="BMAP_ANCHOR_TOP_RIGHT"></bm-navigation>
                <bm-overview-map anchor="BMAP_ANCHOR_BOTTOM_RIGHT" :isOpen="true"></bm-overview-map>
                <bm-scale anchor="BMAP_ANCHOR_TOP_LEFT"></bm-scale>
                <bm-marker :position="{lng: '113.869685',lat: '22.537454'}" animation="BMAP_ANIMATION_BOUNCE"
                           :show="show7"
                           @click="infoWindowOpen7">
                  <bm-info-window :position="{lng: '113.869685',lat: '22.537454'}" title="<h3>Address</h3>" :show="show7"
                                  @close="infoWindowClose7">
                    <p style="margin-top: 6px">402, Control Building, Dachuwan Wharf Phase I, Jingang Avenue, Baoan District, Shenzhen</p>
                  </bm-info-window>
                </bm-marker>
              </baidu-map>
            </div>
          </div>
        </el-col>
      </el-row>

      <!--国际货运模块-->
      <el-row class="container-body-content" v-if="selectItem==='国际货运'">
        <!--国际货运左边标题选择栏-->
        <el-col class="container-body-content-box">
          <div class="container-body-content-box-left">
            <div class="container-body-content-box-left-title1">
              <span class="container-body-content-box-left-title1-content"
                    style="font-size: 26px">Cargo Forwarding</span>
              <span class="container-body-content-box-left-title1-line"></span>
            </div>

            <div
              :class="selectSubItem2==='简介'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem2==='简介'?'aClass1':'aClass2'" @click="handleSelectSubTitle2('简介')">
                Introduction
              </div>
            </div>

            <div
              :class="selectSubItem2==='业务范围'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem2==='业务范围'?'aClass1':'aClass2'" @click="handleSelectSubTitle2('业务范围')">Business
                Scope
              </div>
            </div>

            <div
              :class="selectSubItem2==='联系我们'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem2==='联系我们'?'aClass1':'aClass2'" @click="handleSelectSubTitle2('联系我们')">Contact
                Us
              </div>
            </div>

          </div>
        </el-col>
        <!--国际货运——简介内容描述-->
        <el-col class="container-body-content-box3" v-if="selectSubItem2==='简介'">
          <div class="container-body-content-box3-center">
            <div class="container-body-content-box3-center-title">Introduction</div>
            <div class="container-body-content-box3-center-content">
              <div class="container-body-content-box3-center-content-substance6">
                <p>
                  PENAVICO SHENZHEN LOGISTICS LTD., established in 1993 which is wholly owned by PENAVICO SHENZHEN, We
                  are first-class freight forwarder approved by the Ministry of Foreign Trade and Economic Cooperation
                  in 1993 and also one of the earliest enterprises in Shenzhen to obtain the qualification of
                  international freight forwarding business of the Ministry of Communications . As one of the first few
                  comprehensive enterprises who are engaged in modern logistics, we have established more than 20
                  branches covering main coastal cities in Eastern, Northern and Southern China. The company keeps
                  adhering to the business philosophy of “WE ARE FOR YOU”. After years of business development, we have
                  developed a new business structure with sea and air transportation as the core and warehousing,
                  E-commerce, small package express delivery, domestic logistics, consolidation, shipping agency,
                  overseas agent, railway transportation, bulk cargo transportation, multimodal transportation and OOG
                  as supplements, which help providing customers with the best logistics solutions and one-stop
                  service. </p>
                <p>
                  The company is equipped with advanced and perfect freight operation facilities and operating system.
                  We have established long-term cooperative relationships with dozens of shipping companies and airlines
                  around the world and also built up long-term closed relationships with nearly 200 overseas agents,
                  which enables us to provide customers with competitive rate and full range and one-stop supporting
                  services for sea, land and air transportation.</p>
              </div>
            </div>
          </div>


        </el-col>
        <!--国际货运——简介右边图片-->
        <el-col class="container-body-content-box2" v-if="selectSubItem2==='简介'">
          <div class="container-body-content-box2-right"></div>
        </el-col>
        <!--国际货运——业务范围内容描述-->
        <el-col class="container-body-content-box5" v-if="selectSubItem2==='业务范围'">
          <div class="container-body-content-box5-serviceArea">
            <!--业务范围——经营范围-->
            <div class="container-body-content-box5-serviceArea-title">Business Scope</div>
            <div class="container-body-content-box5-serviceArea-content">
              <el-row>
                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon7.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">Shipping service</div>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon8.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">Air freight service</div>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon9.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">LCL service</div>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box" style="border-right: none">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon10.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">Warehousing Services</div>
                  </div>
                </el-col>
              </el-row>

              <el-row>
                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box2">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon13.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">Overseas agent</div>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box2">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon11.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">Multimodal transport</div>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box2">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon12.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">Special cabinet</div>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box2" style="border-right: none">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon14.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">Medical equipment transportation
                    </div>
                  </div>
                </el-col>
              </el-row>

            </div>

            <!--业务范围优势和资源-->
            <div style="margin-top: 40px;">
              <div class="container-body-content-box5-serviceArea-title">Advantages and resources</div>
              <div class="container-body-content-box5-serviceArea-content">
                <el-row>
                  <el-col :span="12">
                    <div class="container-body-content-box5-serviceArea-content-left">
                      <p>The 20 branches all over the country and more than 300 overseas companies all over the world
                        can provide high-quality services in different regions to meet the diverse needs of customers.
                        This kind of linked operation makes the originally convenient, fast, economical and efficient
                        service more seamless.
                      </p>
                      <p>
                        Professionals with rich knowledge and experience can provide customers with comprehensive
                        services such as shipping, air transportation, customs declaration, inland transportation, and
                        warehousing in a timely and effective manner. Diversified maritime value-added services.</p>
                    </div>
                  </el-col>
                  <el-col :span="10" style="float: right;">
                    <div class="container-body-content-box5-serviceArea-content-right">
                      <img class="container-body-content-box5-serviceArea-content-right-img"
                           src="../../../assets/front/images/serviceArea/serviceArea-image13.png" alt=""/>
                    </div>
                  </el-col>
                </el-row>
              </div>
            </div>
          </div>
        </el-col>
        <!--国际货运——联系我们内容描述-->
        <el-col class="container-body-content-box6" v-if="selectSubItem2==='联系我们'">
          <div class="container-body-content-box6-serviceArea2">
            <div class="container-body-content-box6-serviceArea2-contactUs3">
              <el-row>
                <!--联系我们内容信息-->
                <el-col :span="14" style="padding-top: 40px">
                  <div class="container-body-content-box6-serviceArea2-contactUs3-title">
                    PENAVICO SHENZHEN LOGISTICS .,LTD.
                  </div>
                  <div class="container-body-content-box6-serviceArea2-contactUs3-content">
                    Add: 20/F ,AnlianPlaza ,No.4018,Jintian Road,Futian District ,Shenzhen ,PRC<br/>
                    P.C.: 518026<br/>
                    Tel: 86-755-88284699 / 88284700<br/>
                    Fax: 86-755-88284650<br/>
                    E-mail: <a title="Click send email" href="mailto:boeven.wu@penavicocargo.com?subject=Please enter the subject name&body=Please enter the message">boeven.wu@penavicocargo.com</a><br/>
                    Website: <a href="http://www.penavicocargo.com/" target="_blank"
                                style="text-decoration: underline;color: #277AE3">www.penavicocargo.com</a><br/>
                  </div>
                </el-col>
                <!--百度地图-->
                <el-col :span="10">
                  <div class="container-body-content-box6-serviceArea2-contactUs3-mapBox">
                    <baidu-map class="container-body-content-box6-serviceArea2-contactUs3-mapBox-map" @ready="mapReady3"
                               :scroll-wheel-zoom="true">
                      <bm-marker @click="infoWindowOpen3" :position=this.point5 animation="BMAP_ANIMATION_BOUNCE"
                                 :show="show3">
                        <bm-info-window :position=this.point6 title="Address" :show="show3" @close="infoWindowClose3">
                          <p>20/F ,AnlianPlaza ,No.4018,Jintian Road,Futian District ,Shenzhen ,PRC</p>
                        </bm-info-window>
                      </bm-marker>
                    </baidu-map>
                  </div>
                </el-col>
              </el-row>
            </div>
          </div>
        </el-col>
      </el-row>

      <!--报税仓储模块-->
      <el-row class="container-body-content" v-if="selectItem==='报税仓储'">
        <!--报税仓储左边标题选择栏-->
        <el-col class="container-body-content-box">
          <div class="container-body-content-box-left">
            <div class="container-body-content-box-left-title2">
              <span class="container-body-content-box-left-title-content" style="font-size: 22px">Qianhai Bonded Warehouse</span>
              <span class="container-body-content-box-left-title-line"></span>
            </div>

            <div
              :class="selectSubItem3==='简介'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem3==='简介'?'aClass1':'aClass2'" @click="handleSelectSubTitle3('简介')">
                Introduction
              </div>
            </div>

            <div
              :class="selectSubItem3==='业务范围'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem3==='业务范围'?'aClass1':'aClass2'" @click="handleSelectSubTitle3('业务范围')">Business
                Scope
              </div>
            </div>

            <div
              :class="selectSubItem3==='联系我们'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem3==='联系我们'?'aClass1':'aClass2'" @click="handleSelectSubTitle3('联系我们')">Contact
                Us
              </div>
            </div>
          </div>
        </el-col>
        <!--报税仓储——简介内容描述-->
        <el-col class="container-body-content-box3" v-if="selectSubItem3==='简介'">
          <div class="container-body-content-box3-center">
            <div class="container-body-content-box3-center-title">Introduction</div>
            <div class="container-body-content-box3-center-content">
              <div class="container-body-content-box3-center-content-substance6">
                <p>
                  PENAVICO SHENZHEN WAREHOUSING CO.,LTD, is wholly-owned by PENAVICO SHENZHEN which was established in
                  2010, with a 66,000 square meters of bonded warehouse in Qianhai, the total investment of the bonded
                  warehouse is about 250 million Yuan.</p>
                <p>
                  With policy support of Customs of Qianhaiwan Free Trade Port Area, PENAVICO SHENZHEN WAREHOUSING
                  CO.,LTD is encouraged to innovate and explore,Besides the traditional bonded warehousing business
                  model, We also explore and expand business model like “Global Central Warehouse”, “Shop in Hong Kong
                  with supporting warehouse in Shenzhen Qianhai”, “Cross-Border E-commerce service”, “Supply Chain and
                  Supply Chain Finance”,“Bonded + Cruise Material Supply” to offer professional and considerate service
                  and satisfy diversified needs of clients.
                </p>
              </div>
            </div>
          </div>
        </el-col>
        <!--报税仓储——简介右边图片-->
        <el-col class="container-body-content-box2" v-if="selectSubItem3==='简介'">
          <div class="container-body-content-box2-right6"></div>
        </el-col>

        <!--报关报检——业务范围内容描述-->
        <el-col class="container-body-content-box5" v-if="selectSubItem3==='业务范围'">
          <div class="container-body-content-box5-serviceArea">
            <!--业务类型一-->
            <div class="container-body-content-box5-serviceArea-title">Business Type One</div>
            <div class="container-body-content-box5-serviceArea-content">
              <el-row style="margin-left: -30px;">
                <el-col :span="7" style="padding-left: 30px;padding-right: 30px">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-01.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">Import distribution
                      warehousing-case
                    </div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box4">
                    A customer has many buyers in China. The customer puts the imported goods into the bonded warehouse
                    of Shenzhen Foreign Agency Qianhai at one time, then declares the import in batches, and then
                    delivers them to the buyer, saving logistics costs.
                  </div>
                </el-col>

                <el-col :span="7" style="padding-left: 30px;padding-right: 30px">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-02.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">Import distribution
                      warehousing-advantages
                    </div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box4">
                    A: There is no need to pay tariffs in one go. Imports are paid in batches, saving a large amount of
                    tax backlog for enterprises.<br/>
                    B: The storage cost of the warehouse is much lower than the cost of the terminal.
                  </div>
                </el-col>

                <el-col :span="10" style="padding-left: 30px">
                  <img class="container-body-content-box5-serviceArea-content-serviceAreaImage"
                       src="../../../assets/front/images/serviceArea/serviceArea-image6.png" alt=""/>
                </el-col>
              </el-row>

            </div>
            <!--业务类型二-->
            <div style="margin-top: 60px">
              <div class="container-body-content-box5-serviceArea-title">Business Type Two</div>
              <div class="container-body-content-box5-serviceArea-content">
                <el-row style="margin-left: -30px;">
                  <el-col :span="12" style="padding-left: 30px;padding-right: 30px">
                    <div class="container-body-content-box5-serviceArea-content-box3">
                      <img class="container-body-content-box5-serviceArea-content-box3-img"
                           src="../../../assets/front/images/serviceArea/serviceArea-01.png" alt=""/>
                      <div class="container-body-content-box5-serviceArea-content-word2">Apply for export tax refund in
                        advance-case
                      </div>
                    </div>

                    <div class="container-body-content-box5-serviceArea-content-box4">
                      An export company has completed production and urgently needs export, but has not found a buyer or
                      needs a tax refund in advance. Since the Qianhai Bonded Port Area of ​​Shenzhen Waidai Qianhai
                      Warehouse has a tax rebate policy for entering the zone (deemed as an export), the company first
                      exports its products to Shenzhen Waidai Qianhai’s bonded warehouse, and then exports to the
                      warehouse based on actual conditions. foreign. Compared with exporting directly to foreign
                      countries, companies can apply for export tax rebates in advance, and only need to pay a small
                      amount of warehouse usage fees, which is undoubtedly a very good solution for many enterprises
                      that rely on export tax rebates to survive.
                    </div>
                  </el-col>

                  <el-col :span="12" style="padding-left: 30px;">
                    <img class="container-body-content-box5-serviceArea-content-serviceAreaImage2"
                         src="../../../assets/front/images/serviceArea/serviceArea-image7.png" alt=""/>
                  </el-col>
                </el-row>

              </div>
            </div>
            <!--业务类型三-->
            <div style="margin-top: 60px">
              <div class="container-body-content-box5-serviceArea-title">Business Type Three</div>
              <div class="container-body-content-box5-serviceArea-content">
                <el-row style="margin-left: -30px;">
                  <el-col :span="12" style="padding-left: 30px;padding-right: 30px">
                    <div class="container-body-content-box5-serviceArea-content-box3">
                      <img class="container-body-content-box5-serviceArea-content-box3-img"
                           src="../../../assets/front/images/serviceArea/serviceArea-01.png" alt=""/>
                      <div class="container-body-content-box5-serviceArea-content-word2">Export to domestic sales-case
                      </div>
                    </div>

                    <div class="container-body-content-box5-serviceArea-content-box4">
                      A company’s products need to be exported to domestic sales. The previous mode of operation was to
                      export to Hong Kong or overseas, and then import from Hong Kong or overseas to China. Now, with
                      the policy of Shenzhen Waidai Qianhai Bonded Warehouse, entering the zone is regarded as an
                      export. Compared with exporting directly to Hong Kong or overseas, it greatly reduces logistics
                      costs for enterprises.
                    </div>
                  </el-col>

                  <el-col :span="12" style="padding-left: 30px;">
                    <img class="container-body-content-box5-serviceArea-content-serviceAreaImage"
                         src="../../../assets/front/images/serviceArea/serviceArea-image8.png" alt=""/>
                  </el-col>
                </el-row>
              </div>
            </div>
            <!--业务类型四-->
            <div style="margin-top: 60px">
              <div class="container-body-content-box5-serviceArea-title">Business type four</div>
              <div class="container-body-content-box5-serviceArea-content">
                <el-row style="margin-left: -30px;">
                  <el-col :span="12" style="padding-left: 30px;padding-right: 30px">
                    <div class="container-body-content-box5-serviceArea-content-box3">
                      <img class="container-body-content-box5-serviceArea-content-box3-img"
                           src="../../../assets/front/images/serviceArea/serviceArea-01.png" alt=""/>
                      <div class="container-body-content-box5-serviceArea-content-word2">Factory transfer between two
                        companies
                      </div>
                    </div>

                    <div class="container-body-content-box5-serviceArea-content-box4">
                      Guangzhou Company A’s products, such as display screens, must be sold to Shenzhen Company B as
                      materials. For example, the procedures for going from Company A to Company B are very cumbersome
                      and time-consuming. Now it is very easy to transfer factories using Qianhai Bonded Warehouse in
                      Shenzhen. Company A directly exports the products to the foreign agent bonded warehouse, and
                      Company B imports the goods from the foreign agent bonded warehouse.
                    </div>
                  </el-col>

                  <el-col :span="12" style="padding-left: 30px;">
                    <img class="container-body-content-box5-serviceArea-content-serviceAreaImage"
                         src="../../../assets/front/images/serviceArea/serviceArea-image9.png" alt=""/>
                  </el-col>
                </el-row>
              </div>
            </div>
          </div>
        </el-col>

        <!--报税仓储——联系我们内容描述-->
        <el-col class="container-body-content-box6" v-if="selectSubItem3==='联系我们'">
          <div class="container-body-content-box6-serviceArea2">
            <div class="container-body-content-box6-serviceArea2-contactUs3">
              <el-row>
                <!--联系我们内容信息-->
                <el-col :span="14" style="padding-top: 40px">
                  <div class="container-body-content-box6-serviceArea2-contactUs3-title">
                    PENAVICO SHENZHEN WAREHOUSING CO.,LTD.
                  </div>
                  <div class="container-body-content-box6-serviceArea2-contactUs3-content">
                    Add: 53 LinhaiRoad,NanshanDistrict,Shenzhen,PRC Shenzhen Qianhaiwan Free Trade Port Area.<br/>
                    P.C.: 518054<br/>
                    Tel: 86-755-26822577<br/>
                    Email: <a title="Click send email" href="mailto:liuzimu@penavicocargo.com?subject=Please enter the subject name&body=Please enter the message">liuzimu@penavicocargo.com</a><br/>
                    Website: <a href="http://www.penavicosz.com.cn/" target="_blank"
                                style="text-decoration: underline;color: #277AE3">www.penavicosz.com.cn</a><br/>
                  </div>
                </el-col>
                <!--百度地图-->
                <el-col :span="10">
                  <div class="container-body-content-box6-serviceArea2-contactUs3-mapBox">
                    <baidu-map class="container-body-content-box6-serviceArea2-contactUs3-mapBox-map" @ready="mapReady4"
                               :scroll-wheel-zoom="true">
                      <bm-marker @click="infoWindowOpen4" :position=this.point7 animation="BMAP_ANIMATION_BOUNCE"
                                 :show="show4">
                        <bm-info-window :position=this.point8 title="Address" :show="show4" @close="infoWindowClose4">
                          <p>53 LinhaiRoad,NanshanDistrict,Shenzhen,PRC Shenzhen Qianhaiwan Free Trade Port Area.</p>
                        </bm-info-window>
                      </bm-marker>
                    </baidu-map>
                  </div>
                </el-col>
              </el-row>
            </div>
          </div>
        </el-col>
      </el-row>

      <!--报关报检模块-->
      <el-row class="container-body-content" v-if="selectItem==='报关报检'">
        <!--报关报检左边标题选择栏-->
        <el-col class="container-body-content-box">
          <div class="container-body-content-box-left">
            <div class="container-body-content-box-left-title3">
              <span class="container-body-content-box-left-title-content" style="font-size: 22px">Cargo Customs Clearance</span>
              <span class="container-body-content-box-left-title-line"></span>
            </div>

            <div
              :class="selectSubItem4==='简介'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem4==='简介'?'aClass1':'aClass2'" @click="handleSelectSubTitle4('简介')">
                Introduction
              </div>
            </div>

            <div
              :class="selectSubItem4==='业务范围'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem4==='业务范围'?'aClass1':'aClass2'" @click="handleSelectSubTitle4('业务范围')">Business
                Scope
              </div>
            </div>

            <div
              :class="selectSubItem4==='联系我们'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem4==='联系我们'?'aClass1':'aClass2'" @click="handleSelectSubTitle4('联系我们')">Contact
                Us
              </div>
            </div>
          </div>
        </el-col>
        <!--报关报检——简介内容描述-->
        <el-col class="container-body-content-box3" v-if="selectSubItem4==='简介'">
          <div class="container-body-content-box3-center">
            <div class="container-body-content-box3-center-title">Introduction</div>
            <div class="container-body-content-box3-center-content">
              <div class="container-body-content-box3-center-content-substance6">
                <p>
                  PENAVICO SHENZHEN CUSTOMS BROKER CO.,LTD is wholly-owned by PENAVICO SHENZHEN, was established in
                  2005, Customs AEO-certified enterprise. The company is mainly engaged in the import and export
                  clearance agency of goods and “Yun Ji Tong”online value-added services for customers. The business
                  mainly involves trade of food、 wine、fresh fruits and vegetables、 daily necessities、clothing、large
                  machinery、cosmetics、maternal and child supplies and etc., with a professional team to provide quality
                  and efficient services for customers.</p>
              </div>
            </div>
          </div>
        </el-col>
        <el-col class="container-body-content-box2" v-if="selectSubItem4==='简介'">
          <div class="container-body-content-box2-right4"></div>
        </el-col>
        <!--        <el-col class="container-body-content-box5" v-if="selectSubItem4==='简介'">-->
        <!--          <div class="container-body-content-box5-serviceArea">-->
        <!--            &lt;!&ndash;报关报检——服务项目内容&ndash;&gt;-->
        <!--            <div class="container-body-content-box5-serviceArea-title">Service Items</div>-->
        <!--            <div class="container-body-content-box5-serviceArea-content">-->
        <!--              <el-row>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon15.png" alt=""/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">Tax warehousing</div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon16.png" alt=""/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">Transfer service</div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon17.png" alt=""/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">Re-export trade</div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box" style="border-right: none">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon18.png" alt/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">Container disassembly</div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--              </el-row>-->
        <!--              <el-row>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box2">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon19.png" alt=""/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">Logistics information processing-->
        <!--                    </div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box2">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon20.png" alt=""/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">International Purchasing</div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box2">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon21.png" alt=""/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">International delivery</div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box2" style="border-right: none">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon22.png" alt=""/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">Simple processing value-added-->
        <!--                      service-->
        <!--                    </div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--              </el-row>-->
        <!--            </div>-->

        <!--            &lt;!&ndash;报关报检——外代报税仓内容&ndash;&gt;-->
        <!--            <div class="container-body-content-box5-serviceArea-title2">Foreign Bonded Warehouse-value-added Services-->
        <!--            </div>-->
        <!--            <el-row :gutter="25" style="margin-bottom:28px">-->
        <!--              <el-col :span="8">-->
        <!--                <div class="container-body-content-box5-serviceArea-content2">-->
        <!--                  <img class="container-body-content-box5-serviceArea-content2-img"-->
        <!--                       src="../../../assets/front/icon/serviceArea-icon23.png" alt=""/>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-subTitle">Pick Up</div>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-word">A brief description of picking up-->
        <!--                    goods-->
        <!--                  </div>-->
        <!--                </div>-->
        <!--              </el-col>-->
        <!--              <el-col :span="8">-->
        <!--                <div class="container-body-content-box5-serviceArea-content2">-->
        <!--                  <img class="container-body-content-box5-serviceArea-content2-img"-->
        <!--                       src="../../../assets/front/icon/serviceArea-icon24.png" alt=""/>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-subTitle">Freight Forwarding</div>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-word">A brief description of freight-->
        <!--                    forwarding-->
        <!--                  </div>-->
        <!--                </div>-->
        <!--              </el-col>-->
        <!--              <el-col :span="8">-->
        <!--                <div class="container-body-content-box5-serviceArea-content2">-->
        <!--                  <img class="container-body-content-box5-serviceArea-content2-img"-->
        <!--                       src="../../../assets/front/icon/serviceArea-icon25.png" alt=""/>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-subTitle">Repackage</div>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-word">A brief description of-->
        <!--                    repackaging-->
        <!--                  </div>-->
        <!--                </div>-->
        <!--              </el-col>-->
        <!--            </el-row>-->
        <!--            <el-row :gutter="25">-->
        <!--              <el-col :span="8">-->
        <!--                <div class="container-body-content-box5-serviceArea-content2">-->
        <!--                  <img class="container-body-content-box5-serviceArea-content2-img"-->
        <!--                       src="../../../assets/front/icon/serviceArea-icon26.png" alt=""/>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-subTitle">Inventory management</div>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-word">A brief description of inventory-->
        <!--                    management-->
        <!--                  </div>-->
        <!--                </div>-->
        <!--              </el-col>-->
        <!--              <el-col :span="8">-->
        <!--                <div class="container-body-content-box5-serviceArea-content2">-->
        <!--                  <img class="container-body-content-box5-serviceArea-content2-img"-->
        <!--                       src="../../../assets/front/icon/serviceArea-icon27.png" alt=""/>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-subTitle">Relabel</div>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-word">A brief description of relabeling-->
        <!--                  </div>-->
        <!--                </div>-->
        <!--              </el-col>-->
        <!--              <el-col :span="8">-->
        <!--                <div class="container-body-content-box5-serviceArea-content2">-->
        <!--                  <img class="container-body-content-box5-serviceArea-content2-img"-->
        <!--                       src="../../../assets/front/icon/serviceArea-icon28.png" alt=""/>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-subTitle">Simple product processing</div>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-word">A brief description of the simple-->
        <!--                    processing of the product-->
        <!--                  </div>-->
        <!--                </div>-->
        <!--              </el-col>-->
        <!--            </el-row>-->
        <!--          </div>-->
        <!--        </el-col>-->
        <!--报税仓储——业务范围内容描述-->
        <el-col class="container-body-content-box5" v-if="selectSubItem4==='业务范围'">
          <div class="container-body-content-box5-serviceArea">
            <div class="container-body-content-box5-serviceArea-title">Business Scope</div>
            <div class="container-body-content-box5-serviceArea-content">
              <el-row :gutter="20">
                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-01.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">Import And Export Declaration
                    </div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box4">
                    It is engaged in customs declaration, inspection declaration, inspection and dissemination of goods.
                    Mainly handle customs declaration, inspection declaration, pre-entry bonded warehouse declaration
                    business and customs inspection consulting business for import and export goods and in and out
                    transportation vehicles for customers
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-02.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">Ship Repair</div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box4">
                    Provide ship repair, ship supplies, spare parts supply, energy supply and other related ship service
                    businesses.
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-03.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">Marine Engineering</div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box4">
                    Temporary customs clearance procedures for offshore engineering ships and offshore equipment.
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-04.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">Type Of Goods</div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box4">
                    Acting for import and export declaration of goods:<br/>container/steel/iron
                    ore/coal/grain/equipment/oil
                  </div>
                </el-col>
              </el-row>
            </div>
          </div>
        </el-col>

        <!--报关报检——联系我们内容-->
        <el-col class="container-body-content-box6" v-if="selectSubItem4==='联系我们'">
          <div class="container-body-content-box6-serviceArea2">
            <div class="container-body-content-box6-serviceArea2-contactUs3">
              <el-row>
                <!--联系我们内容信息-->
                <el-col :span="14" style="padding-top: 40px">
                  <div class="container-body-content-box6-serviceArea2-contactUs3-title">
                    PENAVICO SHENZHEN CUSTOMS BROKER CO.,LTD.
                  </div>
                  <div class="container-body-content-box6-serviceArea2-contactUs3-content">
                    <el-row>
                      <el-col style="width: 42px;">
                        Add:
                      </el-col>
                      <el-col :span="19">
                        53 Linhai Road,NanshanDistrict,Shenzhen,PRC Shenzhen Qianhaiwan Free Trade Port Area.
                      </el-col>
                    </el-row>
                    P.C.: 518054<br/>
                    Tel: 86-755-26880940 / 25290051<br/>
                    Email: <a title="Click send email" href="mailto:tony.guo@penavicosz.com.cn?subject=Please enter the subject name&body=Please enter the message">tony.guo@penavicosz.com.cn</a><br/>
                    Website: <a target="_blank" href="http://www.penavicosz.com.cn"  style="text-decoration: underline;color: #277AE3">www.penavicosz.com.cn</a>
                    <!--                    Website:<a href="http://www.penavicowh.com/" target="_blank"-->
                    <!--                           style="text-decoration: underline;color: #277AE3">www.penavicowh.com</a><br/>-->
                  </div>
                </el-col>
                <!--百度地图-->
                <el-col :span="10">
                  <div class="container-body-content-box6-serviceArea2-contactUs3-mapBox">
                    <baidu-map class="container-body-content-box6-serviceArea2-contactUs3-mapBox-map" @ready="mapReady"
                               :scroll-wheel-zoom="true">
                      <bm-marker @click="infoWindowOpen" :position=this.point1 animation="BMAP_ANIMATION_BOUNCE"
                                 :show="show">
                        <bm-info-window :position=this.point1 title="Address" :show="show" @close="infoWindowClose"
                                        @click="infoWindowOpen">
                          <p>53 Linhai Road,NanshanDistrict,Shenzhen,PRC Shenzhen Qianhaiwan Free Trade Port Area.</p>
                        </bm-info-window>
                      </bm-marker>
                    </baidu-map>
                  </div>
                </el-col>
              </el-row>
            </div>
          </div>
        </el-col>
      </el-row>

      <!--招商邮服模块-->
      <el-row class="container-body-content" v-if="selectItem==='招商邮服'">
        <!--招商邮服左边标题选择栏-->
        <el-col class="container-body-content-box">
          <div class="container-body-content-box-left">
            <div class="container-body-content-box-left-title4">
              <span class="container-body-content-box-left-title-content">Cruise Business</span>
              <span class="container-body-content-box-left-title-line"></span>
            </div>

            <div
              :class="selectSubItem5==='简介'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem5==='简介'?'aClass1':'aClass2'" @click="handleSelectSubTitle5('简介')">
                Introduction
              </div>
            </div>

            <div
              :class="selectSubItem5==='业务范围'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem5==='业务范围'?'aClass1':'aClass2'" @click="handleSelectSubTitle5('业务范围')">Business
                Scope
              </div>
            </div>

            <div
              :class="selectSubItem5==='联系我们'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem5==='联系我们'?'aClass1':'aClass2'" @click="handleSelectSubTitle5('联系我们')">Contact
                Us
              </div>
            </div>
          </div>
        </el-col>
        <!--招商邮服——简介内容描述-->
        <el-col class="container-body-content-box3" v-if="selectSubItem5==='简介'">
          <div class="container-body-content-box3-center">
            <div>
              <div class="container-body-content-box3-center-title">Introduction</div>
              <div class="container-body-content-box3-center-content">
                <div class="container-body-content-box3-center-content-substance6">
                  <p>
                    CHINA MERCHANTS CRUISES SERVICE SHENZHEN （CMCS）was established in 2016, is a representative
                    enterprise during the period in which China Merchants Group approaching to high-end tourism industry
                    chain. Since its operation, CMCS has been insistently guided by the integration service of Port &
                    Shipping, and communication of resource, to perform with advantageous logistics supplying, to strive
                    for continuous professional growth, thus accelerating the improvement of the entire layout in
                    cruises industry belong to CM Group.</p>
                  <p>
                    The major scope of services includes providing cruise procurement of provision & ship stores and
                    hotel materials, management for bonded transit, supplying cruise marine service and yacht shipping
                    agency. In addition, customized service for vendors and group passengers is also provided.</p>
                </div>
              </div>
            </div>
          </div>
        </el-col>
        <!--招商邮服——简介右边图片-->
        <el-col class="container-body-content-box2" v-if="selectSubItem5==='简介'">
          <div class="container-body-content-box2-right5"></div>
        </el-col>
        <!--招商邮服——业务范围内容描述-->
        <el-col class="container-body-content-box5" v-if="selectSubItem5==='业务范围'">
          <div class="container-body-content-box5-serviceArea">
            <div class="container-body-content-box5-serviceArea-title">Business Scope</div>
            <div class="container-body-content-box5-serviceArea-content">
              <el-row :gutter="20">
                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-01.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">Bonded logistics</div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box5">
                    <el-row>
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">Centralized distribution
                          of cruise ships' global procurement products
                        </div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">Bonded cargo
                          transshipment
                        </div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">Duty-free goods
                          transshipment, etc.
                        </div>
                      </el-col>
                    </el-row>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-02.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">Procurement of cruise materials
                    </div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box5">
                    <el-row>
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">Ship food</div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">Hotel Supplies</div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">Ship accessories</div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">Purchasing and
                          declaration of ship fuel, etc.
                        </div>
                      </el-col>
                    </el-row>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-03.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">International Shipping Agency
                    </div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box5">
                    <el-row>
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">Ship joint inspection
                        </div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">Crew and passenger
                          declaration procedures
                        </div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">Shipowner services etc.
                        </div>
                      </el-col>
                    </el-row>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-04.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">Related supporting services</div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box5">
                    <el-row>
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">Crew transfer</div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">Reception of dirty oil
                          water and tank washing water
                        </div>
                      </el-col>
                    </el-row>
                  </div>
                </el-col>
              </el-row>

            </div>
          </div>

        </el-col>
        <!--招商邮服——联系我们内容描述-->
        <el-col class="container-body-content-box6" v-if="selectSubItem5==='联系我们'">
          <div class="container-body-content-box6-serviceArea2">
            <div class="container-body-content-box6-serviceArea2-contactUs3">
              <el-row>
                <!--联系我们信息内容-->
                <el-col :span="14" style="padding-top: 40px">
                  <div class="container-body-content-box6-serviceArea2-contactUs2-title">
                    CHINA MERCHANTS CRUISES SERVICE SHENZHEN
                  </div>
                  <div class="container-body-content-box6-serviceArea2-contactUs2-content">
                    <el-row>
                      <el-col style="width: 32px;">
                        Add:
                      </el-col>
                      <el-col :span="19" style="margin-left: 10px">
                        Shekou Cruise Terminal · Shenzhen · PRC（Shekou Free Trade Zone）
                      </el-col>
                    </el-row>
                    P.C.: 518066<br/>
                    Tel: 86-755-26880891<br/>
                    E-mail: <a title="Click send email"
                               href="mailto:cmcs@cmhk.com?subject=Please enter the subject name&body=Please enter the message">cmcs@cmhk.com</a><br/>
                    Website: <a href="http://www.cmcs1872.com/" target="_blank"
                                style="text-decoration: underline;color: #277AE3">www.cmcs1872.com</a><br/>
                  </div>
                </el-col>
                <!--百度地图-->
                <el-col :span="10">
                  <div class="container-body-content-box6-serviceArea2-contactUs3-mapBox">
                    <baidu-map class="container-body-content-box6-serviceArea2-contactUs3-mapBox-map" @ready="mapReady2"
                               :scroll-wheel-zoom="true">
                      <bm-marker @click="infoWindowOpen2" :position=this.point3 animation="BMAP_ANIMATION_BOUNCE"
                                 :show="show2">
                        <bm-info-window :position=this.point3 title="Address" :show="show2" @close="infoWindowClose2"
                                        @click="infoWindowOpen2">
                          <p>Shekou Cruise Terminal · Shenzhen · PRC（Shekou Free Trade Zone）
                          </p>
                        </bm-info-window>
                      </bm-marker>
                    </baidu-map>
                  </div>
                </el-col>
              </el-row>
            </div>
          </div>
        </el-col>
      </el-row>
    </div>

    <!--页脚模块-->
    <Footer></Footer>
  </div>
</template>

<script>
  import Header from '@/views/public/header-En/header' //引入页头
  import Footer from '@/views/public/footer-En/footer' //引入页尾

  export default {
    name: 'service-area-En',
    components: {Footer, Header},
    data() {
      return {
        center1: {
          lng: '113.926748',
          lat: '22.50255'
        },
        center2: {
          lng: '114.26011',
          lat: '22.575021'
        },
        center3: {
          lng: '113.869685',
          lat: '22.537454'
        },
        point3: {},
        point4: {},
        point5: {},
        point6: {},
        point7: {},
        point8: {},
        point9: {},
        point10: {},
        point11: {},
        point12: {},
        point13: {
          lng: '113.869685',
          lat: '22.537454'
        },
        point14: {},
        show: 'true', //报关报检中联系我们的地图窗口信息是否打开
        show2: 'true',//招商邮服中联系我们的地图窗口信息是否打开
        show3: 'true',
        show4: 'true',
        show5: true,//招商邮服中联系我们的地图窗口信息是否打开
        show6: true,
        show7: true,
        point1: {},//地址标注坐标
        point2: {},//窗口信息坐标
        activeIndex: '3',//标识当前页面为服务范围
        selectItem: '船舶代理',//默认打开页面时显示船舶代理内容
        selectSubItem: '班轮及非班轮',//默认打开页面时显示船舶代理中的第一项内容
        contactUsItem: '西部港区（蛇口/赤湾/妈湾）',//默认打开船舶代理的联系我们时，选中西部港区
        selectSubItem2: '简介',//默认打开国际货运为简介内容
        selectSubItem3: '简介',//默认打开报税仓储为简介内容
        selectSubItem4: '简介',//默认打开报关报检为简介内容
        selectSubItem5: '简介' //默认打开招商邮服为简介内容
      }
    },
    created() {
      // 如果不是根据 #/serviceArea?selectItem=''这种链接传来的话，默认显示内容为船舶代理
      if (this.$route.query.selectItem !== undefined) {
        this.selectItem = this.$route.query.selectItem
      } else {
        this.selectItem = '船舶代理'
      }
    },
    // 监听路由变化时，页面跳转
    watch: {
      '$route'(to) {
        if (to.query.selectItem !== undefined) {
          this.selectItem = to.query.selectItem
          to.query.selectItem = undefined
        } else {
          this.selectItem = '船舶代理'
        }
      }
    },
    methods: {
      // 报关报检-地图信息窗口的关闭
      // 报关报检-地图信息窗口的关闭
      infoWindowClose() {
        this.show = 'false'
        this.show2 = 'false'
        this.show3 = 'false'
        this.show4 = 'false'
        this.show5 = 'false'
        this.show6 = 'false'
        this.show7 = 'false'
      },
      // 报关报检-地图信息窗口的开启
      infoWindowOpen() {
        this.show = 'true'
        this.show2 = 'false'
        this.show3 = 'false'
        this.show4 = 'false'
        this.show5 = 'false'
        this.show6 = 'false'
        this.show7 = 'false'
      },
      // 招商邮服-地图信息窗口的关闭
      infoWindowClose2() {
        this.show = 'false'
        this.show2 = 'false'
        this.show3 = 'false'
        this.show4 = 'false'
        this.show5 = 'false'
        this.show6 = 'false'
        this.show7 = 'false'
      },
      // 招商邮服-地图信息窗口的开启
      infoWindowOpen2() {
        this.show = 'false'
        this.show2 = 'true'
        this.show3 = 'false'
        this.show4 = 'false'
        this.show5 = 'false'
        this.show6 = 'false'
        this.show7 = 'false'
      },
      // 招商邮服-地图信息窗口的关闭
      infoWindowClose3() {
        this.show = 'false'
        this.show2 = 'false'
        this.show3 = 'false'
        this.show4 = 'false'
        this.show5 = 'false'
        this.show6 = 'false'
        this.show7 = 'false'
      },
      // 招商邮服-地图信息窗口的开启
      infoWindowOpen3() {
        this.show = 'false'
        this.show2 = 'false'
        this.show3 = 'true'
        this.show4 = 'false'
        this.show5 = 'false'
        this.show6 = 'false'
        this.show7 = 'false'
      },
      // 招商邮服-地图信息窗口的关闭
      infoWindowClose4() {
        this.show = 'false'
        this.show2 = 'false'
        this.show3 = 'false'
        this.show4 = 'false'
        this.show5 = 'false'
        this.show6 = 'false'
        this.show7 = 'false'
      },
      // 招商邮服-地图信息窗口的开启
      infoWindowOpen4() {
        this.show = 'false'
        this.show2 = 'false'
        this.show3 = 'false'
        this.show4 = 'true'
        this.show5 = 'false'
        this.show6 = 'false'
        this.show7 = 'false'
      },
      infoWindowClose5() {
        this.show = 'false'
        this.show2 = 'false'
        this.show3 = 'false'
        this.show4 = 'false'
        this.show5 = 'false'
        this.show6 = 'false'
        this.show7 = 'false'
      },
      // 招商邮服-地图信息窗口的开启
      infoWindowOpen5() {
        this.show = 'false'
        this.show2 = 'false'
        this.show3 = 'false'
        this.show4 = 'false'
        this.show5 = 'true'
        this.show6 = 'false'
        this.show7 = 'false'
      },
      infoWindowClose6() {
        this.show = 'false'
        this.show2 = 'false'
        this.show3 = 'false'
        this.show4 = 'false'
        this.show5 = 'false'
        this.show6 = 'false'
        this.show7 = 'false'
      },
      // 招商邮服-地图信息窗口的开启
      infoWindowOpen6() {
        this.show = 'false'
        this.show2 = 'false'
        this.show3 = 'false'
        this.show4 = 'false'
        this.show5 = 'false'
        this.show6 = 'true'
        this.show7 = 'false'
      },
      infoWindowClose7() {
        this.show = 'false'
        this.show2 = 'false'
        this.show3 = 'false'
        this.show4 = 'false'
        this.show5 = 'false'
        this.show6 = 'false'
        this.show7 = 'false'
      },
      // 招商邮服-地图信息窗口的开启
      infoWindowOpen7() {
        this.show = 'false'
        this.show2 = 'false'
        this.show3 = 'false'
        this.show4 = 'false'
        this.show5 = 'false'
        this.show6 = 'false'
        this.show7 = 'true'
      },
      mapReady({BMap, map}) {
        //为地图添加坐标
        this.point1 = new BMap.Point(113.884541, 22.509881)
        this.point2 = new BMap.Point(113.885004, 22.511261)
        map.centerAndZoom(this.point1, 16)  //设置中心和缩放级别
        map.setCenter(this.point2)          //设置显示中心点
      },
      mapReady2({BMap, map}) {
        //为地图添加坐标
        this.point3 = new BMap.Point(113.919967, 22.474665)
        this.point4 = new BMap.Point(113.919967, 22.474665)
        map.centerAndZoom(this.point3, 16)  //设置中心和缩放级别
        map.setCenter(this.point4)          //设置显示中心点
      },
      mapReady3({BMap, map}) {
        //为地图添加坐标
        this.point5 = new BMap.Point(114.070175,22.54791)
        this.point6 = new BMap.Point(114.070166,22.548112)
        map.centerAndZoom(this.point5, 16)  //设置中心和缩放级别
        map.setCenter(this.point6)          //设置显示中心点
      },
      mapReady4({BMap, map}) {
        //为地图添加坐标
        this.point7 = new BMap.Point(113.885799,22.506157)
        this.point8 = new BMap.Point(113.885681,22.507803)
        map.centerAndZoom(this.point7, 16)  //设置中心和缩放级别
        map.setCenter(this.point8)          //设置显示中心点
      },
      // 船舶代理选择栏目的方法
      handleSelectSubTitle(item) {
        this.selectSubItem = item
        if (this.selectSubItem === '联系我们') {
          this.contactUsItem = '西部港区（蛇口/赤湾/妈湾）'
        }
      },
      // 服务范围菜单栏选择的方法
      handleSelectMenu(item) {
        this.selectItem = item
        if (item === '船舶代理') {
          this.selectSubItem = '班轮及非班轮'
        } else if (item === '国际货运') {
          this.selectSubItem2 = '简介'
        } else if (item === '报税仓储') {
          this.selectSubItem3 = '简介'
        } else if (item === '报关报检') {
          this.selectSubItem4 = '简介'
        } else if (item === '招商邮服') {
          this.selectSubItem5 = '简介'
        }
      },

      // 国际货运选择栏目的方法
      handleSelectSubTitle2(item) {
        this.selectSubItem2 = item
      },
      // 报税仓储选择栏目的方法
      handleSelectSubTitle3(item) {
        this.selectSubItem3 = item
      },
      // 报关报检选择栏目的方法
      handleSelectSubTitle4(item) {
        this.selectSubItem4 = item
        if (item === '联系我们') {
          this.show = 'true'
        }
      },
      // 招商邮服选择栏目的方法
      handleSelectSubTitle5(item) {
        this.selectSubItem5 = item
        if (item === '联系我们') {
          this.show2 = 'true'
        }
      },
      // 船舶代理中联系我们选择栏目的方法
      handleSelectContactUsItem(item) {
        this.contactUsItem = item
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>

  /*设置百度地图宽度*/
  #aMap {
    width: 100%;
  }

  /*当栏目选中时，鼠标经过时不显示颜色*/
  .aClass1 {
    cursor: pointer;
  }

  /*当栏目未被选中时，鼠标经过时显示颜色*/
  .aClass2:hover {
    color: #538ED9;
    cursor: pointer;
  }

  .container {
    min-width: 1300px;

    a:hover {
      color: #538ED9;
    }

    .height562 {
      height: 562px;
    }

    /*横幅banner样式*/
    &-banner {
      width: 100%;
      background-size: 100% auto;
      height: 0;
      padding-top: 18.75%;
      background-image: url("../../../assets/front/images/serviceArea/serviceArea-banner-new.png");

      &-title {
        font-family: FZZCHJW--GB1-0, sans-serif;
        font-size: 72px;
        color: #FFFFFF;
        letter-spacing: 30px;
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

    /*内容主体的样式*/
    &-body {
      width: 100%;

      /*服务范围选中标题栏样式*/
      &-row {
        width: 84%;
        margin: 0 8% 0 8%;

        &-box {
          width: 20%;
          height: 60px;
          text-align: center;
          line-height: 60px;
          font-family: PingFangSC-Regular, sans-serif;
          font-size: 18px;
          color: #3B3F47;
          letter-spacing: 0.38px;
        }

        &-box-check {
          width: 20%;
          background-color: #277AE3;
          height: 60px;
          text-align: center;
          line-height: 60px;
          font-family: PingFangSC-Semibold, sans-serif;
          font-size: 18px;
          color: #FFFFFF;
          letter-spacing: 0.38px;
        }
      }

      &-content {
        box-shadow: -2px 4px 5px 0 #f2f2f2 inset;
        padding: 0 8% 0 8%;
        width: 100%;

        &-box {
          width: 20%;

          &-left {
            padding-top: 53px;
            position: relative;
            width: 100%;

            &-title {
              margin-bottom: 38px;
              width: 90%;
              height: 70px;
              background-size: 100% 70px;
              /*background-image: url('../../../assets/front/images/serviceArea/SERVICENETWORKUS.png');*/

              &-content {
                display: inline-block;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 30px;
                color: #277AE3;
                letter-spacing: 0.38px;
                position: absolute;
                top: 68px;
                left: 10%;
              }

              &-line {
                display: inline-block;
                width: 50px;
                height: 4px;
                background: #277AE3;
                position: absolute;
                top: 122px;
                left: 10%;
              }
            }

            &-title1 {
              margin-bottom: 38px;
              width: 90%;
              height: 70px;
              background-size: 100% 70px;
              /*background-image: url('../../../assets/front/images/serviceArea/INTERNATIONALFREIGHT.png');*/

              &-content {
                display: inline-block;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 30px;
                color: #277AE3;
                letter-spacing: 0.38px;
                position: absolute;
                top: 68px;
                left: 10%;
              }

              &-line {
                display: inline-block;
                width: 50px;
                height: 4px;
                background: #277AE3;
                position: absolute;
                top: 122px;
                left: 10%;
              }
            }

            &-title2 {
              margin-bottom: 38px;
              width: 90%;
              height: 70px;
              background-size: 100% 70px;
              /*background-image: url('../../../assets/front/images/serviceArea/TAXDECLARATIONWAREHOUSING.png');*/
            }

            &-title3 {
              margin-bottom: 38px;
              width: 90%;
              height: 70px;
              background-size: 100% 70px;
              /*background-image: url('../../../assets/front/images/serviceArea/baoguanbaojian.png');*/

            }

            &-title4 {
              margin-bottom: 38px;
              width: 90%;
              height: 70px;
              background-size: 100% 70px;
              /*background-image: url('../../../assets/front/images/serviceArea/mailService.png');*/
            }

            &-subTitle {
              height: 44px;
              line-height: 44px;
              font-family: PingFangSC-Regular, sans-serif;
              font-size: 16px;
              color: #3B3F47;
              letter-spacing: 0.38px;
              padding-left: 10%;
            }

            &-subTitle-check {
              line-height: 44px;
              height: 44px;
              font-family: PingFangSC-Regular, sans-serif;
              font-size: 16px;
              color: #277AE3;
              letter-spacing: 0.38px;
              padding-left: 10%;
              background: #E9F1FC;
              border-right: 3px solid #277AE3;
            }
          }
        }

        &-boxBig {
          width: 80%;
          border-left: 2px solid #E8E5E5;

          &-boxNew {
            width: 47%;

            &-center {
              padding: 70px 0 70px 0;
              margin-bottom: 50px;

              &-title {
                font-family: PingFangSC-Semibold, sans-serif;
                font-size: 26px;
                color: #3B3F47;
                letter-spacing: 0.38px;
              }

              &-content {
                &-title1 {
                  margin-top: 25px;
                  margin-bottom: 15px;
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 18px;
                  color: #333;
                  letter-spacing: 0.38px;
                  padding-left: 33px;
                  background-size: 20px 20px;
                  background-repeat: no-repeat;
                  background-image: url('../../../assets/front/icon/serviceArea-icon6.png');
                }

                &-title2 {
                  margin-top: 25px;
                  margin-bottom: 12px;
                  padding-left: 33px;
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 18px;
                  color: #333;
                  letter-spacing: 0.38px;
                  background-size: 20px 20px;
                  background-repeat: no-repeat;
                  background-image: url('../../../assets/front/icon/serviceArea-icon2.png');
                }


                &-substance1 {
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 14px;
                  color: #333;
                  letter-spacing: 0.38px;
                }

                &-substance2 {
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 14px;
                  color: #333;
                  letter-spacing: 0.38px;
                  line-height: 30px;
                }

              }

            }
          }

          &-boxNew2 {
            width: 53%;

            &-center {
              padding: 70px 0 100px 11%;

              &-title {
                font-family: PingFangSC-Semibold, sans-serif;
                font-size: 26px;
                color: #3B3F47;
                letter-spacing: 0.38px;

                &-titleContent {
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 15px;
                  color: #888888;
                  letter-spacing: 0.38px;
                  line-height: 20px;
                }
              }

              &-content {
                &-title1 {
                  margin-top: 25px;
                  margin-bottom: 15px;
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 18px;
                  color: #333;
                  letter-spacing: 0.38px;
                  padding-left: 33px;
                  background-size: 20px 20px;
                  background-repeat: no-repeat;
                  background-image: url('../../../assets/front/icon/serviceArea-icon6.png');
                }

                &-title2 {
                  margin-top: 25px;
                  margin-bottom: 12px;
                  padding-left: 33px;
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 18px;
                  color: #333;
                  letter-spacing: 0.38px;
                  background-size: 20px 20px;
                  background-repeat: no-repeat;
                  background-image: url('../../../assets/front/icon/serviceArea-icon2.png');
                }

                &-title3 {
                  margin-top: 25px;
                  margin-bottom: 12px;
                  padding-left: 33px;
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 18px;
                  color: #5F6F77;
                  letter-spacing: 0.38px;
                  background-size: 20px 20px;
                  background-repeat: no-repeat;
                  background-image: url('../../../assets/front/icon/serviceArea-icon3.png');
                }

                &-title4 {
                  margin-top: 25px;
                  margin-bottom: 12px;
                  padding-left: 33px;
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 18px;
                  color: #5F6F77;
                  letter-spacing: 0.38px;
                  background-size: 20px 20px;
                  background-repeat: no-repeat;
                  background-image: url('../../../assets/front/icon/serviceArea-icon4.png');
                }

                &-title5 {
                  margin-top: 25px;
                  margin-bottom: 12px;
                  padding-left: 33px;
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 18px;
                  color: #5F6F77;
                  letter-spacing: 0.38px;
                  background-size: 20px 20px;
                  background-repeat: no-repeat;
                  background-image: url('../../../assets/front/icon/serviceArea-icon3.png');
                }

                &-substance1 {
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 14px;
                  color: #333;
                  letter-spacing: 0.38px;
                }

                &-substance2 {
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 14px;
                  color: #333;
                  letter-spacing: 0.38px;
                  line-height: 30px;
                }

                &-substance3 {
                  margin-top: 20px;
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 15px;
                  color: #888888;
                  letter-spacing: 0.38px;
                  line-height: 20px;
                }

                &-substance4 {
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 14px;
                  color: #7D929D;
                  letter-spacing: 0.38px;
                  line-height: 20px;
                }

                &-substance5 {
                  margin-top: 15px;
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 14px;
                  color: #7D929D;
                  letter-spacing: 0.38px;
                  line-height: 20px;
                }

                &-substance6 {
                  margin-top: 25px;
                  font-family: PingFangSC-Regular, sans-serif;
                  font-size: 16px;
                  color: #888888;
                  letter-spacing: 0.38px;
                  line-height: 22px;
                }

              }

            }
          }
        }

        &-box1 {
          width: 46%;
          /*height: 562px;*/
          border-left: 2px solid #E8E5E5;

          &-center {
            padding: 70px 0 100px 11%;

            &-title {
              font-family: PingFangSC-Semibold, sans-serif;
              font-size: 26px;
              color: #3B3F47;
              letter-spacing: 0.38px;

              &-titleContent {
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 15px;
                color: #888888;
                letter-spacing: 0.38px;
                line-height: 20px;
              }
            }

            &-content {
              &-title1 {
                margin-top: 25px;
                margin-bottom: 15px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 18px;
                color: #5F6F77;
                letter-spacing: 0.38px;
                padding-left: 33px;
                background-size: 20px 20px;
                background-repeat: no-repeat;
                background-image: url('../../../assets/front/icon/serviceArea-icon6.png');
              }

              &-title2 {
                margin-top: 25px;
                margin-bottom: 12px;
                padding-left: 33px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 18px;
                color: #5F6F77;
                letter-spacing: 0.38px;
                background-size: 20px 20px;
                background-repeat: no-repeat;
                background-image: url('../../../assets/front/icon/serviceArea-icon2.png');
              }

              &-title3 {
                margin-top: 25px;
                margin-bottom: 12px;
                padding-left: 33px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 18px;
                color: #5F6F77;
                letter-spacing: 0.38px;
                background-size: 20px 20px;
                background-repeat: no-repeat;
                background-image: url('../../../assets/front/icon/serviceArea-icon3.png');
              }

              &-title4 {
                margin-top: 25px;
                margin-bottom: 12px;
                padding-left: 33px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 18px;
                color: #5F6F77;
                letter-spacing: 0.38px;
                background-size: 20px 20px;
                background-repeat: no-repeat;
                background-image: url('../../../assets/front/icon/serviceArea-icon4.png');
              }

              &-title5 {
                margin-top: 25px;
                margin-bottom: 12px;
                padding-left: 33px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 18px;
                color: #5F6F77;
                letter-spacing: 0.38px;
                background-size: 20px 20px;
                background-repeat: no-repeat;
                background-image: url('../../../assets/front/icon/serviceArea-icon3.png');
              }

              &-substance1 {
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 14px;
                color: #7D929D;
                letter-spacing: 0.38px;
              }

              &-substance2 {
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 14px;
                color: #7D929D;
                letter-spacing: 0.38px;
                line-height: 25px;
              }

              &-substance3 {
                margin-top: 20px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 15px;
                color: #888888;
                letter-spacing: 0.38px;
                line-height: 20px;
              }

              &-substance4 {
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 14px;
                color: #7D929D;
                letter-spacing: 0.38px;
                line-height: 20px;
              }

              &-substance5 {
                margin-top: 15px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 14px;
                color: #7D929D;
                letter-spacing: 0.38px;
                line-height: 20px;
              }

              &-substance6 {
                margin-top: 25px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 16px;
                color: #888888;
                letter-spacing: 0.38px;
                line-height: 22px;
              }

            }

          }
        }

        &-box2 {
          width: 33%;
          float: right;

          &-right6 {
            margin-top: 120px;
            width: 100%;
            height: 280px;
            background-size: 100% 280px;
            background-repeat: no-repeat;
            background-image: url('../../../assets/front/images/serviceArea/serviceArea-image11.png');
          }

          &-right7 {
            margin-top: 100px;
            width: 100%;
            height: 320px;
            background-size: 100% 320px;
            background-repeat: no-repeat;
            background-image: url('../../../assets/front/images/serviceArea/serviceArea-image14.png');
          }

          &-right {
            margin-top: 120px;
            width: 100%;
            height: 320px;
            background-size: 100% 320px;
            background-repeat: no-repeat;
            background-image: url('../../../assets/front/images/serviceArea/serviceArea-image12.png');
          }

          &-right2 {
            margin-top: 120px;
            width: 100%;
            height: 320px;
            background-size: 100% 320px;
            background-repeat: no-repeat;
            background-image: url('../../../assets/front/images/serviceArea/serviceArea-image15.png');
          }

          &-right3 {
            margin-top: 120px;
            width: 100%;
            height: 300px;
            background-size: 100% 300px;
            background-repeat: no-repeat;
            background-image: url('../../../assets/front/images/serviceArea/serviceArea-image16.png');
          }

          &-right4 {
            margin-top: 120px;
            width: 100%;
            height: 280px;
            background-size: 100% 280px;
            background-repeat: no-repeat;
            background-image: url('../../../assets/front/images/serviceArea/serviceArea-image10.png');
          }

          &-right5 {
            margin-top: 120px;
            width: 100%;
            height: 280px;
            background-size: 100% 280px;
            background-repeat: no-repeat;
            background-image: url('../../../assets/front/images/serviceArea/serviceArea-10.png');
          }
        }

        &-box3 {
          width: 43%;
          border-left: 2px solid #E8E5E5;

          &-center {
            padding: 70px 0 70px 11%;
            margin-bottom: 50px;

            &-title {
              font-family: PingFangSC-Semibold, sans-serif;
              font-size: 26px;
              color: #3B3F47;
              letter-spacing: 0.38px;

              &-titleContent {
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 15px;
                color: #888888;
                letter-spacing: 0.38px;
                line-height: 20px;
              }
            }

            &-content {
              &-title1 {
                margin-top: 25px;
                margin-bottom: 15px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 18px;
                color: #5F6F77;
                letter-spacing: 0.38px;
                padding-left: 33px;
                background-size: 20px 20px;
                background-repeat: no-repeat;
                background-image: url('../../../assets/front/icon/serviceArea-icon6.png');
              }

              &-title2 {
                margin-top: 25px;
                margin-bottom: 12px;
                padding-left: 33px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 18px;
                color: #333;
                letter-spacing: 0.38px;
                background-size: 20px 20px;
                background-repeat: no-repeat;
                background-image: url('../../../assets/front/icon/serviceArea-icon2.png');
              }

              &-title3 {
                margin-top: 25px;
                margin-bottom: 12px;
                padding-left: 33px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 18px;
                color: #333;
                letter-spacing: 0.38px;
                background-size: 20px 20px;
                background-repeat: no-repeat;
                background-image: url('../../../assets/front/icon/serviceArea-icon3.png');
              }

              &-title4 {
                margin-top: 25px;
                margin-bottom: 12px;
                padding-left: 33px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 18px;
                color: #333;
                letter-spacing: 0.38px;
                background-size: 20px 20px;
                background-repeat: no-repeat;
                background-image: url('../../../assets/front/icon/serviceArea-icon4.png');
              }

              &-title5 {
                margin-top: 25px;
                margin-bottom: 12px;
                padding-left: 33px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 18px;
                color: #333;
                letter-spacing: 0.38px;
                background-size: 20px 20px;
                background-repeat: no-repeat;
                background-image: url('../../../assets/front/icon/serviceArea-icon3.png');
              }

              &-substance1 {
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 14px;
                color: #7D929D;
                letter-spacing: 0.38px;
              }

              &-substance2 {
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 14px;
                color: #333;
                letter-spacing: 0.38px;
                line-height: 25px;
              }

              &-substance3 {
                margin-top: 20px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 15px;
                color: #333;
                letter-spacing: 0.38px;
                line-height: 28px;
              }

              &-substance4 {
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 14px;
                color: #333;
                letter-spacing: 0.38px;
                line-height: 25px;
              }

              &-substance5 {
                margin-top: 15px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 14px;
                color: #333;
                letter-spacing: 0.38px;
                line-height: 25px;
              }

              &-substance6 {
                margin-top: 25px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 16px;
                color: #333;
                letter-spacing: 0.38px;
                line-height: 30px;
              }

            }

          }
        }

        &-box4 {
          width: 80%;
          min-height: 650px;
          border-left: 2px solid #E8E8E5;

          &-contactUs {
            padding: 50px 0 100px 6%;

            &-map {
              margin-top: 50px;
              width: 100%;
              height: 500px;
            }

            &-title {
              font-family: PingFangSC-Regular, sans-serif;
              font-size: 18px;
              color: #8096B3;
              letter-spacing: 0.38px;
              height: 60px;
              line-height: 60px;
              text-align: center;
              background: #EDF1F5;
            }

            &-title:hover {
              cursor: pointer;
              color: #EDF1F5;
              background: #8096B3;
            }

            &-title-check {
              font-family: PingFangSC-Regular, sans-serif;
              font-size: 18px;
              color: #277AE3;
              letter-spacing: 0.38px;
              height: 60px;
              line-height: 60px;
              text-align: center;
              background: #FFFFFF;
            }

            &-title-check:hover {
              cursor: pointer;
            }

            &-box {
              margin-top: 25px;
            }

            &-box1 {
              height: 190px;
              padding: 25px 0 25px 25px;
              background: #EDF1F5;
            }

            &-box3 {
              min-height: 248px;
              padding: 25px 0 25px 25px;
              background: #EDF1F5;
            }

            &-box2 {
              padding: 25px 0 25px 25px;
              background: #EDF1F5;
            }

            &-subTitle {
              padding-left: 35px;
              background-size: 21px 21px;
              background-repeat: no-repeat;
              background-image: url('../../../assets/front/icon/serviceArea-icon6.png');
              font-family: PingFangSC-Semibold, sans-serif;
              font-size: 18px;
              color: #3B3F47;
              letter-spacing: 0.5px;
            }

            &-content {
              margin-top: 10px;
              font-family: PingFangSC-Regular, sans-serif;
              font-size: 14px;
              color: #333;
              letter-spacing: 0.38px;
              line-height: 28px;
            }

            &-content a:hover {
              text-decoration: underline;
              color: #277AE3;
            }

            &-content2 {
              margin-top: 10px;
              font-family: PingFangSC-Regular, sans-serif;
              font-size: 14px;
              color: #333;
              letter-spacing: -0.5px;
              line-height: 28px;
            }
          }
        }

        &-box5 {
          width: 80%;
          border-left: 2px solid #E8E5E5;

          &-serviceArea {
            width: 100%;
            padding: 70px 0 100px 6%;

            &-title2 {
              font-family: PingFangSC-Semibold, sans-serif;
              font-size: 26px;
              color: #3B3F47;
              letter-spacing: 0.38px;
              margin-top: 50px;
              margin-bottom: 30px;
            }

            &-title {
              font-family: PingFangSC-Semibold, sans-serif;
              font-size: 26px;
              color: #3B3F47;
              letter-spacing: 0.38px;
            }

            &-content2 {
              height: 130px;
              background: #FFFFFF;
              box-shadow: 0 0 12px 0 rgba(0, 0, 0, 0.1);
              border-radius: 1px;
              position: relative;

              &-img {
                position: absolute;
                width: 80px;
                height: 80px;
                top: 65px;
                margin-top: -40px;
                left: 10px;
                transition: all 0.6s;
              }

              &-img:hover {
                transform: scale(1.2);
                cursor: pointer;
              }

              &-subTitle {
                display: inline-block;
                position: absolute;
                top: 34px;
                left: 100px;
                font-size: 17px;
                font-family: PingFangSC-Medium, sans-serif;
                font-weight: 500;
                color: #000000;
                margin-bottom: 10px;
              }

              &-word {
                display: inline-block;
                position: absolute;
                font-size: 15px;
                font-family: PingFangSC-Medium, sans-serif;
                font-weight: 500;
                color: #888888;
                top: 63px;
                left: 100px;
                margin-right: 15px;
              }
            }

            &-content {
              width: 100%;
              margin-top: 25px;

              &-box {
                position: relative;
                height: 130px;
                border-right: 1px solid rgba(35, 40, 51, 0.1);
                border-bottom: 1px solid rgba(35, 40, 51, 0.1);
              }

              &-box2 {
                position: relative;
                height: 130px;
                border-right: 1px solid rgba(35, 40, 51, 0.1);
              }

              &-box3 {
                height: 72px;
                position: relative;

                &-img {
                  height: 72px;
                }
              }

              &-box5 {
                margin-top: 18px;

                &-radius {
                  margin-top: 6px;
                  display: inline-block;
                  height: 8px;
                  width: 8px;
                  background: #277AE3;
                  border-radius: 50%;
                }

                &-word {
                  margin-left: 6px;
                  display: block;
                  font-size: 16px;
                  font-family: PingFangSC-Regular, sans-serif;
                  font-weight: 400;
                  color: #3B3F47;
                }
              }

              &-img {
                width: 70px;
                height: 70px;
                position: absolute;
                left: 50%;
                margin-left: -40px;
                top: 10px;
                transition: all 0.6s;
              }

              &-img:hover {
                transform: scale(1.2);
                cursor: pointer;
              }

              &-word {
                padding-top: 90px;
                text-align: center;
                font-family: PingFangSC-Semibold, sans-serif;
                font-size: 18px;
                color: #3B3F47;
                letter-spacing: 0.38px;
              }

              &-word2 {
                position: absolute;
                bottom: 0;
                left: 0;
                font-family: PingFangSC-Semibold, sans-serif;
                font-size: 22px;
                color: #3B3F47;
                letter-spacing: 0.38px;
              }

              &-left {
                margin-top: -10px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 16px;
                color: #333;
                letter-spacing: 0.38px;
                line-height: 24px;
              }

              &-right {
                width: 100%;
                height: 200px;

                &-img {
                  width: 100%;
                }
              }

              &-box4 {
                margin-top: 18px;
                font-family: PingFangSC-Regular, sans-serif;
                font-size: 16px;
                color: #3B3F47;
                letter-spacing: 0;
                line-height: 26px;
              }

              &-serviceAreaImage {
                display: inline-block;
                width: 100%;
                height: 200px;

              }

              &-serviceAreaImage2 {
                margin-top: 15%;
                display: inline-block;
                width: 100%;
              }

            }

          }
        }

        &-box6 {
          width: 80%;
          border-left: 2px solid #E8E5E5;

          &-serviceArea2 {
            padding: 70px 0 80px 6%;

            &-contactUs2 {
              height: 360px;
              width: 100%;
              background-position: 70% 0;
              background-repeat: no-repeat;
              background-size: 758px 350px;
              background-image: url('../../../assets/front/images/serviceArea/map.jpg');
              padding-top: 60px;

              &-title {
                font-family: PingFangSC-Semibold, sans-serif;
                font-size: 26px;
                color: #3B3F47;
                letter-spacing: 0.38px;
              }

              &-content {
                margin-top: 25px;
                font-family: PingFangSC-Medium, sans-serif;
                font-size: 16px;
                color: #333;
                letter-spacing: 0.5px;
                line-height: 26px;
              }

            }

            &-contactUs3 {
              width: 100%;

              &-img {
                width: 100%;
                display: inline-block;
              }

              &-title {
                font-family: PingFangSC-Semibold, sans-serif;
                font-size: 26px;
                color: #3B3F47;
                letter-spacing: 0.38px;
              }

              &-content {
                margin-top: 25px;
                font-family: PingFangSC-Medium, sans-serif;
                font-size: 16px;
                color: #333;
                letter-spacing: 0.5px;
                line-height: 26px;
              }

              &-mapBox {
                width: 100%;

                &-map {
                  width: 100%;
                  height: 300px;
                }
              }
            }

          }
        }
      }


    }

    @media screen and (max-width: 1660px) {
      .container-body-content-box-left-title-content {
        font-size: 25px;
      }
    }
    @media screen and (max-width: 1500px) {
      .container-body-content-box-left-title1-content {
        font-size: 22px !important;
      }
    }
    /*当分辨率少于1400px时，报关报检-业务范围的业务类型二样式改变*/
    @media screen and (max-width: 1400px) {
      .container-body-content-box5-serviceArea-content-serviceAreaImage2 {
        margin-top: 30%;
        display: inline-block;
        width: 100%;
      }
      .container-body-content-box5-serviceArea-content-right {
        margin-top: 60px;
      }
    }
    @media screen and (max-width: 1500px) {
      .container-body-content-box-left-title-content {
        font-size: 22px;
      }
      .container-body-row-box {
        font-size: 14px;
      }
      .container-body-row-box-check {
        font-size: 14px;
      }
      .container-body-content-box-left-title1-content {
        font-size: 22px !important;
      }
      .container-body-content-box5-serviceArea-content2-subTitle {
        font-size: 14px;
      }
    }
  }
</style>
