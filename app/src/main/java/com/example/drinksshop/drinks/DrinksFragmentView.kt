package com.example.drinksshop.drinks

import com.example.drinksshop.mvp.BasicView
import java.util.*

interface DrinksFragmentView : BasicView {
    fun navigateToFilters(filters: HashMap<String, Boolean>)
    fun setUpUI()
    fun setData(data: List<Any>)
}