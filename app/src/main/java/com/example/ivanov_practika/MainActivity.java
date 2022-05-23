package com.example.ivanov_practika;

import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.os.Bundle;
import android.view.MenuItem;
import android.content.Intent;
import java.util.ArrayList;
import android.os.AsyncTask;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        // добавляем пункты меню
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        Intent intent =null;
        switch (item.getItemId())
        {
            case R.id.m1: intent = new Intent(this, theatre.class);
                break;
            case R.id.m2: intent = new Intent(this, films.class);
                break;
            case R.id.m3: intent = new Intent(this, newtheatre.class);
                break;
            case R.id.m4: intent = new Intent(this, newfilm.class);
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}