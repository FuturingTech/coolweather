package com.futuring.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 爱做梦的严重精神病患者 on 2017/8/29.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
