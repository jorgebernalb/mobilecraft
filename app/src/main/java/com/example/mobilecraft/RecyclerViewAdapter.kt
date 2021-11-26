package com.example.mobilecraft

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


//extiende de ecyclerViewAdapter que recibe el REciclerVireAdapter.ViewHolder
class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    var lugares : MutableList<LugarModel> = ArrayList()
    lateinit var context : Context

    fun RecyclerViewAdapter(lugares:MutableList<LugarModel>, context:Context){
        this.lugares= lugares
        this.context = context
    } //constructor

    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
//view de tipo view extiende
        val nombre:TextView
        val descripcion:TextView
        init {
            nombre = view.findViewById(R.id.nombre)
            descripcion = view.findViewById(R.id.descripcion)
            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder { //Relacionarlo con nuestra tarejta layout list_items
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) { //pasarle la infomacion  a los componentes en este caos un modelo
        holder.nombre.text= lugares[position].nombre
        holder.descripcion.text = lugares[position].descripcion

    }

    override fun getItemCount() = lugares.size

}