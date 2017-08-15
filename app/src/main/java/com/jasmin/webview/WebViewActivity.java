package com.jasmin.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        web=(WebView)findViewById(R.id.WebView);

        //Receive data from main activity
        String getUrl=getIntent().getExtras().getString("link");

        web.setWebViewClient(new WebViewClient());
        web.getSettings().setBuiltInZoomControls(true);
        web.getSettings().setJavaScriptEnabled(true);

        web.loadUrl("http://"+getUrl);
    }
}
