package com.example.googleanalytics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class skirtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skirt);

        RootApplication.screenView("j", "ClothesProductsActivity");
    }
}