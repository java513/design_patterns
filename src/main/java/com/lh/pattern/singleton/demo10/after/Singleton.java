package com.lh.pattern.singleton.demo10.after;

public class Singleton {

    private static boolean flag = false;

    //私有构造方法
    private Singleton() {
        synchronized (Singleton.class) {
            //反射破解单例模式需要添加的代码
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    private static volatile Singleton instance;

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {

        if (instance != null) {
            return instance;
        }

        synchronized (Singleton.class) {
            if (instance != null) {
                return instance;
            }
            instance = new Singleton();
            return instance;
        }
    }
}