package com.lh.principles.demo4.after;

import com.lh.principles.demo4.before.HeiMaSafetyDoor;

/**
 * @ClassName TestSafetyDoor
 * @Desc //接口隔离原则
 * @Author mi
 * @Date 2021/6/13 13:08
 */
public class TestSafetyDoor {
    public static void main(String[] args) {
        HeiMaSafetyDoor heiMaSafetyDoor = new HeiMaSafetyDoor();
        heiMaSafetyDoor.antiTheft();
        heiMaSafetyDoor.fireproof();
        heiMaSafetyDoor.waterproof();
        System.out.println("----------------");
        ItcastSafetyDoor itcastSafetyDoor = new ItcastSafetyDoor();
        itcastSafetyDoor.antiTheft();
        itcastSafetyDoor.fireproof();
    }
}
