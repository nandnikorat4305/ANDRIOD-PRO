package com.example.instrumentalapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class GuitarActivity extends AppCompatActivity {

    ImageView s1, s2, s3, s4, s5, s6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitar);

        s1 = findViewById(R.id.string1);
        s2 = findViewById(R.id.string2);
        s3 = findViewById(R.id.string3);
        s4 = findViewById(R.id.string4);
        s5 = findViewById(R.id.string5);
        s6 = findViewById(R.id.string6);