package com.beauty.component;

import com.beauty.model.converter.UserResultSetConverter;
import com.beauty.model.dao.DataSource;
import com.beauty.model.dao.UserDao;

public class DataComponentInitializer {
    private static DataComponentInitializer initializer;

    private final DataSource dataSource;
    private final UserDao userDao;
    private final UserResultSetConverter userResultSetConverter;

    private DataComponentInitializer() {

        dataSource = new DataSource();
        userResultSetConverter = new UserResultSetConverter();
        userDao = new UserDao(dataSource, userResultSetConverter);
    }

    public static DataComponentInitializer getInstance() {
        if (initializer == null) {
            synchronized (WebComponentInitializer.class) {
                if (initializer == null) {
                    initializer = new DataComponentInitializer();
                }
            }
        }

        return initializer;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public UserDao getUserDao() {
        return userDao;
    }
}
