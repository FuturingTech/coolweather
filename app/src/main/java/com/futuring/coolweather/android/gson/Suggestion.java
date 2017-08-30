package com.futuring.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 爱做梦的严重精神病患者 on 2017/8/29.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
