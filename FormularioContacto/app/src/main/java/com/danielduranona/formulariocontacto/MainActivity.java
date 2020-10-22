package com.danielduranona.formulariocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSiguiente;
    EditText etNombre;
    EditText etTelefono;
    EditText etEmail;
    EditText etDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSiguiente = (Button)findViewById(R.id.btnSiguiente);
        etNombre = (EditText)findViewById(R.id.etNombre);
        etTelefono = (EditText)findViewById(R.id.etTelefono);
        etEmail = (EditText)findViewById(R.id.etEmail);
        etDescripcion = (EditText)findViewById(R.id.etDescripcion);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Nombre", etNombre.getText().toString());
                intent.putExtra("Telefono",etTelefono.getText().toString());
                intent.putExtra("Email",etEmail.getText().toString());
                intent.putExtra("Descripcion",etDescripcion.getText().toString());
                startActivity(intent);
            }
        });
    };
}