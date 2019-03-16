package com.sss.pattern.proxy.dbroute.proxy;

import com.sss.pattern.proxy.dbroute.db.DynamicDataSourceEntity;
import com.sss.pattern.proxy.dynamicproxy.SSSproxy.SSSClassLoader;
import com.sss.pattern.proxy.dynamicproxy.SSSproxy.SSSInvocationHandler;
import com.sss.pattern.proxy.dynamicproxy.SSSproxy.SSSProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Pactera on 2019/3/16.
 */
public class OrderServiceDynamicProxy implements SSSInvocationHandler {


    private SimpleDateFormat format = new SimpleDateFormat("yyyy");

    Object proxyObj;
    public Object getInstance(Object proxyObj) {
        this.proxyObj = proxyObj;
        Class<?> clazz = proxyObj.getClass();
        return SSSProxy.newProxyInstance(new SSSClassLoader(),clazz.getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object object = method.invoke(proxyObj,args);
        after();
        return object;
    }

    private void after() {
        System.out.println("数据源调用完成，切换回默认");
        //还原成默认的数据源
        DynamicDataSourceEntity.restore();
    }

    private void before(Object target) {
        try {
            //进行数据源的切换
            System.out.println("开始切换数据源");
            //约定优于配置
            Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRouter = Integer.valueOf(format.format(new Date(time)));
            System.out.println("代理类自动分配到DB_" + dbRouter + "数据源处理数据");
            DynamicDataSourceEntity.set(dbRouter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
