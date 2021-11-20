package com.lh.pattern.bridge.old;

/**
 * @ClassName ComputerBridge
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 10:50
 */
public class ComputerBridge extends Bridge {
    public ComputerBridge(Computer computer) {
        super(computer);
    }

    @Override
    public void makeComputer() {
        computer.make();
    }
}
