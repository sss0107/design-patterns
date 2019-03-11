package com.sss.pattern.singleton.hungry;

/**
 * Created by Pactera on 2019/3/10.
 * descript: 静态代码块，只有在类加载时调用一次
 */
public class HungryStaticSingleton {

    public static final HungryStaticSingleton singleton;

    static {
        singleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {

    }

    public static HungryStaticSingleton getInstance() {
        return singleton;
    }
}
