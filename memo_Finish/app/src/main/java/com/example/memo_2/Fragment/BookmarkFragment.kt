package com.example.memo_2.Fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.memo_2.R
import com.example.memo_2.databinding.FragmentBookmarkBinding
import com.example.memo_2.myApp


class BookmarkFragment : Fragment() {

    val binding by lazy { FragmentBookmarkBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        var list = myApp.prefs.getFavoriteMemos()

        Log.d("qnrakzm",list.toString())

        binding.booklist.text = list.toString()


        return binding.root
    }


}