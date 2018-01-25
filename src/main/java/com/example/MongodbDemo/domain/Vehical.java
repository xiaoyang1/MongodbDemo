package com.example.MongodbDemo.domain;

import lombok.Data;

import java.util.Date;

/**
 * 车辆结构属性
 */
@Data
public class Vehical {
    //卡口id
    private String deviceNumber;
    //日期时间
    private Date time;
    //车辆类型
    private String vehicleType;
    //车辆颜色
    private String vehicleColor;
    //车牌号码
    private String plateNumber;
    //车牌颜色
    private String plateColor;
    //车辆品牌
    private String vehicleBrand;
    //车辆款式
    private String vehicleStyle;
    //车辆朝向
    private String vehicleOrientations;
    //违法行为
    private String illegalAct;
    //年检标
    private String AnnualInspectionMark;
    //纸巾盒
    private String tissueBox;
    //遮阳板
    private String sunVisor;
    //挂件
    private String pendant;
    //摆件
    private String decoration;
    //无牌或者遮挡号牌
    private String NoPlate;
    //是否有可用人脸
    private int hasFace;
}
