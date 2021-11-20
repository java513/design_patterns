package com.lh.pattern.proxy.old;

/**
 * @ClassName ProxyPatternDemo
 * @Desc //代理模式测试类
 * @Author mi
 * @Date 2020/8/8 15:27
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        CustomerProxy customerProxy = new CustomerProxy(new Customer());
        customerProxy.buy();
    }
}
