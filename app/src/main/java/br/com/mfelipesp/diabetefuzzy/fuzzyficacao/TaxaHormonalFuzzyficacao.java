package br.com.mfelipesp.diabetefuzzy.fuzzyficacao;

import br.com.mfelipesp.diabetefuzzy.model.BatimentoCardiaco;
import br.com.mfelipesp.diabetefuzzy.model.Glicemia;
import br.com.mfelipesp.diabetefuzzy.model.TaxaHormonal;

/**
 * Created by markFelipe on 05/11/16.
 */

public class TaxaHormonalFuzzyficacao {

    private static TaxaHormonalFuzzyficacao stancie;

    private TaxaHormonalFuzzyficacao(){}

    public static TaxaHormonalFuzzyficacao getInstance(){

        if(stancie == null){
            stancie = new TaxaHormonalFuzzyficacao();
        }
        return stancie;
    }

    public void verificaConjuntoNebuloso(TaxaHormonal taxaHormonal) {

        //Aplica o conjunto nebuloso
        Double baixa = conjuntoNebuloBaixa(taxaHormonal.getValor());
        Double normal = conjuntoNebuloNormal(taxaHormonal.getValor());
        Double alta = conjuntoNebuloAlta(taxaHormonal.getValor());


        taxaHormonal.setBaixaValor(Math.abs(baixa));
        taxaHormonal.setNormalValor(Math.abs(normal));
        taxaHormonal.setAltaValor(Math.abs(alta));
    }


    private Double conjuntoNebuloAlta(Double x) {

        if(x > 1500){
            return 1D;
        }

        if( x >= 1000 && x <= 1500){
            return (x-1000)/500;
        }

        if(x < 1000){
            return 0D;
        }
        return 0D;

    }

    private Double conjuntoNebuloNormal(Double x) {

        if(x > 300 && x < 400 ) {
            return (x-300)/100;
        }

        if( x >= 400 && x <= 900){
            return 1D;
        }

        if( x > 900 && x < 1200){
            return (1200-x)/300;
        }

        if( x > 1200 || x < 300){
            return 0D;
        }

        return 0D;
    }

    private Double conjuntoNebuloBaixa(Double x) {

        if (x <= 200){
            return 1D;
        }

        if(x > 200 && x < 400){
            return (400 - x)/200;
        }

        if (x >= 400){
            return 0D;
        }

        return 0D;

    }
}
