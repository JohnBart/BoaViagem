package com.example.boaviagem;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by João Paulo Bart Dias on 28/06/2017.
 */

public class DashboardActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }

    public void selecionarOpcao(View view){
        TextView textView = (TextView) view;
        String opcao = "Opção: "+textView.getText().toString();
        Toast.makeText(this, opcao, Toast.LENGTH_LONG).show();
    }
}