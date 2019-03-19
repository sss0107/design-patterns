package com.sss.pattern.template;

/**
 * Created by Pactera on 2019/3/19.
 */
public abstract class ConfigTemplate {

    public abstract boolean affordDBConfig();

    public abstract void addDBConfig();

    final void addBasicConfig(){
        System.out.println("添加基础配置属性");
    }

    final void addMavenConfig(){
        System.out.println("添加maven依赖属性");
    }

    final void addServiceConfig(){
        System.out.println("添加服务配置属性");
    }

    public void createService() {
        addBasicConfig();
        addMavenConfig();
        addServiceConfig();
        if (affordDBConfig()) {
            addDBConfig();
        }
    }
}
