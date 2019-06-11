package com.beauty.model.dao;

import com.beauty.model.converter.resultSetConverter.MasterResultSetConverter;
import com.beauty.model.entity.Master;

import java.util.List;

public class MasterDao implements GenericDao<Master> {

    private final DataSource dataSource;
    private final MasterResultSetConverter masterResultSetConverter;

    public MasterDao(DataSource dataSource, MasterResultSetConverter masterResultSetConverter) {
        this.dataSource = dataSource;
        this.masterResultSetConverter = masterResultSetConverter;
    }

    @Override
    public void insert(Master entity) {

    }

    @Override
    public Master findById(int id) {
        return null;
    }

    @Override
    public List<Master> findAll() {
        return dataSource.receiveRecords("select * from masters left join users using (iduser)",
                resultSet -> masterResultSetConverter.convert(resultSet),
                preparedStatement ->
                {
                });
    }

    @Override
    public void update(Master entity) {

    }

    @Override
    public void deleteById(int id) {

    }
}
