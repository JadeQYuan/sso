import request from "@/utils/http";

// 账号密码 其他系统
export function login(data) {
  return request({
    url: "/api/auth",
    method: "post",
    data
  });
}

// 账号密码 其他系统
export function auth(params) {
  return request({
    url: "/api/auth",
    method: "get",
    params
  });
}
