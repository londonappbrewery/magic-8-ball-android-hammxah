package com.londonappbrewery.magiceightball;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView ivMagicBall;
    private TextView tvBanner;
    private Button btnAsk;
    final int[] ballArray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setListeners();
    }

    private void setListeners() {
        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);

                ivMagicBall.setImageResource(ballArray[number]);

            }
        });
    }

    private void init() {
        ivMagicBall = findViewById(R.id.ivMagicBall);
        tvBanner = findViewById(R.id.tvBanner);
        btnAsk = findViewById(R.id.btnAsk);
    }
}
