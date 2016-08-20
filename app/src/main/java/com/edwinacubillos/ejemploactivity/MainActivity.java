package com.edwinacubillos.ejemploactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String name;
    int base,altura,total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "OnCreate", Toast.LENGTH_SHORT).show();

        final EditText eUsername = (EditText) findViewById(R.id.eUsername);
        final EditText ePassword = (EditText) findViewById(R.id.ePassword);
        Button bAceptar = (Button) findViewById(R.id.bAceptar);

        bAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = eUsername.getText().toString();
                base =  Integer.parseInt(eUsername.getText().toString());
                altura = Integer.parseInt(ePassword.getText().toString());
                total = base * altura /2;
                Toast.makeText(getApplicationContext(), "El total es "+total, Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "OnResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "OnPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "OnStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "OnDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "OnRestart", Toast.LENGTH_SHORT).show();
    }
}
