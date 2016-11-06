package br.com.mfelipesp.diabetefuzzy.fuzzyficacao;

import br.com.mfelipesp.diabetefuzzy.model.BatimentoCardiaco;
import br.com.mfelipesp.diabetefuzzy.model.KgComida;

/**
 * Created by markFelipe on 05/11/16.
 */

public class BatimentoCardiacoFuzzyficacao {

    /***
     * Singleton
     */
    private static BatimentoCardiacoFuzzyficacao instance = null;

    private BatimentoCardiacoFuzzyficacao() {
    }

    public static BatimentoCardiacoFuzzyficacao getInstance() {
        if (instance == null) {
            instance = new BatimentoCardiacoFuzzyficacao();
        }
        return instance;
    }

    public void verificaConjuntoNebuloso(BatimentoCardiaco batimentoCardiaco) {

        //Aplica o conjunto nebuloso do Batimento Baixo
        Double baixa = conjuntoNebuloBaixa(batimentoCardiaco.getValor());

        //Aplica o conjunto nebuloso do Batimento Normal
        Double normal = conjuntoNebuloNormal(batimentoCardiaco.getValor());

        //Aplica o conjunto nebuloso do Batimento Alto
        Double alta = conjuntoNebuloAlta(batimentoCardiaco.getValor());

        batimentoCardiaco.setBaixoValor(Math.abs(baixa));
        batimentoCardiaco.setNormalValor(Math.abs(normal));
        batimentoCardiaco.setAltoValor(Math.abs(alta));
    }

    private Double conjuntoNebuloAlta(Double x) {

        if(x > 180){
            return 1D;
        }

        if( x >= 130 && x <= 180){
            return (x-130)/50;
        }

        if(x < 130){
            return 0D;
        }
        return 0D;

    }

    private Double conjuntoNebuloNormal(Double x) {

        if(x > 40 && x < 80 ) {
            return (x-40)/40;
        }

        if( x >= 80 && x <= 120){
            return 1D;
        }

        if( x > 120 && x < 150){
            return (150-x)/30;
        }

        if( x > 150){
            return 0D;
        }

        return 0D;
    }

    private Double conjuntoNebuloBaixa(Double x) {

        if (x <= 30){
            return 1D;
        }

        if(x > 30 && x < 50){
            return (50 - x)/20;
        }

        if (x >= 50){
            return 0D;
        }

        return 0D;

    }
}
