package com.example.controles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class GuardarActivity extends AppCompatActivity {

    EditText txtNombre;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar);
        txtNombre = findViewById(R.id.txtNombre);
        textView = findViewById(R.id.textView);

        String datos = "Email: " + getIntent().getStringExtra("txtEmail") + "\nDireccion: " + getIntent().getStringExtra("txtDomicilio")
                + "\nDepartamento: " + getIntent().getStringExtra("cbxDeptos") + "\nHorario" + getIntent().getStringExtra("tiempo");
        txtNombre.setText(getIntent().getStringExtra("txtNombre"));
        textView.setText(datos);
    }
}