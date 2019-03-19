package com.sss.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * Created by Pactera on 2019/3/19.
 */
public class EventTest {

    public static void main(String[] args) {
        TeacherHandler tom = new TeacherHandler("Tom");
        TeacherHandler mic = new TeacherHandler("Mic");


        //这为没有@Tom老师
        Question question = new Question();
        question.setUserName("GP13095");
        question.setContent("观察者设计模式适用于哪些场景？");


        //初始化消息总线
        EventBus eventBus = new EventBus();
        // 注册订阅者
        eventBus.register(tom);
        eventBus.register(mic);
        // Event推送给订阅者
        GPerQuestionEvent gPerQuestionEvent = new GPerQuestionEvent(question);
        eventBus.post(gPerQuestionEvent);
    }

}
