package com.movieplayer.base_mvvp.base
import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder protected constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

    protected val TAG: String  by lazy {
        this.javaClass.simpleName
    }

    abstract fun bind(position: Int)

}