package com.sss.pattern.observer.guava;

/**
 * Created by Pactera on 2019/3/19.
 * 消息封装
 */
public class GPerQuestionEvent {
    private String name = "GPer生态圈";
    private static GPerQuestionEvent gper = null;

    private Question question;

    public String getName() {
        return name;
    }

    public GPerQuestionEvent(Question question){
        this.question = question;
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
    }

    public Question getQuestion() {
        return question;
    }
}
