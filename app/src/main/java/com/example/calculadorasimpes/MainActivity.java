package com.example.calculadorasimpes;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnSoma,btnSub,btnMult,btnDiv;
    EditText valor1,valor2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonsAndTextInstaces();
        btnSoma.setOnClickListener(view -> operacao("+"));
        btnSub.setOnClickListener(view -> operacao("-"));
        btnMult.setOnClickListener(view -> operacao("*"));
        btnDiv.setOnClickListener(view -> operacao("/"));
    }

    private void operacao(String op) {
        double valor1 = Double.parseDouble(this.valor1.getText().toString());
        double valor2 = Double.parseDouble(this.valor2.getText().toString());
        double result = 0;
        switch (op) {
            case "+":
                result = valor1 + valor2;
                break;
            case "-":
                result = valor1 - valor2;
                break;
            case "*":
                result = valor1 * valor2;
                break;
            case "/":
                result = valor1 / valor2;
                break;
            default:
                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setMessage("Opcao Invalida").setTitle("Error").show();
                break;
        }
        this.result.setText(String.valueOf(result));
        this.result.setBackgroundColor(Color.argb(100,42,201,156));
    }

    private void buttonsAndTextInstaces() {
        btnSoma = findViewById(R.id.btnSoma);
        btnSub = findViewById(R.id.btnSub);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        result = findViewById(R.id.result);
    }
}