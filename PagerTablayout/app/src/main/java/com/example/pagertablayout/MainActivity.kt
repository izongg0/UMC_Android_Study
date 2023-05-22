package com.example.pagertablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pagertablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.
        beginTransaction()
            .replace(binding.navArea.id,FirstFragment()).
            commitAllowingStateLoss()

        binding.bottomNav.run{
            setOnItemSelectedListener {
                when (it.itemId){
                    R.id.action_first -> {
                        supportFragmentManager.
                        beginTransaction()
                            .replace(binding.navArea.id,FirstFragment()).
                            commitAllowingStateLoss()
                    }
                    R.id.action_second -> {
                        supportFragmentManager.
                        beginTransaction()
                            .replace(binding.navArea.id,SecondFragment()).
                            commitAllowingStateLoss()
                    }
                    R.id.action_third -> {
                        supportFragmentManager.
                        beginTransaction()
                            .replace(binding.navArea.id,ThirdFragment()).
                            commitAllowingStateLoss()
                    }
                }
                true
            }
            selectedItemId = R.id.action_first
        }
    }
}