package com.beauty.model.dao;

import java.util.List;

public interface GenericDao<T> {

    void insert(T entity);

    T findById(int id);

    List<T> findAll();

    void update(T entity);

    void deleteById(int id);

}
