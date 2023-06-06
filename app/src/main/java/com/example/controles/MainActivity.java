package com.example.controles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre, txtEmail, txtDomicilio;
    Button btnGuardar;
    Spinner cbxDeptos;
    RadioButton rbCompleto, rbMedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombre       = findViewById(R.id.txtNombre);
        txtEmail        = findViewById(R.id.txtEmail);
        txtDomicilio    = findViewById(R.id.txtDomicilio);
        btnGuardar      = findViewById(R.id.btnGuardar);
        cbxDeptos       = findViewById(R.id.cpxDeptos);
        rbCompleto      = findViewById(R.id.rbCompleto);
        rbMedio         = findViewById(R.id.rbMedioTiempo);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtNombre.getText().toString().equals("")
                || txtEmail.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "debe agregar su nombre y correo electronico"
                            , Toast.LENGTH_LONG);
                }else {
                Intent intent = new Intent(MainActivity.this, GuardarActivity.class);
                intent.putExtra("txtNombre", txtNombre.getText().toString());
                intent.putExtra("txtEmail", txtEmail.getText().toString());
                intent.putExtra("txtDomicilio", txtDomicilio.getText().toString());
                intent.putExtra("cbxDeptos", cbxDeptos.getSelectedItem().toString());
                String horario = "";
                if(rbCompleto.isChecked()){
                    horario = "Tiempo completo";
                }else {
                    horario = "medio Tiempo";
                }
                intent.putExtra("tiempo", horario);
                startActivity(intent);
                }
            }
        });
    }
}