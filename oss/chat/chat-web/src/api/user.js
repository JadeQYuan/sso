import request from "@/utils/http";

export function me(params) {
    return request({
        url: "/api/user/me",
        method: "get",
        params
    });
}
