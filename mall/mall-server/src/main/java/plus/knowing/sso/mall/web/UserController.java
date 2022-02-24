package plus.knowing.sso.mall.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import plus.knowing.sso.mall.vo.CasUserVO;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    @GetMapping(path = "/me")
    public CasUserVO get(@RequestAttribute CasUserVO user) {
        return user;
    }
}
