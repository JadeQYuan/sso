package plus.knowing.sso.chat.service;

import plus.knowing.sso.chat.vo.UserVO;

public interface IUserService {

    UserVO getByCasId(Long casId);
}
