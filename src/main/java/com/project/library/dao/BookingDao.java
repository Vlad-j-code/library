package com.project.library.dao;

import com.project.library.entity.impl.Booking;
import com.project.library.exception.DaoException;

import java.util.List;
/**
 * Functions specific to Booking class
 */
public interface BookingDao extends AbstractSuperDao<Booking> {
    List<Booking> findDeliveredByUserID(long id) throws DaoException;
}