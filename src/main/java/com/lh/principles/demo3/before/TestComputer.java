package com.lh.principles.demo3.before;

/**
 * @ClassName TestComputer
 * @Desc //依赖倒转原则
 * @Author mi
 * @Date 2021/6/13 12:48
 */
public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setHardDisk(new XiJieHardDisk());
        computer.setCpu(new IntelCpu());
        computer.setMemory(new KingstonMemory());

        computer.run();
    }
}
