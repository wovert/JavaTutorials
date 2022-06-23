package com.wovert.javase.collection;

import java.util.Date;

public class Notice {
    private int id;
    private String title;
    private String creator;
    private Date createTime;

    public Notice(int id, String title, String creator, Date createTime) {
        this.id = id;
        this.title = title;
        this.creator = creator;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((creator == null) ? 0 : creator.hashCode());
        return result;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() == Notice.class) {
            Notice notice = (Notice) obj;
            return notice.getTitle().equals(title) && notice.getCreator().equals(creator);
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getTitle() + ":" + this.getCreator();
    }
}
