package com.example.jkt48aplikasi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    MemberFragment memberFragment = new MemberFragment();
    LocationFragment locationFragment = new LocationFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flFragment, new MemberFragment())
                    .commit();
        }

        bottomNavigationView = findViewById(R.id.bottomview);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int itemId = item.getItemId();

        if (itemId == R.id.home) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, homeFragment).commit();
            return true;
        } else if (itemId == R.id.member) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, memberFragment).commit();
            return true;
        } else if (itemId == R.id.location) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, locationFragment).commit();
            return true;
        } else {
            return false;
        }
    }
}