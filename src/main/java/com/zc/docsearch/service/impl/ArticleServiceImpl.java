package com.zc.docsearch.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zc.docsearch.entity.Article;
import com.zc.docsearch.mapper.ArticleMapper;
import com.zc.docsearch.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * Created by zengchao on 2018/4/20.
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper,Article> implements ArticleService {
}
