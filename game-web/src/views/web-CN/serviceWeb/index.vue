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
              <el-menu-item index="1"><a @click="goPage('#/index')">首页</a></el-menu-item>
              <!-- <el-submenu index="2">
                 <template slot="title">关于我们</template>
                 <el-menu-item index="2-1"><a @click="goPage('#/aboutUs')">百年招商</a></el-menu-item>
                 <el-menu-item index="2-2"><a @click="goPage('#/aboutUs')">公司概况</a></el-menu-item>
                 <el-menu-item index="2-3"><a @click="goPage('#/aboutUs')">企业文化</a></el-menu-item>
                 <el-menu-item index="2-3"><a @click="goPage('#/aboutUs')">人才招聘</a></el-menu-item>
                 <el-menu-item index="2-3"><a @click="goPage('#/aboutUs')">客户介绍</a></el-menu-item>
               </el-submenu>-->
              <el-menu-item index="2"><a @click="goPage('#/aboutUs')">关于我们</a></el-menu-item>
              <el-menu-item index="3"><a @click="goPage('#/serviceWeb')">服务网络</a></el-menu-item>
              <el-menu-item index="4"><a @click="goPage('#/business')">综合业务</a></el-menu-item>
              <el-menu-item index="5"><a @click="goPage('#/news')">信息分享</a></el-menu-item>
              <el-submenu index="7">
                <template slot="title">在线服务</template>
                <el-menu-item index="7-1"><a href="http://www.56master.com/login.jsp" target="_blank">56Master</a>
                </el-menu-item>
                <el-menu-item index="7-2"><a href="http://www.penavicosz.com.cn" target="_blank">进出口业务查询</a>
                </el-menu-item>
              </el-submenu>
              <el-menu-item index="6">
                <el-button @click="goPage('#/web-EN/index')" class="tabLang">English</el-button>
              </el-menu-item>
            </el-menu>
          </div>
        </el-col>
      </el-row>
    </div>
    <div class="container-banner">
      <img src="../../../assets/front/images/services/banner.jpg" alt="banner" class="bannerImg"/>
    </div>
    <div class="container-body">
      <el-row>
        <el-col :span="4">
          <div style="font-size: 30px;color: #D7A335;padding-left: 20px">服务网络</div>
          <div class="container-body-menu">
            <div :class="selectItem==='深圳总部'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('深圳总部')">深圳总部</a></div>
            <div :class="selectItem==='盐田公司'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('盐田公司')">盐田公司</a></div>
            <div :class="selectItem==='湛江公司'?'menu-item-check':'menu-item'">
              <a @click="handleSelectMenu('湛江公司')">湛江公司</a>
            </div>
            <div :class="selectItem==='汕头公司'?'menu-item-check':'menu-item'">
              <a @click="handleSelectMenu('汕头公司')">汕头公司</a>
            </div>
            <div :class="selectItem==='上海公司'?'menu-item-check':'menu-item'">
              <a @click="handleSelectMenu('上海公司')">上海公司</a>
            </div>
            <div :class="selectItem==='漳州公司'?'menu-item-check':'menu-item'">
              <a @click="handleSelectMenu('漳州公司')">漳州公司</a>
            </div>
            <div :class="selectItem==='广州黄埔'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('广州黄埔')">广州黄埔</a></div>
            <div :class="selectItem==='广州南沙'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('广州南沙')">广州南沙</a></div>
            <div :class="selectItem==='广西防城'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('广西防城')">广西防城</a></div>
            <div :class="selectItem==='东莞公司'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('东莞公司')">东莞公司</a></div>
            <div :class="selectItem==='阳江公司'?'menu-item-check':'menu-item'"><a
              @click="handleSelectMenu('阳江公司')">阳江公司</a></div>
          </div>
        </el-col>
        <el-col :span="20">
          <div style="border-left: 2px #F2F2F2 solid;padding-left: 30px">
            <div class="container-body-content" v-if="selectItem==='深圳总部'">
              <div class="title">深圳总部</div>
              <div class="content">
                <div style="display: flex">
                  <div style="width: 50%;">
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;经交通部批准、招商国际船舶代理有限公司（以下简称招商船代）1998年在深圳市注册成立。
                    </p>
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;得益于深圳及珠江三角洲等地区经济的持续高速发展，凭借招商局近半个世纪开展国际船舶代理的丰富经验，在众多委托方的信任支持以及富有奉献精神和创新意识员工的努力下，招商船代已经成长为一家服务覆盖全国港口的综合物流服务商。
                    </p>
                  </div>
                  <div style="width: 50%;margin: 30px">
                    <img src="../../../assets/front/images/services/shenzhen.jpg" style="width: 100%" alt=""/>
                  </div>
                </div>
              </div>

              <div class="connectTell">
                <div style="font-size: 22px;color: #3B3F47;margin:30px 0">电话咨询</div>
                <el-row>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">0755-26688750</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            24小时
                          </div>
                        </div>
                      </el-col>
                    </el-row>
                  </el-col>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">0755-26828249</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            工作日 早8:30 - 晚6:00<br>
                            休息日 早9:00 - 晚5:00
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
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        邮政编码：518066<br>
                        传真号码：0755-26828291<br>
                        联系地址：深圳市南山区南海大道1069号联合大厦603-605室
                      </div>
                    </el-col>
                    <el-col :span="12">
                      <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        电子邮箱：shipping@cmagency.com.cn<br>
                        公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>

                      </div>
                    </el-col>
                  </el-row>

                </div>
              </div>
            </div>
            <div class="container-body-content" v-if="selectItem==='盐田公司'">
              <div class="title">盐田公司</div>
              <div class="content">
                <div style="display: flex">
                  <div style="width: 50%;">
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;招商船代盐田分公司是招商船代网络化布局的第一家分公司，为招商船代的对外扩张提供了成功的可供借鉴的样本。
                    </p>
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;多年来通过为两家排名前十的班轮公司提供优质的服务积累了丰富的经验，将持续为深圳物流业的发展贡献自己的力量。
                    </p>
                  </div>
                  <div style="width: 50%;margin: 30px">
                    <div class="itemimg">
                      <img src="../../../assets/front/images/services/yantian.jpg" style="width: 100%" alt=""/>
                    </div>
                  </div>
                </div>
              </div>
              <div class="connectTell">
                <div style="font-size: 22px;color: #3B3F47;margin:30px 0">电话咨询</div>
                <el-row>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">0755-25290816</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            24小时
                          </div>
                        </div>
                      </el-col>
                    </el-row>
                  </el-col>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">0755-25291426</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            工作日 早8:30 - 晚6:00<br>
                            休息日 早9:00 - 晚5:00
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
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        邮政编码：518000<br>传真号码：0755-25290070<br>联系地址：深圳市盐田区深盐路海港大厦A幢1108－1109室
                      </div>
                    </el-col>
                    <el-col :span="12">
                      <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        电子邮箱：shippingyt@cmagency.com.cn<br>
                        公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>

                      </div>
                    </el-col>
                  </el-row>

                </div>
              </div>
            </div>
            <div class="container-body-content" v-if="selectItem==='湛江公司'">
              <div class="title">湛江公司</div>
              <div class="content">
                <div style="display: flex">
                  <div style="width: 50%;">
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;招商船代湛江分公司以招商局集团投资湛江港为契机，抢抓机遇，快速发展。
                      在招商局集团和港口的大力支持下，湛江分公司在当地不断扩大集装箱、散杂货、化工油品、船东事务、报关及货运代理市场份额。
                      公司拥有一支经验丰富、业务娴熟、爱岗敬业、专业进取的高素质团队；
                      公司顺应时代变化，了解客户所需，满足客户所想，并与相关口岸单位保持着紧密、良好的工作联系，
                      为客户提供最优质的服务，赢得了广大客户的信任与支持！
                    </p>
                  </div>
                  <div style="width: 50%;margin: 30px">
                    <div class="itemimg">
                      <img src="../../../assets/front/images/services/zhanjiang2.jpg" style="width: 100%" alt=""/>
                    </div>
                  </div>
                </div>
              </div>
              <div class="connectTell">
                <div style="font-size: 22px;color: #3B3F47;margin:30px 0">电话咨询</div>
                <el-row>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">0759-2258565</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            24小时
                          </div>
                        </div>
                      </el-col>
                    </el-row>
                  </el-col>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">0759-2258567</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            工作日 早8:30 - 晚6:00<br>
                            休息日 早9:00 - 晚5:00
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
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        邮政编码：524008<br>传真号码：0759-2258566<br> 联系地址：湛江市霞山区友谊路1号海港大厦1710室
                      </div>
                    </el-col>
                    <el-col :span="12">
                      <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        电子邮箱：zhanjiang@cmagency.com.cn<br>
                        公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>

                      </div>
                    </el-col>
                  </el-row>

                </div>
              </div>
            </div>
            <div class="container-body-content" v-if="selectItem==='汕头公司'">
              <div class="title">汕头公司</div>
              <div class="content">
                <div style="display: flex">
                  <div style="width: 50%;">
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;招商船代汕头分公司是招商船代在广东省内最近创建的分公司。
                    </p>
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;随着汕头分公司的成立，
                      招商船代班轮代理业务覆盖全广东省的网络化布局正式完成，协同效应已经显现将为各班轮公司提供最优质的服务。
                    </p>
                  </div>
                  <div style="width: 50%;margin: 30px">
                    <div class="itemimg">
                      <img src="../../../assets/front/images/services/shantou2.jpg" style="width: 100%" alt=""/>
                    </div>
                  </div>
                </div>
              </div>
              <div class="connectTell">
                <div style="font-size: 22px;color: #3B3F47;margin:30px 0">电话咨询</div>
                <el-row>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">0754-89980617</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            24小时
                          </div>
                        </div>
                      </el-col>
                    </el-row>
                  </el-col>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">0754-89980756</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            工作日 早8:30 - 晚6:00<br>
                            休息日 早9:00 - 晚5:00
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
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        邮政编码：515041<br>传真号码：0754-88850690<br>
                      </div>
                    </el-col>
                    <el-col :span="12">
                      <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        电子邮箱：shippingst@cmagency.com.cn<br>
                        公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>

                      </div>
                    </el-col>
                  </el-row>
                  <el-row>
                    <el-col :span="24">
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        联系地址：汕头市龙湖区金环南路1号潮汕星河大厦2203室
                      </div>
                    </el-col>
                  </el-row>
                </div>
              </div>
            </div>
            <div class="container-body-content" v-if="selectItem==='上海公司'">
              <div class="title">上海公司</div>
              <div class="content">
                <div style="display: flex">
                  <div style="width: 50%;">
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;招商船代上海分公司是招商船代网络化布局的第一家省外分支机构，
                      位于中国航运中心，密切关注国际、国内航运动态，为公司的发展提供及时、准确的资讯，是招商船代的窗口。
                    </p>
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;招商船代上海分公司与上港集团及口岸管理单位保持着良好的协作关系，
                      主营国际船舶代理、无船承运和订舱等相关业务。在上海的船代市场份额不断扩大，积累了丰富的船舶代理及相关业务经验，
                      在市场和客户中拥有良好的口碑。
                    </p>
                  </div>
                  <div style="width: 50%;margin: 30px">
                    <img src="../../../assets/front/images/services/shanghai.jpg" style="width: 100%" alt=""/>
                  </div>
                </div>
              </div>
              <div class="connectTell">
                <div style="font-size: 22px;color: #3B3F47;margin:30px 0">电话咨询</div>
                <el-row>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">021-65853558</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            24小时
                          </div>
                        </div>
                      </el-col>
                    </el-row>
                  </el-col>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">021-65851252</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            工作日 早8:30 - 晚6:00<br>
                            休息日 早9:00 - 晚5:00
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
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        邮政编码：200090<br>传真号码：021-65853800<br>
                      </div>
                    </el-col>
                    <el-col :span="12">
                      <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        电子邮箱：shippingsh@cmagency.com.cn<br>
                        公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>

                      </div>
                    </el-col>
                  </el-row>
                  <el-row>
                    <el-col :span="24">
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        联系地址：上海市杨浦区长阳路2555号海立大楼1号楼1103室
                      </div>
                    </el-col>
                  </el-row>
                </div>
              </div>
            </div>
            <div class="container-body-content" v-if="selectItem==='漳州公司'">
              <div class="title">漳州公司</div>
              <div class="content">
                <div style="display: flex">
                  <div style="width: 50%;">
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;招商船代漳州分公司位于招商局漳州经济开发区，与招商局漳州港同步发展。
                    </p>
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      在招商局集团和港口的大力支持下，经过多年努力招商船代漳州分公司在散杂货船舶代理、船东事务、
                      报关及货运代理市场处于领先地位。
                    </p>
                  </div>
                  <div style="width: 50%;margin: 30px">
                    <img src="../../../assets/front/images/services/zhangzhou2.jpg" style="width: 100%" alt=""/>
                  </div>
                </div>
              </div>
              <div class="connectTell">
                <div style="font-size: 22px;color: #3B3F47;margin:30px 0">电话咨询</div>
                <el-row>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">0596-6850071</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            24小时
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
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        邮政编码：363107<br>传真号码：0596-6850070<br>联系地址：福建省漳州开发区港务大楼2楼209号
                      </div>
                    </el-col>
                    <el-col :span="12">
                      <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        电子邮箱：Zhangzhou@cmagency.com.cn<br>
                        公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>
                      </div>
                    </el-col>
                  </el-row>

                </div>
              </div>
            </div>
            <div class="container-body-content" v-if="selectItem==='广州黄埔'">
              <div class="title">广州黄埔</div>
              <div class="content">
                <div style="display: flex">
                  <div style="width: 50%;">
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;广州市航商国际船舶代理有限公司（以下简称广州航商）是招商船代的子公司。业务遍布广州各个码头、船厂，
                      主要涉及集装箱、散杂货、坞修、新造船的船舶代理业务及相关的货代、物流、船舶服务等延伸业务。
                    </p>
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      在竞争日趋激烈的情况下，公司代理业务总量呈不断攀升的良好趋势，各项业务不断取得突破性进展。
                      同时，我司顺应互联网发展趋势，以“互联网+”驱动传统船代业务的转型升级，不断聚焦客户价值，为广大客户提供跨区域、
                      网络化、全方位的船代服务。
                    </p>
                  </div>
                  <div style="width: 50%;margin: 30px">
                    <img src="../../../assets/front/images/services/guangzhou.jpg" style="width: 100%" alt=""/>
                  </div>
                </div>
              </div>
              <div class="connectTell">
                <div style="font-size: 22px;color: #3B3F47;margin:30px 0">电话咨询</div>
                <el-row>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">020-82215682  </div>
                          <div style="line-height: 28px;opacity: 0.7">
                            24小时
                          </div>
                        </div>
                      </el-col>
                    </el-row>
                  </el-col>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">020-82211425</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            工作日 早8:30 - 晚6:00<br>
                            休息日 早9:00 - 晚5:00
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
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        邮政编码：510730<br>传真号码：020-82215810<br>
                      </div>
                    </el-col>
                    <el-col :span="12">
                      <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        电子邮箱：shippinghp@cmagency.com.cn<br>
                        公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>

                      </div>
                    </el-col>
                  </el-row>
                  <el-row>
                    <el-col :span="24">
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        联系地址：广州市经济技术开发区黄埔宝石路17-29号祺航大厦402室
                      </div>
                    </el-col>
                  </el-row>
                </div>
              </div>
            </div>
            <div class="container-body-content" v-if="selectItem==='广州南沙'">
              <div class="title">广州南沙</div>
              <div class="content">
                <div style="display: flex">
                  <div style="width: 50%;">
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;广州市航商国际船舶代理有限公司（以下简称广州航商）是招商船代的子公司。
                      业务遍布广州各个码头、船厂，主要涉及集装箱、散杂货、坞修、新造船的船舶代理业务及相关的货代、物流、
                      船舶服务等延伸业务。
                    </p>
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;在竞争日趋激烈的情况下，公司代理业务总量呈不断攀升的良好趋势，各项业务不断取得突破性进展。
                      同时，我司顺应互联网发展趋势，以“互联网+”驱动传统船代业务的转型升级，不断聚焦客户价值，为广大客户提供跨区域、
                      网络化、全方位的船代服务。
                    </p>
                  </div>
                  <div style="width: 50%;margin: 30px">
                    <img src="../../../assets/front/images/services/guangzhounansha.jpg" style="width: 100%" alt=""/>
                  </div>
                </div>
              </div>
              <div class="connectTell">
                <div style="font-size: 22px;color: #3B3F47;margin:30px 0">电话咨询</div>
                <el-row>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">020-34660086</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            24小时
                          </div>
                        </div>
                      </el-col>
                    </el-row>
                  </el-col>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">020-34660997</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            工作日 早8:30 - 晚6:00<br>
                            休息日 早9:00 - 晚5:00
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
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        邮政编码：511462<br>传真号码：020-34660021<br>
                      </div>
                    </el-col>
                    <el-col :span="12">
                      <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        电子邮箱：shippingns@cmagency.com.cn<br>
                        公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>

                      </div>
                    </el-col>
                  </el-row>
                  <el-row>
                    <el-col :span="24">
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        联系地址：广州市南沙区龙穴大道中13号口岸大厦1307-1308室
                      </div>
                    </el-col>
                  </el-row>
                </div>
              </div>
            </div>
            <div class="container-body-content" v-if="selectItem==='广西防城'">
              <div class="title">广西防城</div>
              <div class="content">
                <div style="display: flex">
                  <div style="width: 50%;">
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;招商船代防城港分公司是防城港当地率先经营国际船舶代理业务的公司，防城港的大发展给招商船代防城港公司提供了广阔的发展空间，
                      防城港分公司在大型散货船和液化石油产品船方面成熟、 先进的操作经验在防城港受到了广泛的重视、 发挥了积极的作用，
                      是当地能力最强的船舶代理之一。
                    </p>
                  </div>
                  <div style="width: 50%;margin: 30px">
                    <img src="../../../assets/front/images/services/fangchenggang.jpg" style="width: 100%" alt=""/>
                  </div>
                </div>
              </div>
              <div class="connectTell">
                <div style="font-size: 22px;color: #3B3F47;margin:30px 0">电话咨询</div>
                <el-row>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">0770-2811918</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            24小时
                          </div>
                        </div>
                      </el-col>
                    </el-row>
                  </el-col>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">0770-2811958</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            工作日 早8:30 - 晚6:00<br>
                            休息日 早9:00 - 晚5:00
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
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        邮政编码：538001<br>传真号码：0770-2812919<br>
                      </div>
                    </el-col>
                    <el-col :span="12">
                      <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        电子邮箱：fangcheng@cmagency.com.cn<br>
                        公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>

                      </div>
                    </el-col>
                  </el-row>

                  <el-row>
                    <el-col :span="24">
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        联系地址：广西防城港市港口区东湾大道9号口岸联检大楼1605-1606室
                      </div>
                    </el-col>
                  </el-row>
                </div>
              </div>
            </div>
            <div class="container-body-content" v-if="selectItem==='东莞公司'">
              <div class="title">东莞公司</div>
              <div class="content">
                <div style="display: flex">
                  <div style="width: 50%;">
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;广州航商东莞分公司于在东莞港区起步时即注册成立，伴随着东莞港区近年的迅速发展，
                      公司秉承“诚信为先，服务为本，创新为法，合作共赢”的经营理念，已成为本地区最具实力的综合性国际船舶代理公司之一。
                    </p>
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;在集装箱班轮，粮油，化肥，砂石，木材，
                      液化油品及钢材设备等大宗散杂货方面拥有丰富的经验。
                    </p>
                  </div>
                  <div style="width: 50%;margin: 30px">
                    <img src="../../../assets/front/images/services/dongguan.jpg" style="width: 100%" alt=""/>
                  </div>
                </div>
              </div>
              <div class="connectTell">
                <div style="font-size: 22px;color: #3B3F47;margin:30px 0">电话咨询</div>
                <el-row>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">0769-82396711</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            24小时
                          </div>
                        </div>
                      </el-col>
                    </el-row>
                  </el-col>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">0769-82396733</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            工作日 早8:30 - 晚6:00<br>
                            休息日 早9:00 - 晚5:00
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
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        邮政编码：523145<br>传真号码：0769-88681568<br>联系地址：东莞市麻涌镇角尾村深赤湾码头办公楼502室
                      </div>
                    </el-col>
                    <el-col :span="12">
                      <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        电子邮箱：dongguan@cmagency.com.cn<br>
                        公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>

                      </div>
                    </el-col>
                  </el-row>

                </div>
              </div>
            </div>
            <div class="container-body-content" v-if="selectItem==='阳江公司'">
              <div class="title">阳江公司</div>
              <div class="content">
                <div style="display: flex">
                  <div style="width: 50%;">
                    <p>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;广州航商阳江分公司是阳江港区首家从事国际船舶代理业务的企业，
                      经过多年发展，阳江公司已经成为阳江港地区船舶代理的主要船舶代理企业。<br/>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;公司有着丰富的国际船舶代理及相关业务运作经验，熟悉港区的作业环境和条件，
                      主要代理铁矿石、大豆、镍矿、煤炭、高碳铬铁等船舶，为船东提供专业、高效、优质的一站式代理服务。
                    </p>
                  </div>
                  <div style="width: 50%;margin: 30px">
                    <img src="../../../assets/front/images/services/yangjiang.jpg" style="width: 100%" alt=""/>
                  </div>
                </div>
              </div>
              <div class="connectTell">
                <div style="font-size: 22px;color: #3B3F47;margin:30px 0">电话咨询</div>
                <el-row>
                  <el-col :span="12">
                    <el-row>
                      <el-col :span="6">
                        <img src="../../../assets/front/icon/connectTel.png" style="width: 120px" alt=""/>
                      </el-col>
                      <el-col :span="18">
                        <div style="padding: 30px;">
                          <div style="font-size: 22px;">0662-2263180</div>
                          <div style="line-height: 28px;opacity: 0.7">
                            24小时
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
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        邮政编码：529500<br>传真号码：0662-2264088<br>
                      </div>
                    </el-col>
                    <el-col :span="12">
                      <div style="font-size: 18px;padding: 30px 0">网址邮箱</div>
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        电子邮箱：yangjiang@cmagency.com.cn<br>
                        公司网址：<a href="http://www.cmagency.com.cn" style="color:#D7A335 ">www.cmagency.com.cn</a><br>

                      </div>
                    </el-col>
                  </el-row>
                  <el-row>
                    <el-col :span="24">
                      <div style="font-size: 14px;color: #929292;letter-spacing: 1px;line-height: 28px;">
                        联系地址：阳江市江城区石湾北路祥兴街13号
                      </div>
                    </el-col>
                  </el-row>

                </div>
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
          <div style="color: #fff;margin-top: 10px;opacity: 0.5">版权所有©2016 招商国际船舶代理有限公司</div>
        </el-col>
        <el-col :span="3" :offset=1>
          <div class="container-footer-item">
            <div class="container-footer-item-header"><a @click="goPage('#/aboutUs')">关于我们</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/aboutUs?selectItem=百年招商')">百年招商</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/aboutUs?selectItem=公司概况')">公司概况</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/aboutUs?selectItem=企业文化')">企业文化</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/aboutUs?selectItem=百年招商')">查看更多</a></div>
          </div>
        </el-col>
        <el-col :span="3">
          <div class="container-footer-item">
            <div class="container-footer-item-header"><a @click="goPage('#/serviceWeb')">服务网络</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/serviceWeb?selectItem=深圳总部')">深圳总部</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/serviceWeb?selectItem=广州公司')">广州公司</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/serviceWeb?selectItem=上海公司')">上海公司</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/serviceWeb?selectItem=深圳总部')">查看更多</a></div>
          </div>
        </el-col>
        <el-col :span="3">
          <div class="container-footer-item">
            <div class="container-footer-item-header"><a @click="goPage('#/business')">综合业务</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/business?selectItem=集装箱')">集装箱</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/business?selectItem=散杂货')">散杂货</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/business?selectItem=重大件')">重大件</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/business?selectItem=集装箱')">查看更多</a></div>
          </div>
        </el-col>
        <el-col :span="3">
          <div class="container-footer-item">
            <div class="container-footer-item-header"><a @click="goPage('#/news')">信息分享</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/news?selectItem=企业动态')">企业动态</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/news?selectItem=行业资讯')">行业资讯</a></div>
            <div class="container-footer-item-info"><a @click="goPage('#/news?selectItem=政策法规')">政策法规</a></div>
          </div>
        </el-col>
        <el-col :span="3">
          <div class="container-footer-item">
            <div class="container-footer-item-header"><span>友情链接</span></div>
            <div class="container-footer-item-info">
              <a href="https://www.cmhk.com" target="_blank">招商局集团</a>
            </div>
            <div class="container-footer-item-info"><a href="http://www.cmport.com.hk/" target="_blank">招商港口</a></div>
            <div class="container-footer-item-info"><a href="http://www.penavicosz.com.cn" target="_blank">深圳外代</a></div>
          </div>
        </el-col>
        <el-col :span="2">
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
        selectItem: '深圳总部'
      }
    },
    created() {
      this.selectItem = this.$route.query.selectItem
      if (this.selectItem === undefined) {
        this.selectItem = '盐田公司'
      }
    },
    mounted() {
      this.selectItem = this.$route.query.selectItem
      if (this.selectItem === undefined) {
        this.selectItem = '盐田公司'
      }
    },
    methods: {
      handleSelect(key) {
        if (key === '1') {
          this.goPage('#/index')
        }
        if (key === '2') {
          this.goPage('#/aboutUs')
        }
        if (key === '3') {
          this.goPage('#/serviceWeb')
        }
        if (key === '4') {
          this.goPage('#/business')
        }
        if (key === '5') {
          this.goPage('#/news')
        }
        if (key === '6') {
          this.goPage('#/web-EN/index')
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

    a:hover {
      color: #538ED9;
    }

    &-nav {
      padding: 10px 10%;

      .el-menu-item:hover {
        color: #538ED9;
      }
    }

    &-banner {

      .bannerImg {
        height: 300px;
        width: 100%;
      }
    }

    &-body {
      padding: 50px 10%;

      &-menu {
        a:hover {
          color: #538ED9;
        }

        .menu-item {
          padding: 5px 20px;
          font-size: 16px;
          color: #3B3F47;
          margin-top: 20px;
        }

        .menu-item-check {
          font-size: 16px;
          color: #538ED9;
          margin-top: 20px;
          padding: 5px 20px;
          background: #FBF5EA;
          line-height: 38px;
          border-right: 2px #538ED9 solid;
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
          line-height: 32px;
          font-size: 18px;
          color: #8F8F8F;
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
          font-family: PingFangSC-Regular;
          color: #fff;
          opacity: 0.8;
          letter-spacing: 0;
          margin-bottom: 20px;
        }

        &-info {
          font-family: PingFangSC-Regular;
          color: #fff;
          font-size: 13px;
          margin-top: 10px;
          opacity: 0.6;
        }
      }
    }
  }
</style>
