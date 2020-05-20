package com.etoak.service.impl;

import com.etoak.bean.BikeRent;
import com.etoak.bean.BikeRentVo;
import com.etoak.mapper.RentMapper;
import com.etoak.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentServiceImpl implements RentService {

    @Autowired
    RentMapper rentMapper;


    @Override
    public int addRent(BikeRent bikeRent) {
        return rentMapper.addRent(bikeRent);
    }

    @Override
    public List<BikeRentVo> listBike() {
        return rentMapper.listRent();
    }

    @Override
    public String queryId(String rentId) {
        return rentMapper.queryById(rentId);
    }

    @Override
    public int backBike(String rentId) {
        return rentMapper.backBike(rentId);
    }
}