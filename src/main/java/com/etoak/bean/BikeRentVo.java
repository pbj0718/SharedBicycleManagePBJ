package com.etoak.bean;

import lombok.Data;

@Data
public class BikeRentVo extends BikeRent{
    private String bikeIds;
    private String bikeType;
    private String count;
}
