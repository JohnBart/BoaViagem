package com.example.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.boaviagem.R.id.nova_viagem;
/*import android.widget.TextView;
import android.widget.Toast;*/

/**
 * Created by João Paulo Bart Dias on 28/06/2017.
 */

public class DashboardActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }

    /*public void selecionarOpcao(View view) {
        TextView textView = (TextView) view;
        String opcao = "Opção: " + textView.getText().toString();
        Toast.makeText(this, opcao, Toast.LENGTH_LONG).show();
    }*/



    public void selecionarOpcao(View view){
        switch(view.getId()){
            case R.id.novo_gasto:
                startActivity(new Intent(this, NovoGastoActivity.class));
                break;
            case R.id.nova_viagem:
                startActivity(new Intent(this, ViagemActivity.class));
                break;
            case R.id.minhas_viagens:
                startActivity(new Intent(this,MinhasViagensActivity.class));
                break;
            case R.id.configuracoes:
                startActivity(new Intent(this,ConfiguracoesActivity.class));
                break;
        }
    }
}
