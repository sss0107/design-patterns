package com.sss.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pactera on 2019/3/14.
 * 浅克隆对于引用类型只是克隆了引用地址，所以无法满足克隆对象中含有引用类型的情况
 */
public class SimpleCloneTest {
    public static void main(String[] args) {
        Issue issue = new Issue();
        List attachment = new ArrayList<String>();
        issue.setAttachment(attachment);
        issue.setIssueContext("合规建议内容");
        issue.setIssueTitle("合规建议标题");
        System.out.println(issue);

        Client client = new Client(issue);
        Issue issueCopy = (Issue) client.startClone(issue);
        System.out.println(issueCopy);

        System.out.println("对象地址比较:"+(issueCopy.getAttachment() == issue.getAttachment()));

    }
}
