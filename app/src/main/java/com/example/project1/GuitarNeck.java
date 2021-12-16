package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class GuitarNeck extends AppCompatActivity {
    final int BUTTONS_NUM = 36;
    Button[] buttons = new Button[BUTTONS_NUM];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}