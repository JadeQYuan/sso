
## 单点登录
单点登录(SingleSignOn，SSO)，就是通过用户的一次性鉴别登录，当用户在身份认证服务器上登录一次以后，即可获得访问单点登录系统中其他关联系统和应用软件的权限。

## CAS
Central Authentication Service 中央认证服务。

## 模块
### cas模块
认证模块，可以手机号密码登录，token获取用户信息。
### chat模块
聊天模块，有自己的用户体系，根据认证获取的id在查自己的用户。
### mall模块
商城模块，使用认证模块的用户。

## 功能
### 前端功能
1. 当用户在各自模块没有登录时，跳转到cas模块，并带上跳转之前的路径。
2. 跳转到cas后，查看当前LocalStorage是否存在token，若存在，验证没有过期后跳转回去，并带上token。若不存在，则跳到登录页面，登录成功之后跳转回去。
3. 跳转回之前模块后，将带过来的token存到LocalStorage中，下次调接口时先从本地查询token。
### 后端功能
1. cas模块负责登录及查询token的有效性。
2. 每个模块的请求，通过拦截器拦截去cas认证中心查询token有效性并获取用户信息。
3. mall模块没有自己的用户体系，通过认证之后的用户即该模块的用户。
4. chat模块有自己的用户体系，cas模块返回数据之后，还需要根据返回数据查询自己的用户信息。

## 可提升优化
### 前端
1. 页面跳转带着原地址的写法。
2. 认证之后跳转回去token放在路径中，可能会不安全。
3. LocalStorage中没有时间限制，可以根据业务场景，选择Cookie或者SessionStorage进行存储。

### 后端
1. 没有注册、登出功能，每个模块注册完用户之后都应将数据保存进cas模块，或者由cas模块统一完成注册功能。
2. token没有限制时长，现在是直接放在map里面，可以放在缓存中并指定缓存的失效时间及失效策略。
3. 拦截器可对某些接口放行，不一定所有请求都需要拦截。
4. 登录成功之后应返回token及token的失效时间。

***END***