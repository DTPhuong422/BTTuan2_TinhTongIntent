package com.example.lview.TinhTongJa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.lview.R;

public class MainActivity1 extends AppCompatActivity {
    EditText tv1, tv2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv1 = findViewById(R.id.edit1);
        tv2 = findViewById(R.id.edit2);
        button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity1.this, MainActivity2.class);
            i.putExtra("so1", tv1.getText().toString());
            i.putExtra("so2", tv2.getText().toString());
            startActivity(i);
        });
    }
}
