package com.example.drinksshop.network.api

import com.example.drinksshop.utils.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy {
       Retrofit.Builder()
           .baseUrl(BASE_URL)
           .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
           .addConverterFactory(GsonConverterFactory.create())
           .build()
    }

    val API: Api by lazy {
        retrofit.create(Api::class.java)
    }
}