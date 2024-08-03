package com.pojo;

import java.util.Date;
import java.util.List;

public class Informations {
    private Long id;
    private String title;
    private String content;
    private Integer replyCount;
    private Integer viewCount;
    private Date reportTime;
    private Date lastPostTime;
    private List<Replies> repliesList;

    @Override
    public String toString() {
        return "Informations{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", replyCount=" + replyCount +
                ", viewCount=" + viewCount +
                ", reportTime=" + reportTime +
                ", lastPostTime=" + lastPostTime +
                ", repliesList=" + repliesList +
                '}';
    }

    public Informations() {
    }

    public Informations(Long id, String title, String content, Integer replyCount, Integer viewCount, Date reportTime, Date lastPostTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.replyCount = replyCount;
        this.viewCount = viewCount;
        this.reportTime = reportTime;
        this.lastPostTime = lastPostTime;
    }

    public List<Replies> getRepliesList() {
        return repliesList;
    }

    public void setRepliesList(List<Replies> repliesList) {
        this.repliesList = repliesList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Date getLastPostTime() {
        return lastPostTime;
    }

    public void setLastPostTime(Date lastPostTime) {
        this.lastPostTime = lastPostTime;
    }
}
