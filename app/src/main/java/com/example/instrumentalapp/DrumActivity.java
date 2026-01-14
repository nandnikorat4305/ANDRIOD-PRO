package com.example.instrumentalapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DrumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drum);

        View snare  = findViewById(R.id.snare);
        View kick   = findViewById(R.id.kick);
        View kick2  = findViewById(R.id.kick2);
        View hihat  = findViewById(R.id.hihat);
        View crash  = findViewById(R.id.crash);
        View tom    = findViewById(R.id.tom);


