package plus.knowing.sso.chat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"plus.knowing.sso.chat.dao"})
public class SsoChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoChatApplication.class, args);
    }

}
