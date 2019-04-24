package com.jf.pojo;

import java.util.Date;

/**
 * ouyangjie
 * 2019/4/10
 * 15:57
 */
public class User {

    private String userName;

    private String userId;

    private Integer age;

    private String birthday;

    /**
     * 时间格式
     */
    private Date createTime;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
