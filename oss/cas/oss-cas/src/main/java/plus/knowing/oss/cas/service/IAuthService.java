package plus.knowing.oss.cas.service;

import plus.knowing.oss.cas.vo.CasUserVO;
import plus.knowing.oss.cas.vo.UserLoginVO;

public interface IAuthService {

    /**
     * 用户登录
     * @param loginVO
     * @return
     */
    String login(UserLoginVO loginVO);

    /**
     * 认证
     * @param token
     * @return
     */
    CasUserVO auth(String token);
}
