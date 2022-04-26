package com.example.infocovid19.api

import com.example.infocovid19.model.IndonesiaResponse
import com.example.infocovid19.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET(value =  "public/api/update.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>
    @GET(value =  "public/api/prov.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}