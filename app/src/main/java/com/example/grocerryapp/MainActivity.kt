package com.example.grocerryapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // AdapterView - RecyclerView

        val recyclerView:RecyclerView = findViewById(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        // Data Source : List of ItemModel Objects
        val groceryItems : ArrayList<ItemModel> = ArrayList()

        val v1 = ItemModel("Fruits","Fresh Fruits from the Garden",R.drawable.fruit)
        val v2 = ItemModel("Bread","Soft and Tastier than ever",R.drawable.bread)
        val v3 = ItemModel("Beverage","Coke, Beer ,Hot/Cold Coffee",R.drawable.beverage)
        val v4 = ItemModel("Milk","100% Fresh and Healthy",R.drawable.milk)
        val v5 = ItemModel("Popcorn","Snacks Time it is!",R.drawable.popcorn)
        val v6 = ItemModel("Vegetable","Eat and become Healthy",R.drawable.vegitables)

        groceryItems.add(v1)
        groceryItems.add(v2)
        groceryItems.add(v3)
        groceryItems.add(v4)
        groceryItems.add(v5)
        groceryItems.add(v6)

        // adapter
        val adapter = MyAdapter(groceryItems)
        recyclerView.adapter=adapter




    }
}