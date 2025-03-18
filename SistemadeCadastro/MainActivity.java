package com.example.sistemadecadastro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;

public class MainActivity extends Activity {
    Button btcadastrarusuario;
    Button btlistagemusuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btcadastrarusuario = (Button) findViewById(R.id.btcadastrar_usuario);
        btlistagemusuario = (Button) findViewById(R.id.bt_listar_usuarios_cadastrados);

        btcadastrarusuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTelaCadastro = new Intent(MainActivity.this,
                        Cadastro.class);
                startActivity(intentTelaCadastro);
            }
        });

        btlistagemusuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(RegistrosManager.getRegistros().size() == 0){
                    (new AlertDialog.Builder(MainActivity.this)).setTitle("Aviso").setMessage("Não existe nenhum registro cadastrado.")
                            .setNeutralButton("OK",null)
                    .show();

                    return;
                }

                Intent intentTelaListagem = new Intent(MainActivity.this,
                        Listagem.class);

                startActivity(intentTelaListagem);
            }
        });
    }
}
