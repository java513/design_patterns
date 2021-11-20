package com.lh.principles.demo4.after;

public class ItcastSafetyDoor implements AntiTheft,Fireproof {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }
    @Override
    public void fireproof() {
        System.out.println("防火");
    }
}