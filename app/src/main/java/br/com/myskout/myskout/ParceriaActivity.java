package br.com.myskout.myskout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ParceriaActivity extends AppCompatActivity {
    //criando o variavel para o botao FAB parcerias
    FloatingActionButton fabParcCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parceria_layout);

        //Apresentar o xml ao Java
        fabParcCadastrar = findViewById(R.id.fabCadastrar);

        //Criar o clique no botão FAB parcerias
        fabParcCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Clique no botão cadastrar",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Instaciando o menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_parcerias, menu);

        return super.onCreateOptionsMenu(menu);
    }
    //criando os cliques nos itens de menu


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mParcAlterar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Alterar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mParcExcluir:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Excluir",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mParcPesquisar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Pesquisar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mParcSair:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Sair",
                        Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}