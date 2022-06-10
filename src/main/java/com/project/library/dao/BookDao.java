package com.project.library.dao;

import com.project.library.entity.impl.Book;
import com.project.library.exception.DaoException;

import java.util.List;

/**
 * Functions specific to Book class
 */
public interface BookDao extends AbstractSuperDao<Book> {
    List<Book> getBooksInBooking(long id) throws DaoException;
}