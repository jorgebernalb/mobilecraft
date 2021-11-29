package com.example.mobilecraft

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException

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
    //@Throws(IOException::class)
    fun readJsonAsset(context: Context,fileName: String): String? {
        val jsonString: String
        try {
            jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }
        return jsonString

    }

    fun convertirjson(jsonString:String?): List<LugarModel> {
        val gson = Gson()
        val listlugarType = object : TypeToken<List<LugarModel>>() {}.type
        var lugares: List<LugarModel> = gson.fromJson(jsonString, listlugarType)

        return  lugares
    }


    private fun lugares(): MutableList<LugarModel> {
        var lugaresModels : MutableList<LugarModel> = ArrayList()
        var datos = readJsonAsset(applicationContext, "lugares/datos.json")
       // println(datos + "---------------" + "$datos")
        var map = convertirjson(datos)

        for (dat in map) {
           println(dat)
            lugaresModels.add(dat)
        }


        /*lugaresModels.add(LugarModel("MOnserrate",  "Es una iglesia hubicada en los cerros de bogota",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Monserrate_Sanctuary.JPG/1280px-Monserrate_Sanctuary.JPG"))
        lugaresModels.add(LugarModel("MOnserrate",  "Es una iglesia hubicada en los cerros de bogota",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Monserrate_Sanctuary.JPG/1280px-Monserrate_Sanctuary.JPG"))
        lugaresModels.add(LugarModel("MOnserrate",  "Es una iglesia hubicada en los cerros de bogota",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Monserrate_Sanctuary.JPG/1280px-Monserrate_Sanctuary.JPG"))
        lugaresModels.add(LugarModel("MOnserrate",  "Es una iglesia hubicada en los cerros de bogota",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Monserrate_Sanctuary.JPG/1280px-Monserrate_Sanctuary.JPG"))*/

    return lugaresModels
    }

}