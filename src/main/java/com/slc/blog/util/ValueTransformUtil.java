package com.slc.blog.util;

public class ValueTransformUtil {

    public static String selectValueOfBlogType(String selectId){
        String str = "";
        switch (selectId){
            case "1":
                str = "SE";
                break;
            case "2":
                str = "线程";
                break;
            case "3":
                str = "IO";
                break;
            case "4":
                str = "反射";
                break;
            case "5":
                str = "SSM";
                break;
        }
        return str;
    }

}
