<template>
  <div class="container">
    <!--导航栏模块-->
    <Header :active-index="activeIndex"></Header>

    <!--横幅banner模块-->
    <div class="container-banner">
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-title animate__animated animate__bounceInDown">港口指南</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-content animate__animated animate__bounceInDown">SCOPE OF SERVICES</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
    </div>
    <div class="images" v-viewer="" style="display: none">
      <img v-for="src in images" :src="src" :key="src" alt="" />
    </div>

    <div class="images2" v-viewer="" style="display: none">
      <img v-for="src in images2" :src="src" :key="src" alt="" />
    </div>


    <!--港口指南主体模块-->
    <div class="container-body">
      <el-row class="container-body-box">
        <el-col :span="8" :class="selectTitle==='港口信息'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='港口信息'?'aClass1':'aClass2'" @click="handleSelectTitle('港口信息')">港口信息</div>
        </el-col>
        <el-col :span="8" :class="selectTitle==='港口使费'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='港口使费'?'aClass1':'aClass2'" @click="handleSelectTitle('港口使费')">港口使费</div>
        </el-col>
        <el-col :span="8" :class="selectTitle==='常用链接'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='常用链接'?'aClass1':'aClass2'" @click="handleSelectTitle('常用链接')">常用链接</div>
        </el-col>
      </el-row>

      <!--港口指南—港口信息-->
      <div v-if="selectTitle==='港口信息'">
        <div class="container-body-content">
          <div class="container-body-content-header">
            <div :class="selectSubTitle3==='西部港区码头'?'container-body-content-header-titleBoxClick':'container-body-content-header-titleBox'" @click="handleSelctSubTitle3('西部港区码头')">
                 西部港区码头
            </div>
            <div :class="selectSubTitle3==='东部港区码头'?'container-body-content-header-titleBoxClick':'container-body-content-header-titleBox'" @click="handleSelctSubTitle3('东部港区码头')">
                 东部港区码头
            </div>
          </div>

<div v-if="selectSubTitle3 === '西部港区码头'">
          <el-row>
            <!--港口信息—西部港区码头-->
            <el-col span="6" class="container-body-content-col">
              <div
                :class="selectSubTitle2==='西部港区码头'?'container-body-content-col-boxClick':'container-body-content-col-box'"
                @click="handleSelectSubTitle2('西部港区码头')">
                <img
                  :class="selectSubTitle2==='西部港区码头'?'container-body-content-col-boxClick-img':'container-body-content-col-box-img'"
                  src="../../../assets/front/icon/portGuide-icon1.png"
                  alt=""/>
                <div
                  :class="selectSubTitle2==='西部港区码头'?'container-body-content-col-boxClick-title':'container-body-content-col-box-title'">
                  西部港区码头
                </div>
              </div>
            </el-col>
            <!--港口信息—西部港区码头——SCT-->
            <el-col span="6" class="container-body-content-col">
              <div
                :class="selectSubTitle2==='西部港区码头——SCT'?'container-body-content-col-boxClick':'container-body-content-col-box'"
                @click="handleSelectSubTitle2('西部港区码头——SCT')">
                <img
                  :class="selectSubTitle2==='西部港区码头——SCT'?'container-body-content-col-boxClick-img':'container-body-content-col-box-img'"
                  src="../../../assets/front/icon/portGuide-icon2.png"
                  alt=""/>
                <div
                  :class="selectSubTitle2==='西部港区码头——SCT'?'container-body-content-col-boxClick-title':'container-body-content-col-box-title'">
                  西部港区码头——SCT
                </div>
              </div>
            </el-col>
            <!--港口信息—西部港区码头——CCT-->
            <el-col span="6" class="container-body-content-col">
              <div
                :class="selectSubTitle2==='西部港区码头——CCT'?'container-body-content-col-boxClick':'container-body-content-col-box'"
                @click="handleSelectSubTitle2('西部港区码头——CCT')">
                <img
                  :class="selectSubTitle2==='西部港区码头——CCT'?'container-body-content-col-boxClick-img':'container-body-content-col-box-img'"
                  src="../../../assets/front/icon/portGuide-icon3.png"
                  alt=""/>
                <div
                  :class="selectSubTitle2==='西部港区码头——CCT'?'container-body-content-col-boxClick-title':'container-body-content-col-box-title'">
                  西部港区码头——CCT
                </div>
              </div>
            </el-col>
            <!--港口信息—西部港区码头——妈湾海星-->
            <el-col span="6" class="container-body-content-col" style="border-right: 1px solid #E1E6F0">
              <div
                :class="selectSubTitle2==='西部港区码头——妈湾海星'?'container-body-content-col-boxClick':'container-body-content-col-box'"
                @click="handleSelectSubTitle2('西部港区码头——妈湾海星')">
                <img
                  :class="selectSubTitle2==='西部港区码头——妈湾海星'?'container-body-content-col-boxClick-img':'container-body-content-col-box-img'"
                  src="../../../assets/front/icon/portGuide-icon4.png"
                  alt=""/>
                <div
                  :class="selectSubTitle2==='西部港区码头——妈湾海星'?'container-body-content-col-boxClick-title':'container-body-content-col-box-title'">
                  西部港区码头——妈湾海星
                </div>
              </div>
            </el-col>
            <!--港口信息—西部港区各集装箱码头参数表-->

          </el-row>

          <!--西部港区码头详情内容-->
          <div v-if="selectSubTitle2==='西部港区码头'" title="点击查看大图">
            <img  @click="show(0)" class="container-body-content-img" src="../../../assets/front/images/portGuide/西部港区码头.png"
                 alt=""/>
            <!--            <el-row>-->
            <!--              <div class="container-body-content-row">-->
            <!--                <el-row>-->
            <!--                  &lt;!&ndash;西部港区码头—蛇口码头&ndash;&gt;-->
            <!--                  <el-col style="width: 25%;">-->
            <!--                    <div class="container-body-content-row-imgBox">-->
            <!--                      <img class="container-body-content-row-imgBox-img"-->
            <!--                           src="../../../assets/front/images/portGuide/portGuide-image1.png" alt=""/>-->
            <!--                    </div>-->
            <!--                    <div class="container-body-content-row-word">-->
            <!--                      <div class="container-body-content-row-word-title">蛇口码头</div>-->
            <!--                      <div class="container-body-content-row-word-subWord">-->
            <!--                        <span class="container-body-content-row-word-subWord-box"></span>-->
            <!--                        <span class="container-body-content-row-word-subWord-word1">SCT</span>-->
            <!--                      </div>-->
            <!--                      <div class="container-body-content-row-word-subWord">-->
            <!--                        <span class="container-body-content-row-word-subWord-box"></span>-->
            <!--                        <span class="container-body-content-row-word-subWord-word1">招商港务</span>-->
            <!--                      </div>-->
            <!--                      <div class="container-body-content-row-word-subWord">-->
            <!--                        <span class="container-body-content-row-word-subWord-box"></span>-->
            <!--                        <span class="container-body-content-row-word-subWord-word1">南集部</span>-->
            <!--                      </div>-->
            <!--                    </div>-->
            <!--                  </el-col>-->
            <!--                  &lt;!&ndash;西部港区码头—赤湾码头&ndash;&gt;-->
            <!--                  <el-col style="width: 25%;">-->
            <!--                    <div class="container-body-content-row-imgBox">-->
            <!--                      <img class="container-body-content-row-imgBox-img"-->
            <!--                           src="../../../assets/front/images/portGuide/portGuide-image2.png" alt=""/>-->
            <!--                    </div>-->
            <!--                    <div class="container-body-content-row-word">-->
            <!--                      <div class="container-body-content-row-word-title">赤湾码头</div>-->
            <!--                      <div class="container-body-content-row-word-subWord">-->
            <!--                        <span class="container-body-content-row-word-subWord-box"></span>-->
            <!--                        <span class="container-body-content-row-word-subWord-word1">CCT</span>-->
            <!--                      </div>-->
            <!--                      <div class="container-body-content-row-word-subWord">-->
            <!--                        <span class="container-body-content-row-word-subWord-box"></span>-->
            <!--                        <span class="container-body-content-row-word-subWord-word1">赤湾港航</span>-->
            <!--                      </div>-->
            <!--                      <div class="container-body-content-row-word-subWord">-->
            <!--                        <span class="container-body-content-row-word-subWord-box"></span>-->
            <!--                        <span class="container-body-content-row-word-subWord-word1">石油基地</span>-->
            <!--                      </div>-->
            <!--                    </div>-->
            <!--                  </el-col>-->
            <!--                  &lt;!&ndash;西部港区码头—妈湾码头&ndash;&gt;-->
            <!--                  <el-col style="width: 25%;">-->
            <!--                    <div class="container-body-content-row-imgBox">-->
            <!--                      <img class="container-body-content-row-imgBox-img"-->
            <!--                           src="../../../assets/front/images/portGuide/portGuide-image3.png" alt=""/>-->
            <!--                    </div>-->
            <!--                    <div class="container-body-content-row-word">-->
            <!--                      <div class="container-body-content-row-word-title">妈湾码头</div>-->
            <!--                      <div class="container-body-content-row-word-subWord">-->
            <!--                        <span class="container-body-content-row-word-subWord-box"></span>-->
            <!--                        <span class="container-body-content-row-word-subWord-word1">MCT</span>-->
            <!--                      </div>-->
            <!--                      <div class="container-body-content-row-word-subWord">-->
            <!--                        <span class="container-body-content-row-word-subWord-box"></span>-->
            <!--                        <span class="container-body-content-row-word-subWord-word1">妈湾海星</span>-->
            <!--                      </div>-->
            <!--                      <div class="container-body-content-row-word-subWord">-->
            <!--                        <span class="container-body-content-row-word-subWord-box"></span>-->
            <!--                        <span class="container-body-content-row-word-subWord-word1">友联船厂</span>-->
            <!--                      </div>-->
            <!--                      <div class="container-body-content-row-word-subWord">-->
            <!--                        <span class="container-body-content-row-word-subWord-box"></span>-->
            <!--                        <span class="container-body-content-row-word-subWord-word1">亿升码头</span>-->
            <!--                      </div>-->
            <!--                    </div>-->
            <!--                  </el-col>-->
            <!--                  &lt;!&ndash;西部港区码头—大铲湾码头&ndash;&gt;-->
            <!--                  <el-col style="width: 25%;">-->
            <!--                    <div class="container-body-content-row-imgBox">-->
            <!--                      <img class="container-body-content-row-imgBox-img"-->
            <!--                           src="../../../assets/front/images/portGuide/portGuide-image4.png" alt=""/>-->
            <!--                    </div>-->
            <!--                    <div class="container-body-content-row-word">-->
            <!--                      <div class="container-body-content-row-word-title">大铲湾码头</div>-->
            <!--                      <div class="container-body-content-row-word-subWord">-->
            <!--                        <span class="container-body-content-row-word-subWord-box"></span>-->
            <!--                        <div class="container-body-content-row-word-subWord-word1">DCB集装箱码头</div>-->
            <!--                      </div>-->
            <!--                    </div>-->
            <!--                  </el-col>-->
            <!--                </el-row>-->
            <!--              </div>-->
            <!--            </el-row>-->
          </div>
          <!--西部港区码头——SCT详情内容-->
          <div v-if="selectSubTitle2==='西部港区码头——SCT'" title="点击查看大图">
            <img @click="show(1)"class="container-body-content-img" src="../../../assets/front/images/portGuide/SCT.png"
                 alt=""/>
          </div>
          <!--西部港区码头——CCT详情内容-->
          <div v-if="selectSubTitle2==='西部港区码头——CCT'" title="点击查看大图">
            <img @click="show(2)" class="container-body-content-img" src="../../../assets/front/images/portGuide/CCT.png"
                 alt=""/>
          </div>
          <!--西部港区码头——妈湾海星详情内容-->
          <div v-if="selectSubTitle2==='西部港区码头——妈湾海星'" title="点击查看大图">
            <img @click="show(3)" class="container-body-content-img" src="../../../assets/front/images/portGuide/妈湾海星.png"
                 alt=""/>
          </div>
          <!--西部港区各集装箱码头参数表详情内容-->


          <el-row>
            <el-col span="6" class="container-body-content-col1" >
              <div
                :class="selectSubTitle2==='西部港区各集装箱码头参数表'?'container-body-content-col1-boxClick':'container-body-content-col1-box'"
                @click="handleSelectSubTitle2('西部港区各集装箱码头参数表')">
                <img
                  :class="selectSubTitle2==='西部港区各集装箱码头参数表'?'container-body-content-col1-boxClick-img':'container-body-content-col1-box-img'"
                  src="../../../assets/front/icon/portGuide-icon5.png"
                  alt=""/>
                <div
                  :class="selectSubTitle2==='西部港区各集装箱码头参数表'?'container-body-content-col1-boxClick-title':'container-body-content-col1-box-title'">
                  西部港区各集装箱码头参数表
                </div>
              </div>
            </el-col>
            <!--港区信息—西部港区各主要散杂货码头-->
            <el-col span="6" class="container-body-content-col1">
              <div
                :class="selectSubTitle2==='西部港区各主要散杂货码头'?'container-body-content-col1-boxClick':'container-body-content-col1-box'"
                @click="handleSelectSubTitle2('西部港区各主要散杂货码头')">
                <img
                  :class="selectSubTitle2==='西部港区各主要散杂货码头'?'container-body-content-col1-boxClick-img':'container-body-content-col1-box-img'"
                  src="../../../assets/front/icon/portGuide-icon6.png"
                  alt=""/>
                <div
                  :class="selectSubTitle2==='西部港区各主要散杂货码头'?'container-body-content-col1-boxClick-title':'container-body-content-col1-box-title'">
                  西部港区各主要散杂货码头
                </div>
              </div>
            </el-col>
            <!--港区信息—西部港区航道-->
            <el-col span="6" class="container-body-content-col1">
              <div
                :class="selectSubTitle2==='西部港区航道'?'container-body-content-col1-boxClick':'container-body-content-col1-box'"
                @click="handleSelectSubTitle2('西部港区航道')">
                <img
                  :class="selectSubTitle2==='西部港区航道'?'container-body-content-col1-boxClick-img':'container-body-content-col1-box-img'"
                  src="../../../assets/front/icon/portGuide-icon7.png"
                  alt=""/>
                <div
                  :class="selectSubTitle2==='西部港区航道'?'container-body-content-col1-boxClick-title':'container-body-content-col1-box-title'">
                  西部港区航道
                </div>
              </div>
            </el-col>
            <!--港区信息—西部港区航道—马湾水道-->
            <el-col span="6" class="container-body-content-col1" style="border-right: 1px solid #E1E6F0">
              <div
                :class="selectSubTitle2==='西部港区航道——马湾水道'?'container-body-content-col1-boxClick':'container-body-content-col1-box'"
                @click="handleSelectSubTitle2('西部港区航道——马湾水道')">
                <img
                  :class="selectSubTitle2==='西部港区航道——马湾水道'?'container-body-content-col1-boxClick-img':'container-body-content-col1-box-img'"
                  src="../../../assets/front/icon/portGuide-icon8.png"
                  alt=""/>
                <div
                  :class="selectSubTitle2==='西部港区航道——马湾水道'?'container-body-content-col1-boxClick-title':'container-body-content-col1-box-title'">
                  西部港区航道——马湾水道
                </div>
              </div>
            </el-col>
            <!--港区信息—西部港区航道——铜鼓航道-->

          </el-row>
          <div v-if="selectSubTitle2==='西部港区各集装箱码头参数表'" title="点击查看大图">
            <img @click="show(4)" class="container-body-content-img" src="../../../assets/front/images/portGuide/集装箱参数.png"
                 alt=""/>
          </div>
          <!--西部港区各主要散杂货码头详情内容-->
          <div v-if="selectSubTitle2==='西部港区各主要散杂货码头'" title="点击查看大图">
            <img @click="show(5)" class="container-body-content-img" src="../../../assets/front/images/portGuide/散杂货码头.png"
                 alt=""/>
          </div>

          <!--西部港区航道详情内容-->
          <div v-if="selectSubTitle2==='西部港区航道'" title="点击查看大图">
            <img @click="show(6)" class="container-body-content-img" src="../../../assets/front/images/portGuide/西部港区航道.png"
                 alt=""/>
          </div>

          <!--西部港区航道——马湾水道详情内容-->
          <div v-if="selectSubTitle2==='西部港区航道——马湾水道'" title="点击查看大图">
            <img @click="show(7)" class="container-body-content-img" src="../../../assets/front/images/portGuide/西部港区航道-马湾水道.png"
                 alt=""/>
          </div>


          <el-row>
            <el-col span="6" class="container-body-content-col">
              <div
                :class="selectSubTitle2==='西部港区航道——铜鼓航道'?'container-body-content-col-boxClick':'container-body-content-col-box'"
                @click="handleSelectSubTitle2('西部港区航道——铜鼓航道')">
                <img
                  :class="selectSubTitle2==='西部港区航道——铜鼓航道'?'container-body-content-col-boxClick-img':'container-body-content-col-box-img'"
                  src="../../../assets/front/icon/portGuide-icon9.png"
                  alt=""/>
                <div
                  :class="selectSubTitle2==='西部港区航道——铜鼓航道'?'container-body-content-col-boxClick-title':'container-body-content-col-box-title'">
                  西部港区航道——铜鼓航道
                </div>
              </div>
            </el-col>
            <!--港区信息—西部港区航道——龙鼓西航道-->
            <el-col span="6" class="container-body-content-col">
              <div
                :class="selectSubTitle2==='西部港区航道——龙鼓西航道'?'container-body-content-col-boxClick':'container-body-content-col1-box'"
                @click="handleSelectSubTitle2('西部港区航道——龙鼓西航道')">
                <img
                  :class="selectSubTitle2==='西部港区航道——龙鼓西航道'?'container-body-content-col-boxClick-img':'container-body-content-col-box-img'"
                  src="../../../assets/front/icon/portGuide-icon10.png"
                  alt=""/>
                <div
                  :class="selectSubTitle2==='西部港区航道——龙鼓西航道'?'container-body-content-col-boxClick-title':'container-body-content-col-box-title'">
                  西部港区航道——龙鼓西航道
                </div>
              </div>
            </el-col>

            <!--港区信息—西部港区航道限制-->
            <el-col span="6" class="container-body-content-col">
              <div
                :class="selectSubTitle2==='西部港区航道限制'?'container-body-content-col-boxClick':'container-body-content-col-box'"
                @click="handleSelectSubTitle2('西部港区航道限制')">
                <img
                  :class="selectSubTitle2==='西部港区航道限制'?'container-body-content-col-boxClick-img':'container-body-content-col-box-img'"
                  src="../../../assets/front/icon/portGuide-icon11.png"
                  alt=""/>
                <div
                  :class="selectSubTitle2==='西部港区航道限制'?'container-body-content-col-boxClick-title':'container-body-content-col-box-title'">
                  西部港区航道限制
                </div>
              </div>
            </el-col>
            <!--港区信息—西部港区附近锚地-->
            <el-col span="6" class="container-body-content-col" style="border-right: 1px solid #E1E6F0">
              <div
                :class="selectSubTitle2==='西部港区附近锚地'?'container-body-content-col-boxClick':'container-body-content-col-box'"
                @click="handleSelectSubTitle2('西部港区附近锚地')">
                <img
                  :class="selectSubTitle2==='西部港区附近锚地'?'container-body-content-col-boxClick-img':'container-body-content-col-box-img'"
                  src="../../../assets/front/icon/portGuide-icon12.png"
                  alt=""/>
                <div
                  :class="selectSubTitle2==='西部港区附近锚地'?'container-body-content-col-boxClick-title':'container-body-content-col-box-title'">
                  西部港区附近锚地
                </div>
              </div>
            </el-col>
<!--            &lt;!&ndash;港区信息—东部港区码头&ndash;&gt;-->
<!--            <el-col class="container-body-content-col">-->
<!--              <div-->
<!--                :class="selectSubTitle2==='东部港区码头'?'container-body-content-col-boxClick':'container-body-content-col-box'"-->
<!--                @click="handleSelectSubTitle2('东部港区码头')">-->
<!--                <img-->
<!--                  :class="selectSubTitle2==='东部港区码头'?'container-body-content-col-boxClick-img':'container-body-content-col-box-img'"-->
<!--                  src="../../../assets/front/icon/portGuide-icon13.png"-->
<!--                  alt=""/>-->
<!--                <div-->
<!--                  :class="selectSubTitle2==='东部港区码头'?'container-body-content-col-boxClick-title':'container-body-content-col-box-title'">-->
<!--                  东部港区码头-->
<!--                </div>-->
<!--              </div>-->
<!--            </el-col>-->
<!--            &lt;!&ndash;港区信息—东部港区码头—盐田国际集装箱码头&ndash;&gt;-->
<!--            <el-col class="container-body-content-col">-->
<!--              <div-->
<!--                :class="selectSubTitle2==='东部港区码头—盐田国际集装箱码头'?'container-body-content-col-boxClick':'container-body-content-col-box'"-->
<!--                @click="handleSelectSubTitle2('东部港区码头—盐田国际集装箱码头')">-->
<!--                <img-->
<!--                  :class="selectSubTitle2==='东部港区码头—盐田国际集装箱码头'?'container-body-content-col-boxClick-img':'container-body-content-col-box-img'"-->
<!--                  src="../../../assets/front/icon/portGuide-icon14.png"-->
<!--                  alt=""/>-->
<!--                <div-->
<!--                  :class="selectSubTitle2==='东部港区码头—盐田国际集装箱码头'?'container-body-content-col-boxClick-title':'container-body-content-col-box-title'">-->
<!--                  东部港区码头—盐田国际集装箱码头-->
<!--                </div>-->

<!--              </div>-->
<!--            </el-col>-->
<!--            &lt;!&ndash;港区信息—东部港区码头—大鹏液化天然气码头&ndash;&gt;-->
<!--            <el-col class="container-body-content-col" style="border-right: 1px solid #E1E6F0">-->
<!--              <div-->
<!--                :class="selectSubTitle2==='东部港区码头—大鹏液化天然气码头'?'container-body-content-col-boxClick':'container-body-content-col-box'"-->
<!--                @click="handleSelectSubTitle2('东部港区码头—大鹏液化天然气码头')">-->
<!--                <img-->
<!--                  :class="selectSubTitle2==='东部港区码头—大鹏液化天然气码头'?'container-body-content-col-boxClick-img':'container-body-content-col-box-img'"-->
<!--                  src="../../../assets/front/icon/portGuide-icon15.png"-->
<!--                  alt=""/>-->
<!--                <div-->
<!--                  :class="selectSubTitle2==='东部港区码头—大鹏液化天然气码头'?'container-body-content-col-boxClick-title':'container-body-content-col-box-title'">-->
<!--                  东部港区码头—大鹏液化天然气码头-->
<!--                </div>-->
<!--              </div>-->
<!--            </el-col>-->
          </el-row>


          <div v-if="selectSubTitle2==='西部港区航道——铜鼓航道'" title="点击查看大图">
            <img @click="show(8)" class="container-body-content-img" src="../../../assets/front/images/portGuide/西部港区航道-铜鼓航道.png"
                 alt=""/>
          </div>

          <!--西部港区航道——龙鼓西航道详情内容-->
          <div v-if="selectSubTitle2==='西部港区航道——龙鼓西航道'" title="点击查看大图">
            <img  @click="show(9)" class="container-body-content-img" src="../../../assets/front/images/portGuide/西部港区航道-龙鼓西航道.png"
                 alt=""/>
          </div>
          <!--西部港区航道限制详情内容-->
          <div v-if="selectSubTitle2==='西部港区航道限制'" title="点击查看大图">
            <img  @click="show(10)" class="container-body-content-img" src="../../../assets/front/images/portGuide/西部港区航道-航道限制.png"
                  alt=""/>
          </div>

          <!--西部港区附近锚地详情内容-->
          <div v-if="selectSubTitle2==='西部港区附近锚地'" title="点击查看大图">
            <img @click="show(11)" class="container-body-content-img" src="../../../assets/front/images/portGuide/西部港区-附近锚地.png"
                 alt=""/>
          </div>

          </div>

          <div v-if="selectSubTitle3 ==='东部港区码头'">
            <el-row>
                        <el-col span="6" class="container-body-content-col">
                          <div
                            :class="selectSubTitle4==='东部港区码头'?'container-body-content-col-boxClick':'container-body-content-col-box'"
                            @click="handleSelctSubTitle4('东部港区码头')">
                            <img
                              :class="selectSubTitle4==='东部港区码头'?'container-body-content-col-boxClick-img':'container-body-content-col-box-img'"
                              src="../../../assets/front/icon/portGuide-icon13.png"
                              alt=""/>
                            <div
                              :class="selectSubTitle4==='东部港区码头'?'container-body-content-col-boxClick-title':'container-body-content-col-box-title'">
                              东部港区码头
                            </div>
                          </div>
                        </el-col>
                        <!--港区信息—东部港区码头—盐田国际集装箱码头-->
                        <el-col span="6" class="container-body-content-col">
                          <div
                            :class="selectSubTitle4==='东部港区码头—盐田国际集装箱码头'?'container-body-content-col-boxClick':'container-body-content-col-box'"
                            @click="handleSelctSubTitle4('东部港区码头—盐田国际集装箱码头')">
                            <img
                              :class="selectSubTitle4==='东部港区码头—盐田国际集装箱码头'?'container-body-content-col-boxClick-img':'container-body-content-col-box-img'"
                              src="../../../assets/front/icon/portGuide-icon14.png"
                              alt=""/>
                            <div
                              :class="selectSubTitle4==='东部港区码头—盐田国际集装箱码头'?'container-body-content-col-boxClick-title':'container-body-content-col-box-title'">
                              东部港区码头—盐田国际集装箱码头
                            </div>

                          </div>
                        </el-col>
                        <!--港区信息—东部港区码头—大鹏液化天然气码头-->
                        <el-col span="6" class="container-body-content-col" style="border-right: 1px solid #E1E6F0">
                          <div
                            :class="selectSubTitle4==='东部港区码头—大鹏液化天然气码头'?'container-body-content-col-boxClick':'container-body-content-col-box'"
                            @click="handleSelctSubTitle4('东部港区码头—大鹏液化天然气码头')">
                            <img
                              :class="selectSubTitle4==='东部港区码头—大鹏液化天然气码头'?'container-body-content-col-boxClick-img':'container-body-content-col-box-img'"
                              src="../../../assets/front/icon/portGuide-icon15.png"
                              alt=""/>
                            <div
                              :class="selectSubTitle4==='东部港区码头—大鹏液化天然气码头'?'container-body-content-col-boxClick-title':'container-body-content-col-box-title'">
                              东部港区码头—大鹏液化天然气码头
                            </div>
                          </div>
                        </el-col>
            </el-row>

<!--            东部港区码头详情内容-->
                      <div v-if="selectSubTitle4==='东部港区码头'" title="点击查看大图">
                        <img @click="show(12)" class="container-body-content-img" src="../../../assets/front/images/portGuide/东部港区码头.png"
                             alt=""/>
                      </div>

                      <!--东部港区码头—盐田国际集装箱码头详情内容-->
                      <div v-if="selectSubTitle4==='东部港区码头—盐田国际集装箱码头'" title="点击查看大图">
                        <img @click="show(13)" class="container-body-content-img" src="../../../assets/front/images/portGuide/东部港区码头-盐田国际集装箱码头.png"
                             alt=""/>
                      </div>

                      <!--东部港区码头—大鹏液化天然气码头详情内容-->
                      <div v-if="selectSubTitle4==='东部港区码头—大鹏液化天然气码头'" title="点击查看大图">
                        <img @click="show(14)" class="container-body-content-img" src="../../../assets/front/images/portGuide/东部港区码头-大鹏液化天然气码头.png"
                             alt=""/>
                      </div>
          </div>


        </div>
      </div>
      <!--港口指南—港口使费-->
      <div v-if="selectTitle==='港口使费'">
        <div class="container-body-content2">
          <div class="container-body-content2-title">港口使费</div>
          <!--          <div class="container-body-content2-word">-->
          <!--            港口使费是指航运公司所经营的船舶在营运期间在装卸港口所发生的各项支出和费用。它是航运公司三大营运成本（船期费，燃油费和港口使费）之一，是船公司计算营运成本的重要指数，是核算航次利润的主要依据，也可称之为航次费用或可变费用。-->
          <!--          </div>-->
          <!--港口使费选择栏-->
          <div class="container-body-content2-subTitleBox">
            <div
              :class="selectSubTitle==='西部港区码头'?'container-body-content2-subTitleBox-subTitleCheck':'container-body-content2-subTitleBox-subTitle'"
              @click="handleSelectSubTitle('西部港区码头')">
              <span :class="selectSubTitle==='西部港区码头'?'aClass1':'aClass2'">深圳港区码头</span>
            </div>
            <div
              :class="selectSubTitle==='光汇集团船方收费标准（装船）'?'container-body-content2-subTitleBox-subTitleCheck':'container-body-content2-subTitleBox-subTitle'"
              @click="handleSelectSubTitle('光汇集团船方收费标准（装船）')">
              <span :class="selectSubTitle==='光汇集团船方收费标准（装船）'?'aClass1':'aClass2'">光汇集团船方收费标准（装船）</span>
            </div>
            <div
              :class="selectSubTitle==='光汇集团船方收费标准（卸船）'?'container-body-content2-subTitleBox-subTitleCheck':'container-body-content2-subTitleBox-subTitle'"
              @click="handleSelectSubTitle('光汇集团船方收费标准（卸船）')">
              <span :class="selectSubTitle==='光汇集团船方收费标准（卸船）'?'aClass1':'aClass2'">光汇集团船方收费标准（卸船）</span>
            </div>
          </div>

          <!--港口使费—西部港区码头内容-->
          <div v-if="selectSubTitle==='西部港区码头'" title="点击查看大图">
            <img @click="show2(0)" class="container-body-content2-img" src="../../../assets/front/images/portGuide/港口使费-西部港区码头详情图.png"
                 alt=""/>
          </div>
          <!--港口使费—光汇集团船方收费标准（装船）内容-->
          <div v-if="selectSubTitle==='光汇集团船方收费标准（装船）'" title="点击查看大图">
            <img @click="show2(1)"  class="container-body-content2-img" src="../../../assets/front/images/portGuide/港口使费-光汇集团船方收费标准（装船）.png"
                 alt=""/>
          </div>
          <!--港口使费—光汇集团船方收费标准（卸船）内容-->
          <div v-if="selectSubTitle==='光汇集团船方收费标准（卸船）'" title="点击查看大图">
            <img @click="show2(2)"  class="container-body-content2-img" src="../../../assets/front/images/portGuide/港口使费-光汇集团船方收费标准（卸船）.png"
                 alt=""/>
          </div>
        </div>
      </div>
      <!--港口指南—常用链接-->
      <div v-if="selectTitle==='常用链接'">
        <div class="container-body-content2">
          <div class="container-body-content2-title">常用链接</div>
          <!--<div class="container-body-content2-word">与我们合作多年，相互信任的客户伙伴，我们也用专业的态度以及服务完成客户的托付。</div>-->
          <!--常用链接内容-->
          <div class="container-body-content2-box">
            <el-row>
              <!--中华人民共和国交通运输部-->
              <a href="http://www.mot.gov.cn/" target="_blank">
                <el-col span="8" class="container-body-content2-box-col">
                  <div class="container-body-content2-box-col-imgBox">
                    <img class="container-body-content2-box-col-imgBox-img"
                         src="../../../assets/front/images/portGuide/中华人民共和国交通运输部.png" alt=""/>
                  </div>
                </el-col>
              </a>

              <!--中华人民共和国海关总署-->
              <a href="http://www.customs.gov.cn/" target="_blank">
                <el-col span="8" class="container-body-content2-box-col">
                  <div class="container-body-content2-box-col-imgBox">
                    <img class="container-body-content2-box-col-imgBox-img"
                         src="../../../assets/front/images/portGuide/海关总署.png" alt=""/>
                  </div>
                </el-col>
              </a>
              <!--中国海事局-->
              <a href="https://www.msa.gov.cn/" target="_blank">
                <el-col span="8" class="container-body-content2-box-col">
                  <div class="container-body-content2-box-col-imgBox">
                    <img class="container-body-content2-box-col-imgBox-img"
                         src="../../../assets/front/images/portGuide/中国海事.png" alt=""/>
                  </div>
                </el-col>
              </a>
              <!--中国海关广东分署-->
              <!--              <a href="http://gdfs.customs.gov.cn/guangdong_sub/index/index.html" target="_blank">-->
              <!--                <el-col class="container-body-content2-box-col" style="border-bottom: 1px solid #F0F0F0">-->
              <!--                  <div class="container-body-content2-box-col-imgBox">-->
              <!--                    <img class="container-body-content2-box-col-imgBox-img"-->
              <!--                         src="../../../assets/front/images/portGuide/广东海关.png" alt=""/>-->
              <!--                  </div>-->
              <!--                </el-col>-->
              <!--              </a>-->
              <!--广东海事局-->
              <!--              <a href="https://www.gd.msa.gov.cn/" target="_blank">-->
              <!--                <el-col class="container-body-content2-box-col" style="border-right: 1px solid #F0F0F0;border-bottom: 1px solid #F0F0F0">-->
              <!--                  <div class="container-body-content2-box-col-imgBox">-->
              <!--                    <img class="container-body-content2-box-col-imgBox-img"-->
              <!--                         src="../../../assets/front/images/portGuide/广东海事局.png" alt=""/>-->
              <!--                  </div>-->
              <!--                </el-col>-->
              <!--              </a>-->


              <!--深圳出入境检验检疫局-->
              <!--              <a href="" target="_blank">-->
              <!--                <el-col class="container-body-content2-box-col" style="border-right: 1px solid #F0F0F0">-->
              <!--                  <div class="container-body-content2-box-col-imgBox">-->
              <!--                    <img class="container-body-content2-box-col-imgBox-img"-->
              <!--                         src="../../../assets/front/images/portGuide/深圳出入境检验检疫局.png" alt=""/>-->
              <!--                  </div>-->
              <!--                </el-col>-->
              <!--              </a>-->
            </el-row>
            <el-row>

              <!--深圳海关-->
              <a href="http://shenzhen.customs.gov.cn/" target="_blank">
                <el-col span="8" class="container-body-content2-box-col" style="border-bottom: 1px solid #F0F0F0">
                  <div class="container-body-content2-box-col-imgBox">
                    <img class="container-body-content2-box-col-imgBox-img"
                         src="../../../assets/front/images/portGuide/深圳海关.png" alt=""/>
                  </div>
                </el-col>
              </a>
              <!--深圳海事局-->
              <a href="https://sz.msa.gov.cn/" target="_blank">
                <el-col span="8" class="container-body-content2-box-col" style="border-bottom: 1px solid #F0F0F0">
                  <div class="container-body-content2-box-col-imgBox">
                    <img class="container-body-content2-box-col-imgBox-img"
                         src="../../../assets/front/images/portGuide/深圳海事局.png" alt=""/>
                  </div>
                </el-col>
              </a>

              <!--深圳交通-->
              <a href="http://jtys.sz.gov.cn/" target="_blank">
                <el-col span="8" class="container-body-content2-box-col" style="border-bottom: 1px solid #F0F0F0;border-right: 1px solid #F0F0F0">
                  <div class="container-body-content2-box-col-imgBox">
                    <img class="container-body-content2-box-col-imgBox-img"
                         src="../../../assets/front/images/portGuide/交通@2x.png" alt=""/>
                  </div>
                </el-col>
              </a>

              <!--              &lt;!&ndash;深圳港引航站&ndash;&gt;-->
              <!--              <a href="http://www.szpilot.com.cn/szpilot/index.html" target="_blank">-->
              <!--                <el-col class="container-body-content2-box-col">-->
              <!--                  <div class="container-body-content2-box-col-imgBox">-->
              <!--                    <img class="container-body-content2-box-col-imgBox-img"-->
              <!--                         src="../../../assets/front/images/portGuide/深圳港引航站.png" alt=""/>-->
              <!--                  </div>-->
              <!--                </el-col>-->
              <!--              </a>-->

              <!--              &lt;!&ndash;深圳市气象局&ndash;&gt;-->
              <!--              <a href="http://weather.sz.gov.cn/" target="_blank">-->
              <!--                <el-col class="container-body-content2-box-col" style="border-right: 1px solid #F0F0F0;">-->
              <!--                  <div class="container-body-content2-box-col-imgBox">-->
              <!--                    <img class="container-body-content2-box-col-imgBox-img"-->
              <!--                         src="../../../assets/front/images/portGuide/深圳市气象局.png" alt=""/>-->
              <!--                  </div>-->
              <!--                </el-col>-->
              <!--              </a>-->

            </el-row>
            <el-row>

              <!--              &lt;!&ndash;香港天文台&ndash;&gt;-->
              <!--              <a href="https://www.hko.gov.hk/sc/index.html" target="_blank">-->
              <!--                <el-col class="container-body-content2-box-col">-->
              <!--                  <div class="container-body-content2-box-col-imgBox">-->
              <!--                    <img class="container-body-content2-box-col-imgBox-img"-->
              <!--                         src="../../../assets/front/images/portGuide/香港天文台.png" alt=""/>-->
              <!--                  </div>-->
              <!--                </el-col>-->
              <!--              </a>-->
              <!--              &lt;!&ndash;西部港区进出境&ndash;&gt;-->
              <!--              <a href="http://www.shipxy.com/" target="_blank">-->
              <!--                <el-col class="container-body-content2-box-col">-->
              <!--                  <div class="container-body-content2-box-col-imgBox">-->
              <!--                    <img class="container-body-content2-box-col-imgBox-img"-->
              <!--                         src="../../../assets/front/images/portGuide/船讯网.png" alt=""/>-->
              <!--                  </div>-->
              <!--                </el-col>-->
              <!--              </a>-->

              <!--蛇口集装箱码头-->
              <!--              <a href="" target="_blank">-->
              <!--                <el-col class="container-body-content2-box-col" style="border-bottom: 1px solid #F0F0F0">-->
              <!--                  <div class="container-body-content2-box-col-imgBox">-->
              <!--                    <img class="container-body-content2-box-col-imgBox-img"-->
              <!--                         src="../../../assets/front/images/portGuide/蛇口集装箱码头.png" alt=""/>-->
              <!--                  </div>-->
              <!--                </el-col>-->
              <!--              </a>-->
              <!--赤湾集装箱码头有限公司-->
              <!--              <a href="http://cas.szvsc.com/cas/login?flag=eport&service=http%3A%2F%2Feport.szvsc.com%2F#"-->
              <!--                 target="_blank">-->
              <!--                <el-col class="container-body-content2-box-col">-->
              <!--                  <div class="container-body-content2-box-col-imgBox">-->
              <!--                    <img class="container-body-content2-box-col-imgBox-img"-->
              <!--                         src="../../../assets/front/images/portGuide/赤湾集装箱码头有限公司.png" alt=""/>-->
              <!--                  </div>-->
              <!--                </el-col>-->
              <!--              </a>-->
              <!--              &lt;!&ndash;盐田国际&ndash;&gt;-->
              <!--              <a href="https://www.yict.com.cn/index.html" target="_blank">-->
              <!--                <el-col class="container-body-content2-box-col" style="border-bottom: 1px solid #F0F0F0;">-->
              <!--                  <div class="container-body-content2-box-col-imgBox">-->
              <!--                    <img class="container-body-content2-box-col-imgBox-img"-->
              <!--                         src="../../../assets/front/images/portGuide/盐田国际.png" alt=""/>-->
              <!--                  </div>-->
              <!--                </el-col>-->
              <!--              </a>-->
              <!--              &lt;!&ndash;大铲湾码头&ndash;&gt;-->
              <!--              <a href="http://www.dcblink.com/" target="_blank">-->
              <!--                <el-col class="container-body-content2-box-col" style="border-bottom: 1px solid #F0F0F0;border-right: 1px solid #F0F0F0;">-->
              <!--                  <div class="container-body-content2-box-col-imgBox">-->
              <!--                    <img class="container-body-content2-box-col-imgBox-img"-->
              <!--                         src="../../../assets/front/images/portGuide/大铲湾码头.png" alt=""/>-->
              <!--                  </div>-->
              <!--                </el-col>-->
              <!--              </a>-->

            </el-row>
            <!--            <el-row>-->

            <!--              &lt;!&ndash;一站通&ndash;&gt;-->
            <!--              <a href="https://www.gov.hk/en/residents/" target="_blank">-->
            <!--                <el-col class="container-body-content2-box-col" style="border-bottom: 1px solid #F0F0F0;">-->
            <!--                  <div class="container-body-content2-box-col-imgBox">-->
            <!--                    <img class="container-body-content2-box-col-imgBox-img"-->
            <!--                         src="../../../assets/front/images/portGuide/一站通@2x.png" alt=""/>-->
            <!--                  </div>-->
            <!--                </el-col>-->
            <!--              </a>-->
            <!--              &lt;!&ndash;马湾航道&ndash;&gt;-->
            <!--              <a href="https://www.hydro.gov.hk/sc/" target="_blank">-->
            <!--                <el-col class="container-body-content2-box-col"-->
            <!--                        style="border-bottom: 1px solid #F0F0F0">-->
            <!--                  <div class="container-body-content2-box-col-imgBox">-->
            <!--                    <img class="container-body-content2-box-col-imgBox-img"-->
            <!--                         src="../../../assets/front/images/portGuide/马湾航道.png" alt=""/>-->
            <!--                  </div>-->
            <!--                </el-col>-->
            <!--              </a>-->

            <!--              &lt;!&ndash;Tokyo Mou&ndash;&gt;-->
            <!--              <a href="http://www.tokyo-mou.org/" target="_blank">-->
            <!--                <el-col class="container-body-content2-box-col"-->
            <!--                        style="border-right: 1px solid #F0F0F0;border-bottom: 1px solid #F0F0F0">-->
            <!--                  <div class="container-body-content2-box-col-imgBox">-->
            <!--                    <img class="container-body-content2-box-col-imgBox-img"-->
            <!--                         src="../../../assets/front/images/portGuide/Tokyo Mou.png" alt=""/>-->
            <!--                  </div>-->
            <!--                </el-col>-->
            <!--              </a>-->
            <!--            </el-row>-->
          </div>
        </div>
      </div>
    </div>

    <!--页尾模块-->
    <Footer></Footer>
  </div>
</template>

<script>
  import Header from '@/views/public/header/header' //引入页头
  import Footer from '@/views/public/footer/footer' //引入页尾
  import 'viewerjs/dist/viewer.css'
  import Viewer from  'v-viewer/src/component'

  export default {
    name: 'port-guide',
    components: {Footer, Header,Viewer},
    data() {
      return {
        images2: [
          require('../../../assets/front/images/portGuide/港口使费-西部港区码头详情图.png'),
          require('../../../assets/front/images/portGuide/港口使费-光汇集团船方收费标准（装船）.png'),
          require('../../../assets/front/images/portGuide/港口使费-光汇集团船方收费标准（卸船）.png')
        ],
        images: [
          require('../../../assets/front/images/portGuide/西部港区码头详情图.png'),
          require('../../../assets/front/images/portGuide/西部港区码头——SCT详情图.png'),
          require('../../../assets/front/images/portGuide/西部港区码头——CCT详情图.png'),
          require('../../../assets/front/images/portGuide/西部港区码头——妈湾海星详情图.png'),
          require('../../../assets/front/images/portGuide/西部港区各集装箱码头参数表 详情图.png'),
          require('../../../assets/front/images/portGuide/西部港区各主要散杂货码头 详情图.png'),
          require('../../../assets/front/images/portGuide/西部港区航道详情图.png'),
          require('../../../assets/front/images/portGuide/西部港区-马湾水道详情图.png'),
          require('../../../assets/front/images/portGuide/西部港区-铜鼓航道详情图.png'),
          require('../../../assets/front/images/portGuide/西部港区码头——龙鼓西详情图.png'),
          require('../../../assets/front/images/portGuide/西部港区航道限制详情图.png'),
          require('../../../assets/front/images/portGuide/西部港区附近锚地详情图.png'),
          require('../../../assets/front/images/portGuide/东部港区码头详情图.png'),
          require('../../../assets/front/images/portGuide/东部港区码头—盐田国际集装箱码头 详情图.png'),
          require('../../../assets/front/images/portGuide/东部港区码头—大鹏液化天然气码头 详情图.png')
        ],
        activeIndex: '5',//当前页面为港口指南页面
        selectTitle: '港口信息',//默认打开港口指南显示港口信息内容
        selectSubTitle: '西部港区码头',//默认点击港口信息显示西部港区码头内容
        selectSubTitle2: '西部港区码头',//默认点击港口使费显示西部港区码头内容
        selectSubTitle3: '西部港区码头',
        selectSubTitle4: ''
      }
    }, created() {
      // 如果不是根据 #/serviceArea?selectItem=''这种链接传来的话，默认显示内容为港口信息
      if (this.$route.query.selectItem !== undefined) {
        this.selectTitle = this.$route.query.selectItem
      } else {
        this.selectTitle = '港口信息'
      }
    },
    // 监听路由变化时，页面跳转
    watch: {
      '$route'(to) {
        if (to.query.selectItem !== undefined) {
          this.selectTitle = to.query.selectItem
          to.query.selectItem = undefined
        } else {
          this.selectTitle = '港口信息'
        }
      }
    },
    methods: {
      show(index) {
        const viewer = this.$el.querySelector('.images').$viewer
        viewer.view(index)
      },
      show2(index) {
        const viewer = this.$el.querySelector('.images2').$viewer
        viewer.view(index)
      },
      // 港口使费选择栏
      handleSelectSubTitle(item) {
        this.selectSubTitle = item
      },
      //港口指南的选择栏
      handleSelectTitle(item) {
        this.selectTitle = item
        if (item === '港口信息') {
          this.selectSubTitle2 = '西部港区码头'
          this.selectSubTitle3 = '西部港区码头'
        } else if (item === '港口使费') {
          this.selectSubTitle = '西部港区码头'
        }
      },
      // 港口信息的选择栏
      handleSelectSubTitle2(item) {
        if (this.selectSubTitle2 === item) {
          this.selectSubTitle2 = ''
        } else {
          this.selectSubTitle2 = item
        }
      },
      handleSelctSubTitle3(item) {
        if(this.selectSubTitle3 === item) {
          this.selectSubTitle3 = ''
        } else {
          this.selectSubTitle3 =item
          if(this.selectSubTitle3 === '东部港区码头') {
            this.selectSubTitle4= '东部港区码头'
          }
        }
      },
      handleSelctSubTitle4(item) {
        if(this.selectSubTitle4 === item) {
          this.selectSubTitle4 = ''
        } else {
          this.selectSubTitle4 =item
        }
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

    /*banner样式*/
    &-banner {
      width: 100%;
      background-size: 100% auto;
      height: 0;
      padding-top: 18.75%;
      background-image: url("../../../assets/front/images/portGuide/portGuide-banner-new.png");

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

      &-content2 {
        box-shadow: -2px 4px 5px 0px #f2f2f2 inset;
        width: 100%;
        padding: 50px 8% 150px 8%;

        &-title {
          font-size: 26px;
          font-family: PingFangSC-Semibold, sans-serif;
          font-weight: 600;
          color: #3B3F47;
          margin-bottom: 35px;
        }

        &-word {
          font-size: 16px;
          font-family: PingFangSC-Regular, sans-serif;
          font-weight: 400;
          color: #888888;
          margin-bottom: 30px;
        }

        &-subTitleBox {
          height: 60px;
          padding-left: 38px;
          border-bottom: 1px solid #E8E9EA;
          border-radius: 7px;
          margin-bottom: 30px;

          &-subTitle {
            display: inline-block;
            height: 60px;
            line-height: 60px;
            font-size: 17px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #3B3F47;
            margin-right: 14%;

          }

          &-subTitleCheck {
            display: inline-block;
            height: 60px;
            line-height: 60px;
            font-size: 17px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #3281E4;;
            margin-right: 14%;
            border-bottom: 3px solid #3281E4;
          }

        }

        &-img {
          width: 100%;
        }
        &-img:hover {
          cursor: pointer;
        }

        &-box {
          &-col:hover {
            position: relative;
            cursor: pointer;
            background: #FFFFFF;
            box-shadow: 0 2px 10px 0 rgba(39, 122, 227, 0.2);
            border: 1px solid #277AE3 !important;
          }
          &-col:hover .container-body-content2-box-col-imgBox-img {
            transform: scale(1.2);
            cursor: pointer;
          }

          &-col {

            height: 170px;
            background: #FFFFFF;
            border-top: 1px solid #F0F0F0;
            border-left: 1px solid #F0F0F0;
            position: relative;

            &-imgBox {
              position: absolute;
              top: 50%;
              margin-top: -56px;
              left: 50%;
              margin-left: -129px;
              height: 113px;
              width: 259px;
              display: inline-block;

              &-img {
                display: block;
                width: 257px;
                height: 111px;
                transition: all 0.7s;
              }

            }
          }
        }
      }

      &-content {
        box-shadow: -2px 4px 5px 0px #f2f2f2 inset;
        width: 100%;
        padding: 20px 8% 150px 8%;

        &-header {
          width: 100%;
          height: 50px;
          margin-bottom: 35px;
          box-shadow: 0 2px 3px -1px #E8E9EA;

          &-titleBox {
            margin-left: 20px;
            width: 150px;
            text-align: center;
            height: 50px;
            line-height: 50px;
            font-size: 18px;
            display: inline-block;
            margin-right: 20px;
          }

          &-titleBox:hover {
            cursor: pointer;
          }

          &-titleBoxClick {
            margin-left: 20px;
            width: 150px;
            text-align: center;
            height: 50px;
            line-height: 50px;
            font-size: 18px;
            display: inline-block;
            margin-right: 20px;
            border-bottom: 2px solid #277AE3;
            color: #277AE3;
          }
        }

        &-col:hover .container-body-content-col-box {
          cursor: pointer;
          background: #FFFFFF;
          box-shadow: 0 2px 10px 0 rgba(50, 129, 228, 0.2);
          border-radius: 1px;
          border: 1px solid #3281E4;
        }

        &-col:hover .container-body-content-col-box-img {
          cursor: pointer;
          margin-top: -18px;
        }

        &-col:hover .container-body-content-col-box-title {
          cursor: pointer;
          margin-top: -18px;
        }

        &-col1:hover .container-body-content-col1-box-img {
          cursor: pointer;
          margin-top: -18px;
        }

        &-col1:hover .container-body-content-col1-box-title {
          cursor: pointer;
          margin-top: -18px;
        }

        &-col1:hover .container-body-content-col1-box {
          cursor: pointer;
          background: #FFFFFF;
          box-shadow: 0 2px 10px 0 rgba(50, 129, 228, 0.2);
          border-radius: 1px;
          border: 1px solid #3281E4;
        }

        &-col {
          height: 180px;

          &-boxClick {
            position: relative;
            width: 100%;
            height: 180px;
            background: #FFFFFF;
            border-radius: 1px;
            border: 1px solid #3281E4;

            &-img {
              width: 42px;
              height: 42px;
              position: absolute;
              top: 50px;
              left: 10%;
              margin-top: -18px;
            }

            &-title {
              font-size: 16px;
              font-family: PingFangSC-Semibold, sans-serif;
              font-weight: 500;
              color: #3281E4;
              position: absolute;
              top: 110px;
              left: 10%;
              margin-top: -18px;
            }
          }

          &-boxClick:hover {
            cursor: pointer;
          }

          &-box {
            position: relative;
            width: 100%;
            height: 180px;
            background: #FFFFFF;
            border-radius: 1px;
            border-top: 1px solid #E1E6F0;
            border-left: 1px solid #E1E6F0;
            border-bottom: 1px solid #E1E6F0;
            margin-bottom: -1px;

            &-img {
              width: 42px;
              height: 42px;
              position: absolute;
              top: 50px;
              left: 10%;
            }

            &-title {
              font-size: 16px;
              font-family: PingFangSC-Semibold, sans-serif;
              font-weight: 500;
              color: #000000;
              position: absolute;
              top: 110px;
              left: 10%;
            }
          }
        }

        &-col1 {
          height: 180px;

          &-boxClick {
            position: relative;
            width: 100%;
            height: 180px;
            background: #FFFFFF;
            border-radius: 1px;
            border: 1px solid #3281E4;

            &-img {
              width: 42px;
              height: 42px;
              position: absolute;
              top: 50px;
              left: 10%;
              margin-top: -18px;
            }

            &-title {
              font-size: 16px;
              font-family: PingFangSC-Semibold, sans-serif;
              color: #3281E4;
              position: absolute;
              top: 110px;
              left: 10%;
              margin-top: -18px;
            }
          }

          &-boxClick:hover {
            cursor: pointer;
          }

          &-box {
            position: relative;
            width: 100%;
            height: 180px;
            background: #FFFFFF;
            border-radius: 1px;
            border-left: 1px solid #E1E6F0;
            border-top: 1px solid #E1E6F0;
            border-bottom: 1px solid #E1E6F0;

            &-img {
              width: 42px;
              height: 42px;
              position: absolute;
              top: 50px;
              left: 10%;
            }

            &-title {
              font-size: 16px;
              font-family: PingFangSC-Semibold, sans-serif;
              color: #000000;
              position: absolute;
              top: 110px;
              left: 10%;
            }
          }
        }

        &-row {
          width: 100%;
          height: 230px;
          background: #F9FAFF;
          padding: 50px 0 70px 3%;

          &-imgBox {
            display: inline-block;
            width: 140px;
            height: 140px;

            &-img {
              width: 140px;
              height: 140px;
            }
          }

          &-word {
            display: inline-block;
            vertical-align: top;
            margin-left: 5%;

            &-title {
              font-size: 17px;
              font-family: PingFangSC-Semibold, sans-serif;
              font-weight: 600;
              color: #3B3F47;
              margin-bottom: 12px;
            }

            &-subWord {
              font-size: 13px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #8096B3;
              margin-bottom: 8px;
              position: relative;

              &-box {
                position: absolute;
                display: inline-block;
                width: 8px;
                height: 8px;
                border-radius: 50%;
                background: #8096B3;
                top: 50%;
                margin-top: -4px;
              }

              &-word1 {
                padding-left: 15px;
              }
            }


          }
        }

        &-img {
          background-color: #F9FAFF;
          width: 100%;
          /*padding: 20px 0;*/
        }

        &-img:hover {
          cursor: pointer;
        }
      }
    }

  }
</style>
