package com.example.urbanpool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {
    ImageView map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        map=findViewById(R.id.map_pic);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Maps", Toast.LENGTH_SHORT).show();
                mapActivity();
            }
        });
    }
    public void mapActivity() {
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
}