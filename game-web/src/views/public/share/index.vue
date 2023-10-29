<template>
  <div class="share-container">
    <el-row  class="share-container-line">
      <el-col :span="11" :class="wechatCheck===true?'share-container-line-item-check':'share-container-line-item'"
              @click.native="wechatShare($event)">
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
      <el-col :span="11" :class="weiboCheck===true?'share-container-line-item-check':'share-container-line-item'"
              @click.native="weiboShare">
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
      <div class="wechat-qrcode-content" id="wechat-qrcode-content" :style="{width:wechatQrcodeSize + 'px'}"></div>
      <div class="wechat-qrcode-helper" :style="{width:wechatQrcodeSize + 'px',textAlign: 'center'}">
        {{wechatQrcodeHelper}}
      </div>
    </div>
  </div>
</template>

<script>
  import QRCode from 'qrcodejs2'

  let qrcode = ''
  export default {
    name: 'share',
    data() {
      return {
        weiboCheck: false,
        runningInWeChat: /MicroMessenger/i.test(navigator.userAgent),
        isMobileScreen: document.documentElement.clientWidth <= 768,
        defaultSource: document.title,
        defaultTitle: document.title,
        defaultDescription: document.title,
        defaultImg: (document.images[0] || 0).src || '',
        // showWechatQrcode: false,
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
        }
      }
    },
    props: {
      showWechatQrcode: {
        type:Boolean,
        defeult:false
      },
      wechatCheck:{
        type: Boolean,
        default:false
      },
      url: {
        type: String,
        default: window.location.href
      },
      origin: {
        type: String,
        default: window.location.origin
      },
      source: {
        type: String,
        default: null
      },
      title: {
        type: String,
        default: null
      },
      description: {
        type: String,
        default: null
      },
      image: {
        type: String,
        default: null
      },
      imageSelector: {
        type: String,
        default: undefined
      },
      weiboKey: {
        type: String,
        default: ''
      },
      wechatQrcodeTitle: {
        type: String,
        default: '微信扫一扫：分享'
      },
      wechatQrcodeHelper: {
        type: String,
        default: '微信里点“发现”，扫一下二维码便可将本文分享至朋友圈。'
      },
      wechatQrcodeSize: {
        type: Number,
        default: 170
      },
      sites: {
        type: Array,
        default: () => ['weibo', 'qq', 'wechat', 'douban', 'qzone', 'linkedin', 'facebook', 'twitter', 'google']
      },
      mobileSites: {
        type: Array,
        default: () => []
      },
      disabled: {
        type: Array,
        default: () => []
      },
      initialized: {
        type: Boolean,
        default: false
      }
    },
    created() {
      this.init()
    },
    destroyed() {
      // qrcode.clear();
      qrcode = null
    },
    methods: {
      init() {
        this.defaultSource = this.source || this.getMetaContentByName('site') || this.getMetaContentByName('Site') || document.title
        this.defaultTitle = this.title || this.getMetaContentByName('title') || this.getMetaContentByName('Title') || document.title
        this.defaultDescription = this.description || this.getMetaContentByName('description') || this.getMetaContentByName('Description') || ''
        this.defaultImg = this.image || this.defaultImg
      },
      wechatShare(event) {
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
        sourceDom.style.top =  '100px'
        this.qrcode(this.url, 'wechat-qrcode-content')
      },
      weiboShare() {
        this.wechatCheck = false
        this.weiboCheck = false
        const url = this.templates.weibo.replace('{{URL}}', this.url)
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
          // qrcode.clear();
          // qrcode.makeCode('new content');
          qrcode = null
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
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss">
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
</style>
