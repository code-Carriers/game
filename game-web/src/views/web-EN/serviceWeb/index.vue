<template>
  <div class="container">
    <div class="container-nav">
      <el-row>
        <el-col :span="10">
          <img src="../../../assets/front/images/logo.png" alt="logo" style="width: 340px;margin-top: 15px"/>
        </el-col>
        <el-col :span="14">
          <div style="float: right">
            <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect">
              <el-menu-item index="1"><a @click="goPage('#/web-EN/index')">Home</a></el-menu-item>
              <!-- <el-submenu index="2">
                 <template slot="title">AboutUS</template>
                 <el-menu-item index="2-1"><a @click="goPage('#/web-EN/aboutUs')">百年招商</a></el-menu-item>
                 <el-menu-item index="2-2"><a @click="goPage('#/web-EN/aboutUs')">公司概况</a></el-menu-item>
                 <el-menu-item index="2-3"><a @click="goPage('#/web-EN/aboutUs')">企业文化</a></el-menu-item>
                 <el-menu-item index="2-3"><a @click="goPage('#/web-EN/aboutUs')">人才招聘</a></el-menu-item>
                 <el-menu-item index="2-3"><a @click="goPage('#/web-EN/aboutUs')">客户介绍</a></el-menu-item>
               </el-submenu>-->
              <el-menu-item index="2"><a @click="goPage('#/web-EN/aboutUs')">AboutUS</a></el-menu-item>
              <el-menu-item index="3"><a @click="goPage('#/web-EN/serviceWeb')">Service</a></el-menu-item>
              <el-menu-item index="4"><a @click="goPage('#/web-EN/business')">Business</a></el-menu-item>
              <el-menu-item index="5"><a @click="goPage('#/web-EN/news')">InfoShare</a></el-menu-item>
              <el-menu-item index="6"><el-button @click="goPage('#/index')" class="tabLang">中文</el-button></el-menu-item>
            </el-menu>
          </div>
        </el-col>
      </el-row>
    </div>
    <div class="container-banner">
      <!--<el-carousel height="500px">
        <el-carousel-item v-for="(item,index) in imgs" :key="item">
          <img src="../../../assets/front/images/banner01.jpg" alt="banner" v-if="index === 0" class="bannerImg"/>
          <img src="../../../assets/front/images/banner02.jpg" alt="banner" v-if="index === 1" class="bannerImg"/>
          <img src="../../../assets/front/images/banner04.jpg" alt="banner" v-if="index === 2" class="bannerImg"/>
        </el-carousel-item>
      </el-carousel>
-->
      <img src="../../../assets/front/images/banner-subpage.jpg" alt="banner" class="bannerImg"/>
    </div>
    <div class="container-body">
      <el-row>
        <el-col :span="4">
          <div style="font-size: 30px;color: #D7A335;">服务网络</div>
          <div class="container-body-menu">
            <div :class="selectItem==='深圳总部'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('深圳总部')">深圳总部</a></div>
            <div :class="selectItem==='盐田公司'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('盐田公司')">盐田公司</a></div>
            <div :class="selectItem==='广州公司'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('广州公司')">广州公司</a></div>
            <div :class="selectItem==='东莞公司'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('东莞公司')">东莞公司</a></div>
            <div :class="selectItem==='阳江公司'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('阳江公司')">阳江公司</a></div>
          </div>
        </el-col>
        <el-col :span="20">
          <div class="container-body-content" v-if="selectItem==='深圳总部'">
            <div class="title">深圳总部</div>
            <div class="content">
              <p>
                招商局集团创立于1872年12月26日，1873
                年1月17日在上海正式开业，是中国民族工商
                业的先驱，被誉为“中国民族企业百年历程缩
                影”。招商局现为国家驻港大型企业集团、香
                港四大中资企业之一，总部设于香港。

                2019年，招商局集团利润总额、净利润和
                总资产在央企中均排名第一。2019年发布的《
                财富》世界500强榜单中，招商局和旗下招商
                银行再次入围，招商局成为拥有两个世界500
                强公司的企业。招商局集团为8家连续15年荣
                获国务院国资委经营业绩考核A级的央企之一
                和连续五个任期“业绩优秀企业”。
              </p>
            </div>
            <div class="itemimg">
              <img src="../../../assets/front/images/services/company.jpg" style="width: 800px"/>
            </div>
            <div class="connectTell">
              <div style="font-size: 22px;color: #3B3F47;">电话咨询</div>
              <el-row>
                <el-col :span="12">
                  <el-row>
                    <el-col :span="6">
                      <img src="../../../assets/front/icon/connectTel.png" style="width: 120px"/>
                    </el-col>
                    <el-col :span="18">
                      <div style="padding: 30px;">
                        <div style="font-size: 22px;">86-755-25290816</div>
                        <div style="line-height: 28px;opacity: 0.7">
                          工作日24小时<br>
                          休息日早9:00-晚6:00
                        </div>
                      </div>
                    </el-col>
                  </el-row>
                </el-col>
                <el-col :span="12">
                  <el-row>
                    <el-col :span="6">
                      <img src="../../../assets/front/icon/connectTel.png" style="width: 120px"/>
                    </el-col>
                    <el-col :span="18">
                      <div style="padding: 30px;">
                        <div style="font-size: 22px;">86-755-25292268</div>
                        <div style="line-height: 28px;opacity: 0.7">
                          工作日24小时<br>
                          休息日早9:00-晚6:00
                        </div>
                      </div>
                    </el-col>
                  </el-row>
                </el-col>
              </el-row>
            </div>
            <div class="connectMore">
              <div style="font-size: 22px;color: #3B3F47;">更多联系方式</div>
              <div class="connectMore-detail">
                <el-row>
                  <el-col :span="12">
                    <div style="font-size: 18px;padding: 30px 0">传真服务</div>
                    <div style="font-size: 14px;color: #929292;letter-spacing: 0.5px;line-height: 28px;">
                      邮政编码：518054<br>传真号码：86-755-25290070<br>电传号码：(51)94078059 CMSAG
                    </div>
                  </el-col>
                  <el-col :span="12">
                    <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                    <div style="font-size: 14px;color: #929292;letter-spacing: 0.5px;line-height: 28px;">
                      电子邮箱：yantian@cmagency.com.cn<br>
                      公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>
                      联系地址：中国深圳市盐田区海港大厦十一楼
                    </div>
                  </el-col>
                </el-row>

              </div>
            </div>
          </div>
          <div class="container-body-content" v-if="selectItem==='盐田公司'">
            <div class="title">盐田公司</div>
            <div class="content">
              <p>
                招商局集团创立于1872年12月26日，1873
                年1月17日在上海正式开业，是中国民族工商
                业的先驱，被誉为“中国民族企业百年历程缩
                影”。招商局现为国家驻港大型企业集团、香
                港四大中资企业之一，总部设于香港。

                2019年，招商局集团利润总额、净利润和
                总资产在央企中均排名第一。2019年发布的《
                财富》世界500强榜单中，招商局和旗下招商
                银行再次入围，招商局成为拥有两个世界500
                强公司的企业。招商局集团为8家连续15年荣
                获国务院国资委经营业绩考核A级的央企之一
                和连续五个任期“业绩优秀企业”。
              </p>
            </div>
            <div class="itemimg">
              <img src="../../../assets/front/images/services/company.jpg" style="width: 800px"/>
            </div>
            <div class="connectTell">
              <div style="font-size: 22px;color: #3B3F47;">电话咨询</div>
              <el-row>
                <el-col :span="12">
                  <el-row>
                    <el-col :span="6">
                      <img src="../../../assets/front/icon/connectTel.png" style="width: 120px"/>
                    </el-col>
                    <el-col :span="18">
                      <div style="padding: 30px;">
                        <div style="font-size: 22px;">86-755-25290816</div>
                        <div style="line-height: 28px;opacity: 0.7">
                          工作日24小时<br>
                          休息日早9:00-晚6:00
                        </div>
                      </div>
                    </el-col>
                  </el-row>
                </el-col>
                <el-col :span="12">
                  <el-row>
                    <el-col :span="6">
                      <img src="../../../assets/front/icon/connectTel.png" style="width: 120px"/>
                    </el-col>
                    <el-col :span="18">
                      <div style="padding: 30px;">
                        <div style="font-size: 22px;">86-755-25292268</div>
                        <div style="line-height: 28px;opacity: 0.7">
                          工作日24小时<br>
                          休息日早9:00-晚6:00
                        </div>
                      </div>
                    </el-col>
                  </el-row>
                </el-col>
              </el-row>
            </div>
            <div class="connectMore">
              <div style="font-size: 22px;color: #3B3F47;">更多联系方式</div>
              <div class="connectMore-detail">
                <el-row>
                  <el-col :span="12">
                    <div style="font-size: 18px;padding: 30px 0">传真服务</div>
                    <div style="font-size: 14px;color: #929292;letter-spacing: 0.5px;line-height: 28px;">
                      邮政编码：518054<br>传真号码：86-755-25290070<br>电传号码：(51)94078059 CMSAG
                    </div>
                  </el-col>
                  <el-col :span="12">
                    <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                    <div style="font-size: 14px;color: #929292;letter-spacing: 0.5px;line-height: 28px;">
                      电子邮箱：yantian@cmagency.com.cn<br>
                      公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>
                      联系地址：中国深圳市盐田区海港大厦十一楼
                    </div>
                  </el-col>
                </el-row>

              </div>
            </div>
          </div>
          <div class="container-body-content" v-if="selectItem==='广州公司'">
            <div class="title">广州公司</div>
            <div class="content">
              <p>
                招商局集团创立于1872年12月26日，1873
                年1月17日在上海正式开业，是中国民族工商
                业的先驱，被誉为“中国民族企业百年历程缩
                影”。招商局现为国家驻港大型企业集团、香
                港四大中资企业之一，总部设于香港。

                2019年，招商局集团利润总额、净利润和
                总资产在央企中均排名第一。2019年发布的《
                财富》世界500强榜单中，招商局和旗下招商
                银行再次入围，招商局成为拥有两个世界500
                强公司的企业。招商局集团为8家连续15年荣
                获国务院国资委经营业绩考核A级的央企之一
                和连续五个任期“业绩优秀企业”。
              </p>
            </div>
            <div class="itemimg">
              <img src="../../../assets/front/images/services/company.jpg" style="width: 800px"/>
            </div>
            <div class="connectTell">
              <div style="font-size: 22px;color: #3B3F47;">电话咨询</div>
              <el-row>
                <el-col :span="12">
                  <el-row>
                    <el-col :span="6">
                      <img src="../../../assets/front/icon/connectTel.png" style="width: 120px"/>
                    </el-col>
                    <el-col :span="18">
                      <div style="padding: 30px;">
                        <div style="font-size: 22px;">86-755-25290816</div>
                        <div style="line-height: 28px;opacity: 0.7">
                          工作日24小时<br>
                          休息日早9:00-晚6:00
                        </div>
                      </div>
                    </el-col>
                  </el-row>
                </el-col>
                <el-col :span="12">
                  <el-row>
                    <el-col :span="6">
                      <img src="../../../assets/front/icon/connectTel.png" style="width: 120px"/>
                    </el-col>
                    <el-col :span="18">
                      <div style="padding: 30px;">
                        <div style="font-size: 22px;">86-755-25292268</div>
                        <div style="line-height: 28px;opacity: 0.7">
                          工作日24小时<br>
                          休息日早9:00-晚6:00
                        </div>
                      </div>
                    </el-col>
                  </el-row>
                </el-col>
              </el-row>
            </div>
            <div class="connectMore">
              <div style="font-size: 22px;color: #3B3F47;">更多联系方式</div>
              <div class="connectMore-detail">
                <el-row>
                  <el-col :span="12">
                    <div style="font-size: 18px;padding: 30px 0">传真服务</div>
                    <div style="font-size: 14px;color: #929292;letter-spacing: 0.5px;line-height: 28px;">
                      邮政编码：518054<br>传真号码：86-755-25290070<br>电传号码：(51)94078059 CMSAG
                    </div>
                  </el-col>
                  <el-col :span="12">
                    <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                    <div style="font-size: 14px;color: #929292;letter-spacing: 0.5px;line-height: 28px;">
                      电子邮箱：yantian@cmagency.com.cn<br>
                      公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>
                      联系地址：中国深圳市盐田区海港大厦十一楼
                    </div>
                  </el-col>
                </el-row>

              </div>
            </div>
          </div>
          <div class="container-body-content" v-if="selectItem==='东莞公司'">
            <div class="title">东莞公司</div>
            <div class="content">
              <p>
                招商局集团创立于1872年12月26日，1873
                年1月17日在上海正式开业，是中国民族工商
                业的先驱，被誉为“中国民族企业百年历程缩
                影”。招商局现为国家驻港大型企业集团、香
                港四大中资企业之一，总部设于香港。

                2019年，招商局集团利润总额、净利润和
                总资产在央企中均排名第一。2019年发布的《
                财富》世界500强榜单中，招商局和旗下招商
                银行再次入围，招商局成为拥有两个世界500
                强公司的企业。招商局集团为8家连续15年荣
                获国务院国资委经营业绩考核A级的央企之一
                和连续五个任期“业绩优秀企业”。
              </p>
            </div>
            <div class="itemimg">
              <img src="../../../assets/front/images/services/company.jpg" style="width: 800px"/>
            </div>
            <div class="connectTell">
              <div style="font-size: 22px;color: #3B3F47;">电话咨询</div>
              <el-row>
                <el-col :span="12">
                  <el-row>
                    <el-col :span="6">
                      <img src="../../../assets/front/icon/connectTel.png" style="width: 120px"/>
                    </el-col>
                    <el-col :span="18">
                      <div style="padding: 30px;">
                        <div style="font-size: 22px;">86-755-25290816</div>
                        <div style="line-height: 28px;opacity: 0.7">
                          工作日24小时<br>
                          休息日早9:00-晚6:00
                        </div>
                      </div>
                    </el-col>
                  </el-row>
                </el-col>
                <el-col :span="12">
                  <el-row>
                    <el-col :span="6">
                      <img src="../../../assets/front/icon/connectTel.png" style="width: 120px"/>
                    </el-col>
                    <el-col :span="18">
                      <div style="padding: 30px;">
                        <div style="font-size: 22px;">86-755-25292268</div>
                        <div style="line-height: 28px;opacity: 0.7">
                          工作日24小时<br>
                          休息日早9:00-晚6:00
                        </div>
                      </div>
                    </el-col>
                  </el-row>
                </el-col>
              </el-row>
            </div>
            <div class="connectMore">
              <div style="font-size: 22px;color: #3B3F47;">更多联系方式</div>
              <div class="connectMore-detail">
                <el-row>
                  <el-col :span="12">
                    <div style="font-size: 18px;padding: 30px 0">传真服务</div>
                    <div style="font-size: 14px;color: #929292;letter-spacing: 0.5px;line-height: 28px;">
                      邮政编码：518054<br>传真号码：86-755-25290070<br>电传号码：(51)94078059 CMSAG
                    </div>
                  </el-col>
                  <el-col :span="12">
                    <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                    <div style="font-size: 14px;color: #929292;letter-spacing: 0.5px;line-height: 28px;">
                      电子邮箱：yantian@cmagency.com.cn<br>
                      公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>
                      联系地址：中国深圳市盐田区海港大厦十一楼
                    </div>
                  </el-col>
                </el-row>

              </div>
            </div>
          </div>
          <div class="container-body-content" v-if="selectItem==='阳江公司'">
            <div class="title">阳江公司</div>
            <div class="content">
              <p>
                招商局集团创立于1872年12月26日，1873
                年1月17日在上海正式开业，是中国民族工商
                业的先驱，被誉为“中国民族企业百年历程缩
                影”。招商局现为国家驻港大型企业集团、香
                港四大中资企业之一，总部设于香港。

                2019年，招商局集团利润总额、净利润和
                总资产在央企中均排名第一。2019年发布的《
                财富》世界500强榜单中，招商局和旗下招商
                银行再次入围，招商局成为拥有两个世界500
                强公司的企业。招商局集团为8家连续15年荣
                获国务院国资委经营业绩考核A级的央企之一
                和连续五个任期“业绩优秀企业”。
              </p>
            </div>
            <div class="itemimg">
              <img src="../../../assets/front/images/services/company.jpg" style="width: 800px"/>
            </div>
            <div class="connectTell">
              <div style="font-size: 22px;color: #3B3F47;">电话咨询</div>
              <el-row>
                <el-col :span="12">
                  <el-row>
                    <el-col :span="6">
                      <img src="../../../assets/front/icon/connectTel.png" style="width: 120px"/>
                    </el-col>
                    <el-col :span="18">
                      <div style="padding: 30px;">
                        <div style="font-size: 22px;">86-755-25290816</div>
                        <div style="line-height: 28px;opacity: 0.7">
                          工作日24小时<br>
                          休息日早9:00-晚6:00
                        </div>
                      </div>
                    </el-col>
                  </el-row>
                </el-col>
                <el-col :span="12">
                  <el-row>
                    <el-col :span="6">
                      <img src="../../../assets/front/icon/connectTel.png" style="width: 120px"/>
                    </el-col>
                    <el-col :span="18">
                      <div style="padding: 30px;">
                        <div style="font-size: 22px;">86-755-25292268</div>
                        <div style="line-height: 28px;opacity: 0.7">
                          工作日24小时<br>
                          休息日早9:00-晚6:00
                        </div>
                      </div>
                    </el-col>
                  </el-row>
                </el-col>
              </el-row>
            </div>
            <div class="connectMore">
              <div style="font-size: 22px;color: #3B3F47;">更多联系方式</div>
              <div class="connectMore-detail">
                <el-row>
                  <el-col :span="12">
                    <div style="font-size: 18px;padding: 30px 0">传真服务</div>
                    <div style="font-size: 14px;color: #929292;letter-spacing: 0.5px;line-height: 28px;">
                      邮政编码：518054<br>传真号码：86-755-25290070<br>电传号码：(51)94078059 CMSAG
                    </div>
                  </el-col>
                  <el-col :span="12">
                    <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                    <div style="font-size: 14px;color: #929292;letter-spacing: 0.5px;line-height: 28px;">
                      电子邮箱：yantian@cmagency.com.cn<br>
                      公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>
                      联系地址：中国深圳市盐田区海港大厦十一楼
                    </div>
                  </el-col>
                </el-row>

              </div>
            </div>
          </div>
        </el-col>
      </el-row>
    </div>
    <div class="container-footer">
      <el-row>
        <el-col :span="6">
          <img src="../../../assets/front/images/bottom-logo.png" style="width: 280px;" alt=""/>
          <div style="color: #fff;margin-top: 5px;opacity: 0.5">版权所有©2016 招商国际船舶代理有限公司</div>
        </el-col>
        <el-col :span="3" :offset=1>
          <div class="container-footer-item">
            <div class="container-footer-item-header">AboutUS</div>
            <div class="container-footer-item-info">Hundred Years of investment</div>
            <div class="container-footer-item-info">Company profile</div>
            <div class="container-footer-item-info">Corporate Culture</div>
            <div class="container-footer-item-info">Talent recruitment</div>
            <div class="container-footer-item-info">Customer introduction</div>
          </div>
        </el-col>
        <el-col :span="3">
          <div class="container-footer-item">
            <div class="container-footer-item-header">services</div>
            <div class="container-footer-item-info">Liner Agency</div>
            <div class="container-footer-item-info">Bulk goods</div>
            <div class="container-footer-item-info">Major parts business</div>
            <div class="container-footer-item-info">other</div>
          </div>
        </el-col>
        <el-col :span="3">
          <div class="container-footer-item">
            <div class="container-footer-item-header">business</div>
            <div class="container-footer-item-info">Containers</div>
            <div class="container-footer-item-info">Bulk goods</div>
            <div class="container-footer-item-info">Ship repair</div>
            <div class="container-footer-item-info">Crew replacement</div>
            <div class="container-footer-item-info">Customs Declaration</div>
          </div>
        </el-col>
        <el-col :span="3">
          <div class="container-footer-item">
            <div class="container-footer-item-header">InfoShare</div>
            <div class="container-footer-item-info">Policies and regulations</div>
            <div class="container-footer-item-info">Business Dynamics</div>
            <div class="container-footer-item-info">Industry Information</div>
          </div>
        </el-col>
        <el-col :span="5">
          <div class="container-footer-item" style="float: right">
             <div style="width: 130px;height: 130px;background-color: #fff;">
              <img src="../../../assets/front/images/QRCode.jpg" style="width:130px;" alt=""/></div>
            <div style="color:#fff;font-size: 12px;text-align: center;margin-top: 10px">招商船代官微二维码</div>
          </div>
        </el-col>
      </el-row>
    </div>
    <el-backtop>
      <img src="src/assets/front/icon/goTop.png" alt=""/>
    </el-backtop>
  </div>
</template>

<script>
  export default {
    name: 'aboutUs',
    data() {
      return {
        activeIndex: '3',
        imgs: ['banner01.jpg', 'banner02.jpg', 'banner04.jpg'],
        selectItem: '盐田公司'
      }
    },
    created() {
    },
    mounted() {
    },
    methods: {
      handleSelect(key) {
        if (key === '1') {
          this.goPage('#/web-EN/index')
        }
        if (key === '2') {
          this.goPage('#/web-EN/aboutUs')
        }
        if (key === '3') {
          this.goPage('#/web-EN/serviceWeb')
        }
        if (key === '4') {
          this.goPage('#/web-EN/business')
        }
        if (key === '5') {
          this.goPage('#/web-EN/news')
        }
        if (key === '6') {
          this.goPage('#/index')
        }
      },
      handleSelectMenu(item) {
        this.selectItem = item
      },
      goPage(url) {
        window.open(url, '_self') // 路由跳转
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .container {

    min-width: 1300px;

      &-nav {
      padding: 10px 10%;

      .el-menu-item:hover{
        color: #cfa54d;
      }
    }

    &-banner {

      .bannerImg {
        height: 340px;
        width: 100%;
      }
    }

    &-body {
      padding: 50px 10%;

      &-menu {
        a:hover {
          color: #D7A335;
        }

        .menu-item {
          padding: 5px 20px;
          font-size: 16px;
          color: #3B3F47;
          margin-top: 20px;
        }

        .menu-item-check {
          font-size: 16px;
          color: #D7A335;
          margin-top: 20px;
          padding: 5px 20px;
          background: #FBF5EA;
          line-height: 38px;
          border-right: 2px #D7A335 solid;
        }
      }

      &-content {
        padding: 0 30px;

        .title {
          font-size: 26px;
          color: #3B3F47;
          padding: 10px;
        }

        .content {
          font-size: 16px;
          color: #8F8F8F;
          line-height: 22px;
          padding: 10px;
        }

        .itemimg {
          width: 100%;
        }

        .connectTell {
          margin: 50px 0;
        }

        .connectMore {
          margin: 50px 0;

          .connectMore-detail {
            padding: 30px;
          }
        }
      }
    }

    &-footer {
      height: 360px;
      background-color: #1F1F1F;
      padding: 80px 10%;

      &-item {
        margin-left: 10px;

        &-header {
          font-size: 16px;
          color: #fff;
          opacity: 0.6;
        }

        &-info {
          color: #fff;
          font-size: 13px;
          margin-top: 10px;
          opacity: 0.6;
        }
      }
    }
  }
</style>
