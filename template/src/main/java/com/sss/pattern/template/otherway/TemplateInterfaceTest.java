package com.sss.pattern.template.otherway;

/**
 * Created by Pactera on 2019/3/19.
 */
public class TemplateInterfaceTest {

    public static void main(String[] args) {
        System.out.println("ServiceA开始创建");
        ConfigTemplateInterface service = new ServiceB(true);
        service.createService();
    }
}
