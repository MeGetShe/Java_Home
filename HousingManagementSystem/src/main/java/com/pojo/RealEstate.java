package com.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (RealEstate)实体类
 *
 * @author makejava
 * @since 2024-08-03 13:59:18
 */
public class RealEstate implements Serializable {
   
    /**
     * 房产Id
     */
    private Long id;
    /**
     * 产权人身份证号
     */
    private String cardId;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 具体位置
     */
    private String address;
    /**
     * 房屋类型
     */
    private String houseType;
    /**
     * 使用面积
     */
    private Integer area;
    /**
     * 建造时间
     */
    private Date buildTime;
    private User user;

    @Override
    public String toString() {
        return "RealEstate{" +
                "id=" + id +
                ", cardId='" + cardId + '\'' +
                ", projectName='" + projectName + '\'' +
                ", address='" + address + '\'' +
                ", houseType='" + houseType + '\'' +
                ", area=" + area +
                ", buildTime=" + buildTime +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Date getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

}

