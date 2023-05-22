package com.example.tab_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tab_viewpager.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val mainVPAdatper = MainVPAdapter(this)
        binding.vpMain.adapter = mainVPAdatper

        val tabTitleArray = arrayOf(
            "One","Twe"
        )

        TabLayoutMediator(binding.tabMain, binding.vpMain){tab,position ->
            tab.text = tabTitleArray[position]
        }.attach()
    }
}