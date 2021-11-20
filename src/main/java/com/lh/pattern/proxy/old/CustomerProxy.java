package com.lh.pattern.proxy.old;

/**
 * @ClassName CustomerProxy
 * @Desc //客户代理类
 * @Author mi
 * @Date 2020/8/8 15:26
 */
public class CustomerProxy implements BuyHouse {
    Customer customer;
    public CustomerProxy(Customer customer){
        this.customer=customer;
    }

    @Override
    public void buy() {
        customer.buy();
    }
}
