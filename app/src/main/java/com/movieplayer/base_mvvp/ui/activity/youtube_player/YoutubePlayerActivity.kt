package com.movieplayer.base_mvvp.ui.activity.youtube_player

import android.os.Bundle
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.movieplayer.base_mvvp.R
import com.movieplayer.base_mvvp.utils.Constants.Keys.IntentKeys
import kotlinx.android.synthetic.main.activity_youtube_player.*

class YoutubePlayerActivity : YouTubeBaseActivity() {

    private var trailerKey = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube_player)

        val bundle = intent.getBundleExtra(IntentKeys.DATA_BUNDLE)
        if (bundle != null) {
            trailerKey = bundle.getString(IntentKeys.TRAILER_KEY)
        }
        myYouTubePlayerView.initialize("AIzaSyC-4NmMpMOQaWE_6b6feFmQiUc_aGAcpkQ", myYouTubePlayerInitListener)
    }


    private var myYouTubePlayerInitListener = object : YouTubePlayer.OnInitializedListener {
        override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, player: YouTubePlayer?, p2: Boolean) {
            player?.loadVideo(trailerKey)
        }

        override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {

        }
    }

}
