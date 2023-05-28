package com.example.threadtimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import com.example.threadtimer.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var total = 0
        var started = false

        val handler = object  : Handler() {
            override fun handleMessage(msg: Message) {
                val minute = String.format("%02d",total /60)
                val second = String.format("%02d",total %60)
                binding.timeArea.text = "$minute : $second"

            }
        }

        binding.start.setOnClickListener {
            if( started == false){
                started = true
//                total = 0

                thread(start = true){ // Thread 생성
                    while (started){ // started가 true일 경우에 반복
                        Thread.sleep(1000) // 1초마다 반복
                        if(started){
                            total += 1
                            handler?.sendEmptyMessage(0)
                        }
                    }

                }

            }
        }


        binding.stop.setOnClickListener {
            started = false
        }
        binding.reset.setOnClickListener {
            total = 0

            binding.timeArea.text = "00 : 00"

        }
    }
}