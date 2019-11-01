package com.xian.oauth2.server.config.service;

import com.xian.oauth2.server.domain.TbPermission;
import com.xian.oauth2.server.domain.TbUser;
import com.xian.oauth2.server.service.TbPermissionService;
import com.xian.oauth2.server.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 自定义用户认证与授权
 * @Author: Xian
 * @CreateDate: 2019/11/1  16:08
 * @Version: 0.0.1-SHAPSHOT
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private TbPermissionService tbPermissionService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TbUser tbUser = tbUserService.getByUsername(username);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if (tbUser != null) {
            // 获取权限
            List<TbPermission> tbPermissions = tbPermissionService.listbyUserId(tbUser.getId());
            tbPermissions.forEach(tbPermission -> {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                    grantedAuthorities.add(grantedAuthority);
            });

        }
        // 由框架完成认证工作
        return new User(tbUser.getUsername(), tbUser.getPassword(), grantedAuthorities);
    }
}
