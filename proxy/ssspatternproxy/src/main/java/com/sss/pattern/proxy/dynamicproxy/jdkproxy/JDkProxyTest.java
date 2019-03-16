package com.sss.pattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Pactera on 2019/3/15.
 */
public class JDkProxyTest {

    public static void main(String[] args) {
        Object object = new JDKFeimaotui().getInstance(new Girl());
        try {
            Method method = object.getClass().getMethod("buy",null);
            method.invoke(object);


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
