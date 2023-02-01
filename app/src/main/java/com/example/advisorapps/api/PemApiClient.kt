package com.example.advisorapps.api

import com.example.advisorapps.pemServis.ResponsePem
import retrofit2.Call
import retrofit2.http.GET

interface PemApiClient {

    @GET("adv-web/Api/saran.php")
    fun getpem():Call<ArrayList<ResponsePem>>
}