package com.zc.docsearch.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zc.docsearch.entity.Article;
import com.zc.docsearch.mapper.ArticleMapper;
import com.zc.docsearch.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zengchao on 2018/4/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleServiceImplTest {
//    @Autowired
//    private ArticleService articleService;
    @Autowired
    private ArticleMapper articleMapper;
    @Test
    public void test(){
        List<Article> list = articleMapper.selectList(new EntityWrapper<Article>().eq("article_id", 65));
        System.out.println(list);
    }
}