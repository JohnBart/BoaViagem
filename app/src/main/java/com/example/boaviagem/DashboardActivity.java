package com.example.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

    /*public void selecionarOpcao(View view){
        TextView textView = (TextView) view;
        String opcao = "Opção: "+textView.getText().toString();
        Toast.makeText(this, opcao, Toast.LENGTH_LONG).show();
    */

    public class ViagemActivity extends Activity {

        public void selecionarOpcao(View view){
            Switch(view.getId()){
                case R.id.nova_viagem:
                    startActivity(new Intent((this, viagemActivity.class)));
                    break;
            }
        }
    }
}
