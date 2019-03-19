package com.sss.pattern.adapter.approveadapter.com.sss.pattern.adapter.approve;

/**
 * Created by Pactera on 2019/3/19.
 */
public interface IApproveAction {
    String onlineApprove(String receiveno);

    String offlineApprove(String receiveno);

    String oldcustomerApprove(String receiveno);
}
