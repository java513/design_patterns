package com.lh.pattern.decorator.old;

/**
 * @ClassName MacBook
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 9:38
 */
public class MacBook implements Computer {
    @Override
    public void make() {
        System.out.println("produce a MacBook Computer");
    }
}
