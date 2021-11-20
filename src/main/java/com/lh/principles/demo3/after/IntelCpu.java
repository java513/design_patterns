package com.lh.principles.demo3.after;

/**
 * @ClassName IntelCpu
 * @Desc //
 * @Author mi
 * @Date 2021/6/13 12:53
 */
public class IntelCpu implements Cpu {
    @Override
    public void run() {
        System.out.println("使用Intel处理器");
    }
}
