package com.example.e_dressing

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.e_dressing.meteo_api.Meteo
import com.example.e_dressing.meteo_api.MeteoApi
import com.example.e_dressing.meteo_api.MeteoResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var textMessage: TextView
   // private lateinit var mrecyclerView: RecyclerView

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                textMessage.setText(R.string.title_home)
                /*val retrofit = Retrofit.Builder()
                    .baseUrl("https://pokeapi.co/api/v2/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

                val mmeteoApi: MeteoApi = retrofit.create(MeteoApi::class.java)

                mmeteoApi.getMeteoInfos().enqueue(object : Callback<MeteoResponse> {
                    override fun onFailure(call: Call<MeteoResponse>, t: Throwable) {
                        textMessage.setText(" getMeteoInfos has failed !")
                    }

                    override fun onResponse(
                        call: Call<MeteoResponse>,
                        response: Response<MeteoResponse>
                    ) {
                        if(response.isSuccessful && response.body()!=null){
                            val mmeteoResponse : MeteoResponse = response.body()!!
                            //val mmeteoResponseString : Meteo(mmeteoResponse)
                            textMessage.text = Meteo(mmeteoResponse).getMeteoInfostoString()
                        }
                    }
                })*/
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                textMessage.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                textMessage.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        //mrecyclerView = findViewById(R.id.meteo_recyclerview)
        textMessage = findViewById(R.id.message)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }



}

