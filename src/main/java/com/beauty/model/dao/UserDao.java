package com.beauty.model.dao;

import com.beauty.model.converter.resultSetConverter.UserResultSetConverter;
import com.beauty.model.entity.User;

import java.util.List;

public class UserDao implements GenericDao<User> {

    private final DataSource dataSource;
    private final UserResultSetConverter userResultSetConverter;

    public UserDao(DataSource dataSource, UserResultSetConverter userResultSetConverter) {
        this.dataSource = dataSource;
        this.userResultSetConverter = userResultSetConverter;
    }

    @Override
    public void insert(User entity) {

    }

    @Override
    public User findById(int id) {
        return dataSource.receiveFirstRecord("select *, users.iduser as user_id from users where user_id = ?",
                resultSet -> userResultSetConverter.convert(resultSet),
                preparedStatement ->
                {
                    preparedStatement.setInt(1, id);
                }).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return dataSource.receiveRecords("select *, users.iduser as user_id from users",
                resultSet -> userResultSetConverter.convert(resultSet),
                preparedStatement ->
                {
                });
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void deleteById(int id) {

    }

    public User findUserByEmailAndPassword(String email, String password) {
        return dataSource.receiveFirstRecord("select *, users.iduser as user_id from users where email = ? and password = ?",
                resultSet -> userResultSetConverter.convert(resultSet),
                preparedStatement ->
                {
                    preparedStatement.setString(1, email);
                    preparedStatement.setString(2, password);
                }).orElse(null);
    }

    public void createUser(User user) {

        final String query = "insert into users (first_name, last_name, middle_name, login, password, email, phone, role) values(?, ?, ?, ?, ?, ?, ?, ?)";

        dataSource.implementWrite(query, ps -> {
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getLogin());
            ps.setString(4, user.getPassword());
            ps.setString(5, user.getEmail());
            ps.setInt(6, user.getPhoneNumber());
            ps.setString(7, String.valueOf(user.getRole()));
        }, r -> user.setId(r.getInt(1)));
    }
}
