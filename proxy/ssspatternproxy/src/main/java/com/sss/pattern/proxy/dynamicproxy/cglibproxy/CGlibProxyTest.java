package com.sss.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * Created by Pactera on 2019/3/16.
 */
public class CGlibProxyTest {

    public static void main(String[] args) {
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D://cglib_proxy_classes");

        Customer obj = (Customer) new CGlibFeimaotui().getInstance(Customer.class);
        System.out.println(obj);
        obj.buy();
    }
}
