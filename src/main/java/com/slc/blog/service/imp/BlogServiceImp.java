package com.slc.blog.service.imp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.slc.blog.entity.Blog;
import com.slc.blog.mapper.BlogMapper;
import com.slc.blog.service.BlogService;
import com.slc.blog.util.ValueTransformUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class BlogServiceImp implements BlogService {

    @Autowired
    private BlogMapper blog;

    @Override
    public void insertBlog(Blog blog) {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String format = date.format(new Date());
        blog.setBlogCreateDate(format);
        blog.setBlogStatus(0);
        blog.setBlogPath("//");
        this.blog.insertBlog(blog);
    }

    @Override
    public String getTimeOfBlog() {
        List<Blog> blogs = blog.selectTimeOfBlog();
        for (Blog b : blogs) {
            b.setBlogType(ValueTransformUtil.selectValueOfBlogType(b.getBlogType()));
        }
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {
            json = mapper.writeValueAsString(blogs);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public String getBlogById(int id) {
        Blog b = this.blog.selectBlogById(id);
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {
            json = mapper.writeValueAsString(b);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public String getAllBlog() {
        List<Blog> blogs = blog.selectAllBlog();
        for (Blog b : blogs) {
            b.setBlogType(ValueTransformUtil.selectValueOfBlogType(b.getBlogType()));
        }
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {
            json = mapper.writeValueAsString(blogs);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
}
