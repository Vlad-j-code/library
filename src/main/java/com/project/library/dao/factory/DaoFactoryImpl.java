package com.project.library.dao.factory;

import com.project.library.dao.*;

/**
 * Concrete factory interface
 */
public interface DaoFactoryImpl {
    UserDao getUserDao();
    BookingDao getBookingDao();
    BookDao getBookDao();
    AuthorDao getAuthorDao();
    LangDao getLangDao();
}
