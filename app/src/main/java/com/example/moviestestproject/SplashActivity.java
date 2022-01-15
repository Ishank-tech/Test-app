package com.example.moviestestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        ImageView logo = findViewById(R.id.logo);
        TextView from = findViewById(R.id.text);

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                }

                catch (Exception e){
                    e.printStackTrace();
                }

                finally {
                        Intent intent = new Intent(SplashActivity.this , MainActivity.class);
                        startActivity(intent);
                        finish();
                }
            }
        };
        thread.start();
    }
}