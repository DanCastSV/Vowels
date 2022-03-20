package com.example.vowels;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton letraa= (ImageButton) findViewById(R.id.ibtnA);
        ImageButton letrae= (ImageButton) findViewById(R.id.ibtnE);
        ImageButton letrai= (ImageButton) findViewById(R.id.ibtnI);
        ImageButton letrao= (ImageButton) findViewById(R.id.ibtnO);
        ImageButton letrau= (ImageButton) findViewById(R.id.ibtnU);

        letraa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp=MediaPlayer.create(getApplicationContext(), R.raw.letra_a);
                mp.start();
            }
        });

        letrae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp=MediaPlayer.create(getApplicationContext(), R.raw.letra_e);
                mp.start();
            }
        });

        letrai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp=MediaPlayer.create(getApplicationContext(), R.raw.letra_i);
                mp.start();
            }
        });

        letrao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp=MediaPlayer.create(getApplicationContext(), R.raw.letra_o);
                mp.start();
            }
        });

        letrau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp=MediaPlayer.create(getApplicationContext(), R.raw.letra_u);
                mp.start();
            }
        });


    }
}