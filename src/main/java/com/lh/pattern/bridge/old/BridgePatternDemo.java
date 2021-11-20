package com.lh.pattern.bridge.old;

/**
 * @ClassName BridgePatternDemo
 * @Desc //
 * @Author mi
 * @Date 2020/8/8 10:52
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        ComputerBridge asus = new ComputerBridge(new ASUS());
        asus.makeComputer();
        ComputerBridge lenovo = new ComputerBridge(new Lenovo());
        lenovo.makeComputer();
        ComputerBridge mackbook = new ComputerBridge(new MacBook());
        mackbook.makeComputer();
    }
}
