package com.xian.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/10/31  16:26
 * @Version: 0.0.1-SHAPSHOT
 */
@SpringBootApplication
@MapperScan(basePackages = "com.xian.oauth2.server.mapper")
public class OAuth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }
}
