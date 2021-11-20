package com.lh.pattern.singleton.demo9.before;

import java.io.Serializable;

/**
 * @program: design_patterns
 * @description: 防止序列化反序列化破坏单列模式
 * @author: lh
 * @date: 2021-11-14 11:42
 **/
public class Singleton implements Serializable {
    private Singleton() {

    }

    //私有构造方法
    public static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //对外提供静态方法获取对象
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
