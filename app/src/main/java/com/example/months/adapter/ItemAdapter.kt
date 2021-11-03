package com.example.months.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.months.R
import com.example.months.model.Months

class ItemAdapter(private val dataset: List<Months>,
                  private val context: Context
                  ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(var view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.title_item)
        val imageView: ImageView = view.findViewById(R.id.month_icon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adaoterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adaoterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.stringResourceIdImg)
    }

    override fun getItemCount() = dataset.size
}