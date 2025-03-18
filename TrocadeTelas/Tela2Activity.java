package com.example.trocadetelas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class Tela2Activity extends AppCompatActivity {

    Button bttelaprincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela2);
        bttelaprincipal = (Button) findViewById(R.id.bttelaprincipal);

        bttelaprincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tela2Activity.this.finish();
            }
        });
    }
}
