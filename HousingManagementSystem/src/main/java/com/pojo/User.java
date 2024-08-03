package com.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2024-08-03 13:59:23
 */
public class User implements Serializable {
   
    /**
     * 身份证号
     */
    private String cardId;
    /**
     * 用户名
     */
    private String name;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 注册时间
     */
    private Date createTime;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户状态
     */
    private Integer status;


    @Override
    public String toString() {
        return "User{" +
                "cardId='" + cardId + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", createTime=" + createTime +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }


    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}

