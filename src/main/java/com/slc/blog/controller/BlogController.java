package com.slc.blog.controller;

import com.slc.blog.entity.Blog;
import com.slc.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class BlogController {

    @Autowired
    private BlogService blog;

    //新增博客
    @RequestMapping(value = "/blog/add",method = RequestMethod.POST)
    @ResponseBody
    public boolean insertBlog(Blog blog){
        this.blog.insertBlog(blog);
        return true;
    }

    //查询时间轴博客数据
    @RequestMapping(value = "/blog/three",method = RequestMethod.GET)
    @ResponseBody
    public String timeOfBlog(){
        return blog.getTimeOfBlog();
    }

    //根据id获取博客数据
    @RequestMapping(value = "/blog/id",method = RequestMethod.GET)
    @ResponseBody
    public String getBlogById(Integer id){
        return blog.getBlogById(id);
    }

    //获取所有blog
    @RequestMapping(value = "/blog/all",method = RequestMethod.GET)
    @ResponseBody
    public String getAllBlog(){
        return blog.getAllBlog();
    }


}
