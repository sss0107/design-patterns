package com.sss.pattern.template.otherway;

/**
 * Created by Pactera on 2019/3/19.
 */
public interface ConfigTemplateInterface {



    default void createService() {
        addBasicConfig();
        addMavenConfig();
        addServiceConfig();
        if (affordDBConfig()) {
            addDBConfig();
        }

    }

    void addDBConfig();


    boolean affordDBConfig();


    void addServiceConfig();


    void addMavenConfig();

    void addBasicConfig();
}
