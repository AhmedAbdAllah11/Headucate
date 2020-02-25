package com.example.headucate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void btn_symptoms(View view) {
        Intent intent1 = new Intent( MainActivity.this, Symptoms.class );
        startActivity( intent1 );
    }

    public void btn_awarness(View view) {
        Intent intent2 = new Intent( MainActivity.this, awarness.class );
        startActivity( intent2 );
    }

    public void btn_sport(View view) {
        Intent intent3 = new Intent( MainActivity.this, sport.class );
        startActivity( intent3 );
    }
}