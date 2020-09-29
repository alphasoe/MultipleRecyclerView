package com.myanmaritc.multiplerecyclerview.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.myanmaritc.multiplerecyclerview.Adapter.PlacesAdapter
import com.myanmaritc.multiplerecyclerview.R
import com.myanmaritc.multiplerecyclerview.model.Places
import kotlinx.android.synthetic.main.fragment_places.*

class PlacesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_places, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var countryList = ArrayList<Places>()
        countryList.add(Places(R.drawable.japan, "Japan"))
        countryList.add(Places(R.drawable.korea, "Korea"))
        countryList.add(Places(R.drawable.china, "China"))
        countryList.add(Places(R.drawable.international, "International"))
        var countryAdapter = PlacesAdapter(countryList)

        placesRecyclerView.layoutManager = GridLayoutManager(context, 2)
        placesRecyclerView.adapter = countryAdapter

    }
}