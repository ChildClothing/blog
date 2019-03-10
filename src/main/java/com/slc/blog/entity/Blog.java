package com.slc.blog.entity;

import java.util.Date;

public class Blog {

    private int id;
    private String blogName;
    private String blogType;
    private String blogIntroduce;
    private String blogContent;
    private String blogCreateDate;
    private int blogStatus;
    private String blogPath;

    public Blog() {
    }

    public Blog(int id, String blogName, String blogType, String blogIntroduce, String blogContent, String blogCreateDate, int blogStatus, String blogPath) {
        this.id = id;
        this.blogName = blogName;
        this.blogType = blogType;
        this.blogIntroduce = blogIntroduce;
        this.blogContent = blogContent;
        this.blogCreateDate = blogCreateDate;
        this.blogStatus = blogStatus;
        this.blogPath = blogPath;
    }

    public String getBlogType() {
        return blogType;
    }

    public void setBlogType(String blogType) {
        this.blogType = blogType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogIntroduce() {
        return blogIntroduce;
    }

    public void setBlogIntroduce(String blogIntroduce) {
        this.blogIntroduce = blogIntroduce;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public String getBlogCreateDate() {
        return blogCreateDate;
    }

    public void setBlogCreateDate(String blogCreateDate) {
        this.blogCreateDate = blogCreateDate;
    }

    public int getBlogStatus() {
        return blogStatus;
    }

    public void setBlogStatus(int blogStatus) {
        this.blogStatus = blogStatus;
    }

    public String getBlogPath() {
        return blogPath;
    }

    public void setBlogPath(String blogPath) {
        this.blogPath = blogPath;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", blogName='" + blogName + '\'' +
                ", blogType='" + blogType + '\'' +
                ", blogIntroduce='" + blogIntroduce + '\'' +
                ", blogContent='" + blogContent + '\'' +
                ", blogCreateDate=" + blogCreateDate +
                ", blogStatus=" + blogStatus +
                ", blogPath='" + blogPath + '\'' +
                '}';
    }
}
