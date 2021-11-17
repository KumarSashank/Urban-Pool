package com.example.urbanpool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {
    ImageView map,offer,take;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        map=findViewById(R.id.map_pic);
        offer=findViewById(R.id.offering);

        map.setOnClickListener(new button());
        offer.setOnClickListener(new button());
    }
    public class button implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.map_pic:
                    Toast.makeText(getApplicationContext(), "Maps", Toast.LENGTH_SHORT).show();
                    mapActivity();
                    break;
                case R.id.offering:
                    Toast.makeText(getApplicationContext(), "Offers", Toast.LENGTH_SHORT).show();
                    offeractivity();
                    break;
            }
        }
    }
    public void mapActivity() {
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
    public void offeractivity(){
        Intent intent = new Intent(this,Offering.class);
        startActivity(intent);
    }
}