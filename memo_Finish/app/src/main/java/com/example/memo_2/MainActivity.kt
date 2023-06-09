package com.example.memo_2

import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.memo_2.databinding.ActivityMainBinding
import com.example.memo_2.room.RoomHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }

}