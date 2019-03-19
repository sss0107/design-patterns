package com.sss.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * Created by Pactera on 2019/3/19.
 */
public class TeacherHandler {
    private String name;
    public TeacherHandler(String name){
        this.name = name;
    }

    @Subscribe
    public void update(GPerQuestionEvent event) {
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + event.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                event.getQuestion().getContent() + "\n" +
                "提问者：" +  event.getQuestion().getUserName());
    }
}
