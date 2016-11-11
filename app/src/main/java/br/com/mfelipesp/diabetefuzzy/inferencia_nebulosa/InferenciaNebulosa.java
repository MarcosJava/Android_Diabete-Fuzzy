package br.com.mfelipesp.diabetefuzzy.inferencia_nebulosa;

import java.util.ArrayList;
import java.util.List;

import br.com.mfelipesp.diabetefuzzy.model.BatimentoCardiaco;
import br.com.mfelipesp.diabetefuzzy.model.Glicemia;
import br.com.mfelipesp.diabetefuzzy.model.Idade;
import br.com.mfelipesp.diabetefuzzy.model.KgComida;
import br.com.mfelipesp.diabetefuzzy.model.Pressao;
import br.com.mfelipesp.diabetefuzzy.model.Sedentario;
import br.com.mfelipesp.diabetefuzzy.model.TaxaHormonal;

/**
 * Created by markFelipe on 05/11/16.
 */

public class InferenciaNebulosa {


    private Idade idade;
    private Pressao pressao;
    private Sedentario sedentario;
    private TaxaHormonal taxaHormonal;
    private BatimentoCardiaco batimentoCardiaco;
    private Glicemia glicemia;
    private KgComida kgComida;

    public InferenciaNebulosa(Idade idade,
                              Pressao pressao,
                              Sedentario sedentario,
                              TaxaHormonal taxaHormonal,
                              BatimentoCardiaco batimentoCardiaco,
                              Glicemia glicemia,
                              KgComida kgComida) {

        this.idade = idade;
        this.pressao = pressao;
        this.sedentario = sedentario;
        this.taxaHormonal = taxaHormonal;
        this.batimentoCardiaco = batimentoCardiaco;
        this.glicemia = glicemia;
        this.kgComida = kgComida;
    }

    public List<InferenciaVO> realizaInferenciaNebulosa(){

        //Pega o grau de pertinencia de todas as regras
        Double regra1 = grauPertinenciaRegra1();
        Double regra2 = grauPertinenciaRegra2();
        Double regra3 = grauPertinenciaRegra3();
        Double regra4 = grauPertinenciaRegra4();
        Double regra5 = grauPertinenciaRegra5();
        Double regra6 = grauPertinenciaRegra6();
        Double regra7 = grauPertinenciaRegra7();
        Double regra8 = grauPertinenciaRegra8();
        Double regra9 = grauPertinenciaRegra9();
        Double regra10 = grauPertinenciaRegra10();
        Double regra11 = grauPertinenciaRegra11();
        Double regra12 = grauPertinenciaRegra12();
        Double regra13 = grauPertinenciaRegra13();
        Double regra14 = grauPertinenciaRegra14();
        Double regra15 = grauPertinenciaRegra15();
        Double regra16 = grauPertinenciaRegra16();
        Double regra17 = grauPertinenciaRegra17();
        Double regra18 = grauPertinenciaRegra18();
        Double regra19 = grauPertinenciaRegra19();
        Double regra20 = grauPertinenciaRegra20();
        Double regra21 = grauPertinenciaRegra21();
        Double regra22 = grauPertinenciaRegra22();
        Double regra23 = grauPertinenciaRegra23();
        Double regra24 = grauPertinenciaRegra24();
        Double regra25 = grauPertinenciaRegra25();
        Double regra26 = grauPertinenciaRegra26();
        Double regra27 = grauPertinenciaRegra27();
        Double regra28 = grauPertinenciaRegra28();
        Double regra29 = grauPertinenciaRegra29();
        Double regra30 = grauPertinenciaRegra30();
        Double regra31 = grauPertinenciaRegra31();
        Double regra32 = grauPertinenciaRegra32();
        Double regra33 = grauPertinenciaRegra33();
        Double regra34 = grauPertinenciaRegra34();
        Double regra35 = grauPertinenciaRegra35();
        Double regra36 = grauPertinenciaRegra36();
        Double regra37 = grauPertinenciaRegra37();
        Double regra38 = grauPertinenciaRegra38();
        Double regra39 = grauPertinenciaRegra39();
        Double regra40 = grauPertinenciaRegra40();
        Double regra41 = grauPertinenciaRegra41();
        Double regra42 = grauPertinenciaRegra42();
        Double regra43 = grauPertinenciaRegra43();
        Double regra44 = grauPertinenciaRegra44();
        Double regra45 = grauPertinenciaRegra45();
        Double regra46 = grauPertinenciaRegra46();
        Double regra47 = grauPertinenciaRegra47();
        Double regra48 = grauPertinenciaRegra48();
        Double regra49 = grauPertinenciaRegra49();
        Double regra50 = grauPertinenciaRegra50();

        //Cria InferenciaVO e adicioa o grau de pertinencia a cada REGRA

        List<InferenciaVO> lstInferenciaVO = new ArrayList<>();
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_1, regra1));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_2, regra2));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_3, regra3));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_4, regra4));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_5, regra5));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_6, regra6));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_7, regra7));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_8, regra8));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_9, regra9));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_10, regra10));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_11, regra11));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_12, regra12));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_13, regra13));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_14, regra14));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_15, regra15));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_16, regra16));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_17, regra17));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_18, regra18));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_19, regra19));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_20, regra20));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_21, regra21));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_22, regra22));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_23, regra23));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_24, regra24));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_25, regra25));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_26, regra26));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_27, regra27));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_28, regra28));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_29, regra29));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_30, regra30));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_31, regra31));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_32, regra32));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_33, regra33));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_34, regra34));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_35, regra35));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_36, regra36));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_37, regra37));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_38, regra38));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_39, regra39));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_40, regra40));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_41, regra41));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_42, regra42));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_43, regra43));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_44, regra44));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_45, regra45));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_46, regra46));
        lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_47, regra47));
        //lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_48, regra48));
        //lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_49, regra49));
        //lstInferenciaVO.add(new InferenciaVO(RegraNebulosa.REGRA_50, regra50));
        //REMOVE OS GRAUS DE PERTINENCIAS ZEROS
        retiraZero(lstInferenciaVO);


        return  lstInferenciaVO;
    }

    private void retiraZero(List<InferenciaVO> lstInferenciaVO){

        List<InferenciaVO> contemZeros = new ArrayList<>();

        for (InferenciaVO inferenciaVO : lstInferenciaVO){
            if(hasValorZero(inferenciaVO.getValorMinimoGanho())){
                contemZeros.add(inferenciaVO);
            }
        }

        for (InferenciaVO inferenciaVO : contemZeros){
            lstInferenciaVO.remove(inferenciaVO);
        }


    }

    private Double menorValor(List<Double> valores) {

        Double menor = 111111110D;

        for (Double d: valores) {

            if(d < menor){
                menor = d;
            }

        }

        return menor;
    }


    private boolean hasValorZero(Double valor){
        if(valor == 0){
            return true;
        }
        return false;
    }


    private Double grauPertinenciaRegra50() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.pressao.getAltaValor());
        valores.add(this.glicemia.getNormalValor());
        return menorValor(valores);
    }

    private Double grauPertinenciaRegra49() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.pressao.getNormalValor());
        valores.add(this.glicemia.getNormalValor());
        return menorValor(valores);
    }

    private Double grauPertinenciaRegra48() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.pressao.getBaixaValor());
        valores.add(this.glicemia.getNormalValor());
        return menorValor(valores);
    }


    private Double grauPertinenciaRegra47() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.pressao.getBaixaValor());
        valores.add(this.glicemia.getBaixoValor());
        return menorValor(valores);
    }

    private Double grauPertinenciaRegra46() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.pressao.getNormalValor());
        valores.add(this.glicemia.getBaixoValor());
        return menorValor(valores);
    }

    private Double grauPertinenciaRegra45() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.pressao.getAltaValor());
        valores.add(this.glicemia.getBaixoValor());
        return menorValor(valores);
    }

    private Double grauPertinenciaRegra44() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.pressao.getBaixaValor());
        valores.add(this.glicemia.getAltoValor());
        return menorValor(valores);
    }

    private Double grauPertinenciaRegra43() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.pressao.getNormalValor());
        valores.add(this.glicemia.getAltoValor());
        return menorValor(valores);
    }

    private Double grauPertinenciaRegra42() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.pressao.getAltaValor());
        valores.add(this.glicemia.getAltoValor());
        return menorValor(valores);
    }



    //41- SE idade = JOVEM e pressao = NORMAL e kgComida = POUCO e BatimentoCardiaco = NORMAL e
    // Glicemia = NORMAL e TaxaHormonal = NORMAL e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra41() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getAltoValor());
        valores.add(this.taxaHormonal.getBaixaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //40- SE idade = JOVEM e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = NORMAL e
    // Glicemia = NORMAL e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra40() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getBaixaValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getNormalValor());
        valores.add(this.taxaHormonal.getNormalValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //39- SE idade = JOVEM e pressao = NORMAL e kgComida = POUCO e BatimentoCardiaco = NORMAL e
    // Glicemia = BAIXO e TaxaHormonal = NORMAL e Sendentario = NAO LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra39() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getNormalValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getBaixoValor());
        valores.add(this.taxaHormonal.getNormalValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }



    //38- SE idade = ADULTO e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = NORMAL e
    // Glicemia = BAIXO e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra38() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorAdulto());
        valores.add(this.pressao.getBaixaValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getBaixoValor());
        valores.add(this.taxaHormonal.getNormalValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }



    //37- SE idade = JOVEM e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = NORMAL e
    // Glicemia = BAIXO e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra37() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getBaixaValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getBaixoValor());
        valores.add(this.taxaHormonal.getNormalValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //36- SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = NORMAL e
    // Glicemia = ALTA e TaxaHormonal = BAIXA e Sendentario = SIM LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra36() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getAltoValor());
        valores.add(this.taxaHormonal.getBaixaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //35- SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = BAIXO e
    // Glicemia = ALTA e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra35() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getBaixoValor());
        valores.add(this.glicemia.getAltoValor());
        valores.add(this.taxaHormonal.getNormalValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }



    //34- SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = NORMAL e
    // Glicemia = ALTA e TaxaHormonal = ALTA e Sendentario = SIM LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra34() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getAltoValor());
        valores.add(this.taxaHormonal.getAltaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //33- SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = BAIXO e
    // Glicemia = ALTA e TaxaHormonal = BAIXA e Sendentario = SIM LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra33() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getBaixoValor());
        valores.add(this.glicemia.getAltoValor());
        valores.add(this.taxaHormonal.getBaixaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //32- SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = ALTO e
    // Glicemia = BAIXA e TaxaHormonal = BAIXA e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra32() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getAltoValor());
        valores.add(this.glicemia.getBaixoValor());
        valores.add(this.taxaHormonal.getBaixaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //31- SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = NORMAL e
    // Glicemia = BAIXA e TaxaHormonal = BAIXA e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra31() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getBaixoValor());
        valores.add(this.taxaHormonal.getBaixaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }



    //30- SE idade = IDOSO e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = ALTO e
    // Glicemia = NORMAL e TaxaHormonal = BAIXA e Sendentario = NAO LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra30() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorIdoso());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getAltoValor());
        valores.add(this.glicemia.getNormalValor());
        valores.add(this.taxaHormonal.getBaixaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //29- SE idade = IDOSO e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = ALTO e
    // Glicemia = NORMAL e TaxaHormonal = BAIXA e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra29() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorIdoso());
        valores.add(this.pressao.getBaixaValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getAltoValor());
        valores.add(this.glicemia.getNormalValor());
        valores.add(this.taxaHormonal.getBaixaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //28- SE idade = IDOSO e pressao = NORMAL e kgComida = POUCO e BatimentoCardiaco = NORMAL e
    // Glicemia = ALTA e TaxaHormonal = BAIXA e Sendentario = SIM LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra28() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorIdoso());
        valores.add(this.pressao.getNormalValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getAltoValor());
        valores.add(this.taxaHormonal.getBaixaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //27- SE idade = IDOSO e pressao = ALTA e kgComida = POUCO e BatimentoCardiaco = NORMAL e
    // Glicemia = BAIXO e TaxaHormonal = BAIXA e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra27() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorIdoso());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getBaixoValor());
        valores.add(this.taxaHormonal.getBaixaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);

    }


    //26- SE idade = IDOSO e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = BAIXA e
    // Glicemia = NORMAL e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra26() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorIdoso());
        valores.add(this.pressao.getBaixaValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getBaixoValor());
        valores.add(this.glicemia.getNormalValor());
        valores.add(this.taxaHormonal.getNormalValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //25- SE idade = IDOSO e pressao = NORMAL e kgComida = POUCO e BatimentoCardiaco = ALTO e
    // Glicemia = ALTO e TaxaHormonal = NORMAL e Sendentario = NAO LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra25() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorIdoso());
        valores.add(this.pressao.getNormalValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getAltoValor());
        valores.add(this.glicemia.getAltoValor());
        valores.add(this.taxaHormonal.getNormalValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //24- SE idade = IDOSO e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = BAIXO e
    // Glicemia = BAIXO e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra24() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorIdoso());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getBaixoValor());
        valores.add(this.glicemia.getBaixoValor());
        valores.add(this.taxaHormonal.getNormalValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //23- SE idade = IDOSO e pressao = BAIXA e kgComida = MUITO e BatimentoCardiaco = NORMAL e
    // Glicemia = NORMAL e TaxaHormonal = ALTA e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra23() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorIdoso());
        valores.add(this.pressao.getBaixaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getNormalValor());
        valores.add(this.taxaHormonal.getAltaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //22- SE idade = IDOSO e pressao = NORMAL e kgComida = MUITO e BatimentoCardiaco = BAIXO e
    // Glicemia = ALTO e TaxaHormonal = ALTA e Sendentario = NAO LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra22() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorIdoso());
        valores.add(this.pressao.getNormalValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getBaixoValor());
        valores.add(this.glicemia.getAltoValor());
        valores.add(this.taxaHormonal.getAltaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //21- SE idade = IDOSO e pressao = ALTA e kgComida = POUCO e BatimentoCardiaco = ALTO e
    // Glicemia = BAIXO e TaxaHormonal = ALTA e Sendentario = SIM LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra21() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorIdoso());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getAltoValor());
        valores.add(this.glicemia.getBaixoValor());
        valores.add(this.taxaHormonal.getAltaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //20- SE idade = ADULTO e pressao = NORMAL e kgComida = MUITO e BatimentoCardiaco = NORMAL e
    // Glicemia = BAIXO e TaxaHormonal = ALTA e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra20() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorAdulto());
        valores.add(this.pressao.getNormalValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getBaixoValor());
        valores.add(this.taxaHormonal.getAltaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //19- SE idade = ADULTO e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = BAIXA e
    // Glicemia = BAIXA e TaxaHormonal = BAIXA e Sendentario = NAO chanceDiabetico = TEM
    private Double grauPertinenciaRegra19() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorAdulto());
        valores.add(this.pressao.getBaixaValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getBaixoValor());
        valores.add(this.glicemia.getBaixoValor());
        valores.add(this.taxaHormonal.getBaixaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //18- SE idade = ADULTO e pressao = NORMAL e kgComida = MUITO e BatimentoCardiaco = BAIXO e
    // Glicemia = BAIXO e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra18() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorAdulto());
        valores.add(this.pressao.getNormalValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getBaixoValor());
        valores.add(this.glicemia.getBaixoValor());
        valores.add(this.taxaHormonal.getNormalValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //17- SE idade = ADULTO e pressao = ALTA e kgComida = POUCO e BatimentoCardiaco = BAIXO e
    // Glicemia = BAIXO e TaxaHormonal = ALTA e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra17() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorAdulto());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getBaixoValor());
        valores.add(this.glicemia.getBaixoValor());
        valores.add(this.taxaHormonal.getAltaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //16- SE idade = ADULTO e pressao = BAIXA e kgComida = MUITO e BatimentoCardiaco = NORMAL e
    // Glicemia = NORMAL e TaxaHormonal = BAIXA e Sendentario = NAO LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra16() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorAdulto());
        valores.add(this.pressao.getBaixaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getNormalValor());
        valores.add(this.taxaHormonal.getBaixaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //15- SE idade = ADULTO e pressao = NORMAL e kgComida = POUCO e BatimentoCardiaco = ALTO e
    // Glicemia = NORMAL e TaxaHormonal = NORMAL e Sendentario = NAO LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra15() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorAdulto());
        valores.add(this.pressao.getNormalValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getAltoValor());
        valores.add(this.glicemia.getNormalValor());
        valores.add(this.taxaHormonal.getNormalValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //14- SE idade = ADULTO e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = NORMAL e
    // Glicemia = NORMAL e TaxaHormonal = ALTA e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra14() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorAdulto());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getNormalValor());
        valores.add(this.taxaHormonal.getAltaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //13- SE idade = ADULTO e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = ALTO e
    // Glicemia = ALTA e TaxaHormonal = BAIXA e Sendentario = SIM LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra13() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorAdulto());
        valores.add(this.pressao.getBaixaValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getAltoValor());
        valores.add(this.glicemia.getAltoValor());
        valores.add(this.taxaHormonal.getBaixaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //12- SE idade = ADULTO e pressao = NORMAL e kgComida = MUITO e BatimentoCardiaco = NORMAL e
    // Glicemia = ALTA e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra12() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorAdulto());
        valores.add(this.pressao.getNormalValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getAltoValor());
        valores.add(this.taxaHormonal.getNormalValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }


    //11- SE idade = ADULTO e pressao = ALTA e kgComida = POUCO e BatimentoCardiaco = ALTO e
    // Glicemia = ALTA e TaxaHormonal = ALTA e Sendentario = NAO LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra11() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorAdulto());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getAltoValor());
        valores.add(this.glicemia.getAltoValor());
        valores.add(this.taxaHormonal.getAltaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //10- SE idade = JOVEM e pressao = ALTA e kgComida = POUCO e BatimentoCardiaco = ALTO e
    // Glicemia = ALTA e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra10() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getAltoValor());
        valores.add(this.glicemia.getAltoValor());
        valores.add(this.taxaHormonal.getNormalValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //9- SE idade = JOVEM e pressao = BAIXA e kgComida = MUITO e BatimentoCardiaco = BAIXO e
    // Glicemia = BAIXO e TaxaHormonal = NORMAL e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra9() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getBaixaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getBaixoValor());
        valores.add(this.glicemia.getBaixoValor());
        valores.add(this.taxaHormonal.getNormalValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //8- SE idade = JOVEM e pressao = NORMAL e kgComida = MUITO e BatimentoCardiaco = BAIXO e
    // Glicemia = NORMAL e TaxaHormonal = ALTA e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra8() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getNormalValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getBaixoValor());
        valores.add(this.glicemia.getNormalValor());
        valores.add(this.taxaHormonal.getAltaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //7- SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = BAIXO e
    // Glicemia = ALTA e TaxaHormonal = ALTA e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra7() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getBaixoValor());
        valores.add(this.glicemia.getAltoValor());
        valores.add(this.taxaHormonal.getAltaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //6- SE idade = JOVEM e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = NORMAL e
    // Glicemia = BAIXO e TaxaHormonal = BAIXA e Sendentario = SIM LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra6() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getBaixaValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getBaixoValor());
        valores.add(this.taxaHormonal.getBaixaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //5- SE idade = JOVEM e pressao = NORMAL e kgComida = POUCO e BatimentoCardiaco = NORMAL e
    // Glicemia = ALTA e TaxaHormonal = BAIXA e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra5() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getNormalValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getAltoValor());
        valores.add(this.taxaHormonal.getBaixaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //4- SE idade = JOVEM e pressao = ALTA e kgComida = POUCO e BatimentoCardiaco = NORMAL e
    // Glicemia = NORMAL e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra4() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getPoucoValor());
        valores.add(this.batimentoCardiaco.getNormalValor());
        valores.add(this.glicemia.getNormalValor());
        valores.add(this.taxaHormonal.getNormalValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //3- SE idade = JOVEM e pressao = BAIXA e kgComida = MUITO e BatimentoCardiaco = ALTO e
    // Glicemia = BAIXO e TaxaHormonal = NORMAL e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM
    private Double grauPertinenciaRegra3() {
        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getBaixaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getAltoValor());
        valores.add(this.glicemia.getBaixoValor());
        valores.add(this.taxaHormonal.getNormalValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //2 - SE idade = JOVEM e pressao = NORMAL e kgComida = MUITO e BatimentoCardiaco = ALTO e
    // Glicemia = NORMAL e TaxaHormonal = ALTA e Sendentario = SIM LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra2() {

        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getNormalValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getAltoValor());
        valores.add(this.glicemia.getNormalValor());
        valores.add(this.taxaHormonal.getAltaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }

    //1 - SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = ALTO e
    // Glicemia = ALTA e TaxaHormonal =	ALTA e Sendentario = NAO LOGO chanceDiabetico = TEM
    private Double grauPertinenciaRegra1() {

        List<Double> valores = new ArrayList<>();
        valores.add(this.idade.getValorJovem());
        valores.add(this.pressao.getAltaValor());
        valores.add(this.kgComida.getMuitoValor());
        valores.add(this.batimentoCardiaco.getAltoValor());
        valores.add(this.glicemia.getAltoValor());
        valores.add(this.taxaHormonal.getAltaValor());
        valores.add(this.sedentario.getTipoSedentario().getValor());

        return menorValor(valores);
    }



}
