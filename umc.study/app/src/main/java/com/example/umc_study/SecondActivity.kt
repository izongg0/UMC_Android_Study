package com.example.umc_study

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.umc_study.databinding.ActivityMainBinding
import com.example.umc_study.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = getIntent()
        val getdata = intent.getStringExtra("data")


        binding.gettext.text = getdata

        binding.movethird.setOnClickListener {
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)

        }
        binding.movefirst.setOnClickListener {

//            var STRING_INTENT_KEY = "aa"
//            val mIntent = Intent(this,MainActivity::class.java).apply {
//                putExtra(MainActivity.STRING,"BACK")
//            }

        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    companion object {
        private const val TAG = "로그 확인"
    }
}