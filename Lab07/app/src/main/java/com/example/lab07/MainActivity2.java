package com.example.lab07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView ivPicture = (ImageView) findViewById(R.id.ic_carImage);
        ivPicture.setImageResource(R.drawable.ic_car);
        ivPicture.setContentDescription("Car" + R.string.car_description);
    }
}