package com.sss.pattern.adapter.approveadapter.com.sss.pattern.adapter.approve;

/**
 * Created by Pactera on 2019/3/19.
 */
public class AdapterTest {
    public static void main(String[] args) {
        IApproveAction approveAction = new ApproveAction();
        String result = approveAction.offlineApprove("123");
        System.out.println(result);
    }
}
