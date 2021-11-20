package com.lh.pattern.decorator.old;

/**
 * @ClassName RedComputerDecorator
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 14:38
 */
public class RedComputerDecorator extends ComputerDecorator {
    public RedComputerDecorator(Computer computer) {
        super(computer);
    }

    @Override
    public void make() {
        super.make();
        paintColor();
    }

    private void paintColor() {
        System.out.println("给电脑涂上红色");
    }
}
