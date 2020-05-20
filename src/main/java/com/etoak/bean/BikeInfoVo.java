package com.etoak.bean;

import lombok.Data;

@Data
public class BikeInfoVo extends BikeInfo {
    // 剩余数量
    private int leftNumber;
    // bookid存放的id,用逗号隔开每一个id拼接在一起
    private String bikeIds;
    private int count;
}