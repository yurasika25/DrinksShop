package com.example.drinksshop.network.api


import com.example.drinksshop.network.model.DrinksResponse
import com.example.drinksshop.network.model.FiltersResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("/api/json/v1/1/filter.php?")
     fun getDrinks(@Query("c") filter: String): Observable<DrinksResponse>

    @GET("api/json/v1/1/list.php?")
    fun getFilters(@Query("c") list: String): Observable<FiltersResponse>

}