package com.lh.pattern.decorator.old;

/**
 * @ClassName GoldenComputerDecorator
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 14:37
 */
public class GoldenComputerDecorator extends ComputerDecorator {

    public GoldenComputerDecorator(Computer computer) {
        super(computer);
    }

    @Override
    public void make() {
        super.make();
        paintColor();
    }

    private void paintColor() {
        System.out.println("给电脑涂上金色");
    }
}
