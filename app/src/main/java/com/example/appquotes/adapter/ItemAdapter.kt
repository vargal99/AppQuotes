package com.example.appquotes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appquotes.R
import com.example.appquotes.model.Quote

class ItemAdapter(private val context: Context, private val dataset: List<Quote>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // beágyazott osztály
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)  //2.resz
    }

    // uj nezeteket keszit
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // uj view letrehozasa
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    // lecsereli a nezet tartalmat
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId) // 2. resz
    }

    // az adathalmaz mérete
    override fun getItemCount(): Int {
        return dataset.size
    }
}