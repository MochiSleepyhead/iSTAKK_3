package com.capstone.istakk_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class activity_dashboard extends AppCompatActivity {

    BottomNavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        nav = findViewById(R.id.bottomNavigationView);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.dashboard) {
                    Intent intent = new Intent(nav.getContext(), activity_dashboard.class);
                    startActivity(intent);
                } else if (item.getItemId() == R.id.history) {
                    Intent intent = new Intent(nav.getContext(), activity_history.class);
                    startActivity(intent);
                } else if (item.getItemId() == R.id.inventory) {
                    Intent intent = new Intent(nav.getContext(), activity_inventory.class);
                    startActivity(intent);
                } else {

                }

                return true;
            }
        });
    }
    }
