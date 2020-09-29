package com.myanmaritc.multiplerecyclerview.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.myanmaritc.multiplerecyclerview.Adapter.ProductsAdapter
import com.myanmaritc.multiplerecyclerview.R
import com.myanmaritc.multiplerecyclerview.model.Products
import kotlinx.android.synthetic.main.fragment_products.*

class ProductsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_products, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var productList = ArrayList<Products>()
        productList.add(
            Products(
                "30% off",
                "Iphone 8 Plus",
                "Apple",
                "980000 KS",
                R.drawable.iphone_8plus
            )
        )
        productList.add(
            Products(
                "34% off",
                "GhostBed 11 Inch Cooling Gel Memory Foam...",
                "Ghost Bed",
                "325000 KS",
                R.drawable.bed
            )
        )
        productList.add(
            Products(
                "30% off",
                "Nintendo Switch-Neon Blue and Red Joy-Con",
                "Nintendo",
                "359000 KS",
                R.drawable.nintendo_switch
            )
        )
        productList.add(
            Products(
                "34% off",
                "BELAROI Womens Comfy Swing Tunic Short...",
                "Balaroi",
                "18990 KS",
                R.drawable.women_t_shirt
            )
        )

        var productAdapter = ProductsAdapter(productList)

        productsRecyclerView.layoutManager = LinearLayoutManager(context)
        productsRecyclerView.adapter = productAdapter
    }

}