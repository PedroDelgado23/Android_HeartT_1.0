package com.example.fime_proandr.heart;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView texto;
    EditText editexto;
    Button boton,botonN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // es para el TextView poner el id del activty_main xml

        texto =(TextView) findViewById(R.id.Texto);

        // es para el EditText poner el id del activty_main xml

        editexto = (EditText) findViewById(R.id.edito);

        // es para el Button poner el id del activty_main xml

        boton = (Button) findViewById(R.id.button);
        botonN =(Button)findViewById(R.id.button2);

        boton.setOnClickListener(this);
        botonN.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

       //casos en los que el cual sabe a cual boton usar

        switch (v.getId()){
            case R.id.button:
                String new_dato = editexto.getText().toString();
                texto.setText(new_dato);
                break;

            case  R.id.button2:
                texto.setText("hola mundo¡¡");
                break;
        }
    }
}
