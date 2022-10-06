package com.example.binary2decimal

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.System.console
import java.util.regex.Pattern
import kotlin.math.log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
            Answer.text = decimal.toString();//when the user clicks the button, the data will appear in the textview()
        }

        ConvertButton.setOnClickListener {
            calculate()
            }
    }
}


