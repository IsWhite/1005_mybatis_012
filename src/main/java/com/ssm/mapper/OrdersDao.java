package com.ssm.mapper;

import com.ssm.domain.Orders;

import java.util.List;

/**
 * Created by dllo on 18/1/30.
 */
public interface OrdersDao {
    /*一对一:返回所有订单信息且包含订单所对应的用户信息(左连接)*/
    List<Orders> selectOrdersAndUser();

    /*一对多:返回所有订单信息且包含订单明细列表信息(左连接)*/
    List<Orders> selectOrdersAndDetail();
}
