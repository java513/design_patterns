package com.lh.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ComputerPrototype
 * @Desc //电脑原型类
 * @Author mi
 * @Date 2020/8/8 9:38
 */
public class ComputerPrototype {
    private static Map<String,Computer> computerMap  =new HashMap<>();

    static {
        computerMap.put("ASUS",new ASUS());
        computerMap.put("Lenovo",new Lenovo());
        computerMap.put("MacBook",new MacBook());
    }

    public static Computer getComputer(String type){
        Computer computer = computerMap.get(type);
        if (computer!=null){
            //返回克隆对象
            return (Computer) computer.clone();
        }
        return null;
    }
}
