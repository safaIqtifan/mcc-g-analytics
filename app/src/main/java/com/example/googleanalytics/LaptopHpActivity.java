package com.example.googleanalytics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LaptopHpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop_hp);

        RootApplication.screenView("k", "ClothesProductsActivity");
    }
}