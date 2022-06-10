package com.project.library.dao;

import com.project.library.entity.impl.User;
import com.project.library.exception.DaoException;

import java.util.List;
/**
 * Functions specific to User class
 */
public interface UserDao extends AbstractSuperDao<User> {
    User findByEmail(String email) throws DaoException;
    List<User> getAll() throws DaoException;
}