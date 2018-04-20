package com.zc.docsearch.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * @author zengchao
 * Created by zengchao on 2018/4/20.
 */
@TableName("up_article")
public class Article {
    @TableId
    private Integer articleId;
    private Date createTime;//'创建时间',
    private String title;// '文章标题',
    private Integer articleType;//'文章类型,1-教养达人，2-亲子教育，3-同城教育',
    private Integer authorId;//'文章作者ID',
    private String articleFaceImage;//'文章封面',
    private Integer authorType;//'1-管理员，0-用户',
    private Integer readCount;//'文章阅读量',
    private String remark;//'摘要',
    private Integer maxAge;//'适合的最大年龄',
    private Integer minAge;//'适合的最小年龄',
    private Boolean simplifiedChinese;//'是否是简体中文，1-简体，0-繁体',
    private Integer hotFlag;//'是否热门：0-否，1-是',
    private String articleContent;//'文章内容',
    private String authorName;//'作者名称',
    private String status;//'1-正常',
    private String video;//'文章视频链接',
    private Date updateTime;//'更新时间',

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getArticleFaceImage() {
        return articleFaceImage;
    }

    public void setArticleFaceImage(String articleFaceImage) {
        this.articleFaceImage = articleFaceImage;
    }

    public Integer getAuthorType() {
        return authorType;
    }

    public void setAuthorType(Integer authorType) {
        this.authorType = authorType;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Boolean getSimplifiedChinese() {
        return simplifiedChinese;
    }

    public void setSimplifiedChinese(Boolean simplifiedChinese) {
        this.simplifiedChinese = simplifiedChinese;
    }

    public Integer getHotFlag() {
        return hotFlag;
    }

    public void setHotFlag(Integer hotFlag) {
        this.hotFlag = hotFlag;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
