package com.example.e_dressing.meteo_api

import retrofit2.Call
import retrofit2.http.GET

interface MeteoApi {
    @GET("weather")
    fun getMeteoInfos(): Call<MeteoResponse>
}