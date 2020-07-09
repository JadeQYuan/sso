package plus.knowing.sso.mall.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.HandlerInterceptor;
import plus.knowing.common.util.JsonUtils;
import plus.knowing.sso.mall.configuration.prop.OSSConfigProperties;
import plus.knowing.sso.mall.exception.BizExceptionEnum;
import plus.knowing.sso.mall.vo.CasUserVO;
import plus.knowing.common.response.CommonJsonResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 权限验证拦截器
 * @author sheng
 *
 */
@Component
@Slf4j
public class AuthenticateInterceptor implements HandlerInterceptor {

    public static final String TOKEN = "Token";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OSSConfigProperties ossConfigProperties;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        log.info(String.format("request[Method: '%s', RequestURI: '%s', RemoteAddr: '%s']", request.getMethod(),
                request.getRequestURI(), request.getRemoteAddr()));
        // 登陆权限验证
        if(RequestMethod.OPTIONS.name().equals(request.getMethod())) {
            return true;
        }
        String token = request.getHeader(TOKEN);
        CommonJsonResponse<CasUserVO> jsonResponse = restTemplate.getForObject(
                String.format(ossConfigProperties.getAuthUrl(), token), CommonJsonResponse.class);
        CasUserVO casUserVO = JsonUtils.read(JsonUtils.writeValueAsString(jsonResponse.getData()), CasUserVO.class);
        BizExceptionEnum.NOT_LOGIN.assertNotNull(casUserVO);
        request.setAttribute("user", casUserVO);
        return true;
    }
}
