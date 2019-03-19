package com.sss.pattern.template;

/**
 * Created by Pactera on 2019/3/19.
 */
public class ServiceA extends ConfigTemplate {
    private boolean affordDB = true;

    public ServiceA(boolean affordDB) {
        this.affordDB = affordDB;
    }

    public boolean affordDBConfig() {
        return this.affordDB;
    }

    public void addDBConfig() {
        System.out.println("需要访问数据库，添加数据库配置属性");
    }
}
