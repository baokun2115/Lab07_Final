package com.example.lab07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView imgView = (ImageView) findViewById(R.id.ic_carImage02);
        String url = "https://www.planetware.com/wpimages/2020/02/france-in-pictures-beautiful-places-to-photograph-eiffel-tower.jpg";

        if (url == null || url.equals("")) {
            Toast.makeText(MainActivity3.this, "Error", Toast.LENGTH_SHORT).show();
        } else {
            Picasso.with(MainActivity3.this).load(url).into(imgView);

        }
    }
}