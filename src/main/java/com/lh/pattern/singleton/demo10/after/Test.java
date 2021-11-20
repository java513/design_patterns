package com.lh.pattern.singleton.demo10.after;

import java.lang.reflect.Constructor;

/**
 * @program: design_patterns
 * @description: 反射对单列模式的破坏
 * @author: lh
 * @date: 2021-11-14 12:13
 **/
public class Test {
    public static void main(String[] args) throws Exception {
        //获取Singleton的字节码对象
        Class clazz = Singleton.class;
        //获取Singleton的私有无参构造方法对象
        Constructor constructor = clazz.getDeclaredConstructor();
        //取消访问检查、
        constructor.setAccessible(true);

        Singleton s1 = (Singleton) constructor.newInstance();
        Singleton s2 = (Singleton) constructor.newInstance();
        System.out.println(s1==s2);
    }
}
