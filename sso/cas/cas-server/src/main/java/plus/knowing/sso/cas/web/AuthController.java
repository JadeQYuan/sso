package plus.knowing.sso.cas.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import plus.knowing.sso.cas.service.IAuthService;
import plus.knowing.sso.cas.vo.CasUserVO;
import plus.knowing.sso.cas.vo.UserLoginVO;

import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping(path = "/api/auth")
@Validated
public class AuthController {

    @Autowired
    private IAuthService iAuthService;

    @PostMapping
    public String login(@RequestBody @Validated UserLoginVO loginVO) {
        return iAuthService.login(loginVO);
    }

    @GetMapping
    public CasUserVO auth(@NotBlank String token) {
        return iAuthService.auth(token);
    }
}
