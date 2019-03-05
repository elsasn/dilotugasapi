package com.example.dilotugas

import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dilotugas.api.api
import com.example.dilotugas.model.heroes
import com.example.dilotugas.model.itemheroes
import com.example.dilotugas.presenter.presenter
import com.example.dilotugas.view.MenuUtamaView
import com.google.gson.Gson
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MenuUtamaView {
    override fun DaftarHeroes(heroes_list: heroes) {
        if (progressbar.visibility == VISIBLE){
            progressbar.visibility = GONE
        }
        adapterheroes.clear()
        adapterheroes.add(itemheroes(heroes_list){

        })
        adapterheroes.notifyDataSetChanged()
    }

    override fun showLoading() {
        progressbar.visibility=VISIBLE
    }

    override fun hideLoading() {
        if (progressbar.visibility == VISIBLE){
            progressbar.visibility=GONE
        }


    }



    private lateinit var presenter: presenter

    private var adapterheroes= GroupAdapter<ViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val panggil = api()
        val gson = Gson()
        presenter = presenter(this,panggil,gson)
        presenter.panggilheroes()

        recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = adapterheroes

        }

    }
}
