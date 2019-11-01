package com.xian.oauth2.server.service.impl;

import com.xian.oauth2.server.domain.TbPermission;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.xian.oauth2.server.mapper.TbPermissionMapper;
import com.xian.oauth2.server.service.TbPermissionService;

import java.util.List;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/11/1  15:42
 * @Version: 0.0.1-SHAPSHOT
 */
@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> listbyUserId(Long userId) {
        return tbPermissionMapper.listByUserId(userId);
    }
}
