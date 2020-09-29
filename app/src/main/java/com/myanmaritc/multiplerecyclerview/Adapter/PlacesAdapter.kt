package com.myanmaritc.multiplerecyclerview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myanmaritc.multiplerecyclerview.R
import com.myanmaritc.multiplerecyclerview.model.Items
import com.myanmaritc.multiplerecyclerview.model.Places
import kotlinx.android.synthetic.main.recyclerplaces.view.*

class PlacesAdapter(var placeList: ArrayList<Places>) :
    RecyclerView.Adapter<PlacesAdapter.PlacesViewHolder>() {

    class PlacesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(place: Places) {
            itemView.country_imgView.setImageResource(place.countryImage)
            itemView.country_txtView.text = place.countryName
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlacesAdapter.PlacesViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.recyclerplaces, parent, false)
        return PlacesViewHolder(view)
    }

    override fun getItemCount(): Int = placeList.size

    override fun onBindViewHolder(holder: PlacesAdapter.PlacesViewHolder, position: Int) {
        holder.bind(placeList[position])
    }
}