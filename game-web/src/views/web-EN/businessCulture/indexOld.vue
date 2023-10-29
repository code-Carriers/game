<!--suppress JSSuspiciousNameCombination -->
<template>
  <div class="container">
    <!--导航栏模块-->
    <Header :active-index="activeIndex"></Header>

    <!--横幅banner模块-->
    <div class="container-banner">
<!--      <el-row>-->
<!--        <el-col :span="24">-->
<!--          <div class="container-banner-title animate__animated animate__bounceInDown">CORPORATE CULTURE</div>-->
<!--        </el-col>-->
<!--      </el-row>-->
<!--      <el-row>-->
<!--        <el-col :span="24">-->
<!--          <div class="container-banner-content animate__animated animate__bounceInDown">企业文化</div>-->
<!--        </el-col>-->
<!--      </el-row>-->
    </div>

    <!--企业文化主体模块-->
    <div class="container-body">
      <!--企业文化选择菜单栏-->
      <el-row class="container-body-box">
        <!--        <el-col :span="12" :class="selectTitle==='公司理念'?'container-body-box-title-check':'container-body-box-title'">-->
        <!--          <div :class="selectTitle==='公司理念'?'aClass1':'aClass2'" @click="handleSelectTitle('公司理念')">Company Philosophy-->
        <!--          </div>-->
        <!--        </el-col>-->
        <el-col :span="24" :class="selectTitle==='员工活动'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='员工活动'?'aClass1':'aClass2'" @click="handleSelectTitle('员工活动')">Employee Activity
          </div>
        </el-col>
      </el-row>

      <!--企业文化—公司理念模块-->
      <!--      <div v-if="selectTitle==='公司理念'" class="container-body-content">-->
      <!--        &lt;!&ndash;公司理念—标题&ndash;&gt;-->
      <!--        <div class="container-body-content-titleBox">-->
      <!--          <div class="container-body-content-titleBox-title">Into Shenzhen Waidai</div>-->
      <!--        </div>-->
      <!--        &lt;!&ndash;公司理念—内容&ndash;&gt;-->
      <!--        <el-row class="container-body-content-box">-->
      <!--          <el-col :span="12">-->
      <!--            &lt;!&ndash;第一行左边描述的文字内容&ndash;&gt;-->
      <!--            <div class="container-body-content-box-left">-->
      <!--              <div class="container-body-content-box-left-title">-->
      <!--                Go hard to realize your dream-->
      <!--              </div>-->
      <!--              <div class="container-body-content-box-left-line"></div>-->
      <!--              <div class="container-body-content-box-left-word">-->
      <!--                <p>Team building is the foundation for an enterprise to achieve its goals. For many years, Shenzhen-->
      <!--                  Foreign Agency has continuously increased the introduction and training of talents, creating-->
      <!--                  opportunities for outstanding talents to fully display their talents in important positions. Now a-->
      <!--                  team full of innovative surprises, a high sense of responsibility, a sense of mission, enthusiasm and-->
      <!--                  focus, and rapid action has become a powerful driving force for the rapid development of Shenzhen-->
      <!--                  Foreign Agency.</p>-->
      <!--                <p>With the support of a strong network and a diversified development platform, the professional and-->
      <!--                  personalized services provided by Shenzhen Foreign Agency have won praise and trust from more and more-->
      <!--                  customers, and they play an active role in assisting customers to achieve their development goals.</p>-->
      <!--              </div>-->
      <!--            </div>-->
      <!--          </el-col>-->
      <!--          <el-col :span="12">-->
      <!--            &lt;!&ndash;第一行右边图片&ndash;&gt;-->
      <!--            <img class="container-body-content-box-right-img"-->
      <!--                 src="../../../assets/front/images/businessCulture/businessCulture-image1.png" alt=""/>-->
      <!--          </el-col>-->
      <!--        </el-row>-->
      <!--        <el-row class="container-body-content-box">-->
      <!--          <el-col :span="12">-->
      <!--            &lt;!&ndash;第二行左边图片&ndash;&gt;-->
      <!--            <img class="container-body-content-box-right-img"-->
      <!--                 src="../../../assets/front/images/businessCulture/businessCulture-image2.png" alt=""/>-->
      <!--          </el-col>-->
      <!--          <el-col :span="12">-->
      <!--            &lt;!&ndash;第二行右边描述的文字内容&ndash;&gt;-->
      <!--            <div class="container-body-content-box-left2">-->
      <!--              <div class="container-body-content-box-left2-title">-->
      <!--                Go hard to realize your dream-->
      <!--              </div>-->
      <!--              <div class="container-body-content-box-left2-line"></div>-->
      <!--              <div class="container-body-content-box-left2-word">-->
      <!--                <p>Team building is the foundation for an enterprise to achieve its goals. For many years, Shenzhen-->
      <!--                  Foreign Agency has continuously increased the introduction and training of talents, creating-->
      <!--                  opportunities for outstanding talents to fully display their talents in important positions. Now a-->
      <!--                  team full of innovative surprises, a high sense of responsibility, a sense of mission, enthusiasm and-->
      <!--                  focus, and rapid action has become a powerful driving force for the rapid development of Shenzhen-->
      <!--                  Foreign Agency.</p>-->
      <!--                <p>With the support of a strong network and a diversified development platform, the professional and-->
      <!--                  personalized services provided by Shenzhen Foreign Agency have won praise and trust from more and more-->
      <!--                  customers, and they play an active role in assisting customers to achieve their development goals.</p>-->
      <!--              </div>-->
      <!--            </div>-->

      <!--          </el-col>-->
      <!--        </el-row>-->
      <!--        <el-row class="container-body-content-box">-->
      <!--          <el-col :span="12">-->
      <!--            &lt;!&ndash;第三行左边描述的内容文字&ndash;&gt;-->
      <!--            <div class="container-body-content-box-left">-->
      <!--              <div class="container-body-content-box-left-title">-->
      <!--                Go hard to realize your dream-->
      <!--              </div>-->
      <!--              <div class="container-body-content-box-left-line"></div>-->
      <!--              <div class="container-body-content-box-left-word">-->
      <!--                <p>Team building is the foundation for an enterprise to achieve its goals. For many years, Shenzhen-->
      <!--                  Foreign Agency has continuously increased the introduction and training of talents, creating-->
      <!--                  opportunities for outstanding talents to fully display their talents in important positions. Now a-->
      <!--                  team full of innovative surprises, a high sense of responsibility, a sense of mission, enthusiasm and-->
      <!--                  focus, and rapid action has become a powerful driving force for the rapid development of Shenzhen-->
      <!--                  Foreign Agency.</p>-->
      <!--                <p>With the support of a strong network and a diversified development platform, the professional and-->
      <!--                  personalized services provided by Shenzhen Foreign Agency have won praise and trust from more and more-->
      <!--                  customers, and they play an active role in assisting customers to achieve their development goals.</p>-->
      <!--              </div>-->
      <!--            </div>-->
      <!--          </el-col>-->
      <!--          <el-col :span="12">-->
      <!--            &lt;!&ndash;第三行右边图片&ndash;&gt;-->
      <!--            <img class="container-body-content-box-right-img"-->
      <!--                 src="../../../assets/front/images/businessCulture/businessCulture-image1.png" alt=""/>-->
      <!--          </el-col>-->
      <!--        </el-row>-->
      <!--      </div>-->

      <!--企业文化—员工活动模块-->
      <div v-if="selectTitle==='员工活动'">
        <div class="container-body-content2">
          <div class="container-body-content2-box">
            <div class="container-body-content2-box-title">Employee Activity</div>
            <!--员工活动—年份选择栏-->
            <div class="container-body-content2-box-yearBox">
              <el-row>
                <!--2020年-->
                <el-col :span="4">
                  <div
                    :class="selectYear==='2020'?'container-body-content2-box-yearBox-yearCheck':'container-body-content2-box-yearBox-year'"
                    @click="handleSelectYear('2020')">2020
                    <img class="container-body-content2-box-yearBox-yearCheck-roundCheck"
                         src="../../../assets/front/icon/blue-round.png" alt="" v-if="selectYear==='2020'">
                    <img class="container-body-content2-box-yearBox-year-round"
                         src="../../../assets/front/icon/grey-round.png" alt="" v-else/>
                  </div>
                </el-col>
                <!--2019年-->
                <el-col :span="4">
                  <div
                    :class="selectYear==='2019'?'container-body-content2-box-yearBox-yearCheck':'container-body-content2-box-yearBox-year'"
                    @click="handleSelectYear('2019')">2019
                    <img class="container-body-content2-box-yearBox-yearCheck-roundCheck"
                         src="../../../assets/front/icon/blue-round.png" alt="" v-if="selectYear==='2019'">
                    <img class="container-body-content2-box-yearBox-year-round"
                         src="../../../assets/front/icon/grey-round.png" alt="" v-else/>
                  </div>
                </el-col>
                <!--2018年-->
                <el-col :span="4">
                  <div
                    :class="selectYear==='2018'?'container-body-content2-box-yearBox-yearCheck':'container-body-content2-box-yearBox-year'"
                    @click="handleSelectYear('2018')">2018
                    <img class="container-body-content2-box-yearBox-yearCheck-roundCheck"
                         src="../../../assets/front/icon/blue-round.png" alt="" v-if="selectYear==='2018'">
                    <img class="container-body-content2-box-yearBox-year-round"
                         src="../../../assets/front/icon/grey-round.png" alt="" v-else/>
                  </div>
                </el-col>
                <!--2017年-->
                <el-col :span="4">
                  <div
                    :class="selectYear==='2017'?'container-body-content2-box-yearBox-yearCheck':'container-body-content2-box-yearBox-year'"
                    @click="handleSelectYear('2017')">2017
                    <img class="container-body-content2-box-yearBox-yearCheck-roundCheck"
                         src="../../../assets/front/icon/blue-round.png" alt="" v-if="selectYear==='2017'">
                    <img class="container-body-content2-box-yearBox-year-round"
                         src="../../../assets/front/icon/grey-round.png" alt="" v-else/>
                  </div>
                </el-col>
                <!--2016年-->
                <el-col :span="4">
                  <div
                    :class="selectYear==='2016'?'container-body-content2-box-yearBox-yearCheck':'container-body-content2-box-yearBox-year'"
                    @click="handleSelectYear('2016')">2016
                    <img class="container-body-content2-box-yearBox-yearCheck-roundCheck"
                         src="../../../assets/front/icon/blue-round.png" alt="" v-if="selectYear==='2016'">
                    <img class="container-body-content2-box-yearBox-year-round"
                         src="../../../assets/front/icon/grey-round.png" alt="" v-else/>
                  </div>
                </el-col>
                <!--2015年-->
                <el-col :span="4">
                  <div
                    :class="selectYear==='2015'?'container-body-content2-box-yearBox-yearCheck':'container-body-content2-box-yearBox-year'"
                    @click="handleSelectYear('2015')">2015
                    <img class="container-body-content2-box-yearBox-yearCheck-roundCheck"
                         src="../../../assets/front/icon/blue-round.png" alt="" v-if="selectYear==='2015'">
                    <img class="container-body-content2-box-yearBox-year-round"
                         src="../../../assets/front/icon/grey-round.png" alt="" v-else/>
                  </div>
                </el-col>
              </el-row>
            </div>
            <div v-loading="listLoading">
              <!--12月份活动-->
              <div v-if="monthData12.length>0">
                <!--活动标题-->
                <div class="container-body-content2-box-subTitle">Staff activities in December {{this.selectYear}}</div>
                <!--活动内容-->
                <el-row :gutter="20">
                  <div v-for="item in monthData12">
                    <router-link :to="'/web-EN/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">
                      <el-col :span="6">
                        <div class="container-body-content2-box-activeBox">
                          <el-row>
                            <el-col :span="1">
                              <div class="container-body-content2-box-activeBox-round"></div>
                            </el-col>
                            <el-col :span="23">
                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">
                                {{item.summary}}
                              </div>
                            </el-col>
                          </el-row>
                          <div class="container-body-content2-box-activeBox-imgBox">
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'
                                 v-if="item.titleImage!==''"/>
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>
                          </div>
                        </div>
                      </el-col>
                    </router-link>
                  </div>
                </el-row>
              </div>
              <!--11月份活动-->
              <div v-if="monthData11.length>0" style="margin-top:40px;">
                <!--活动标题-->
                <div class="container-body-content2-box-subTitle">Staff activities in November {{this.selectYear}}</div>
                <!--活动内容-->
                <el-row :gutter="20">
                  <div v-for="item in monthData11">
                    <router-link :to="'/web-EN/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">
                      <el-col :span="6">
                        <div class="container-body-content2-box-activeBox">
                          <el-row>
                            <el-col :span="1">
                              <div class="container-body-content2-box-activeBox-round"></div>
                            </el-col>
                            <el-col :span="23">
                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">
                                {{item.summary}}
                              </div>
                            </el-col>
                          </el-row>
                          <div class="container-body-content2-box-activeBox-imgBox">
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'
                                 v-if="item.titleImage!==''"/>
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>
                          </div>
                        </div>
                      </el-col>
                    </router-link>
                  </div>
                </el-row>
              </div>
              <!--10月份活动-->
              <div v-if="monthData10.length>0" style="margin-top:40px;">
                <!--活动标题-->
                <div class="container-body-content2-box-subTitle">Staff activities in October {{this.selectYear}}</div>
                <!--活动内容-->
                <el-row :gutter="20">
                  <div v-for="item in monthData10">
                    <router-link :to="'/web-EN/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">
                      <el-col :span="6">
                        <div class="container-body-content2-box-activeBox">
                          <el-row>
                            <el-col :span="1">
                              <div class="container-body-content2-box-activeBox-round"></div>
                            </el-col>
                            <el-col :span="23">
                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">
                                {{item.summary}}
                              </div>
                            </el-col>
                          </el-row>
                          <div class="container-body-content2-box-activeBox-imgBox">
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'
                                 v-if="item.titleImage!==''"/>
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>
                          </div>
                        </div>
                      </el-col>
                    </router-link>
                  </div>
                </el-row>
              </div>
              <!--9月份活动-->
              <div v-if="monthData09.length>0" style="margin-top:40px;">
                <!--活动标题-->
                <div class="container-body-content2-box-subTitle">Staff activities in September {{this.selectYear}}
                </div>
                <!--活动内容-->
                <el-row :gutter="20">
                  <div v-for="item in monthData09">
                    <router-link :to="'/web-EN/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">
                      <el-col :span="6">
                        <div class="container-body-content2-box-activeBox">
                          <el-row>
                            <el-col :span="1">
                              <div class="container-body-content2-box-activeBox-round"></div>
                            </el-col>
                            <el-col :span="23">
                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">
                                {{item.summary}}
                              </div>
                            </el-col>
                          </el-row>
                          <div class="container-body-content2-box-activeBox-imgBox">
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'
                                 v-if="item.titleImage!==''"/>
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>
                          </div>
                        </div>
                      </el-col>
                    </router-link>
                  </div>
                </el-row>
              </div>
              <!--8月份活动-->
              <div v-if="monthData08.length>0" style="margin-top:40px;">
                <!--活动标题-->
                <div class="container-body-content2-box-subTitle">Staff activities in August {{this.selectYear}}</div>
                <!--活动内容-->
                <el-row :gutter="20">
                  <div v-for="item in monthData08">
                    <router-link :to="'/web-EN/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">
                      <el-col :span="6">
                        <div class="container-body-content2-box-activeBox">
                          <el-row>
                            <el-col :span="1">
                              <div class="container-body-content2-box-activeBox-round"></div>
                            </el-col>
                            <el-col :span="23">
                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">
                                {{item.summary}}
                              </div>
                            </el-col>
                          </el-row>
                          <div class="container-body-content2-box-activeBox-imgBox">
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'
                                 v-if="item.titleImage!==''"/>
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>
                          </div>
                        </div>
                      </el-col>
                    </router-link>
                  </div>
                </el-row>
              </div>
              <!--7月份活动-->
              <div v-if="monthData07.length>0" style="margin-top:40px;">
                <!--活动标题-->
                <div class="container-body-content2-box-subTitle">Staff activities in July {{this.selectYear}}</div>
                <!--活动内容-->
                <el-row :gutter="20">
                  <div v-for="item in monthData07">
                    <router-link :to="'/web-EN/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">
                      <el-col :span="6">
                        <div class="container-body-content2-box-activeBox">
                          <el-row>
                            <el-col :span="1">
                              <div class="container-body-content2-box-activeBox-round"></div>
                            </el-col>
                            <el-col :span="23">
                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">
                                {{item.summary}}
                              </div>
                            </el-col>
                          </el-row>
                          <div class="container-body-content2-box-activeBox-imgBox">
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'
                                 v-if="item.titleImage!==''"/>
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>
                          </div>
                        </div>
                      </el-col>
                    </router-link>
                  </div>
                </el-row>
              </div>
              <!--6月份活动-->
              <div v-if="monthData06.length>0" style="margin-top:40px;">
                <!--活动标题-->
                <div class="container-body-content2-box-subTitle">Staff activities in June {{this.selectYear}}</div>
                <!--活动内容-->
                <el-row :gutter="20">
                  <div v-for="item in monthData06">
                    <router-link :to="'/web-EN/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">
                      <el-col :span="6">
                        <div class="container-body-content2-box-activeBox">
                          <el-row>
                            <el-col :span="1">
                              <div class="container-body-content2-box-activeBox-round"></div>
                            </el-col>
                            <el-col :span="23">
                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">
                                {{item.summary}}
                              </div>
                            </el-col>
                          </el-row>
                          <div class="container-body-content2-box-activeBox-imgBox">
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'
                                 v-if="item.titleImage!==''"/>
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>
                          </div>
                        </div>
                      </el-col>
                    </router-link>
                  </div>
                </el-row>
              </div>
              <!--5月份活动-->
              <div v-if="monthData05.length>0" style="margin-top:40px;">
                <!--活动标题-->
                <div class="container-body-content2-box-subTitle">Staff activities in May {{this.selectYear}}</div>
                <!--活动内容-->
                <el-row :gutter="20">
                  <div v-for="item in monthData05">
                    <router-link :to="'/web-EN/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">
                      <el-col :span="6">
                        <div class="container-body-content2-box-activeBox">
                          <el-row>
                            <el-col :span="1">
                              <div class="container-body-content2-box-activeBox-round"></div>
                            </el-col>
                            <el-col :span="23">
                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">
                                {{item.summary}}
                              </div>
                            </el-col>
                          </el-row>
                          <div class="container-body-content2-box-activeBox-imgBox">
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'
                                 v-if="item.titleImage!==''"/>
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>
                          </div>
                        </div>
                      </el-col>
                    </router-link>
                  </div>
                </el-row>
              </div>
              <!--4月份活动-->
              <div v-if="monthData04.length>0" style="margin-top:40px;">
                <!--活动标题-->
                <div class="container-body-content2-box-subTitle">Staff activities in April {{this.selectYear}}</div>
                <!--活动内容-->
                <el-row :gutter="20">
                  <div v-for="item in monthData04">
                    <router-link :to="'/web-EN/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">
                      <el-col :span="6">
                        <div class="container-body-content2-box-activeBox">
                          <el-row>
                            <el-col :span="1">
                              <div class="container-body-content2-box-activeBox-round"></div>
                            </el-col>
                            <el-col :span="23">
                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">
                                {{item.summary}}
                              </div>
                            </el-col>
                          </el-row>
                          <div class="container-body-content2-box-activeBox-imgBox">
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'
                                 v-if="item.titleImage!==''"/>
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>
                          </div>
                        </div>
                      </el-col>
                    </router-link>
                  </div>
                </el-row>
              </div>
              <!--3月份活动-->
              <div v-if="monthData03.length>0" style="margin-top:40px;">
                <!--活动标题-->
                <div class="container-body-content2-box-subTitle">Staff activities in March {{this.selectYear}}</div>
                <!--活动内容-->
                <el-row :gutter="20">
                  <div v-for="item in monthData03">
                    <router-link :to="'/web-EN/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">
                      <el-col :span="6">
                        <div class="container-body-content2-box-activeBox">
                          <el-row>
                            <el-col :span="1">
                              <div class="container-body-content2-box-activeBox-round"></div>
                            </el-col>
                            <el-col :span="23">
                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">
                                {{item.summary}}
                              </div>
                            </el-col>
                          </el-row>
                          <div class="container-body-content2-box-activeBox-imgBox">
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'
                                 v-if="item.titleImage!==''"/>
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>
                          </div>
                        </div>
                      </el-col>
                    </router-link>
                  </div>
                </el-row>
              </div>
              <!--2月份活动-->
              <div v-if="monthData02.length>0" style="margin-top:40px;">
                <!--活动标题-->
                <div class="container-body-content2-box-subTitle">Staff activities in February {{this.selectYear}}</div>
                <!--活动内容-->
                <el-row :gutter="20">
                  <div v-for="item in monthData02">
                    <router-link :to="'/web-EN/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">
                      <el-col :span="6">
                        <div class="container-body-content2-box-activeBox">
                          <el-row>
                            <el-col :span="1">
                              <div class="container-body-content2-box-activeBox-round"></div>
                            </el-col>
                            <el-col :span="23">
                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">
                                {{item.summary}}
                              </div>
                            </el-col>
                          </el-row>
                          <div class="container-body-content2-box-activeBox-imgBox">
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'
                                 v-if="item.titleImage!==''"/>
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>
                          </div>
                        </div>
                      </el-col>
                    </router-link>
                  </div>
                </el-row>
              </div>
              <!--1月份活动-->
              <div v-if="monthData01.length>0" style="margin-top:40px;">
                <!--活动标题-->
                <div class="container-body-content2-box-subTitle">Staff activities in January {{this.selectYear}}</div>
                <!--活动内容-->
                <el-row :gutter="20">
                  <div v-for="item in monthData01">
                    <router-link :to="'/web-EN/activityDetail?id='+item.id+'&select='+selectYear" target="_blank">
                      <el-col :span="6">
                        <div class="container-body-content2-box-activeBox">
                          <el-row>
                            <el-col :span="1">
                              <div class="container-body-content2-box-activeBox-round"></div>
                            </el-col>
                            <el-col :span="23">
                              <div :title="item.summary" class="container-body-content2-box-activeBox-word">
                                {{item.summary}}
                              </div>
                            </el-col>
                          </el-row>
                          <div class="container-body-content2-box-activeBox-imgBox">
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 :src="'data:image/png;base64,'+item.titleImage" alt="" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)'
                                 v-if="item.titleImage!==''"/>
                            <img class="container-body-content2-box-activeBox-imgBox-img"
                                 src="../../../assets/front/images/homepage/newPic1.png" style="width: 100%"
                                 :style='{height:picHeight+"px"}' @load='justifyImgHeight($event)' alt="" v-else/>
                          </div>
                        </div>
                      </el-col>
                    </router-link>
                  </div>
                </el-row>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!--页脚模块-->
    <Footer></Footer>

  </div>
</template>

<script>
  import Header from '@/views/public/header-En/header'  //引入页头组件
  import Footer from '@/views/public/footer-En/footer'
  import {apiGetNewsList} from '@/api/news' //引入页尾组件

  export default {
    name: 'business-culture-EN',
    components: {Footer, Header},
    data() {
      return {
        listLoading: false,//加载
        picHeight: 0, //动态获取员工活动的图片
        activeIndex: '6',//当前页面是企业文化
        selectTitle: '员工活动',//默认打开企业文化页面显示公司理念的内容
        selectYear: '2020',//默认点击员工活动显示2020年的活动内容
        monthData12: [],//存储每一年中12个月份的活动数据
        monthData11: [],
        monthData10: [],
        monthData09: [],
        monthData08: [],
        monthData07: [],
        monthData06: [],
        monthData05: [],
        monthData04: [],
        monthData03: [],
        monthData02: [],
        monthData01: [],
        activityData: [],//某一年的活动数据
        activityCriteria: {
          type: 'list',
          web: 'PENAVICOSZ',
          language: '英文',
          catalog: '员工活动',
          keyword: '',
          startDt: '-01-01 00:00:00',
          endDt: '-12-31 23:59:59'
        }
      }
    },  // 监听路由变化时，页面跳转
    watch: {
      '$route'(to) {
        if (to.query.selectItem !== undefined) {
          this.selectTitle = to.query.selectItem
          to.query.selectItem = undefined
          if (this.selectTitle === '员工活动') {
            this.selectYear = '2020'
            this.handleSelectYear('2020')
          }
        } else {
          this.selectTitle = '员工活动'
          this.selectYear = '2020'
          this.handleSelectYear('2020')
        }
      }
    },
    methods: {
      //获取某年的活动数据
      handleSelectYear(item) {
        this.listLoading = true
        this.activityData = []
        this.monthData12 = {}
        this.monthData11 = {}
        this.monthData10 = {}
        this.monthData09 = {}
        this.monthData08 = {}
        this.monthData07 = {}
        this.monthData06 = {}
        this.monthData05 = {}
        this.monthData04 = {}
        this.monthData03 = {}
        this.monthData02 = {}
        this.monthData01 = {}
        this.selectYear = item
        this.activityCriteria.startDt = '-01-01 00:00:00'
        this.activityCriteria.endDt = '-12-31 23:59:59'
        this.activityCriteria.startDt = this.selectYear.toString() + this.activityCriteria.startDt
        this.activityCriteria.startDt = new Date(this.activityCriteria.startDt)
        this.activityCriteria.endDt = this.selectYear.toString() + this.activityCriteria.endDt
        this.activityCriteria.endDt = new Date(this.activityCriteria.endDt)
        apiGetNewsList(this.activityCriteria).then((res) => {
          this.activityData = res.content
          this.monthData12 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '12')
          this.monthData11 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '11')
          this.monthData10 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '10')
          this.monthData09 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '09')
          this.monthData08 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '08')
          this.monthData07 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '07')
          this.monthData06 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '06')
          this.monthData05 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '05')
          this.monthData04 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '04')
          this.monthData03 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '03')
          this.monthData02 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '02')
          this.monthData01 = this.activityData.filter(active => active.publishDt.substring(5, 7) === '01')
          for (let i = 0; i < this.activityData.length; i++) {
            this.activityData[i].summary = this.activityData[i].summary.replace('&ldquo;', '“')
            this.activityData[i].summary = this.activityData[i].summary.replace('&ldqu', '“')
            this.activityData[i].summary = this.activityData[i].summary.replace('&rdquo;', '”')
          }
          this.listLoading = false
        })
      },
      // 企业文化菜单栏选择方法
      handleSelectTitle(item) {
        this.selectTitle = item
        if (item === '员工活动') {
          this.selectYear = '2020'
          this.handleSelectYear(this.selectYear)
        }
      },
      // 设置图片的高度等于宽度
      justifyImgHeight: function (e) {
        this.picHeight = e.currentTarget.clientWidth * 0.8
      }
    },
    created() {
      this.handleSelectYear(this.selectYear)
      // 如果不是根据 #/serviceArea?selectItem=''这种链接传来的话，默认显示内容为公司理念
      if (this.$route.query.selectItem !== undefined) {
        this.selectTitle = this.$route.query.selectItem
      } else {
        this.selectTitle = '员工活动'
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
      background-size: 100% 300px;
      height: 300px;
      padding-top: 83px;
      background-image: url("../../../assets/front/images/businessCulture/businessCulture-banner-new.png");


      &-title {
        font-family: FZZCHJW--GB1-0, sans-serif;
        font-size: 60px;
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

    /*body主体样式*/
    &-body {
      &-box {
        padding: 0 30%;

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
        &-titleBox {
          box-shadow: -2px 4px 5px 0px #f2f2f2 inset;
          width: 100%;
          padding: 60px 8% 0 8%;;

          &-title {
            font-size: 26px;
            font-family: PingFangSC-Semibold, sans-serif;
            font-weight: 600;
            color: #373D42;
            margin-bottom: 30px;
          }
        }

        &-box {
          background: #F5F6F8;

          &-left {
            height: 100%;
            padding: 5% 5% 0 16%;

            &-title {
              font-size: 28px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #3B3F47;
            }

            &-line {
              margin: 3% 0 3% 0;
              width: 100px;
              height: 3px;
              background: #3281E4;
            }

            &-word {
              font-size: 16px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #3A3F47;
              line-height: 30px;
            }
          }

          &-right {
            width: 100%;
            height: 100%;

            &-img {
              display: inline-block;
              width: 100%;

            }
          }

          &-left2 {
            height: 100%;
            padding: 5% 16% 0 5%;

            &-title {
              font-size: 28px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #3B3F47;
            }

            &-line {
              margin: 3% 0 3% 0;
              width: 100px;
              height: 3px;
              background: #3281E4;
            }

            &-word {
              font-size: 16px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #3A3F47;
              line-height: 30px;
            }
          }
        }


      }

      &-content2 {
        box-shadow: -2px 4px 5px 0px #f2f2f2 inset;
        width: 100%;
        border: 1px solid transparent;

        &-box {
          margin-top: 50px;
          padding: 0 8% 100px 8%;
          background-size: 100% auto;
          background-repeat: no-repeat;
          background-image: url('../../../assets/front/images/businessCulture/businessCulture-image3.png');

          &-title {
            font-size: 26px;
            font-family: PingFangSC-Semibold, sans-serif;
            font-weight: 600;
            color: #373D42;
            margin-bottom: 20px;
          }

          &-subTitle {
            font-size: 18px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #373D42;
          }

          &-activeBox {
            background: #FFFFFF;
            box-shadow: 0 0 10px 0 rgba(28, 28, 30, 0.1);
            padding: 20px 20px 20px 20px;
            margin-top: 20px;

            &-word {
              font-size: 16px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #373D42;
              line-height: 26px;
              padding-right: 10px;
              overflow: hidden;
              padding-left: 5px;
              text-overflow: ellipsis;
              display: -webkit-box;
              -webkit-line-clamp: 3; // 控制多行的行数
              /*! autoprefixer: off */
              -webkit-box-orient: vertical;
              /* autoprefixer: on */
              word-break: break-all;
              min-height: 78px;
            }

            &-imgBox {
              margin-top: 15px;
              width: 100%;
              overflow: hidden;

              &-img {
                width: 100%;
                display: inline-block;
                transition: all 0.7s;
              }

              &-img:hover {
                transform: scale(1.3);
              }
            }

            &-round {
              width: 10px;
              height: 10px;
              background: #3281E4;
              border-radius: 50%;
              margin-top: 8px;
            }
          }

          &-activeBox:hover {
            cursor: pointer;
          }

          &-yearBox {
            padding: 0 7%;
            border-bottom: 2px solid #F2F2F2;
            height: 60px;
            margin-bottom: 50px;

            &-yearCheck {
              cursor: pointer;
              display: inline-block;
              line-height: 60px;
              font-size: 28px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 600;
              color: #3281E4;;
              position: relative;

              &-roundCheck {
                display: inline-block;
                width: 18px;
                height: 18px;
                position: absolute;
                bottom: 0;
                left: 50%;
                margin-left: -9px;
                margin-bottom: -8px;
              }
            }

            &-year {
              cursor: pointer;
              display: inline-block;
              line-height: 60px;
              font-size: 24px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #CCCCCC;
              position: relative;

              &-round {
                display: inline-block;
                width: 14px;
                height: 14px;
                position: absolute;
                bottom: 0;
                left: 50%;
                margin-left: -7px;
                margin-bottom: -6px;
              }
            }

          }
        }
      }
    }

  }

  /*当分辨率少于1400px时，公司理念模块的样式改变*/
  @media screen and (max-width: 1400px) {
    .container-body-content-box-left {
      height: 100%;
      padding: 3% 5% 0 16%;
    }
    .container-body-content-box-left2 {
      height: 100%;
      padding: 3% 5% 0 16%;
    }

    .container-body-content-box-left-title {
      font-size: 20px;
      font-family: PingFangSC-Regular, sans-serif;
      font-weight: 400;
      color: #3B3F47;
    }
    .container-body-content-box-left-line {
      margin: 3% 0 1% 0;
    }
    .container-body-content-box-left2-line {
      margin: 3% 0 1% 0;
    }
    .container-body-content-box-left-word {
      font-size: 12px;
      font-family: PingFangSC-Regular, sans-serif;
      font-weight: 400;
      color: #3A3F47;
      line-height: 22px;

    }
    .container-body-content-box-left2-title {
      font-size: 20px;
      font-family: PingFangSC-Regular, sans-serif;
      font-weight: 400;
      color: #3B3F47;
    }
    .container-body-content-box-left2-word {
      font-size: 12px;
      font-family: PingFangSC-Regular, sans-serif;
      font-weight: 400;
      color: #3A3F47;
      line-height: 22px;
    }
  }
</style>


