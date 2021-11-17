package com.example.urbanpool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView sign,log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign=findViewById(R.id.signup);
        log=findViewById(R.id.login);

        sign.setOnClickListener(new button());
        log.setOnClickListener(new button());
    }
    public class button implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.signup:
                    Toast.makeText(getApplicationContext(), "Signup", Toast.LENGTH_SHORT).show();
                    signup_page();
                    break;

                case R.id.login:
                    Toast.makeText(getApplicationContext(), "Login", Toast.LENGTH_SHORT).show();
                    log_page();
                    break;
            }
        }
    }

    public void signup_page(){
        Intent page = new Intent(this,SignUp.class);
        startActivity(page);
    }
    public void log_page(){
        Intent intent = new Intent(this,HomePage.class);
        startActivity(intent);
    }

}