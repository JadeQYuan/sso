package plus.knowing.sso.cas.service;

import plus.knowing.sso.cas.vo.CasUserVO;
import plus.knowing.sso.cas.vo.UserLoginVO;

public interface IAuthService {

    /**
     * 用户登录
     *
     * @param loginVO
     * @return
     */
    String login(UserLoginVO loginVO);

    /**
     * 认证
     *
     * @param token
     * @return
     */
    CasUserVO auth(String token);
}
