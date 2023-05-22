package com.example.pagertablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.pagertablayout.databinding.ActivityMainBinding
import com.example.pagertablayout.databinding.FragmentSecondBinding
import com.google.android.material.tabs.TabLayoutMediator


class SecondFragment : Fragment() {
    val binding by lazy { FragmentSecondBinding.inflate(layoutInflater) }

    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        viewPager2 = binding.vpMain
        val data = listOf("Item 1", "Item 2", "Item 3")

        viewPager2.adapter=MainVPAdater(data)

        val tabTitleArray = arrayOf(
            "One","Twe","Three"
        )

        TabLayoutMediator(binding.tabMain, binding.vpMain){tab,position ->
            tab.text = tabTitleArray[position]
        }.attach()

        return binding.root
    }


}