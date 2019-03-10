package com.slc.test;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {

    @Test
    public void test(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String s = simpleDateFormat.format(new Date());
        System.out.println(s);
        Date date = null;
        try {
            date = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }

    @Test
    public void test2(){
        String a = new String("1");
        a.replace("1","2");
        if("".equals(a)){
            System.out.println("3");
        }
        System.out.println(a);
    }

    @Test
    public void test3(){
        String url = "http://127.0.0.1:8888/blog/add";
        int i = url.indexOf(":", 2);
        int i1 = url.indexOf(":", 6);
        String s = url.substring(4, 16);
        System.out.println(s);
    }

}
