package com.example.sistemadecadastro;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Cadastro extends Activity {
    EditText ednome, edendereco, edtelefone;
    Button btcadastrar, btcancelar, btcancelar_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        ednome = (EditText) findViewById(R.id.ednome);
        edtelefone = (EditText) findViewById(R.id.edtelefone);
        edendereco = (EditText) findViewById(R.id.edendereco);
        btcadastrar = (Button) findViewById(R.id.btcadastrar);
        btcancelar_cadastro = (Button) findViewById(R.id.btcancelar_cadastro);

        btcadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogo = new AlertDialog.Builder(Cadastro.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Cadastrar usuário ?");
                dialogo.setNegativeButton("Não", null);
                dialogo.setPositiveButton("Sim", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String nome = ednome.getText().toString();
                                String telefone = edtelefone.getText().toString();
                                String endereco = edendereco.getText().toString();
                                RegistrosManager.getRegistros().add(new Registro(nome,telefone,endereco));
                                (new AlertDialog.Builder(Cadastro.this)).setTitle("Aviso")
                                        .setMessage("Cadastro efetuado com sucesso!")
                                        .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                Cadastro.this.finish();
                                            }
                                        })
                                        .show();

                            }
                        });
            dialogo.show();
            }
        });
                btcancelar_cadastro.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Cadastro.this.finish();
                    }
                });
    }
}
