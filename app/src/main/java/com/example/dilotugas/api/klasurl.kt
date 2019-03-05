package com.example.dilotugas.api

import android.net.Uri
import com.example.dilotugas.BuildConfig

object klasurl {
    fun ambilheroes():String{
        val heroes = Uri.parse(BuildConfig.BASE_URL).buildUpon().appendPath("heroes").build().toString()
        return heroes
    }
}