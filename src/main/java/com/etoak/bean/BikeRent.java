package com.etoak.bean;

import lombok.Data;

import java.util.Date;

@Data
public class BikeRent {
    private int id;
    private String bikeId;
    private String rentId;
    private String name;
    private String bikeType;
    private String phone;
    private int rentStatus;
    private Date rentTime;
    private Date backTime;
}
