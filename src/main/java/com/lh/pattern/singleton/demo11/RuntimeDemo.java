package com.lh.pattern.singleton.demo11;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * @program: design_patterns
 * @description: Runtime类是一种饿汉式单例模式
 * @author: lh
 * @date: 2021-11-14 12:31
 **/
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("ifconfig");
        InputStream is = process.getInputStream();
        byte[] bytes = new byte[1024*1021*100];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len,"GBK"));
    }
}
