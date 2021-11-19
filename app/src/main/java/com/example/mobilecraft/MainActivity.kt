package com.example.mobilecraft

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val arrayAdapter: ArrayAdapter<*>

        val values = arrayOf(
            "Android", "iPhone", "WindowsMobile",
            "Blackberry", "WebOS", "Ubuntu", "Windows7", "MacOS X",
            "Linux", "Windows8.1", "Lollipop", "iOS",
            "Lubuntu", "Kali linux", "Windows10", "Windows XP",
            "Symbian"
        )*/
        val lugar= Lugar("Moncerrate",
            "Al levantar la mirada desde cualquier punto de la ciudad, es imposible no toparse con aquel Cerro que desde sus 3.152 metros a nivel del mar",
        R.drawable.ic_launcher_background)

        val lugar2 = Lugar("Museo Nacional","Museo de bogota", R.drawable.ic_launcher_foreground)

        val listalugares = listOf(lugar,lugar2)
        val adapter = LugarAdapter(this, listalugares)

        lista.adapter =  adapter

        /*var mListView = findViewById<ListView>(R.id.list_interest_places)


        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, values)
        mListView.adapter = arrayAdapter*/
    }
}