package com.lh.pattern.builder.demo1;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
public class Client {
    public static void main(String[] args) {
        //创建指挥者对象
        Director director = new Director(new MobileBuilder());
        //让指挥者只会组装自行车
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
        System.out.println("=========");
        Director director1 = new Director(new OfoBuilder());
        Bike ofo = director1.construct();
        System.out.println(ofo.getFrame());
        System.out.println(ofo.getSeat());
    }
}
