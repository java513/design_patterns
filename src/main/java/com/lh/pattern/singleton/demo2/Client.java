package com.lh.pattern.singleton.demo2;

/**
 * @ClassName Client
 * @Desc //
 * @Author mi
 * @Date 2021/6/13 13:46
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);
    }
}
