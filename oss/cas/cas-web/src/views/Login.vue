<template>
  <div class="login__container-user">
    <el-form
      ref="loginForm"
      class="form"
      :model="loginForm"
      label-position="left"
    >
      <h1 class="login__title">账户登录</h1>
      <el-form-item prop="mobile" style="margin-bottom: 22px">
        <el-input
          v-model="loginForm.mobile"
          name="mobile"
          type="text"
          placeholder="请输入手机号"
        />
      </el-form-item>
      <el-form-item prop="password">
        <el-input
          v-model="loginForm.password"
          name="password"
          type="password"
          placeholder="请输入密码"
        />
      </el-form-item>
      <div style="display: inline-block;width: 100%;margin-bottom: 10px;">
        <div style="display:inline-block" />
        <el-popover
          placement="right"
          title=""
          width="200"
          trigger="hover"
          class="popover_box"
        >
        </el-popover>
      </div>
      <el-form-item>
        <el-button
          type="primary"
          style="width:100%;"
          @click.native.prevent="doLogin"
          >登录</el-button
        >
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
import { login, auth } from "@/api/auth";
export default {
  data() {
    return {
      from: "",
      loginForm: {
        mobile: "",
        password: ""
      }
    };
  },
  mounted() {
    this.from = this.$route.query.from;
    let item = localStorage.getItem('token');
    if (item) {
      auth({"token" : item}).then(() => {
        if (this.from) {
          window.location.href = this.from + "?token=" + item;
        } else {
          this.$router.push({ path: '/' });
        }
      });
    }
  },
  methods: {
    doLogin() {
      login(this.loginForm).then(data => {
        localStorage.setItem('token', data.data);
        if (this.from) {
          window.location.href = this.from;
        } else {
          this.$router.push({ path: '/' });
        }
      }).catch(error => {
        console.log(error);
        });
    }
  }
};
</script>
