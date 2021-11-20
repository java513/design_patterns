package com.lh.principles.demo3.after;

/**
 * @ClassName KingstonMemory
 * @Desc //
 * @Author mi
 * @Date 2021/6/13 12:54
 */
public class KingstonMemory implements Memory {
    @Override
    public void save() {
        System.out.println("使用金士顿作为内存条");
    }
}
