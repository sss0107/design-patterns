package com.sss.pattern.decorator;

/**
 * Created by Pactera on 2019/3/19.
 */
public class CreditApproveDecorator extends ApproveDecorator {
    public CreditApproveDecorator(Approve approve) {
        super(approve);
    }

    @Override
    String doApprove() {
        return super.doApprove() + " 授信审批";
    }
}
