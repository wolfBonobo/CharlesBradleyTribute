package com.example.pedro.charlesbradleytribute;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Lanzaremos despues de 3000ms(3s), el MainActivity
                Intent intent=new Intent(Splash.this, Menu.class);
                startActivity(intent);
                finish();//si vuelvo atras no se carga de nuevo

            }
        }, 1500);
    }
}
