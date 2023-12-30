package com.example.lview.TinhTongJa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lview.R;

public class MainActivity2 extends AppCompatActivity {
    TextView tx1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tx1 = findViewById(R.id.tv);
        Intent i1 = getIntent();
        String s1 = i1.getExtras().getString("so1");
        String s2 = i1.getExtras().getString("so2");
        float so1 = Float.parseFloat(s1);
        float so2 = Float.parseFloat(s2);
        float tong = so1 + so2;
        tx1.setText( "Kết quả:" + String.valueOf(tong));
    }
}