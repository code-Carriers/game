<template>
  <div class="container-index">
    <pageHeader :activeIndex="1"></pageHeader>
  </div>
</template>

<script>

export default {
  name: 'index',
  components: {
    pageHeader: () => import('@/views/public/header/header')
  },
  methods: {}
}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>

</style>
