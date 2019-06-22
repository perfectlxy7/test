package com.hunau.entity;
/**
 * 程序名：
 * 功能：计算圆柱底面积体积
 * 开发人员：李雪滢
 * 开发时间：2018-4-13
 * 开发公司：湖南农业大学物联网工程系
 * 开发版本：练习示例VO.1
 */

public class Circle {
    double radius;
    double height;
    double pi;
    //构造函数4个,特点：和类的名字相同，不返回值，用于初始化
    public Circle(){

    }
    public Circle(double rad,int hgt){
        this.radius=rad;
        this.height=hgt;

    }
    public Circle(double rad,int hgt,double pi){
        this.radius=rad;
        this.height=(int)hgt;
        this.pi=pi;
    }
    public Circle(double rad,double hgt,double pi){
        this.radius=rad;
        this.height=hgt;
        this.pi=pi;
    }
    //计算面积，方法2个，多态个数8，特点：名字一样，参数个数或类型不同
    public double Area(){
        return this.pi*this.radius*this.radius;
    }
    public double Area(int rad){
        return this.pi*rad*rad;
    }
    public double Area(double rad) {
        return this.pi * rad * rad;
    }
    public double Area(int rad,int pi) {
        return pi * rad * rad;
    }
    public double Area(double rad,double pi) {
        return pi * rad * rad;
    }
    //计算圆柱体积
    public double Volume(){
        return  Area()*this.height;
    }
    public double Volume(double rad,double hgt){
        return Area(rad)*hgt;
    }
    public double Volume(int rad,int hgt) {
        return Area(rad) * hgt;
    }
    public double Volume(int rad,int hgt,int pi) {
        return Area(rad, pi) * hgt;
    }
    public double Volume(double rad,double hgt,double pi) {
        return Area(rad, pi) * hgt;
    }
}
