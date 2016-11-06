package br.com.mfelipesp.diabetefuzzy.fuzzyficacao;

import br.com.mfelipesp.diabetefuzzy.model.Idade;
import br.com.mfelipesp.diabetefuzzy.model.Pressao;

/**
 * Created by markFelipe on 04/11/16.
 */

public class PressaoFuzzyficacao {

    /***
     * Singleton
     */
    private static PressaoFuzzyficacao instance = null;

    private PressaoFuzzyficacao() {
    }

    public static PressaoFuzzyficacao getInstance() {
        if (instance == null) {
            instance = new PressaoFuzzyficacao();
        }
        return instance;
    }


    public void verificaConjuntoNebuloso(Pressao pressao) {

        //Aplica o conjunto nebuloso do Pressao Baixa
        Double baixa = conjuntoNebuloBaixa(pressao.getValor());


        //Aplica o conjunto nebuloso do Pressao Normal
        Double normal = conjuntoNebuloNormal(pressao.getValor());


        //Aplica o conjunto nebuloso do Pressao Alta
        Double alta = conjuntoNebuloAlta(pressao.getValor());

        pressao.setBaixaValor(Math.abs(baixa));
        pressao.setNormalValor(Math.abs(normal));
        pressao.setAltaValor(Math.abs(alta));

    }

    private Double conjuntoNebuloBaixa(Double valor) {

        if (valor <= 10) {
            return 1D;
        }

        if (valor > 10 && valor < 15) {
            return (15 - valor) / 5;
        }

        if (valor >= 15) {
            return 0D;
        }
        return 0D;
    }

    private Double conjuntoNebuloNormal(Double valor) {

        if (valor > 12 && valor < 16) {
            return (valor - 12) / 4;
        }

        if (valor >= 16 && valor <= 17) {
            return 1D;
        }

        if (valor > 17 && valor < 19) {
            return (19 - valor) / 2;
        }

        if (valor >= 19 || valor <= 12) {
            return 0D;
        }
        return 0D;
    }

    private Double conjuntoNebuloAlta(Double valor) {

        if (valor >= 22) {
            return 1D;
        }
        if (valor <= 18) {
            return 0D;
        }

        if (valor > 18 && valor < 22) {
            return (18 - valor) / 4;
        }
        return 0D;
    }
}