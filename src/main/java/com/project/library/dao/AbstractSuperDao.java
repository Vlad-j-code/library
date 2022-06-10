package com.project.library.dao;

import com.project.library.entity.Entity;
import com.project.library.exception.DaoException;
import com.project.library.exception.ServiceException;

import java.util.List;

/**
 * Common functions for some entities, which suppose to be searched by pattern with pagination
 * @param <E> sub-class of Entity
 */
public interface AbstractSuperDao<E extends Entity> extends AbstractEntityDao<E> {
    List<E> findByPattern(String what, String searchBy, String sortBy, int num, int page)
            throws ServiceException, DaoException;
    int findByPatternCount(String what, String searchBy)
            throws ServiceException, DaoException;
    List<E> findBy(String what, String searchBy) throws ServiceException, DaoException;
}