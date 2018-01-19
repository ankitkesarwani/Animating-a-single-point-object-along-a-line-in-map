package com.example.kesar.carsensetask.Common;

import com.example.kesar.carsensetask.Remote.IGoogleAPI;
import com.example.kesar.carsensetask.Remote.RetrofitClient;

/**
 * Created by kesar on 1/7/2018.
 */

public class Common {

    public static final String baseURL = "https://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPI() {

        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);

    }
}
