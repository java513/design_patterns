package com.lh.pattern.flyweight.old;

/**
 * @ClassName ComputerProducer
 * @Desc //电脑制作类
 * @Author mi
 * @Date 2020/8/8 15:12
 */
public class ComputerProducer implements Computer {
    private String brand;
    public ComputerProducer(String brand){
        this.brand=brand;
    }

    @Override
    public void make() {
        System.out.println("produce a "+brand+" computer");
    }
}
