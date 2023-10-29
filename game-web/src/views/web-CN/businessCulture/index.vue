<!--suppress JSSuspiciousNameCombination -->
<template>
  <div class="container">
    <!--导航栏模块-->
    <Header :active-index="activeIndex"></Header>

    <!--横幅banner模块-->
    <div class="container-banner">
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-title animate__animated animate__bounceInDown">企业文化</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-content animate__animated animate__bounceInDown">CORPORATE CULTURE</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
    </div>
    <div class="container-body">
      <div class="container-body-title">{{activity.title}}</div>
      <div class="container-body-contentBox">
        <div class="container-body-contentBox-content" style="width: 100%;" :style='{height:picHeight+"px"}'
             ref="element" v-html="activity.content">{{activity.content}}
        </div>
        <img src="../../../assets/front/images/businessCulture/last.png" alt="" class="container-body-contentBox-img1"
             @click="lastCheck1(activityIndex)"/>
        <img src="../../../assets/front/images/businessCulture/next.png" alt="" class="container-body-contentBox-img2"
             @click="nextCheck1(activityIndex)"/>
      </div>
      <el-row :gutter="10" style="position: relative">
        <el-col style="width: 20%" v-if="activityData.length>0">
          <img :src=activityData[0].titleImage alt="" v-if="activityData[0].titleImage!==''"
               :class="activityIndex===0?'container-body-imgCheck':'container-body-img'"
               @click="imgCheck(activityData[0].id,0)"/>
        </el-col>
        <el-col style="width: 20%" v-if="activityData.length>1">
          <img :src="activityData[1].titleImage" alt="" v-if="activityData[1].titleImage!==''"
               :class="activityIndex===1?'container-body-imgCheck':'container-body-img'"
               @click="imgCheck(activityData[1].id,1)"/>
        </el-col>
        <el-col style="width: 20%" v-if="activityData.length>2">
          <img :src="activityData[2].titleImage" alt="" v-if="activityData[2].titleImage!==''"
               :class="activityIndex===2?'container-body-imgCheck':'container-body-img'"
               @click="imgCheck(activityData[2].id,2)"/>
        </el-col>
        <el-col style="width: 20%" v-if="activityData.length>3">
          <img :src="activityData[3].titleImage" alt="" v-if="activityData[3].titleImage!==''"
               :class="activityIndex===3?'container-body-imgCheck':'container-body-img'"
               @click="imgCheck(activityData[3].id,3)"/>
        </el-col>
        <el-col style="width: 20%" v-if="activityData.length>4">
          <img :src="activityData[4].titleImage" alt="" v-if="activityData[4].titleImage!==''"
               :class="activityIndex===4?'container-body-imgCheck':'container-body-img'"
               @click="imgCheck(activityData[4].id,4)"/>
        </el-col>
        <div :class="last===true?'container-body-lastCheck':'container-body-last'" @click="lastCheck2"></div>
        <div :class="last===false?'container-body-nextCheck':'container-body-next'" @click="nextCheck2"></div>
      </el-row>
    </div>
    <!--swiper轮播-->
    <!--    <div class="container-body" v-loading="listLoading">-->
    <!--      <div class="thumb-example" v-if="activityData.length>0">-->
    <!--        &lt;!&ndash; swiper1 &ndash;&gt;-->
    <!--        <swiper :options="swiperOptionTop" class="swiper gallery-top" ref="swiperTop">-->
    <!--          <swiper-slide class="sliderStyle" v-for="(item,index) in  activityData" :key="index"-->
    <!--                        :style="{backgroundImage: 'url(data:image/jpeg;base64,' + item.titleImage+ ')'}">-->
    <!--            <div class="swiperTitle">{{item.title}}</div>-->
    <!--          </swiper-slide>-->
    <!--          <div class="swiper-button-next swiper-button-white" slot="button-next"></div>-->
    <!--          <div class="swiper-button-prev swiper-button-white" slot="button-prev"></div>-->
    <!--        </swiper>-->
    <!--        &lt;!&ndash; swiper2 Thumbs &ndash;&gt;-->
    <!--        <swiper :options="swiperOptionThumbs" class="swiper gallery-thumbs" ref="swiperThumbs">-->
    <!--          <swiper-slide class="sliderStyle" v-for="(item,index) in activityData" :key="index"-->
    <!--                        :style="{backgroundImage: 'url(data:image/jpeg;base64,' + item.titleImage+ ')'}"></swiper-slide>-->
    <!--        </swiper>-->
    <!--      </div>-->
    <!--    </div>-->
    <!--企业文化主体模块-->
    <!--    <div class="container-body">-->
    <!--      &lt;!&ndash;企业文化选择菜单栏&ndash;&gt;-->
    <!--      <el-row class="container-body-box">-->
    <!--        &lt;!&ndash;        <el-col :span="12" :class="selectTitle==='公司理念'?'container-body-box-title-check':'container-body-box-title'">&ndash;&gt;-->
    <!--        &lt;!&ndash;          <div :class="selectTitle==='公司理念'?'aClass1':'aClass2'" @click="handleSelectTitle('公司理念')">公司理念</div>&ndash;&gt;-->
    <!--        &lt;!&ndash;        </el-col>&ndash;&gt;-->
    <!--        <el-col :span="24" :class="selectTitle==='员工活动'?'container-body-box-title-check':'container-body-box-title'">-->
    <!--          <div :class="selectTitle==='员工活动'?'aClass1':'aClass2'" @click="handleSelectTitle('员工活动')">员工活动</div>-->
    <!--        </el-col>-->
    <!--      </el-row>-->

    <!--      企业文化—公司理念模块-->
    <!--            <div v-if="selectTitle==='公司理念'" class="container-body-content">-->
    <!--              &lt;!&ndash;公司理念—标题&ndash;&gt;-->
    <!--              <div class="container-body-content-titleBox">-->
    <!--                <div class="container-body-content-titleBox-title">走进深圳外代</div>-->
    <!--              </div>-->
    <!--              &lt;!&ndash;公司理念—内容&ndash;&gt;-->
    <!--              <el-row class="container-body-content-box">-->
    <!--                <el-col :span="12">-->
    <!--                  &lt;!&ndash;第一行左边描述的文字内容&ndash;&gt;-->
    <!--                  <div class="container-body-content-box-left">-->
    <!--                    <div class="container-body-content-box-left-title">-->
    <!--                      去拼搏　去实现梦想-->
    <!--                    </div>-->
    <!--                    <div class="container-body-content-box-left-line"></div>-->
    <!--                    <div class="container-body-content-box-left-word">-->
    <!--                      <p>团队的建设是企业实现目标的基础，深圳外代多年来不断加大人才引进和培训力度，创造机会让优秀人才在重要岗位上充分施展才华。 现在一支富有创新惊喜、高度责任感、使命感、热情专注、-->
    <!--                        行动迅速的团队已成为深圳外代高速发展的强大动力。</p>-->
    <!--                      <p>在强大网络和多元化发展平台的支撑下，深圳外代提供的专业化、 个性化服务赢得了越来越多客户的好评和信任， 在协助客户实现发展目标方面发挥积极作用。</p>-->
    <!--                    </div>-->
    <!--                  </div>-->
    <!--                </el-col>-->
    <!--                <el-col :span="12">-->
    <!--                  &lt;!&ndash;第一行右边图片&ndash;&gt;-->
    <!--                  <img class="container-body-content-box-right-img"-->
    <!--                       src="../../../assets/front/images/businessCulture/businessCulture-image1.png" alt=""/>-->
    <!--                </el-col>-->
    <!--              </el-row>-->
    <!--              <el-row class="container-body-content-box">-->
    <!--                <el-col :span="12">-->
    <!--                  &lt;!&ndash;第二行左边图片&ndash;&gt;-->
    <!--                  <img class="container-body-content-box-right-img"-->
    <!--                       src="../../../assets/front/images/businessCulture/businessCulture-image2.png" alt=""/>-->
    <!--                </el-col>-->
    <!--                <el-col :span="12">-->
    <!--                  &lt;!&ndash;第二行右边描述的文字内容&ndash;&gt;-->
    <!--                  <div class="container-body-content-box-left2">-->
    <!--                    <div class="container-body-content-box-left2-title">-->
    <!--                      去拼搏　去实现梦想-->
    <!--                    </div>-->
    <!--                    <div class="container-body-content-box-left2-line"></div>-->
    <!--                    <div class="container-body-content-box-left2-word">-->
    <!--                      <p>团队的建设是企业实现目标的基础，深圳外代多年来不断加大人才引进和培训力度，创造机会让优秀人才在重要岗位上充分施展才华。 现在一支富有创新惊喜、高度责任感、使命感、热情专注、-->
    <!--                        行动迅速的团队已成为深圳外代高速发展的强大动力。</p>-->
    <!--                      <p>在强大网络和多元化发展平台的支撑下，深圳外代提供的专业化、 个性化服务赢得了越来越多客户的好评和信任， 在协助客户实现发展目标方面发挥积极作用。</p>-->
    <!--                    </div>-->
    <!--                  </div>-->

    <!--                </el-col>-->
    <!--              </el-row>-->
    <!--              <el-row class="container-body-content-box">-->
    <!--                <el-col :span="12">-->
    <!--                  &lt;!&ndash;第三行左边描述的内容文字&ndash;&gt;-->
    <!--                  <div class="container-body-content-box-left">-->
    <!--                    <div class="container-body-content-box-left-title">-->
    <!--                      去拼搏　去实现梦想-->
    <!--                    </div>-->
    <!--                    <div class="container-body-content-box-left-line"></div>-->
    <!--                    <div class="container-body-content-box-left-word">-->
    <!--                      <p>团队的建设是企业实现目标的基础，深圳外代多年来不断加大人才引进和培训力度，创造机会让优秀人才在重要岗位上充分施展才华。 现在一支富有创新惊喜、高度责任感、使命感、热情专注、-->
    <!--                        行动迅速的团队已成为深圳外代高速发展的强大动力。</p>-->
    <!--                      <p>在强大网络和多元化发展平台的支撑下，深圳外代提供的专业化、 个性化服务赢得了越来越多客户的好评和信任， 在协助客户实现发展目标方面发挥积极作用。</p>-->
    <!--                    </div>-->
    <!--                  </div>-->
    <!--                </el-col>-->
    <!--                <el-col :span="12">-->
    <!--                  &lt;!&ndash;第三行右边图片&ndash;&gt;-->
    <!--                  <img class="container-body-content-box-right-img"-->
    <!--                       src="../../../assets/front/images/businessCulture/businessCulture-image1.png" alt=""/>-->
    <!--                </el-col>-->
    <!--              </el-row>-->
    <!--            </div>-->

    <!--      &lt;!&ndash;企业文化—员工活动模块&ndash;&gt;-->
    <!--      <div v-if="selectTitle==='员工活动'">-->
    <!--        <div class="container-body-content2">-->
    <!--          <div class="container-body-content2-box">-->
    <!--            <div class="container-body-content2-box-title">员工活动</div>-->
    <!--            &lt;!&ndash;员工活动—年份选择栏&ndash;&gt;-->
    <!--            <div class="container-body-content2-box-yearBox">-->
    <!--              <el-row>-->
    <!--                &lt;!&ndash;2020年&ndash;&gt;-->
    <!--                <el-col :span="4">-->
    <!--                  <div-->
    <!--                    :class="selectYear==='2020'?'container-body-content2-box-yearBox-yearCheck':'container-body-content2-box-yearBox-year'"-->
    <!--                    @click="handleSelectYear('2020')">2020-->
    <!--                    <img class="container-body-content2-box-yearBox-yearCheck-roundCheck"-->
    <!--                         src="../../../assets/front/icon/blue-round.png" alt="" v-if="selectYear==='2020'">-->
    <!--                    <img class="container-body-content2-box-yearBox-year-round"-->
    <!--                         src="../../../assets/front/icon/grey-round.png" alt="" v-else/>-->
    <!--                  </div>-->
    <!--                </el-col>-->
    <!--                &lt;!&ndash;2019年&ndash;&gt;-->
    <!--                <el-col :span="4">-->
    <!--                  <div-->
    <!--                    :class="selectYear==='2019'?'container-body-content2-box-yearBox-yearCheck':'container-body-content2-box-yearBox-year'"-->
    <!--                    @click="handleSelectYear('2019')">2019-->
    <!--                    <img class="container-body-content2-box-yearBox-yearCheck-roundCheck"-->
    <!--                         src="../../../assets/front/icon/blue-round.png" alt="" v-if="selectYear==='2019'">-->
    <!--                    <img class="container-body-content2-box-yearBox-year-round"-->
    <!--                         src="../../../assets/front/icon/grey-round.png" alt="" v-else/>-->
    <!--                  </div>-->
    <!--                </el-col>-->
    <!--                &lt;!&ndash;2018年&ndash;&gt;-->
    <!--                <el-col :span="4">-->
    <!--                  <div-->
    <!--                    :class="selectYear==='2018'?'container-body-content2-box-yearBox-yearCheck':'container-body-content2-box-yearBox-year'"-->
    <!--                    @click="handleSelectYear('2018')">2018-->
    <!--                    <img class="container-body-content2-box-yearBox-yearCheck-roundCheck"-->
    <!--                         src="../../../assets/front/icon/blue-round.png" alt="" v-if="selectYear==='2018'">-->
    <!--                    <img class="container-body-content2-box-yearBox-year-round"-->
    <!--                         src="../../../assets/front/icon/grey-round.png" alt="" v-else/>-->
    <!--                  </div>-->
    <!--                </el-col>-->
    <!--                &lt;!&ndash;2017年&ndash;&gt;-->
    <!--                <el-col :span="4">-->
    <!--                  <div-->
    <!--                    :class="selectYear==='2017'?'container-body-content2-box-yearBox-yearCheck':'container-body-content2-box-yearBox-year'"-->
    <!--                    @click="handleSelectYear('2017')">2017-->
    <!--                    <img class="container-body-content2-box-yearBox-yearCheck-roundCheck"-->
    <!--                         src="../../../assets/front/icon/blue-round.png" alt="" v-if="selectYear==='2017'">-->
    <!--                    <img class="container-body-content2-box-yearBox-year-round"-->
    <!--                         src="../../../assets/front/icon/grey-round.png" alt="" v-else/>-->
    <!--                  </div>-->
    <!--                </el-col>-->
    <!--                &lt;!&ndash;2016年&ndash;&gt;-->
    <!--                <el-col :span="4">-->
    <!--                  <div-->
    <!--                    :class="selectYear==='2016'?'container-body-content2-box-yearBox-yearCheck':'container-body-content2-box-yearBox-year'"-->
    <!--                    @click="handleSelectYear('2016')">2016-->
    <!--                    <img class="container-body-content2-box-yearBox-yearCheck-roundCheck"-->
    <!--                         src="../../../assets/front/icon/blue-round.png" alt="" v-if="selectYear==='2016'">-->
    <!--                    <img class="container-body-content2-box-yearBox-year-round"-->
    <!--                         src="../../../assets/front/icon/grey-round.png" alt="" v-else/>-->
    <!--                  </div>-->
    <!--                </el-col>-->
    <!--                &lt;!&ndash;2015年&ndash;&gt;-->
    <!--                <el-col :span="4">-->
    <!--                  <div-->
    <!--                    :class="selectYear==='2015'?'container-body-content2-box-yearBox-yearCheck':'container-body-content2-box-yearBox-year'"-->
    <!--                    @click="handleSelectYear('2015')">2015-->
    <!--                    <img class="container-body-content2-box-yearBox-yearCheck-roundCheck"-->
    <!--                         src="../../../assets/front/icon/blue-round.png" alt="" v-if="selectYear==='2015'">-->
    <!--                    <img class="container-body-content2-box-yearBox-year-round"-->
    <!--                         src="../../../assets/front/icon/grey-round.png" alt="" v-else/>-->
    <!--                  </div>-->
    <!--                </el-col>-->
    <!--              </el-row>-->
    <!--            </div>-->
    <!--            <div v-loading="listLoading">-->
    <!--              &lt;!&ndash;12月份活动&ndash;&gt;-->
    <!--              <div v-if="monthData12.length>0">-->
    <!--                &lt;!&ndash;活动标题&ndash;&gt;-->
    <!--                <div class="container-body-content2-box-subTitle">{{this.selectYear}}年12月员工活动</div>-->
    <!--                &lt;!&ndash;活动内容&ndash;&gt;-->
    <!--                <el-row :gutter="20">-->
    <!--                  <div v-for="item in monthData12">-->
    <!--                    <router-link :to="'/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">-->
    <!--                      <el-col :span="6">-->
    <!--                        <div class="container-body-content2-box-activeBox">-->
    <!--                          <el-row>-->
    <!--                            <el-col :span="1">-->
    <!--                              <div class="container-body-content2-box-activeBox-round"></div>-->
    <!--                            </el-col>-->
    <!--                            <el-col :span="23">-->
    <!--                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">-->
    <!--                                {{item.summary}}-->
    <!--                              </div>-->
    <!--                            </el-col>-->
    <!--                          </el-row>-->
    <!--                          <div class="container-body-content2-box-activeBox-imgBox">-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'-->
    <!--                                 v-if="item.titleImage!==''"/>-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>-->
    <!--                          </div>-->
    <!--                        </div>-->
    <!--                      </el-col>-->
    <!--                    </router-link>-->
    <!--                  </div>-->
    <!--                </el-row>-->
    <!--              </div>-->
    <!--              &lt;!&ndash;11月份活动&ndash;&gt;-->
    <!--              <div v-if="monthData11.length>0" style="margin-top:40px;">-->
    <!--                &lt;!&ndash;活动标题&ndash;&gt;-->
    <!--                <div class="container-body-content2-box-subTitle">{{this.selectYear}}年11月员工活动</div>-->
    <!--                &lt;!&ndash;活动内容&ndash;&gt;-->
    <!--                <el-row :gutter="20">-->
    <!--                  <div v-for="item in monthData11">-->
    <!--                    <router-link :to="'/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">-->
    <!--                      <el-col :span="6">-->
    <!--                        <div class="container-body-content2-box-activeBox">-->
    <!--                          <el-row>-->
    <!--                            <el-col :span="1">-->
    <!--                              <div class="container-body-content2-box-activeBox-round"></div>-->
    <!--                            </el-col>-->
    <!--                            <el-col :span="23">-->
    <!--                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">-->
    <!--                                {{item.summary}}-->
    <!--                              </div>-->
    <!--                            </el-col>-->
    <!--                          </el-row>-->
    <!--                          <div class="container-body-content2-box-activeBox-imgBox">-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'-->
    <!--                                 v-if="item.titleImage!==''"/>-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>-->
    <!--                          </div>-->
    <!--                        </div>-->
    <!--                      </el-col>-->
    <!--                    </router-link>-->
    <!--                  </div>-->
    <!--                </el-row>-->
    <!--              </div>-->
    <!--              &lt;!&ndash;10月份活动&ndash;&gt;-->
    <!--              <div v-if="monthData10.length>0" style="margin-top:40px;">-->
    <!--                &lt;!&ndash;活动标题&ndash;&gt;-->
    <!--                <div class="container-body-content2-box-subTitle">{{this.selectYear}}年10月员工活动</div>-->
    <!--                &lt;!&ndash;活动内容&ndash;&gt;-->
    <!--                <el-row :gutter="20">-->
    <!--                  <div v-for="item in monthData10">-->
    <!--                    <router-link :to="'/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">-->
    <!--                      <el-col :span="6">-->
    <!--                        <div class="container-body-content2-box-activeBox">-->
    <!--                          <el-row>-->
    <!--                            <el-col :span="1">-->
    <!--                              <div class="container-body-content2-box-activeBox-round"></div>-->
    <!--                            </el-col>-->
    <!--                            <el-col :span="23">-->
    <!--                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">-->
    <!--                                {{item.summary}}-->
    <!--                              </div>-->
    <!--                            </el-col>-->
    <!--                          </el-row>-->
    <!--                          <div class="container-body-content2-box-activeBox-imgBox">-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'-->
    <!--                                 v-if="item.titleImage!==''"/>-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>-->
    <!--                          </div>-->
    <!--                        </div>-->
    <!--                      </el-col>-->
    <!--                    </router-link>-->
    <!--                  </div>-->
    <!--                </el-row>-->
    <!--              </div>-->
    <!--              &lt;!&ndash;9月份活动&ndash;&gt;-->
    <!--              <div v-if="monthData09.length>0" style="margin-top:40px;">-->
    <!--                &lt;!&ndash;活动标题&ndash;&gt;-->
    <!--                <div class="container-body-content2-box-subTitle">{{this.selectYear}}年09月员工活动</div>-->
    <!--                &lt;!&ndash;活动内容&ndash;&gt;-->
    <!--                <el-row :gutter="20">-->
    <!--                  <div v-for="item in monthData09">-->
    <!--                    <router-link :to="'/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">-->
    <!--                      <el-col :span="6">-->
    <!--                        <div class="container-body-content2-box-activeBox">-->
    <!--                          <el-row>-->
    <!--                            <el-col :span="1">-->
    <!--                              <div class="container-body-content2-box-activeBox-round"></div>-->
    <!--                            </el-col>-->
    <!--                            <el-col :span="23">-->
    <!--                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">-->
    <!--                                {{item.summary}}-->
    <!--                              </div>-->
    <!--                            </el-col>-->
    <!--                          </el-row>-->
    <!--                          <div class="container-body-content2-box-activeBox-imgBox">-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'-->
    <!--                                 v-if="item.titleImage!==''"/>-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>-->
    <!--                          </div>-->
    <!--                        </div>-->
    <!--                      </el-col>-->
    <!--                    </router-link>-->
    <!--                  </div>-->
    <!--                </el-row>-->
    <!--              </div>-->
    <!--              &lt;!&ndash;8月份活动&ndash;&gt;-->
    <!--              <div v-if="monthData08.length>0" style="margin-top:40px;">-->
    <!--                &lt;!&ndash;活动标题&ndash;&gt;-->
    <!--                <div class="container-body-content2-box-subTitle">{{this.selectYear}}年08月员工活动</div>-->
    <!--                &lt;!&ndash;活动内容&ndash;&gt;-->
    <!--                <el-row :gutter="20">-->
    <!--                  <div v-for="item in monthData08">-->
    <!--                    <router-link :to="'/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">-->
    <!--                      <el-col :span="6">-->
    <!--                        <div class="container-body-content2-box-activeBox">-->
    <!--                          <el-row>-->
    <!--                            <el-col :span="1">-->
    <!--                              <div class="container-body-content2-box-activeBox-round"></div>-->
    <!--                            </el-col>-->
    <!--                            <el-col :span="23">-->
    <!--                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">-->
    <!--                                {{item.summary}}-->
    <!--                              </div>-->
    <!--                            </el-col>-->
    <!--                          </el-row>-->
    <!--                          <div class="container-body-content2-box-activeBox-imgBox">-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'-->
    <!--                                 v-if="item.titleImage!==''"/>-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>-->
    <!--                          </div>-->
    <!--                        </div>-->
    <!--                      </el-col>-->
    <!--                    </router-link>-->
    <!--                  </div>-->
    <!--                </el-row>-->
    <!--              </div>-->
    <!--              &lt;!&ndash;7月份活动&ndash;&gt;-->
    <!--              <div v-if="monthData07.length>0" style="margin-top:40px;">-->
    <!--                &lt;!&ndash;活动标题&ndash;&gt;-->
    <!--                <div class="container-body-content2-box-subTitle">{{this.selectYear}}年07月员工活动</div>-->
    <!--                &lt;!&ndash;活动内容&ndash;&gt;-->
    <!--                <el-row :gutter="20">-->
    <!--                  <div v-for="item in monthData07">-->
    <!--                    <router-link :to="'/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">-->
    <!--                      <el-col :span="6">-->
    <!--                        <div class="container-body-content2-box-activeBox">-->
    <!--                          <el-row>-->
    <!--                            <el-col :span="1">-->
    <!--                              <div class="container-body-content2-box-activeBox-round"></div>-->
    <!--                            </el-col>-->
    <!--                            <el-col :span="23">-->
    <!--                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">-->
    <!--                                {{item.summary}}-->
    <!--                              </div>-->
    <!--                            </el-col>-->
    <!--                          </el-row>-->
    <!--                          <div class="container-body-content2-box-activeBox-imgBox">-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'-->
    <!--                                 v-if="item.titleImage!==''"/>-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>-->
    <!--                          </div>-->
    <!--                        </div>-->
    <!--                      </el-col>-->
    <!--                    </router-link>-->
    <!--                  </div>-->
    <!--                </el-row>-->
    <!--              </div>-->
    <!--              &lt;!&ndash;6月份活动&ndash;&gt;-->
    <!--              <div v-if="monthData06.length>0" style="margin-top:40px;">-->
    <!--                &lt;!&ndash;活动标题&ndash;&gt;-->
    <!--                <div class="container-body-content2-box-subTitle">{{this.selectYear}}年06月员工活动</div>-->
    <!--                &lt;!&ndash;活动内容&ndash;&gt;-->
    <!--                <el-row :gutter="20">-->
    <!--                  <div v-for="item in monthData06">-->
    <!--                    <router-link :to="'/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">-->
    <!--                      <el-col :span="6">-->
    <!--                        <div class="container-body-content2-box-activeBox">-->
    <!--                          <el-row>-->
    <!--                            <el-col :span="1">-->
    <!--                              <div class="container-body-content2-box-activeBox-round"></div>-->
    <!--                            </el-col>-->
    <!--                            <el-col :span="23">-->
    <!--                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">-->
    <!--                                {{item.summary}}-->
    <!--                              </div>-->
    <!--                            </el-col>-->
    <!--                          </el-row>-->
    <!--                          <div class="container-body-content2-box-activeBox-imgBox">-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'-->
    <!--                                 v-if="item.titleImage!==''"/>-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>-->
    <!--                          </div>-->
    <!--                        </div>-->
    <!--                      </el-col>-->
    <!--                    </router-link>-->
    <!--                  </div>-->
    <!--                </el-row>-->
    <!--              </div>-->
    <!--              &lt;!&ndash;5月份活动&ndash;&gt;-->
    <!--              <div v-if="monthData05.length>0" style="margin-top:40px;">-->
    <!--                &lt;!&ndash;活动标题&ndash;&gt;-->
    <!--                <div class="container-body-content2-box-subTitle">{{this.selectYear}}年05月员工活动</div>-->
    <!--                &lt;!&ndash;活动内容&ndash;&gt;-->
    <!--                <el-row :gutter="20">-->
    <!--                  <div v-for="item in monthData05">-->
    <!--                    <router-link :to="'/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">-->
    <!--                      <el-col :span="6">-->
    <!--                        <div class="container-body-content2-box-activeBox">-->
    <!--                          <el-row>-->
    <!--                            <el-col :span="1">-->
    <!--                              <div class="container-body-content2-box-activeBox-round"></div>-->
    <!--                            </el-col>-->
    <!--                            <el-col :span="23">-->
    <!--                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">-->
    <!--                                {{item.summary}}-->
    <!--                              </div>-->
    <!--                            </el-col>-->
    <!--                          </el-row>-->
    <!--                          <div class="container-body-content2-box-activeBox-imgBox">-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'-->
    <!--                                 v-if="item.titleImage!==''"/>-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>-->
    <!--                          </div>-->
    <!--                        </div>-->
    <!--                      </el-col>-->
    <!--                    </router-link>-->
    <!--                  </div>-->
    <!--                </el-row>-->
    <!--              </div>-->
    <!--              &lt;!&ndash;4月份活动&ndash;&gt;-->
    <!--              <div v-if="monthData04.length>0" style="margin-top:40px;">-->
    <!--                &lt;!&ndash;活动标题&ndash;&gt;-->
    <!--                <div class="container-body-content2-box-subTitle">{{this.selectYear}}年04月员工活动</div>-->
    <!--                &lt;!&ndash;活动内容&ndash;&gt;-->
    <!--                <el-row :gutter="20">-->
    <!--                  <div v-for="item in monthData04">-->
    <!--                    <router-link :to="'/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">-->
    <!--                      <el-col :span="6">-->
    <!--                        <div class="container-body-content2-box-activeBox">-->
    <!--                          <el-row>-->
    <!--                            <el-col :span="1">-->
    <!--                              <div class="container-body-content2-box-activeBox-round"></div>-->
    <!--                            </el-col>-->
    <!--                            <el-col :span="23">-->
    <!--                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">-->
    <!--                                {{item.summary}}-->
    <!--                              </div>-->
    <!--                            </el-col>-->
    <!--                          </el-row>-->
    <!--                          <div class="container-body-content2-box-activeBox-imgBox">-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'-->
    <!--                                 v-if="item.titleImage!==''"/>-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>-->
    <!--                          </div>-->
    <!--                        </div>-->
    <!--                      </el-col>-->
    <!--                    </router-link>-->
    <!--                  </div>-->
    <!--                </el-row>-->
    <!--              </div>-->
    <!--              &lt;!&ndash;3月份活动&ndash;&gt;-->
    <!--              <div v-if="monthData03.length>0" style="margin-top:40px;">-->
    <!--                &lt;!&ndash;活动标题&ndash;&gt;-->
    <!--                <div class="container-body-content2-box-subTitle">{{this.selectYear}}年03月员工活动</div>-->
    <!--                &lt;!&ndash;活动内容&ndash;&gt;-->
    <!--                <el-row :gutter="20">-->
    <!--                  <div v-for="item in monthData03">-->
    <!--                    <router-link :to="'/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">-->
    <!--                      <el-col :span="6">-->
    <!--                        <div class="container-body-content2-box-activeBox">-->
    <!--                          <el-row>-->
    <!--                            <el-col :span="1">-->
    <!--                              <div class="container-body-content2-box-activeBox-round"></div>-->
    <!--                            </el-col>-->
    <!--                            <el-col :span="23">-->
    <!--                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">-->
    <!--                                {{item.summary}}-->
    <!--                              </div>-->
    <!--                            </el-col>-->
    <!--                          </el-row>-->
    <!--                          <div class="container-body-content2-box-activeBox-imgBox">-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'-->
    <!--                                 v-if="item.titleImage!==''"/>-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>-->
    <!--                          </div>-->
    <!--                        </div>-->
    <!--                      </el-col>-->
    <!--                    </router-link>-->
    <!--                  </div>-->
    <!--                </el-row>-->
    <!--              </div>-->
    <!--              &lt;!&ndash;2月份活动&ndash;&gt;-->
    <!--              <div v-if="monthData02.length>0" style="margin-top:40px;">-->
    <!--                &lt;!&ndash;活动标题&ndash;&gt;-->
    <!--                <div class="container-body-content2-box-subTitle">{{this.selectYear}}年02月员工活动</div>-->
    <!--                &lt;!&ndash;活动内容&ndash;&gt;-->
    <!--                <el-row :gutter="20">-->
    <!--                  <div v-for="item in monthData02">-->
    <!--                    <router-link :to="'/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">-->
    <!--                      <el-col :span="6">-->
    <!--                        <div class="container-body-content2-box-activeBox">-->
    <!--                          <el-row>-->
    <!--                            <el-col :span="1">-->
    <!--                              <div class="container-body-content2-box-activeBox-round"></div>-->
    <!--                            </el-col>-->
    <!--                            <el-col :span="23">-->
    <!--                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">-->
    <!--                                {{item.summary}}-->
    <!--                              </div>-->
    <!--                            </el-col>-->
    <!--                          </el-row>-->
    <!--                          <div class="container-body-content2-box-activeBox-imgBox">-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'-->
    <!--                                 v-if="item.titleImage!==''"/>-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>-->
    <!--                          </div>-->
    <!--                        </div>-->
    <!--                      </el-col>-->
    <!--                    </router-link>-->
    <!--                  </div>-->
    <!--                </el-row>-->
    <!--              </div>-->
    <!--              &lt;!&ndash;1月份活动&ndash;&gt;-->
    <!--              <div v-if="monthData01.length>0" style="margin-top:40px;">-->
    <!--                &lt;!&ndash;活动标题&ndash;&gt;-->
    <!--                <div class="container-body-content2-box-subTitle">{{this.selectYear}}年01月员工活动</div>-->
    <!--                &lt;!&ndash;活动内容&ndash;&gt;-->
    <!--                <el-row :gutter="20">-->
    <!--                  <div v-for="item in monthData01">-->
    <!--                    <router-link :to="'/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">-->
    <!--                      <el-col :span="6">-->
    <!--                        <div class="container-body-content2-box-activeBox">-->
    <!--                          <el-row>-->
    <!--                            <el-col :span="1">-->
    <!--                              <div class="container-body-content2-box-activeBox-round"></div>-->
    <!--                            </el-col>-->
    <!--                            <el-col :span="23">-->
    <!--                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">-->
    <!--                                {{item.summary}}-->
    <!--                              </div>-->
    <!--                            </el-col>-->
    <!--                          </el-row>-->
    <!--                          <div class="container-body-content2-box-activeBox-imgBox">-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'-->
    <!--                                 v-if="item.titleImage!==''"/>-->
    <!--                            <img class="container-body-content2-box-activeBox-imgBox-img"-->
    <!--                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"-->
    <!--                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>-->
    <!--                          </div>-->
    <!--                        </div>-->
    <!--                      </el-col>-->
    <!--                    </router-link>-->
    <!--                  </div>-->
    <!--                </el-row>-->
    <!--              </div>-->
    <!--            </div>-->
    <!--          </div>-->
    <!--        </div>-->
    <!--      </div>-->
    <!--    </div>-->

    <!--页脚模块-->
    <Footer></Footer>

  </div>
</template>

<script>
  import 'swiper/dist/css/swiper.css'
  import {swiper, swiperSlide} from 'vue-awesome-swiper'
  import Header from '@/views/public/header/header'  //引入页头组件
  import Footer from '@/views/public/footer/footer'
  import {apiGetNews, apiGetNewsList} from '@/api/news' //引入页尾组件

  export default {
    name: 'business-culture',
    components: {Footer, Header, swiper, swiperSlide},
    data() {
      return {
        // swiper大图
        // swiperOptionTop: {
        //   autoplay: true,
        //   loop: true,
        //   loopedSlides: 5,
        //   spaceBetween: 10,
        //   navigation: {
        //     nextEl: '.swiper-button-next',
        //     prevEl: '.swiper-button-prev'
        //   }
        // },
        // // swiper小图
        // swiperOptionThumbs: {
        //   loop: true,
        //   spaceBetween: 10,
        //   loopedSlides: 5, // lo
        //   centeredSlides: true,
        //   slidesPerView: '5',
        //   touchRatio: 0.2,
        //   slideToClickedSlide: true,
        //   navigation: {
        //     nextEl: '.swiper-button-next',
        //     prevEl: '.swiper-button-prev'
        //   }
        // },
        last: false,
        activityIndex: 0,
        totalSize: 0,
        totalPages: 0,
        listLoading: false,//加载
        picHeight: 0, //动态获取员工活动的图片
        activeIndex: '6',//当前页面是企业文化
        selectTitle: '员工活动',//默认打开企业文化页面显示公司理念的内容
        activity: {},
        activityData: [],//某一年的活动数据
        activityCriteria: {
          type: 'list',
          web: 'PENAVICOSZ',
          language: '中文',
          catalog: '员工活动',
          keyword: '',
          page: 0,
          size: 5
        }
      }
    },  // 监听路由变化时，页面跳转
    watch: {
      '$route'(to) {
        if (to.query.selectItem !== undefined) {
          this.selectTitle = to.query.selectItem
          to.query.selectItem = undefined
          if (this.selectTitle === '员工活动') {
            this.activityCriteria.page = 0
            this.handleSelectYear()
          }
        } else {
          this.selectTitle = '员工活动'
          this.activityCriteria.page = 0
          this.handleSelectYear()
        }
      }
    },
    methods: {
      imgCheck(id, index) {
        this.activityIndex = index
        apiGetNews(id).then((res) => {
          this.activity = res
        })
      },
      lastCheck2() {
        if (this.activityCriteria.page - 1 >= 0) {
          this.activityIndex = 0
          this.last = true
          this.activityCriteria.page = this.activityCriteria.page - 1
          this.handleSelectYear()
        }
      },
      lastCheck3() {
        if (this.activityCriteria.page - 1 >= 0) {
          this.activityIndex = 4
          this.last = true
          this.activityCriteria.page = this.activityCriteria.page - 1
          this.handleSelectYear2()
        }
      },
      nextCheck3() {
        if (this.activityCriteria.page + 1 <= this.totalPages - 1) {
          this.activityIndex = 0
          this.last = false
          this.activityCriteria.page = this.activityCriteria.page + 1
          this.handleSelectYear2()
        }
      },
      nextCheck2() {
        if (this.activityCriteria.page + 1 <= this.totalPages - 1) {
          this.activityIndex = 0
          this.last = false
          this.activityCriteria.page = this.activityCriteria.page + 1
          this.handleSelectYear()
        }
      },
      lastCheck1(num) {
        if (num - 1 >= 0) {
          this.activityIndex = this.activityIndex - 1
          apiGetNews(this.activityData[this.activityIndex].id).then((res) => {
            this.activity = res
          })
        } else {
          if (this.activityCriteria.page > 0) {
            this.lastCheck3()
          }
        }
      },
      nextCheck1(num) {
        if (num + 1 <= this.activityData.length - 1) {
          this.activityIndex = this.activityIndex + 1
          apiGetNews(this.activityData[this.activityIndex].id).then((res) => {
            this.activity = res
          })
        } else {
          if (this.activityCriteria.page < this.totalPages - 1) {
            this.nextCheck3()
          }
        }
      },
      //获取某年的活动数据
      handleSelectYear() {
        this.listLoading = true
        this.activity = {}
        this.activityIndex = 0
        this.activityData = []
        apiGetNewsList(this.activityCriteria).then((res) => {
          // this.swiperOptionTop.loopedSlides = res.totalElements
          // this.swiperOptionThumbs.loopedSlides = res.totalElements
          this.totalSize = res.totalElements
          this.totalPages = res.totalPages
          this.activityData = res.content
          for (let i = 0; i < this.activityData.length; i++) {
            this.activityData[i].titleImage = 'data:image/jpeg;base64,' + this.activityData[i].titleImage
          }
          apiGetNews(this.activityData[0].id).then((res) => {
            this.activity = res
          })
          // while (this.activityCriteria.page + 1 !== res.totalPages) {
          //   this.activityData1 = []
          //   this.activityCriteria.page = this.activityCriteria.page + 1
          //   apiGetNewsList(this.activityCriteria).then((res) => {
          //     this.activityData1 = res.content
          //     for (let i = 0; i < this.activityData1.length; i++) {
          //       this.activityData[this.activityData.length - 1 + i].title = this.activityData1[i].title
          //       this.activityData[this.activityData.length - 1 + i].titleImage = this.activityData1[i].titleImage
          //     }
          //   })
          // }
          // this.monthData12 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '12')
          // this.monthData11 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '11')
          // this.monthData10 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '10')
          // this.monthData09 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '09')
          // this.monthData08 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '08')
          // this.monthData07 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '07')
          // this.monthData06 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '06')
          // this.monthData05 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '05')
          // this.monthData04 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '04')
          // this.monthData03 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '03')
          // this.monthData02 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '02')
          // this.monthData01 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '01')
          // for (let i = 0; i < this.activityData.length; i++) {
          //   this.activityData[i].summary = this.activityData[i].summary.replace('&ldquo;', '“')
          //   this.activityData[i].summary = this.activityData[i].summary.replace('&ldqu', '“')
          //   this.activityData[i].summary = this.activityData[i].summary.replace('&rdquo;', '”')
          // }
          // swiper两个轮播图相互控制
          // this.$nextTick(() => {
          //   const swiperTop = this.$refs.swiperTop.swiper
          //   const swiperThumbs = this.$refs.swiperThumbs.swiper
          //   swiperTop.controller.control = swiperThumbs
          //   swiperThumbs.controller.control = swiperTop
          // })
          this.listLoading = false
        })
      },
      handleSelectYear2() {
        this.listLoading = true
        this.activity = {}
        this.activityData = []
        apiGetNewsList(this.activityCriteria).then((res) => {
          // this.swiperOptionTop.loopedSlides = res.totalElements
          // this.swiperOptionThumbs.loopedSlides = res.totalElements
          this.totalSize = res.totalElements
          this.totalPages = res.totalPages
          this.activityData = res.content
          for (let i = 0; i < this.activityData.length; i++) {
            this.activityData[i].titleImage = 'data:image/jpeg;base64,' + this.activityData[i].titleImage
          }
          apiGetNews(this.activityData[this.activityIndex].id).then((res) => {
            this.activity = res
          })
          // while (this.activityCriteria.page + 1 !== res.totalPages) {
          //   this.activityData1 = []
          //   this.activityCriteria.page = this.activityCriteria.page + 1
          //   apiGetNewsList(this.activityCriteria).then((res) => {
          //     this.activityData1 = res.content
          //     for (let i = 0; i < this.activityData1.length; i++) {
          //       this.activityData[this.activityData.length - 1 + i].title = this.activityData1[i].title
          //       this.activityData[this.activityData.length - 1 + i].titleImage = this.activityData1[i].titleImage
          //     }
          //   })
          // }
          // this.monthData12 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '12')
          // this.monthData11 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '11')
          // this.monthData10 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '10')
          // this.monthData09 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '09')
          // this.monthData08 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '08')
          // this.monthData07 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '07')
          // this.monthData06 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '06')
          // this.monthData05 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '05')
          // this.monthData04 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '04')
          // this.monthData03 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '03')
          // this.monthData02 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '02')
          // this.monthData01 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '01')
          // for (let i = 0; i < this.activityData.length; i++) {
          //   this.activityData[i].summary = this.activityData[i].summary.replace('&ldquo;', '“')
          //   this.activityData[i].summary = this.activityData[i].summary.replace('&ldqu', '“')
          //   this.activityData[i].summary = this.activityData[i].summary.replace('&rdquo;', '”')
          // }
          // swiper两个轮播图相互控制
          // this.$nextTick(() => {
          //   const swiperTop = this.$refs.swiperTop.swiper
          //   const swiperThumbs = this.$refs.swiperThumbs.swiper
          //   swiperTop.controller.control = swiperThumbs
          //   swiperThumbs.controller.control = swiperTop
          // })
          this.listLoading = false
        })
      },
      // 企业文化菜单栏选择方法
      handleSelectTitle(item) {
        this.selectTitle = item
        if (item === '员工活动') {
          this.handleSelectYear()
        }
      },
      // 设置图片的高度等于宽度
      justifyImgHeight() {
        this.$nextTick(() => {
          this.picHeight= this.$refs.element.offsetWidth
          this.picHeight= this.picHeight/1.78
        })
      }
    },
    created() {
      this.handleSelectYear()
      this.justifyImgHeight()
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .swiperTitle {
    position: absolute;
    top: -50px;
    left: 0;
    font-size: 26px;
    font-family: 黑体, sans-serif;
    font-weight: 600;
    color: #3B3F47;
    text-align: center;
    width: 100%;
  }

  .thumb-example {
    width: 100%;
    height: 800px;
  }

  .sliderStyle {
    position: relative;
    background-repeat: no-repeat;
    background-size: 100% 100%;
  }

  .swiper {
    padding-top: 50px;

    &.gallery-top {
      height: 75%;
      width: 100%;
      margin-bottom: 3%;
    }

    &.gallery-thumbs {
      height: 17%;
      box-sizing: border-box;
      padding: 0 0;
    }

    &.gallery-thumbs .swiper-slide {
      width: 25%;
      height: 100%;
      opacity: 0.4;
    }

    &.gallery-thumbs .swiper-slide-active {
      opacity: 1;
    }
  }

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
      background-image: url("../../../assets/front/images/businessCulture/businessCulture-banner-new.png");

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
      padding: 60px 20% 120px 20%;
      background-size: 100% auto;
      background-repeat: no-repeat;
      background-image: url('../../../assets/front/images/businessCulture/businessCulture-image3.png');

      &-title {
        font-size: 26px;
        font-family: PingFangSC-Semibold, sans-serif;
        font-weight: 600;
        color: #3B3F47;
        text-align: center;
        margin-bottom: 30px;
      }

      &-contentBox {
        margin-bottom: 30px;
        position: relative;

        &-img1 {
          position: absolute;
          top: 50%;
          margin-top: -22px;
          left: 20px;
        }

        &-img1:hover {
          cursor: pointer;
        }

        &-img2 {
          position: absolute;
          top: 50%;
          margin-top: -22px;
          right: 20px;
        }

        &-img2:hover {
          cursor: pointer;
        }
      }


      &-img {
        width: 100%;
      }

      &-img:hover {
        cursor: pointer;
      }

      &-imgCheck {
        border: 5px solid #277AE3;
        padding: 2px;
        width: 100%;
      }

      &-last {
        position: absolute;
        top: 50%;
        margin-top: -14px;
        left: -21px;
        width: 0;
        height: 0;
        border-top: 14px solid transparent;
        border-bottom: 14px solid transparent;
        border-right: 18px solid #D8D8D8;
      }

      &-last {
        cursor: pointer;
      }

      &-lastCheck {
        position: absolute;
        top: 50%;
        margin-top: -14px;
        left: -21px;
        width: 0;
        height: 0;
        border-top: 14px solid transparent;
        border-bottom: 14px solid transparent;
        border-right: 18px solid #3281E4;
      }

      &-lastCheck:hover {
        cursor: pointer;
      }

      &-next {
        position: absolute;
        top: 50%;
        margin-top: -14px;
        right: -21px;
        width: 0;
        height: 0;
        border-top: 14px solid transparent;
        border-bottom: 14px solid transparent;
        border-left: 18px solid #D8D8D8;
      }

      &-next {
        cursor: pointer;
      }

      &-nextCheck {
        position: absolute;
        top: 50%;
        margin-top: -14px;
        right: -21px;
        width: 0;
        height: 0;
        border-top: 14px solid transparent;
        border-bottom: 14px solid transparent;
        border-left: 18px solid #3281E4;
      }

      &-nextCheck:hover {
        cursor: pointer;
      }
    }

  }

  /*当分辨率少于1400px时，公司理念模块的样式改变*/
  /*@media screen and (max-width: 1400px) {*/
  /*  .container-body-content-box-left {*/
  /*    height: 100%;*/
  /*    padding: 5% 5% 0 16%;*/
  /*  }*/
  /*  .container-body-content-box-left2 {*/
  /*    height: 100%;*/
  /*    padding: 5% 5% 0 16%;*/
  /*  }*/

  /*  .container-body-content-box-left-title {*/

  /*    font-size: 24px;*/
  /*    font-family: PingFangSC-Regular, sans-serif;*/
  /*    font-weight: 400;*/
  /*    color: #3B3F47;*/

  /*  }*/
  /*  .container-body-content-box-left-word {*/
  /*    font-size: 15px;*/
  /*    font-family: PingFangSC-Regular, sans-serif;*/
  /*    font-weight: 400;*/
  /*    color: #3A3F47;*/
  /*    line-height: 22px;*/

  /*  }*/
  /*  .container-body-content-box-left2-title {*/
  /*    font-size: 24px;*/
  /*    font-family: PingFangSC-Regular, sans-serif;*/
  /*    font-weight: 400;*/
  /*    color: #3B3F47;*/
  /*  }*/
  /*  .container-body-content-box-left2-word {*/
  /*    font-size: 15px;*/
  /*    font-family: PingFangSC-Regular, sans-serif;*/
  /*    font-weight: 400;*/
  /*    color: #3A3F47;*/
  /*    line-height: 22px;*/
  /*  }*/
  /*}*/
  .container-body-contentBox-content > > > img {
    width: 100%;
    height: inherit;
  }
   .container-body-contentBox-content > > > p {
     height: inherit;
  }
</style>


