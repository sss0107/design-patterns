package com.sss.pattern.decorator;

/**
 * Created by Pactera on 2019/3/19.
 */
public abstract class ApproveDecorator extends Approve {

    private Approve approve;

    public ApproveDecorator(Approve approve) {
        this.approve = approve;
    }



    @Override
    String doApprove() {
        return this.approve.doApprove();
    }
}
