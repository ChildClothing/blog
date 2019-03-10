package com.slc.blog.interceptor;

import com.slc.blog.util.Utils;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LoginInterceptor implements HandlerInterceptor {

    //controller执行前
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setContentType("application/json; charset=utf-8");

        Utils utils = Utils.getInstance();
        String addr = utils.getIpAddr(request);
        String ip = utils.getPropValue("props/loginList.properties", "ip");
        String[] obj = ip.split(",");
        Set<String> set = new HashSet<>(Arrays.asList(obj));
        if(!set.add(addr)){
            return true;
        }else {
            //System.out.println(addr);
            response.getWriter().print(false);
            return false;
        }
    }

    //controller执行后
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    //整个请求完成后
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }

    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    }

}
