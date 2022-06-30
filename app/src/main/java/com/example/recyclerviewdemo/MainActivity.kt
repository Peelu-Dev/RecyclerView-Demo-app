package com.example.recyclerviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val fruitsList = listOf<Fruit>(
    Fruit("Mango","joe"),
        Fruit("Apple","peelu"),
        Fruit("Banana","harshu"),
        Fruit("PineApple","joe"),
        Fruit("Guava","harshu"),
        Fruit("Papaya","peelu"),
        Fruit("Orange","aniket"),
        Fruit("Cherry","aniket")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.setBackgroundColor(Color.YELLOW)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerViewAdapter(
            fruitsList,
        ) { selectedItem: Fruit ->
            listItemClicket(selectedItem)
        }
    }

    private fun listItemClicket(fruit: Fruit){
        Toast.makeText(
            this@MainActivity,
            "Supplier is ${fruit.supplier}",
            Toast.LENGTH_LONG
        ).show()
    }
}