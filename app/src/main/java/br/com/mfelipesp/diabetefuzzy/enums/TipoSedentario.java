package br.com.mfelipesp.diabetefuzzy.enums;

/**
 * Created by markFelipe on 04/11/16.
 */

public enum TipoSedentario {

    SIM(1D), NAO(1D);

    private Double valor;

    TipoSedentario(Double valor){
        this.valor = valor;
    }

    public Double getValor(){
        return valor;
    }

}
