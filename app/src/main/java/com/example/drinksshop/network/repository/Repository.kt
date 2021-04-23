package com.example.drinksshop.network.repository

import com.example.drinksshop.network.api.RetrofitInstance
import com.example.drinksshop.network.model.DrinksResponse
import com.example.drinksshop.network.model.FiltersResponse
import io.reactivex.Observable

const val FILTER_KEY = "list"

class Repository {

    fun getDrinks(filter : String): Observable<DrinksResponse> {
        return RetrofitInstance.API.getDrinks(filter)

    }

    fun getFilters(): Observable<FiltersResponse> {
        return RetrofitInstance.API.getFilters(FILTER_KEY)
    }
}

