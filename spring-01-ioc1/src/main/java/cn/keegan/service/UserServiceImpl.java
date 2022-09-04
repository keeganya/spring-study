package cn.keegan.service;

import cn.keegan.dao.UserDao;
import cn.keegan.dao.UserDaoImpl;
import cn.keegan.dao.UserDaoMysqlImpl;
import cn.keegan.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService{
//-*************************************************************
    //多态 父类型引用指向子类型对象
    //private UserDao userDao = new UserDaoImpl();
    //private UserDao userDao = new UserDaoMysqlImpl();
    //private UserDao userDao = new UserDaoOracleImpl();
//-*************************************************************

    private UserDao userDao;

    //利用set方法动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser(){
        userDao.getUser();
    }
}
