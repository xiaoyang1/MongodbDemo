package com.example.MongodbDemo.domain;

import lombok.Data;

import java.util.Date;

/**
 *  行人结构化属性类
 */

@Data
public class Pedestrian {

    private String _id;
    //卡口id
    private String deviceNumber;
    //日期时间
    private Date time;
    //性别
    private String gender;
    //年龄
    private int age;
    //眼镜
    private String glasses;
    //墨镜
    private String sunGlasses;
    //口罩
    private String mask;
    //发型特征(长发，短发，光头，帽子)
    private String hairStyle;
    //头部特征（黑、白、红、黄、蓝、绿、紫、棕、灰、橙、多色）
    private String headStyle;
    //上身衣着类型（马甲吊带背心、衬衫、西服、T恤、毛衣、皮夹克、羽绒服、大衣风衣、连衣裙、无上衣）
    private String upperBodyClothType;
    //上身衣着颜色：（黑、白、红、黄、蓝、绿、紫、棕、灰、橙、多色）
    private String upperBodyClothColor;
    //下身衣着类型：（长裤，短裤，长裙，短裙，连衣裙）
    private String lowerBodyClothType;
    //下身衣着颜色（黑、白、红、黄、蓝、绿、紫、棕、灰、橙、多色）
    private String lowerBodyClothColor;
    //衣服纹理（纯色、碎花、条纹、格子）
    private String clothTexture;
    //鞋子类型（光脚、皮鞋、高跟鞋、运动鞋、靴子、凉鞋）
    private String shoesType;
    //鞋子颜色(黑、白、红、黄、蓝、绿、紫、棕、灰、橙、多色)
    private String shoesColor;
    //携带包的类型（单肩包、双肩包、拉杆箱、手提包）
    private String bagType;
    //携带包颜色（黑、白、红、黄、蓝、绿、紫、棕、灰、橙、多色）
    private String bagColor;
    //体态（胖中瘦）
    private String posture;
    //名族
    private String nation;
    //携带物（打伞、抱小孩、手上包裹）
    private String carryObject;
    //朝向（正面、背面、侧面）
    private String orientations;
    //是否有可用人脸(0  yes, 1  no)
    private int hasFace;

}
