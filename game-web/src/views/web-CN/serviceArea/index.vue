<template>
  <div class="container">
    <!--导航栏模块-->
    <Header :active-index="activeIndex"></Header>

    <!--横幅banner模块-->
    <div class="container-banner">
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-title animate__animated animate__bounceInDown">服务范围</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-content animate__animated animate__bounceInDown">SCOPE OF SERVICES</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
    </div>

    <!--服务范围内容模块-->
    <div class="container-body">
      <!--服务范围选择标题栏-->
      <el-row class="container-body-row">
        <el-col :class="selectItem==='船舶代理'?'container-body-row-box-check':'container-body-row-box'">
          <span :class="selectItem==='船舶代理'?'aClass1':'aClass2'" @click="handleSelectMenu('船舶代理')">船舶代理</span>
        </el-col>

        <el-col :class="selectItem==='国际货运'?'container-body-row-box-check':'container-body-row-box'">
          <span :class="selectItem==='国际货运'?'aClass1':'aClass2'" @click="handleSelectMenu('国际货运')">国际货运</span>
        </el-col>

        <el-col :class="selectItem==='报税仓储'?'container-body-row-box-check':'container-body-row-box'">
          <span :class="selectItem==='报税仓储'?'aClass1':'aClass2'" @click="handleSelectMenu('报税仓储')">保税仓储</span>
        </el-col>

        <el-col :class="selectItem==='报关报检'?'container-body-row-box-check':'container-body-row-box'">
          <span :class="selectItem==='报关报检'?'aClass1':'aClass2'" @click="handleSelectMenu('报关报检')">报关报检</span>
        </el-col>

        <el-col :class="selectItem==='招商邮服'?'container-body-row-box-check':'container-body-row-box'">
          <span :class="selectItem==='招商邮服'?'aClass1':'aClass2'" @click="handleSelectMenu('招商邮服')">招商邮服</span>
        </el-col>
      </el-row>

      <!--船舶代理模块-->
      <el-row class="container-body-content" v-if="selectItem==='船舶代理'">
        <!--船舶代理左边标题选择栏-->
        <el-col class="container-body-content-box">
          <div class="container-body-content-box-left">
            <div class="container-body-content-box-left-title">
              <span class="container-body-content-box-left-title-content">船舶代理</span>
              <span class="container-body-content-box-left-title-line"></span>
            </div>

            <div
              :class="selectSubItem==='班轮及非班轮'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem==='班轮及非班轮'?'aClass1':'aClass2'" @click="handleSelectSubTitle('班轮及非班轮')">
                班轮及非班轮/驳运
              </div>
            </div>

            <div
              :class="selectSubItem==='总代理'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem==='总代理'?'aClass1':'aClass2'" @click="handleSelectSubTitle('总代理')">总代理</div>
            </div>

            <div
              :class="selectSubItem==='修船'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem==='修船'?'aClass1':'aClass2'" @click="handleSelectSubTitle('修船')">修船</div>
            </div>

            <div
              :class="selectSubItem==='海洋工程'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem==='海洋工程'?'aClass1':'aClass2'" @click="handleSelectSubTitle('海洋工程')">海洋工程</div>
            </div>

            <!--            <div-->
            <!--              :class="selectSubItem==='驳运'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">-->
            <!--              <div :class="selectSubItem==='驳运'?'aClass1':'aClass2'" @click="handleSelectSubTitle('驳运')">驳运</div>-->
            <!--            </div>-->

            <div
              :class="selectSubItem==='联系我们'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem==='联系我们'?'aClass1':'aClass2'" @click="handleSelectSubTitle('联系我们')">联系我们</div>
            </div>
          </div>

        </el-col>
        <el-col class="container-body-content-boxBig" v-if="selectSubItem==='班轮及非班轮'">
          <el-row :gutter="50">
            <!--船舶代理——班轮及非班轮内容描述-->
            <el-col class="container-body-content-boxBig-boxNew2" v-if="selectSubItem==='班轮及非班轮'">
              <div class="container-body-content-boxBig-boxNew2-center">
                <div class="container-body-content-boxBig-boxNew2-center-title">班轮及非班轮</div>
                <div class="container-body-content-boxBig-boxNew2-center-content">
                  <div class="container-body-content-boxBig-boxNew2-center-content-title1">
                    代理货物
                  </div>
                  <div class="container-body-content-boxBig-boxNew2-center-content-substance1">
                    集装箱、钢材、铁矿、粮食、化肥、油脂、化工品、设备、原木
                  </div>
                  <div class="container-body-content-boxBig-boxNew2-center-content-title2">
                    提供的服务
                  </div>
                  <div class="container-body-content-boxBig-boxNew2-center-content-substance2">
                    1、办理船舶进出港的口岸申报和审批手续，联系安排引航、泊位、装卸等；<br/>
                    2、代理船公司箱管操作；代签提单、运输合同、代办订舱业务；<br/>
                    3、缮制进出口舱单；向海关、国检等口岸单位申报进出口舱单；办理进口放提货单手续；<br/>
                    4、办理出口货物的海关更改船名航次的手续；<br/>
                    5、危险品申报；<br/>
                    6、代收运费、代办结算；<br/>
                    7、洽办船舶检验、修理；安排淡水、代购和转送船用备件、海图等；<br/>
                    8、安排船员就医、遣返；<br/>
                    9、洽办海事处理。<br/>
                  </div>
                </div>
              </div>
            </el-col>
            <!-- 船舶代理——驳运内容描述-->
            <el-col class="container-body-content-boxBig-boxNew" v-if="selectSubItem==='班轮及非班轮'">
              <div class="container-body-content-boxBig-boxNew-center">
                <div class="container-body-content-boxBig-boxNew-center-title">驳运</div>
                <div class="container-body-content-boxBig-boxNew-center-content">
                  <div class="container-body-content-boxBig-boxNew-center-content-title1">
                    代理货物
                  </div>
                  <div class="container-body-content-boxBig-boxNew-center-content-substance1">
                    集装箱、钢材、食用油、机器设备、游艇买卖、游艇展会
                  </div>
                  <div class="container-body-content-boxBig-boxNew-center-content-title2">
                    提供的服务
                  </div>
                  <div class="container-body-content-boxBig-boxNew-center-content-substance2">
                    1. 办理船舶进出港的口岸申报和审批手续，联系安排泊位、装卸等；<br/>
                    2. 代理船公司箱管操作；代签提单、运输合同、代办订舱业务；<br/>
                    3. 缮制进出口舱单；向海关、国检等口岸单位申报进出口舱单；办理进口放提货单手续；<br/>
                    4. 代办国内转关业务；海关空箱调拨申报；<br/>
                    5. 代办危险品申报；<br/>
                    6. 代收运费、代办结算；<br/>
                  </div>
                </div>
              </div>
            </el-col>
          </el-row>
        </el-col>
        <!--船舶代理——班轮及非班轮右边图片-->
        <!--        <el-col class="container-body-content-box2" v-if="selectSubItem==='班轮及非班轮'">-->
        <!--          <div class="container-body-content-box2-right animate__animated animate__fadeIn"></div>-->
        <!--        </el-col>-->
        <!--船舶代理——总代理内容描述-->
        <el-col  class="container-body-content-box3" v-if="selectSubItem==='总代理'">
          <div class="container-body-content-box3-center">
            <div class="container-body-content-box3-center-title">总代理</div>
            <div class="container-body-content-box3-center-content">
              <div class="container-body-content-box3-center-content-substance3">
                在船舶总代理方面具备丰富的操作经验，熟悉中国各大港口情况，对各型船舶有强效的协调控管能力。深圳外代以专业、高效、经济为目标，为客户提供量身定制的增值服务，为客户创造价值。<br/>
                <div style="text-indent: -51px;padding-left: 51px;margin-top: 10px">经济： 各大港口丰富的代理资源积累整合，可提供更贴心到位的服务和优惠的价格，以降低客户成本</div>
                <div style="text-indent: -51px;padding-left: 51px">高效： 及时向客户汇总及更新各港口政策执行及变化情况，以便客户进行统筹调配安排</div>
                <div style="text-indent: -51px;padding-left: 51px">专业： 客户船舶出现任何紧急状况时，将以最快速度提供其在相应港口的最佳解决方案</div>
              </div>
              <div class="container-body-content-box3-center-content-title3">
                服务产品
              </div>
              <div class="container-body-content-box3-center-content-substance4">
                <div>1.　船舶装卸货、坞修、交接总代理</div>
                <div>2.　船东事务保护代理，包括：</div><div style="margin-left: 27px">船员事宜、备件清关送船、人员访船访港、船长借支、安排各种船舶检验以及客户各类委办事项</div>
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
            <div class="container-body-content-box3-center-title">修船</div>
            <div class="container-body-content-box3-center-content">
              <div class="container-body-content-box3-center-content-substance3">
                同各国船东和国内各大船厂保持良好的关系，在全国范围内同友联船厂保持战略合作关系，熟悉修船代理业务流程为船东提供专业、迅捷、贴心的服务。
              </div>
              <div class="container-body-content-box3-center-content-title4">
                代理船型
              </div>
              <div class="container-body-content-box3-center-content-substance5">
                集装箱船舶、散杂货船舶、邮轮、液化石油气船、<br/>
                钻井平台、浮式储油轮
              </div>
              <div class="container-body-content-box3-center-content-title5">
                服务产品
              </div>
              <div class="container-body-content-box3-center-content-substance5">
                船舶进出船厂手续、船东登轮、船员事宜、船长借支、<br/>
                备件清关、船舶供应
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
            <div class="container-body-content-box3-center-title">海洋工程</div>
            <div class="container-body-content-box3-center-content">
              <div class="container-body-content-box3-center-content-substance3">
                具备丰富经验的专业团队为海洋工程项目提供代理服务
              </div>
              <div class="container-body-content-box3-center-content-title2">
                提供的服务
              </div>
              <div class="container-body-content-box3-center-content-substance2">
                1. 办理海洋工程船的进、出港手续<br/>
                2. 办理海洋工程船舶或设备的海关暂进出许可<br/>
                3. 办理工程技术人员居留许可，办理上、下船或平台手续和接送食宿安排<br/>
                4. 办理备件海关监管手续、船用物料的上船清关手续<br/>
                5. 安排办理无动力工程船的拖带证书，航行警告发布<br/>
                6. 安排陆上到海上平台的陆路、水路和直升机运输服务<br/>
                7. 提供施工材物料的物流服务和物料供应<br/>
                8. 项目专业咨询服务<br/>
                9. 其他委托事项<br/>
              </div>
            </div>
          </div>
        </el-col>
        <!--船舶代理——海洋工程右边图片-->
        <el-col class="container-body-content-box2" v-if="selectSubItem==='海洋工程'">
          <div class="container-body-content-box2-right3"></div>
        </el-col>
        <el-col class="container-body-content-box4" v-if="selectSubItem==='联系我们'">
          <!--联系我们内容-->
          <div class="container-body-content-box4-contactUs">
            <!--联系我们选择标题栏-->
            <el-row :gutter="2">
              <el-col :span="8">
                <div
                  :class="contactUsItem==='西部港区（蛇口/赤湾/妈湾）'?'container-body-content-box4-contactUs-title-check':'container-body-content-box4-contactUs-title'"
                  @click="handleSelectContactUsItem('西部港区（蛇口/赤湾/妈湾）')">西部港区（蛇口/赤湾/妈湾）
                </div>
              </el-col>

              <el-col :span="8">
                <div
                  :class="contactUsItem==='东部港区（盐田/大鹏/华安/光汇）'?'container-body-content-box4-contactUs-title-check':'container-body-content-box4-contactUs-title'"
                  @click="handleSelectContactUsItem('东部港区（盐田/大鹏/华安/光汇）')">东部港区(盐田/大鹏/华安/光汇)
                </div>
              </el-col>

              <el-col :span="8">
                <div
                  :class="contactUsItem==='大铲湾码头'?'container-body-content-box4-contactUs-title-check':'container-body-content-box4-contactUs-title'"
                  @click="handleSelectContactUsItem('大铲湾码头')">大铲湾码头
                </div>
              </el-col>
            </el-row>

            <!-- 联系我们——西部港区内容-->
            <div class="container-body-content-box4-contactUs-box" v-if="contactUsItem==='西部港区（蛇口/赤湾/妈湾）'">
              <el-row :gutter="20">
                <!--西部港区——班轮操作-->
                <el-col :span="12">
                  <div class="container-body-content-box4-contactUs-box1">
                    <div class="container-body-content-box4-contactUs-subTitle">班轮操作</div>
                    <div class="container-body-content-box4-contactUs-content">
                      电　　话：+86-755-26676604<br/>
                      传　　真：+86-755-26692769<br/>
                      电子邮箱：<a title="点击发送邮件" href="mailto:container@penavicosz.com.cn?subject=请输入主题名&body=请输入邮件内容">container@penavicosz.com.cn</a><br/>
                      值班电话：+86-13925220028（24小时在线）<br/>
                    </div>
                  </div>
                </el-col>
                <!--西部港区——非班轮操作-->
                <el-col :span="12">
                  <div class="container-body-content-box4-contactUs-box1">
                    <div class="container-body-content-box4-contactUs-subTitle">非班轮操作</div>
                    <div class="container-body-content-box4-contactUs-content">
                      电　　话：+86-755-26695216<br/>
                      传　　真：+86-755-26692769<br/>
                      　　　　　+86-755-26689946<br/>
                      电子邮箱：<a title="点击发送邮件" href="mailto:shipping@penavicosz.com.cn?subject=请输入主题名&body=请输入邮件内容">shipping@penavicosz.com.cn</a><br/>
                    </div>
                  </div>
                </el-col>
              </el-row>

              <el-row :gutter="10" style="margin-top: 20px">
                <!--西部港区——驳船操作-->
                <el-col :span="8">
                  <div class="container-body-content-box4-contactUs-box2">
                    <div class="container-body-content-box4-contactUs-subTitle">驳船操作</div>
                    <div class="container-body-content-box4-contactUs-content2">
                      电　　话：+86-755-26880915<br/>
                      　　　　　+86-755-26694340<br/>
                      　　　　　+86-755-26880911<br/>
                      传　　真：+86-755-26692769<br/>
                      　　　　　+86-755-26689946<br/>
                      电子邮箱：<a title="点击发送邮件" href="mailto:feederr@penavicosz.com.cn?subject=请输入主题名&body=请输入邮件内容">feeder@penavicosz.com.cn</a><br/>
                    </div>
                  </div>
                </el-col>
                <!--西部港区——财务结算-->
                <el-col :span="8">
                  <div class="container-body-content-box4-contactUs-box2">
                    <div class="container-body-content-box4-contactUs-subTitle">财务结算</div>
                    <div class="container-body-content-box4-contactUs-content2">
                      电　　话：+86-755-26689771<br/>
                      　　　　　+86-755-26880924<br/>
                      传　　真：+86-755-26692769<br/>
                      电子邮箱：<a title="点击发送邮件" href="mailto:acct@penavicosz.com.cn?subject=请输入主题名&body=请输入邮件内容">acct@penavicosz.com.cn</a><br/>
                    </div>
                  </div>
                </el-col>
                <!--西部港区——单证操作-->
                <el-col :span="8">
                  <div class="container-body-content-box4-contactUs-box2">
                    <div class="container-body-content-box4-contactUs-subTitle">单证操作</div>
                    <div class="container-body-content-box4-contactUs-content2">
                      电　　话：+86-755-26692731<br/>
                      传　　真：+86-755-26687360<br/>
                      电子邮箱：<a title="点击发送邮件" href="mailto:business@penavicosz.com.cn?subject=请输入主题名&body=请输入邮件内容">business@penavicosz.com.cn</a><br/>
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
                  <bm-info-window :position="{   lng: '113.926748', lat: '22.50255'}" title="<h3>详细地址</h3>"
                                  :show="show5" @close="infoWindowClose5">
                    <p style="margin-top: 6px">深圳市南山区蛇口南海大道深圳外代联合大厦1,8,9楼</p>
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
                    <div class="container-body-content-box4-contactUs-subTitle">办公事务及信息服务</div>
                    <div class="container-body-content-box4-contactUs-content">
                      电　　话：+86-755-25290056<br/>
                      传　　真：+86-755-25292870<br/>
                      电子邮箱：<a title="点击发送邮件" href="mailto:itytn@penavicosz.com.cn?subject=请输入主题名&body=请输入邮件内容">itytn@penavicosz.com.cn</a><br/>
                    </div>
                  </div>
                </el-col>
                <!--东部港区——船舶操作-->
                <el-col :span="12">
                  <div class="container-body-content-box4-contactUs-box1">
                    <div class="container-body-content-box4-contactUs-subTitle">船舶操作</div>
                    <div class="container-body-content-box4-contactUs-content">
                      电　　话：+86-755-25290215<br/>
                      传　　真：+86-755-25291400<br/>
                      电子邮箱：<a title="点击发送邮件"
                              href="mailto:shippingytn@penavicosz.com.cn?subject=请输入主题名&body=请输入邮件内容">shippingytn@penavicosz.com.cn</a><br/>
                      值班电话：+86-755-25290215（24小时）
                    </div>
                  </div>
                </el-col>
              </el-row>
              <el-row :gutter="10" style="margin-top: 20px">
                <!--东部港区——单证操作-->
                <el-col :span="8">
                  <div class="container-body-content-box4-contactUs-box3">
                    <div class="container-body-content-box4-contactUs-subTitle">单证操作</div>
                    <div class="container-body-content-box4-contactUs-content2">
                      电　　话：+86-755-25291016<br/>
                      传　　真：+86-755-25290877<br/>
                      电子邮箱：<a title="点击发送邮件"
                              href="mailto:businessytn@penavicosz.com.cn?subject=请输入主题名&body=请输入邮件内容">businessytn@penavicosz.com.cn</a><br/>
                    </div>
                  </div>
                </el-col>
                <!--东部港区——财务结算-->
                <el-col :span="8">
                  <div class="container-body-content-box4-contactUs-box3">
                    <div class="container-body-content-box4-contactUs-subTitle">财务结算</div>
                    <div class="container-body-content-box4-contactUs-content2">
                      电　　话：+86-755-25290221<br/>
                      传　　真：+86-755-25290219<br/>
                      电子邮箱：<a title="点击发送邮件" href="mailto:accountytn@penavicosz.com.cn?subject=请输入主题名&body=请输入邮件内容">accountytn@penavicosz.com.cn</a><br/>
                    </div>
                  </div>
                </el-col>
                <!--东部港区——货物报关-->
                <el-col :span="8">
                  <div class="container-body-content-box4-contactUs-box3">
                    <div class="container-body-content-box4-contactUs-subTitle">货物报关</div>
                    <div class="container-body-content-box4-contactUs-content2">
                      电　　话：+86-755-25292653<br/>
                      传　　真：+86-755-25290075<br/>
                      电子邮箱：<a title="点击发送邮件" href="mailto:brokerytn@penavicosz.com.cn?subject=请输入主题名&body=请输入邮件内容">brokerytn@penavicosz.com.cn</a><br/>
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
          lat: '22.575021'}" title="<h3>详细地址</h3>" :show="show6" @close="infoWindowClose6">
                    <p style="margin-top: 6px">深圳市盐田区沙头角海港大厦主楼810</p>
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
                    <div class="container-body-content-box4-contactUs-subTitle">船舶操作</div>
                    <div class="container-body-content-box4-contactUs-content">
                      电　　话：+86-755-29035025<br/>
                      传　　真：+86-755-29035027<br/>
                      电子邮箱：<a title="点击发送邮件"
                              href="mailto:shippingdcb@penavicosz.com.cn?subject=请输入主题名&body=请输入邮件内容">shippingdcb@penavicosz.com.cn</a><br/>
                      值班电话：+86 13925220028<br/>
                    </div>
                  </div>
                </el-col>
                <!--大铲湾码头——单证操作-->
                <el-col :span="12">
                  <div class="container-body-content-box4-contactUs-box1">
                    <div class="container-body-content-box4-contactUs-subTitle">单证操作</div>
                    <div class="container-body-content-box4-contactUs-content">
                      电　　话：+86-755-29035026<br/>
                      传　　真：+86-755-29035027<br/>
                      电子邮箱：<a title="点击发送邮件" href="mailto:dachan@penavicosz.com.cn?subject=请输入主题名&body=请输入邮件内容">dachan@penavicosz.com.cn</a><br/>
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
                  <bm-info-window :position="{lng: '113.869685',lat: '22.537454'}" title="<h3>详细地址</h3>" :show="show7"
                                  @close="infoWindowClose7">
                    <p style="margin-top: 6px">深圳市宝安区金港大道大铲湾码头一期控制大楼402</p>
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
              <span class="container-body-content-box-left-title1-content">国际货运</span>
              <span class="container-body-content-box-left-title1-line"></span>
            </div>

            <div
              :class="selectSubItem2==='简介'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem2==='简介'?'aClass1':'aClass2'" @click="handleSelectSubTitle2('简介')">简介</div>
            </div>

            <div
              :class="selectSubItem2==='业务范围'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem2==='业务范围'?'aClass1':'aClass2'" @click="handleSelectSubTitle2('业务范围')">业务范围
              </div>
            </div>

            <div
              :class="selectSubItem2==='联系我们'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem2==='联系我们'?'aClass1':'aClass2'" @click="handleSelectSubTitle2('联系我们')">联系我们
              </div>
            </div>

          </div>
        </el-col>
        <!--国际货运——简介内容描述-->
        <el-col class="container-body-content-box3" v-if="selectSubItem2==='简介'">
          <div class="container-body-content-box3-center">
            <div class="container-body-content-box3-center-title">简介</div>
            <div class="container-body-content-box3-center-content">
              <div class="container-body-content-box3-center-content-substance6">
                <p>
                  深圳市外代国际货运有限公司成立于1993年，是深圳外代的全资子公司。早在1993年即已获得国家外经贸部批准的一级货代资质，也是深圳市最早获得交通部国际货运代理业务资格的企业之一，公司一直专注于打造现代综合物流服务，目前在中国的华东、华北、华南等沿海城市已设立有了二十多家分支机构；公司一直秉承着“WE
                  ARE FOR
                  YOU”的经营理念，经过多年的业务发展，公司形成了以海运和空运为核心，以仓储、跨境电商、小包快递、国内物流、拼箱、船东代理、海外代理、铁路货物运输、散杂货运输、海铁联运、江海联运及特种柜为补充的新型业务结构，为客户提供最佳物流方案和一站式全程物流服务。
                </p>
                <p>
                  公司配备有先进、完善的货运作业设施和操作系统，与全球数十家航运公司和航空公司建立了长期的合作关系，与海外近200个国家的代理建立起了长年的密切合作关系，能够给客户提供富有竞争力的运价，全方位地为广大客户提供海陆空一条龙配套服务。</p>
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
            <div class="container-body-content-box5-serviceArea-title">经营范围</div>
            <div class="container-body-content-box5-serviceArea-content">
              <el-row>
                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon7.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">海运服务</div>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon8.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">空运服务</div>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon9.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">拼箱服务</div>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box" style="border-right: none">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon10.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">仓储服务</div>
                  </div>
                </el-col>
              </el-row>

              <el-row>
                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box2">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon13.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">海外代理</div>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box2">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon11.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">多式联运</div>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box2">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon12.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">特种柜</div>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box2" style="border-right: none">
                    <img class="container-body-content-box5-serviceArea-content-img"
                         src="../../../assets/front/icon/serviceArea-icon14.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word">医疗器械运输</div>
                  </div>
                </el-col>
              </el-row>
            </div>

            <!--业务范围优势和资源-->
            <div style="margin-top: 40px;">
              <div class="container-body-content-box5-serviceArea-title">优势和资源</div>
              <div class="container-body-content-box5-serviceArea-content">
                <el-row>
                  <el-col :span="12">
                    <div class="container-body-content-box5-serviceArea-content-left">
                      <p>分布在全国的20家分公司和300多家遍布全球的海外代理可以在不同的地区提供优质的服务，满足客户多样化的需求。这种链接式的操作使得原本方便、快捷、经济的高效服务更加天衣无缝。</p>
                      <p>
                        具有丰富知识及经验的专业人员能及时有效的跟客户提供海运、空运、报关、内陆运输、仓储等全面的服务。多元化的海运增值服务。</p>
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
                    深圳市外代国际货运有限公司
                  </div>
                  <div class="container-body-content-box6-serviceArea2-contactUs3-content">
                    <el-row>
                      <el-col style="width: 68px;">
                        地&nbsp;&nbsp;&nbsp;&nbsp;址：
                      </el-col>
                      <el-col :span="19">
                        深圳市福田区金田路4018号安联大厦20楼全层
                      </el-col>
                    </el-row>
                    邮　编：518026<br/>
                    电　话：+86-755-88284699 / 88284700<br/>
                    传　真：+86-755-88284650<br/>
                    邮　箱：<a title="点击发送邮件" href="mailto:boeven.wu@penavicocargo.com?subject=请输入主题名&body=请输入邮件内容">boeven.wu@penavicocargo.com</a><br/>
                    网　址：<a href="http://www.penavicocargo.com/" target="_blank"
                           style="text-decoration: underline;color:#277AE3">www.penavicocargo.com</a><br/>
                  </div>
                </el-col>
                <!--百度地图-->
                <el-col :span="10">
                  <div class="container-body-content-box6-serviceArea2-contactUs3-mapBox">
                    <baidu-map class="container-body-content-box6-serviceArea2-contactUs3-mapBox-map" @ready="mapReady3"
                               :scroll-wheel-zoom="true">
                      <bm-marker @click="infoWindowOpen3" :position=this.point5 animation="BMAP_ANIMATION_BOUNCE"
                                 :show="show3">
                        <bm-info-window :position=this.point6 title="详细地址" :show="show3" @close="infoWindowClose3">
                          <p>深圳市福田区金田路4018号安联大厦20楼全层</p>
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
              <span class="container-body-content-box-left-title-content">保税仓储</span>
              <span class="container-body-content-box-left-title-line"></span>
            </div>

            <div
              :class="selectSubItem3==='简介'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem3==='简介'?'aClass1':'aClass2'" @click="handleSelectSubTitle3('简介')">简介</div>
            </div>

            <div
              :class="selectSubItem3==='业务范围'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem3==='业务范围'?'aClass1':'aClass2'" @click="handleSelectSubTitle3('业务范围')">业务范围
              </div>
            </div>

            <div
              :class="selectSubItem3==='联系我们'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem3==='联系我们'?'aClass1':'aClass2'" @click="handleSelectSubTitle3('联系我们')">联系我们
              </div>
            </div>
          </div>
        </el-col>
        <!--报税仓储——简介内容描述-->
        <el-col class="container-body-content-box3" style="height: 500px" v-if="selectSubItem3==='简介'">
          <div class="container-body-content-box3-center">
            <div class="container-body-content-box3-center-title">简介</div>
            <div class="container-body-content-box3-center-content">
              <div class="container-body-content-box3-center-content-substance6">
                <p>
                  深圳市外代仓储有限公司成立于2010年，是深圳外代的全资子公司，海关AEO高级认证企业。前海保税仓库总面积6.6万平方米，总投资2.5亿元人民币。公司在前海湾保税港区海关的政策支持下，敢于创新和探索，在传统保税仓储业务模式之外，还拓展了“全球中心仓”、“港店深仓”、“跨境电商服务”、“供应链及供应链金融”、“保税+邮轮物料供应”等亮点业务模式，为解决客户多元化的业务需求提供专业周到的服务。</p>
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
            <div class="container-body-content-box5-serviceArea-title">业务类型一</div>
            <div class="container-body-content-box5-serviceArea-content">
              <el-row style="margin-left: -30px;">
                <el-col :span="7" style="padding-left: 30px;padding-right: 30px">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-01.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">进口分销仓储-案例</div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box4">
                    某客户在国内有很多的买家，客户一次性的将进口货物放到深圳外代前海保税仓库，然后分批分量的报关进口，然后送货给到买家，节省物流费用。
                  </div>
                </el-col>

                <el-col :span="7" style="padding-left: 30px;padding-right: 30px">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-02.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">进口分销仓储-优势</div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box4">
                    A：无需一次性缴纳关税，分批进口分批缴纳，为企业节省大量的积压税款。<br/>
                    B：仓库的堆存费用远低于码头的费用。
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
              <div class="container-body-content-box5-serviceArea-title">业务类型二</div>
              <div class="container-body-content-box5-serviceArea-content">
                <el-row style="margin-left: -30px;">
                  <el-col :span="12" style="padding-left: 30px;padding-right: 30px">
                    <div class="container-body-content-box5-serviceArea-content-box3">
                      <img class="container-body-content-box5-serviceArea-content-box3-img"
                           src="../../../assets/front/images/serviceArea/serviceArea-01.png" alt=""/>
                      <div class="container-body-content-box5-serviceArea-content-word2">提前办理出口退税-案例</div>
                    </div>

                    <div class="container-body-content-box5-serviceArea-content-box4">
                      某出口企业，产品完成生产急需出口却未找到买家或需要提前退税。由于深圳外代前海仓库所属的前海保税港区有入区（视为出口）即退税的政策，该企业先把产品出口到深圳外代前海的保税仓库，然后根据实际情况进行出口到国外。相比直接出口到国外，企业能提前办理出口退税，而其中仅需付出一点点仓库的使用费用，对于好多靠出口退税生存的企业无疑是一个非常好的解决方案。
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
              <div class="container-body-content-box5-serviceArea-title">业务类型三</div>
              <div class="container-body-content-box5-serviceArea-content">
                <el-row style="margin-left: -30px;">
                  <el-col :span="12" style="padding-left: 30px;padding-right: 30px">
                    <div class="container-body-content-box5-serviceArea-content-box3">
                      <img class="container-body-content-box5-serviceArea-content-box3-img"
                           src="../../../assets/front/images/serviceArea/serviceArea-01.png" alt=""/>
                      <div class="container-body-content-box5-serviceArea-content-word2">出口转内销-案例</div>
                    </div>

                    <div class="container-body-content-box5-serviceArea-content-box4">
                      某企业的产品需要出口转内销，之前的操作模式是出口到香港或境外，然后再从香港或境外进口到国内。现在利用深圳外代前海保税仓库的政策，入区即视为出口。相比直接出口到香港或境外，给企业大大的减少了物流成本。
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
              <div class="container-body-content-box5-serviceArea-title">业务类型四</div>
              <div class="container-body-content-box5-serviceArea-content">
                <el-row style="margin-left: -30px;">
                  <el-col :span="12" style="padding-left: 30px;padding-right: 30px">
                    <div class="container-body-content-box5-serviceArea-content-box3">
                      <img class="container-body-content-box5-serviceArea-content-box3-img"
                           src="../../../assets/front/images/serviceArea/serviceArea-01.png" alt=""/>
                      <div class="container-body-content-box5-serviceArea-content-word2">两个企业之间的转厂</div>
                    </div>

                    <div class="container-body-content-box5-serviceArea-content-box4">
                      广州A公司的产品如显示屏要卖给深圳的B公司作为料件，如直接办理从A公司到B公司，手续很繁琐，时间也比较长。现在利用深圳外代前海保税仓库来转厂，手续非常简便。A公司直接把产品出口到外代保税仓库，B公司从外代保税仓库进口这批货物。
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
                    深圳市外代仓储有限公司
                  </div>
                  <div class="container-body-content-box6-serviceArea2-contactUs3-content">
                    <el-row>
                      <el-col style="width: 68px;">
                        地&nbsp;&nbsp;&nbsp;&nbsp;址：
                      </el-col>
                      <el-col :span="19">
                        深圳市南山区临海大道53号前海湾保税港区（前海自贸区）
                      </el-col>
                    </el-row>
                    邮　编：518054<br/>
                    电　话：+86-755-26822577<br/>
                    邮　箱：<a title="点击发送邮件" href="mailto:liuzimu@penavicocargo.com?subject=请输入主题名&body=请输入邮件内容">liuzimu@penavicocargo.com</a><br/>
                    网　址：<a href="http://www.penavicosz.com.cn" target="_blank"
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
                        <bm-info-window :position=this.point8 title="详细地址" :show="show4" @close="infoWindowClose4">
                          <p>深圳市南山区临海大道53号前海湾保税港区（前海自贸区）</p>
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
              <span class="container-body-content-box-left-title-content">报关报检</span>
              <span class="container-body-content-box-left-title-line"></span>
            </div>

            <div
              :class="selectSubItem4==='简介'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem4==='简介'?'aClass1':'aClass2'" @click="handleSelectSubTitle4('简介')">简介</div>
            </div>

            <div
              :class="selectSubItem4==='业务范围'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem4==='业务范围'?'aClass1':'aClass2'" @click="handleSelectSubTitle4('业务范围')">业务范围
              </div>
            </div>

            <div
              :class="selectSubItem4==='联系我们'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem4==='联系我们'?'aClass1':'aClass2'" @click="handleSelectSubTitle4('联系我们')">联系我们
              </div>
            </div>
          </div>
        </el-col>
        <!--报关报检——简介内容描述-->
        <el-col class="container-body-content-box3" style="height: 500px" v-if="selectSubItem4==='简介'">
          <div class="container-body-content-box3-center">
            <div class="container-body-content-box3-center-title">简介</div>
            <div class="container-body-content-box3-center-content">
              <div class="container-body-content-box3-center-content-substance6">
                <p>
                  深圳市外代报关有限公司成立于2005年，是深圳外代下属全资子公司，海关AEO高级认证企业。公司以从事货物进出口代理关务及“云极通”线上增值服务为主，业务主要涉及食品、酒、生鲜果蔬、日用品、服装、大型机械、大宗产品、化妆品及母婴用品等，以专业化的团队为广大客户提供优质、高效的服务。</p>
              </div>
            </div>
          </div>
        </el-col>
        <!--        <el-col class="container-body-content-box5" v-if="selectSubItem4==='简介'">-->
        <!--          <div class="container-body-content-box5-serviceArea">-->
        <!--            &lt;!&ndash;报关报检——服务项目内容&ndash;&gt;-->
        <!--            <div class="container-body-content-box5-serviceArea-title">服务项目</div>-->
        <!--            <div class="container-body-content-box5-serviceArea-content">-->
        <!--              <el-row>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon15.png" alt=""/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">报税仓储</div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon16.png" alt=""/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">转厂服务</div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon17.png" alt=""/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">转口贸易</div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box" style="border-right: none">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon18.png" alt/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">集装箱拼拆</div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--              </el-row>-->
        <!--              <el-row>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box2">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon19.png" alt=""/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">物流信息处理</div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box2">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon20.png" alt=""/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">国际采购</div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box2">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon21.png" alt=""/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">国际配送</div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--                <el-col :span="6">-->
        <!--                  <div class="container-body-content-box5-serviceArea-content-box2" style="border-right: none">-->
        <!--                    <img class="container-body-content-box5-serviceArea-content-img"-->
        <!--                         src="../../../assets/front/icon/serviceArea-icon22.png" alt=""/>-->
        <!--                    <div class="container-body-content-box5-serviceArea-content-word">简单加工附加值服务</div>-->
        <!--                  </div>-->
        <!--                </el-col>-->
        <!--              </el-row>-->
        <!--            </div>-->

        <!--            &lt;!&ndash;报关报检——外代报税仓内容&ndash;&gt;-->
        <!--            <div class="container-body-content-box5-serviceArea-title2">外代保税仓-增值服务</div>-->
        <!--            <el-row :gutter="25" style="margin-bottom:28px">-->
        <!--              <el-col :span="8">-->
        <!--                <div class="container-body-content-box5-serviceArea-content2">-->
        <!--                  <img class="container-body-content-box5-serviceArea-content2-img"-->
        <!--                       src="../../../assets/front/icon/serviceArea-icon23.png" alt=""/>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-subTitle">分货捡货</div>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-word">分货捡货的一段简单的描述</div>-->
        <!--                </div>-->
        <!--              </el-col>-->
        <!--              <el-col :span="8">-->
        <!--                <div class="container-body-content-box5-serviceArea-content2">-->
        <!--                  <img class="container-body-content-box5-serviceArea-content2-img"-->
        <!--                       src="../../../assets/front/icon/serviceArea-icon24.png" alt=""/>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-subTitle">代付运费</div>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-word">代付运费的一段简单的描述</div>-->
        <!--                </div>-->
        <!--              </el-col>-->
        <!--              <el-col :span="8">-->
        <!--                <div class="container-body-content-box5-serviceArea-content2">-->
        <!--                  <img class="container-body-content-box5-serviceArea-content2-img"-->
        <!--                       src="../../../assets/front/icon/serviceArea-icon25.png" alt=""/>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-subTitle">重新包装</div>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-word">重新包装的一段简单的描述</div>-->
        <!--                </div>-->
        <!--              </el-col>-->
        <!--            </el-row>-->
        <!--            <el-row :gutter="25">-->
        <!--              <el-col :span="8">-->
        <!--                <div class="container-body-content-box5-serviceArea-content2">-->
        <!--                  <img class="container-body-content-box5-serviceArea-content2-img"-->
        <!--                       src="../../../assets/front/icon/serviceArea-icon26.png" alt=""/>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-subTitle">库存管理</div>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-word">库存管理的一段简单的描述</div>-->
        <!--                </div>-->
        <!--              </el-col>-->
        <!--              <el-col :span="8">-->
        <!--                <div class="container-body-content-box5-serviceArea-content2">-->
        <!--                  <img class="container-body-content-box5-serviceArea-content2-img"-->
        <!--                       src="../../../assets/front/icon/serviceArea-icon27.png" alt=""/>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-subTitle">重新贴标</div>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-word">重新贴标的一段简单的描述</div>-->
        <!--                </div>-->
        <!--              </el-col>-->
        <!--              <el-col :span="8">-->
        <!--                <div class="container-body-content-box5-serviceArea-content2">-->
        <!--                  <img class="container-body-content-box5-serviceArea-content2-img"-->
        <!--                       src="../../../assets/front/icon/serviceArea-icon28.png" alt=""/>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-subTitle">产品简单加工</div>-->
        <!--                  <div class="container-body-content-box5-serviceArea-content2-word">产品简单加工的一段简单的描述</div>-->
        <!--                </div>-->
        <!--              </el-col>-->
        <!--            </el-row>-->
        <!--          </div>-->
        <!--        </el-col>-->
        <el-col class="container-body-content-box2" v-if="selectSubItem4==='简介'">
          <div class="container-body-content-box2-right4"></div>
        </el-col>
        <!--报税仓储——业务范围内容描述-->
        <el-col class="container-body-content-box5" v-if="selectSubItem4==='业务范围'">
          <div class="container-body-content-box5-serviceArea">
            <div class="container-body-content-box5-serviceArea-title">经营范围</div>
            <div class="container-body-content-box5-serviceArea-content">
              <el-row :gutter="20">
                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-01.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">进出口报关</div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box4">
                    从事货物进出口报关、报检、查验和传播服务。主要为客户办理进出口货物和进出境运输工具的报关、报检、预录入保税仓报关业务及关务检务咨询等业务
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-02.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">修船</div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box4">
                    提供船舶修理、船用给养、备件供应、能源供应以及其他相关的船舶服务业务。
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-03.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">海洋工程</div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box4">
                    海洋工程船舶和海工设备的海关暂进出报关手续。
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-04.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">货物类型</div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box4">
                    代理货物进出口报关：<br/>集装箱/钢材/铁矿/煤炭/粮食 /设备/石油
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
                    深圳市外代报关有限公司
                  </div>
                  <div class="container-body-content-box6-serviceArea2-contactUs3-content">
                    <el-row>
                      <el-col style="width: 68px;">
                        地&nbsp;&nbsp;&nbsp;&nbsp;址：
                      </el-col>
                      <el-col :span="19">
                        中国深圳临海大道前海湾保税港区（前海自贸区）外代仓二期二楼
                      </el-col>
                    </el-row>
                    邮　编：518054<br/>
                    电　话：+86-755-26880940 / 25290051<br/>
                    邮　箱：<a title="点击发送邮件" href="mailto:tony.guo@penavicosz.com.cn?subject=请输入主题名&body=请输入邮件内容">tony.guo@penavicosz.com.cn</a><br/>
                    网　址：<a href="http://www.penavicosz.com.cn" target="_blank"
                           style="text-decoration: underline;color: #277AE3">www.penavicosz.com.cn</a><br/>
                  </div>
                </el-col>
                <!--百度地图-->
                <el-col :span="10">
                  <div class="container-body-content-box6-serviceArea2-contactUs3-mapBox">
                    <baidu-map class="container-body-content-box6-serviceArea2-contactUs3-mapBox-map" @ready="mapReady"
                               :scroll-wheel-zoom="true">
                      <bm-marker @click="infoWindowOpen" :position=this.point1 animation="BMAP_ANIMATION_BOUNCE"
                                 :show="show">
                        <bm-info-window :position=this.point1 title="详细地址" :show="show" @close="infoWindowClose">
                          <p>中国深圳临海大道前海湾保税港区(前海自贸区)外代仓二期二楼</p>
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
              <span class="container-body-content-box-left-title-content">招商邮服</span>
              <span class="container-body-content-box-left-title-line"></span>
            </div>

            <div
              :class="selectSubItem5==='简介'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem5==='简介'?'aClass1':'aClass2'" @click="handleSelectSubTitle5('简介')">简介</div>
            </div>

            <div
              :class="selectSubItem5==='业务范围'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem5==='业务范围'?'aClass1':'aClass2'" @click="handleSelectSubTitle5('业务范围')">业务范围
              </div>
            </div>

            <div
              :class="selectSubItem5==='联系我们'?'container-body-content-box-left-subTitle-check':'container-body-content-box-left-subTitle'">
              <div :class="selectSubItem5==='联系我们'?'aClass1':'aClass2'" @click="handleSelectSubTitle5('联系我们')">联系我们
              </div>
            </div>
          </div>
        </el-col>
        <!--招商邮服——简介内容描述-->
        <el-col class="container-body-content-box3" style="height: 500px" v-if="selectSubItem5==='简介'">
          <div class="container-body-content-box3-center">
            <div>
              <div class="container-body-content-box3-center-title">简介</div>
              <div class="container-body-content-box3-center-content">
                <div class="container-body-content-box3-center-content-substance6">
                  <p>
                    深圳招商邮轮服务有限公司于2016年应运而生，是招商局集团进军高端旅游产业链的标志性企业，自投入运作以来，招商邮服以港航服务一体化和资源整合为导向充分发挥物流供应链方面的优势，着力为加快推进和拓展集团邮轮全产业链布局作出重要贡献。主营邮轮伙食、酒店用品供应、航海物料供应、保税供应服务、游艇船舶代理，并为供应商、旅行团等提供货物报关、转关、ATA单证册等专业服务。</p>
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
            <div class="container-body-content-box5-serviceArea-title">业务范围</div>
            <div class="container-body-content-box5-serviceArea-content">
              <el-row :gutter="20">
                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-01.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">保税物流</div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box5">
                    <el-row>
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">邮轮全球采购商品的集中配送</div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">保税货物转运</div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">免税商品转运等</div>
                      </el-col>
                    </el-row>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-02.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">邮轮物资物料采购</div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box5">
                    <el-row>
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">供船食品</div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">酒店用品</div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">船舶配件</div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">船舶油料等采购及申报</div>
                      </el-col>
                    </el-row>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-03.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">国际船舶代理</div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box5">
                    <el-row>
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">船舶联检</div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">船员及旅客申报手续</div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">船东服务等</div>
                      </el-col>
                    </el-row>
                  </div>
                </el-col>

                <el-col :span="6">
                  <div class="container-body-content-box5-serviceArea-content-box3">
                    <img class="container-body-content-box5-serviceArea-content-box3-img"
                         src="../../../assets/front/images/serviceArea/serviceArea-04.png" alt=""/>
                    <div class="container-body-content-box5-serviceArea-content-word2">相关配套服务</div>
                  </div>

                  <div class="container-body-content-box5-serviceArea-content-box5">
                    <el-row>
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">船员接送</div>
                      </el-col>
                    </el-row>
                    <el-row style="margin-top: 10px;">
                      <el-col :span="1">
                        <span class="container-body-content-box5-serviceArea-content-box5-radius"></span>
                      </el-col>
                      <el-col :span="23">
                        <div class="container-body-content-box5-serviceArea-content-box5-word">污油水、洗舱水接收</div>
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
                    深圳招商邮轮服务有限公司
                  </div>
                  <div class="container-body-content-box6-serviceArea2-contactUs2-content">
                    <el-row>
                      <el-col style="width: 73px;">
                        地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址：
                      </el-col>
                      <el-col :span="19" style="margin-left: 10px">
                        中国深圳蛇口邮轮中心（蛇口自贸区）
                      </el-col>
                    </el-row>
                    电　　话：+86-755-26880891<br/>
                    邮　　编：518066<br/>
                    电子邮箱：<a title="点击发送邮件"
                            href="mailto:cmcs@cmhk.com?subject=请输入主题名&body=请输入邮件内容">cmcs@cmhk.com</a><br/>
                    网　　址：<a href="http://www.cmcs1872.com" target="_blank"
                            style="text-decoration: underline;color: #277AE3">www.cmcs1872.com</a><br/>
                  </div>
                </el-col>
                <!--百度地图-->
                <el-col :span="10">
                  <div class="container-body-content-box6-serviceArea2-contactUs3-mapBox">
                    <baidu-map class="container-body-content-box6-serviceArea2-contactUs3-mapBox-map" @ready="mapReady2"
                               :scroll-wheel-zoom="true">

                      <bm-marker :position=this.point3 animation="BMAP_ANIMATION_BOUNCE" :show="show2"
                                 @click="infoWindowOpen2">
                        <bm-info-window :position=this.point3 title="详细地址" :show="show2" @close="infoWindowClose2">
                          <p>中国深圳蛇口邮轮中心（蛇口自贸区）</p>
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
  import Header from '@/views/public/header/header' //引入页头
  import Footer from '@/views/public/footer/footer' //引入页尾

  export default {
    name: 'service-area',
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
        this.point5 = new BMap.Point(114.070175, 22.54791)
        this.point6 = new BMap.Point(114.070166, 22.548112)
        map.centerAndZoom(this.point5, 16)  //设置中心和缩放级别
        map.setCenter(this.point6)          //设置显示中心点
      },
      mapReady4({BMap, map}) {
        //为地图添加坐标
        this.point7 = new BMap.Point(113.885799, 22.506157)
        this.point8 = new BMap.Point(113.885681, 22.507803)
        map.centerAndZoom(this.point7, 16)  //设置中心和缩放级别
        map.setCenter(this.point8)          //设置显示中心点
      },
      mapReady5({BMap, map}) {
        console.log('进入5')
        this.point9 = new BMap.Point(113.926748, 22.50255)
        this.point10 = new BMap.Point(113.926216, 22.502905)
        map.centerAndZoom(this.point9, 19)  //设置中心和缩放级别
        map.setCenter(this.point10)          //设置显示中心点
      },
      mapReady6({BMap, map}) {
        console.log('进入6')
        this.point11 = new BMap.Point(114.26011, 22.575021)
        this.point12 = new BMap.Point(114.26011, 22.575021)
        map.centerAndZoom(this.point11, 16)  //设置中心和缩放级别
        map.setCenter(this.point12)          //设置显示中心点
      },
      mapReady7({BMap, map}) {
        this.point13 = new BMap.Point('113.869685', '22.537454')
        this.point14 = new BMap.Point('113.869685', '22.537454')
        map.centerAndZoom(this.point13, 16)  //设置中心和缩放级别
        map.setCenter(this.point14)
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
          height: 562px;
          border-left: 2px solid #E8E5E5;

          &-center {
            padding: 70px 0 70px 11%;

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

          &-right {
            margin-top: 120px;
            width: 100%;
            height: 320px;
            background-size: 100% 320px;
            background-repeat: no-repeat;
            background-image: url('../../../assets/front/images/serviceArea/serviceArea-image12.png');
          }

          &-right2 {
            margin-top: 100px;
            width: 100%;
            height: 320px;
            background-size: 100% 320px;
            background-repeat: no-repeat;
            background-image: url('../../../assets/front/images/serviceArea/serviceArea-image15.png');
          }

          &-right7 {
            margin-top: 100px;
            width: 100%;
            height: 320px;
            background-size: 100% 320px;
            background-repeat: no-repeat;
            background-image: url('../../../assets/front/images/serviceArea/serviceArea-image14.png');
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
            margin-top: 70px;
            width: 100%;
            height: 280px;
            background-size: 100% 280px;
            background-repeat: no-repeat;
            background-image: url('../../../assets/front/images/serviceArea/serviceArea-image10.png');
          }

          &-right5 {
            margin-top: 70px;
            width: 100%;
            height: 280px;
            background-size: 100% 280px;
            background-repeat: no-repeat;
            background-image: url('../../../assets/front/images/serviceArea/serviceArea-10.png');
          }

          &-right6 {
            margin-top: 70px;
            width: 100%;
            height: 280px;
            background-size: 100% 280px;
            background-repeat: no-repeat;
            background-image: url('../../../assets/front/images/serviceArea/serviceArea-image11.png');
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
                line-height: 30px;
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
          min-height: 600px;
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

            &-box2 {
              padding: 25px 0 25px 25px;
              background: #EDF1F5;
              height: 245px;
            }

            &-box3 {
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
              color: #277AE3;
              text-decoration: underline;
            }

            &-content2 {
              margin-top: 10px;
              font-family: PingFangSC-Regular, sans-serif;
              font-size: 15px;
              color: #333;
              letter-spacing: -0.5px;
              line-height: 28px;
            }

            &-content2 a:hover {
              color: #277AE3;
              text-decoration: underline;
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
                transition: all 0.7s;
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
                transition: all 0.7s;
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
                line-height: 30px;
              }

              &-right {
                width: 100%;
                height: 160px;

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
              padding-top: 56px;

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

    /*当分辨率少于1400px时，报关报检-业务范围的业务类型二样式改变*/
    @media screen and (max-width: 1400px) {
      .container-body-content-box5-serviceArea-content-serviceAreaImage2 {
        margin-top: 30%;
        display: inline-block;
        width: 100%;
      }
      .container-body-content-box4-contactUs-content2 {
        font-size: 13px;
      }
      .container-body-content-box5-serviceArea-content-right-img {
        height: 200px;
      }
    }

  }


</style>
