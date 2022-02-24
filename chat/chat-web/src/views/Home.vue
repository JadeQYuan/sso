<template>
  <div class="home">
    <h4>首页</h4>
    <div>{{ user.name }}</div>
    <iframe
        src="http://localhost:9010/login"
        class="iframe"
        ref="iframe"
        style="display:none"
    ></iframe>
  </div>
</template>

<script>
import {me} from "@/api/user";

window.addEventListener(
    "message",
    event => {
      if (event.origin === "http://localhost:9010") {
        const token = event.data.token;
        if (token) {
          localStorage.setItem("token", token);
        } else {
          window.location.href =
              "http://localhost:9010/login?from=http://localhost:9110";
        }
      }
    },
    false
);
export default {
  name: "Home",
  data() {
    return {
      user: {
        name: ""
      }
    };
  },
  mounted() {
    me()
        .then(data => {
          this.user = data.data;
        })
        .catch(error => {
          if (error.code === 10001) {
            this.$refs.iframe.contentWindow.postMessage(
                "",
                this.$refs.iframe.src
            );
          } else {
            console.log(error);
          }
        });
  }
};
</script>
