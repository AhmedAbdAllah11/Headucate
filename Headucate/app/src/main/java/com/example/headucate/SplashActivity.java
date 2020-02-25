package com.example.headucate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hamza.slidingsquaresloaderview.SlidingSquareLoaderView;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {

    SlidingSquareLoaderView squareLoaderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash );

        squareLoaderView = findViewById( R.id.loader );
        squareLoaderView.start();
        Thread xyz = new Thread( new Runnable() {
            @Override
            public void run() {
                try {
                    sleep( 4000 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    runOnUiThread( new Runnable() {
                        @Override
                        public void run() {
                            squareLoaderView.stop();

                            startActivity( new Intent( SplashActivity.this, MainActivity.class ) );
                        }


                    } );
                }
            }
        } );
        xyz.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
