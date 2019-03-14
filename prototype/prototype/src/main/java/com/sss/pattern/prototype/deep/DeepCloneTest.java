package com.sss.pattern.prototype.deep;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pactera on 2019/3/14.
 */
public class DeepCloneTest {

    public static void main(String[] args) {
        LegalIssue issue = new LegalIssue();
        List attachment = new ArrayList<String>();
        issue.setAttachment(attachment);
        issue.setIssueContext("合规建议内容");
        issue.setIssueTitle("合规建议标题");
        System.out.println(issue);

        LegalIssue issueCopy = issue.deepClone();
        System.out.println(issueCopy);

        System.out.println("对象地址比较:"+(issueCopy.getAttachment() == issue.getAttachment()));
    }
}
