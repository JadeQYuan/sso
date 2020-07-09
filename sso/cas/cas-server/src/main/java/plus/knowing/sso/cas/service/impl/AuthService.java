package plus.knowing.sso.cas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plus.knowing.sso.cas.dao.CasUserDao;
import plus.knowing.sso.cas.entity.CasUser;
import plus.knowing.sso.cas.exception.BizExceptionEnum;
import plus.knowing.sso.cas.service.IAuthService;
import plus.knowing.sso.cas.vo.CasUserVO;
import plus.knowing.sso.cas.vo.UserLoginVO;
import plus.knowing.common.util.EncryptUtil;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class AuthService implements IAuthService {

    private final Map<String, CasUserVO> tokenMap = new ConcurrentHashMap<>();

    @Autowired
    private CasUserDao casUserDao;

    @Override
    public String login(UserLoginVO loginVO) {
        CasUser casUser = casUserDao.getByMobileAndPwd(loginVO.getMobile(), loginVO.getPassword());
        BizExceptionEnum.LOGIN_INVALID.assertNotNull(casUser);
        CasUserVO casUserVO = new CasUserVO(casUser);
        String token = buildToken(casUserVO);
        tokenMap.put(token, casUserVO);
        return token;
    }

    @Override
    public CasUserVO auth(String token) {
        CasUserVO casUserVO = tokenMap.get(token);
        BizExceptionEnum.TOKEN_INVALID.assertNotNull(casUserVO);
        return casUserVO;
    }

    private String buildToken(CasUserVO casUserVO) {
        return EncryptUtil.md5(String.format("%s_%s_%s", casUserVO.getId(), LocalDateTime.now(), casUserVO.getMobile()));
    }
}
