<template>
  <div class="container">
    <!--导航栏模块-->
    <Header :active-index="activeIndex"></Header>

    <!--横幅banner模块-->
    <div class="container-banner">
<!--      <el-row>-->
<!--        <el-col :span="24">-->
<!--          <div class="container-banner-title animate__animated animate__bounceInDown">活动详情</div>-->
<!--        </el-col>-->
<!--      </el-row>-->
<!--      <el-row>-->
<!--        <el-col :span="24">-->
<!--          <div class="container-banner-content animate__animated animate__bounceInDown">ACTIVITY DETAILS</div>-->
<!--        </el-col>-->
<!--      </el-row>-->
    </div>

    <!--员工活动详情主体模块-->
    <div class="container-body">
      <el-row>
        <el-col :span="16">
          <!--活动详情标题-->
          <div class="container-body-left-title">
            {{activity.title}}
          </div>
          <!--活动详情来源-->
          <!--<div class="container-body-left-source">{{activity.publishBy}}</div>-->
          <!--活动详情时间-->
          <div class="container-body-left-dateTime">{{activity.publishDt}}</div>
          <!--<div class="container-body-left-imageSource">图来自于{{activity.publishBy}}</div>-->
          <!--<div class="container-body-left-image" v-if="activity.titleImage!==''">-->
          <!--<img :src="'data:image/png;base64,'+news.titleImage" alt="" style="width: 100%; height: 400px;"/>-->
          <!--</div>-->
          <!--活动详情内容-->
          <div class="container-body-left-content">
            <p class="container-body-left-content-word" v-html="activity.content">{{activity.content}}</p>
          </div>

          <el-row :gutter="50">
            <!--上一篇活动内容-->
            <div v-if="lastFlag===false">
              <el-col :span="12">
                <div class="container-body-news" @click="getLastActivity(lastActivity.id)">
                  <div class="container-body-news-word">上一篇</div>
                  <div class="container-body-news-line"></div>
                  <div class="container-body-news-title">{{lastActivity.title}}</div>
                  <!--<div class="container-body-news-source">{{lastNews.publishBy}}</div>-->
                  <div class="container-body-news-dateTime">{{lastActivity.publishDt}}</div>
                </div>
              </el-col>
            </div>
            <!--若当前活动为第一篇时-->
            <div v-if="lastFlag===true">
              <el-col :span="12">
                <div class="container-body-newsDisabled">
                  <div class="container-body-newsDisabled-word">上一篇</div>
                  <div class="container-body-newsDisabled-line"></div>
                  <div class="container-body-newsDisabled-content" v-if="lastFlag===true">上一篇内容为空</div>
                </div>
              </el-col>
            </div>

            <!--下一篇活动内容-->
            <div v-if="nextFlag===false">
              <el-col :span="12">
                <div class="container-body-news" @click="getNextActivity(nextActivity.id)">
                  <div class="container-body-news-word">下一篇</div>
                  <div class="container-body-news-line"></div>
                  <div class="container-body-news-title">{{nextActivity.title}}</div>
                  <!--<div class="container-body-news-source">{{nextActivity.publishBy}}</div>-->
                  <div class="container-body-news-dateTime">{{nextActivity.publishDt}}</div>
                </div>
              </el-col>
            </div>

            <!--若当前活动为最后一篇时-->
            <div v-if="nextFlag===true">
              <el-col :span="12">
                <div class="container-body-newsDisabled">
                  <div class="container-body-newsDisabled-word">下一篇</div>
                  <div class="container-body-newsDisabled-line"></div>
                  <div class="container-body-newsDisabled-content">下一篇内容为空</div>
                </div>
              </el-col>
            </div>
          </el-row>
        </el-col>
        <!--其他活动模块-->
        <el-col :span="6" style="float: right">
          <div class="container-body-right">
            <div class="container-body-right-word">其他活动</div>
            <div class="container-body-right-line"></div>
            <div v-for="(item,index) in otherActivity"
                 :class="index===2?'container-body-right-lastContent':'container-body-right-content'"
                 @mousemove="hoverIndex=index" @mouseout="hoverIndex=-1" @click="getOtherActivity(item.id)">
              <div
                :class="hoverIndex===index?'container-body-right-content-titleCheck':'container-body-right-content-title'">
                {{item.title}}
              </div>
              <!--<div class="container-body-right-content-source">{{item.publishBy}}</div>-->
              <div class="container-body-right-content-dateTime">{{item.publishDt}}</div>
            </div>
          </div>
          <!--分享模块-->
          <el-row>
            <el-col :span="24" class="container-body-share">
              <div class="share-container">
                <el-row class="share-container-line">
                  <el-col :span="11"
                          :class="wechatCheck===true?'share-container-line-item-check':'share-container-line-item'"
                          @click.native="wechatShare()">
                    <div class="box">
                      <div class="box-img">
                        <img src="../../../assets/front/icon/weixin.png" alt=""/>
                      </div>
                      <div class="box-title">
                        分享到微信
                      </div>
                    </div>
                  </el-col>
                  <el-col :span="2">&nbsp;</el-col>
                  <el-col :span="11"
                          :class="weiboCheck===true?'share-container-line-item-check':'share-container-line-item'"
                          @click.native="weiboShare()">
                    <div class="box">
                      <div class="box-img">
                        <img src="../../../assets/front/icon/weibo.png" alt=""/>
                      </div>
                      <div class="box-title">
                        分享到微博
                      </div>
                    </div>
                  </el-col>
                </el-row>
                <div class="wechat-qrcode" id="wechat-qrcode" v-show="showWechatQrcode">
                  <div class="wechat-qrcode-title" :style="{width:wechatQrcodeSize + 'px',textAlign: 'center'}">
                    {{wechatQrcodeTitle}}
                  </div>
                  <div class="wechat-qrcode-content" id="wechat-qrcode-content"
                       :style="{width:wechatQrcodeSize + 'px'}"></div>
                  <div class="wechat-qrcode-helper" :style="{width:wechatQrcodeSize + 'px',textAlign: 'center'}">
                    {{wechatQrcodeHelper}}
                  </div>
                </div>
              </div>
            </el-col>
          </el-row>
        </el-col>
      </el-row>
    </div>
    <!--页尾模块-->
    <Footer></Footer>
  </div>
</template>

<script>
  import QRCode from 'qrcodejs2'
  import Header from '@/views/public/header/header'  //引入页头组件
  import Footer from '@/views/public/footer/footer'  //引入页尾组件
  import {apiGetNews, apiGetNewsList} from '@/api/news'

  let qrcode = ''
  export default {
    name: 'employee-activity-detail',
    components: {Footer, Header},
    data() {
      return {
        wechatCheck: false,
        weiboCheck: false,
        runningInWeChat: /MicroMessenger/i.test(navigator.userAgent),
        isMobileScreen: document.documentElement.clientWidth <= 768,
        defaultSource: document.title,
        defaultTitle: document.title,
        defaultDescription: document.title,
        defaultImg: (document.images[0] || 0).src || '',
        showWechatQrcode: false,
        templates: {
          qzone: 'http://sns.qzone.qq.com/cgi-bin/qzshare/cgi_qzshare_onekey?url={{URL}}&title={{TITLE}}&desc={{DESCRIPTION}}&summary={{SUMMARY}}&site={{SOURCE}}&pics={{IMAGE}}',
          qq: 'http://connect.qq.com/widget/shareqq/index.html?url={{URL}}&title={{TITLE}}&source={{SOURCE}}&desc={{DESCRIPTION}}&pics={{IMAGE}}&summary="{{SUMMARY}}"',
          weibo: 'https://service.weibo.com/share/share.php?url={{URL}}&title={{TITLE}}&pic={{IMAGE}}&appkey={{WEIBOKEY}}',
          wechat: 'javascript:',
          douban: 'http://shuo.douban.com/!service/share?href={{URL}}&name={{TITLE}}&text={{DESCRIPTION}}&image={{IMAGE}}&starid=0&aid=0&style=11',
          linkedin: 'http://www.linkedin.com/shareArticle?mini=true&ro=true&title={{TITLE}}&url={{URL}}&summary={{SUMMARY}}&source={{SOURCE}}&armin=armin',
          facebook: 'https://www.facebook.com/sharer/sharer.php?u={{URL}}',
          twitter: 'https://twitter.com/intent/tweet?text={{TITLE}}&url={{URL}}&via={{ORIGIN}}',
          google: 'https://plus.google.com/share?url={{URL}}'
        },
        url: window.location.href,
        origin: window.location.origin,
        source: '',
        title: '',
        description: '',
        image: '',
        imageSelector: undefined,
        weiboKey: '',
        wechatQrcodeTitle: '微信扫一扫：分享',
        wechatQrcodeHelper: '微信里点“发现”，扫一下二维码便可将本文分享至朋友圈',
        wechatQrcodeSize: 170,
        sites: ['weibo', 'qq', 'wechat', 'douban', 'qzone', 'linkedin', 'facebook', 'twitter', 'google'],
        mobileSites: [],
        disabled: [],
        initialized: false,
        typeFlag: false,
        urlIndex: '',
        activity: {},//当前活动详情对象
        activityId: '',//当前活动ID
        year: '',//当前年份
        activeIndex: '6',//当前页面为企业文化页面，页头导航栏显示企业文化高亮
        listLoading: false,//是否开启加载
        hoverIndex: '-1',//用于辨识鼠标经过哪一条新闻
        otherActivity: [],//存储其他活动列表
        lastActivity: {},//上一页活动对象
        nextActivity: {},//下一页活动对象
        activityList: [],//活动列表数据
        lastFlag: false,//用于判断是否已经是第一篇活动
        nextFlag: false,//用于判断是否已经是最后一篇活动
        activityCriteria: {//请求新闻后台数据参数
          type: 'list',
          web: 'PENAVICOSZ',
          language: '中文',
          catalog: '员工活动',
          keyword: '',
          startDt: '-01-01 00:00:00',
          endDt: '-12-31 23:59:59'
        }
      }
    },
    destroyed() {
      qrcode = null
    },
    created() {
      this.activityId = this.$route.query.id         //把链接上的活动Id赋值给当前页
      this.year = this.$route.query.select
      this.activityCriteria.startDt = this.year.toString() + this.activityCriteria.startDt
      this.activityCriteria.startDt = new Date(this.activityCriteria.startDt)
      this.activityCriteria.endDt = this.year.toString() + this.activityCriteria.endDt
      this.activityCriteria.endDt = new Date(this.activityCriteria.endDt)
      this.getActivityDetail()//请求新闻详情数据
      this.init()
    },
    methods: {
      init() {
        this.defaultSource = this.source || this.getMetaContentByName('site') || this.getMetaContentByName('Site') || document.title
        this.defaultTitle = this.title || this.getMetaContentByName('title') || this.getMetaContentByName('Title') || document.title
        this.defaultDescription = this.description || this.getMetaContentByName('description') || this.getMetaContentByName('Description') || ''
        this.defaultImg = this.image || this.defaultImg
      },
      wechatShare() {
        this.wechatCheck = !this.wechatCheck
        this.weiboCheck = false
        // const e = event || window.event
        // const scrollX = document.documentElement.scrollLeft || document.body.scrollLeft
        // const scrollY = document.documentElement.scrollTop || document.body.scrollTop
        // const x = e.pageX || e.clientX + scrollX
        // const y = e.pageY || e.clientY + scrollY
        const sourceDom = document.getElementById('wechat-qrcode')
        sourceDom.style.position = 'absolute'
        // sourceDom.style.left = x + 'px'
        // sourceDom.style.top = y + 40 + 'px'
        sourceDom.style.left = '6px'
        sourceDom.style.top = '100px'
        this.qrcode(this.url, 'wechat-qrcode-content')
      },
      weiboShare() {
        this.wechatCheck = false
        this.weiboCheck = false
        this.urlIndex = window.location.href.indexOf('activityDetail')
        this.url = window.location.href.substring(0, parseInt(this.urlIndex) + 14)
        this.url = this.url + '?id=' + this.activityId + '&select=' + this.year
        const url = this.templates.weibo.replace('{{URL}}', encodeURIComponent(this.url))
          .replace('{{TITLE}}', this.defaultTitle)
          .replace('{{DESCRIPTION}}', this.defaultDescription)
          .replace('{{IMAGE}}', this.defaultImg)
          .replace('{{WEIBOKEY}}', this.weiboKey)
        window.open(url)
      },
      qrcode(text, id, img) {
        if (this.showWechatQrcode) {
          this.showWechatQrcode = false
          return
        }
        if (img === undefined) {
          img = ''
        }
        if (qrcode) {
          document.getElementById(id).innerHTML = ''
          qrcode = new QRCode(id, {
            width: this.wechatQrcodeSize,
            height: this.wechatQrcodeSize,
            text: text, // 二维码内容
            image: img,
            correctLevel: QRCode.CorrectLevel.L
          })
        } else {
          document.getElementById(id).innerHTML = ''
          qrcode = new QRCode(id, {
            width: this.wechatQrcodeSize,
            height: this.wechatQrcodeSize,
            text: text, // 二维码内容
            image: img,
            correctLevel: QRCode.CorrectLevel.L
            //容错级别，可设置为：(低到高)
            // QRCode.CorrectLevel.L
            // QRCode.CorrectLevel.M
            // QRCode.CorrectLevel.Q
            // QRCode.CorrectLevel.H
            // render: 'canvas' // 设置渲染方式（有两种方式 table和canvas，默认是canvas）
            // background: '#f0f'
            // foreground: '#ff0'
          })
        }
        this.showWechatQrcode = true
      },
      getMetaContentByName(name) {
        return (document.getElementsByName(name)[0] || 0).content
      },
      // 点击其他新闻的新闻时调用
      getOtherActivity(id) {
        this.activityId = id
        this.getActivityDetail()
        this.urlIndex = window.location.href.indexOf('activityDetail')
        this.url = window.location.href.substring(0, parseInt(this.urlIndex) + 14)
        this.url = this.url + '?id=' + this.activityId + '&select=' + this.year
        this.wechatCheck = false
        this.showWechatQrcode = false
      },
      // 点击上一篇新闻时调用
      getLastActivity(id) {
        this.activityId = id
        this.getActivityDetail()
        this.urlIndex = window.location.href.indexOf('activityDetail')
        this.url = window.location.href.substring(0, parseInt(this.urlIndex) + 14)
        this.url = this.url + '?id=' + this.activityId + '&select=' + this.year
        this.wechatCheck = false
        this.showWechatQrcode = false
      },
      // 点击下一篇新闻时调用
      getNextActivity(id) {
        this.activityId = id
        this.getActivityDetail()
        this.urlIndex = window.location.href.indexOf('activityDetail')
        this.url = window.location.href.substring(0, parseInt(this.urlIndex) + 14)
        this.url = this.url + '?id=' + this.activityId + '&select=' + this.year
        this.wechatCheck = false
        this.showWechatQrcode = false
      },
      // 获取新闻详情数据+上下篇+其他新闻
      getActivityDetail() {
        this.lastActivity = {}
        this.nextActivity = {}
        this.activityList = []
        this.lastFlag = false
        this.nextFlag = false
        this.listLoading = true
        apiGetNews(this.activityId).then((res) => {
          this.activity = res
          const year = this.activity.publishDt.substring(0, 4)
          const month = this.activity.publishDt.substring(5, 7)
          const day = this.activity.publishDt.substring(8, 10)
          this.activity.publishDt = year + '年' + month + '月' + day + '日'
          this.defaultTitle = this.activity.title
        })
        apiGetNewsList(this.activityCriteria).then((res) => {
          this.activityList = res.content
          for (let i = 0; i < this.activityList.length; i++) {
            if (this.activityId === this.activityList[i].id) {
              if (i === 0) {
                this.lastFlag = true
              } else if (i !== 0) {
                this.lastActivity = this.activityList[i - 1]
              }
              if (i === this.activityList.length - 1) {
                this.nextFlag = true
              } else if (i !== this.activityList.length - 1) {
                this.nextActivity = this.activityList[i + 1]
              }
              // 获取其他新闻
              // 从当前新闻的下下篇开始，取3篇
              for (let j = i + 2, k = 0; k < 3; j++, k++) {
                // 如果已经为当前页的最后的篇数时，则从该页数据的第一篇获取
                if (j >= this.activityList.length) {
                  j = 0
                }
                this.otherActivity[k] = this.activityList[j]
                const year = this.otherActivity[k].publishDt.substring(0, 4)
                const month = this.otherActivity[k].publishDt.substring(5, 7)
                const day = this.otherActivity[k].publishDt.substring(8, 10)
                this.otherActivity[k].publishDt = year + '-' + month + '-' + day
                if (j === this.activityList.length) {
                  j = 0
                }
              }
              break
            }
          }
        })
        this.listLoading = false
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  /*分享样式*/
  .share-container {
    &-line {
      &-item {
        cursor: pointer;
        margin-top: 30px;
        height: 50px;
        background: #FFFFFF;
        border-radius: 24px;
        border: 1px solid #E7E7EC;
        color: #3B3F47;

        &-check {
          margin-top: 30px;
          height: 50px;
          background: #3281E4;
          border-radius: 24px;
          border: 1px solid #E7E7EC;
          color: #FFFFFF;
        }
      }

      .box {
        width: 101px;
        height: 48px;
        margin: 0 auto;
        position: relative;

        &-img {
          img {
            height: 30px;
            width: 30px;
          }

          display: inline-block;
          position: absolute;
          top: 50%;
          margin-top: -15px;
        }

        &-title {
          display: inline-block;
          font-size: 13px;
          font-weight: 400;
          position: absolute;
          top: 50%;
          margin-top: -7px;
          margin-left: 36px;
        }
      }
    }

    .wechat-qrcode {
      background-color: #FFFFFF;
      padding: 5px;
      border: 1px solid #000;
      box-shadow: 2px 2px 2px #000, 2px -2px 2px #000, -2px 2px 2px #000, -2px -2px 2px #000;

      &-title {
        font-size: 14px;
      }

      /*规定段落中的文本不进行换行*/
      &-heelper {
        white-space: pre-wrap;
      }
    }
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

    /*主体样式*/
    &-body {
      padding: 80px 8% 150px 8%;

      &-left-title {
        font-size: 36px;
        font-family: PingFangSC-Regular, sans-serif;
        font-weight: 400;
        color: #3B3F47;
      }

      &-left-source {
        margin-bottom: 30px;
        margin-top: 30px;
        display: inline-block;
        font-family: PingFangSC-Regular, sans-serif;
        color: #3B3F47;
        font-size: 15px;
        padding-right: 12px;
        border-right: 1px solid #888888;
      }

      &-left-dateTime {
        margin-bottom: 20px;
        margin-top: 30px;
        /*margin-left: 11px;*/
        display: inline-block;
        font-family: PingFangSC-Regular, sans-serif;
        color: #888888;
        font-size: 15px;
      }

      &-left-imageSource {
        margin-bottom: 60px;
        margin-top: 30px;
        margin-left: 6px;
        display: inline-block;
        color: #888888;
        font-size: 15px;
        font-family: PingFangSC-Regular, sans-serif;
      }

      &-left-image {
        margin-bottom: 40px;
      }

      &-left-content {
        margin-bottom: 70px;
        font-size: 15px;
        font-family: PingFangSC-Regular, sans-serif;
        font-weight: 400;
        color: #383F47;
        line-height: 21px;

        &-word {
          line-height: 30px;
        }
      }

      &-newsDisabled {
        height: 200px;
        background: #FFFFFF;
        border: 1px solid #f2f2f2;
        padding: 25px 48px 55px 30px;
        border-radius: 6px;

        &-word {
          font-size: 14px;
          font-family: PingFangSC-Semibold, sans-serif;
          font-weight: 600;
          color: #3B3F47;
        }
        &-line {
          margin-top: 15px;
          width: 34px;
          height: 2px;
          background: #3281E4;
        }

        &-content {
          margin-top: 25px;
          font-size: 16px;
          font-weight: 400;
          color: #888888;
        }
      }

      &-news {
        height: 200px;
        background: #FFFFFF;
        border: 1px solid #f2f2f2;
        padding: 25px 48px 55px 30px;
        border-radius: 6px;

        &-word {
          font-size: 14px;
          font-family: PingFangSC-Semibold, sans-serif;
          font-weight: 600;
          color: #3B3F47;
        }

        &-line {
          margin-top: 15px;
          width: 34px;
          height: 2px;
          background: #3281E4;
        }

        &-title {
          margin-top: 25px;
          font-size: 16px;
          font-family: PingFangSC-Regular, sans-serif;
          font-weight: 400;
          color: #3B3F47;
          overflow: hidden;
          text-overflow: ellipsis;
          display: -webkit-box;
          -webkit-line-clamp: 2; // 控制多行的行数
          /*! autoprefixer: off */
          -webkit-box-orient: vertical;
          /* autoprefixer: on */
          word-break: break-all;
        }

        &-content {
          margin-top: 25px;
          font-size: 16px;
          font-weight: 400;
          color: #888888;
        }

        &-source {
          font-family: PingFangSC-Regular, sans-serif;
          font-size: 12px;
          color: #3B3F47;
          margin-top: 20px;
          display: inline-block;
          padding-right: 10px;
          border-right: 1px solid #888888;
        }

        &-dateTime {
          display: inline-block;
          font-family: PingFangSC-Regular, sans-serif;
          font-size: 12px;
          /*padding-left: 7px;*/
          color: #888888;
          margin-top: 20px;
        }
      }

      &-news:hover {
        border-top: 3px solid #3281E4;
        cursor: pointer;
        box-shadow: 0 2px 16px 0 rgba(50, 129, 228, 0.2);
        border-radius: 6px 6px 0 0;
      }

      &-news:hover .container-body-news-title {
        color: #277AE3;
        font-weight: bolder;
      }

      &-right {
        padding: 25px 40px 15px 30px;
        background: #FFFFFF;
        border: 1px solid #f2f2f2;
        border-top: 3px solid #3281E4;
        box-shadow: 0 2px 8px 0 rgba(50, 129, 228, 0.2);
        border-radius: 6px 6px 0 0;

        &-word {
          font-size: 14px;
          font-family: PingFangSC-Regular, sans-serif;
          font-weight: 400;
          color: #3B3F47;
        }

        &-line {
          margin-top: 15px;
          width: 34px;
          height: 2px;
          background: #3281E4;
        }

        &-lastContent {
          padding: 30px 0;
        }

        &-lastContent:hover {
          cursor: pointer;
        }

        &-content {
          padding: 30px 0;
          border-bottom: 1px solid #EEEFF3;

          &-title {
            font-size: 16px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #3B3F47;
            overflow: hidden;
            text-overflow: ellipsis;
            display: -webkit-box;
            -webkit-line-clamp: 2; // 控制多行的行数
            /*! autoprefixer: off */
            -webkit-box-orient: vertical;
            /* autoprefixer: on */
          }

          &-titleCheck {
            font-size: 16px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 600;
            color: #3281E4;
            overflow: hidden;
            text-overflow: ellipsis;
            display: -webkit-box;
            -webkit-line-clamp: 2; // 控制多行的行数
            /*! autoprefixer: off */
            -webkit-box-orient: vertical;
            /* autoprefixer: on */
            word-break: break-all;
          }

          &-source {
            font-family: PingFangSC-Regular, sans-serif;
            font-size: 12px;
            margin-top: 20px;
            padding-right: 10px;
            border-right: 1px solid #888888;
            display: inline-block;
            color: #3B3F47;
          }

          &-dateTime {
            margin-top: 20px;
            font-family: PingFangSC-Regular, sans-serif;
            font-size: 12px;
            color: #888888;
            display: inline-block;
            /*padding-left: 8px;*/
          }
        }

        &-content:hover {
          cursor: pointer;
        }
      }

      &-share {
        cursor: pointer;
      }

      &-shareWeixin-check {
        margin-top: 30px;
        height: 50px;
        background: #3281E4;
        border-radius: 24px;
        border: 1px solid #E7E7EC;

        &-box {
          width: 101px;
          height: 48px;
          margin: 0 auto;
          position: relative;

          &-img {
            height: 30px;
            width: 30px;
            display: inline-block;
            position: absolute;
            top: 50%;
            margin-top: -15px;
          }

          &-word {
            font-size: 13px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #FFFFFF;
            position: absolute;
            top: 50%;
            margin-top: -7px;
            margin-left: 36px;
          }
        }
      }

      &-shareWeixin {
        margin-top: 30px;
        height: 50px;
        background: #FFFFFF;
        border-radius: 24px;
        border: 1px solid #E7E7EC;

        &-box {
          width: 101px;
          height: 48px;
          margin: 0 auto;
          position: relative;

          &-img {
            height: 30px;
            width: 30px;
            display: inline-block;
            position: absolute;
            top: 50%;
            margin-top: -15px;
          }

          &-word {
            font-size: 13px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #3B3F47;
            position: absolute;
            top: 50%;
            margin-top: -7px;
            margin-left: 36px;
          }
        }
      }

      &-shareWeibo {
        margin-top: 30px;
        height: 50px;
        background: #FFFFFF;
        border-radius: 24px;
        border: 1px solid #E7E7EC;

        &-box {
          width: 101px;
          height: 48px;
          margin: 0 auto;
          position: relative;

          &-img {
            height: 30px;
            width: 30px;
            display: inline-block;
            position: absolute;
            top: 50%;
            margin-top: -15px;
          }

          &-word {
            font-size: 13px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #3B3F47;
            position: absolute;
            top: 50%;
            margin-top: -7px;
            margin-left: 36px;
          }
        }
      }

      &-shareWeibo-check {
        margin-top: 30px;
        height: 50px;
        background: #3281E4;
        border-radius: 24px;
        border: 1px solid #E7E7EC;

        &-box {
          width: 101px;
          height: 48px;
          margin: 0 auto;
          position: relative;

          &-img {
            height: 30px;
            width: 30px;
            display: inline-block;
            position: absolute;
            top: 50%;
            margin-top: -15px;
          }

          &-word {
            font-size: 13px;
            font-family: PingFangSC-Regular, sans-serif;
            font-weight: 400;
            color: #FFFFFF;
            position: absolute;
            top: 50%;
            margin-top: -7px;
            margin-left: 36px;
          }
        }
      }
    }

  }

  .container-body-left-content-word > > > img {
    width: 100%;
  }
</style>
