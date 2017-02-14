package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Nois on 2017/2/10.
 */

public class Province extends DataSupport {
    private int id;
    private String proviceName;
    private int proviceCode;

    public int getId() {
        return id;
    }

    public String getProviceName() {
        return proviceName;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }

    public void setProviceCode(int cproviceCode) {
        this.proviceCode = cproviceCode;
    }
}
