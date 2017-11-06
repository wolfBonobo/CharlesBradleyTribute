package com.example.pedro.charlesbradleytribute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class navegador extends AppCompatActivity {
    String url;
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegador);
        Bundle bundle =getIntent().getExtras();
        url=bundle.getString("parametro");
        myWebView = (WebView) this.findViewById(R.id.web1);
        System.out.println(url);
        myWebView.loadUrl(url);


    }
}
