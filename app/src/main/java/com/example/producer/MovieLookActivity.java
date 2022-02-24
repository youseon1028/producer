package com.example.producer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.RatingBar;

public class MovieLookActivity extends AppCompatActivity {

    private RatingBar ratingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_look);

        ratingbar = findViewById(R.id.ratingBar);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();
            }
        });



    }
}