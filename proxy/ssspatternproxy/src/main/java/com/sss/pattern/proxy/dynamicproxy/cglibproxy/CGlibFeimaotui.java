package com.sss.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Pactera on 2019/3/16.
 */
public class CGlibFeimaotui implements MethodInterceptor{


    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }



    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object object = methodProxy.invokeSuper(o,objects);
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
