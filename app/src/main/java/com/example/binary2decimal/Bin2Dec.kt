package com.example.binary2decimal

import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Bin2Dec : AppCompatActivity(){




    val ConvertButton = findViewById(R.id.btn_convert) as Button;
    val BinaryNumInput = findViewById(R.id.et_binary) as EditText;
    val Answer = findViewById(R.id.answer) as TextView;
    fun calculate(){
        var num:Int =BinaryNumInput.text.toString().toInt()
        var decimal:Int = 0
        var base:Int = 1
        while(num>0){
            val lastdigit =num%10
            decimal = decimal + base * lastdigit
            num = num/10
            base = base * 2
        }
        Answer.text = decimal.toString();
    }
}