package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipalActivity extends AppCompatActivity implements View.OnClickListener {
    CardView cardPerfil, cardVagas,
            cardCandidatos, cardRecrutamento,
            getCardTalento, cardParceiros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);

        //Apresentando as variaveis xml para java
        cardPerfil = findViewById(R.id.cardPerfil);
        cardVagas = findViewById(R.id.cardVagas);
        cardCandidatos = findViewById(R.id.cardCandidatos);
        cardRecrutamento = findViewById(R.id.cardRecrutamento);
        getCardTalento = findViewById(R.id.cardTalento);
        cardParceiros = findViewById(R.id.cardParceiros);

        //Os componentes recebendo o evento de click
        cardPerfil.setOnClickListener(this);
        cardVagas.setOnClickListener(this);
        cardCandidatos.setOnClickListener(this);
        cardRecrutamento.setOnClickListener(this);
        getCardTalento.setOnClickListener(this);
        cardParceiros.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cardPerfil:
                startActivity(new Intent(
                        getApplicationContext(),
                        ParceriaActivity.class
                ));
                finish();
                break;

            case R.id.cardVagas:
                startActivity(new Intent(
                        getApplicationContext(),
                        ParceriaActivity.class
                ));
                finish();
                break;

            case R.id.cardCandidatos:
                startActivity(new Intent(
                        getApplicationContext(),
                        ParceriaActivity.class
                ));
                finish();
                break;

            case R.id.cardRecrutamento:
                startActivity(new Intent(
                        getApplicationContext(),
                        ParceriaActivity.class
                ));
                finish();
                break;

            case R.id.cardTalento:
                startActivity(new Intent(
                        getApplicationContext(),
                        ParceriaActivity.class
                ));
                finish();
                break;

            case R.id.cardParceiros:
                startActivity(new Intent(
                        getApplicationContext(),
                        ParceriaActivity.class
                ));
                finish();
                break;

        }
    }
}