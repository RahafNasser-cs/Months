package com.example.months

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.months.adapter.ItemAdapter
import com.example.months.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myData = DataSource().loadMonths()
        val recycleView = findViewById<RecyclerView>(R.id.recycle_item)
        recycleView.adapter = ItemAdapter(myData, this)

        recycleView.setHasFixedSize(true)
    }
}