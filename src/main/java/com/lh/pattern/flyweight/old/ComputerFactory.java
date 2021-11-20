package com.lh.pattern.flyweight.old;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ComputerFactory
 * @Desc //电脑工厂
 * @Author mi
 * @Date 2020/8/8 15:14
 */
public class ComputerFactory {
    private static final Map<String, Computer> computerMap = new HashMap<>();

    public static Computer getComputer(String brand) {
        Computer computer = computerMap.get(brand);
        if (computer == null) {
            System.out.println("第一次获取电脑："+brand);
            computer = new ComputerProducer(brand);
            computerMap.put(brand,computer);
        }
        return computer;
    }
}
