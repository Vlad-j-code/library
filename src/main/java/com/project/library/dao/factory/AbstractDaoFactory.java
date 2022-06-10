package com.project.library.dao.factory;

/**
 * Abstract Factory interface
 */
public interface AbstractDaoFactory {
    /**
     * @return concreate factory of given type
     */
    DaoFactoryImpl newInstance();
}
