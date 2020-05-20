package com.etoak.service.impl;

import com.etoak.bean.BikeInfo;
import com.etoak.bean.BikeInfoVo;
import com.etoak.bean.BikeRent;
import com.etoak.mapper.BikeMapper;
import com.etoak.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeServiceImpl implements BikeService {

    @Autowired
    BikeMapper bikeMapper;

    @Override
    public List<BikeInfo> check(String type) {
        return bikeMapper.check(type);
    }


    @Override
    public int addBike(BikeInfo bikeInfo) {
        return bikeMapper.addBike(bikeInfo);
    }

    @Override
    public List<BikeInfoVo> listBike(BikeInfoVo bikeInfoVo) {
        return bikeMapper.listBike(bikeInfoVo);
    }

    @Override
    public List<BikeInfo> listByType(BikeInfo bikeInfo) {
        List<BikeInfo> list = bikeMapper.listByType(bikeInfo);
        return list;
    }

    @Override
    public int addRent(BikeRent bikeRent) {
        return bikeMapper.addRent(bikeRent);
    }

    @Override
    public int backBike(BikeInfo bikeInfo) {
        return bikeMapper.backBike(bikeInfo);
    }

    @Override
    public int checkRent(String bikeType) {
        return bikeMapper.checkRent(bikeType);
    }

    @Override
    public int deleteInfo(String bikeId) { return bikeMapper.deleteInfo(bikeId); }

    @Override
    public int deleteRent(String bikeId) { return bikeMapper.deleteRent(bikeId); }
}
