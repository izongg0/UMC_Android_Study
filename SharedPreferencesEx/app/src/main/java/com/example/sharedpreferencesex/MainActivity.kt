package com.example.sharedpreferencesex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreferencesex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy{ ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.saveBtn.setOnClickListener {

            myApp.prefs.setString("data",binding.editArea.text.toString())

        }
        binding.getBtn.setOnClickListener {

            var data = myApp.prefs.getString("data", "abcd@gmail.com")

            binding.viewdata.text = data
        }

    }
}