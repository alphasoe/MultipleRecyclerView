package com.myanmaritc.multiplerecyclerview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myanmaritc.multiplerecyclerview.R
import com.myanmaritc.multiplerecyclerview.model.Items
import kotlinx.android.synthetic.main.recycleritems.view.*

class ItemsAdapter(var itemList: ArrayList<Items>) :
    RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder>() {
    class ItemsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(items: Items) {
            itemView.imgView.setImageResource(items.image)
            itemView.name_txtView.text = items.name
            itemView.type_txtView.text = items.type
            itemView.price_txtView.text = items.price
            itemView.rating_bar.rating = items.rating
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemsAdapter.ItemsViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycleritems, parent, false)
        return ItemsViewHolder(view)
    }

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: ItemsAdapter.ItemsViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

}