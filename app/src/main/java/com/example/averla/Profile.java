package com.example.averla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.Preference;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.prefs.Preferences;
import java.util.prefs.PreferencesFactory;

public class Profile extends AppCompatActivity {
    private ImageView image;
     private Preferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {





        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        image= findViewById(R.id.imageView2);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Profile.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}