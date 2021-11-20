package com.lh.pattern.decorator.old;

/**
 * @ClassName DecoratorPatternDemo
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 14:41
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Computer asus = new WhiteComputerDecorator(new ASUS());
        asus.make();
        Computer lenovo = new RedComputerDecorator(new Lenovo());
        lenovo.make();
        Computer macBook = new GoldenComputerDecorator(new MacBook());
        macBook.make();
    }
}
