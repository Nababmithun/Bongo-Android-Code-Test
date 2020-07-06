package com.movieplayer.base_mvvp.ui.activity.movie

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.movieplayer.base_mvvp.R
import com.movieplayer.base_mvvp.adapters.PaginationScrollListener
import com.movieplayer.base_mvvp.adapters.RecyclerTouchListener
import com.movieplayer.base_mvvp.ui.adapter.PopularMovieAdapter
import com.movieplayer.base_mvvp.base.BaseActivity
import com.movieplayer.base_mvvp.data.remote.api_response.PopularMovieResponse
import com.movieplayer.base_mvvp.ui.activity.movie_details.MovieDetailsActivity
import com.movieplayer.base_mvvp.utils.Constants.Keys.IntentKeys
import com.movieplayer.base_mvvp.utils.Navigator
import kotlinx.android.synthetic.main.activity_users.*


class PopularMoviesActivity : BaseActivity<PopularMoviesViewModel>() {

    private lateinit var popularMovieAdapter: PopularMovieAdapter
    private lateinit var gridLayoutManager: GridLayoutManager

    private var currentPage: Int = 1
    private var totalPages: Int = -1 // This is a dummy value
    private var isLoadingAdded = false

    override fun getContentView(): Int {
        return R.layout.activity_users
    }

    override fun getViewModel(): PopularMoviesViewModel {
        return ViewModelProvider(this, viewModelFactory).get(PopularMoviesViewModel::class.java)
    }

    override fun onViewReady(savedInstanceState: Bundle?, intent: Intent) {
        supportActionBar?.title = "Pop Movies"
        setUpAdapter()
        mViewModel.getPopularMovies(getString(R.string.the_moviedb_api_key), currentPage)
    }

    override fun setUpDataObserver() {
        mViewModel.popularMovieResponse.observe(this, Observer<PopularMovieResponse> { response ->
            currentPage = response.page
            totalPages = response.totalPages
            if (isLoadingAdded) {
                isLoadingAdded = false
                popularMovieAdapter.removeLoadingFooter()
                popularMovieAdapter.addAll(response.movies)
            } else
                popularMovieAdapter.setData(response.movies)
        })
    }

    private fun setUpAdapter() {
        popularMovieAdapter = PopularMovieAdapter(getContext())
        popularMovieAdapter.stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY
        gridLayoutManager = if (currentScreenOrientation() == Configuration.ORIENTATION_PORTRAIT) GridLayoutManager(
            getContext(),
            2
        ) else GridLayoutManager(getContext(), 3)

        recyclerView.apply {
            layoutManager = gridLayoutManager
            adapter = popularMovieAdapter
        }

        // Spanning row for loading footer of Grid Layout Manager..............
        gridLayoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return when (popularMovieAdapter.getItemViewType(position)) {
                    popularMovieAdapter.VIEW_TYPE_FOOTER -> gridLayoutManager.spanCount
                    popularMovieAdapter.VIEW_TYPE_ITEM -> 1
                    else -> -1
                }
            }
        }


        recyclerView.addOnScrollListener(object : PaginationScrollListener(gridLayoutManager) {
            override val isLoading: Boolean
                get() = isLoadingAdded

            override fun loadMoreItems() {
                isLoadingAdded = true
                popularMovieAdapter.addLoadingFooter()
                mViewModel.getPopularMovies(getString(R.string.the_moviedb_api_key), ++currentPage)
            }

            override fun hasNextPage(): Boolean {
                return currentPage < totalPages
            }

        })

        // Passing movie id to movie details on click movie item
        recyclerView.addOnItemTouchListener(
            RecyclerTouchListener(
                getContext(),
                recyclerView,
                object : RecyclerTouchListener.ClickListener {
                    override fun onClick(view: View, position: Int) {
                        // clicked item
                        val tappedMovie = popularMovieAdapter.getItem(position) as PopularMovieResponse.SingleMovie
                        val bundle = Bundle()
                        bundle.putString(IntentKeys.MOVIE_ID, tappedMovie.id.toString())

                        Navigator.sharedInstance.navigateWithBundle(
                            getContext(),
                            MovieDetailsActivity::class.java,
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

    override fun onNetworkCallStarted() {
        if (!isLoadingAdded) super.onNetworkCallStarted()
    }
}
