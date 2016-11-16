package com.example.cs.prevencinembarazo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class CalendarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        WebView webCalendario = (WebView) findViewById(R.id.webCalendario);
        webCalendario.getSettings().setJavaScriptEnabled(true);
        webCalendario.getSettings().setBuiltInZoomControls(true);
        webCalendario.loadUrl("http://www.parquelalibertad.org/actividades.html");
    }
}
