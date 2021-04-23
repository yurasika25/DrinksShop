package com.example.drinksshop.main

import com.example.drinksshop.mvp.BasicPresenter

class MainPresenter : BasicPresenter<MainView?>() {

    override fun onEnterScope() {
        super.onEnterScope()
        getView()?.onNavigateToDrinksFragment()
    }
}

