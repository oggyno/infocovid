package com.example.infocovid19.model

import com.google.gson.annotations.SerializedName

data class Province(
    val key : String,
    val jumlah_kasus : Int,
    val jumlah_sembuh : Int,
    val jumlah_meninggal : Int,
    val jumlah_dirawat : Int


)