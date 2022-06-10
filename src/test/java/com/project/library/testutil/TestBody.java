package com.project.library.testutil;

import com.project.library.exception.DaoException;
import com.project.library.exception.ServiceException;

import java.sql.Connection;
import java.sql.SQLException;

public interface TestBody {
    void accept(Connection c) throws ServiceException, DaoException, SQLException;
}
