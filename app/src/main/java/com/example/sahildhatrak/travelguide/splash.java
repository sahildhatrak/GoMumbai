package com.example.sahildhatrak.travelguide;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        handler = new Handler();
         handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intentSplash = new Intent(splash.this, MainActivity.class);
                startActivity(intentSplash);
                finish();
            }
        },3*1000);
    }
}
