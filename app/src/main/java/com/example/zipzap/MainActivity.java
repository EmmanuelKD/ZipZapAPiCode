package com.example.zipzap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout myAppDrawerLayout;
    private ActionBarDrawerToggle mToggler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myAppDrawerLayout =(DrawerLayout) findViewById(R.id.drawerLayout);
        mToggler = new ActionBarDrawerToggle(this, myAppDrawerLayout, R.string.open, R.string.close);
        myAppDrawerLayout.addDrawerListener(mToggler);
        mToggler.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mToggler.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }
}