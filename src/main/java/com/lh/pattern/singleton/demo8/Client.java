package com.lh.pattern.singleton.demo8;

/**
 * @program: design_patterns
 * @description: 枚举测试类
 * @author: lh
 * @date: 2021-11-14 11:40
 **/
public class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1==instance2);
    }
}
