package com.example.trocadetelas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity {

    Button bttela2;
    Intent iTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bttela2 = (Button) findViewById(R.id.bttela2);

        bttela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iTela2 = new Intent(MainActivity.this,
                        Tela2Activity.class);
                startActivity(iTela2);
            }
        });
    }
}
