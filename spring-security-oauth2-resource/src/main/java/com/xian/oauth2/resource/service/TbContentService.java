package com.xian.oauth2.resource.service;

import com.xian.oauth2.resource.domain.TbContent;

import java.util.List;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/11/4  17:04
 * @Version: 0.0.1-SHAPSHOT
 */
public interface TbContentService {

    /**
     * 查询所有的内容
     *
     * @return
     */
    List<TbContent> listAll();
}
