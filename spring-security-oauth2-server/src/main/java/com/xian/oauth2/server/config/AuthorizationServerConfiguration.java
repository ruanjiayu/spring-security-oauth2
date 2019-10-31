package com.xian.oauth2.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @Description: 对客户端的认证配置
 * @Author: Xian
 * @CreateDate: 2019/10/31  16:30
 * @Version: 0.0.1-SHAPSHOT
 */

@Configuration
@EnableAuthorizationServer //说明我开启认证服务的意思
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        //  配置客户端
        clients
                //使用内存设置
                .inMemory()
                // client_id
                .withClient("client")
                // client_secret
                .secret("secret")
                // 授权类型
                .authorizedGrantTypes("authorization_code")
                // 授权范围
                .scopes("app")
                // 注册回调地址
                .redirectUris("https://www.baidu.com");
    }
}
