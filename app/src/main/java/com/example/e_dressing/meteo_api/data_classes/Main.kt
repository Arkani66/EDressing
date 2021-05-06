package com.example.e_dressing.meteo_api.data_classes

data class Main (
    val temp : Int,
    val feels_like : Int,
    val temp_min : Int,
    val temp_max : Int,
    val pressure : Double,
    val humidity : Double
    )