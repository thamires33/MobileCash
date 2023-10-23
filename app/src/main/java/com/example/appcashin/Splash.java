package com.example.appcashin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Tempo em milissegundos que a tela de splash deve ser exibida
        final int SPLASH_DISPLAY_TIME = 3000; // 3 segundos

            // Usando um Handler para atrasar a transição para a próxima atividade
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Este código será executado após o tempo definido em SPLASH_DISPLAY_TIME
                    // Inicie a próxima atividade
                    Intent mainIntent = new Intent(Splash.this, MainActivity.class);
                    startActivity(mainIntent);
                    finish(); // Encerre a atividade de splash
                }
            }, SPLASH_DISPLAY_TIME);
        }
}