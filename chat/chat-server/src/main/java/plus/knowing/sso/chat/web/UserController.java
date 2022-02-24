package plus.knowing.sso.chat.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import plus.knowing.sso.chat.vo.UserVO;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    @GetMapping(path = "/me")
    public UserVO get(@RequestAttribute UserVO user) {
        return user;
    }
}
