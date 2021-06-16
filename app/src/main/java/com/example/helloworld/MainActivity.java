package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String tag ="Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(tag, "Logging like a pro!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}