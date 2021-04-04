package com.example.googleanalytics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button food;
    Button clothes;
    Button electronic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food = findViewById(R.id.button);
        clothes = findViewById(R.id.button2);
        electronic = findViewById(R.id.button3);

        RootApplication.firstOpenTime = new Date().getTime();
        Log.i(getClass().getSimpleName(), "Log  RootApplication.firstOpenTime " + RootApplication.firstOpenTime);

        RootApplication.appOpen("a", "APP OPEN");

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RootApplication.buttonClicked("2", "Food Button clicked");
                startActivity(new Intent(getApplicationContext(), FoodProductsActivity.class));
            }
        });

        clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RootApplication.buttonClicked("3", "Clothes Button clicked");
                startActivity(new Intent(getApplicationContext(), ClothesProductsActivity.class));
            }
        });

        electronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RootApplication.buttonClicked("4", "Electronic Button clicked");
                startActivity(new Intent(getApplicationContext(), ElectronicProductsActivity.class));
            }
        });

    }

    @Override
    protected void onDestroy() {
        long stayTime = new Date().getTime() -RootApplication.firstOpenTime;
        Toast.makeText(this, "App Stay Time "+(stayTime/1000), Toast.LENGTH_LONG).show();
        super.onDestroy();
    }



}