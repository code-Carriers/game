<template>

</template>

<script>
import {apiLogin} from "../../api/login";

export default {
  name: 'login',
  data(){

  },
  methods:{
    handleLogin(){
      apiLogin()
    }
  }
}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>

</style>
