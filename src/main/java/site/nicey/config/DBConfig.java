package site.nicey.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "site.nicey.model.dao")
public class DBConfig {
}
