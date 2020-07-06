package com.itheima.dao;

import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.domain.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {

    @Test
    public void findByLoginNameAndPassword() {

        UserDao userDao = new UserDaoImpl();
        User zhangsan = userDao.findByLoginNameAndPassword("zhangsan", "1234");
        System.out.println(zhangsan);
    }
}