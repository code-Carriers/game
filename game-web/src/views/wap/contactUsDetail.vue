<template>
  <div class="container">
    <Header></Header>
    <img src="../../assets/front/images/contactUs/contactUs-banner-new.png" alt="" class="container-banner">
    <div class="container-body" v-if="selectItem==='西部港区'">
      <div class="container-body-titleBox">
        <div class="container-body-titleBox-title">西部港区（蛇口、赤湾、妈湾）</div>
        <div class="container-body-titleBox-subTitleBox">
          <img class="container-body-titleBox-subTitleBox-img" alt="" src="../../assets/front/images/wap/班轮操作@2x.png"/>
          <div class="container-body-titleBox-subTitleBox-title">班轮操作</div>
        </div>
        <div class="container-body-titleBox-phone">电　　话：+86-755-26676089</div>
        <div class="container-body-titleBox-fax">传　　真：+86-755-26692769</div>
        <div class="container-body-titleBox-email">电子邮箱：<a style="color: #277AE3">container@penavicosz.com.cn</a></div>
        <div class="container-body-titleBox-dutyPhone">值班电话：+86-755-26691136（24小时在线）</div>
      </div>

      <div class="container-body-titleBox1">
        <div class="container-body-titleBox1-subTitleBox">
          <img class="container-body-titleBox1-subTitleBox-img" alt="" src="../../assets/front/images/wap/联系我们-西部港区-非班轮操作@2x.png"/>
          <div class="container-body-titleBox1-subTitleBox-title">非班轮操作</div>
        </div>
        <div class="container-body-titleBox1-phone">电　　话：+86-755-26695216</div>
        <div class="container-body-titleBox1-fax">传　　真：+86-755-26692769</div>
        <div class="container-body-titleBox1-fax">　　　　　+86-755-26692769</div>
        <div class="container-body-titleBox-email">电子邮箱：<a style="color: #277AE3">shipping@penavicosz.com.cn</a></div>
      </div>

      <div class="container-body-titleBox1">
        <div class="container-body-titleBox1-subTitleBox">
          <img class="container-body-titleBox1-subTitleBox-img" alt="" src="../../assets/front/images/wap/联系我们-西部港区-驳船操作@2x.png"/>
          <div class="container-body-titleBox1-subTitleBox-title">驳船操作</div>
        </div>
        <div class="container-body-titleBox1-phone">电　　话：+86-755-26880915</div>
        <div class="container-body-titleBox1-phone">　　　　　+86-755-26694340</div>
        <div class="container-body-titleBox1-phone">　　　　　+86-755-26880911</div>
        <div class="container-body-titleBox1-fax">传　　真：+86-755-26692769</div>
        <div class="container-body-titleBox1-fax">　　　　　+86-755-26689946</div>
        <div class="container-body-titleBox-email">电子邮箱：<a style="color: #277AE3">feeder@penavicosz.com.cn</a></div>
      </div>

      <div class="container-body-titleBox1">
        <div class="container-body-titleBox1-subTitleBox">
          <img class="container-body-titleBox1-subTitleBox-img" alt="" src="../../assets/front/images/wap/联系我们-西部港区-财务结算@2x.png"/>
          <div class="container-body-titleBox1-subTitleBox-title">财务结算</div>
        </div>
        <div class="container-body-titleBox1-phone">电　　话：+86-755-26689771</div>
        <div class="container-body-titleBox1-phone">　　　　　+86-755-26880924</div>
        <div class="container-body-titleBox1-fax">传　　真：+86-755-26692769</div>
        <div class="container-body-titleBox-email">电子邮箱：<a style="color: #277AE3">acct@penavicosz.com.cn</a></div>
      </div>

      <div class="container-body-titleBox1">
        <div class="container-body-titleBox1-subTitleBox">
          <img class="container-body-titleBox1-subTitleBox-img" alt="" src="../../assets/front/images/wap/联系我们-西部港区-单证操作@2x.png"/>
          <div class="container-body-titleBox1-subTitleBox-title">单证操作</div>
        </div>
        <div class="container-body-titleBox1-phone">电　　话：+86-755-26692731</div>
        <div class="container-body-titleBox1-fax">传　　真：+86-755-26687360</div>
        <div class="container-body-titleBox-email">电子邮箱：<a style="color: #277AE3">business@penavicosz.com.cn</a></div>
      </div>

      <baidu-map class="container-body-titleBox1-map"
                 :scroll-wheel-zoom="true" :center="{lng: '113.926748',lat: '22.50255'}" :zoom="16">
        <bm-marker :position="{  lng: '113.926748',lat: '22.50255'}" animation="BMAP_ANIMATION_BOUNCE" :show="true">
          <bm-info-window :position="{  lng: '113.926748',lat: '22.50255'}" :show="true" style="margin-top: 20px;">
            <p style="margin-top: 6px;font-size: 5px">深圳市南山区蛇口南海大道深圳外代联合大厦1,8,9楼</p>
          </bm-info-window>
        </bm-marker>
      </baidu-map>
    </div>

    <div class="container-body" v-if="selectItem==='东部港区'">
      <div class="container-body-titleBox">
        <div class="container-body-titleBox-title">东部港区（盐田、大鹏、华安、光汇）</div>
        <div class="container-body-titleBox-subTitleBox">
          <img class="container-body-titleBox-subTitleBox-img" alt="" src="../../assets/front/images/wap/联系我们-东部港区-办公事务@2x.png"/>
          <div class="container-body-titleBox-subTitleBox-title">办公事务及信息服务</div>
        </div>
        <div class="container-body-titleBox-phone">电　　话：+86-755-25290056</div>
        <div class="container-body-titleBox-fax">传　　真：+86-755-25292870</div>
        <div class="container-body-titleBox-email">电子邮箱：<a style="color: #277AE3">itytn@penavicosz.com.cn</a></div>
      </div>

      <div class="container-body-titleBox1">
        <div class="container-body-titleBox1-subTitleBox">
          <img class="container-body-titleBox1-subTitleBox-img" alt="" src="../../assets/front/images/wap/联系我们-东部港区-船舶操作@2x.png"/>
          <div class="container-body-titleBox1-subTitleBox-title">船舶操作</div>
        </div>
        <div class="container-body-titleBox1-phone">电　　话：+86-755-25290215</div>
        <div class="container-body-titleBox1-fax">传　　真：+86-755-25291400</div>
        <div class="container-body-titleBox-email">电子邮箱：<a style="color: #277AE3">shippingytn@penavicosz.com.cn</a></div>
        <div class="container-body-titleBox-dutyPhone">值班电话：+86-755-25290215（24小时）</div>
      </div>

      <div class="container-body-titleBox1">
        <div class="container-body-titleBox1-subTitleBox">
          <img class="container-body-titleBox1-subTitleBox-img" alt="" src="../../assets/front/images/wap/联系我们-西部港区-单证操作@2x.png"/>
          <div class="container-body-titleBox1-subTitleBox-title">单证操作</div>
        </div>
        <div class="container-body-titleBox1-phone">电　　话：+86-755-25291016</div>
        <div class="container-body-titleBox1-fax">传　　真：+86-755-25290877</div>
        <div class="container-body-titleBox-email">电子邮箱：<a style="color: #277AE3">businessytn@penavicosz.com.cn</a></div>
      </div>

      <div class="container-body-titleBox1">
        <div class="container-body-titleBox1-subTitleBox">
          <img class="container-body-titleBox1-subTitleBox-img" alt="" src="../../assets/front/images/wap/联系我们-西部港区-财务结算@2x.png"/>
          <div class="container-body-titleBox1-subTitleBox-title">财务结算</div>
        </div>
        <div class="container-body-titleBox1-phone">电　　话：+86-755-25290221</div>
        <div class="container-body-titleBox1-fax">传　　真：+86-755-25290219</div>
        <div class="container-body-titleBox-email">电子邮箱：<a style="color: #277AE3">accountytn@penavicosz.com.cn</a></div>
      </div>

      <div class="container-body-titleBox1">
        <div class="container-body-titleBox1-subTitleBox">
          <img class="container-body-titleBox1-subTitleBox-img" alt="" src="../../assets/front/images/wap/联系我们-东部港区-货物报关@2x.png"/>
          <div class="container-body-titleBox1-subTitleBox-title">货物报关</div>
        </div>
        <div class="container-body-titleBox1-phone">电　　话：+86-755-25292653</div>
        <div class="container-body-titleBox1-fax">传　　真：+86-755-25290075</div>
        <div class="container-body-titleBox-email">电子邮箱：<a style="color: #277AE3">brokerytn@penavicosz.com.cn</a></div>
      </div>

      <baidu-map class="container-body-titleBox1-map"
                 :scroll-wheel-zoom="true" :center="{lng: '114.26011',
          lat: '22.575021'}" :zoom="16">
        <bm-marker :position="{  lng: '114.26011',
          lat: '22.575021'}" animation="BMAP_ANIMATION_BOUNCE" :show="true">
          <bm-info-window :position="{ lng: '114.26011',
          lat: '22.575021'}" :show="true" style="margin-top: 20px;">
            <p style="margin-top: 6px;font-size: 5px">深圳市盐田区沙头角海港大厦主楼810</p>
          </bm-info-window>
        </bm-marker>
      </baidu-map>
    </div>

    <div class="container-body" v-if="selectItem==='大铲湾码头'">
      <div class="container-body-titleBox">
        <div class="container-body-titleBox-title">大铲湾码头</div>
        <div class="container-body-titleBox-subTitleBox">
          <img class="container-body-titleBox-subTitleBox-img" alt="" src="../../assets/front/images/wap/联系我们-东部港区-船舶操作@2x.png"/>
          <div class="container-body-titleBox-subTitleBox-title">船舶操作</div>
        </div>
        <div class="container-body-titleBox-phone">电　　话：+86-755-29035025</div>
        <div class="container-body-titleBox-fax">传　　真：+86-755-29035027</div>
        <div class="container-body-titleBox-email">电子邮箱：<a style="color: #277AE3">shippingdcb@penavicosz.com.cn</a></div>
        <div class="container-body-titleBox-dutyPhone">值班电话：+86 13925220028</div>
      </div>

      <div class="container-body-titleBox1">
        <div class="container-body-titleBox1-subTitleBox">
          <img class="container-body-titleBox1-subTitleBox-img" alt="" src="../../assets/front/images/wap/联系我们-西部港区-单证操作@2x.png"/>
          <div class="container-body-titleBox1-subTitleBox-title">单证操作</div>
        </div>
        <div class="container-body-titleBox1-phone">电　　话：+86-755-29035026</div>
        <div class="container-body-titleBox1-fax">传　　真：+86-755-29035027</div>
        <div class="container-body-titleBox-email">电子邮箱：<a style="color: #277AE3">dachan@penavicosz.com.cn</a></div>
      </div>
      <baidu-map class="container-body-titleBox1-map"
                 :scroll-wheel-zoom="true" :center="{lng: '113.869685',lat: '22.537454'}" :zoom="16">
        <bm-marker :position="{  lng: '113.869685',lat: '22.537454'}" animation="BMAP_ANIMATION_BOUNCE" :show="true">
          <bm-info-window :position="{ lng: '113.869685',lat: '22.537454'}" :show="true" style="margin-top: 20px;">
            <p style="margin-top: 6px;font-size: 5px">深圳市宝安区金港大道大铲湾码头一期控制大楼402</p>
          </bm-info-window>
        </bm-marker>
      </baidu-map>
    </div>

    <div class="container-body" v-if="selectItem==='国际货运'">
      <div class="container-body-titleBox">
        <div class="container-body-titleBox-title">深圳市外代国际货运有限公司</div>
        <div class="container-body-titleBox-subTitleBox">
          <img class="container-body-titleBox-subTitleBox-img" alt="" src="../../assets/front/images/wap/contactUs8.png"/>
          <div class="container-body-titleBox-subTitleBox-title">联系我们</div>
        </div>
        <div class="container-body-titleBox-address">地　　址：深圳市福田区金田路4018号安联大厦20楼全层</div>
        <div class="container-body-titleBox-zip">邮　　编：518026</div>
        <div class="container-body-titleBox-phone" style="margin-top: 10px">电　　话：+86-755-88284699 / 88284700</div>
        <div class="container-body-titleBox-fax">传　　真：+86-755-88284650</div>
        <div class="container-body-titleBox-email">电子邮箱：<a>boeven.wu@penavicocargo.com</a></div>
        <div class="container-body-titleBox-dutyPhone">网　　址：<a style="color:#277AE3;" href="http://www.penavicocargo.com">www.penavicocargo.com</a></div>
      </div>

      <baidu-map class="container-body-titleBox1-map"
                 :scroll-wheel-zoom="true" :center="{lng: '114.070166',lat: '22.548112'}" :zoom="16">
        <bm-marker :position="{ lng: '114.070166',lat: '22.548112'}" animation="BMAP_ANIMATION_BOUNCE" :show="true">
          <bm-info-window :position="{ lng: '114.070166',lat: '22.548112'}" :show="true" style="margin-top: 20px;">
            <p style="margin-top: 6px;font-size: 5px">深圳市福田区金田路4018号安联大厦20楼全层</p>
          </bm-info-window>
        </bm-marker>
      </baidu-map>
    </div>

    <div class="container-body" v-if="selectItem==='保税仓储'">
      <div class="container-body-titleBox">
        <div class="container-body-titleBox-title">深圳市外代仓储有限公司</div>
        <div class="container-body-titleBox-subTitleBox">
          <img class="container-body-titleBox-subTitleBox-img" alt="" src="../../assets/front/images/wap/contactUs8.png"/>
          <div class="container-body-titleBox-subTitleBox-title">联系我们</div>
        </div>
        <div class="container-body-titleBox-address">地　　址：深圳市南山区临海大道53号前海湾保税港区（前海自贸区）</div>
        <div class="container-body-titleBox-zip">邮　　编：518054</div>
        <div class="container-body-titleBox-phone" style="margin-top: 10px">电　　话：+86-755-26822577</div>
        <div class="container-body-titleBox-email">电子邮箱：<a>liuzimu@penavicocargo.com</a></div>
        <div class="container-body-titleBox-dutyPhone">网　　址：<a style="color:#277AE3;" href="http://www.penavicosz.com.cn">www.penavicosz.com.cn</a></div>
      </div>
      <baidu-map class="container-body-titleBox1-map"
                 :scroll-wheel-zoom="true" :center="{lng: '113.885799',lat: '22.506157'}" :zoom="16">
        <bm-marker :position="{ lng: '113.885799',lat: '22.506157'}" animation="BMAP_ANIMATION_BOUNCE" :show="true">
          <bm-info-window :position="{ lng: '113.885799',lat: '22.506157'}" :show="true" style="margin-top: 20px;">
            <p style="margin-top: 6px;font-size: 5px">深圳市南山区临海大道53号前海湾保税港区（前海自贸区）</p>
          </bm-info-window>
        </bm-marker>
      </baidu-map>

    </div>

    <div class="container-body" v-if="selectItem==='报关报检'">
      <div class="container-body-titleBox">
        <div class="container-body-titleBox-title">深圳市外代报关有限公司</div>
        <div class="container-body-titleBox-subTitleBox">
          <img class="container-body-titleBox-subTitleBox-img" alt="" src="../../assets/front/images/wap/contactUs8.png"/>
          <div class="container-body-titleBox-subTitleBox-title">联系我们</div>
        </div>
        <div class="container-body-titleBox-address">地　　址：中国深圳临海大道前海湾保税港区（前海自贸区）外代仓二期二楼</div>
        <div class="container-body-titleBox-zip">邮　　编：518054</div>
        <div class="container-body-titleBox-phone" style="margin-top: 10px">电　　话：+86-755-26880940 / 25290051</div>
        <div class="container-body-titleBox-email">电子邮箱：<a>tony.guo@penavicosz.com.cn</a></div>
        <div class="container-body-titleBox-dutyPhone">网　　址：<a style="color:#277AE3;" href="http://www.penavicosz.com.cn">www.penavicosz.com.cn</a></div>
      </div>

      <baidu-map class="container-body-titleBox1-map"
                 :scroll-wheel-zoom="true" :center="{lng: '113.885004',lat: '22.511261'}" :zoom="16">
        <bm-marker :position="{ lng: '113.885004',lat: '22.511261'}" animation="BMAP_ANIMATION_BOUNCE" :show="true">
          <bm-info-window :position="{ lng: '113.885004',lat: '22.511261'}" :show="true" style="margin-top: 20px;">
            <p style="margin-top: 6px;font-size: 5px">中国深圳临海大道前海湾保税港区(前海自贸区)外代仓二期二楼</p>
          </bm-info-window>
        </bm-marker>
      </baidu-map>
    </div>

    <div class="container-body" v-if="selectItem==='招商邮服'">
      <div class="container-body-titleBox">
        <div class="container-body-titleBox-title">深圳招商邮轮服务有限公司</div>
        <div class="container-body-titleBox-subTitleBox">
          <img class="container-body-titleBox-subTitleBox-img" alt="" src="../../assets/front/images/wap/contactUs8.png"/>
          <div class="container-body-titleBox-subTitleBox-title">联系我们</div>
        </div>
        <div class="container-body-titleBox-address">地　　址：中国深圳蛇口邮轮中心（蛇口自贸区）</div>
        <div class="container-body-titleBox-zip">邮　　编：518066</div>
        <div class="container-body-titleBox-phone" style="margin-top: 10px">电　　话：+86-755-26880891</div>
        <div class="container-body-titleBox-email">电子邮箱：<a>cmcs@cmhk.com</a></div>
        <div class="container-body-titleBox-dutyPhone">网　　址：<a style="color:#277AE3;" href="http://www.cmcs1872.com">www.cmcs1872.com</a></div>
      </div>
      <baidu-map class="container-body-titleBox1-map"
                 :scroll-wheel-zoom="true" :center="{lng: '113.919967',lat: '22.474665'}" :zoom="16">
        <bm-marker :position="{ lng: '113.919967',lat: '22.474665'}" animation="BMAP_ANIMATION_BOUNCE" :show="true">
          <bm-info-window :position="{ lng: '113.919967',lat: '22.474665'}" :show="true" style="margin-top: 20px;">
            <p style="margin-top: 6px;font-size: 5px">中国深圳蛇口邮轮中心（蛇口自贸区）</p>
          </bm-info-window>
        </bm-marker>
      </baidu-map>

    </div>

    <div class="container-body" v-if="selectItem==='意见反馈'">
      <div class="container-body-title">联系我们</div>
      <div class="container-body-line"></div>
      <div class="container-body-contact">
        <div class="container-body-contact-info">
          <span>地址：</span>中国深圳蛇口南海大道深圳外代联合大厦一/八/九楼
        </div>

        <div class="container-body-contact-info">
          邮编：518066
        </div>

        <div class="container-body-contact-info">
          电话：+86-755-26688998 / 26880935
        </div>

        <div class="container-body-contact-info">
          传真：+86-755-26692769 / 26689946
        </div>

        <div class="container-body-contact-info">
          邮箱：hq@penavicosz.com.cn
        </div>
        <div class="container-body-contact-info">
          网址：<a style="color:#277AE3;" href="http://www.penavicosz.com.cn">www.penavicosz.com.cn</a>
        </div>
      </div>
      <div class="container-body-from">
        <div class="container-body-from-title1">信息反馈</div>
        <div class="container-body-from-title2">欢迎您留下问题，我们将尽快解答您的疑问！</div>

        <van-form @submit="submitClick" ref="infoForm" :model="infoForm" :show-error-message="false">
          <van-field
            v-model="infoForm.name"
            name="您的姓名"
            label="您的姓名"
            placeholder="请输入姓名"
            :rules="[{ required: true, message: '姓名不能为空' }]"
          />
          <van-field
            v-model="infoForm.mobile"
            type="phone"
            name="手机号码"
            label="手机号码"
            placeholder="请输入手机号码"
            :rules="[{ required: true, message: '手机号码不能为空' }]"
          />
          <van-field
            v-model="infoForm.email"
            name="电子邮箱"
            label="电子邮箱"
            placeholder="请输入电子邮箱"
          />
          <van-field
            v-model="infoForm.company"
            name="公司名称"
            label="公司名称"
            placeholder="请输入公司名称"
          />
          <van-field
            v-model="infoForm.content"
            type="textarea"
            name="需求描述"
            label="需求描述"
            placeholder="请输入留言内容"
            :rules="[{ required: true, message: '留言内容不能为空' }]"
          />

          <van-field
            readonly
            clickable
            name="picker"
            :value="infoForm.business_type"
            label="留言类型"
            placeholder="点击选择留言类型"
            @click="showPicker = true"
          />
          <van-popup v-model="showPicker" position="bottom">
            <van-picker
              show-toolbar
              :columns="columns"
              @confirm="onConfirm"
              @cancel="showPicker = false"
            />
          </van-popup>

          <div style="margin: 16px;">
            <van-button round block type="info" native-type="submit">提交</van-button>
          </div>
        </van-form>


      </div>

    </div>
    <Footer/>
  </div>
</template>

<script>
  import {Notify} from 'vant'
  import Header from '@/views/wap/component/header'
  import Footer from '@/views/wap/component/FloatBall'
  import {apiSubmitForm} from '@/api/form'

  export default {
    name: 'wap-contactUs',
    components: {
      Header,
      Footer
    },
    data() {
      return {
        value: '',
        columns: ['业务咨询', '服务投诉', '其他'],
        showPicker: false,
        selectItem: '',
        infoForm: {
          web: 'PENAVICOSZ',
          name: '',
          mobile: '',
          email: '',
          company: '',
          content: '',
          business_type: '业务咨询'
        }
      }
    },
    created() {
      !(function (window) {
        setTimeout(function () {
          /* 设计图文档宽度 */
          const docWidth = 750
          // eslint-disable-next-line one-var
          const doc = window.document,
            // eslint-disable-next-line prefer-const
            docEl = doc.documentElement,
            // eslint-disable-next-line prefer-const
            resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize'
          const recalc = (function refreshRem() {
            /* 窗口当前宽度 */
            let clientWidth = docEl.getBoundingClientRect().width
            /* 页面宽度大于 750 时不再放大 */
            clientWidth = clientWidth > 750 ? 750 : clientWidth
            const oldSize = (clientWidth / docWidth * 100) + 'px'
            docEl.style.fontSize = oldSize

            /* 获取设置后的字体大小情况 - 因微信设置APP字体大小后会影响该设置 */
            const nowSize = window.getComputedStyle(document.getElementsByTagName('html')[0]).fontSize
            const oldSizeValue = parseFloat(oldSize, 10)
            const nowSizeValue = parseFloat(nowSize, 10)

            /* 当差值大于1时重新按差比计算出正确的px值 */
            if ((nowSizeValue - oldSizeValue) > 1 || (nowSizeValue - oldSizeValue) < -1) {
              const diff = (oldSizeValue / nowSizeValue)
              docEl.style.fontSize = ((clientWidth / docWidth * 100) * diff) + 'px'
            }
            return refreshRem
          })()
          /* 添加倍屏标识，安卓为1 */
          docEl.setAttribute('data-dpr', window.navigator.appVersion.match(/iphone/gi) ? window.devicePixelRatio : 1)
          if (/iP(hone|od|ad)/.test(window.navigator.userAgent)) {
            /* 添加IOS标识 */
            doc.documentElement.classList.add('ios')
            /* IOS8以上给html添加hairline样式，以便特殊处理 */
            if (parseInt(window.navigator.appVersion.match(/OS (\d+)_(\d+)_?(\d+)?/)[1], 10) >= 8) {doc.documentElement.classList.add('hairline')}
          }
          if (!doc.addEventListener) return
          window.addEventListener(resizeEvt, recalc, false)
          doc.addEventListener('DOMContentLoaded', recalc, false)
        }, 0)
      }(window))
      this.selectItem = this.$route.query.selectItem
    },
    methods: {
      onConfirm(value) {
        this.infoForm.business_type = value
        this.showPicker = false
      },
      submitClick() {
        const _this = this
        apiSubmitForm(this.infoForm).then(() => {
          Notify({type: 'success', message: '您的信息反馈已提交，我们会尽快与您联系！'})
          // this.infoForm={brand_right:0}
          _this.infoForm.name = ''
          _this.infoForm.mobile = ''
          _this.infoForm.email = ''
          _this.infoForm.company = ''
          _this.infoForm.content = ''
          _this.infoForm.business_type = '业务咨询'
        })
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  /deep/ .BMap_pop > img {
     display: none;
  }
  .van-cell {
    position: relative;
    display: -webkit-box;
    display: -webkit-flex;
    display: flex;
    box-sizing: border-box;
    width: 100%;
    padding: 18px 16px;
    overflow: hidden;
    color: #323233;
    font-size: 23px;
    line-height: 40px;
    background-color: #fff;
  }
  .container {
    width: 100%;

    &-banner {
      width: 100%;
      height: 170px;
    }

    &-body {
      padding: 28px 0;
      position: relative;

      &-titleBox {
        padding: 0 0 40px 0;
        margin: 0 30px;
        border-bottom: 1px solid #E4E4E4;

        &-title {
          margin: 0 0 20px 0;
          color: #000000;
          font-size: 28px;
          font-weight: 500;
        }
        &-phone {
          font-size: 23px;
          color: #000000;
          margin-top: 2px;
        }
        &-address {
          line-height: 40px;
          text-indent: -117px;
          padding-left: 117px;
          font-size: 23px;
          color: #000000;
          margin-top: 2px;


        }
        &-zip {
          font-size: 23px;
          color: #000000;
          margin-top: 12px;
        }
        &-fax {
          font-size: 23px;
          color: #000000;
          margin-top: 12px;
        }
        &-email {
          font-size: 23px;
          color: #000000;
          margin-top: 12px;
        }
        &-dutyPhone {
          font-size: 23px;
          color: #000000;
          margin-top: 12px;
        }

        &-subTitleBox {
          margin-top: 15px;
          position: relative;
          width: 100%;
          height: 60px;

          &-img {
            position: absolute;
            width: 36px;
            height: 36px;
            left: 0;
            top: 0;
          }

          &-title {
            position: absolute;
            font-size: 27px;
            color: #000000;
            left:45px;
            top: 6px;
          }


        }
      }

      &-titleBox1 {
        padding: 30px 0 40px 0;
        margin: 0 30px;
        border-bottom: 1px solid #E4E4E4;

        &-map {
          padding: 0 20px;
          width: 100%;
          height: 420px;
        }
        &-title {
          margin: 0 0 22px 0;
          color: #000000;
          font-size: 28px;
          font-weight: 500;
        }
        &-phone {
          font-size: 23px;
          color: #000000;
          margin-top: 2px;
        }
        &-fax {
          font-size: 23px;
          color: #000000;
          margin-top: 12px;
        }
        &-email {
          font-size: 23px;
          color: #000000;
          margin-top: 12px;
        }
        &-dutyPhone {
          font-size: 23px;
          color: #000000;
          margin-top: 12px;
        }

        &-subTitleBox {
          position: relative;
          width: 100%;
          height: 60px;

          &-img {
            position: absolute;
            width: 36px;
            height: 36px;
            left: 0;
            top: 0;
          }

          &-title {
            position: absolute;
            font-size: 28px;
            color: #000000;
            left: 45px;
            top: 6px;
          }


        }
      }

      &-title {
        padding: 0 50px 0 30px;
        font-size:36px;
        color: #000000;
        margin-bottom: 40px;
      }

      &-line {
        width: 60px;
        height: 6px;
        background-color: #277AE3;
        position: absolute;
        top: 90px;
        left: 30px;
      }

      &-contact {
        border-bottom: 1px solid #E4E4E4;
        padding: 0 30px 30px 30px;

        &-info {
          text-indent: -78px;
          padding-left: 78px;
          font-size: 25px;
          color: #000000;
          line-height: 45px;
        }
      }

      &-from {
        padding: 30px 30px 40px 30px;

        &-title1 {
          font-size: 30px;
          color: #000000;
          margin-bottom: 20px;
        }

        &-title2 {
          font-size: 24px;
          color: #000000;
          margin-bottom: 15px;
        }


      }
    }
  }
</style>
