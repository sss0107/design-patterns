package com.sss.pattern.proxy.staticproxy;

/**
 * Created by Pactera on 2019/3/14.
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        Husband husband = new Husband(new Wife());
        husband.buy();
    }
}
