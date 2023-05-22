package com.example.umc_study

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.umc_study.databinding.FragmentFirstBinding
import com.example.umc_study.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    val binding by lazy { FragmentSecondBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment





        return binding.root
    }


}