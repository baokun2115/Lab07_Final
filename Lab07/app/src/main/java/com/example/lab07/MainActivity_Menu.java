package com.example.lab07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    //Create an option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        return true;
    }
    //Click an item in option menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.message) {
            Toast.makeText(getApplicationContext(), "You clicked on Message Menu", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.picture) {
            Toast.makeText(getApplicationContext(), "You clicked on Gallery Menu", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.mode) {
            Toast.makeText(getApplicationContext(), "You clicked on Mode Menu", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.fav01) {
            Toast.makeText(getApplicationContext(), "You clicked on Music Menu", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.fav02) {
            Toast.makeText(getApplicationContext(), "You clicked on Book Menu", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.about) {
            Toast.makeText(getApplicationContext(), "You clicked About menu", Toast.LENGTH_SHORT).show();
            return (true);
        } else if (itemId == R.id.exit) {
            finish();
            return (true);
        }
        return super.onOptionsItemSelected(item);
    }
}