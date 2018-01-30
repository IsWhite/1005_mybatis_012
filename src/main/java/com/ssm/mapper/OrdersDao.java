package com.ssm.mapper;

import com.ssm.domain.Orders;

import java.util.List;

/**
 * Created by dllo on 18/1/30.
 */
public interface OrdersDao {
    /*返回所有订单信息且包含订单所对应的用户信息*/

    List<Orders> selectOrdersAndUser();
}
