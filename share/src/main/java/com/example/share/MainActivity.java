package com.example.share;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("*/*");
        startActivityForResult(intent, 1);
        Intent intent2 = new Intent(android.content.Intent.ACTION_SEND);
        intent2.setType("*/*");
        startActivity(Intent.createChooser(intent2, "Выбор за вами!"));
    }
}
