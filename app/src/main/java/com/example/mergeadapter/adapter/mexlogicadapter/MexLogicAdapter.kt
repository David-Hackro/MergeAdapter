package com.example.mergeadapter.adapter.mexlogicadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mergeadapter.R
import com.example.mergeadapter.model.MexLogicItem

class MexLogicAdapter() : RecyclerView.Adapter<MexLogicViewHolder>() {

    lateinit var onMexLogicItemListener: ((mexLogic: MexLogicItem) -> Unit) //Te recomiendo siempre utilizar el listener de esta manera :)
    var mexLogicItems: List<MexLogicItem> = listOf() //lista de elementos que utilizara el adaptador

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MexLogicViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_mex_logic, parent, false)
        return MexLogicViewHolder(view)
    }

    override fun getItemViewType(position: Int): Int = R.layout.item_mex_logic

    override fun getItemCount(): Int = mexLogicItems.size

    override fun onBindViewHolder(holder: MexLogicViewHolder, position: Int) {
        holder.bind(mexLogicItems[position], onMexLogicItemListener)
    }
}