package com.slc.blog.service;

import com.slc.blog.entity.Blog;

public interface BlogService {

    //新增博客
    public void insertBlog(Blog blog);

    //查询时间轴的博客数据
    public String getTimeOfBlog();

    //根据博客id获取相关数据
    public String getBlogById(int id);

    //查询所有的blog
    public String getAllBlog();

}
