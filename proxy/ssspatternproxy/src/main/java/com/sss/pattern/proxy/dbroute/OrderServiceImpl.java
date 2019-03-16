package com.sss.pattern.proxy.dbroute;

/**
 * Created by Pactera on 2019/3/16.
 */
public class OrderServiceImpl implements IOrderService {

    private OrderDao orderDao;

    public OrderServiceImpl(){
        //如果使用Spring应该是自动注入的
        //我们为了使用方便，在构造方法中将orderDao直接初始化了
        orderDao = new OrderDao();
    }


    public int createOrder(Order order) {
        System.out.println("OrderServiceImpl调用orderDao创建订单");
        return orderDao.insert(order);
    }
}
