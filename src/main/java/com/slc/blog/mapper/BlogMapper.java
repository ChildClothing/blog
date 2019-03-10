package com.slc.blog.mapper;

import com.slc.blog.entity.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogMapper {

    public void insertBlog(@Param("blog") Blog blog);

    public List<Blog> selectTimeOfBlog();

    public Blog selectBlogById(int id);

    public List<Blog> selectAllBlog();

}
