package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Nois on 2017/2/13.
 */

public class Now {
    @SerializedName("temp")
    public String temperature;

    @SerializedName("cond")
    public  More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}