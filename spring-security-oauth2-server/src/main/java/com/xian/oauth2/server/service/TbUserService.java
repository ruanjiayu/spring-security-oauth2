package com.xian.oauth2.server.service;

import com.xian.oauth2.server.domain.TbUser;

/**
* @Description:   
* @Author:         Xian
* @CreateDate:     2019/11/1  15:33
* @Version:        0.0.1-SHAPSHOT
*/
public interface TbUserService{

    TbUser getByUsername(String username);
}
