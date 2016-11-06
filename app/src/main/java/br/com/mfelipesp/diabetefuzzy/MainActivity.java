package br.com.mfelipesp.diabetefuzzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

import java.util.List;

import br.com.mfelipesp.diabetefuzzy.defuzzyficacao.Defuzzyficacao;
import br.com.mfelipesp.diabetefuzzy.enums.TipoSedentario;
import br.com.mfelipesp.diabetefuzzy.fuzzyficacao.BatimentoCardiacoFuzzyficacao;
import br.com.mfelipesp.diabetefuzzy.fuzzyficacao.GlicemiaFuzzyficacao;
import br.com.mfelipesp.diabetefuzzy.fuzzyficacao.IdadeFuzzyficacao;
import br.com.mfelipesp.diabetefuzzy.fuzzyficacao.KdComidaFuzzyficacao;
import br.com.mfelipesp.diabetefuzzy.fuzzyficacao.PressaoFuzzyficacao;
import br.com.mfelipesp.diabetefuzzy.fuzzyficacao.TaxaHormonalFuzzyficacao;
import br.com.mfelipesp.diabetefuzzy.inferencia_nebulosa.InferenciaNebulosa;
import br.com.mfelipesp.diabetefuzzy.inferencia_nebulosa.InferenciaVO;
import br.com.mfelipesp.diabetefuzzy.model.BatimentoCardiaco;
import br.com.mfelipesp.diabetefuzzy.model.ChanceDiabetico;
import br.com.mfelipesp.diabetefuzzy.model.Glicemia;
import br.com.mfelipesp.diabetefuzzy.model.Idade;
import br.com.mfelipesp.diabetefuzzy.model.KgComida;
import br.com.mfelipesp.diabetefuzzy.model.Pressao;
import br.com.mfelipesp.diabetefuzzy.model.Sedentario;
import br.com.mfelipesp.diabetefuzzy.model.TaxaHormonal;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_VALOR = "ResultadoFinal.Valor";
    private EditText editIdade, editPressao, editQtdComida, editBatimentoCardiaco, editGlicemia, editTaxaHormonal;
    private Switch stcSedentario;

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
        this.stcSedentario = (Switch) findViewById(R.id.stcSedentario);
    }

    /***
     * Event onClick do botao --> MAIN DO PROJETO
     * @param view
     */
    public void btnEnviar(View view) {

        // ---- COLETA DADOS DO USUARIO

        Idade idade = criaModeloIdade();
        Pressao pressao = criaModeloPressao();
        KgComida kgComida = criaModeloKgComida();
        BatimentoCardiaco batimentoCardiaco = criaModeloBatimentoCardiaco();
        Glicemia glicemia = criaModeloGlicemia();
        TaxaHormonal taxaHormonal = criaModeloTaxaHormonal();
        Sedentario sedentario = criaModeloSedentario();

        // --- FUZZYFICACAO

        IdadeFuzzyficacao.getInstance().recebeConjuntoNebulo(idade);
        PressaoFuzzyficacao.getInstance().verificaConjuntoNebuloso(pressao);
        KdComidaFuzzyficacao.getInstance().verificaConjuntoNebuloso(kgComida);
        BatimentoCardiacoFuzzyficacao.getInstance().verificaConjuntoNebuloso(batimentoCardiaco);
        GlicemiaFuzzyficacao.getInstance().verificaConjuntoNebuloso(glicemia);
        TaxaHormonalFuzzyficacao.getInstance().verificaConjuntoNebuloso(taxaHormonal);

        Log.i("FUZZYFICACAO == ", idade.toString());
        Log.i("FUZZYFICACAO == ", pressao.toString());
        Log.i("FUZZYFICACAO == ", kgComida.toString());
        Log.i("FUZZYFICACAO == ", batimentoCardiaco.toString());
        Log.i("FUZZYFICACAO == ", glicemia.toString());
        Log.i("FUZZYFICACAO == ", taxaHormonal.toString());
        Log.i("FUZZYFICACAO == ", sedentario.toString());



        // ---- INFERENCIA NEBULOSA
        InferenciaNebulosa inferenciaNebulosa =
                new InferenciaNebulosa(idade,
                                       pressao,
                                       sedentario,
                                       taxaHormonal,
                                       batimentoCardiaco,
                                       glicemia,
                                       kgComida);

        // --  COLETA GRAUS DE PERTINENCIAS VALIDOS
        List<InferenciaVO> lstInfereciasNebulosas = inferenciaNebulosa.realizaInferenciaNebulosa();

        for(InferenciaVO inferenciaVO : lstInfereciasNebulosas){
            Log.i("GRAU DE PERTINENCIA == ", inferenciaVO.toString());
        }


        // ---- DEFUZZYFICACAO
        Defuzzyficacao defuzzyficacao = new Defuzzyficacao(lstInfereciasNebulosas);

        // ---- TRANSFORMA O GRAU DE PERTINENCIA EM REGRA COM VALOR REAL
        List<ChanceDiabetico> lstChances = defuzzyficacao.processaValores();

        for (ChanceDiabetico cd : lstChances){
            Log.i("Regras com Valores Reais == ", cd.toString());
        }

        //---- SAIDA , VALOR FINAL
        double saida = defuzzyficacao.valorFinal(lstChances);


        //VERIFICAR SE O VALOR EH NAN
        if(Double.isNaN(saida)){
            saida = 0D;
        }

        Log.i("SAIDA === ", saida + "");

        //RESPOSTA
        Intent myIntent = new Intent(this, ResultadoActivity.class);
        myIntent.putExtra(MainActivity.EXTRA_VALOR, saida + "");
        startActivity(myIntent);


    }

    private Sedentario criaModeloSedentario() {

        Sedentario sedentario = new Sedentario();

        if(this.stcSedentario.isChecked()){
            sedentario.setTipoSedentario(TipoSedentario.SIM);
        } else {
            sedentario.setTipoSedentario(TipoSedentario.NAO);
        }
        return sedentario;

    }

    private TaxaHormonal criaModeloTaxaHormonal() {
        TaxaHormonal taxaHormonal = new TaxaHormonal();
        Double valor = 0D;
        try{
            valor = Double.parseDouble(this.editTaxaHormonal.getText().toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        taxaHormonal.setValor(valor);
        return taxaHormonal;
    }

    private Glicemia criaModeloGlicemia() {
        Glicemia glicemia = new Glicemia();
        Double valor = 0D;
        try{
            valor = Double.parseDouble(this.editGlicemia.getText().toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        glicemia.setValor(valor);
        return glicemia;
    }

    private BatimentoCardiaco criaModeloBatimentoCardiaco() {
        BatimentoCardiaco batimentoCardiaco = new BatimentoCardiaco();
        Double valor = 0D;
        try{
            valor = Double.parseDouble(this.editBatimentoCardiaco.getText().toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        batimentoCardiaco.setValor(valor);
        return batimentoCardiaco;
    }

    private KgComida criaModeloKgComida() {
        KgComida kgComida = new KgComida();
        Double valor = 0D;
        try{
            valor = Double.parseDouble(this.editQtdComida.getText().toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        kgComida.setValor(valor);
        return kgComida;
    }

    private Pressao criaModeloPressao() {
        Pressao pressao = new Pressao();
        Double valor = 0D;
        try{
            valor = Double.parseDouble(this.editPressao.getText().toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        pressao.setValor(valor);
        return pressao;
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

}
