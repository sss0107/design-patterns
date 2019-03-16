package com.sss.pattern.proxy.dbroute.proxy;

import com.sss.pattern.proxy.dbroute.IOrderService;
import com.sss.pattern.proxy.dbroute.Order;
import com.sss.pattern.proxy.dbroute.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Pactera on 2019/3/16.
 */
public class OrderServiceStaticProxy implements IOrderService{
    private SimpleDateFormat format = new SimpleDateFormat("yyyy");

    private IOrderService orderService;
    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    public int createOrder(Order order) {
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(format.format(new Date(time)));
        System.out.println("静态代理类自动分配到DB_" +  dbRouter + "数据源处理数据" );
        DynamicDataSourceEntity.set(dbRouter);
        this.orderService.createOrder(order);
        DynamicDataSourceEntity.restore();
        return 0;
    }
}
