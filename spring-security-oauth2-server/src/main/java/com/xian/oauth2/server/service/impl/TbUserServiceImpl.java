package com.xian.oauth2.server.service.impl;

import com.xian.oauth2.server.domain.TbUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xian.oauth2.server.mapper.TbUserMapper;
import com.xian.oauth2.server.service.TbUserService;
import tk.mybatis.mapper.entity.Example;

/**
* @Description:   
* @Author:         Xian
* @CreateDate:     2019/11/1  15:33
* @Version:        0.0.1-SHAPSHOT
*/
@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        return tbUserMapper.selectOneByExample(example);
    }
}
