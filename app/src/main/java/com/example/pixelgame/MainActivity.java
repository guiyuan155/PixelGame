package com.example.pixelgame;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        System.out.println("[MAIN] PixelGame Android Starting");

        // Create the initial game screen
        TextView textView = new TextView(this);

        // Set screen background
        textView.setBackgroundColor(Color.BLACK);

        // Set text
        textView.setText("PIXEL GAME");

        // Set text color
        textView.setTextColor(Color.WHITE);

        // Set text size
        textView.setTextSize(32);

        // Center the text
        textView.setGravity(Gravity.CENTER);

        // Display the game screen
        setContentView(textView);

        System.out.println("[MAIN] Android Game Started");
    }

    @Override
    protected void onPause() {

        super.onPause();

        System.out.println("[MAIN] Game Activity Paused");
    }

    @Override
    protected void onResume() {

        super.onResume();

        System.out.println("[MAIN] Game Activity Resumed");
    }
}