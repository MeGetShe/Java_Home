package com.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Detail {
    private Long id;
    private Long sortId;
    private String title;
    private String detail;
    private String author;
    private Date createDate;
    private Integer replyCount;

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", sortId=" + sortId +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", author='" + author + '\'' +
                ", createDate=" + createDate +
                ", replyCount=" + replyCount +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreateDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String createDate = sdf.format(this.createDate);
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }
}
