package com.example.lview.TinhTongKotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.lview.R

class MainActivity4 : AppCompatActivity() {
    var tv1: TextView?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        tv1 = findViewById(R.id.tv)
        var i1=intent
        val chuoi1=i1.extras!!.getString("so1")
        val chuoi2=i1.extras!!.getString("so2")
        var so1=chuoi1!!.toFloat()
        var so2=chuoi2!!.toFloat()
        val tong =so1+so2
        tv1!!.text=("Kết quả: " + tong.toString())
    }
}