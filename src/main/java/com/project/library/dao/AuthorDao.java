package com.project.library.dao;

import com.project.library.entity.impl.Author;
import com.project.library.exception.DaoException;

import java.util.List;

/**
 * Functions specific to Author class
 */
public interface AuthorDao extends AbstractSuperDao<Author> {
    List<Author> findByBookID(long id) throws DaoException;
    Author read(String name) throws DaoException;
    List<Author> findByPattern(String what) throws DaoException;
}