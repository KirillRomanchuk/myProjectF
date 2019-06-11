package com.beauty.model.converter.resultSetConverter;

import com.beauty.model.converter.Converter;
import com.beauty.model.entity.Master;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MasterResultSetConverter implements Converter<ResultSet, Master> {
    @Override
    public Master convert(ResultSet resultSet) throws SQLException {
        Master master = new Master();
        master.setId(resultSet.getInt("iduser"));
        master.setService(resultSet.getString("service"));
        master.setFirstName(resultSet.getString("first_name"));
        master.setLastName(resultSet.getString("last_name"));
        return master;
    }
}
