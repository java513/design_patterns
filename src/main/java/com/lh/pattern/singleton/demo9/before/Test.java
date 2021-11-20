package com.lh.pattern.singleton.demo9.before;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @program: design_patterns
 * @description: 测试序列化反序列化对单列模式的破坏
 * @author: lh
 * @date: 2021-11-14 11:47
 **/
public class Test {
    public static void main(String[] args) throws Exception {
        //写出对象
        //writeObject2File();
        //读取对象
        Singleton s1 = readObjectFromFile();
        Singleton s2 = readObjectFromFile();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }

    public static Singleton readObjectFromFile() throws Exception {
        //创建对象输入流
//        ObjectInputStream is = new ObjectInputStream(
//                new FileInputStream("/Users/lh/IdeaProjects/demo/hm/design_patterns/src/main/resources/a.txt"));
        ObjectInputStream is = new ObjectInputStream(
                new FileInputStream(Singleton.class.getClassLoader().getResource("a.txt").getPath()));
        Singleton singleton = (Singleton) is.readObject();
        return singleton;
    }



    public static void writeObject2File() throws Exception {
        //获取Singleton对象
        Singleton singleton = Singleton.getInstance();
        ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream("/Users/lh/IdeaProjects/demo/hm/design_patterns/src/main/resources/a.txt"));
//        ObjectOutputStream os = new ObjectOutputStream(
//                new FileOutputStream(Singleton.class.getClassLoader().getResource("a.txt").getPath()));
        os.writeObject(singleton);

    }
}
