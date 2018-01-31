package com.ssm.test;

import com.ssm.domain.Orders;
import org.junit.Test;

import java.util.List;

/**
 * Created by dllo on 18/1/30.
 */
public class OrderTest extends BastTest {
    @Test
    public void selectOrdersAndUser(){
        /*查询订单信息,同时查询订单所属用户信息*/
        List<Orders> orderss=ordersDao.selectOrdersAndUser();
        for (Orders orders : orderss) {
            System.out.println(orders);
            System.out.println(orders.getUser());
            System.out.println("******");
        }
    }

    @Test
    public void selectOrdersAndDetail(){
        /*查询订单 包含明细*/
        List<Orders> orderss=ordersDao.selectOrdersAndDetail();
        for (Orders o : orderss) {
            System.out.println(o);
            System.out.println(o.getOrderDetails());
            System.out.println("********");
        }
    }
}
