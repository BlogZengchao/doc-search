package com.zc.docsearch.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 *
 * @author zengchao
 * @date 2018/4/16
 */
public class DocumentEntity {
    private String id;
    private String title;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
