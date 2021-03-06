package com.example.kesar.carsensetask.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by kesar on 1/7/2018.
 */

public class RetrofitClient {

    private static Retrofit retrofit = null;
    public static Retrofit getClient(String baseURL) {

        if (retrofit == null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
