package com.example.headucate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class sport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.sport );
        setTitle("رياضة");

        String frameVideo = "<html><body><iframe width=\"350\" height=\"315\" src=\"https://www.youtube.com/embed/1JCGybW-zaw\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe></body></html>";

        WebView displayYoutubeVideo = findViewById( R.id.mWebView );
        displayYoutubeVideo.setWebViewClient( new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        } );
        WebSettings webSettings = displayYoutubeVideo.getSettings();
        webSettings.setJavaScriptEnabled( true );
        displayYoutubeVideo.loadData( frameVideo, "text/html", "utf-8" );

        String frameVideo2 = "<html><body><iframe width=\"350\" height=\"315\" src=\"https://www.youtube.com/embed/zCdh73EFyb4\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe></body></html>";

        WebView displayYoutubeVideo2 = findViewById( R.id.mWebView2 );
        displayYoutubeVideo2.setWebViewClient( new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        } );
        WebSettings webSettings2 = displayYoutubeVideo2.getSettings();
        webSettings2.setJavaScriptEnabled( true );
        displayYoutubeVideo2.loadData( frameVideo2, "text/html", "utf-8" );


        String frameVideo3 = "<html><body><iframe width=\"350\" height=\"315\" src=\"https://www.youtube.com/embed/W-9L0J_9qag\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe></body></html>";

        WebView displayYoutubeVideo3 = (WebView) findViewById( R.id.mWebView3 );
        displayYoutubeVideo3.setWebViewClient( new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        } );
        String frameVideo4 = "<html><body><iframe width=\"350\" height=\"315\" src=\"https://www.youtube.com/embed/-cwyrLUgNzA\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe></body></html>";

        WebView displayYoutubeVideo4 = (WebView) findViewById(R.id.mWebView4);
        displayYoutubeVideo4.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings4 = displayYoutubeVideo4.getSettings();
        webSettings4.setJavaScriptEnabled(true);
        displayYoutubeVideo4.loadData(frameVideo4, "text/html", "utf-8");



        String frameVideo5 = "<html><body><iframe width=\"350\" height=\"315\" src=\"https://www.youtube.com/embed/-kQpTMkQo3Y\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe></body></html>";

        WebView displayYoutubeVideo5 = (WebView) findViewById(R.id.mWebView5);
        displayYoutubeVideo5.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings5 = displayYoutubeVideo5.getSettings();
        webSettings5.setJavaScriptEnabled(true);
        displayYoutubeVideo5.loadData(frameVideo5, "text/html", "utf-8");
        WebSettings webSettings3 = displayYoutubeVideo3.getSettings();
        webSettings3.setJavaScriptEnabled( true );
        displayYoutubeVideo3.loadData( frameVideo3, "text/html", "utf-8" );
    }
}


