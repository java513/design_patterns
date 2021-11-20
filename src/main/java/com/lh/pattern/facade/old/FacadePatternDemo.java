package com.lh.pattern.facade.old;

/**
 * @ClassName FacadePatternDemo
 * @Desc //外观模式测试类
 * @Author mi
 * @Date 2020/8/8 14:51
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.makeAsus();
        computerFacade.makeLenovo();
        computerFacade.makeMacbook();
    }
}
