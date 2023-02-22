package com.wovert.javase.collection;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Notice implements Comparable<Notice> {
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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String date = sdf.format(this.getCreateTime());

        return this.id +"=>" + this.getTitle() + ":" + this.getCreator() + date;
    }

    @Override
    public int compareTo(Notice notice) {
        // 根据对象的编号排序
        // 返回值为负数，表示当前存入的元素是较小值，存左边
        // 返回值为0，表示当前存入的元素跟集合中元素重复了，不存
        // 返回0，后面的覆盖前面的
        int result = this.id - notice.id;
        if (0 == result) {
            result = (int)(this.getCreateTime().getTime() - notice.getCreateTime().getTime());
        }
        return result;
    }
}
