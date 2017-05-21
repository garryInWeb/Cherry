package com.cherry.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/21 0021.
 */
/*
文章评论
 */
public class Comment {

    private Integer id;
    private Integer post_id;//文章id
    private String comment_cont;//评论内容
    private Date comment_time;//评论时间
    private Integer comment_state;//评论审核状态(0:未审核,1:通过审核,2:未通过审核)
    private Integer user_ip;//评论者的ip

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public String getComment_cont() {
        return comment_cont;
    }

    public void setComment_cont(String comment_cont) {
        this.comment_cont = comment_cont;
    }

    public Date getComment_time() {
        return comment_time;
    }

    public void setComment_time(Date comment_time) {
        this.comment_time = comment_time;
    }

    public Integer getComment_state() {
        return comment_state;
    }

    public void setComment_state(Integer comment_state) {
        this.comment_state = comment_state;
    }

    public Integer getUser_ip() {
        return user_ip;
    }

    public void setUser_ip(Integer user_ip) {
        this.user_ip = user_ip;
    }
}
