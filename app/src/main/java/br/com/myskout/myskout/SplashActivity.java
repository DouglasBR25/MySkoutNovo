package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        //Instanciando uma classe de processo
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //abrir janela de innerActivy
                startActivity(new Intent(getApplicationContext() , InnerActivity.class));
                finish();
            }
        }, 3000);
    }
}