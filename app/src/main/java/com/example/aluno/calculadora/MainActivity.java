package com.example.aluno.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private TextView textView2;
    private EditText valor1;
    private EditText valor2;
    private Button limpar;
    private Button mais;
    private Button menos;
    private Button vezes;
    private Button resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);
        limpar = (Button) findViewById(R.id.limpar);
        mais = (Button) findViewById(R.id.mais);
        menos = (Button) findViewById(R.id.menos);
        vezes = (Button) findViewById(R.id.vezes);
        resultado = (Button) findViewById(R.id.resultado);

        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Double v1 = (Double.parseDouble(valor1.getText().toString()) - Double.parseDouble(valor2.getText().toString()));

                    resultado.setText("Resultado:"+v1);
                    Toast.makeText(MainActivity.this,"."+v1,Toast.LENGTH_LONG).show();
                }catch (Exception E){
                    Toast.makeText(MainActivity.this"Ops, tente novamente!")
                }
            }
        });





    }
}
