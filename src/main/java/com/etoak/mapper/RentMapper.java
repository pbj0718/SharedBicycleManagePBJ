package com.etoak.mapper;

import com.etoak.bean.BikeRent;
import com.etoak.bean.BikeRentVo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RentMapper {
    public int addRent(BikeRent bikeRent);

    List<BikeRentVo> listRent();

    int backBike(String rentId);

    String queryById(String rentId);
}
