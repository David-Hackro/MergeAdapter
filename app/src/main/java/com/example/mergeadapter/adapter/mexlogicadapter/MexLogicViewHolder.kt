package com.example.mergeadapter.adapter.mexlogicadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mergeadapter.model.MexLogicItem
import kotlinx.android.synthetic.main.item_mex_logic.view.image
import kotlinx.android.synthetic.main.item_mex_logic.view.instagram
import kotlinx.android.synthetic.main.item_mex_logic.view.twitter

class MexLogicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    /*
        Este metodo, unicamente hace dos cosas, dibuja los valores de cada tarjeta, y le asigna el listener a cada una :D

     */
    fun bind(mexLogic: MexLogicItem, onMexLogicListener: (mexLogic: MexLogicItem) -> Unit) {
        itemView.instagram.text = mexLogic.instagram
        itemView.twitter.text = mexLogic.twitter

        Glide.with(itemView.context)
            .load(mexLogic.image)
            .apply(RequestOptions().circleCrop())
            .into(itemView.image)

        setListener(mexLogic, onMexLogicListener)
    }

    private fun setListener(mayItem: MexLogicItem, onMayItemListener: (mexLogic: MexLogicItem) -> Unit) {
        itemView.setOnClickListener { onMayItemListener.invoke(mayItem) }
    }
}
