package br.com.mfelipesp.diabetefuzzy.fuzzyficacao;

import br.com.mfelipesp.diabetefuzzy.model.BatimentoCardiaco;
import br.com.mfelipesp.diabetefuzzy.model.Glicemia;

/**
 * Created by markFelipe on 05/11/16.
 */

public class GlicemiaFuzzyficacao {

    private static GlicemiaFuzzyficacao stancie;

    private GlicemiaFuzzyficacao(){}

    public static GlicemiaFuzzyficacao getInstance(){

        if(stancie == null){
            stancie = new GlicemiaFuzzyficacao();
        }
        return stancie;
    }

    public void verificaConjuntoNebuloso(Glicemia glicemia) {

        //Aplica o conjunto nebuloso de Baixo Glicemia
        Double baixa = conjuntoNebuloBaixa(glicemia.getValor());

        //Aplica o conjunto nebuloso de Normal Glicemia
        Double normal = conjuntoNebuloNormal(glicemia.getValor());

        //Aplica o conjunto nebuloso de Alta Glicemia
        Double alta = conjuntoNebuloAlta(glicemia.getValor());

        glicemia.setBaixoValor(Math.abs(baixa));
        glicemia.setNormalValor(Math.abs(normal));
        glicemia.setAltoValor(Math.abs(alta));
    }


    private Double conjuntoNebuloAlta(Double x) {

        if(x > 140){
            return 1D;
        }

        if( x >= 125 && x <= 140){
            return (x-125)/15;
        }

        if(x < 125){
            return 0D;
        }
        return 0D;

    }

    private Double conjuntoNebuloNormal(Double x) {

        if(x > 65 && x < 75 ) {
            return (x-65)/10;
        }

        if( x >= 75 && x <= 120){
            return 1D;
        }

        if( x > 120 && x < 130){
            return (130-x)/10;
        }

        if( x > 130 || x < 65){
            return 0D;
        }

        return 0D;
    }

    private Double conjuntoNebuloBaixa(Double x) {

        if (x <= 40){
            return 1D;
        }

        if(x > 40 && x < 70){
            return (70 - x)/30;
        }

        if (x >= 70){
            return 0D;
        }

        return 0D;

    }
}
