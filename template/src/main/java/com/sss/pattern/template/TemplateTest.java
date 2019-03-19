package com.sss.pattern.template;

/**
 * Created by Pactera on 2019/3/19.
 */
public class TemplateTest {

    public static void main(String[] args) {
        System.out.println("ServiceA开始创建");
        ConfigTemplate serviceA = new ServiceA(true);
        serviceA.createService();
    }
}
