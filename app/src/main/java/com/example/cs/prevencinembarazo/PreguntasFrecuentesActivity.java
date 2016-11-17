package com.example.cs.prevencinembarazo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class PreguntasFrecuentesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas_frecuentes);
        WebView webCalendario = (WebView) findViewById(R.id.webPreguntasFrecuentes);
        webCalendario.getSettings().setJavaScriptEnabled(true);
        webCalendario.getSettings().setBuiltInZoomControls(true);
        webCalendario.loadUrl("https://drive.google.com/file/d/0B1H58aT8VDAbV1EwLU5WQ1BJLU0/view");
    }
}
