package com.example.lview.TinhTongKotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.lview.R

class MainActivity3 : AppCompatActivity() {
    var txt1: EditText? = null
    var txt2: EditText? = null
    var btn1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        txt1 = findViewById(R.id.edit1)
        txt2 = findViewById(R.id.edit2)
        btn1 = findViewById(R.id.button)
        btn1!!.setOnClickListener {
            val so1Value = txt1?.text.toString()
            val so2Value = txt2?.text.toString()

            val i = Intent(this@MainActivity3, MainActivity4::class.java)
            i.putExtra("so1", so1Value)
            i.putExtra("so2", so2Value)
            startActivity(i)
        }
    }
}