<template>
  <div class="login-container">
    <el-form ref="loginForm" :model="loginForm" label-width="80px">
      <el-form-item label="用户名">
        <el-input v-model="loginForm.username" placeholder="请输入用户名"></el-input>
      </el-form-item>
      <el-form-item label="密码">
        <el-input v-model="loginForm.password" placeholder="请输入密码" type="password"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="handleLogin">登录</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
import {apiLogin} from '@/api/login'

export default {
  name: 'login',
  data() {
    return {
      loginForm: {
        username: '',
        password: ''
      }
    }
  },
  methods: {
    handleLogin() {
      apiLogin(this.loginForm.username, this.loginForm.password)
    }
  }
}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
.login-container {
  max-width: 400px;
  margin: 0 auto;
  padding: 40px;
}
</style>
