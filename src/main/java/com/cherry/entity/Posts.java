package com.cherry.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/21 0021.
 */
public class Posts {

    private Integer id;
    private Integer post_author;//作者id
    private String post_description;//文章描述
    private String post_title;//文章标题
    private String post_excerpt;//文章摘要
    private String post_content;//文章内容
    private String post_content_markdown;//文章markdown的内容
    private String post_img;//文章列表图
    private Integer post_status;//文章状态（0：草稿，1：发布）
    private Integer comment_status;//评论状态（0：不允许评论，1：允许评论）
    private Date mtime;//修改时间
    private Date atime;//添加时间
    private Integer post_type;//文章分类id
    private Integer comment_count;//评论总数
    private Integer post_hits;//查看数
    private Integer post_like;//点赞数

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPost_author() {
        return post_author;
    }

    public void setPost_author(Integer post_author) {
        this.post_author = post_author;
    }

    public String getPost_description() {
        return post_description;
    }

    public void setPost_description(String post_description) {
        this.post_description = post_description;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getPost_excerpt() {
        return post_excerpt;
    }

    public void setPost_excerpt(String post_excerpt) {
        this.post_excerpt = post_excerpt;
    }

    public String getPost_content() {
        return post_content;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

    public String getPost_content_markdown() {
        return post_content_markdown;
    }

    public void setPost_content_markdown(String post_content_markdown) {
        this.post_content_markdown = post_content_markdown;
    }

    public String getPost_img() {
        return post_img;
    }

    public void setPost_img(String post_img) {
        this.post_img = post_img;
    }

    public Integer getPost_status() {
        return post_status;
    }

    public void setPost_status(Integer post_status) {
        this.post_status = post_status;
    }

    public Integer getComment_status() {
        return comment_status;
    }

    public void setComment_status(Integer comment_status) {
        this.comment_status = comment_status;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public Date getAtime() {
        return atime;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }

    public Integer getPost_type() {
        return post_type;
    }

    public void setPost_type(Integer post_type) {
        this.post_type = post_type;
    }

    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    public Integer getPost_hits() {
        return post_hits;
    }

    public void setPost_hits(Integer post_hits) {
        this.post_hits = post_hits;
    }

    public Integer getPost_like() {
        return post_like;
    }

    public void setPost_like(Integer post_like) {
        this.post_like = post_like;
    }
}
