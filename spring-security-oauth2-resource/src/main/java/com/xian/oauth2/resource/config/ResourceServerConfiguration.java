package com.xian.oauth2.resource.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/11/5  10:16
 * @Version: 0.0.1-SHAPSHOT
 */

@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true) // 相当于拦截器，拦截所有请求
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {


    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasAuthority("SystemContent")
                .antMatchers("/view/**").hasAuthority("SystemContentView");
    }
}
