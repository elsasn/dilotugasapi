package com.example.dilotugas.view

import com.example.dilotugas.model.heroes

interface MenuUtamaView {

    fun showLoading()
    fun hideLoading()
    fun DaftarHeroes(heroes_list:heroes)

}
