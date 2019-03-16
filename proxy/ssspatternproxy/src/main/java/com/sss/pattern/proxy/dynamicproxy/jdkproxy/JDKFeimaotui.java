package com.sss.pattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Pactera on 2019/3/15.
 */
public class JDKFeimaotui implements InvocationHandler {

    private Object target;

    public Object getInstance(Object person) {
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(this.target,args);
        after();
        return object;
    }

    private void after() {
        System.out.println("已经送货上门");
    }

    private void before() {
        System.out.println("飞毛腿帮忙");
    }


}
