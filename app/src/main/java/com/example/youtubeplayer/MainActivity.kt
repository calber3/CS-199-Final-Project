package com.example.youtubeplayer

import android.os.Bundle
import android.provider.MediaStore.Video.Thumbnails.VIDEO_ID
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : YouTubeBaseActivity() {


    companion object {
        val videoID = "xWCHng2sqZE"
        val youtubeApiKey = "AIzaSyDfvoPGw2v2AWnBf6ezDKdos5kxdpTLgn4"
    }

    lateinit var youtubePlayerInitializer : YouTubePlayer.OnInitializedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(toolbar)

//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }
        initUI()
    }

    private fun initUI() {
        youtubePlayerInitializer = object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                player: YouTubePlayer?,
                p2: Boolean
            ) {
                player?.loadVideo(videoID)
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(applicationContext, "This video could not play", Toast.LENGTH_SHORT).show()
            }

        }
        playButton.setOnClickListener(View.OnClickListener {
            youtubePlayer.initialize(
            youtubeApiKey, youtubePlayerInitializer) })
    }

}
