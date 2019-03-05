package com.example.dilotugas.api

import java.net.URL

class api{
    fun request(url: String): String{
        return URL(url).readText()
    }
}