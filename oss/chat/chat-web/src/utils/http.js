import axios from "axios";

// 创建axios实例
const service = axios.create({
    baseURL: "http://localhost:9100", // api的base_url
    withCredentials: true, // 跨域请求时是否需要使用凭证
    timeout: 60000 // 请求超时时间
});

// request拦截器
service.interceptors.request.use(config => {
    let token = localStorage.getItem("token");
    if (token) {
        config.headers['Token'] = token; // 让每个请求携带自定义token 请根据实际情况自行修改
    }
    return config;
}, error => {
    Promise.reject(error);
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
