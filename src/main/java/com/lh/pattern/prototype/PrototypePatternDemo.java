package com.lh.pattern.prototype;

/**
 * @ClassName PrototypePatternDemo
 * @Desc //原型模式测试类
 * @Author mi
 * @Date 2020/8/8 9:44
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        Computer asus = ComputerPrototype.getComputer("ASUS");
        asus.make();
        Computer lenovo = ComputerPrototype.getComputer("Lenovo");
        lenovo.make();
        Computer macBook = ComputerPrototype.getComputer("MacBook");
        macBook.make();
    }
}
