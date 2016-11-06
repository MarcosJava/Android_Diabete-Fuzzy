package br.com.mfelipesp.diabetefuzzy.fuzzyficacao;

import br.com.mfelipesp.diabetefuzzy.model.Idade;

/**
 * Created by markFelipe on 04/11/16.
 */

public class IdadeFuzzyficacao {

    /***
     * Singleton
     */
    private static IdadeFuzzyficacao instance = null;

    private IdadeFuzzyficacao(){}

    public static IdadeFuzzyficacao getInstance(){
        if(instance == null){
            instance = new IdadeFuzzyficacao();
        }
        return instance;
    }

    public void recebeConjuntoNebulo(Idade idade){

        //Aplica o conjunto nebuloso do Jovem
        Double conjuntoNebuloJovem = conjuntoNebulosoJovem(idade.getValor());
        idade.setValorJovem(Math.abs(conjuntoNebuloJovem));

        //Aplica o conjunto nebuloso do Adulto
        Double conjuntoNebuloAdulto = conjuntoNebulosoAdulto(idade.getValor());
        idade.setValorAdulto(Math.abs(conjuntoNebuloAdulto));

        //Aplica o conjunto nebuloso do Idoso
        Double conjuntoNebuloIdoso = conjuntoNebulosoIdoso(idade.getValor());
        idade.setValorIdoso(Math.abs(conjuntoNebuloIdoso));

    }

    private Double conjuntoNebulosoJovem(Integer valor){
        if(valor <= 30){
            return 1D;
        }
        if(valor > 30 && valor < 35){
            return  (35 - valor)/5D;
        }
        if (valor >= 35){
            return 0D;
        }
        return 0D;
    }

    private Double conjuntoNebulosoAdulto(Integer valor){

        if(valor >= 35 && valor <= 55){
            return 1D;
        }

        if(valor >= 30 && valor < 35){
            return  (valor - 30)/5D;
        }

        if(valor > 55 && valor < 60){
            return  (valor - 30)/5D;
        }

        if (valor >= 60 || valor < 30){
            return 0D;
        }

        return 0D;

    }

    private Double conjuntoNebulosoIdoso(Integer valor){

        if (valor > 60){
            return 1D;
        }

        if(valor >= 55 && valor < 60){
            return  (valor - 55)/5D;
        }

        return 0D;

    }

}
