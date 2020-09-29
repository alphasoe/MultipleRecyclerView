package com.myanmaritc.multiplerecyclerview.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.myanmaritc.multiplerecyclerview.Adapter.ItemsAdapter
import com.myanmaritc.multiplerecyclerview.R
import com.myanmaritc.multiplerecyclerview.model.Items
import kotlinx.android.synthetic.main.fragment_items.*


class ItemsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_items, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var itemList = ArrayList<Items>()

        itemList.add(Items(R.drawable.hyde, "Hyde Park \nN41015", "LOUIS VUITTON", "99999KS", 4.0f))
        itemList.add(
            Items(
                R.drawable.lady_gaga_shirt,
                "HORNS PINK LONG SLEEVE T SHIRT",
                "Laddy Gaga",
                "72000KS",
                5.0f
            )
        )
        itemList.add(Items(R.drawable.iphone, "IPhone", "Apple", "83000KS", 4.5f))
        itemList.add(Items(R.drawable.hyde, "Hyde Park N41015", "LOUIS VUITTON", "99999KS", 3.5f))

        var itemAdapter = ItemsAdapter(itemList)

        itemsRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        itemsRecyclerView.adapter = itemAdapter
    }
}