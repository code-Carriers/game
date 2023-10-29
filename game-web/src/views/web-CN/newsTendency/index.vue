<template>
  <div class="container">
    <!--导航栏模块-->
    <Header :active-index="activeIndex"></Header>

    <!--横幅banner模块-->
    <div class="container-banner">
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-title animate__animated animate__bounceInDown">新闻中心</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
      <!--      <el-row>-->
      <!--        <el-col :span="24">-->
      <!--          <div class="container-banner-content animate__animated animate__bounceInDown">NEWS CENTER</div>-->
      <!--        </el-col>-->
      <!--      </el-row>-->
    </div>

    <!--新闻中心主体内容-->
    <div class="container-body">

      <!--新闻中心选择菜单栏-->
      <el-row class="container-body-box">
        <el-col :span="12" :class="selectTitle==='公司新闻'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='公司新闻'?'aClass1':'aClass2'" @click="handleSelectTitle('公司新闻')">公司新闻</div>
        </el-col>
        <!--<el-col :span="8" :class="selectTitle==='公司公告'?'container-body-box-title-check':'container-body-box-title'">-->
        <!--<div :class="selectTitle==='公司公告'?'aClass1':'aClass2'" @click="handleSelectTitle('公司公告')">公司公告</div>-->
        <!--</el-col>-->
        <el-col :span="12" :class="selectTitle==='行业动态'?'container-body-box-title-check':'container-body-box-title'">
          <div :class="selectTitle==='行业动态'?'aClass1':'aClass2'" @click="handleSelectTitle('行业动态')">行业动态</div>
        </el-col>
      </el-row>

      <!--公司新闻模块-->
      <div v-if="selectTitle==='公司新闻'">
        <!--公司新闻内容-->
        <div class="container-body-content">
          <!--公司新闻内容第一行横向显示-->
          <div class="container-body-content-newsRow1" :loading="listLoading">
            <el-row :gutter="30">
              <div v-for="item in newsRow1">
                <!--跳转到具体新闻详情页面-->
                <router-link
                  :to="'/newsDetail?id='+item.id+'&page='+newsCriteria.page+'&size='+newsCriteria.size+'&catalog='+newsCriteria.catalog+'&totalElements='+data.totalElements+'&totalPages='+data.totalPages"
                  target="_blank">
                  <el-col :span="8">
                    <div class="container-body-content-newsRow1-item">
                      <img class="container-body-content-newsRow1-item-img"
                           src="../../../assets/front/images/homepage/newPic1.png"
                           v-if="item.titleImage===''" alt=""/>
                      <img class="container-body-content-newsRow1-item-img"
                           :src="item.titleImage"
                           alt="" v-else/>
                      <!--新闻标题-->
                      <div :title="item.title" class="container-body-content-newsRow1-item-title"><span
                        :class="item.topVisible===true?'container-body-content-newsRow1-item-hotTrue':'container-body-content-newsRow1-item-hotFalse'">热点</span>{{item.title}}
                      </div>
                      <!--新闻来源-->
                      <!--<div class="container-body-content-newsRow1-item-source">{{item.publishBy}}</div>-->
                      <!-- 新闻时间-->
                      <div class="container-body-content-newsRow1-item-time">{{item.publishDt}}</div>
                    </div>
                  </el-col>
                </router-link>
              </div>
            </el-row>
          </div>
          <!--公司新闻其他行为纵向显示-->
          <div class="container-body-content-newsRow2" v-if="newsRow2.length!==0">
            <!--鼠标经过时改变样式，根据@mouseover和@mouseout用于辨识经过的是哪一条记录-->
            <div v-for="(item,index) in newsRow2"
                 :class="hoverIndex===index?'container-body-content-newsRow2-itemHover':'container-body-content-newsRow2-item'"
                 @mouseover="hoverIndex=index" @mouseout="hoverIndex=-1">
              <!--跳转到具体新闻详情页面-->
              <router-link
                :to="'/newsDetail?id='+item.id+'&page='+newsCriteria.page+'&size='+newsCriteria.size+'&catalog='+newsCriteria.catalog+'&totalElements='+data.totalElements+'&totalPages='+data.totalPages"
                target="_blank">
                <el-row :gutter="40">
                  <!--新闻内容左边的图片-->
                  <el-col :span="6">
                    <div class="container-body-content-newsRow2-imgBox">
                      <img class="container-body-content-newsRow2-imgBox-img"
                           src="../../../assets/front/images/homepage/newPic1.png"
                           v-if="item.titleImage===''" alt=""/>
                      <img class="container-body-content-newsRow2-imgBox-img" :src="item.titleImage"
                           alt=""
                           v-else/>
                    </div>
                  </el-col>
                  <!--新闻内容右边的文字内容-->
                  <el-col :span="18">
                    <div class="container-body-content-newsRow2-content">
                      <div
                        :class="hoverIndex===index?'container-body-content-newsRow2-content-titleHover':'container-body-content-newsRow2-content-title'"
                        :title="item.title">
                        <!--新闻标题-->
                        <span
                          :class="item.topVisible===true?'container-body-content-newsRow1-item-hotTrue':'container-body-content-newsRow1-item-hotFalse'">热点</span>{{item.title}}
                      </div>
<!--                      &lt;!&ndash;新闻概要&ndash;&gt;-->
<!--                      <div-->
<!--                        :class="hoverIndex===index?'container-body-content-newsRow2-content-wordHover':'container-body-content-newsRow2-content-word'"-->
<!--                        :title="item.summary">-->
<!--                        {{item.summary}}-->
<!--                      </div>-->
                      <!--新闻来源-->
                      <!--<div class="container-body-content-newsRow2-content-source">{{item.publishBy}}</div>-->
                      <!--新闻时间-->
                      <div class="container-body-content-newsRow2-content-dateTime">{{item.publishDt}}</div>
                    </div>

                  </el-col>
                </el-row>
              </router-link>
            </div>
          </div>
        </div>

        <!--分页组件-->
        <div class="container-body-pagination">
          <el-pagination
            background
            @size-change="handleSizeChange"
            @current-change="handleCurrentChange"
            :current-page="newsPage1"
            :page-sizes="[10, 20, 30, 50]"
            :page-size="newsCriteria.size"
            layout="prev, pager, next, sizes, total, jumper"
            :total="data.totalElements">
          </el-pagination>
        </div>
      </div>

      <!--公司公告模块-->
<!--      <div v-if="selectTitle==='公司公告'">-->

<!--        <div class="container-body-left" v-if="noticeFlag===true">-->
<!--          <el-row>-->
<!--            <el-col :span="16">-->
<!--              &lt;!&ndash;新闻详情标题&ndash;&gt;-->
<!--              <div class="container-body-left-title">-->
<!--                {{news.title}}-->
<!--              </div>-->
<!--              &lt;!&ndash;新闻详情来源&ndash;&gt;-->
<!--              &lt;!&ndash;<div class="container-body-left-source">{{news.publishBy}}</div>&ndash;&gt;-->
<!--              &lt;!&ndash;新闻详情时间&ndash;&gt;-->
<!--              <div class="container-body-left-dateTime">{{news.publishDt}}</div>-->
<!--              &lt;!&ndash;<div class="container-body-left-imageSource">图来自于{{news.publishBy}}</div>&ndash;&gt;-->
<!--              &lt;!&ndash;<div class="container-body-left-image" v-if="news.titleImage!==''">&ndash;&gt;-->
<!--              &lt;!&ndash;<img :src="'data:image/png;base64,'+news.titleImage" alt="" style="width: 100%; height: 400px;"/>&ndash;&gt;-->
<!--              &lt;!&ndash;</div>&ndash;&gt;-->
<!--              &lt;!&ndash;新闻详情内容&ndash;&gt;-->
<!--              <div class="container-body-left-content">-->
<!--                <p class="container-body-left-content-word"-->
<!--                   style="font-family: 微软雅黑,sans-serif!important;font-size: 15px"-->
<!--                   v-html="news.content">{{news.content}}</p>-->
<!--              </div>-->
<!--            </el-col>-->
<!--          </el-row>-->
<!--        </div>-->

<!--        &lt;!&ndash;公司公告内容&ndash;&gt;-->
<!--        <div class="container-body-content" v-if="noticeFlag===false">-->
<!--          &lt;!&ndash;公司公告内容第一行横向显示&ndash;&gt;-->
<!--          <div class="container-body-content-newsRow1" :loading="listLoading">-->
<!--            <el-row :gutter="30">-->
<!--              <div v-for="item in newsRow1">-->
<!--                &lt;!&ndash;跳转到具体公告详情页面&ndash;&gt;-->
<!--                <router-link-->
<!--                  :to="'/newsDetail?id='+item.id+'&page='+newsCriteria2.page+'&size='+newsCriteria2.size+'&catalog='+newsCriteria2.catalog+'&totalElements='+data2.totalElements+'&totalPages='+data2.totalPages"-->
<!--                  target="_blank">-->
<!--                  <el-col :span="8">-->
<!--                    <div class="container-body-content-newsRow1-item">-->
<!--                      <img class="container-body-content-newsRow1-item-img"-->
<!--                           src="../../../assets/front/images/homepage/newPic1.png"-->
<!--                           v-if="item.titleImage===''" alt=""/>-->
<!--                      <img class="container-body-content-newsRow1-item-img"-->
<!--                           :src="item.titleImage"-->
<!--                           alt="" v-else/>-->
<!--                      &lt;!&ndash;公告标题&ndash;&gt;-->
<!--                      <div class="container-body-content-newsRow1-item-title" :title="item.title"><span-->
<!--                        :class="item.topVisible===true?'container-body-content-newsRow1-item-hotTrue':'container-body-content-newsRow1-item-hotFalse'">热点</span>{{item.title}}-->
<!--                      </div>-->
<!--                      &lt;!&ndash;公告来源&ndash;&gt;-->
<!--                      &lt;!&ndash;<div class="container-body-content-newsRow1-item-source">{{item.source}}</div>&ndash;&gt;-->
<!--                      &lt;!&ndash;公告时间&ndash;&gt;-->
<!--                      <div class="container-body-content-newsRow1-item-time">{{item.publishDt}}</div>-->
<!--                    </div>-->
<!--                  </el-col>-->
<!--                </router-link>-->
<!--              </div>-->
<!--            </el-row>-->
<!--          </div>-->
<!--          &lt;!&ndash;公司公告其他行为纵向显示&ndash;&gt;-->
<!--          <div class="container-body-content-newsRow2" v-if="newsRow2.length!==0">-->
<!--            &lt;!&ndash;鼠标经过时改变样式，根据@mouseover和@mouseout用于辨识经过的是哪一条记录&ndash;&gt;-->
<!--            <div v-for="(item,index) in newsRow2"-->
<!--                 :class="hoverIndex===index?'container-body-content-newsRow2-itemHover':'container-body-content-newsRow2-item'"-->
<!--                 @mouseover="hoverIndex=index" @mouseout="hoverIndex=-1">-->
<!--              &lt;!&ndash;跳转到具体公告详情页面&ndash;&gt;-->
<!--              <router-link-->
<!--                :to="'/newsDetail?id='+item.id+'&page='+newsCriteria2.page+'&size='+newsCriteria2.size+'&catalog='+newsCriteria2.catalog+'&totalElements='+data2.totalElements+'&totalPages='+data2.totalPages"-->
<!--                target="_blank">-->
<!--                <el-row :gutter="40">-->
<!--                  &lt;!&ndash;公告内容左边的图片&ndash;&gt;-->
<!--                  <el-col :span="6">-->
<!--                    <div class="container-body-content-newsRow2-imgBox">-->
<!--                      <img class="container-body-content-newsRow2-imgBox-img"-->
<!--                           src="../../../assets/front/images/homepage/newPic1.png"-->
<!--                           v-if="item.titleImage===''" alt=""/>-->
<!--                      <img class="container-body-content-newsRow2-imgBox-img" :src="item.titleImage"-->
<!--                           alt=""-->
<!--                           v-else/>-->
<!--                    </div>-->
<!--                  </el-col>-->
<!--                  &lt;!&ndash;公告内容右边的文字内容&ndash;&gt;-->
<!--                  <el-col :span="18">-->
<!--                    <div class="container-body-content-newsRow2-content">-->
<!--                      <div-->
<!--                        :class="hoverIndex===index?'container-body-content-newsRow2-content-titleHover':'container-body-content-newsRow2-content-title'"-->
<!--                        :title="item.title">-->
<!--                        &lt;!&ndash;公告标题&ndash;&gt;-->
<!--                        <span-->
<!--                          :class="item.topVisible===true?'container-body-content-newsRow1-item-hotTrue':'container-body-content-newsRow1-item-hotFalse'">热点</span>{{item.title}}-->
<!--                      </div>-->
<!--                      &lt;!&ndash;公告概要&ndash;&gt;-->
<!--                      <div-->
<!--                        :class="hoverIndex===index?'container-body-content-newsRow2-content-wordHover':'container-body-content-newsRow2-content-word'"-->
<!--                        :title="item.summary">-->
<!--                        {{item.summary}}-->
<!--                      </div>-->
<!--                      &lt;!&ndash;公告来源&ndash;&gt;-->
<!--                      &lt;!&ndash;<div class="container-body-content-newsRow2-content-source">{{item.publishBy}}</div>&ndash;&gt;-->
<!--                      &lt;!&ndash;公告时间&ndash;&gt;-->
<!--                      <div class="container-body-content-newsRow2-content-dateTime">{{item.publishDt}}</div>-->
<!--                    </div>-->
<!--                  </el-col>-->
<!--                </el-row>-->
<!--              </router-link>-->
<!--            </div>-->
<!--          </div>-->
<!--        </div>-->

<!--        &lt;!&ndash;分页组件&ndash;&gt;-->
<!--        <div class="container-body-pagination" v-if="noticeFlag===false">-->
<!--          <el-pagination-->
<!--            background-->
<!--            @size-change="handleSizeChange2"-->
<!--            @current-change="handleCurrentChange2"-->
<!--            :current-page="newsPage2"-->
<!--            :page-sizes="[10, 20, 30, 50]"-->
<!--            :page-size="this.newsCriteria2.size"-->
<!--            layout="prev, pager, next, sizes, total, jumper"-->
<!--            :total="data2.totalElements">-->
<!--          </el-pagination>-->
<!--        </div>-->
<!--      </div>-->

      <!--行业动态模块-->
      <div v-if="selectTitle==='行业动态'">
        <!--行业动态内容-->
        <div class="container-body-content">
          <!--行业动态内容第一行横向显示-->
          <div class="container-body-content-newsRow1" v-loading="listLoading">
            <el-row :gutter="30">
              <div v-for="item in newsRow1">
                <!--跳转到具体动态详情页面-->
                <router-link
                  :to="'/newsDetail?id='+item.id+'&page='+newsCriteria3.page+'&size='+newsCriteria3.size+'&catalog='+newsCriteria3.catalog+'&totalElements='+data3.totalElements+'&totalPages='+data3.totalPages"
                  target="_blank">
                  <el-col :span="8">
                    <div class="container-body-content-newsRow1-item">
                      <img class="container-body-content-newsRow1-item-img"
                           src="../../../assets/front/images/homepage/newPic1.png"
                           v-if="item.titleImage===''" alt=""/>
                      <img class="container-body-content-newsRow1-item-img"
                           :src="item.titleImage"
                           alt="" v-else/>
                      <!--动态标题-->
                      <div class="container-body-content-newsRow1-item-title" :title="item.title"><span
                        :class="item.topVisible===true?'container-body-content-newsRow1-item-hotTrue':'container-body-content-newsRow1-item-hotFalse'">热点</span>{{item.title}}
                      </div>
                      <!--动态来源-->
                      <!--<div class="container-body-content-newsRow1-item-source">{{item.publishBy}}</div>-->
                      <!--动态时间-->
                      <div class="container-body-content-newsRow1-item-time">{{item.publishDt}}</div>
                    </div>
                  </el-col>
                </router-link>
              </div>
            </el-row>
          </div>
          <!--行业动态其他行为纵向显示-->
          <div class="container-body-content-newsRow2" v-if="newsRow2.length!==0">
            <!--鼠标经过时改变样式，根据@mouseover和@mouseout用于辨识经过的是哪一条记录-->
            <div v-for="(item,index) in newsRow2"
                 :class="hoverIndex===index?'container-body-content-newsRow2-itemHover':'container-body-content-newsRow2-item'"
                 @mouseover="hoverIndex=index" @mouseout="hoverIndex=-1">
              <!--跳转到具体动态详情页面-->
              <router-link
                :to="'/newsDetail?id='+item.id+'&page='+newsCriteria3.page+'&size='+newsCriteria3.size+'&catalog='+newsCriteria3.catalog+'&totalElements='+data3.totalElements+'&totalPages='+data3.totalPages"
                target="_blank">
                <el-row :gutter="40">
                  <!--动态内容左边的图片-->
                  <el-col :span="6">
                    <div class="container-body-content-newsRow2-imgBox">
                      <img class="container-body-content-newsRow2-imgBox-img"
                           src="../../../assets/front/images/homepage/newPic1.png"
                           v-if="item.titleImage===''" alt=""/>
                      <img class="container-body-content-newsRow2-imgBox-img" :src="item.titleImage"
                           alt=""
                           v-else/>
                    </div>
                  </el-col>
                  <!--动态内容右边的文字内容-->
                  <el-col :span="18">
                    <div class="container-body-content-newsRow2-content">
                      <div
                        :class="hoverIndex===index?'container-body-content-newsRow2-content-titleHover':'container-body-content-newsRow2-content-title'"
                        :title="item.title">
                        <!--动态标题-->
                        <span
                          :class="item.topVisible===true?'container-body-content-newsRow1-item-hotTrue':'container-body-content-newsRow1-item-hotFalse'">热点</span>{{item.title}}
                      </div>
                      <!--动态概要-->
<!--                      <div-->
<!--                        :class="hoverIndex===index?'container-body-content-newsRow2-content-wordHover':'container-body-content-newsRow2-content-word'"-->
<!--                        :title="item.summary">-->
<!--                        {{item.summary}}-->
<!--                      </div>-->
                      <!--动态来源-->
                      <!--<div class="container-body-content-newsRow2-content-source">{{item.publishBy}}</div>-->
                      <!--动态时间-->
                      <div class="container-body-content-newsRow2-content-dateTime">{{item.publishDt}}</div>
                    </div>
                  </el-col>
                </el-row>
              </router-link>
            </div>
          </div>
        </div>

        <!--分页组件-->
        <div class="container-body-pagination">
          <el-pagination
            background
            @size-change="handleSizeChange3"
            @current-change="handleCurrentChange3"
            :current-page="newsPage3"
            :page-sizes="[10, 20, 30, 50]"
            :page-size="newsCriteria3.size"
            layout="prev, pager, next, sizes, total, jumper"
            :total="data3.totalElements">
          </el-pagination>
        </div>
      </div>
    </div>

    <!--页尾模块-->
    <Footer></Footer>

  </div>
</template>

<script>
  // import newsList from '@/views/web-CN/newsTendency/newsList.json'
  import Header from '@/views/public/header/header'
  import Footer from '@/views/public/footer/footer'
  import {apiGetNewsList} from '@/api/news'

  export default {
    name: 'news-tendency',
    components: {Footer, Header},
    data() {
      return {
        defaultTitle: '',
        news: {},
        noticeFlag: false,
        urlTest: '',
        newsPage1: 1,
        newsPage2: 1,
        newsPage3: 1,
        data: {totalElements: 0, totalPages: 0},//公司新闻总记录数
        data2: {totalElements: 0, totalPages: 0},//公司公告总记录数
        data3: {totalElements: 0, totalPages: 0},//行业动态总记录数
        listLoading: false,  //是否开启加载显示动效
        totalCount: 1,//总记录数
        hoverIndex: '-1', //辨识鼠标经过的是哪一条记录
        activeIndex: '4', //当前页面是新闻动态页面
        selectTitle: '公司新闻',//默认打开新闻动态显示公司新闻模块
        newsList: [], //公司新闻数据
        newsRow1: [{  //第一行新闻数据
          id: '',
          titleImage: '',
          publishDt: '',
          publishBy: '',
          summary: '',
          title: '',
          topVisible: '',
          content: ''
        }], //公司新闻第一行数据
        newsRow2: [ //第二行新闻数据
          {
            id: '',
            titleImage: '',
            publishDt: '',
            publishBy: '',
            summary: '',
            title: '',
            topVisible: '',
            content: ''
          }], //公司新闻其他行数据
        //公司新闻参数
        newsCriteria: {
          type: 'list',
          web: 'PENAVICOSZ',
          language: '中文',
          catalog: '公司新闻',
          keyword: '',
          page: 0,//当前页
          size: 10 //初始化每页显示10条记录
        },
        //公司公告参数
        newsCriteria2: {
          type: 'list',
          web: 'PENAVICOSZ',
          language: '中文',
          catalog: '公司公告',
          keyword: '',
          page: 0,//当前页
          size: 10 //初始化每页显示10条记录
        },
        //行业动态参数
        newsCriteria3: {
          type: 'list',
          web: 'PENAVICOSZ',
          language: '中文',
          catalog: '行业动态',
          keyword: '',
          page: 0,//当前页
          size: 10 //初始化每页显示10条记录
        }
      }
    },
    created() {
      //判断是否根据#/newsTendency?selectItem=''链接来的
      if (this.$route.query.selectItem !== undefined) {
        this.selectTitle = this.$route.query.selectItem
      } else {
        this.selectTitle = '公司新闻'
      }
      // 判断是点击哪一模块
      if (this.selectTitle === '公司新闻') {
        this.getNewsData(this.newsCriteria)
      } else if (this.selectTitle === '公司公告') {
        this.getNewsData(this.newsCriteria2)
      } else if (this.selectTitle === '行业动态') {
        this.getNewsData(this.newsCriteria3)
      }
    },
    // 监听路由变化时，页面跳转
    watch: {
      '$route'(to) {
        if (to.query.selectItem !== undefined) {
          this.selectTitle = to.query.selectItem
          to.query.selectItem = undefined
          if (this.selectTitle === '公司新闻') {
            this.newsCriteria.page = 0
            this.newsCriteria.size = 10
            this.getNewsData(this.newsCriteria)
          } else if (this.selectTitle === '公司公告') {
            this.newsCriteria2.page = 0
            this.newsCriteria2.size = 10
            this.getNewsData(this.newsCriteria2)
          } else if (this.selectTitle === '行业动态') {
            this.newsCriteria3.page = 0
            this.newsCriteria3.size = 10
            this.getNewsData(this.newsCriteria3)
          }
        } else {
          this.selectTitle = '公司新闻'
        }
      }
    },
    methods: {
      goPage(url) {
        window.open(url, '_self') // 路由跳转
      },
      //获取后台数据
      getNewsData(data) {
        this.listLoading = true
        this.newsList = []
        this.newsRow1 = []
        this.newsRow2 = []
        apiGetNewsList(data).then((res) => {
          if (data === this.newsCriteria) {
            this.data = res
          } else if (data === this.newsCriteria2) {
            this.data2 = res
          } else if (data === this.newsCriteria3) {
            this.data3 = res
          }
          this.newsList = res.content
          if (this.newsList.length === 1 && data === this.newsCriteria2) {
            this.urlTest='#/newsDetail?id='+this.newsList[0].id+'&page='+this.newsCriteria2.page+'&size='+this.newsCriteria2.size+'&catalog='+this.newsCriteria2.catalog+'&totalElements='+this.data2.totalElements+'&totalPages='+this.data2.totalPages
            this.goPage(this.urlTest)
            // this.noticeFlag = true
            // apiGetNews(this.newsList[0].id).then((res) => {
            //   this.news = res
            //   this.defaultTitle = this.news.title
            //   const year = this.news.publishDt.substring(0, 4)
            //   const month = this.news.publishDt.substring(5, 7)
            //   const day = this.news.publishDt.substring(8, 10)
            //   this.news.publishDt = year + '年' + month + '月' + day + '日'
            // })
          } else {
            // this.noticeFlag = false
            // 赋值第一行数据
            for (let i = 0; i < this.newsList.length; i++) {
              this.newsRow1[i] = this.newsList[i]
              if (this.newsRow1[i].titleImage !== '') {
                this.newsRow1[i].titleImage = 'data:image/jpeg;base64,' + this.newsRow1[i].titleImage
              }
              const year = this.newsRow1[i].publishDt.substring(0, 4)
              const month = this.newsRow1[i].publishDt.substring(5, 7)
              const day = this.newsRow1[i].publishDt.substring(8, 10)
              this.newsRow1[i].publishDt = year + '-' + month + '-' + day
              if (i === 2) {
                break
              }
            }
            // 如数组长度大于3时，赋值其他行数据
            if (this.newsList.length > 3) {
              for (let j = 3, k = 0; j < this.newsList.length; j++, k++) {
                if (this.newsList[j] === null) {
                  break
                }
                this.newsRow2[k] = this.newsList[j]
                if (this.newsRow2[k].titleImage !== '') {
                  this.newsRow2[k].titleImage = 'data:image/jpeg;base64,' + this.newsRow2[k].titleImage
                }
                const year = this.newsRow2[k].publishDt.substring(0, 4)
                const month = this.newsRow2[k].publishDt.substring(5, 7)
                const day = this.newsRow2[k].publishDt.substring(8, 10)
                this.newsRow2[k].publishDt = year + '年' + month + '月' + day + '日'
              }
            }
          }
        })
        this.listLoading = false
      },
      // 公司新闻——改变每次显示几条记录数
      handleSizeChange(val) {
        this.newsCriteria.size = val
        this.getNewsData(this.newsCriteria)
        window.scrollTo(0, 0)//跳转到顶部
      },
      // 公司新闻——改变当前页数
      handleCurrentChange(val) {
        this.newsPage1 = val
        this.newsCriteria.page = val - 1
        this.getNewsData(this.newsCriteria)
        window.scrollTo(0, 0)//跳转到顶部
      },
      // 公司公告——改变每次显示几条记录数
      handleSizeChange2(val) {
        this.newsCriteria2.size = val
        this.getNewsData(this.newsCriteria2)
        window.scrollTo(0, 0)//跳转到顶部
      },
      // 公司公告——改变当前页数
      handleCurrentChange2(val) {
        this.newsPage2 = val
        this.newsCriteria2.page = val - 1
        this.getNewsData(this.newsCriteria2)
        window.scrollTo(0, 0)//跳转到顶部
      },
      // 行业动态——改变每次显示几条记录数
      handleSizeChange3(val) {
        this.newsCriteria3.size = val
        this.getNewsData(this.newsCriteria3)
        window.scrollTo(0, 0)//跳转到顶部
      },
      // 行业动态——改变当前页数
      handleCurrentChange3(val) {
        this.newsPage3 = val
        this.newsCriteria3.page = val - 1
        this.getNewsData(this.newsCriteria3)
        window.scrollTo(0, 0)//跳转到顶部
      },
      // 新闻中心选择栏
      handleSelectTitle(item) {
        this.selectTitle = item
        if (this.selectTitle === '公司新闻') {
          this.newsCriteria.page = 0
          this.newsCriteria.size = 10
          this.getNewsData(this.newsCriteria)
        } else if (this.selectTitle === '公司公告') {
          this.newsCriteria2.page = 0
          this.newsCriteria2.size = 10
          this.getNewsData(this.newsCriteria2)
        } else if (this.selectTitle === '行业动态') {
          this.newsCriteria3.page = 0
          this.newsCriteria3.size = 10
          this.getNewsData(this.newsCriteria3)
        }
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  /*当栏目选中时，鼠标经过时不显示颜色*/
  .aClass1 {
    cursor: pointer;
  }

  /*当栏目未被选中时，鼠标经过时显示颜色*/
  .aClass2:hover {
    color: #538ED9;
    cursor: pointer;
  }


  .container {
    min-width: 1300px;

    a:hover {
      color: #538ED9;
    }

    /*横幅banner样式*/
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

    /*新闻动态主体样式*/
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

      /*分页的样式*/
      &-pagination {
        text-align: center;
        margin-bottom: 80px;
      }

      &-left {
        box-shadow: -2px 4px 5px 0px #f2f2f2 inset;
        width: 100%;
        padding: 50px 8%;

        &-title {
          font-size: 36px;
          font-family: PingFangSC-Regular, sans-serif;
          font-weight: 400;
          color: #3B3F47;
        }

        &-dateTime {
          margin-bottom: 20px;
          margin-top: 30px;
          /*margin-left: 11px;*/
          display: inline-block;
          font-family: PingFangSC-Regular, sans-serif;
          color: #888888;
          font-size: 15px;
        }

        &-content {
          width: 100%;
          margin-bottom: 70px;
          font-size: 15px;
          font-family: PingFangSC-Regular, sans-serif;
          font-weight: 400;
          color: #383F47;
          line-height: 21px;

          &-word {
            line-height: 30px;
            font-family: 微软雅黑, sans-serif !important;
            font-size: 15px;
          }
        }
      }

      &-content {
        box-shadow: -2px 4px 5px 0px #f2f2f2 inset;
        width: 100%;
        padding: 50px 8%;

        /*第一行数据的样式*/
        &-newsRow1 {
          margin-bottom: 5px;

          &-item {
            width: 100%;
            height: 260px;
            position: relative;
            padding: 200px 6% 0 8%;
            margin-bottom: 20px;
            overflow: hidden;

            &-img {
              display: inline-block;
              position: absolute;
              top: 0;
              left: 0;
              z-index: -1;
              width: 100%;
              height: 260px;
              transition: all 0.7s;
            }


            &-hotTrue {
              display: inline-block;
              margin-right: 4px;
              width: 40px;
              height: 22px;
              background: #FF3D17;
              border-radius: 4px;
              font-size: 14px;
              font-family: PingFangSC-Semibold, sans-serif;
              color: #FFFFFF;
              line-height: 21px;
              text-align: center;
            }

            &-hotFalse {
              display: none;
            }

            &-title {
              width: 100%;
              display: inline-block;
              font-size: 16px;
              font-family: PingFangSC-Semibold, sans-serif;
              color: #FFFFFF;
              line-height: 22px;
              overflow: hidden; /*超出部分隐藏*/
              white-space: nowrap; /*让文本强制在一行不换行*/
              text-overflow: ellipsis; /*显示省略号来代表被修剪的文本*/
              font-weight: 600;
            }

            &-source {
              margin-top: 6px;
              border-right: 1px solid rgba(255, 255, 255, 0.6);
              padding-right: 12px;
              display: inline-block;
              font-size: 13px;
              font-family: PingFangSC-Regular, sans-serif;
              color: #FFFFFF;
            }

            &-time {
              margin-top: 6px;
              /*padding-left: 12px;*/
              display: inline-block;
              font-size: 13px;
              font-family: PingFangSC-Regular, sans-serif;
              color: #FFFFFF;
              opacity: 0.6;
            }
          }

          &-item:hover {
            cursor: pointer;
          }

          &-item:hover .container-body-content-newsRow1-item-img {
            /*opacity: 0.7;*/
            transform: scale(1.1);
          }

        }

        /*第二行数据的样式*/
        &-newsRow2 {


          &-item {
            padding: 30px 0;
          }

          &-itemHover {
            cursor: pointer;
            padding: 30px 30px 30px 30px;
            background: #FFFFFF;
            box-shadow: 0 0 20px 0 rgba(50, 129, 228, 0.2);
          }

          &-content {
            padding-top: 70px;
            padding-bottom: 30px;

            &-title {
              line-height: 25px;
              font-size: 20px;
              font-family: PingFangSC-Semibold, sans-serif;
              font-weight: 600;
              color: #3B3F47;
              overflow: hidden; /*超出部分隐藏*/
              white-space: nowrap; /*让文本强制在一行不换行*/
              text-overflow: ellipsis; /*显示省略号来代表被修剪的文本*/
            }

            &-titleHover {
              line-height: 25px;
              font-size: 20px;
              font-family: PingFangSC-Semibold, sans-serif;
              font-weight: 600;
              color: #3281E4;
              overflow: hidden; /*超出部分隐藏*/
              white-space: nowrap; /*让文本强制在一行不换行*/
              text-overflow: ellipsis; /*显示省略号来代表被修剪的文本*/
            }

            &-hotTrue {
              display: inline-block;
              margin-right: 4px;
              width: 40px;
              height: 26px;
              font-size: 14px;
              font-family: PingFangSC-Semibold, sans-serif;
              font-weight: 600;
              color: #FFFFFF;
              line-height: 27px;
              background: #FF3D17;
              border-radius: 4px;
              text-align: center;
            }

            &-word {
              margin-top: 10px;
              margin-bottom: 40px;
              font-size: 16px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #3B3F47;
              line-height: 22px;
              overflow: hidden;
              text-overflow: ellipsis;
              display: -webkit-box;
              -webkit-line-clamp: 2; // 控制多行的行数
              /*! autoprefixer: off */
              -webkit-box-orient: vertical;
              /* autoprefixer: on */
            }

            &-wordHover {
              color: #3281E4;
              margin-top: 10px;
              margin-bottom: 40px;
              font-size: 16px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              line-height: 22px;
              overflow: hidden;
              text-overflow: ellipsis;
              display: -webkit-box;
              -webkit-line-clamp: 2; // 控制多行的行数
              /*! autoprefixer: off */
              -webkit-box-orient: vertical;
              /* autoprefixer: on */
            }

            &-source {
              padding-right: 12px;
              border-right: 1px solid #888888;
              display: inline-block;
              font-size: 14px;
              font-family: PingFangSC-Regular, sans-serif;
              font-weight: 400;
              color: #3B3F47;
            }

            &-dateTime {
              /*padding-left: 12px;*/
              display: inline-block;
              color: #888888;
              margin-top: 20px;
            }

          }

          &-imgBox {
            width: 100%;
            height: 200px;
            overflow: hidden;

            &-img {
              width: 100%;
              height: 200px;
              transition: all 0.7s;
            }

            &-img:hover {
              transform: scale(1.1);
            }
          }
        }

      }
    }
  }

  @media screen and (max-width: 1400px) {
    .container-body-content-newsRow2-img {
      height: 174px;
    }
  }


  .container-body-left-content-word > > > img {
    max-width: 100%;
  }

  .container-body-left-content-word > > > span {
    font-size: 15px !important;
    font-family: 微软雅黑, sans-serif !important;
    color: #383F47 !important;
    line-height: 30px !important;
  }

  .container-body-left-content-word > > > p {
    font-size: 15px !important;
    font-family: 微软雅黑, sans-serif !important;
    color: #383F47 !important;
    line-height: 30px !important;
  }

  .container-body-left-content-word > > > div {
    font-size: 15px !important;
    font-family: 微软雅黑, sans-serif !important;
    color: #383F47 !important;
    line-height: 30px !important;
  }

</style>
