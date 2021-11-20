package com.lh.principles.demo4.before;

/**
 * @ClassName HeiMaSafetyDoor
 * @Desc //接口隔离原则
 * @Author mi
 * @Date 2021/6/13 13:05
 */
public class HeiMaSafetyDoor implements SafetyDoor {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
