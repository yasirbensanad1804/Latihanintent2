package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTerimaObjek extends AppCompatActivity {

    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terima_objek);
        textView1 = findViewById(R.id.textView);

        MyBiodata biodataYasir = getIntent().getParcelableExtra("Yasir");
        textView1.setText("Nama saya "+ biodataYasir.getNama() + " umur saya "+ biodataYasir.getUmur());

    }
}
