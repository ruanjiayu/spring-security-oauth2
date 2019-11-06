package com.xian.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description: 资源服务器
 * @Author: Xian
 * @CreateDate: 2019/11/4  16:55
 * @Version: 0.0.1-SHAPSHOT
 */
@SpringBootApplication
@MapperScan(basePackages = "com.xian.oauth2.resource.mapper")
public class OAuth2ResourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2ResourceApplication.class, args);
    }
}
