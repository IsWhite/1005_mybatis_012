package com.ssm.test;

import com.ssm.domain.Clazz;
import com.ssm.domain.Student;
import com.ssm.mapper.StudentDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 18/1/29.
 */
public class StudentTest {

    private ApplicationContext context;
    private StudentDao studentDao;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("classpath*:spring-*.xml");
        studentDao = context.getBean(StudentDao.class);
    }

    @Test
    public  void testSelectAll(){
        List<Student> students =studentDao.selectAll();
        System.out.println(students);
    }

    @Test
    public void selectById(){
        Student student =studentDao.selectById(17);
        System.out.println(student);
    }

    @Test
    public void insertStudent(){
        Student student =new Student("张三","123");
        int key =studentDao.insertStudent(student);
        System.out.println("插入的个数为"+key);
        System.out.println("主键id为"+student);//增加了useGeneratedKeys属性
    }

    @Test
    public void deleteById(){
        int count =studentDao.deleteById(19);
        System.out.println(count);
    }
    @Test
    public void updateById(){
        Student student =studentDao.selectById(17);
        student.setName("王");
        student.setPassword("111");

        int count =studentDao.updateById(student);
        System.out.println(count);
    }


}
