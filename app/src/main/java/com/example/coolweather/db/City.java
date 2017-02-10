package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Nois on 2017/2/10.
 */

public class City extends DataSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int proviceId;

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProviceId() {
        return proviceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProviceId(int proviceId) {
        this.proviceId = proviceId;
    }


}
