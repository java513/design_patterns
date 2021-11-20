package com.lh.pattern.singleton.demo7;

/**
 * @ClassName Client
 * @Desc //
 * @Author mi
 * @Date 2021/6/13 14:01
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);
    }
}
