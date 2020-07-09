import axios from "axios";

// 创建axios实例
const service = axios.create({
  baseURL: "http://localhost:9000", // api的base_url
  withCredentials: true, // 跨域请求时是否需要使用凭证
  timeout: 60000 // 请求超时时间
});

// response拦截器
service.interceptors.response.use(
    response => {
      const res = response.data;
      if (res.code !== 200) {
        return Promise.reject(res);
      } else {
        return response.data;
      }
    },
    error => {
      return Promise.reject(error);
    }
);

export default service;
