package com.example.coolweather.gson;

/**
 * Created by Nois on 2017/2/13.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
