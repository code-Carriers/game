<template>
  <div id="app"><!--项目根节点 v-timeout v-debug-->
    <router-view/><!--路由-->
  </div>
</template>

<script>
  export default {
    name: 'app',
    mounted() {
      function checkIE() {
        return (
          '-ms-scroll-limit' in document.documentElement.style &&
          '-ms-ime-align' in document.documentElement.style
        )
      }
      if (checkIE()) {
        window.addEventListener(
          'hashchange',
          () => {
            const currentPath = window.location.hash.slice(1)
            if (this.$route.path !== currentPath) {
              this.$router.push(currentPath)
            }
          },
          false
        )
      }
    }
  }
</script>
