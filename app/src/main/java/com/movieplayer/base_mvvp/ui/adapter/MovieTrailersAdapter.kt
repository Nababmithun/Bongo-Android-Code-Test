package com.movieplayer.base_mvvp.ui.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.movieplayer.android.data.network.api_response.MovieTrailerResponse
import com.movieplayer.base_mvvp.R
import com.movieplayer.base_mvvp.base.BaseRecyclerAdapter
import com.movieplayer.base_mvvp.base.BaseViewHolder
import kotlinx.android.synthetic.main.item_view_trailer.view.*


class MovieTrailersAdapter(context: Context) :
    BaseRecyclerAdapter<MovieTrailerResponse.SingleTrailer>(context) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return if (viewType == VIEW_TYPE_FOOTER) {
            super.getFooterViewHolder(parent)
        } else {
            ItemViewHolder(layoutInflater.inflate(R.layout.item_view_trailer, parent, false))
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        if (holder is ItemViewHolder) {
            holder.bind(position)
        }
    }

    inner class ItemViewHolder(itemView: View) : BaseViewHolder(itemView) {

        override fun bind(position: Int) {
            val trailerTxt = "Trailer ${position + 1}"
            itemView.tvTrailerName.text = trailerTxt
        }
    }
}