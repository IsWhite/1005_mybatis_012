package com.ssm.mapper;

import com.ssm.domain.Orders;
import com.ssm.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 18/1/30.
 */
public interface UserDao {

    List<User> selectUsers();
}
