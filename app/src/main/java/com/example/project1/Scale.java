package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Scale extends AppCompatActivity {
    ListView scalesList;
    String scales[] = {"A", "Bb", "B", "C", "C#", "D", "Eb", "E", "F", "F#", "G", "Ab", "Am", "Bbm", "Bm", "Cm", "C#m", "Dm", "Ebm", "Em", "Fm", "F#m", "Gm", "Abm"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scale);

        scalesList = findViewById(R.id.lv);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_view,R.id.tv,scales);
        scalesList.setAdapter(adapter);

    }


}