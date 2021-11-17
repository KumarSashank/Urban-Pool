package com.example.urbanpool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    ImageView mdone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mdone=findViewById(R.id.done);
        mdone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Done", Toast.LENGTH_SHORT).show();
                home();
            }
        });
    }
    public void home() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}