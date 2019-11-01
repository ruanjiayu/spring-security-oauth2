package com.xian.oauth2.server.service;

import com.xian.oauth2.server.domain.TbPermission;

import java.util.List;

/**
 * @Description: 权限对应的服务接口层
 * @Author: Xian
 * @CreateDate: 2019/11/1  15:42
 * @Version: 0.0.1-SHAPSHOT
 */
public interface TbPermissionService {

    /**
     * 通过用户ID来查询权限
     *
     * @param userId 用户id
     * @return
     */
    List<TbPermission> listbyUserId(Long userId);


}
