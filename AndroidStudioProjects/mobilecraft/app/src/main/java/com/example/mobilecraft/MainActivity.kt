package com.example.mobilecraft

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lista = findViewById<RecyclerView>(R.id.lista)
        val exampleList = generateDummyList(3)
        lista.adapter = ExampleAdapter(exampleList)
        lista.layoutManager = LinearLayoutManager(this)
        lista.setHasFixedSize(true)
    }

    private fun generateDummyList(size: Int): List<Lugar> {
        val list = ArrayList<Lugar>()
        list.add(Lugar(R.drawable.cerro,"Cerro de Monserrate","Es el lugar más alto de la ciudad de Bogotá", ))
        list.add(Lugar(R.drawable.candelaria,"Barrio la Candelaria", "Barrio turístico de Bogotá"))
        list.add(Lugar(R.drawable.guadalupe,"Santuario de Nuestra Señora de Guadalupe", "Un santuario en medio de una reserva forestal"))
        /*for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.cerro
                1 -> R.drawable.candelaria
                else -> R.drawable.guadalupe
            }
            //val item = Lugar(drawable, nombreLugar:"item $i", desLugar:"Line 2")
            val item = Lugar(drawable, "$i", "Line 2")
            list += item
        }*/
        return list
    }
}



    /*var lugares: ArrayList<Lugar>? = null
    var lista:RecyclerView? = null
    var layout:RecyclerView.LayoutManager? = null
    var adaptador:adaptadorLugar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lugares:ArrayList<Lugar> = ArrayList()
        lugares.add(Lugar(R.drawable.cerro,"Cerro de Monserrate","Es el lugar más alto de la ciudad de Bogotá", ))
        lugares.add(Lugar(R.drawable.candelaria,"Barrio la Candelaria", "Barrio turístico de Bogotá"))
        lugares.add(Lugar(R.drawable.guadalupe,"Santuario de Nuestra Señora de Guadalupe", "Un santuario en medio de una reserva forestal"))

        val lista:RecyclerView = findViewById(R.id.lista)
        val layout:RecyclerView.LayoutManager = LinearLayoutManager(this)
        val adaptador:adaptadorLugar = adaptadorLugar(lugares)
        lista.layoutManager = layout
        lista.adapter = adaptador
    }
}*/