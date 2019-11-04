package com.xian.oauth2.resource.service.impl;

import com.xian.oauth2.resource.domain.TbContent;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xian.oauth2.resource.mapper.TbContentMapper;
import com.xian.oauth2.resource.service.TbContentService;

import java.util.List;

/**
* @Description:   
* @Author:         Xian
* @CreateDate:     2019/11/4  17:04
* @Version:        0.0.1-SHAPSHOT
*/
@Service
public class TbContentServiceImpl implements TbContentService{

    @Resource
    private TbContentMapper tbContentMapper;


    @Override
    public List<TbContent> listAll() {
        return tbContentMapper.selectAll();
    }
}
