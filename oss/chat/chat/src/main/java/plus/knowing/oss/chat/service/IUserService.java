package plus.knowing.oss.chat.service;

import plus.knowing.oss.chat.vo.UserVO;

public interface IUserService {

    UserVO getByCasId(Long casId);
}
