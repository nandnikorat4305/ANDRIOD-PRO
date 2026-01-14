package com.example.instrumentalapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.instrumentalapp.R;

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

        s1.setOnTouchListener((v, e) -> play(R.raw.string1, e));
        s2.setOnTouchListener((v, e) -> play(R.raw.string2, e));
        s3.setOnTouchListener((v, e) -> play(R.raw.string3, e));
        s4.setOnTouchListener((v, e) -> play(R.raw.string4, e));
        s5.setOnTouchListener((v, e) -> play(R.raw.string5, e));
        s6.setOnTouchListener((v, e) -> play(R.raw.string6, e));
    }

    private boolean play(int sound, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            MediaPlayer mp = MediaPlayer.create(this, sound);
            mp.setOnCompletionListener(MediaPlayer::release);
            mp.start();
        }
        return true;
    }
}
