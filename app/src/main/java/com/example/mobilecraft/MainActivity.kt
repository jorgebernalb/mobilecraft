package com.example.mobilecraft

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler : RecyclerView =  findViewById(R.id.list_interest_places)
        val adapter : RecyclerViewAdapter = RecyclerViewAdapter()

        //configuracion del adapter
        adapter.RecyclerViewAdapter(lugares(),this)


        recycler.hasFixedSize()
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter
    }

    private fun lugares(): MutableList<LugarModel> {
        var lugaresModels : MutableList<LugarModel> = ArrayList()

        lugaresModels.add(LugarModel("MOnserrate",  "Es una iglesia hubicada en los cerros de bogota"))
        lugaresModels.add(LugarModel("MOnserrate",  "Es una iglesia hubicada en los cerros de bogota"))
        lugaresModels.add(LugarModel("MOnserrate",  "Es una iglesia hubicada en los cerros de bogota"))
        lugaresModels.add(LugarModel("MOnserrate",  "Es una iglesia hubicada en los cerros de bogota"))

    return lugaresModels
    }
}