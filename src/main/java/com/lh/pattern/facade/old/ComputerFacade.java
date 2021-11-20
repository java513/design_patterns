package com.lh.pattern.facade.old;

/**
 * @ClassName ComputerFacade
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 14:48
 */
public class ComputerFacade {
    private Computer asus;
    private Computer lenovo;
    private Computer macBook;

    public ComputerFacade(){
        asus=new ASUS();
        lenovo=new Lenovo();
        macBook=new MacBook();
    }

    public void makeAsus(){
        asus.make();
    }

    public void makeLenovo(){
        lenovo.make();
    }

    public void makeMacbook(){
        macBook.make();
    }

}
