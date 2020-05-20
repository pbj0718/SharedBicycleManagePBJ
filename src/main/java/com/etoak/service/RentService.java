package com.etoak.service;

import com.etoak.bean.BikeRent;
import com.etoak.bean.BikeRentVo;

import java.util.List;

public interface RentService {
    public int addRent(BikeRent bikeRent);

    List<BikeRentVo> listBike();

    String queryId(String rentId);

    int backBike(String rentId);


}
