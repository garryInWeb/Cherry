package com.cherry.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/21 0021.
 */
public class User {

    private Integer id;
    private String user_login;//登录名
    private String user_pass;//密码
    private String user_nickname;//昵称
    private String avatar;//头像
    private String signature;//签名
    private Date last_login_time;//最后登录时间
    private Integer login_times;//登陆次数
    private Integer post_count;//发文次数

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Date getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    public Integer getLogin_times() {
        return login_times;
    }

    public void setLogin_times(Integer login_times) {
        this.login_times = login_times;
    }

    public Integer getPost_count() {
        return post_count;
    }

    public void setPost_count(Integer post_count) {
        this.post_count = post_count;
    }
}
