package com.zc.docsearch.controller;

import com.zc.docsearch.common.ResponseBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengchao
 * Created by zengchao on 2018/4/13.
 */
@RestController
@RequestMapping(value = "/doc")
public class SaveDocController {

    /**
     * 保存网页信息
     * @param url
     * @return
     */
    @PostMapping("/storage")
    public Object saveDoc(String url){
        return new ResponseBean(1,"","");
    }
}
