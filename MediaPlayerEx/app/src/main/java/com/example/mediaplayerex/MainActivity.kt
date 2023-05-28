package com.example.mediaplayerex

import MusicPlayer
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mediaplayerex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var player : MediaPlayer?= null

//        val musicUrl = "exammusic.mp3"
//        val player = MusicPlayer(this,musicUrl)
        player = MediaPlayer.create(this, R.raw.exammusic)
        binding.start.setOnClickListener {

            player.start()
        }
        binding.stop.setOnClickListener {
            player.pause()
        }
        binding.reset.setOnClickListener {
            player.release()
        }
    }
}