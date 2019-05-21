package com.beauty.model.converter.resultSetConverter;

import com.beauty.model.converter.Converter;
import com.beauty.model.entity.Master;
import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;

public class MasterResultSetConverter implements Converter<ResultSet, Master> {
    @Override
    public Master convert(ResultSet resultSet) throws Exception {
        Master master = new Master();
        master.setId(resultSet.getInt("iduser"));
        master.setService(resultSet.getString("service"));
        return master;
    }
}
