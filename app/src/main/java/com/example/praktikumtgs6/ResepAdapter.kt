package com.example.praktikumtgs6

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.resep_list_item.view.*

class ResepAdapter (val resepItemList: List<resepData>, val clickListener: (resepData) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.resep_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(resepItemList[position], clickListener)
    }

    override fun getItemCount() = resepItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(resep: resepData, clickListener: (resepData) -> Unit) {
            itemView.tv_judul.text = resep.jdl
            itemView.tv_tempat.text = resep.tmp
            itemView.tv_img.setImageResource(resep.img)
            itemView.setOnClickListener{ clickListener(resep)}
        }
    }
}