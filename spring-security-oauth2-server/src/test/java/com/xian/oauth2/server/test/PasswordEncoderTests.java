package com.xian.oauth2.server.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/11/1  10:43
 * @Version: 0.0.1-SHAPSHOT
 */
public class PasswordEncoderTests {

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
