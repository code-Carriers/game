<template>
  <div class="container">
    <!--导航栏模块-->
    <Header :active-index="activeIndex" @jump="handleJump"></Header>

    <!--banner图模块-->
    <div class="container-banner" :style="{'height':+bannerHeight+'px'}">

      <!--轮播图效果-->
      <el-carousel :interval="10000" :height="bannerHeight+'px'" class="container-banner-carousel" @change="fx">

        <el-carousel-item :style="{'height':+bannerHeight+'px'}">
          <img src="../../assets/front/images/homepage/banner7-min.jpg"
               :class="imgFlag===true?'container-banner-carousel-img1':'container-banner-carousel-img'">
          <!--banner图中的标题-->
          <el-row>
            <el-col :span="24">
              <div class="swiper-slide-textBox1">
                <span>An integrated marine logistics service provider</span>
              </div>
              <!--              <div class="swiper-slide-textBox2">-->
              <!--                <span>An integrated marine logistics service provider</span>-->
              <!--              </div>-->
            </el-col>
          </el-row>
          <div>
            <img src="../../assets/front/icon/banner-icon.png" class="container-banner-carousel-icon" alt=""/>
            <span class="container-banner-carousel-text">slide down</span>
          </div>
        </el-carousel-item>

        <el-carousel-item>
          <img src="../../assets/front/images/homepage/banner-1.jpg" class='container-banner-carousel-img'
               style="opacity: unset">
          <!--banner图中的标题-->
          <el-row>
            <!--            <el-col :span="24">-->
            <!--              <div class="swiper-slide-textBox1">-->
            <!--                <span>An integrated marine logistics service provider</span>-->
            <!--              </div>-->
            <!--&lt;!&ndash;              <div class="swiper-slide-textBox2">&ndash;&gt;-->
            <!--&lt;!&ndash;                <span>An integrated marine logistics service provider</span>&ndash;&gt;-->
            <!--&lt;!&ndash;              </div>&ndash;&gt;-->
            <!--            </el-col>-->
          </el-row>
          <div>
            <img src="../../assets/front/icon/banner-icon.png" class="container-banner-carousel-icon" alt=""/>
            <span class="container-banner-carousel-text">slide down</span>
          </div>
        </el-carousel-item>
        <el-carousel-item>
          <img src="../../assets/front/images/homepage/banner-9.jpg" class='container-banner-carousel-img'
               style="opacity: unset">
          <!--banner图中的标题-->
          <el-row>
            <!--            <el-col :span="24">-->
            <!--              <div class="swiper-slide-textBox1">-->
            <!--                <span>An integrated marine logistics service provider</span>-->
            <!--              </div>-->
            <!--&lt;!&ndash;              <div class="swiper-slide-textBox2">&ndash;&gt;-->
            <!--&lt;!&ndash;                <span>An integrated marine logistics service provider</span>&ndash;&gt;-->
            <!--&lt;!&ndash;              </div>&ndash;&gt;-->
            <!--            </el-col>-->
          </el-row>
          <div>
            <img src="../../assets/front/icon/banner-icon.png" class="container-banner-carousel-icon" alt=""/>
            <span class="container-banner-carousel-text">slide down</span>
          </div>
        </el-carousel-item>
        <el-carousel-item>
          <img src="../../assets/front/images/homepage/banner4.png" class='container-banner-carousel-img'>
          <!--banner图中的标题-->
          <el-row>
            <!--            <el-col :span="24">-->
            <!--              <div class="swiper-slide-textBox1">-->
            <!--                <span>An integrated marine logistics service provider</span>-->
            <!--              </div>-->
            <!--&lt;!&ndash;              <div class="swiper-slide-textBox2">&ndash;&gt;-->
            <!--&lt;!&ndash;                <span>An integrated marine logistics service provider</span>&ndash;&gt;-->
            <!--&lt;!&ndash;              </div>&ndash;&gt;-->
            <!--            </el-col>-->
          </el-row>
          <div>
            <img src="../../assets/front/icon/banner-icon.png" class="container-banner-carousel-icon" alt=""/>
            <span class="container-banner-carousel-text">slide down</span>
          </div>
        </el-carousel-item>

      </el-carousel>

    </div>

    <!--我们的新闻模块-->
    <div class="container-OurNews">
      <!--我们的新闻的标题-->
      <div class="container-OurNews-title" @click="goPage('#/web-EN/newsTendency')" title="Click here view details">
        News
      </div>
      <!--我们的新闻的居中线-->
      <div class="container-OurNews-line"></div>
      <!--我们的新闻的内容-->
      <div class="container-OurNews-body">
        <el-row :gutter="50">
          <div v-for="item in ourNewsList">
            <el-col :span="8">
              <!--以打开新窗口的形式跳转到新闻详情页面-->
              <router-link
                :to="'/web-EN/newsDetail?id='+item.id+'&page='+newsCriteria.page+'&size='+newsCriteria.size+'&catalog='+newsCriteria.catalog+'&totalElements='+data.totalElements+'&totalPages='+data.totalPages+'&type='+newsCriteria.type"
                target="_blank">
                <div class="container-OurNews-body-item">
                  <!--首页新闻的后台图片数据-->
                  <!--如果后台没传来图片的话默认以本地图片代替-->
                  <div class="container-OurNews-body-item-imgBox">
                    <img class="container-OurNews-body-item-imgBox-img"
                         src="../../assets/front/images/homepage/newPic1.png"
                         v-if="item.titleImage===''" alt=""/>
                    <img class="container-OurNews-body-item-imgBox-img" :src="item.titleImage" alt="" v-else/>
                  </div>
                  <!--首页新闻的标题数据-->
                  <div :title="item.title" class="container-OurNews-body-item-head">{{item.title}}</div>
                </div>
                <div class="container-OurNews-body-item">
                  <!--首页新闻标题下的线段-->
                  <div class="container-OurNews-body-item-line"></div>
                  <!--首页新闻的部分内容-->
                  <div :title="item.summary" class="container-OurNews-body-item-comment">{{item.summary}}</div>
                  <!--灰色分割线-->
                  <div class="container-OurNews-body-item-line2"></div>
                  <!--首页新闻的时间和阅读全文-->
                  <div class="container-OurNews-body-item-footer">
                    <div class="container-OurNews-body-item-footer-time">{{item.publishDt}}<a
                      class="container-OurNews-body-item-footer-read" ref="#">Read the full text</a></div>
                  </div>
                </div>
              </router-link>
            </el-col>
          </div>
        </el-row>
      </div>

      <!--点击选中上一页的按钮的状态-->
      <a :class="this.lastVisited===true?'container-OurNews-lastPageVisited':'container-OurNews-lastPage'"
         v-on:click="prePage" v-if="this.newsCriteria.page!==0"></a>
      <!--当上一页没有内容时按钮为不可点击状态-->
      <div class="container-OurNews-lastPageUnClick" v-else></div>
      <!--点击选中下一页的按钮的状态-->
      <a :class="this.nextVisited===true?'container-OurNews-nextPageVisited':'container-OurNews-nextPage'"
         v-on:click="nextPage" v-if="this.newsCriteria.page!==this.data.totalPages-1"></a>
      <!--当下一页没有内容时按钮为不可点击状态-->
      <div class="container-OurNews-nextPageUnClick" v-else></div>
    </div>

    <!--我们的服务模块-->
    <div class="container-OurService">
      <!--我们的服务标题-->
      <div class="container-OurService-title" @click="goPage('#/web-EN/serviceArea')" title="点击查看详情">Service</div>
      <!--我们的服务的居中线-->
      <div class="container-OurService-line"></div>
      <!--我们的服务的内容-->
      <div class="container-OurService-body">
        <el-row>
          <!--我们的服务——船舶代理-->
          <el-col class="container-OurService-body-box1">
            <div class="container-OurService-body-img1">
              <div class="container-OurService-body-img1-text1">SHIPPING AGENCY</div>
              <div class="container-OurService-body-img1-text2">船舶代理</div>
              <a @click="goPage('#/web-En/serviceArea?selectItem=船舶代理')" class="container-OurService-body-img1-box">
                More
              </a>
            </div>
          </el-col>

          <!--我们的服务——图片1-->
          <el-col class="container-OurService-body-box2">
            <div class="container-OurService-body-box2-picBox" @mouseover="pic1=true" @mouseout="pic1=false">
              <img class="container-OurService-body-box2-picBox-pic"
                   src="../../assets/front/images/homepage/船舶代理配图@2x.png"
                   alt=""/>
              <div
                :class="pic1===true?'container-OurService-body-box2-picBox-triangle1 animate__animated animate__slideOutLeft':'container-OurService-body-box2-picBox-triangle1 animate__animated animate__slideInLeft'"></div>
            </div>
          </el-col>

          <!--我们的服务——国际货运-->
          <el-col class="container-OurService-body-box2">
            <div class="container-OurService-body-img2">
              <div class="container-OurService-body-img2-text1">CARGO FORWARDING</div>
              <div class="container-OurService-body-img2-text2">国际货运</div>
              <a @click="goPage('#/web-En/serviceArea?selectItem=国际货运')" class="container-OurService-body-img2-box">
                More
              </a>
            </div>
          </el-col>

          <!--我们的服务——图片2-->
          <el-col class="container-OurService-body-box2">
            <div class="container-OurService-body-box2-picBox" @mouseover="pic2=true" @mouseout="pic2=false">
              <img class="container-OurService-body-box2-picBox-pic"
                   src="../../assets/front/images/homepage/报关报检配图@2x.png"
                   alt=""/>
              <div
                :class="pic2===true?'container-OurService-body-box2-picBox-triangle2 animate__animated animate__slideOutRight':'container-OurService-body-box2-picBox-triangle2 animate__animated animate__slideInRight'"></div>
            </div>
          </el-col>

          <!--我们的服务——报关报检-->
          <el-col class="container-OurService-body-box2">
            <div class="container-OurService-body-img3">
              <div class="container-OurService-body-img3-text1">CARGO CUSTOMS CLEARANCE</div>
              <div class="container-OurService-body-img3-text2">报关报检</div>
              <a @click="goPage('#/web-En/serviceArea?selectItem=报关报检')" class="container-OurService-body-img3-box">
                More
              </a>
            </div>
          </el-col>
        </el-row>

        <el-row>
          <!--我们的服务——图片3-->
          <el-col class="container-OurService-body-box3">
            <div class="container-OurService-body-box2-picBox" @mouseover="pic3=true" @mouseout="pic3=false">
              <img class="container-OurService-body-box2-picBox-pic"
                   src="../../assets/front/images/homepage/保税仓储配图@2x.png"
                   alt=""/>
              <div
                :class="pic3===true?'container-OurService-body-box2-picBox-triangle3 animate__animated animate__slideOutRight':'container-OurService-body-box2-picBox-triangle3 animate__animated animate__slideInRight'"></div>
            </div>
          </el-col>

          <!--我们的服务——报税仓储-->
          <el-col class="container-OurService-body-box3">
            <div class="container-OurService-body-img4">
              <div class="container-OurService-body-img4-text1">BONDED WAREHOUSE</div>
              <div class="container-OurService-body-img4-text2">保税仓储</div>
              <a @click="goPage('#/web-En/serviceArea?selectItem=报税仓储')" class="container-OurService-body-img4-box">
                More
              </a>
            </div>
          </el-col>

          <!--我们的服务——图片4-->
          <el-col class="container-OurService-body-box3">
            <div class="container-OurService-body-box2-picBox" @mouseover="pic4=true" @mouseout="pic4=false">
              <img class="container-OurService-body-box2-picBox-pic"
                   src="../../assets/front/images/homepage/国际货运配图@2x.png"
                   alt=""/>
              <div
                :class="pic4===true?'container-OurService-body-box2-picBox-triangle4 animate__animated animate__slideOutUp':'container-OurService-body-box2-picBox-triangle4 animate__animated animate__slideInDown'"></div>
            </div>
          </el-col>

          <!--我们的服务——招商邮服-->
          <el-col class="container-OurService-body-box3">
            <div class="container-OurService-body-img5">
              <div class="container-OurService-body-img5-text1">CRUISE BUSINESS</div>
              <div class="container-OurService-body-img5-text2">招商邮服</div>
              <a @click="goPage('#/web-En/serviceArea?selectItem=招商邮服')" class="container-OurService-body-img5-box">
                More
              </a>
            </div>
          </el-col>

          <!--我们的服务——图片5-->
          <el-col class="container-OurService-body-box3">
            <div class="container-OurService-body-box2-picBox" @mouseover="pic5=true" @mouseout="pic5=false">
              <img class="container-OurService-body-box2-picBox-pic"
                   src="../../assets/front/images/homepage/招商邮服配图@2x.png"
                   alt=""/>
              <div
                :class="pic5===true?'container-OurService-body-box2-picBox-triangle5 animate__animated animate__slideOutLeft':'container-OurService-body-box2-picBox-triangle5 animate__animated animate__slideInLeft'"></div>
            </div>
          </el-col>
        </el-row>
      </div>
    </div>

    <!--在线服务模块-->
    <div class="container-OnlineService" id="container-OnlineService">
      <!--      <img class="container-OnlineService-img" src="../../assets/front/images/homepage/boat.jpg" alt=""/>-->
      <!--      &lt;!&ndash;为背景添加蒙版效果&ndash;&gt;-->
      <!--      <span class="container-OnlineService-span"></span>-->

      <!--在线服务内容-->
      <el-row class="container-OnlineService-body">

        <!--在线服务左边内容-->
        <el-col class="container-OnlineService-body-left" :span="10">
          <!--在线服务左边标题-->
          <div
            :class="onlineServiceFlag===true?'container-OnlineService-body-left-text1 animate__animated animate__shakeX':'container-OnlineService-body-left-text1'"
            @click="onlineServiceFlag=true" @mouseout="onlineServiceFlag=false">Online Service
          </div>

          <!--在线服务左边白色线段-->
          <div class="container-OnlineService-body-left-line"></div>

          <!--在线服务左边输入框1-->
          <div class="container-OnlineService-body-left-inputBox1">
            <el-input type="text" placeholder="Import bill of lading number or container number"
                      v-model="input1"></el-input>
            <a :href="'http://eservice.penavicosz.com.cn/polarisonline/default.aspx?inbound='+this.input1"
               target="_blank"
               class="container-OnlineService-body-left-inputBox1-search1"></a>
          </div>

          <!--在线服务左边输入框2-->
          <div class="container-OnlineService-body-left-inputBox2">
            <el-input type="text" placeholder="Export bill of lading number or container number"
                      v-model="input2"></el-input>
            <a :href="'http://eservice.penavicosz.com.cn/polarisonline/default.aspx?outbound='+this.input2"
               target="_blank"
               class="container-OnlineService-body-left-inputBox2-search2"></a>
          </div>

          <!--登录系统框-->
          <a href="http://eservice.penavicosz.com.cn/polarisonline/default.aspx?login" target="_blank"
             class="container-OnlineService-body-left-box">Login</a>
        </el-col>

        <!--在线服务右边内容-->
        <div class="container-OnlineService-body-right">
          <!--在线服务——56master-->
          <a href="http://www.56master.com/" target="_blank">
            <div class="container-OnlineService-body-right-box">
              <!--56master背景图片-->
              <img class="container-OnlineService-body-right-box-img1"
                   src="../../assets/front/images/homepage/物流大师配图@2x.png"
                   alt=""/>
              <!--标题上的白色线段-->
              <div class="container-OnlineService-body-right-box-line"></div>
              <!--56master图标-->
              <img class="container-OnlineService-body-right-box-icon"
                   src="../../assets/front/images/homepage/56Master-icon.png" alt=""/>
              <!--56master标题-->
              <div class="container-OnlineService-body-right-box-text1">56Master</div>
              <!--鼠标经过时显示蓝色蒙版-->
              <div class="container-OnlineService-body-right-box-span"></div>
              <!--鼠标经过时显示56Master图标-->
              <img class="container-OnlineService-body-right-box-icon2"
                   src="../../assets/front/images/homepage/56Master-icon.png" alt=""/>
              <!--鼠标经过时显示标题-->
              <div class="container-OnlineService-body-right-box-header">56MASTER<br/><span
                style="font-size: 16px!important;">Logistics Master</span></div>
              <!--鼠标经过时显示描述-->
              <div class="container-OnlineService-body-right-box-content">committed to a variety of logistics business
              </div>
              <!--鼠标经过时显示'进入网站'框-->
              <div class="container-OnlineService-body-right-box-link">Go to website</div>
            </div>
          </a>

          <!--在线服务——云极通-->
          <a href="https://www.cpoles.com/" target="_blank">
            <div class="container-OnlineService-body-right-box2">
              <!--云极通背景图片-->
              <img class="container-OnlineService-body-right-box2-img"
                   src="../../assets/front/images/homepage/云极通配图@2x.png" alt=""/>
              <!--标题上的白色线段-->
              <div class="container-OnlineService-body-right-box2-line"></div>
              <!--云极通图标-->
              <img class="container-OnlineService-body-right-box2-icon"
                   src="../../assets/front/images/homepage/yunjitong-icon.png" alt=""/>
              <!--云极通标题-->
              <div class="container-OnlineService-body-right-box2-text">CPOLES</div>
              <!--鼠标经过时显示蓝色蒙版-->
              <div class="container-OnlineService-body-right-box2-span"></div>
              <!--鼠标经过时显示图标-->
              <img class="container-OnlineService-body-right-box2-icon2"
                   src="../../assets/front/images/homepage/yunjitong-icon.png" alt=""/>
              <!--鼠标经过时显示标题-->
              <div class="container-OnlineService-body-right-box2-header">CPOLES<br/><span
                style="font-size: 16px!important;">YunJiTong</span></div>
              <!--鼠标经过时显示描述-->
              <div class="container-OnlineService-body-right-box2-content">YunJiTong is a system website integrating
                freight, shipping and air transportation
              </div>
              <!--鼠标经过时显示'进入网站'框-->
              <div class="container-OnlineService-body-right-box2-link">Go to website</div>
            </div>
          </a>
        </div>
      </el-row>
    </div>

    <!--页尾模块-->
    <Footer></Footer>
  </div>
</template>

<script>
  import Header from '@/views/public/header-En/header'  //引入页头组件
  import Footer from '@/views/public/footer-En/footer'  //引入页尾组件
  import {apiGetNewsList} from '@/api/news'
  import {isEmpty} from '@/utils'

  export default {
    name: 'home-page-EN',
    components: {Footer, Header},
    data() {
      return {
        imgFlag: true,
        bannerHeight: window.innerHeight - 98,
        titleWidth: '',
        pic1: false,//我们的服务三角箭头
        pic2: false,
        pic3: false,
        pic4: false,
        pic5: false,
        newsFlag: false,//点击我们的新闻出现特效
        serviceFlag: false,//点击我们的服务出现特效
        onlineServiceFlag: false,//点击在线服务出现特效
        monthData: ['', 'Jan', 'Feb', 'Mar', 'Apr', 'May', 'June', 'July', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'],//英文月份缩写
        data: {totalElements: 0, totalPages: 1},//总记录数，总页数
        lastVisited: false, //“我们的新闻”上一页是否访问过的标识
        nextVisited: false, //“我们的新闻”下一页是否访问过的标识
        input1: '',//在线服务输入框1
        input2: '',//在线服务输入框2
        // 轮播图的图片
        imgList: [
          {
            id: 0,
            imgUrl: require('../../assets/front/images/homepage/banner7.png')
          },
          {

            id: 1,
            imgUrl: require('../../assets/front/images/homepage/banner-new.png')
          },
          {
            id: 2,
            imgUrl: require('../../assets/front/images/homepage/banner5.png')
          },
          {
            id: 3,
            imgUrl: require('../../assets/front/images/homepage/banner4.png')
          },
          {
            id: 4,
            imgUrl: require('../../assets/front/images/homepage/banner6.png')
          }
        ],
        // 模拟我们的新闻数据
        ourNewsList: [],
        activeIndex: '1',//导航栏第一个菜单字体高亮
        // 首页新闻接口参数
        newsCriteria: {
          type: 'hp',
          web: 'PENAVICOSZ',
          language: '英文',
          catalog: '',
          keyword: '',
          page: 0,
          size: 3
        }
      }
    },
    created() {
      this.bannerHeight = window.innerHeight - 98
      this.getHpNews()
      window.addEventListener('resize', () => {
        this.bannerHeight = window.innerHeight - 98
        this.imgLoad()
      }, false)
    },
    mounted() {
      const _this = this
      this.$nextTick(() => {
        _this.fx()
        _this.handleJump()
      })
    },
    destroyed() {
      window.removeEventListener('resize', this.imgLoad, false)
    },
    // banner标题文字加载
    //   this.titleLoad()
    //   window.addEventListener('resize', () => {
    //     this.titleWidth = this.$refs.titleWidth[0].offsetWidth
    //     this.titleLoad()
    //   }, false)
    // },
    // //离开时销毁监听事件
    // destroyed() {
    //   window.removeEventListener('resize', this.titleWidth, false)
    // },
    methods: {
      handleJump(jump) {
        if (isEmpty(jump)) {
          if (this.$route.query.jump !== undefined) {
            jump = this.$route.query.jump
          }
        }
        if (!isEmpty(jump)) {
          const dom = document.getElementById(jump)
          if (!isEmpty(dom)) {
            document.documentElement.scrollTop = dom.offsetTop
          }
        }
      },
      fx() {
        this.imgFlag = false
        // if(this.imgFlag===true) {
        //   console.log(this.$refs.img[0])
        //   this.$refs.img[0].style.transition='transform 15s ease'
        //   this.$refs.img[0].style.transform='scale(1.1, 1.1)'
        // }else {
        //   this.$refs.img[0].style.transition=''
        //   this.$refs.img[0].style.transform=''
        // }
        // eslint-disable-next-line no-undef
        const obj2 = new window.SplitText($('.swiper-slide-textBox1 span'), {type: 'chars'})
        // eslint-disable-next-line no-undef
        // const obj3 = new window.SplitText($('.swiper-slide-textBox2 span'), {type: 'chars'})
        // eslint-disable-next-line no-undef
        const tl = new TimelineMax()
        tl.staggerFrom(obj2.chars, 0.6, {
          delay: 0.6,
          scale: 4,
          autoAlpha: 0,
          rotationX: -180,
          transformOrigin: '100% 50%',
          ease: window.Back.easeOut
        }, 0.02, 1)
        setTimeout(function () {
          tl.reverse()
        }, 6000)
        // tl.staggerFrom(obj2.chars, 0.8, {y: 260, ease: window.Expo.easeOut},0.03, 0)
        // tl.staggerFrom(obj2.chars, 1.5, {
        //   yPercent: 260,
        //   ease: window.Power4.easeInOut
        // }, 0.05, 0.05)
        // tl.staggerFrom(obj3.chars, 0.8, {opacity:0, scale:0, y:80, rotationX:180, transformOrigin:'0% 50% -50',  ease:window.Back.easeOut}, 0.01, 2.1)
      },
      // fx1() {
      //   // if(this.imgFlag===true) {
      //   //   console.log(this.$refs.img[0])
      //   //   this.$refs.img[0].style.transition='transform 15s ease'
      //   //   this.$refs.img[0].style.transform='scale(1.1, 1.1)'
      //   // }else {
      //   //   this.$refs.img[0].style.transition=''
      //   //   this.$refs.img[0].style.transform=''
      //   // }
      //   // eslint-disable-next-line no-undef
      //   const obj2 = new window.SplitText($('.swiper-slide-textBox1 span'), {type: 'chars'})
      //   // eslint-disable-next-line no-undef
      //   const obj3 = new window.SplitText($('.swiper-slide-textBox2 span'), {type: 'chars'})
      //   // eslint-disable-next-line no-undef
      //   const tl = new TimelineMax()
      //   tl.staggerFrom(obj3.chars, 0.6, {
      //     delay: 0.6,
      //     scale: 4,
      //     autoAlpha: 0,
      //     rotationX: -180,
      //     transformOrigin: '100% 50%',
      //     ease: window.Back.easeOut
      //   }, 0.02, 1)
      //   // tl.staggerFrom(obj2.chars, 0.8, {y: 260, ease: window.Expo.easeOut},0.03, 0)
      //   tl.staggerFrom(obj2.chars, 1.5, {
      //     yPercent: 260,
      //     ease: window.Power4.easeInOut
      //   }, 0.05, 0.05)
      //   // tl.staggerFrom(obj3.chars, 0.8, {opacity:0, scale:0, y:80, rotationX:180, transformOrigin:'0% 50% -50',  ease:window.Back.easeOut}, 0.01, 2.1)
      // },
      imgLoad() {
        const _this = this
        this.$nextTick(() => {
          _this.bannerHeight = window.innerHeight - 98
          // arr.forEach((item) => {
          //   console.log(item.offsetWidth)
          // })
        })
      },
      // 获取首页新闻下一页内容
      nextPage: function () {
        if (this.newsCriteria.page === this.data.totalPages - 1) {
          return
        }
        this.nextVisited = true
        this.lastVisited = false
        this.newsCriteria.page = this.newsCriteria.page + 1
        this.getHpNews()
      },
      //获取首页新闻上一页内容
      prePage: function () {
        if (this.newsCriteria.page === 0) {
          return
        }
        this.lastVisited = true
        this.nextVisited = false
        this.newsCriteria.page = this.newsCriteria.page - 1
        this.getHpNews()
      },
      // 获取首页新闻的后台数据
      getHpNews() {
        apiGetNewsList(this.newsCriteria).then((res) => {
          if (res.content.length !== 0) {
            this.data = res
            this.ourNewsList = res.content
            for (let i = 0; i < this.ourNewsList.length; i++) {
              if (this.ourNewsList[i].titleImage !== '') {
                this.ourNewsList[i].titleImage = 'data:image/jpeg;base64,' + this.ourNewsList[i].titleImage
              }
              const year = this.ourNewsList[i].publishDt.substring(0, 4)
              const month = this.ourNewsList[i].publishDt.substring(5, 7)
              const day = this.ourNewsList[i].publishDt.substring(8, 10)
              this.ourNewsList[i].publishDt = this.monthData[parseInt(month)] + ' ' + day + ',' + year
              this.ourNewsList[i].summary = this.ourNewsList[i].summary.replace(/&ldquo;/g, '“')
              this.ourNewsList[i].summary = this.ourNewsList[i].summary.replace(/&ldqu;/g, '“')
              this.ourNewsList[i].summary = this.ourNewsList[i].summary.replace(/&rdquo;/g, '”')
              this.ourNewsList[i].summary = this.ourNewsList[i].summary.replace(/&nbsp;/g, '')
              this.ourNewsList[i].summary = this.ourNewsList[i].summary.replace(/&middot;/g, '·')
            }
          }
        })
      },
      // 以本窗口形式跳转到新页面
      goPage(url) {
        window.open(url, '_self') // 路由跳转
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .container {
    /*<!--filter: progid:DXImageTransform.Microsoft.BasicImage(grayscale=1);-->*/
    /*<!-- -webkit-filter: grayscale(100%);-->*/
    min-width: 1300px;

    a:hover {
      color: #538ED9;
    }

    /*横幅图片样式*/
    &-banner {
      height: 100%;
      width: 100%;
      position: relative;
      overflow: hidden;


      &-carousel {
        width: 100%;

        &-icon {
          position: absolute;
          width: 18px;
          height: 28px;
          display: block;
          left: 50%;
          margin-left: -9px;
          bottom: 48px;
        }

        &-text {
          font-size: 16px;
          font-family: PingFangSC-Regular sans-serif;
          color: #FFFFFF;
          position: absolute;
          bottom: 22px;
          left: 50%;
          margin-left: -39px;
        }

        &-img {
          height: 100%;
          width: 100%;
          position: absolute;
          top: 0;
          left: 0;
          opacity: 0.8;
        }

        &-img1 {
          height: 100%;
          width: 100%;
          position: absolute;
          top: 0;
          left: 0;
          /*animation: img 15s ease;*/
          /*animation-fill-mode: forwards;*/
          /*opacity: 0.8;*/
        }

        @keyframes img {
          from {
            transform: scale(1 1);
          }
          to {
            transform: scale(1.1, 1.1);
          }

        }

        .el-carousel__item.is-active .container-banner-carousel-img {
          height: 100%;
          width: 100%;
          position: absolute;
          top: 0;
          left: 0;
          /*transform: scale(1.1, 1.1);*/
          /*transition: transform 15s ease;*/
          /*opacity: 0.8;*/
        }

        &-title {
          font-family: FZZDHJW--GB1-0, sans-serif;
          font-size: 40px;
          color: #FFFFFF;
          letter-spacing: 2px;
          font-weight: 400;
          position: absolute;
          top: 165px;
          left: 92%;
          padding: 15px 25px;
          display: inline-block;
          background-color: rgba(0, 0, 0, 0.6);
        }

        &-title1 {
          width: 30%;
          font-family: FZZDHJW--GB1-0, sans-serif;
          font-size: 40px;
          color: #FFFFFF;
          letter-spacing: 2px;
          font-weight: 400;
          top: 268px;
          right: 8%;
          position: absolute;
          padding: 15px 25px;
          display: inline-block;
          background-color: rgba(0, 0, 0, 0.6);
          word-break: break-all;
        }


        &-content {
          color: #fff;
          opacity: 0.8;
          font-family: PingFangSC-Regular, sans-serif;
          letter-spacing: 0.38px;
          font-size: 17px;
          line-height: 28px;;
          margin-left: 10%;
          width: 37%;

          &-word {
            margin-left: 115px;
            padding-top: 6px;
          }

        }
      }


    }

    /*我们的新闻样式*/
    &-OurNews {
      width: 100%;
      background-color: #F6F6F6;
      position: relative;

      &-lastPage {
        display: block;
        width: 48px;
        height: 38px;
        background-size: 21px 12px !important;
        background: url('../../assets/front/icon/lastBlack.png') no-repeat center center;
        box-shadow: 0 0 3px 0 rgba(0, 0, 0, 0.20);
        position: absolute;
        top: 50%;
        margin-top: 2.3%;
        left: 7.7%;
      }

      &-lastPageVisited {
        display: block;
        width: 48px;
        height: 38px;
        background-size: 21px 12px !important;
        background: #277AE3 url('../../assets/front/icon/lastWhite.png') no-repeat center center;
        box-shadow: 0 0 3px 0 rgba(190, 164, 120, 0.40);
        position: absolute;
        top: 50%;
        margin-top: 2.3%;
        left: 7.7%;
      }

      &-lastPageUnClick {
        width: 48px;
        height: 38px;
        background-size: 21px 12px !important;
        background: #fff url('../../assets/front/icon/lastPageUnClick.png') no-repeat center center;
        box-shadow: 0 0 2px rgba(0, 0, 0, 0.20);
        position: absolute;
        top: 50%;
        margin-top: 2.3%;
        left: 7.7%;
      }

      &-nextPage {
        display: block;
        width: 48px;
        height: 38px;
        background-size: 21px 12px !important;
        background: url('../../assets/front/icon/nextBlack.png') no-repeat center center;
        box-shadow: 0 0 3px 0 rgba(0, 0, 0, 0.20);
        position: absolute;
        top: 50%;
        margin-top: 2.3%;
        right: 7.7%;
      }

      &-nextPageVisited {
        display: block;
        width: 48px;
        height: 38px;
        background-size: 21px 12px !important;
        background: #277AE3 url('../../assets/front/icon/nextWhite.png') no-repeat center center;
        box-shadow: 0 0 3px 0 rgba(190, 164, 120, 0.40);
        position: absolute;
        top: 50%;
        margin-top: 2.3%;
        right: 7.7%;
      }

      &-nextPageUnClick {
        width: 48px;
        height: 38px;
        background-size: 21px 12px !important;
        background: #fff url('../../assets/front/icon/nextUnClick.png') no-repeat center center;
        box-shadow: 0 0 2px rgba(0, 0, 0, 0.20);
        position: absolute;
        top: 50%;
        margin-top: 2.3%;
        right: 7.7%;
      }

      &-title {
        width: 170px;
        margin: 0 auto;
        text-align: center;
        padding-top: 80px;
        padding-bottom: 25px;
        font-family: PingFangSC-Regular, sans-serif;
        font-size: 30px;
        color: #3B3F47;
        letter-spacing: 0.38px;
      }

      &-title:hover {
        cursor: pointer;
      }

      &-line {
        background-color: #277AE3;
        height: 4px;
        width: 50px;
        position: absolute;
        left: 50%;
        margin-left: -25px;
      }

      &-body {
        width: 100%;
        padding-left: 10%;
        padding-right: 10%;
        margin-top: 25px;
        padding-bottom: 6%;

        &-item {
          background-color: #fff;
          height: 100%;

          &-imgBox {
            width: 100%;
            height: 280px;
            overflow: hidden;

            &-img {
              display: inline-block;
              width: 100%;
              height: 280px;
              transition: all 0.7s;
            }

            &-img:hover {
              transform: scale(1.2);
            }
          }

          &-head {
            padding: 6% 7% 3% 7%;
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 17px;
            color: #303030;
            letter-spacing: 0.38px;
            overflow: hidden; /*超出部分隐藏*/
            /*white-space: nowrap; !*让文本强制在一行不换行*!*/
            text-overflow: ellipsis; /*显示省略号来代表被修剪的文本*/
          }

          &-line {
            margin-left: 7%;
            width: 40px;
            height: 4px;
            background-color: #277AE3;
          }

          &-line2 {
            margin-top: 20px;
            width: 100%;
            height: 1px;
            background-color: #EEEEEE;
          }

          &-comment {
            width: 100%;
            height: 115px;
            padding: 20px 7% 0 7%;
            font-family: PingFangSC-Regular, sans-serif;
            font-size: 14px;
            color: #818181;
            letter-spacing: 0.38px;
            line-height: 19px;
            overflow: hidden;
            text-overflow: ellipsis;
            display: -webkit-box;
            //noinspection CssUnknownProperty
            -webkit-line-clamp: 5; // 控制多行的行数
            /*! autoprefixer: off */
            -webkit-box-orient: vertical;
            /* autoprefixer: on */
            word-break: break-all;
          }

          &-footer {
            &-time {
              width: 100%;
              min-height: 60px;
              line-height: 60px;
              padding-left: 7%;
              font-family: PingFangSC-Regular, sans-serif;
              font-size: 12px;
              color: #818181;
              letter-spacing: 0.38px;
            }

            &-read {
              font-family: PingFangSC-Regular, sans-serif;
              font-size: 14px;
              color: #277AE3;
              letter-spacing: 0.38px;
              float: right;
              padding-right: 7%;
            }
          }

        }

      }
    }

    /*我们的服务样式*/
    &-OurService {
      position: relative;
      width: 100%;
      height: 600px;
      background-color: #FFFFFF;

      &-title {
        width: 170px;
        padding-top: 60px;
        padding-bottom: 25px;
        margin: 0 auto;
        text-align: center;
        font-family: PingFangSC-Regular, sans-serif;
        font-size: 30px;
        color: #3B3F47;
        letter-spacing: 0.38px;
      }

      &-title:hover {
        cursor: pointer;
      }

      &-line {
        background-color: #277AE3;
        height: 4px;
        width: 50px;
        position: absolute;
        left: 50%;
        margin-left: -25px;
      }

      &-body {
        width: 100%;
        margin-top: 30px;

        &-box1 {
          width: 20%;
          margin-right: -1px;
        }

        &-box2 {
          width: 20%;

          &-picBox {
            width: 100%;
            height: 200px;
            overflow: hidden;
            position: relative;

            &-triangle1 {
              width: 0;
              height: 0;
              border-left: 15px solid #31C6D2;
              border-top: 15px solid transparent;
              border-bottom: 15px solid transparent;
              position: absolute;
              top: 50%;
              left: 0;
              margin-top: -7.5px;
            }

            &-triangle2 {
              border-right: 15px solid #7B6A61;
              border-top: 15px solid transparent;
              border-bottom: 15px solid transparent;
              width: 0;
              height: 0;
              position: absolute;
              right: 0;
              top: 50%;
              margin-top: -7.5px;
            }

            &-triangle3 {
              border-right: 15px solid #E7505A;
              border-top: 15px solid transparent;
              border-bottom: 15px solid transparent;
              width: 0;
              height: 0;
              position: absolute;
              right: 0;
              top: 50%;
              margin-top: -7.5px;
            }

            &-triangle4 {
              border-right: 15px solid transparent;
              border-top: 15px solid #58BFE1;
              border-left: 15px solid transparent;
              width: 0;
              height: 0;
              position: absolute;
              left: 50%;
              top: 0;
              margin-left: -15px;
            }

            &-triangle5 {
              width: 0;
              height: 0;
              border-left: 15px solid #BEA478;
              border-top: 15px solid transparent;
              border-bottom: 15px solid transparent;
              position: absolute;
              top: 50%;
              left: 0;
              margin-top: -7.5px;
            }

            &-pic {
              width: 100%;
              height: 200px;
              transition: all 0.8s;
            }

            &-pic:hover {
              transform: scale(1.2);
              cursor: pointer;
            }
          }
        }

        &-box3 {
          width: 20%;
          margin-top: -2px;
        }

        &-img1 {
          height: 200px;
          border: 1px solid transparent;
          width: 100%;
          position: relative;
          background-color: #31C6D2;

          &-text1 {
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 20px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            text-align: center;
            margin-top: 15%;
          }

          &-text2 {
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 17px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            text-align: center;
            line-height: 30px;

          }

          &-box {
            display: block;
            width: 60px;
            height: 32px;
            border: 1px solid #FFFFFF;
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 14px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            text-align: center;
            line-height: 32px;
            margin-top: 6%;
            margin-right: auto;
            margin-left: auto;
          }

          &-box:hover {
            width: 60px;
            height: 32px;
            border: 1px solid #31C6D2;
            text-align: center;
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 14px;
            background-color: #fff;
            color: #31C6D2 !important;
            letter-spacing: 0.38px;
            line-height: 32px;
          }
        }

        &-img2 {
          height: 200px;
          background-color: #58BFE1;
          border: 1px solid transparent;
          width: 100%;
          position: relative;

          &-text1 {
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 20px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            text-align: center;
            margin-top: 15%;
          }

          &-text2 {
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 17px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            text-align: center;
            line-height: 30px;
          }

          &-box {
            display: block;
            width: 60px;
            height: 32px;
            border: 1px solid #FFFFFF;
            text-align: center;
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 14px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            line-height: 32px;
            margin-top: 6%;
            margin-right: auto;
            margin-left: auto;
          }

          &-box:hover {
            width: 60px;
            height: 32px;
            border: 1px solid #58BFE1;
            text-align: center;
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 14px;
            background-color: #fff;
            color: #58BFE1 !important;
            letter-spacing: 0.38px;
            line-height: 32px;
          }
        }

        &-img3 {
          height: 200px;
          background-color: #7B6A61;
          border: 1px solid transparent;
          width: 100%;
          position: relative;

          &-text1 {
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 20px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            text-align: center;
            margin-top: 15%;
          }

          &-text2 {
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 17px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            text-align: center;
            line-height: 30px;
          }

          &-box {
            display: block;
            width: 60px;
            height: 32px;
            border: 1px solid #FFFFFF;
            text-align: center;
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 14px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            line-height: 32px;
            margin-top: 6%;
            margin-right: auto;
            margin-left: auto;
          }

          &-box:hover {
            width: 60px;
            height: 32px;
            border: 1px solid #7B6A61;
            text-align: center;
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 14px;
            background-color: #fff;
            color: #7B6A61 !important;
            letter-spacing: 0.38px;
            line-height: 32px;

          }
        }

        &-img4 {
          border: 1px solid transparent;
          width: 100%;
          position: relative;
          height: 200px;
          background-color: #E7505A;

          &-text1 {
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 20px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            text-align: center;
            margin-top: 15%;

          }

          &-text2 {
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 17px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            text-align: center;
            line-height: 30px;
          }

          &-box {
            display: block;
            width: 60px;
            height: 32px;
            border: 1px solid #FFFFFF;
            text-align: center;
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 14px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            line-height: 32px;
            margin-top: 6%;
            margin-right: auto;
            margin-left: auto;
          }

          &-box:hover {
            width: 60px;
            height: 32px;
            border: 1px solid #E7505A;
            text-align: center;
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 14px;
            background-color: #fff;
            color: #E7505A !important;
            letter-spacing: 0.38px;
            line-height: 32px;
          }
        }

        &-img5 {
          border: 1px solid transparent;
          width: 100%;
          position: relative;
          height: 200px;
          background-color: #BEA478;

          &-text1 {
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 20px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            text-align: center;
            margin-top: 15%;
          }

          &-text2 {
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 17px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            text-align: center;
            line-height: 28px;
          }

          &-box {
            display: block;
            width: 60px;
            height: 32px;
            border: 1px solid #FFFFFF;
            text-align: center;
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 14px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            line-height: 32px;
            margin-top: 6%;
            margin-right: auto;
            margin-left: auto;
          }

          &-box:hover {
            width: 60px;
            height: 32px;
            border: 1px solid #BEA478;
            text-align: center;
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 14px;
            background-color: #fff;
            color: #BEA478 !important;
            letter-spacing: 0.38px;
            line-height: 32px;
          }
        }
      }
    }

    /*在线服务样式*/
    &-OnlineService {
      width: 100%;
      height: 480px;
      position: relative;
      border-top: 1px solid transparent;
      background-color: #515151;

      &-img {
        position: absolute;
        top: 0;
        left: 0;
        width: 100%;
        height: 480px;
      }

      &-span {
        background-color: rgba(40, 40, 40, 0.9);
        width: 100%;
        height: 480px;
        display: block;
        position: absolute;
        top: 0;
        left: 0;
      }

      &-body {
        padding-right: 10%;
        padding-left: 10%;
        padding-top: 7%;
        margin-left: 0 !important;
        margin-right: 0 !important;

        &-right {
          position: relative;
          border: 1px solid transparent;
          float: right;

          &-box2 {
            display: inline-block;
            margin-left: 20px;
            width: 220px;
            height: 280px;
            position: relative;

            &-img {
              opacity: 0.7;
              width: 220px;
              height: 280px;
            }

            &-icon {
              width: 35px;
              height: 35px;
              position: absolute;
              top: 76%;
              left: 13%;
            }

            &-line {
              display: block;
              width: 38px;
              height: 3px;
              background: #FFFFFF;
              position: absolute;
              top: 74%;
              left: 14%;
            }

            &-text {
              display: block;
              font-family: PingFangSC-Semibold, sans-serif;
              font-size: 18px;
              color: #FFFFFF;
              letter-spacing: 0;
              line-height: 34px;
              position: absolute;
              top: 76%;
              left: 31%;
            }

            &-span {
              display: none;
              width: 220px;
              height: 280px;
              background-color: rgb(39, 122, 227);
              position: absolute;
              top: 0;
              left: 0;
              opacity: 0.8;
            }

            &-icon2 {
              width: 36px;
              height: 36px;
              left: 13%;
              position: absolute;
              top: 21%;
              display: none;
            }

            &-header {
              display: none;
              font-family: PingFangSC-Semibold, sans-serif;
              font-size: 20px;
              color: #FFFFFF;
              letter-spacing: 0.38px;
              line-height: 22px;
              position: absolute;
              top: 35%;
              left: 13%;
            }

            &-content {
              display: none;
              font-family: PingFangSC-Regular, sans-serif;
              font-size: 12px;
              color: #FFFFFF;
              letter-spacing: 0.38px;
              position: absolute;
              top: 58%;
              left: 13%;
            }

            &-link {
              display: none;
              background: #FFFFFF;
              width: 113.7px;
              height: 35.2px;
              font-family: PingFangSC-Semibold, sans-serif;
              font-size: 15px;
              color: #277AE3;
              letter-spacing: 0.38px;
              text-align: center;
              line-height: 35.2px;
              position: absolute;
              top: 75%;
              left: 13%;
            }
          }

          &-box2:hover .container-OnlineService-body-right-box2-span {
            display: inline-block;
          }

          &-box2:hover .container-OnlineService-body-right-box2-line {
            display: none;
          }

          &-box2:hover .container-OnlineService-body-right-box2-text {
            display: none;
          }

          &-box2:hover .container-OnlineService-body-right-box2-icon {
            display: none;
          }

          &-box2:hover .container-OnlineService-body-right-box2-icon2 {
            display: block;
          }

          &-box2:hover .container-OnlineService-body-right-box2-header {
            display: block;
          }

          &-box2:hover .container-OnlineService-body-right-box2-content {
            display: block;
          }

          &-box2:hover .container-OnlineService-body-right-box2-link {
            display: block;
          }

          &-box {
            display: inline-block;
            width: 220px;
            height: 280px;
            position: relative;

            &-img1 {
              opacity: 0.7;
              width: 220px;
              height: 280px;
            }

            &-line {
              width: 38px;
              height: 3px;
              background: #FFFFFF;
              position: absolute;
              top: 72%;
              left: 13%;
            }

            &-icon {
              width: 27px;
              height: 27px;
              position: absolute;
              top: 75%;
              left: 13%;
            }

            &-text1 {
              font-family: PingFangSC-Semibold, sans-serif;
              font-size: 18px;
              color: #FFFFFF;
              letter-spacing: 0;
              line-height: 34px;
              position: absolute;
              top: 74%;
              left: 27%;
            }

            &-span {
              display: none;
              width: 220px;
              height: 280px;
              background-color: rgb(39, 122, 227);
              position: absolute;
              top: 0;
              left: 0;
              opacity: 0.8;

            }

            &-header {
              display: none;
              font-family: PingFangSC-Semibold, sans-serif;
              font-size: 20px;
              color: #FFFFFF;
              letter-spacing: 0.38px;
              line-height: 22px;
              position: absolute;
              top: 35%;
              left: 13%;
            }

            &-icon2 {
              width: 30px;
              height: 30px;
              left: 13%;
              position: absolute;
              top: 21%;
              display: none;
            }

            &-content {
              display: none;
              font-family: PingFangSC-Regular, sans-serif;
              font-size: 12px;
              color: #FFFFFF;
              letter-spacing: 0.38px;
              position: absolute;
              top: 58%;
              left: 13%;
            }

            &-link {
              display: none;
              background: #FFFFFF;
              width: 113.7px;
              height: 35.2px;
              font-family: PingFangSC-Semibold, sans-serif;
              font-size: 15px;
              color: #277AE3;
              letter-spacing: 0.38px;
              text-align: center;
              line-height: 35.2px;
              position: absolute;
              top: 75%;
              left: 13%;
            }
          }

          &-box:hover .container-OnlineService-body-right-box-header {
            display: block;
          }

          &-box:hover .container-OnlineService-body-right-box-content {
            display: block;
          }

          &-box:hover .container-OnlineService-body-right-box-icon2 {
            display: block;
          }

          &-box:hover .container-OnlineService-body-right-box-link {
            display: block;
          }

          &-box:hover .container-OnlineService-body-right-box-span {
            display: inline-block;
          }

          &-box:hover .container-OnlineService-body-right-box-line {
            display: none;
          }

          &-box:hover .container-OnlineService-body-right-box-text1 {
            display: none;
          }

          &-box:hover .container-OnlineService-body-right-box-icon {
            display: none;
          }
        }

        &-left {
          padding-left: 0 !important;
          padding-right: 0 !important;
          width: 50%;
          position: relative;
          border: 1px solid transparent;

          &-text1 {
            width: 212px;
            color: #ffffff;
            font-size: 30px;
            letter-spacing: 0.38px;
            font-family: PingFangSC-Regular, sans-serif;
          }

          &-text1:hover {
            cursor: pointer;
          }

          &-line {
            width: 30px;
            height: 3px;
            background-color: #FFFFFF;
            margin: 25px 0;
          }

          &-inputBox1 {
            width: 460px;
            height: 40px;
            position: relative;

            &-search1 {
              display: inline-block;
              height: 18px;
              width: 18px;
              background-color: #fff;
              background-size: 18px 18px;
              background-image: url('../../assets/front/icon/search.png');
              position: absolute;
              top: 50%;
              margin-top: -9px;
              right: 10px;
            }
          }

          &-inputBox2 {
            width: 460px;
            height: 40px;
            margin-top: 15px;
            position: relative;

            &-search2 {
              display: inline-block;
              height: 18px;
              width: 18px;
              background-color: #fff;
              background-size: 18px 18px;
              background-image: url('../../assets/front/icon/search.png');
              position: absolute;
              top: 50%;
              margin-top: -9px;
              right: 10px;
            }
          }

          &-search2 {
            display: inline-block;
            height: 17px;
            width: 17px;
            background-color: #fff;
            background-size: 17px 17px;
            background-image: url('../../assets/front/icon/search.png');
          }

          &-box {
            margin-top: 25px;
            display: inline-block;
            height: 46px;
            width: 120px;
            background-color: #277AE3;
            line-height: 46px;
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 16px;
            color: #FFFFFF;
            letter-spacing: 0.38px;
            text-align: center;
          }

          &-box:hover {
            height: 46px;
            width: 120px;
            background-color: #FFFFFF;
            line-height: 46px;
            font-family: PingFangSC-Semibold, sans-serif;
            font-size: 16px;
            color: #277AE3;
            letter-spacing: 0.38px;
            text-align: center;
            font-weight: bolder;
          }
        }
      }

    }

    @media screen and (max-width: 1800px) {
      .container-OurNews-body-item-imgBox {
        height: 260px;
      }
      .container-OurNews-body-item-imgBox-img {
        display: inline-block;
        width: 100%;
        height: 260px;
      }
    }
    @media screen and (max-width: 1750px) {
      .container-OurNews-body-item-imgBox {
        height: 243px;
      }
      .container-OurNews-body-item-imgBox-img {
        display: inline-block;
        width: 100%;
        height: 243px;
      }
    }
    @media screen and (max-width: 1655px) {
      .container-OurNews-body-item-imgBox {
        height: 240px;
      }
      .container-OurNews-body-item-imgBox-img {
        display: inline-block;
        width: 100%;
        height: 240px;
      }
    }
    @media screen and (max-width: 1500px) {
      .container-OurNews-body-item-imgBox {
        height: 235px;
      }
      .container-OurNews-body-item-imgBox-img {
        display: inline-block;
        width: 100%;
        height: 235px;
      }
    }
    /*当屏幕分辨率少于1400px时，我们的新闻图片改变样式*/
    @media screen and (max-width: 1400px) {
      .container-OurNews-body-item-imgBox {
        height: 200px;
      }
      .container-OurNews-body-item-imgBox-img {
        display: inline-block;
        width: 100%;
        height: 200px;
      }
      .container-OurService-body-img1-text1 {
        font-size: 17px;
      }
      .container-OurService-body-img1-text2 {
        margin-top: 10px;
      }
      .container-OurService-body-img2-text1 {
        font-size: 17px;
      }
      .container-OurService-body-img2-text2 {
        margin-top: 10px;
      }
      .container-OurService-body-img3-text1 {
        font-size: 17px;
      }
      .container-OurService-body-img3-text2 {
        margin-top: 10px;
      }
      .container-OurService-body-img4-text1 {
        font-size: 17px;
      }
      .container-OurService-body-img4-text2 {
        margin-top: 10px;
      }
      .container-OurService-body-img5-text1 {
        font-size: 17px;
      }
      .container-OurService-body-img5-text2 {
        margin-top: 10px;
      }
    }
    @media screen and (max-width: 1300px) {
      .container-OurService-body-img3-text1 {
        font-size: 15px;
      }
    }
  }

  .swiper-slide-textBox2 span {
    display: block;
    width: 100%;
    text-align: center;
    font-size: 42px;
    height: 1.42em;
    overflow: hidden;
    margin: 20px auto 20px;
    color: #fff;
    font-family: source-Hans-sans, sans-serif;
    letter-spacing: 3px;
  }

  .swiper-slide-textBox1 span {
    display: block;
    width: 100%;
    text-align: center;
    font-size: 42px;
    height: 1.42em;
    overflow: hidden;
    margin: 120px auto 20px;
    color: #fff;
    font-family: source-Hans-sans, sans-serif;
    letter-spacing: 3px;
  }

</style>
