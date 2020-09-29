package com.myanmaritc.multiplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myanmaritc.multiplerecyclerview.Fragment.ItemsFragment
import com.myanmaritc.multiplerecyclerview.Fragment.PlacesFragment
import com.myanmaritc.multiplerecyclerview.Fragment.ProductsFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var itemsFragment = ItemsFragment()
        var transaction = supportFragmentManager.beginTransaction()

        transaction.add(R.id.itemsFragmentContainer, itemsFragment)
        transaction.commit()

        var placesFragment = PlacesFragment()
        var transaction1 = supportFragmentManager.beginTransaction()

        transaction1.add(R.id.placesFragmentContainer, placesFragment)
        transaction1.commit()

        var productsFragment = ProductsFragment()
        var transaction2 = supportFragmentManager.beginTransaction()

        transaction2.add(R.id.produxtsFragmentContainer, productsFragment)
        transaction2.commit()
    }
}