package com.sss.pattern.proxy.dynamicproxy.SSSproxy;

import com.sss.pattern.proxy.Person;
import com.sss.pattern.proxy.dynamicproxy.jdkproxy.Girl;

/**
 * Created by Pactera on 2019/3/16.
 */
public class SSSProxyTest {

    public static void main(String[] args) {
        try {

            // JDK动态代理的实现原理
            Person obj = (Person) new SSSFeimaotui().getInstance(new Girl());
            System.out.println(obj.getClass());
            obj.buy();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
