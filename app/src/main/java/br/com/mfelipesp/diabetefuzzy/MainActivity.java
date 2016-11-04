package br.com.mfelipesp.diabetefuzzy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import br.com.mfelipesp.diabetefuzzy.fuzzyficacao.IdadeFuzzyficacao;
import br.com.mfelipesp.diabetefuzzy.model.Idade;

public class MainActivity extends AppCompatActivity {

    private EditText editIdade, editPressao, editQtdComida, editBatimentoCardiaco, editGlicemia, editTaxaHormonal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponentes();


    }

    private void initComponentes() {
        this.editIdade = (EditText) findViewById(R.id.editIdade);
        this.editPressao = (EditText) findViewById(R.id.editPressao);
        this.editQtdComida = (EditText) findViewById(R.id.editQtdComida);
        this.editBatimentoCardiaco = (EditText) findViewById(R.id.editBatimentoCardiaco);
        this.editGlicemia = (EditText) findViewById(R.id.editGlicemia);
        this.editTaxaHormonal = (EditText) findViewById(R.id.editTaxaHormonal);

    }

    /***
     * Event onClick do botao
     * @param view
     */
    public void btnEnviar(View view) {

        Idade idade = criaModeloIdade();

        fuzzyficacao(idade);

        Log.i("toString", idade.toString());

    }

    private Idade criaModeloIdade() {
        Idade idade = new Idade();
        Integer valor = 0;
        try{
            valor = Integer.parseInt(this.editIdade.getText().toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        idade.setValor(valor);
        return idade;

    }

    private void fuzzyficacao(Idade idade) {
        IdadeFuzzyficacao idadeFuzzyficacao = IdadeFuzzyficacao.getInstance();
        idadeFuzzyficacao.recebeConjuntoNebulo(idade);

    }
}
