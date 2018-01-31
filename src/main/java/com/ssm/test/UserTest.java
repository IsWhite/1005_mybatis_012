package com.ssm.test;

import com.ssm.domain.Student;
import com.ssm.domain.User;
import org.junit.Test;

import java.util.List;

/**
 * Created by dllo on 18/1/30.
 */
public class UserTest extends BastTest{
    @Test
    public void selectUsers(){
        List<User> users=userDao.selectUsers();
        for (User user : users) {
            System.out.println(user);
            System.out.println(user.getOrderses());
            System.out.println("**********");
        }
    }

}
