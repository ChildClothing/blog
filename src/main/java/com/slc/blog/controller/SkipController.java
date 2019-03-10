package com.slc.blog.controller;

import com.slc.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SkipController {

    @Autowired
    private BlogService blog;

//    @RequestMapping("/index")
//    public String index(){
//        return "index";
//    }

    //跳转到博客编辑页面
    @RequestMapping("mdeditor")
    public String skipMd(){
        return "/blog/BlogContent";
    }

    //跳转到单个博客展示页面
    @RequestMapping(value = "/blog/detail",method = RequestMethod.GET)
    public String skipSingleBlog(int id, Model model, HttpServletRequest request, HttpServletResponse response){
        return "/blog/SingleBlog";
    }

    //获取所有的blog
    @RequestMapping("/blog/skip/all")
    public String skipAllBlog(){
        return "/blog/AllBlog";
    }

    //跳转到个人简介
    @RequestMapping("/pdf/personal")
    public String slipPersonIntroduce(){
        return "/pdf/viewer";
    }

}
