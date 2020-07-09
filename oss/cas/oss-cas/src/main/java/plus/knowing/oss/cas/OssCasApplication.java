package plus.knowing.oss.cas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "plus.knowing.oss.cas.dao")
public class OssCasApplication {

    public static void main(String[] args) {
        SpringApplication.run(OssCasApplication.class, args);
    }

}
