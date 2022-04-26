package com.example.infocovid19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.infocovid19.api.RetrofitClient
import com.example.infocovid19.model.IndonesiaResponse
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showIndonesia()
    }
    private fun showIndonesia(){
        RetrofitClient.instance.getIndonesia().enqueue(object: Callback<ArrayList<IndonesiaResponse>>{
            override fun onResponse(
                call: Call<ArrayList<IndonesiaResponse>>,
                response: Response<ArrayList<IndonesiaResponse>>
            ) {
                val indonesia : IndonesiaResponse? = response.body()?.get(1)
                val positive : String? = indonesia?.jumlah_positif
                val hospitalize : String? = indonesia?.jumlah_dirawat
                val recover : String? = indonesia?.jumlah_sembuh
                val death : String? = indonesia?.jumlah_meninggal


                tvPositive.text = positive
                tvHospitalized.text = hospitalize
                tvRecover.text = recover
                tvDeath.text = death

            }

            override fun onFailure(call: Call<ArrayList<IndonesiaResponse>>, t: Throwable) {
                val text = "${t.message}"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }


        })
    }
}





