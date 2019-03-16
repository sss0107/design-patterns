package com.sss.pattern.proxy.simpleproxy;

/**
 * Created by Pactera on 2019/3/14.
 */
public class BuyFoodProxy implements BuyFood {

    private BuyFood buyFood;

    public BuyFoodProxy(BuyFood buyFood) {
        this.buyFood = buyFood;
    }

    public void buy() {
        buyFood.buy();
    }


}
