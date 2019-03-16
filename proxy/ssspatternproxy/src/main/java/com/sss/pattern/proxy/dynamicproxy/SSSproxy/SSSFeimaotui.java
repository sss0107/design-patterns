package com.sss.pattern.proxy.dynamicproxy.SSSproxy;

import java.lang.reflect.Method;

/**
 * Created by Pactera on 2019/3/16.
 */
public class SSSFeimaotui implements SSSInvocationHandler {

    private Object target;

    public Object getInstance(Object person){
        this.target = person;
        Class<?> clazz = target.getClass();
        return SSSProxy.newProxyInstance(new SSSClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
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
