package com.project.library.dao.impl.mysql.func;

import com.project.library.exception.DaoException;
import com.project.library.dao.impl.mysql.util.Transaction;

import java.sql.Connection;
/**
 * Interface to be used in lambda-s in {@link Transaction} class.
 * Reads something from DB, should be used in non-transaction
 */
@FunctionalInterface
public interface DaoReader<T> {
    T proceed(Connection c) throws DaoException;
}