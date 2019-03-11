package com.sss.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Pactera on 2019/3/11.
 * descript: 注册式容器单例，spring的做法
 *
 */
public class ContainerSingleton {

    private ContainerSingleton() {

    }

    private static Map<String,Object> map = new ConcurrentHashMap<String,Object>();

    public static Object getInstance(String className) {
        synchronized (map) {
            if (!map.containsKey(className)) {
                Object object = null;
                try {
                    object = Class.forName(className).newInstance();
                    map.put(className, object);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return object;
            } else {
                return map.get(className);
            }
        }
    }
}
