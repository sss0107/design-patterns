package com.sss.pattern.proxy.simpleproxy;

/**
 * Created by Pactera on 2019/3/14.
 */
public class SimpleProxyTest {

    public static void main(String[] args) {
        BuyFoodProxy proxy = new BuyFoodProxy(new BuyFoodImpl());
        proxy.buy();
    }
}
