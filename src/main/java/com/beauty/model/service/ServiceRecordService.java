package com.beauty.model.service;

import com.beauty.model.converter.ServiceRecordConverter;
import com.beauty.model.dao.ServiceRecordDao;

public class ServiceRecordService {

    private final ServiceRecordConverter serviceRecordConverter;
    private final ServiceRecordDao serviceRecordDao;

    public ServiceRecordService(ServiceRecordDao serviceRecordDao, ServiceRecordConverter serviceRecordConverter) {
        this.serviceRecordDao = serviceRecordDao;
        this.serviceRecordConverter = serviceRecordConverter;
    }
}
