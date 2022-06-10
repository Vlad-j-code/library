package com.project.library.dao;

import com.project.library.entity.impl.Lang;
import com.project.library.exception.DaoException;

import java.util.List;
/**
 * Functions specific to Lang class
 */
public interface LangDao {
    List<Lang> getAll() throws DaoException;
    Lang read(long id) throws DaoException;
    Lang read(String code) throws DaoException;
}
