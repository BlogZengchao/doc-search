package com.zc.docsearch.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zc.docsearch.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by zengchao on 2018/4/20.
 */
@Component
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}
