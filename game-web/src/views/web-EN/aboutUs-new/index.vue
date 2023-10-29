<template>
  <div class="container">
    <!--导航栏模块-->
    <Header :active-index="activeIndex"></Header>

    <!--横幅banner模块-->
    <div class="container-banner">
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-title animate__animated animate__bounceInDown">ABOUT US</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-content animate__animated animate__bounceInDown">关于我们</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
    </div>

    <!--关于我们主体内容-->
    <div class="container-body">
      <!--关于我们——选择栏-->
      <el-row class="container-body-box">
        <el-col style="width: 15%"
                :class="selectTitle==='Message from the Chairman'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='Message from the Chairman'?'aClass1':'aClass2'"
               @click="handleSelectTitle('Message from the Chairman')">Board
          </div>
        </el-col>
        <el-col style="width: 14%"
                :class="selectTitle==='Company Profile'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='Company Profile'?'aClass1':'aClass2'"
               @click="handleSelectTitle('Company Profile')">Company Profile
          </div>
        </el-col>
        <el-col style="width: 14%;"
                :class="selectTitle==='Organization'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='Organization'?'aClass1':'aClass2'" @click="handleSelectTitle('Organization')">
            Organization
          </div>
        </el-col>
        <el-col style="width: 14%"
                :class="selectTitle==='Industry Organization'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='Industry Organization'?'aClass1':'aClass2'"
               @click="handleSelectTitle('Industry Organization')">Industry Organization
          </div>
        </el-col>
        <el-col style="width: 14%;"
                :class="selectTitle==='Honor'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='Honor'?'aClass1':'aClass2'" @click="handleSelectTitle('Honor')">Honor</div>
        </el-col>
        <el-col style="width: 14%"
                :class="selectTitle==='Company Qualification'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='Company Qualification'?'aClass1':'aClass2'"
               @click="handleSelectTitle('Company Qualification')">Company Qualification
          </div>
        </el-col>
        <el-col style="width: 15%;"
                :class="selectTitle==='Customer Introduction'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='Customer Introduction'?'aClass1':'aClass2'"
               @click="handleSelectTitle('Customer Introduction')">Partners
          </div>
        </el-col>
      </el-row>

      <!--关于我们——Message from the Chairman-->
      <div v-if="selectTitle==='Message from the Chairman'">
        <div class="container-body-content">
          <div class="container-body-content-box">
            <el-row>
              <!--              <el-col class="container-body-content-box-col1">-->
              <!--                <img class="container-body-content-box-col1-img"-->
              <!--                     src="../../../assets/front/images/aboutUS-new/董事长.jpg" alt=""/>-->
              <!--              </el-col>-->

              <el-col class="container-body-content-box-col2">
                <div class="container-body-content-box-col2-title"></div>
              </el-col>

              <el-col class="container-body-content-box-col3">
                <!--                <div class="container-body-content-box-col3-position">Chairman</div>-->
                <div class="container-body-content-box-col3-content">
                  <p>
                    Since its establishment in 1992, China Ocean Shipping Agency Shenzhen Co., Ltd. (abbreviated as
                    Penavico Shenzhen) has taken advantage of China's reform and opening up and the vigorous development
                    of port and shipping industry, thanks to the support of our customers and friends from all walks of
                    life, starting from Shekou, continuing to grow and grow , The service network now covers more than
                    30 ports and cities across the country, with partners all over the world. The business areas include
                    shipping agency, freight forwarding, bonded warehousing, import and export declaration, inspection
                    declaration, international trade, maritime chartering brokerage, supply chain management, The
                    diversified business sectors of cruise service, project logistics, e-commerce logistics, logistics
                    application software development and information services have evolved from a traditional public
                    shipping agency enterprise to a modern integrated maritime logistics service provider with a high
                    reputation in the industry .
                  </p>
                  <p>
                    In recent years, Penavico Shenzhen has actively participated in the construction of the"Belt and
                    Road", fully responding to and actively integrating into the development strategy of the
                    Guangdong-Hong Kong-Macao Greater Bay Area and the pioneering demonstration zone of socialism with
                    Chinese characteristics. In the face of new historical opportunities and challenges, Penavico
                    Shenzhen are determined to forge ahead, pioneer and innovate and give full play to the special zone
                    spirit of "dare to try, dare to be the first, and work hard" and "time is money, efficiency is
                    life". The Shekou spirit of "wandering the country by empty talk and rejuvenating the country by
                    hard work", with an international vision and confidence, adhering to the "accurate, timely,
                    civilized and thoughtful" Service concept, with the support of a strong service network and
                    diversified business platform, we are committed to providing more professional, more convenient and
                    more professional services to ship owners and operators, manufacturing companies, trade circulation
                    companies, e-commerce companies, and end consumers. Safe and more personalized online and offline
                    high-quality services, continuously reduce customers' logistics costs, grow together with customers,
                    and aspire to become customers' preferred shipping agents, logistics providers and strategic
                    partners, and jointly promote world interconnectivity .
                  </p>
                  <p>
                    Here, on behalf of all my colleagues in Penavico Shenzhen, We would like to extend our sincere
                    thanks to the customers who have been walking with us through hardships and hardships, and to
                    friends from all walks of life who have given us care and support! In this great new era, let us not
                    forget our original intention, keep our mission in mind, and continue to work together to create
                    brilliant!
                  </p>
                  <div class="container-body-content-box-col3-content-textBox">
                    <p class="container-body-content-box-col3-content-textBox-text1">Chairman: Song Rong</p>
                    <p class="container-body-content-box-col3-content-textBox-text"> Managing Director: Zhang Dong</p>
                  </div>
                </div>
              </el-col>

            </el-row>
          </div>
        </div>
      </div>

      <!--关于我们——Company Profile-->
      <div v-if="selectTitle==='Company Profile'">
        <div class="container-body-content">
          <div class="container-body-content-title animate__animated animate__fadeInLeftBig">Development Path</div>
          <div class="container-body-content-body">
            <div>
              <img class="container-body-content-body-img"
                   src="../../../assets/front/images/aboutUS-new/英文版-发展历程@2x4.png" alt=""/>
            </div>
            <div class="container-body-content-body-word animate__animated animate__fadeInLeftBig">
              <p class="container-body-content-body-word-word1">CHINA OCEAN SHIPPING AGENCY SHENZHEN (PENAVICO SHENZHEN)
                was established in
                1992 which can be traced back as PENAVICO SHEKOU established in 1983. It is invested by six
                shareholders: China Ocean Shipping Agency Co.,Ltd, Sinotrans Logistics Co.,Ltd ,China Merchants Port
                Group Co.,Ltd, Shenzhen Yantian Port Group Co.,Ltd,Shenzhen Nanyou(Holding) Co.,Ltd and Shenzhen Marine
                Group Co.,Ltd. The registered capital is 60 million RMB . It is the earliest leading enterprise engaged
                in international shipping agency business in Shenzhen. PENAVICO SHENZHEN is well recognized for her
                business reputation in the shipping industry.</p>
              <p class="container-body-content-body-word-word2">
                After more than 30 years operation and development, PENAVICO SHENZHEN has grown up from a traditional
                shipping agency company to an integrated marine logistics service provider , Scope of business includes
                shipping agency, freight forwarding, import and export declarations, bonded warehousing, supply chain
                management, project logistics, cruise services, logistics application software development and
                information services. The service network covers more than 30 cities and ports nationwide and nearly 200
                overseas agents worldwide. The company adheres to concepts of professional and humanized service,
                dedicate to providing customers with "accurate, politely, timely, thoughtful" service,The company has
                won the "Shenzhen City Transportation System Advanced Collective"、 "Shenzhen Logistics and Freight
                Integrity Enterprises "、”China's Freight Industry Awards Best Shipping Company South China Comprehensive
                Excellence Award"、 "Maersk China's Best Shipping Agency Service Provider"、 "Shenzhen Key Logistics
                Enterprises"、 "Nanshan District Green Channel Enterprise" 、"2016 WCA Asia's Best Partner"and etc.
                PENAVICO SHENZHEN established the ISO quality management system which was certified by the British
                Standards Institution (BSI) since 1996. The management level has always been maintaining a leading
                position in the industry. The company also has a very strict HSE management system and AEO certified by
                CUSTOMS.
              </p>
              <p class="container-body-content-body-word-word3">
                PPENAVICO SHENZHEN has been continuously expanding her business scope by engaging in the Belt and Road
                Initiative, actively exploring the international market and striving to improve service levels. Refined
                and standardized procedures has been implemented in order to reduce costs, increase efficiency and
                consolidate the management. The company is committed to providing customers with the most convenient,
                safest and most economical logistics solutions. We are willing to grow and develop together with
                customers.
              </p>
            </div>
          </div>
        </div>

      </div>

      <!--关于我们——Organization-->
      <div v-if="selectTitle==='Organization'">
        <div class="container-body-content2">
          <div class="container-body-content2-box animate__animated animate__fadeInDown">
            <img class="container-body-content2-box-img"
                 src="../../../assets/front/images/aboutUS-new/aboutUs-new-image3.png" alt=""/>
          </div>
        </div>
      </div>

      <!--关于我们——Industry Organization-->
      <div v-if="selectTitle==='Industry Organization'">
        <div class="container-body-content">
          <div
            :class="titleFlag3===true?'container-body-content-title animate__animated animate__shakeX':'container-body-content-title'"
            @click="titleFlag3=true" @mouseout="titleFlag3=false">Industry Organization
          </div>
          <!--          <div class="container-body-content-word">-->
          <!--            China Ocean Shipping Agency Shenzhen Co., Ltd. (hereinafter referred to as "Shenzhen Ocean Shipping Agency") was founded in 1982. It is the leader of international shipping agency in South China. Its professional standards and market reputation are recognized by the industry.-->
          <!--          </div>-->
          <div class="container-body-content-subTitleBox">
            <div
              :class="selectSubTitle==='China Ocean Shipping Agency Co., Ltd. Shenzhen'?'container-body-content-subTitleBox-subTitleCheck':'container-body-content-subTitleBox-subTitle'"
              @click="handleSelectSubTitle('China Ocean Shipping Agency Co., Ltd. Shenzhen')">
              <span :class="selectSubTitle==='China Ocean Shipping Agency Co., Ltd. Shenzhen'?'aClass1':'aClass2'">China Ocean Shipping Agency Co., Ltd. Shenzhen</span>
            </div>
            <div
              :class="selectSubTitle==='Shenzhen Foreign Agency Warehousing Co., Ltd.'?'container-body-content-subTitleBox-subTitleCheck2':'container-body-content-subTitleBox-subTitle2'"
              @click="handleSelectSubTitle('Shenzhen Foreign Agency Warehousing Co., Ltd.')">
              <span :class="selectSubTitle==='Shenzhen Foreign Agency Warehousing Co., Ltd.'?'aClass1':'aClass2'">Shenzhen Foreign Agency Warehousing Co., Ltd.</span>
            </div>
          </div>
          <div class="container-body-content-subTitleBox">
            <div
              :class="selectSubTitle==='Shenzhen Foreign Agency International Freight Co., Ltd.'?'container-body-content-subTitleBox-subTitleCheck':'container-body-content-subTitleBox-subTitle'"
              @click="handleSelectSubTitle('Shenzhen Foreign Agency International Freight Co., Ltd.')">
              <span
                :class="selectSubTitle==='Shenzhen Foreign Agency International Freight Co., Ltd.'?'aClass1':'aClass2'">Shenzhen Foreign Agency International Freight Co., Ltd.</span>
            </div>
            <div
              :class="selectSubTitle==='Shenzhen Foreign Agency Customs Declaration Co., Ltd.'?'container-body-content-subTitleBox-subTitleLastCheck':'container-body-content-subTitleBox-subTitleLast'"
              @click="handleSelectSubTitle('Shenzhen Foreign Agency Customs Declaration Co., Ltd.')">
              <span
                :class="selectSubTitle==='Shenzhen Foreign Agency Customs Declaration Co., Ltd.'?'aClass1':'aClass2'">Shenzhen Foreign Agency Customs Declaration Co., Ltd.
</span>
            </div>
          </div>
          <!--Industry Organization——China Ocean Shipping Agency Co., Ltd. Shenzhen-->
          <div class="container-body-content-box1"
               v-if="selectSubTitle==='China Ocean Shipping Agency Co., Ltd. Shenzhen'">
            <el-row :gutter="80">

              <!--03—深圳市船舶代理学会会长单位-->
              <el-col :span="6">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox">
                    <div>
                      <img class="container-body-content-box1-body-titleBox-img"
                           src="../../../assets/front/images/aboutUS-new/aboutUs-new-01.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">
                      President Unit of Shenzhen Shipping Agency Association
                    </div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      Temporary customs clearance procedures for offshore engineering ships and offshore equipment.-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/web-EN/index')" class="container-body-content-box1-body-wordBox-link">Learn more enter the website</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>

              <!--01—中国船舶代理及无船承运人协会会员-->
              <el-col :span="6">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox">
                    <div>
                      <img class="container-body-content-box1-body-titleBox-img"
                           src="../../../assets/front/images/aboutUS-new/aboutUs-new-02.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">
                      Member of China Shipping Agency and NVOCC Association
                    </div>


                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      It is engaged in customs declaration, inspection declaration, inspection and dissemination of goods.<br/>-->
                  <!--                      Mainly handle customs declaration for import and export goods and inbound and outbound transportation for customers.-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/web-En/index')" class="container-body-content-box1-body-wordBox-link">Learn more enter the website</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>

              <!--              &lt;!&ndash;02—深圳市报检企业协会副会长单位&ndash;&gt;-->
              <!--              <el-col :span="6">-->
              <!--                <div class="container-body-content-box1-body">-->
              <!--                  <div class="container-body-content-box1-body-titleBox">-->
              <!--                    <div>-->
              <!--                      <img class="container-body-content-box1-body-titleBox-img"-->
              <!--                           src="../../../assets/front/images/aboutUS-new/aboutUs-new-02.png" alt=""/>-->
              <!--                    </div>-->
              <!--                    <div class="container-body-content-box1-body-titleBox-title">-->
              <!--                      Vice President Unit of Shenzhen Inspection Report Enterprise Association-->
              <!--                    </div>-->
              <!--                  </div>-->
              <!--                  &lt;!&ndash;                  <div class="container-body-content-box1-body-wordBox">&ndash;&gt;-->
              <!--                  &lt;!&ndash;                    <div class="container-body-content-box1-body-wordBox-word2">&ndash;&gt;-->
              <!--                  &lt;!&ndash;                      Provide ship repair, ship supplies, spare parts supply, energy supply and other related ship service businesses.&ndash;&gt;-->
              <!--                  &lt;!&ndash;                    </div>&ndash;&gt;-->
              <!--                  &lt;!&ndash;                    <div @click="goPage('#/web-EN/index')" class="container-body-content-box1-body-wordBox-link">Learn more enter the website</div>&ndash;&gt;-->
              <!--                  &lt;!&ndash;                  </div>&ndash;&gt;-->
              <!--                </div>-->
              <!--              </el-col>-->


              <!--04—深圳海运协会会员-->
              <el-col :span="6">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox">
                    <div>
                      <img class="container-body-content-box1-body-titleBox-img"
                           src="../../../assets/front/images/aboutUS-new/aboutUs-new-03.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">
                      Member of Shenzhen Maritime Association
                    </div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      Acting for import and export declaration of goods:<br/>-->
                  <!--                      container/steel/iron ore/coal/grain/equipment/oil-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/web-EN/index')" class="container-body-content-box1-body-wordBox-link">Learn more enter the website</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>
            </el-row>


          </div>

          <!--Industry Organization—Shenzhen Foreign Agency Warehousing Co., Ltd.-->
          <div class="container-body-content-box1"
               v-if="selectSubTitle==='Shenzhen Foreign Agency Warehousing Co., Ltd.'">
            <el-row :gutter="80">
              <!--01—深圳市进出口商会会员-->
              <el-col :span="6">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox">
                    <div>
                      <img class="container-body-content-box1-body-titleBox-img"
                           src="../../../assets/front/images/aboutUS-new/aboutUs-new-01.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">
                      Member of China Shipping Agency and NVOCC Association
                    </div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      It is engaged in customs declaration, inspection declaration, inspection and dissemination of goods. Mainly handle customs declaration for import and export goods and inbound and outbound transportation for customers.-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/web-EN/index')" class="container-body-content-box1-body-wordBox-link">Learn more enter the website</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>

              <!--02—深圳盐田区物流商会会员-->
              <el-col :span="6">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox">
                    <div>
                      <img class="container-body-content-box1-body-titleBox-img"
                           src="../../../assets/front/images/aboutUS-new/aboutUs-new-02.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">
                      Vice President Unit of Shenzhen Inspection Report Enterprise Association
                    </div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word2">-->
                  <!--                      Provide ship repair, ship supplies, spare parts supply, energy supply and other related ship service businesses.-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/web-EN/index')" class="container-body-content-box1-body-wordBox-link">Learn more enter the website</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>

              <!--03—中国仓储协会会员-->
              <el-col :span="6">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox">
                    <div>
                      <img class="container-body-content-box1-body-titleBox-img"
                           src="../../../assets/front/images/aboutUS-new/aboutUs-new-03.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">
                      President Unit of Shenzhen Shipping Agency Association
                    </div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      Temporary customs clearance procedures for offshore engineering ships and offshore equipment.-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/web-EN/index')" class="container-body-content-box1-body-wordBox-link">Learn more enter the website</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>
            </el-row>


          </div>

          <!--Industry Organization—Shenzhen Foreign Agency International Freight Co., Ltd.-->
          <div class="container-body-content-box1"
               v-if="selectSubTitle==='Shenzhen Foreign Agency International Freight Co., Ltd.'">
            <el-row :gutter="80">
              <!--01—深圳市国际货运代理协会副会长单位-->
              <el-col :span="6">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox">
                    <div>
                      <img class="container-body-content-box1-body-titleBox-img"
                           src="../../../assets/front/images/aboutUS-new/aboutUs-new-01.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">
                      Member of China Shipping Agency and NVOCC Association
                    </div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      It is engaged in customs declaration, inspection declaration, inspection and dissemination of goods. Mainly handle customs declaration for import and export goods and inbound and outbound transportation for customers.-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage2('http://www.penavicocargo.com/china/index.jsp')"-->
                  <!--                         class="container-body-content-box1-body-wordBox-link">Learn more enter the website-->
                  <!--                    </div>-->
                  <!--                  </div>-->
                </div>
              </el-col>
            </el-row>
          </div>

          <!--Industry Organization—Shenzhen Foreign Agency Customs Declaration Co., Ltd.-->
          <div class="container-body-content-box1"
               v-if="selectSubTitle==='Shenzhen Foreign Agency Customs Declaration Co., Ltd.'">
            <el-row :gutter="80">
              <!--01—深圳市进出口商会会员-->
              <el-col :span="6">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox">
                    <div>
                      <img class="container-body-content-box1-body-titleBox-img"
                           src="../../../assets/front/images/aboutUS-new/aboutUs-new-01.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">
                      Member of China Shipping Agency and NVOCC Association
                    </div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word">-->
                  <!--                      It is engaged in customs declaration, inspection declaration, inspection and dissemination of goods. Mainly handle customs declaration for import and export goods and inbound and outbound transportation for customers.-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/web-EN/index')" class="container-body-content-box1-body-wordBox-link">Learn more enter the website</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>
              <!--02—广东深圳报关协会会员-->
              <el-col :span="6">
                <div class="container-body-content-box1-body">
                  <div class="container-body-content-box1-body-titleBox">
                    <div>
                      <img class="container-body-content-box1-body-titleBox-img"
                           src="../../../assets/front/images/aboutUS-new/aboutUs-new-02.png" alt=""/>
                    </div>
                    <div class="container-body-content-box1-body-titleBox-title">
                      Member of Guangdong Shenzhen Customs Brokers Association
                    </div>
                  </div>
                  <!--                  <div class="container-body-content-box1-body-wordBox">-->
                  <!--                    <div class="container-body-content-box1-body-wordBox-word2">-->
                  <!--                      Purchase and sale of marine materials and auto parts, property leasing and related information consultation and domestic trade.-->
                  <!--                    </div>-->
                  <!--                    <div @click="goPage('#/web-EN/index')" class="container-body-content-box1-body-wordBox-link">Learn more enter the website</div>-->
                  <!--                  </div>-->
                </div>
              </el-col>
            </el-row>
          </div>
        </div>
      </div>

      <div v-if="selectTitle==='Honor'">
        <div class="container-body-content">
          <div
            :class="honorFlag===true?'container-body-content-title animate__animated animate__shakeX':'container-body-content-title'"
            @click="honorFlag=true" @mouseout="honorFlag=false">Honor
          </div>
          <el-row>
            <el-col :span="24">
              <img class="container-body-content-certification"
                   src="../../../assets/front/images/aboutUS-new/公司荣誉图.png" alt=""/>
            </el-col>
          </el-row>
        </div>
      </div>

      <!--关于我们—Honor-->
      <!--      <div v-if="selectTitle==='Honor'">-->
      <!--        <div class="container-body-content3">-->
      <!--          <div class="container-body-content3-title">Honor</div>-->
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
      <!--                    In 2019, China Merchants Group ranked first among central SOEs in total profit, net profit and total-->
      <!--                    assets.-->
      <!--                  </div>-->
      <!--                  <div class="container-body-content3-left-box-word">-->
      <!--                    In the Fortune Global 500 list released in 2019.-->
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
      <!--                    In 2019, China Merchants Group ranked first among central SOEs in total profit, net profit and total-->
      <!--                    assets.-->
      <!--                  </div>-->
      <!--                  <div class="container-body-content3-left-box-word">-->
      <!--                    In the Fortune Global 500 list released in 2019.-->
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
      <!--                    In 2019, China Merchants Group ranked first among central SOEs in total profit, net profit and total-->
      <!--                    assets.-->
      <!--                  </div>-->
      <!--                  <div class="container-body-content3-right-box-word">-->
      <!--                    In the Fortune Global 500 list released in 2019.-->
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
      <!--                    In 2019, China Merchants Group ranked first among central SOEs in total profit, net profit and total-->
      <!--                    assets.-->
      <!--                  </div>-->
      <!--                  <div class="container-body-content3-right-box-word">-->
      <!--                    In the Fortune Global 500 list released in 2019.-->
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

      <!--关于我们—Company Qualification-->
      <div v-if="selectTitle==='Company Qualification'">
        <div class="container-body-content">
          <div
            :class="titleFlag1===true?'container-body-content-title animate__animated animate__shakeX':'container-body-content-title'"
            @click="titleFlag1=true" @mouseout="titleFlag1=false">Qualification Certificate
          </div>
          <el-row>
            <el-col :span="24">
              <img class="container-body-content-certification"
                   src="../../../assets/front/images/aboutUS-new/certification.png" alt=""/>
            </el-col>
          </el-row>
        </div>
      </div>

      <!--关于我们—Customer Introduction-->
      <div v-if="selectTitle==='Customer Introduction'">
        <div class="container-body-content4">
          <div
            :class="titleFlag2===true?'container-body-content4-title animate__animated animate__shakeX':'container-body-content4-title'"
            @click="titleFlag2=true" @mouseout="titleFlag2=false">Partners
          </div>
          <!--          <div class="container-body-content4-word">We have been cooperating with us for many years and trusting customer partners. We also use professional attitude and service to complete the entrustment of customers.</div>-->
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
  import Header from '@/views/public/header-En/header'  //引入页头组件
  import Footer from '@/views/public/footer-En/footer'  //引入页尾组件
  export default {
    name: 'about-us-EN',
    components: {Footer, Header},
    data() {
      return {
        titleFlag3: false,//点击行业组织标题出现特效
        titleFlag2: false,//点击合作伙伴标题出现特效
        titleFlag1: false,//点击资质证书标题出现特效
        honorFlag: false,//点击荣誉标题出现特效
        activeIndex: '2',//当前页面为关于我们
        selectTitle: 'Message from the Chairman', //默认打开关于我们页面显示Message from the Chairman模块
        selectSubTitle: 'China Ocean Shipping Agency Co., Ltd. Shenzhen'//默认打开Industry Organization显示China Ocean Shipping Agency Co., Ltd. Shenzhen模块
      }
    },
    created() {
      // 如果不是根据 #/serviceArea?selectItem=''这种链接传来的话，默认显示内容为Message from the Chairman
      if (this.$route.query.selectItem !== undefined) {
        this.selectTitle = this.$route.query.selectItem
      } else {
        this.selectTitle = 'Message from the Chairman'
      }
    },
    // 监听路由变化时，页面跳转
    watch: {
      '$route'(to) {
        if (to.query.selectItem !== undefined) {
          this.selectTitle = to.query.selectItem
          to.query.selectItem = undefined
        } else {
          this.selectTitle = 'Message from the Chairman'
        }
      }
    },
    methods: {
      // 关于我们菜单选择栏
      handleSelectTitle(item) {
        this.selectTitle = item
        if (this.selectTitle === 'Industry Organization') {
          this.selectSubTitle = 'China Ocean Shipping Agency Co., Ltd. Shenzhen'
        }
      },
      // Industry Organization选择栏
      handleSelectSubTitle(item) {
        this.selectSubTitle = item
      },
      // 以本窗口打开到新页面
      goPage(url) {
        window.open(url, '_self')
      },
      //以新窗口打开Industry Organization中的了解详情
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
        letter-spacing: 40px;
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
        padding: 50px 8% 150px 8%;

        &-box {
          padding: 3% 5% 100px 5%;
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
              font-size: 15px;
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
          height: 60px;
          border-bottom: 1px solid #E8E9EA;

          &-subTitleCheck {
            width: 456px;
            height: 60px;
            display: inline-block;
            font-size: 17px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #3281E4;
            margin-right: 17%;
            line-height: 60px;
            border-bottom: 3px solid #3281E4;
          }

          &-subTitleCheck2 {
            width: 456px;
            height: 60px;
            display: inline-block;
            font-size: 17px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #3281E4;
            margin-right: 17%;
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
            width: 456px;
            height: 60px;
            display: inline-block;
            font-size: 17px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #3B3F47;
            margin-right: 17%;
            line-height: 60px;
          }

          &-subTitle2 {
            width: 456px;
            height: 60px;
            display: inline-block;
            font-size: 17px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #3B3F47;
            margin-right: 17%;
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
              font-size: 13px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #333;
              line-height: 20px;
              margin-top: 10px;
            }

            &-word2 {
              margin-top: 28px;
              width: 100%;
              font-size: 13px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #333;
              line-height: 20px;
            }

            &-word3 {
              margin-top: 28px;
              width: 80%;
              font-size: 13px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #333;
              line-height: 20px;
            }
          }

          &-img {
            width: 100%;
          }
        }

        &-box1 {
          width: 100%;
          margin-top: 50px;

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
                font-size: 22px;
                font-family: PingFangSC-Semibold, sans-serif;
                font-weight: 600;
                color: #3B3F47;
                position: absolute;
                top: 65px;
                margin-top: -25px;
                left: 0;
                letter-spacing: 3px;
              }
            }

            &-wordBox {
              margin-top: 40px;
              width: 80%;

              &-word {
                margin-top: 63px;
                font-size: 15px;
                font-family: PingFangSC-Regular, sans-serif;
                font-weight: 400;
                color: #3B3F47;
              }

              &-word2 {
                margin-top: 63px;
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

        &-title:hover {
          cursor: pointer;
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
            cursor: pointer;
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
            cursor: pointer;
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

  @media screen and (max-width: 1700px) {
    .container-body-box-title-check {
      font-size: 16px;
    }
    .container-body-box-title {
      font-size: 16px;
    }
    .container-body-content-subTitleBox-subTitle2 {
      margin-right: 0;
    }
    .container-body-content-subTitleBox-subTitleCheck2 {
      margin-right: 0;
    }
  }

  /*@media screen and (max-width: 1639px) {*/
  /*  .container-body-content-body-word-word2 {*/
  /*    width: 71%;*/
  /*  }*/
  /*  .container-body-content-body-word-word3 {*/
  /*    width: 52%;*/
  /*  }*/
  /*}*/

  /*@media screen and (max-width: 1614px) {*/
  /*  .container-body-content-body-img {*/
  /*    height: 800px;*/
  /*  }*/
  /*}*/

  @media screen and (max-width: 1512px) {
    .container-body-box-title-check {
      font-size: 14px;
    }
    .container-body-box-title {
      font-size: 14px;
    }
  }

  @media screen and (max-width: 1400px) {
    .container-body-box-title-check {
      height: 60px;
      background: #3281E4;
      font-size: 13px;
      font-family: PingFangSC-Semibold, sans-serif;
      font-weight: 600;
      color: #FFFFFF;
      line-height: 60px;
      text-align: center;
    }
    .container-body-box-title {
      height: 60px;
      background: #FFFFFF;
      font-size: 13px;
      font-family: PingFangSC-Regular, sans-serif;
      font-weight: 400;
      color: #3B3F47;
      text-align: center;
      line-height: 60px;
    }
    .container-body-content-body-word {
      font-size: 13px;
    }
    .container-body-content-subTitleBox-subTitle {
      width: 456px;
      height: 60px;
      display: inline-block;
      font-size: 17px;
      font-family: PingFangSC-Regular, sans-serif;
      font-weight: 400;
      color: #3B3F47;
      margin-right: 6%;
      line-height: 60px;
    }
    .container-body-content-subTitleBox-subTitleCheck {
      width: 456px;
      height: 60px;
      display: inline-block;
      font-size: 17px;
      font-family: PingFangSC-Regular, sans-serif;
      font-weight: 400;
      color: #3281E4;
      margin-right: 6%;
      line-height: 60px;
      border-bottom: 3px solid #3281E4;
    }
    .container-body-content-box1-body-wordBox-word {
      margin-top: 90px;
    }
    .container-body-content-box1-body-wordBox-word2 {
      margin-top: 110px;
    }
    .container-body-content-box1-body-wordBox-word3 {
      margin-top: 130px;
    }
    .container-body-content-box {
      padding-bottom: 34px;
    }
    .container-body-content-box-col2-title {
      font-size: 22px;
      width: 125px;
    }
    .container-body-content-box-col2 {
      width: 125px;
    }
    .container-body-content-box-col3 {
      width: 87%;
      padding-right: 3%;
    }
  }
</style>
