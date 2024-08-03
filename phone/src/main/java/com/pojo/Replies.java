package com.pojo;

import java.util.Date;

public class Replies {
    private Long id;
    private String content;
    private Date replyTime;
    private Long infold;

    @Override
    public String toString() {
        return "replies{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", replyTime=" + replyTime +
                ", infold=" + infold +
                '}';
    }

    public Replies() {
    }

    public Replies(Long id, String content, Date replyTime, Long infold) {
        this.id = id;
        this.content = content;
        this.replyTime = replyTime;
        this.infold = infold;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public Long getInfold() {
        return infold;
    }

    public void setInfold(Long infold) {
        this.infold = infold;
    }
}
