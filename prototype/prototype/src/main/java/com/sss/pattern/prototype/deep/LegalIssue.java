package com.sss.pattern.prototype.deep;

import com.sss.pattern.prototype.simple.Prototype;

import java.io.*;
import java.util.List;

/**
 * Created by Pactera on 2019/3/13.
 */
public class LegalIssue implements Cloneable,Serializable {

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


    public LegalIssue deepClone() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            LegalIssue issueCopy = (LegalIssue) ois.readObject();
            return issueCopy;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }
}
