package ru.itfanis.myrecycler

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val nameCityTextView: TextView = itemView.findViewById(R.id.name_city_text_view)
    private val populationTextView: TextView = itemView.findViewById(R.id.population_text_view)

    fun bind(city: City) {
        nameCityTextView.text = "Наименование города - ${city.name_city}"
        populationTextView.text = "Численность населения - ${city.population}"

        itemView.setOnClickListener {
            Toast.makeText(itemView.context,city.name_city,Toast.LENGTH_LONG).show()
        }

    }

}