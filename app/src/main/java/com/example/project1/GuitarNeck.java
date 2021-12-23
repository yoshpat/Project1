package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class GuitarNeck extends AppCompatActivity {
    final int BUTTONS_NUM = 36;
    Button[] buttons = new Button[BUTTONS_NUM];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.guitar_neck_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.scale) {
            Intent i = new Intent(this, Scale.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.tuner) {
            Intent i = new Intent(this, Tuner.class);
            startActivity(i);
            return true;
        }
        return true;
    }
}