package com.project.library.dao.factory.impl.db;

import com.project.library.dao.*;
import com.project.library.dao.factory.DaoFactoryImpl;
import com.project.library.dao.impl.mysql.*;

/**
 * DBFactory implementation for MySQL
 */
public class MySQLDaoFactory implements DaoFactoryImpl {

    @Override
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }

    @Override
    public BookingDao getBookingDao() {
        return new BookingDaoImpl();
    }

    @Override
    public BookDao getBookDao() {
        return new BookDaoImpl();
    }

    @Override
    public AuthorDao getAuthorDao() {
        return new AuthorDaoImpl();
    }

    @Override
    public LangDao getLangDao() {
        return new LangDaoImpl();
    }

}