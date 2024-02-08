package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
var bt=findViewById<Button>(R.id.button) as Button
        var in1=findViewById<EditText>(R.id.num1)
        var in2=findViewById<EditText>(R.id.num2)
        var op=findViewById<TextView>(R.id.textView2)
          bt.setOnClickListener(){
              var sum=in1.text.toString().toInt() + in2.text.toString().toInt();
            op.setText("bye $sum")
        }
    }

}
