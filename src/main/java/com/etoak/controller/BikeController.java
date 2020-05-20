package com.etoak.controller;

import com.etoak.bean.BikeInfo;
import com.etoak.bean.BikeInfoVo;
import com.etoak.bean.BikeRent;
import com.etoak.service.BikeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller()
@RequestMapping("/bike")
public class BikeController {

    @Autowired
    BikeService bikeService;

    @RequestMapping("/toIndex")
    public String index(){
        return "index";
    }

    @RequestMapping("/toBikeInfoList")
    public String bikeInfoList(){
        return "listBikeInfo";
    }

    @RequestMapping("/toRentInfoList")
    public String rentInfoList(){
        return "listRentInfo";
    }

    @RequestMapping("/toAdd")
    public String add(){
        return "addBike";
    }


    @RequestMapping("/addBike")
    @ResponseBody
    public Map<String,Object> addBike(BikeInfoVo bikeInfoVo){

        for (int i = 0;i < bikeInfoVo.getLeftNumber();i++){
            BikeInfo bikeInfo = new BikeInfo();
            bikeInfo.setBikeCate(bikeInfoVo.getBikeCate());
            bikeInfo.setBikeStatus(1);
            bikeInfo.setBikeSupplier(bikeInfoVo.getBikeSupplier());
            bikeInfo.setBikeType(bikeInfoVo.getBikeType());
            bikeInfo.setBikeId(UUID.randomUUID().toString().replaceAll("-",""));
            bikeService.addBike(bikeInfo);
        }

        Map<String,Object> map = new HashMap<>();
        map.put("flag","success");
        return map;
    }

    @RequestMapping("/listBike")
    @ResponseBody
    public Map<String,Object> listBike(int page,int limit,BikeInfoVo bikeInfoVo){

        PageHelper.startPage(page,limit);

        List<BikeInfoVo> list = bikeService.listBike(bikeInfoVo);
        PageInfo<BikeInfoVo> bikeInfo = new PageInfo<>(list);

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",bikeInfo.getTotal());
        map.put("data",list);
        return map;
    }

    private String type;

    @RequestMapping("/check")
    @ResponseBody
    public Map<String,Object> check(String bikeType){
        type = bikeType;
        List<BikeInfo> list = bikeService.check(type);

        Map<String,Object> map = new HashMap<>();
        if (list.size() >0){
            map.put("flag","bingo");
        }
        return map;
    }

    @RequestMapping("/checkRent")
    @ResponseBody
    public Map<String,Object> checkRent(int count,String bikeType){
        int rent = bikeService.checkRent(bikeType);

        Map<String,Object> map = new HashMap<>();
        if (count < rent){
            map.put("flag","false");
        }else{
            map.put("flag","success");
        }
        return map;
    }

    @RequestMapping("/deleteRentInfo")
    @ResponseBody
    public Map<String,Object> deleteRentInfo(String bookIds){
        Map<String,Object> map = new HashMap<>();
        String[] strings = bookIds.split(",");
        for(int i = 0; i < strings.length; i++){
            bikeService.deleteRent(strings[i]);
            bikeService.deleteInfo(strings[i]);
        }
        map.put("msg","success");
        return map;
    }
}