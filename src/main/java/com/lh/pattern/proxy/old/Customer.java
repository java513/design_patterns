package com.lh.pattern.proxy.old;

/**
 * @ClassName Customer
 * @Desc //客户
 * @Author mi
 * @Date 2020/8/8 15:25
 */
public class Customer implements BuyHouse {
    @Override
    public void buy() {
        System.out.println("我是客户，我想买房！");
    }
}
