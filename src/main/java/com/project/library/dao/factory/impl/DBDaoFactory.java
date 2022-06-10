package com.project.library.dao.factory.impl;

import com.project.library.dao.factory.AbstractDaoFactory;
import com.project.library.dao.factory.DaoFactoryImpl;
import com.project.library.dao.factory.impl.db.MySQLDaoFactory;

/**
 * Abstract factory of DB factories
 */
public class DBDaoFactory implements AbstractDaoFactory {
    public DaoFactoryImpl newInstance() {
        return new MySQLDaoFactory();
    }
}
