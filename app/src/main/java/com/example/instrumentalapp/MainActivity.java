package com.example.instrumentalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout btnGuitar, btnDrum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link UI cards
        btnGuitar = findViewById(R.id.btnGuitar);


        // Guitar click
        btnGuitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateClick(v, new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(MainActivity.this, GuitarActivity.class));
                    }
                });
            }
        });



    // 🎯 MICRO-INTERACTION ANIMATION (Designer Touch)
    private void animateClick(final View view, final Runnable action) {

        // Scale down
        view.animate()
                .scaleX(0.96f)
                .scaleY(0.96f)
                .setDuration(80)
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {

                        // Scale back up
                        view.animate()
                                .scaleX(1f)
                                .scaleY(1f)
                                .setDuration(80)
                                .withEndAction(action)
                                .start();
                    }
                })
                .start();
    }
}
