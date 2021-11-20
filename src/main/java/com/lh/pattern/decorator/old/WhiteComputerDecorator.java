package com.lh.pattern.decorator.old;

/**
 * @ClassName WhiteComputerDecorator
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 14:40
 */
public class WhiteComputerDecorator extends ComputerDecorator {
    public WhiteComputerDecorator(Computer computer) {
        super(computer);
    }

    @Override
    public void make() {
        super.make();
        paintColor();
    }

    private void paintColor() {
        System.out.println("给电脑涂上白色");
    }
}
