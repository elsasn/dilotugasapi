package com.example.dilotugas.model

import com.example.dilotugas.R
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.list_heroes.view.*

class itemheroes(val heroes: heroes,val onclick:(heroes)->Unit): Item() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.namaheroes.text=heroes.name
        viewHolder.itemView.attackheroes.text=heroes.attack_type

    }

    override fun getLayout(): Int {
        return R.layout.list_heroes
    }

}