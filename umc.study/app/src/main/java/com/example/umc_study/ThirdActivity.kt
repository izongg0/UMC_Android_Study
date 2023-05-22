package com.example.umc_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.umc_study.databinding.ActivitySecondBinding
import com.example.umc_study.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    val binding by lazy { ActivityThirdBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var firstfragment = FirstFragment()
        var secondfragment = SecondFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentArea,firstfragment).commit()

        binding.firstbtn.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragmentArea,firstfragment).commit()

        }
        binding.secondbtn.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragmentArea,secondfragment).commit()

        }

        supportFragmentManager
            .setFragmentResultListener("requestKey", this) { requestKey, bundle ->
                val result = bundle.getString("bundleKey")
                binding.gettext.text = result
            }
    }
}