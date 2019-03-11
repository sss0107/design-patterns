package com.sss.pattern.singleton.hungry;

/**
 * Created by Pactera on 2019/3/10.
 * descript: 饿汉式
 * 在类加载时，就初始化实例
 * 优点：线程安全，执行效率高
 * 缺点：如果该类并不使用，但依然会创建对象，浪费内存
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton= new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
