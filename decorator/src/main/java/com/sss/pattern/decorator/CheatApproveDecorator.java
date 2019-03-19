package com.sss.pattern.decorator;

/**
 * Created by Pactera on 2019/3/19.
 */
public class CheatApproveDecorator extends ApproveDecorator {
    public CheatApproveDecorator(Approve approve) {
        super(approve);
    }

    @Override
    String doApprove() {
        return super.doApprove() + " 欺诈审批";
    }
}
