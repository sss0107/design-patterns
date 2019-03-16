package com.sss.pattern.proxy.dynamicproxy.SSSproxy;

import java.lang.reflect.Method;

/**
 * Created by Pactera on 2019/3/16.
 */
public interface SSSInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
