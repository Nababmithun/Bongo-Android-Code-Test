package com.movieplayer.base_mvvm.ui.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.movieplayer.base_mvvm.R
import com.movieplayer.base_mvvm.base.BaseRecyclerAdapter
import com.movieplayer.base_mvvm.base.BaseViewHolder
import com.movieplayer.base_mvvm.data.remote.APIs
import com.movieplayer.base_mvvm.data.remote.api_response.PopularMovieResponse
import com.movieplayer.base_mvvm.file.PicassoImageLoader
import kotlinx.android.synthetic.main.item_view_popular_movie.view.*


class PopularMovieAdapter(context: Context) :
    BaseRecyclerAdapter<PopularMovieResponse.SingleMovie>(context) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return if (viewType == VIEW_TYPE_FOOTER) {
            super.getFooterViewHolder(parent)
        } else {
            ItemViewHolder(layoutInflater.inflate(R.layout.item_view_popular_movie, parent, false))
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        if (holder is ItemViewHolder) {
            holder.bind(position)
        }
    }

    inner class ItemViewHolder(itemView: View) : BaseViewHolder(itemView) {

        override fun bind(position: Int) {
            val singleMovie = dataList[position] as PopularMovieResponse.SingleMovie
            val thumbUrl = "${APIs.THUMB_BASE}${singleMovie.posterPath}"
            PicassoImageLoader.shared.loadImage(context, thumbUrl, itemView.imgThumbPopularMovie)
        }
    }
}