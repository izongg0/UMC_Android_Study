package com.example.pagertablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.pagertablayout.databinding.ActivityMainBinding
import com.example.pagertablayout.databinding.FragmentThirdBinding
import me.relex.circleindicator.CircleIndicator3


class ThirdFragment : Fragment() {
    val binding by lazy { FragmentThirdBinding.inflate(layoutInflater) }

    private lateinit var viewPager2: ViewPager2
    private lateinit var catVPAdater: CatVPAdater
    private lateinit var circleIndicator: CircleIndicator3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewPager2 = binding.vpMain
        circleIndicator = binding.circleIndicator

        val photoDrawableResIds = listOf(
            R.drawable.cat1,
            R.drawable.cat2,
            R.drawable.cat3
        )

//        val photoUrls = photoDrawableResIds.map { resourceId ->
//            getPhotoDrawableUrl(resourceId)
//        }

        catVPAdater = CatVPAdater(photoDrawableResIds)
        viewPager2.adapter = catVPAdater

        circleIndicator.setViewPager(viewPager2)



        return binding.root
    }


}