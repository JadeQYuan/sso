<template>
  <div class="home">
    <h4>首页</h4>
    <div>{{user.name}}</div>
  </div>
</template>

<script>
import {me} from "@/api/user";

export default {
  name: "Home",
  data() {
    return {
      user: {
        name: ""
      }
    }
  },
  mounted() {
    let token = this.$route.query.token;
    if (token) {
      localStorage.setItem("token", token);
      this.$router.push("/");
    }
    me().then(data => {
      this.user = data.data;
    }).catch(error => {
      window.location.href = "http://localhost:9010/login?from=http://localhost:9210" + this.$route.fullPath;
      console.log(error);
    })
  }
};
</script>
