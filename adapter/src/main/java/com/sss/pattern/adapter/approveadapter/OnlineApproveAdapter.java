package com.sss.pattern.adapter.approveadapter;

/**
 * Created by Pactera on 2019/3/19.
 */
public class OnlineApproveAdapter implements ApproveAdapter {

    public String approve(String receiveno, Object adapter) {
        return "线上申请";
    }
}
