package com.example.animalsoundsapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.animal1);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.alligator3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        btn = (Button) findViewById(R.id.animal2);

        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.bear);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });

        btn = (Button) findViewById(R.id.animal3);

        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.baboon);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });

        btn = (Button) findViewById(R.id.animal4);

        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.dog);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });

        btn = (Button) findViewById(R.id.animal5);

        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.dolphin1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp4.start();
            }
        });

        btn = (Button) findViewById(R.id.animal6);

        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.greyfox);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp5.start();
            }
        });

        btn = (Button) findViewById(R.id.animal7);

        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.grizzbear);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp6.start();
            }
        });

        btn = (Button) findViewById(R.id.animal8);

        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.hyena3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp7.start();
            }
        });

        btn = (Button) findViewById(R.id.animal9);

        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.jaguarrors);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp8.start();
            }
        });

        btn = (Button) findViewById(R.id.animal10);

        final MediaPlayer mp9 = MediaPlayer.create(this, R.raw.lemur4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp9.start();
            }
        });

        btn = (Button) findViewById(R.id.animal11);

        final MediaPlayer mp10= MediaPlayer.create(this, R.raw.leopard7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp10.start();
            }
        });

        btn = (Button) findViewById(R.id.animal2);

        final MediaPlayer mp11 = MediaPlayer.create(this, R.raw.lioncub2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp11.start();
            }
        });

        btn = (Button) findViewById(R.id.animal13);

        final MediaPlayer mp12 = MediaPlayer.create(this, R.raw.panther7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp12.start();
            }
        });


        btn = (Button) findViewById(R.id.animal14);

        final MediaPlayer mp13 = MediaPlayer.create(this, R.raw.rmonkeycolobus);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp13.start();
            }
        });


        btn = (Button) findViewById(R.id.animal15);

        final MediaPlayer mp14 = MediaPlayer.create(this, R.raw.whalesurfaces);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp14.start();
            }
        });
    }
}
