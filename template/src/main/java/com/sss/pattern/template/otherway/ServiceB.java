package com.sss.pattern.template.otherway;

import com.sss.pattern.template.ConfigTemplate;

/**
 * Created by Pactera on 2019/3/19.
 */
public class ServiceB implements ConfigTemplateInterface {
    private boolean affordDB = true;

    public ServiceB(boolean affordDB) {
        this.affordDB = affordDB;
    }

    public boolean affordDBConfig() {
        return this.affordDB;
    }

    @Override
    public void addServiceConfig() {
        System.out.println("添加服务配置属性");
    }

    @Override
    public void addMavenConfig() {
        System.out.println("添加maven依赖属性");
    }

    @Override
    public void addBasicConfig() {
        System.out.println("添加基础配置属性");
    }

    public void addDBConfig() {
        System.out.println("需要访问数据库，添加数据库配置属性");
    }
}
