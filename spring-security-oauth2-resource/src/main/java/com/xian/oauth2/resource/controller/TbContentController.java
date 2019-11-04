package com.xian.oauth2.resource.controller;

import com.xian.oauth2.resource.domain.TbContent;
import com.xian.oauth2.resource.dto.ResponseResult;
import com.xian.oauth2.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/11/4  17:10
 * @Version: 0.0.1-SHAPSHOT
 */

@RestController
@MapperScan(basePackages = "com.xian.oauth2.resource.mapper")
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;

    @GetMapping("/")
    public ResponseResult<List<TbContent>> list() {
       return new ResponseResult<List<TbContent>>(HttpStatus.OK.value(), HttpStatus.OK.toString(),tbContentService.listAll());
    }
}
