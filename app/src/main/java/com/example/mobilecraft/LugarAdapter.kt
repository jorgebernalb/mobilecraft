package com.example.mobilecraft

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter


class LugarAdapter (val mContext: Context, val listalugares: List<Lugar>): ArrayAdapter<Lugar>(mContext, resource = 0, listalugares){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, attachToRoot = false )
        val lugar =  listalugares[position]
        layout.nombre.text = lugar.nombre
        layout.descripcion.text=  lugar.descripcion
        layout.imageView.setImageResource(lugar.imagen)
        return layout
    }

}