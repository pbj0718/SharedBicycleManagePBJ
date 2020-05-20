package com.etoak.mapper;

import com.etoak.bean.BikeInfo;
import com.etoak.bean.BikeInfoVo;
import com.etoak.bean.BikeRent;
import com.etoak.bean.BikeRentVo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BikeMapper {
    public int addBike(BikeInfo bikeInfo);

    public List<BikeInfoVo> listBike(BikeInfoVo bikeInfoVo);

    List<BikeInfo> listByType(BikeInfo bikeInfo);

    int addRent(BikeRent bikeRent);

    int backBike(BikeInfo bikeInfo);

    List<BikeInfo> check(String type);

    int checkRent(String bikeType);

    int deleteInfo(String bikeId);

    int deleteRent(String bikeId);
}
