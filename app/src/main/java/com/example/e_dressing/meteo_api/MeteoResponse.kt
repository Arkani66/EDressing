package com.example.e_dressing.meteo_api

import com.example.e_dressing.meteo_api.data_classes.*

data class MeteoResponse (
    val coord : Coord,
    val weather : List<Weather>,
    val base : String,
    val main : Main,
    val visibility : Double,
    val wind : Wind,
    val rain : Rain,
    val clouds : Clouds,
    val dt : Double,
    val sys : Sys,
    val timezone : Double,
    val id : Double,
    val name : String,
    val cod : Double
    )