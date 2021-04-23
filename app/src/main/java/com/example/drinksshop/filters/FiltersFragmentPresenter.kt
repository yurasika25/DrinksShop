package com.example.drinksshop.filters

import com.example.drinksshop.mvp.BasicPresenter
import java.util.*

class FiltersFragmentPresenter : BasicPresenter<FiltersFragmentView?>() {

    private var filterMap: HashMap<String, Boolean> = HashMap()

    override fun onEnterScope() {
        super.onEnterScope()
        getView()?.getFilterMap()?.let { filterMap = it }
        getView()?.setUpUI()
    }

    fun onApplyFiltersClicked()
    {
        getView()?.goBackToCocktails(filterMap)
    }

    fun onFiltersReceived(filter: String, isChecked: Boolean) {
        filterMap[filter] = isChecked
    }


}

