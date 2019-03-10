package com.slc.blog.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.*;

public class LoggerTest {

    public static void main(String[] args) throws IOException {
        Logger log = Logger.getLogger("log");   //创建log实例
        FileHandler file = new FileHandler("D://log.txt",true);  //路径
        log.setLevel(Level.INFO); //设置级别
        log.addHandler(file);  //关联handler和logger
        file.setFormatter(new Formatter() {    //格式化，以字符串输出
            @Override
            public String format(LogRecord record) {
                return record.getLevel() + ":" + record.getMessage() + "\n";
            }
        });
        log.info("123456");     //日志信息
        String a = null;
        try {
            a.split(" ");
        } catch (Exception e) {
            StringWriter sw = null;
            PrintWriter pw = null;
            try {
                sw = new StringWriter();
                pw =  new PrintWriter(sw,true);
                //将出错的栈信息输出到printWriter中
                e.printStackTrace(pw);
                pw.flush();
                sw.flush();
            } finally {
                if (sw != null) {
                    try {
                        sw.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                if (pw != null) {
                    pw.close();
                }
            }
            log.info(sw.toString());
        }
    }



}
