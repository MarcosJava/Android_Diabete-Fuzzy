package br.com.mfelipesp.diabetefuzzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultadoActivity extends AppCompatActivity {

    private TextView txtChance, txtValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);


        this.txtChance = (TextView) findViewById(R.id.txtChance);
        this.txtValor = (TextView) findViewById(R.id.txtValor);

        Intent myIntent = getIntent();

        Double jogadaIndex = Double.valueOf(myIntent.getStringExtra(MainActivity.EXTRA_VALOR));
        String resultado = "";
        if(jogadaIndex > 50 ){
            resultado = "TEM CHANCE";
        } else {
            resultado = "NAO TEM CHANCE";
        }


        Log.i("RESULTADO EH ", jogadaIndex + "--" + resultado );
        this.txtValor.setText(jogadaIndex + " %");
        this.txtChance.setText(resultado);

    }
}
