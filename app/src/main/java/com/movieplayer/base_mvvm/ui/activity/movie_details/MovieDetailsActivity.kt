package com.movieplayer.base_mvvm.ui.activity.movie_details

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.movieplayer.android.data.network.api_response.MovieDetailsResponse
import com.movieplayer.android.data.network.api_response.MovieTrailerResponse
import com.movieplayer.base_mvvm.R
import com.movieplayer.base_mvvm.adapters.RecyclerTouchListener
import com.movieplayer.base_mvvm.base.BaseActivity
import com.movieplayer.base_mvvm.data.remote.APIs
import com.movieplayer.base_mvvm.file.PicassoImageLoader
import com.movieplayer.base_mvvm.ui.activity.youtube_player.YoutubePlayerActivity
import com.movieplayer.base_mvvm.ui.adapter.MovieTrailersAdapter
import com.movieplayer.base_mvvm.utils.Constants.Keys.IntentKeys
import com.movieplayer.base_mvvm.utils.DateUtils
import com.movieplayer.base_mvvm.utils.Navigator
import kotlinx.android.synthetic.main.activity_movie_details.*

class MovieDetailsActivity : BaseActivity<MovieDetailsViewModel>() {

    private lateinit var trailersAdapter: MovieTrailersAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var itemDecoration: DividerItemDecoration

    override fun getContentView(): Int {
        return R.layout.activity_movie_details
    }

    override fun getViewModel(): MovieDetailsViewModel {
        return ViewModelProvider(this, viewModelFactory).get(MovieDetailsViewModel::class.java)
    }

    override fun onViewReady(savedInstanceState: Bundle?, intent: Intent) {
        supportActionBar?.title = "MovieDetail"
        setUpAdapter()
        val bundle = intent.getBundleExtra(IntentKeys.DATA_BUNDLE)
        if (bundle != null) {
            val movieId = bundle.getString(IntentKeys.MOVIE_ID)
            val apiKey = getString(R.string.the_moviedb_api_key)
            movieId?.let { mViewModel.getMovieDetails(it, apiKey) }
            movieId?.let { mViewModel.getMovieTrailers(it, apiKey) }
        }
    }

    private fun setUpAdapter() {

        trailersAdapter = MovieTrailersAdapter(getContext())
        linearLayoutManager = LinearLayoutManager(getContext())
        itemDecoration = DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL)

        recyclerView.apply {
            adapter = trailersAdapter
            layoutManager = linearLayoutManager
            addItemDecoration(itemDecoration)
        }

        recyclerView.addOnItemTouchListener(
            RecyclerTouchListener(
                getContext(),
                recyclerView,
                object : RecyclerTouchListener.ClickListener {
                    override fun onClick(view: View, position: Int) {
                        // clicked item
                        val tappedTrailer = trailersAdapter.getItem(position) as MovieTrailerResponse.SingleTrailer
                        val bundle = Bundle()
                        bundle.putString(IntentKeys.TRAILER_KEY, tappedTrailer.key)
                        Navigator.sharedInstance.navigateWithBundle(
                            getContext(),
                            YoutubePlayerActivity::class.java,
                            IntentKeys.DATA_BUNDLE,
                            bundle
                        )
                    }

                    override fun onLongClick(view: View?, position: Int) {
                    }

                }
            )
        )
    }


    override fun setUpDataObserver() {

        // Movie Details Observer >>>
        mViewModel.movieDetailsResponse.observe(this, Observer<MovieDetailsResponse> { response ->
            llMovieDetails.visibility = View.VISIBLE

            val posterPath = "${APIs.THUMB_BASE}${response.posterPath}"
            val runtime = "${response.runtime}min"
            val rating = "${response.voteAverage}/10"
            val releaseYear = DateUtils.shared.formateDate("yyyy-MM-dd", response.releaseDate, "yyyy")

            tvMovieName.text = response.originalTitle
            PicassoImageLoader.shared.loadImage(getContext(), posterPath, imgMoviePoster)
            tvReleaseYear.text = releaseYear
            tvRuntime.text = runtime
            tvRating.text = rating
            tvMovieDetails.text = response.overview
        })


        // Movie Trailer Observer >>>
        mViewModel.trailerResponse.observe(this, Observer<MovieTrailerResponse> { response ->
            trailersAdapter.setData(response.results)
        })
    }
}
