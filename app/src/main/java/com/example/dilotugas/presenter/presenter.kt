package com.example.dilotugas.presenter

import com.example.dilotugas.api.api
import com.example.dilotugas.api.klasurl
import com.example.dilotugas.model.heroes
import com.example.dilotugas.view.MenuUtamaView
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class presenter(val view: MenuUtamaView,val api: api,val gson: Gson) {
    fun panggilheroes(){
        view.showLoading()
        doAsync {
            val heroes = gson.fromJson(api.request(klasurl.ambilheroes()),heroes::class.java)
            uiThread { view.hideLoading()
            view.DaftarHeroes(heroes)}
        }
    }
}
