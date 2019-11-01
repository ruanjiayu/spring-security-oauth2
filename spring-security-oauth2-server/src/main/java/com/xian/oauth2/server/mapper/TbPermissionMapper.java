package com.xian.oauth2.server.mapper;

import com.xian.oauth2.server.domain.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/11/1  15:42
 * @Version: 0.0.1-SHAPSHOT
 */
public interface TbPermissionMapper extends MyMapper<TbPermission> {

    /**
     * 通过用户来查询对应的权限
     *
     * @param userId 用户id
     * @return
     */
    List<TbPermission> listByUserId(@Param("userId") Long userId);
}