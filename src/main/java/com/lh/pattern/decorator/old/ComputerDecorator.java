package com.lh.pattern.decorator.old;

/**
 * @ClassName ComputerDecorator
 * @Desc //装饰者模式
 * @Author mi
 * @Date 2020/8/8 14:31
 */
public abstract class ComputerDecorator implements Computer{
    Computer computer;

    public ComputerDecorator(Computer computer){
        this.computer=computer;
    }

    @Override
    public void make(){
        computer.make();
    }
}
