package plus.knowing.sso.chat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plus.knowing.sso.chat.dao.SysUserDao;
import plus.knowing.sso.chat.entity.SysUser;
import plus.knowing.sso.chat.service.IUserService;
import plus.knowing.sso.chat.vo.UserVO;

@Service
public class UserService implements IUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public UserVO getByCasId(Long casId) {
        SysUser sysUser = sysUserDao.getUserByCasId(casId);
        return new UserVO(sysUser);
    }
}
