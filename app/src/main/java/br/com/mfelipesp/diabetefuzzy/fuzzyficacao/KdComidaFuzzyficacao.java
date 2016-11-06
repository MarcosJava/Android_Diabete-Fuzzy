package br.com.mfelipesp.diabetefuzzy.fuzzyficacao;

import br.com.mfelipesp.diabetefuzzy.model.KgComida;

/**
 * Created by markFelipe on 04/11/16.
 */

public class KdComidaFuzzyficacao {

    /***
     * Singleton
     */
    private static KdComidaFuzzyficacao instance = null;

    private KdComidaFuzzyficacao() {
    }

    public static KdComidaFuzzyficacao getInstance() {
        if (instance == null) {
            instance = new KdComidaFuzzyficacao();
        }
        return instance;
    }

    public void verificaConjuntoNebuloso(KgComida kgComida) {

        //Aplica o conjunto nebuloso de Pouca Comida
        Double pouco = conjuntoNebuloPouco(kgComida.getValor());

        //Aplica o conjunto nebuloso de Muita Comida
        Double muito = conjuntoNebuloMuito(kgComida.getValor());

        kgComida.setPoucoValor(Math.abs(pouco));
        kgComida.setMuitoValor(Math.abs(muito));
    }

    private Double conjuntoNebuloPouco(Double valor) {

        if (valor <= 100) {
            return 1D;
        }
        if (valor >= 150) {
            return 0D;
        }
        if (valor > 100 && valor < 150) {
            return (150 - valor) / 50;
        }
        return 0D;
    }

    private Double conjuntoNebuloMuito(Double valor) {

        if (valor >= 200) {
            return 1D;
        }
        if (valor <= 140) {
            return 0D;
        }
        if (valor > 100 && valor < 150) {
            return (valor - 100) / 600;
        }
        return 0D;

    }
}