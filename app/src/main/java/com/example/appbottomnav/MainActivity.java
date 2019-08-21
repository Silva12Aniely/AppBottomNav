package com.example.appbottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("App Bottom Navigation");

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.idbottom);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.mfavorite:
//                        Toast.makeText(getApplicationContext(), "Cliquei em favorito.", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), Favorito_Activity.class));
                        break;
                    case R.id.mlocation:
//                        Toast.makeText(getApplicationContext(), "Cliquei em local.", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), Local_Activity.class));
                        break;
                    case R.id.mrestore:
//                        Toast.makeText(getApplicationContext(), "Cliquei em recente.", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), Recente_Activity.class));
                        break;
                }

                return true;
            }
        });
    }
}
