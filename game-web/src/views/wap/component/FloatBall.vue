<template>
  <transition>
    <div ref="dragIcon"
         @click="onBtnClicked"
         class="float_info"
         @touchstart.stop="handleTouchStart"
         @touchmove.prevent.stop="handleTouchMove($event)"
         @touchend.stop="handleTouchEnd"
         :style="{left: left + 'px',top: top + 'px',width: itemWidth + 'px',height: itemHeight + 'px'}"
         v-if="isShow">
      <img src="../../../assets/front/images/wap/返回.png" alt="" srcset="" ref="imgFlag"/>
    </div>
  </transition>
</template>

<script>
  export default {
    name: 'FloatBall',
    props: {
      text: {
        type: String,
        default: '球'
      },
      itemWidth: {
        type: Number,
        default: 40
      },
      itemHeight: {
        type: Number,
        default: 40
      }
    },
    data(){
      return{
        imgFlag:0,
        left: 0,
        top: 0,
        startToMove: false,
        isShow: true,
        timer: null,
        currentTop: null,
        clientW: document.documentElement.clientWidth,//视口宽
        clientH: document.documentElement.clientHeight//视口高
      }
    },
    created () {
      this.left = (this.clientW - this.itemWidth - 40)
      this.top = this.clientH/2+100
    },
    mounted() {
      const _this=this
      this.$nextTick(() => {
        _this.itemWidth=_this.$refs.imgFlag.offsetWidth
      })
      this.bindScrollEvent()
    },
    beforeDestroy() {
      // 记得销毁一些全局的的事件
      this.removeScrollEvent()
    },
    methods: {
      onBtnClicked() {
        if(window.history.length<=1) {
          this.$router.push({path:'/wap/index'})
        }else {
          this.$router.go(-1)
        }
      },
      handleTouchStart() {
        this.startToMove = true
        this.$refs.dragIcon.style.transition = 'none'
      },
      handleTouchMove(e) {
        const clientX = e.targetTouches[0].clientX//手指相对视口的x
        const clientY = e.targetTouches[0].clientY//手指相对视口的y
        const isInScreen = clientX <= this.clientW && clientX >= 0 && clientY <= this.clientH && clientY >=0
        if(this.startToMove && e.targetTouches.length === 1) {
          if(isInScreen) {
            this.left = clientX - this.itemWidth/2
            this.top = clientY - this.itemHeight/2
          }
        }
      },
      handleTouchEnd() {
        if(this.left < (this.clientW / 2)) {
          this.left = 20//不让贴边 所以设置30没设置0
          this.handleIconY()
        } else {
          this.left = this.clientW - this.itemWidth - 5//不让贴边 所以减30
          this.handleIconY()
        }
        this.$refs.dragIcon.style.transition = 'all .3s'
      },
      handleIconY() {
        if (this.top < 0) {
          this.top = 20//不上帖上边所以设置为30 没设置0
        } else if(this.top + this.itemHeight > this.clientH) {
          this.top = this.clientH - this.itemHeight - 20//不让帖下边所以减30
        }
      },
      bindScrollEvent() {
        window.addEventListener('scroll', this.handleScrollStart)
      },
      removeScrollEvent() {
        window.removeEventListener('scroll',this.handleScrollStart)
      },
      handleScrollStart() {
        this.isShow = false
        this.timer && clearTimeout(this.timer)
        this.timer = setTimeout(() => {
          this.handleScrollEnd()
        },300)
        this.currentTop = document.documentElement.scrollTop || document.body.scrollTop
      },
      handleScrollEnd() {
        this.scrollTop = document.documentElement.scrollTop || document.body.scrollTop
        // 判断是否停止滚动的条件
        if(this.scrollTop === this.currentTop) {
          this.isShow = true
        }
      }
    }
  }
</script>

<style  rel="stylesheet/scss" lang="scss" scoped>
  .float_info {
    position: fixed;
    bottom: 100px;
    right: 50px;
    z-index: 9999;
    cursor: pointer;
    transition: all 0.3s;


    img {
      width: 100px;
      height: 100px;

    }

  }
  .v-enter {
    opacity: 1;
  }
  .v-leave-to {
    opacity: 0;
  }
  .v-enter-active,
  .v-leave-active {
    transition: opacity 0.3s;
  }
</style>
