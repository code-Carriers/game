<template>
  <div class="container">
    <!--导航栏模块-->
    <Header :active-index="activeIndex"></Header>

    <!--横幅banner模块-->
    <div class="container-banner">
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-title animate__animated animate__bounceInDown">新闻详情</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-content animate__animated animate__bounceInDown">NEWS DETAILS</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
    </div>

    <!--新闻详情主体模块-->
    <div class="container-body">
      <el-row>
        <el-col :span="16">
          <!--新闻详情标题-->
          <div class="container-body-left-title">
            {{news.title}}
          </div>
          <!--新闻详情来源-->
          <!--<div class="container-body-left-source">{{news.publishBy}}</div>-->
          <!--新闻详情时间-->
          <div class="container-body-left-dateTime">{{news.publishDt}}</div>
          <!--<div class="container-body-left-imageSource">图来自于{{news.publishBy}}</div>-->
          <!--<div class="container-body-left-image" v-if="news.titleImage!==''">-->
          <!--<img :src="'data:image/png;base64,'+news.titleImage" alt="" style="width: 100%; height: 400px;"/>-->
          <!--</div>-->
          <!--新闻详情内容-->
          <div class="container-body-left-content">
            <p class="container-body-left-content-word" style="font-family: 微软雅黑,sans-serif!important;font-size: 15px"
               v-html="news.content"></p>
          </div>

          <el-row :gutter="50" v-if="flagtext===false">
            <!--上一篇新闻内容-->
            <div v-if="lastFlag===false">
              <el-col :span="12">
                <div class="container-body-news" @click="getLastNews(lastNews.id)">
                  <div class="container-body-news-word">上一篇</div>
                  <div class="container-body-news-line"></div>
                  <div class="container-body-news-title">{{lastNews.title}}</div>
                  <!--<div class="container-body-news-source">{{lastNews.publishBy}}</div>-->
                  <div class="container-body-news-dateTime">{{lastNews.publishDt}}</div>
                </div>
              </el-col>
            </div>
            <!--若当前新闻为第一篇时-->
            <div v-if="lastFlag===true">
              <el-col :span="12">
                <div class="container-body-newsDisabled">
                  <div class="container-body-newsDisabled-word">上一篇</div>
                  <div class="container-body-newsDisabled-line"></div>
                  <div class="container-body-newsDisabled-content" v-if="lastFlag===true">上一篇内容为空</div>
                </div>
              </el-col>
            </div>

            <!--下一篇新闻内容-->
            <div v-if="nextFlag===false">
              <el-col :span="12">

                <div class="container-body-news" @click="getNextNews(nextNews.id)">
                  <div class="container-body-news-word">下一篇</div>
                  <div class="container-body-news-line"></div>
                  <div class="container-body-news-title">{{nextNews.title}}</div>
                  <!--<div class="container-body-news-source">{{nextNews.publishBy}}</div>-->
                  <div class="container-body-news-dateTime">{{nextNews.publishDt}}</div>
                </div>
              </el-col>
            </div>

            <!--若当前新闻为最后一篇时-->
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
        <!--其他新闻模块-->
        <el-col :span="6" style="float: right" v-if="flagtext===false">
          <div class="container-body-right">
            <div class="container-body-right-word1">其他新闻</div>
            <div class="container-body-right-line"></div>
            <div v-for="(item,index) in otherNews"
                 :class="index===2?'container-body-right-lastContent':'container-body-right-content'"
                 @mousemove="hoverIndex=index" @mouseout="hoverIndex=-1" @click="getOtherNews(item.id)">
              <div :title="item.title"
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
  import Header from '@/views/public/header/header' //引入页头组件
  import Footer from '@/views/public/footer/footer' //引入页尾组件
  import {apiGetNews, apiGetNewsList} from '@/api/news'

  let qrcode = ''
  export default {
    name: 'news-detail',
    components: {Footer, Header},
    data() {
      return {
        flagtext: false,
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
        activeIndex: '4',//当前页面为新闻详情页面，页头导航栏显示新闻动态高亮
        newsId: '',      //链接传来的新闻ID值
        listLoading: false,//是否开启加载
        hoverIndex: '-1',//用于辨识鼠标经过哪一条新闻
        otherNews: [],//存储其他新闻列表
        lastNews: {},//上一页新闻对象
        nextNews: {},//下一页新闻对象
        newsList: [],//新闻列表数据
        newsLastList: [],//上一页新闻列表数据
        newsNextList: [],//下一页新闻列表数据
        lastFlag: false,//用于判断是否已经是第一篇新闻
        nextFlag: false,//用于判断是否已经是最后一篇新闻
        lastPageFlag: false,
        nextPageFlag: false,
        news: {},//当前新闻详情内容
        data: {totalElements: 0, totalPages: 0},//总记录数和总页数
        newsCriteria: {//请求新闻后台数据参数
          type: 'list',
          web: 'PENAVICOSZ',
          language: '中文',
          catalog: '',
          keyword: '',
          page: 0,//当前页
          size: 0//每页显示记录条数
        },
        newsLastCriteria: {},//查询上一篇新闻时用到的上一页的请求参数
        newsNextCriteria: {} //查询下一篇新闻时用到的下一页的请求参数
      }
    },
    destroyed() {
      qrcode = null
    },
    created() {
      this.newsId = this.$route.query.id         //把链接上的新闻Id赋值给当前页
      this.newsCriteria.catalog = this.$route.query.catalog//把链接上的分类赋值给当前页
      if (this.$route.query.catalog === '%E5%85%AC%E5%8F%B8%E6%96%B0%E9%97%BB') {
        this.newsCriteria.catalog = '公司新闻'
      } else if (this.$route.query.catalog === '%E5%85%AC%E5%8F%B8%E5%85%AC%E5%91%8A') {
        this.newsCriteria.catalog = '公司公告'
      } else if (this.$route.query.catalog === '%E8%A1%8C%E4%B8%9A%E5%8A%A8%E6%80%81') {
        this.newsCriteria.catalog = '行业动态'
      }
      this.newsCriteria.page = this.$route.query.page//把链接上的页数赋值给当前页
      this.newsCriteria.page = parseInt(this.newsCriteria.page)//需要把字符型转换为整型
      this.newsCriteria.size = this.$route.query.size//把链接上的显示多少条记录数赋值给当前页
      this.newsCriteria.size = parseInt(this.newsCriteria.size)//需要把字符型转换为整型
      this.data.totalElements = this.$route.query.totalElements//把链接上的总记录数赋值给当前页
      this.data.totalPages = this.$route.query.totalPages//把链接上的总页数赋值给当前页
      if (this.$route.query.type === 'hp') {
        this.typeFlag = true
        this.newsCriteria.type = 'hp'
      } else if (this.$route.query.type === undefined) {
        this.typeFlag = false
      }
      if (this.newsCriteria.page === 0 && parseInt(this.data.totalElements) === 1) {
        this.flagtext = true
      }
      this.getNewsDetail()//请求新闻详情数据
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
        this.showWechatQrcode = false
        this.wechatCheck = false
        this.weiboCheck = false
        if (this.typeFlag === true) {
          this.urlIndex = window.location.href.indexOf('newsDetail')
          this.url = window.location.href.substring(0, parseInt(this.urlIndex) + 10)
          this.newsCriteria.catalog = encodeURIComponent(this.newsCriteria.catalog)
          this.url = this.url + '?id=' + this.newsId + '&page=' + this.newsCriteria.page + '&size=' + this.newsCriteria.size + '&catalog=' + this.newsCriteria.catalog + '&totalElements=' + this.data.totalElements + '&totalPages=' + this.data.totalPages + '&type=' + this.newsCriteria.type
        } else {
          this.urlIndex = window.location.href.indexOf('newsDetail')
          this.url = window.location.href.substring(0, parseInt(this.urlIndex) + 10)
          this.newsCriteria.catalog = encodeURIComponent(this.newsCriteria.catalog)
          this.url = this.url + '?id=' + this.newsId + '&page=' + this.newsCriteria.page + '&size=' + this.newsCriteria.size + '&catalog=' + this.newsCriteria.catalog + '&totalElements=' + this.data.totalElements + '&totalPages=' + this.data.totalPages
        }
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
      getOtherNews(id) {
        this.newsId = id
        if (this.typeFlag === true) {
          this.urlIndex = window.location.href.indexOf('newsDetail')
          this.url = window.location.href.substring(0, parseInt(this.urlIndex) + 10)
          if (this.newsCriteria.catalog === '%E5%85%AC%E5%8F%B8%E6%96%B0%E9%97%BB') {
            this.newsCriteria.catalog = '公司新闻'
          } else if (this.newsCriteria.catalog === '%E5%85%AC%E5%8F%B8%E5%85%AC%E5%91%8A') {
            this.newsCriteria.catalog = '公司公告'
          } else if (this.newsCriteria.catalog === '%E8%A1%8C%E4%B8%9A%E5%8A%A8%E6%80%81') {
            this.newsCriteria.catalog = '行业动态'
          }
          this.url = this.url + '?id=' + this.newsId + '&page=' + this.newsCriteria.page + '&size=' + this.newsCriteria.size + '&catalog=' + this.newsCriteria.catalog + '&totalElements=' + this.data.totalElements + '&totalPages=' + this.data.totalPages + '&type=' + this.newsCriteria.type
        } else {
          this.urlIndex = window.location.href.indexOf('newsDetail')
          this.url = window.location.href.substring(0, parseInt(this.urlIndex) + 10)
          if (this.newsCriteria.catalog === '%E5%85%AC%E5%8F%B8%E6%96%B0%E9%97%BB') {
            this.newsCriteria.catalog = '公司新闻'
          } else if (this.newsCriteria.catalog === '%E5%85%AC%E5%8F%B8%E5%85%AC%E5%91%8A') {
            this.newsCriteria.catalog = '公司公告'
          } else if (this.newsCriteria.catalog === '%E8%A1%8C%E4%B8%9A%E5%8A%A8%E6%80%81') {
            this.newsCriteria.catalog = '行业动态'
          }
          this.url = this.url + '?id=' + this.newsId + '&page=' + this.newsCriteria.page + '&size=' + this.newsCriteria.size + '&catalog=' + this.newsCriteria.catalog + '&totalElements=' + this.data.totalElements + '&totalPages=' + this.data.totalPages
        }
        this.getNewsDetail()
        this.wechatCheck = false
        this.showWechatQrcode = false
        window.scrollTo(0, 0)//跳转到顶部
      },
      //点击上一篇新闻时调用
      getLastNews(id) {
        this.newsId = id
        if (this.lastPageFlag === true) {
          this.newsCriteria.page = this.newsCriteria.page - 1
        }
        if (this.typeFlag === true) {
          this.urlIndex = window.location.href.indexOf('newsDetail')
          this.url = window.location.href.substring(0, parseInt(this.urlIndex) + 10)
          if (this.newsCriteria.catalog === '%E5%85%AC%E5%8F%B8%E6%96%B0%E9%97%BB') {
            this.newsCriteria.catalog = '公司新闻'
          } else if (this.newsCriteria.catalog === '%E5%85%AC%E5%8F%B8%E5%85%AC%E5%91%8A') {
            this.newsCriteria.catalog = '公司公告'
          } else if (this.newsCriteria.catalog === '%E8%A1%8C%E4%B8%9A%E5%8A%A8%E6%80%81') {
            this.newsCriteria.catalog = '行业动态'
          }
          this.url = this.url + '?id=' + this.newsId + '&page=' + this.newsCriteria.page + '&size=' + this.newsCriteria.size + '&catalog=' + this.newsCriteria.catalog + '&totalElements=' + this.data.totalElements + '&totalPages=' + this.data.totalPages + '&type=' + this.newsCriteria.type
        } else {
          this.urlIndex = window.location.href.indexOf('newsDetail')
          this.url = window.location.href.substring(0, parseInt(this.urlIndex) + 10)
          if (this.newsCriteria.catalog === '%E5%85%AC%E5%8F%B8%E6%96%B0%E9%97%BB') {
            this.newsCriteria.catalog = '公司新闻'
          } else if (this.newsCriteria.catalog === '%E5%85%AC%E5%8F%B8%E5%85%AC%E5%91%8A') {
            this.newsCriteria.catalog = '公司公告'
          } else if (this.newsCriteria.catalog === '%E8%A1%8C%E4%B8%9A%E5%8A%A8%E6%80%81') {
            this.newsCriteria.catalog = '行业动态'
          }
          this.url = this.url + '?id=' + this.newsId + '&page=' + this.newsCriteria.page + '&size=' + this.newsCriteria.size + '&catalog=' + this.newsCriteria.catalog + '&totalElements=' + this.data.totalElements + '&totalPages=' + this.data.totalPages
        }
        this.getNewsDetail()
        this.wechatCheck = false
        this.showWechatQrcode = false
        window.scrollTo(0, 0)//跳转到顶部
      },
      //点击下一篇新闻时调用
      getNextNews(id) {
        this.newsId = id
        if (this.nextPageFlag === true) {
          this.newsCriteria.page = this.newsCriteria.page + 1
        }
        if (this.typeFlag === true) {
          this.urlIndex = window.location.href.indexOf('newsDetail')
          this.url = window.location.href.substring(0, parseInt(this.urlIndex) + 10)
          if (this.newsCriteria.catalog === '%E5%85%AC%E5%8F%B8%E6%96%B0%E9%97%BB') {
            this.newsCriteria.catalog = '公司新闻'
          } else if (this.newsCriteria.catalog === '%E5%85%AC%E5%8F%B8%E5%85%AC%E5%91%8A') {
            this.newsCriteria.catalog = '公司公告'
          } else if (this.newsCriteria.catalog === '%E8%A1%8C%E4%B8%9A%E5%8A%A8%E6%80%81') {
            this.newsCriteria.catalog = '行业动态'
          }
          this.url = this.url + '?id=' + this.newsId + '&page=' + this.newsCriteria.page + '&size=' + this.newsCriteria.size + '&catalog=' + this.newsCriteria.catalog + '&totalElements=' + this.data.totalElements + '&totalPages=' + this.data.totalPages + '&type=' + this.newsCriteria.type
        } else {
          this.urlIndex = window.location.href.indexOf('newsDetail')
          this.url = window.location.href.substring(0, parseInt(this.urlIndex) + 10)
          if (this.newsCriteria.catalog === '%E5%85%AC%E5%8F%B8%E6%96%B0%E9%97%BB') {
            this.newsCriteria.catalog = '公司新闻'
          } else if (this.newsCriteria.catalog === '%E5%85%AC%E5%8F%B8%E5%85%AC%E5%91%8A') {
            this.newsCriteria.catalog = '公司公告'
          } else if (this.newsCriteria.catalog === '%E8%A1%8C%E4%B8%9A%E5%8A%A8%E6%80%81') {
            this.newsCriteria.catalog = '行业动态'
          }
          this.url = this.url + '?id=' + this.newsId + '&page=' + this.newsCriteria.page + '&size=' + this.newsCriteria.size + '&catalog=' + this.newsCriteria.catalog + '&totalElements=' + this.data.totalElements + '&totalPages=' + this.data.totalPages
        }
        this.getNewsDetail()
        this.wechatCheck = false
        this.showWechatQrcode = false
        window.scrollTo(0, 0) //跳转到顶部
      },
      // 获取新闻详情数据+上下篇+其他新闻
      getNewsDetail() {
        this.lastNews = {}
        this.nextNews = {}
        this.newsList = []
        this.lastFlag = false
        this.nextFlag = false
        this.lastPageFlag = false
        this.nextPageFlag = false
        this.newsLastCriteria = JSON.parse(JSON.stringify(this.newsCriteria))
        this.newsNextCriteria = JSON.parse(JSON.stringify(this.newsCriteria))
        this.listLoading = true
        apiGetNews(this.newsId).then((res) => {
          this.news = res
          this.defaultTitle = this.news.title
          const year = this.news.publishDt.substring(0, 4)
          const month = this.news.publishDt.substring(5, 7)
          const day = this.news.publishDt.substring(8, 10)
          this.news.publishDt = year + '年' + month + '月' + day + '日'
        })
        apiGetNewsList(this.newsCriteria).then((res) => {
          this.newsList = res.content
          for (let i = 0; i < this.newsList.length; i++) {
            if (this.newsId === this.newsList[i].id) {
              if (i === 0) {
                if (this.newsCriteria.page === 0) {
                  this.lastFlag = true
                } else {
                  this.newsLastCriteria.page = this.newsCriteria.page - 1
                  this.lastPageFlag = true
                  apiGetNewsList(this.newsLastCriteria).then((res) => {
                    this.newsLastList = res.content
                    this.lastNews = this.newsLastList[this.newsLastList.length - 1]
                    const year = this.lastNews.publishDt.substring(0, 4)
                    const month = this.lastNews.publishDt.substring(5, 7)
                    const day = this.lastNews.publishDt.substring(8, 10)
                    this.lastNews.publishDt = year + '-' + month + '-' + day
                  })
                }
              } else if (i !== 0) {
                this.lastNews = this.newsList[i - 1]
                const year = this.lastNews.publishDt.substring(0, 4)
                const month = this.lastNews.publishDt.substring(5, 7)
                const day = this.lastNews.publishDt.substring(8, 10)
                this.lastNews.publishDt = year + '-' + month + '-' + day
              }
              if (i === this.newsList.length - 1) {
                if (this.newsCriteria.page === parseInt(this.data.totalPages) - 1) {
                  this.nextFlag = true
                } else if (this.newsCriteria.page !== parseInt(this.data.totalPages) - 1) {
                  this.newsNextCriteria.page = this.newsCriteria.page + 1
                  this.nextPageFlag = true
                  apiGetNewsList(this.newsNextCriteria).then((res) => {
                    this.newsNextList = res.content
                    this.nextNews = this.newsNextList[0]
                    const year = this.nextNews.publishDt.substring(0, 4)
                    const month = this.nextNews.publishDt.substring(5, 7)
                    const day = this.nextNews.publishDt.substring(8, 10)
                    this.nextNews.publishDt = year + '-' + month + '-' + day
                  })
                }
              } else {
                this.nextNews = this.newsList[i + 1]
                const year = this.nextNews.publishDt.substring(0, 4)
                const month = this.nextNews.publishDt.substring(5, 7)
                const day = this.nextNews.publishDt.substring(8, 10)
                this.nextNews.publishDt = year + '-' + month + '-' + day
              }
              // 获取其他新闻
              // 从当前新闻的下下篇开始，取3篇
              for (let j = i + 2, k = 0; k < 3; j++, k++) {
                // 如果已经为当前页的最后的篇数时，则从该页数据的第一篇获取
                if (j >= this.newsList.length) {
                  j = 0
                }
                this.otherNews[k] = this.newsList[j]
                const year = this.otherNews[k].publishDt.substring(0, 4)
                const month = this.otherNews[k].publishDt.substring(5, 7)
                const day = this.otherNews[k].publishDt.substring(8, 10)
                this.otherNews[k].publishDt = year + '-' + month + '-' + day
                if (j === this.newsList.length) {
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
      background-size: 100% auto;
      height: 0;
      padding-top: 18.75%;
      background-image: url("../../../assets/front/images/newsTendency/newsTendency-banner-new.png");

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
        font-family: 微软雅黑, sans-serif;
        font-weight: 600;
        color: #000000;
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
        font-family: 微软雅黑, sans-serif;
        color: #000000;
        font-size: 15px;
        font-weight: 600;
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
        width: 100%;
        margin-bottom: 70px;
        font-size: 15px;
        font-family: PingFangSC-Regular, sans-serif;
        font-weight: 400;
        color: #383F47;
        line-height: 21px;

        &-word {
          color: #000000;
          line-height: 30px;
          font-family: 微软雅黑, sans-serif !important;
          font-size: 18px;
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

        &-word1 {
          font-size: 14px;
          font-family: PingFangSC-Regular, sans-serif;
          font-weight: 600;
          color: #3B3F47;
        }

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
    max-width: 100%;
  }

  .container-body-left-content-word > > > span {
    font-size: 18px !important;
    font-family: 微软雅黑, sans-serif !important;
    color: #000000 !important;
    line-height: 30px !important;
  }

  .container-body-left-content-word > > > p {
    font-size: 18px !important;
    font-family: 微软雅黑, sans-serif !important;
    color: #000000 !important;
    line-height: 30px !important;
  }

  .container-body-left-content-word > > > div {
    font-size: 18px !important;
    font-family: 微软雅黑, sans-serif !important;
    color: #000000 !important;
    line-height: 30px !important;
  }
  .container-body-left-content-word >>> table {
    table-layout: fixed;
  }

</style>
