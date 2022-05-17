package com.movieplayer.base_mvvm.data.remote

object APIs {

    const val BASE_URL = "https://api.themoviedb.org"

    // Transaction
    const val POPULAR_MOVIES = "/3/movie/popular"
    const val THUMB_BASE = "http://image.tmdb.org/t/p/w185/"
    const val MOVIE_DETAILS = "/3/movie/{movie_id}"
    const val MOVIE_TRAILERS = "/3/movie/{movie_id}/videos"

    val NO_AUTH_URLs = arrayOf(
        ""
    )

    val CACHING_URLs = arrayOf(
        ""
    )
}