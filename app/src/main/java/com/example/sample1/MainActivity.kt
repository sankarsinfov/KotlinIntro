package com.example.sample1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var firstValue=findViewById(R.id.editText1)as EditText
        var secondValue=findViewById(R.id.editText2)as EditText
        var result=findViewById(R.id.editText3)as EditText
        var btnAdd=findViewById(R.id.button)as Button

        btnAdd.setOnClickListener {


            result.setText(firstValue.text.toString().toInt()+secondValue.text.toString().toInt())
        }
    }
}

