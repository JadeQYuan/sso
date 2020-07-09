package plus.knowing.sso.cas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "plus.knowing.sso.cas.dao")
public class OssCasApplication {

    public static void main(String[] args) {
        SpringApplication.run(OssCasApplication.class, args);
    }

}
