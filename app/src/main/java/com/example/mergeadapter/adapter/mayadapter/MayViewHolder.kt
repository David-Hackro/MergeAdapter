package com.example.mergeadapter.adapter.mayadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.mergeadapter.model.MayItem
import kotlinx.android.synthetic.main.item_may.view.name

class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(mayItem: MayItem, onMayItemListener: (mayItem: MayItem) -> Unit) {
        itemView.name.text = mayItem.name
        setListener(mayItem, onMayItemListener)
    }

    private fun setListener(mayItem: MayItem, onMayItemListener: (mayItem: MayItem) -> Unit) {
        itemView.setOnClickListener { onMayItemListener.invoke(mayItem) }
    }
}
