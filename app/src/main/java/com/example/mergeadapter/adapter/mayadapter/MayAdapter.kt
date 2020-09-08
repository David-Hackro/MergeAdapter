package com.example.mergeadapter.adapter.mayadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mergeadapter.R
import com.example.mergeadapter.model.MayItem
import kotlinx.android.synthetic.main.item_may.view.*

class MayAdapter() : RecyclerView.Adapter<CountryViewHolder>() {

    lateinit var onMayItemListener: ((mayItem: MayItem) -> Unit)
    var mayItemList = listOf<MayItem>()

    private fun hasWhatsNewData(field: MayItem?): Boolean {
        return !field?.name.isNullOrEmpty()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_may, parent, false)

        return CountryViewHolder(view)
    }

    override fun getItemCount() = mayItemList.size

    override fun getItemViewType(position: Int): Int = R.layout.item_may

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(mayItemList[position], onMayItemListener)
    }
}