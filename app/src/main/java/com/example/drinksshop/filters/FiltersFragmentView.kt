package com.example.drinksshop.filters

import com.example.drinksshop.mvp.BasicView
import java.util.*

interface FiltersFragmentView : BasicView {
    fun setUpUI()
    fun getFilterMap() : HashMap<String, Boolean>
    fun goBackToCocktails(data : HashMap<String, Boolean>)
}