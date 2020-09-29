package com.myanmaritc.multiplerecyclerview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myanmaritc.multiplerecyclerview.R
import com.myanmaritc.multiplerecyclerview.model.Products
import kotlinx.android.synthetic.main.recyclerproducts.view.*

class ProductsAdapter(var productList: ArrayList<Products>) :
    RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder>() {

    class ProductsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(product: Products) {
            itemView.discount_txtView.text = product.discount
            itemView.name_txtView.text = product.name
            itemView.type_txtView.text = product.type
            itemView.price_txtView.text = product.price
            itemView.imgView.setImageResource(product.image)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductsAdapter.ProductsViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.recyclerproducts, parent, false)
        return ProductsViewHolder(view)
    }

    override fun getItemCount(): Int = productList.size

    override fun onBindViewHolder(holder: ProductsAdapter.ProductsViewHolder, position: Int) {
        holder.bind(productList[position])
    }

}