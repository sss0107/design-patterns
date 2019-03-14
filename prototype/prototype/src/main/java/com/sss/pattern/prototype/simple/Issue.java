package com.sss.pattern.prototype.simple;

import java.util.List;

/**
 * Created by Pactera on 2019/3/13.
 */
public class Issue implements Prototype {

    private String issueContext;

    private String issueTitle;

    private List<String> attachment;

    public String getIssueContext() {
        return issueContext;
    }

    public void setIssueContext(String issueContext) {
        this.issueContext = issueContext;
    }

    public String getIssueTitle() {
        return issueTitle;
    }

    public void setIssueTitle(String issueTitle) {
        this.issueTitle = issueTitle;
    }

    public List<String> getAttachment() {
        return attachment;
    }

    public void setAttachment(List<String> attachment) {
        this.attachment = attachment;
    }


    public Issue clone() {
        Issue issue = new Issue();
        issue.setAttachment(this.attachment);
        issue.setIssueContext(this.issueContext);
        issue.setIssueTitle(this.issueTitle);
        return issue;
    }
}
