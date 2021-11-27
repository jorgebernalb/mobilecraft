package com.example.mobilecraft

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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
        recycler.layoutManager =
            LinearLayoutManager(this)
        recycler.adapter = adapter
    }

    private fun lugares(): MutableList<LugarModel> {
        var lugaresModels : MutableList<LugarModel> = ArrayList()

        lugaresModels.add(LugarModel("MOnserrate",  "Es una iglesia hubicada en los cerros de bogota",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Monserrate_Sanctuary.JPG/1280px-Monserrate_Sanctuary.JPG"))
        lugaresModels.add(LugarModel("MOnserrate",  "Es una iglesia hubicada en los cerros de bogota",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Monserrate_Sanctuary.JPG/1280px-Monserrate_Sanctuary.JPG"))
        lugaresModels.add(LugarModel("MOnserrate",  "Es una iglesia hubicada en los cerros de bogota",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Monserrate_Sanctuary.JPG/1280px-Monserrate_Sanctuary.JPG"))
        lugaresModels.add(LugarModel("MOnserrate",  "Es una iglesia hubicada en los cerros de bogota",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Monserrate_Sanctuary.JPG/1280px-Monserrate_Sanctuary.JPG"))

    return lugaresModels
    }
}