package com.example.umc_study

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.umc_study.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
//    private lateinit var getResultText : ActivityResultLauncher<Intent>

    companion object {
        var memo: String = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = Intent(this,SecondActivity::class.java)

            binding.sendbtn.setOnClickListener {
                var content = binding.editText.text.toString()
                intent.putExtra("data",content)
                startActivity(intent)
            }

//        getResultText = registerForActivityResult(
//            ActivityResultContracts.StartActivityForResult()
//        ){result ->
//            if(result.resultCode == RESULT_OK){
//                val mString = result.data?.getStringExtra("aa")
//
//
//            }
//
//        }

    }

    override fun onResume() {
        super.onResume()

        // 전역변수 memo의 값으로 EditText 설정
        val editText = binding.editText
        editText.setText(memo)
    }

    override fun onPause() {
        super.onPause()

        // EditText에 작성한 메모 내용을 전역변수에 저장
        val editText = binding.editText
        memo = editText.text.toString()
    }

    override fun onRestart() {
        super.onRestart()

        // memo가 비어있지 않으면 다시 작성할지 묻는 Dialog 띄우기
        if (memo.isNotEmpty()) {
            AlertDialog.Builder(this)
                .setTitle("작성 중인 메모가 있습니다.")
                .setMessage("이어서 작성하시겠습니까?")
                .setPositiveButton("예") { _, _ -> }
                .setNegativeButton("아니오") { _, _ ->
                    // 이전 메모를 삭제
                    memo = ""
                }
                .create()
                .show()
        }
    }

}