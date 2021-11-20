package com.lh.pattern.bridge.old;

/**
 * @ClassName Bridge
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 10:48
 */
public abstract class Bridge {
    protected Computer computer;
    public Bridge(Computer computer){
        this.computer=computer;
    }

    public abstract void makeComputer();
}
