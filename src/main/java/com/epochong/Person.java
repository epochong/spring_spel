package com.epochong;

/**
 * @author epochong
 * @date 2019/8/3 8:56
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Person {
    private String pname;

    private Car car;

    private String city;

    private String info;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
