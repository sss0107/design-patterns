package com.sss.pattern.decorator;

/**
 * Created by Pactera on 2019/3/19.
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Approve approve;

        approve = new BasicApprove();

        approve = new CheatApproveDecorator(approve);

        approve = new CreditApproveDecorator(approve);

        System.out.println(approve.doApprove());

    }
}
