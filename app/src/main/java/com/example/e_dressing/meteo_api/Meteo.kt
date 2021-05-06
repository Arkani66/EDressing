package com.example.e_dressing.meteo_api

import com.example.e_dressing.meteo_api.data_classes.Weather
import java.lang.StringBuilder

class Meteo(meteo : MeteoResponse) {

    private var mmeteo : MeteoResponse = meteo

    fun getMeteoInfostoString() : String{
        val mbuilder : StringBuilder? = null
        val text : List<String>
        val text_meteo = "Voilà :"
       mmeteo.weather.forEach {
           //mbuilder.appendLine(it.description)
           // text.add(it.description)
           text_meteo.plus(it.description)
       }
        return text_meteo
    }
}