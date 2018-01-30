package com.ssm.test;

import com.ssm.domain.Clazz;
import com.ssm.mapper.ClazzDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 18/1/30.
 */
public class ClazzTest {

    private ApplicationContext context;
    private ClazzDao clazzDao;

    @Before
    public void  init(){
        context = new ClassPathXmlApplicationContext("classpath*:spring-*.xml");
        clazzDao = context.getBean(ClazzDao.class);
    }

    @Test
    public void select(){
        Clazz param=new Clazz();
        /*三种属性都能查出来*/
//        param.setId(1);
//        param.setName("白胡子海贼团");
        param.setInfor("10人");

        /*调用条件查询*/
        List<Clazz> clazzs =clazzDao.select(param);
        System.out.println(clazzs);

    }
    /*批量查询*/
    @Test
    public void  selectID(){
        List<Integer> param=new ArrayList<Integer>();
        param.add(1);
        param.add(2);
        param.add(4);

        List<Clazz> clazzs =clazzDao.selectInID(param);
        System.out.println("输出"+clazzs);//
    }

}
