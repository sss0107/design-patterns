package com.sss.pattern.adapter.approveadapter.com.sss.pattern.adapter.approve;

import com.sss.pattern.adapter.approveadapter.ApproveAdapter;
import com.sss.pattern.adapter.approveadapter.OfflineApproveAdapter;
import com.sss.pattern.adapter.approveadapter.OldcustomerApproveAdapter;
import com.sss.pattern.adapter.approveadapter.OnlineApproveAdapter;

/**
 * Created by Pactera on 2019/3/19.
 */
public class ApproveAction implements IApproveAction {

    public String approve(String receiveno, Class<? extends ApproveAdapter> clazz) {
        try {
            ApproveAdapter approveAdapter = clazz.newInstance();
            return approveAdapter.approve(receiveno, approveAdapter);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String onlineApprove(String receiveno) {
        return approve(receiveno, OnlineApproveAdapter.class);
    }

    public String offlineApprove(String receiveno) {
        return approve(receiveno, OfflineApproveAdapter.class);
    }

    public String oldcustomerApprove(String receiveno) {
        return approve(receiveno, OldcustomerApproveAdapter.class);
    }
}
