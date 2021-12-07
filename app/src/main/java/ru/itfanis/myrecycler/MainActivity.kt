package ru.itfanis.myrecycler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var cityRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cityList: List<City> = listOf(
            City("Москва", 12655050),
            City("Санкт-Петербург", 5384342),
            City("Сочи", 518589),
            City("Тюмень", 621918)
        )

        cityRecyclerView = findViewById(R.id.city_recycler_view)
        cityRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        cityRecyclerView.adapter = CityAdapter(cityList)
        cityRecyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
    }

}