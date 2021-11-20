package com.lh.pattern.singleton.demo6;


/**
 * @program: design_patterns
 * @description:
 * @author: lh
 * @date: 2021-11-14 11:35
 **/
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);
    }
}
