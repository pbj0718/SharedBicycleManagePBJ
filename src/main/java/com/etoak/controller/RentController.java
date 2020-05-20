package com.etoak.controller;
/*
 *@author:李洋
 *@date:2019/8/30 13:15
 */

import com.etoak.bean.BikeInfo;
import com.etoak.bean.BikeRent;
import com.etoak.bean.BikeRentVo;
import com.etoak.service.BikeService;
import com.etoak.service.RentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/rent")
@Data
public class RentController {

    @Autowired
    BikeService bikeService;

    @Autowired
    RentService rentService;

    String bikeType;

    @RequestMapping("/toRent")
    public String toRent(String bikeType){
        this.bikeType = bikeType;
        return "rentBike";
    }

    @RequestMapping("/listType")
    @ResponseBody
    public Map<String,Object> listBike(int page,int limit){

        PageHelper.startPage(page,limit);
        BikeInfo bikeInfo = new BikeInfo();
        bikeInfo.setBikeType(bikeType);

        List<BikeInfo> list = bikeService.listByType(bikeInfo);
        PageInfo<BikeInfo> bike = new PageInfo<>(list);

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",bike.getTotal());
        map.put("data",list);
        return map;
    }

    @RequestMapping("/addRent")
    @ResponseBody
    public Map<String,Object> addRent(@RequestBody Map<String,Object> bikeRentVo){
        System.out.println(bikeRentVo);

        String ids = (String)bikeRentVo.get("bikeIds");
        String[] strings = ids.split(",");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = (String)bikeRentVo.get("rentTime");


        for (int i = 0;i < strings.length;i++){
            BikeRent bikeRent = new BikeRent();
            bikeRent.setBikeId(strings[i]);
            bikeRent.setName((String)bikeRentVo.get("name"));
            bikeRent.setRentId((String)bikeRentVo.get("rentId"));
            bikeRent.setRentStatus(0);
            bikeRent.setBikeType((String)bikeRentVo.get("bikeType"));

            try {
                Date date = sdf.parse(time);
                bikeRent.setRentTime(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            bikeRent.setPhone((String)bikeRentVo.get("phone"));
            rentService.addRent(bikeRent);
            bikeService.addRent(bikeRent);
        }
        Map<String,Object> map = new HashMap<>();
        map.put("flag","success");
        return map;
    }

    @RequestMapping("/listRent")
    @ResponseBody
    public Map<String,Object> listRent(int page,int limit){
        PageHelper.startPage(page,limit);
        List<BikeRentVo> list = rentService.listBike();
        PageInfo<BikeRentVo> bikeInfo = new PageInfo<>(list);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",bikeInfo.getTotal());
        map.put("data",list);
        return map;
    }

    private String id;

    @RequestMapping("/backBike")
    @ResponseBody
    public Map<String,Object> backBike(String rentId){
        BikeRent bikeRent = new BikeRent();
        bikeRent.setRentId(rentId);

        id = rentService.queryId(rentId);
        String[] ids = id.split(",");
        for (int i = 0;i < ids.length;i++){
            BikeInfo bikeInfo = new BikeInfo();
            bikeInfo.setBikeId(ids[i]);
            bikeService.backBike(bikeInfo);
        }

        rentService.backBike(rentId);
        Map<String,Object> map = new HashMap<>();
        map.put("flag","success");
        return map;
    }



}
