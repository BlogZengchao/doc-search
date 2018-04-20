package com.zc.docsearch.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zengchao
 * Created by zengchao on 2018/4/13.
 */
public class HtmlEntity implements Serializable{
    private static final long serialVersionUID = -6318646132452657945L;
    private String title;
    private String url;
    private String content;
    private Date createDate;

    public HtmlEntity() {
    }

    public HtmlEntity(String title, String url, String content, Date createDate) {
        this.title = title;
        this.url = url;
        this.content = content;
        this.createDate = createDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
