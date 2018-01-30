package com.ssm.test;

import com.ssm.domain.User;
import com.ssm.mapper.ItemDao;
import com.ssm.mapper.OrderDetailDao;
import com.ssm.mapper.OrdersDao;
import com.ssm.mapper.UserDao;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dllo on 18/1/30.
 */
public class BastTest {

    protected ApplicationContext context;
    protected UserDao userDao;
    protected ItemDao itemDao;
    protected OrdersDao ordersDao;
    protected OrderDetailDao orderDetailDao;

    @Before
    public void  init(){
        context = new ClassPathXmlApplicationContext("classpath*:spring-*.xml");
        userDao = context.getBean(UserDao.class);
        itemDao = context.getBean(ItemDao.class);
        ordersDao = context.getBean(OrdersDao.class);
        orderDetailDao = context.getBean(OrderDetailDao.class);
    }
}
