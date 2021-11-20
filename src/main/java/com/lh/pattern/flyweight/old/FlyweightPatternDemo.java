package com.lh.pattern.flyweight.old;

/**
 * @ClassName FlyweightPatternDemo
 * @Desc //享元模式测试类
 * @Author mi
 * @Date 2020/8/8 15:17
 */
public class FlyweightPatternDemo {
    static String brands[] = {"Asus","Lenovo","Macbook"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Computer computer = ComputerFactory.getComputer(getRandomBrand());
            computer.make();
        }
    }

    private static String getRandomBrand() {
        return brands[(int)(Math.random()*brands.length)];
    }
}
