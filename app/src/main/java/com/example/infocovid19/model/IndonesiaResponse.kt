package com.example.infocovid19.model

data class IndonesiaResponse(

    val jumlah_positif : String,
    val jumlah_sembuh : String,
    val jumlah_dirawat : String,
    val jumlah_meninggal : String,
)

data class Update(
    val total : String
)

data class CovidRespone(
    var update: Update
)