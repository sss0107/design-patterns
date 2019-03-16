package com.sss.pattern.proxy.dbroute;

/**
 * Created by Pactera on 2019/3/16.
 */
public class OrderDao {

    public int insert(Order order){
        System.out.println("订单创建成功!");
        return 1;
    }
}
