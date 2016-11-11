package br.com.mfelipesp.diabetefuzzy.model;

import br.com.mfelipesp.diabetefuzzy.enums.TipoPressao;

/**
 * Created by markFelipe on 04/11/16.
 */

public class Pressao {

    private Double valor;
    private Double baixaValor;
    private Double normalValor;
    private Double altaValor;
    private TipoPressao tipoPressao;


    public boolean isBaixa(){
        if(this.getBaixaValor() > 0 ){
            return true;
        }
        return false;
    }


    public boolean isAlta(){
        if(this.getAltaValor() > 0 ){
            return true;
        }
        return false;
    }


    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getBaixaValor() {
        return baixaValor;
    }

    public void setBaixaValor(Double baixaValor) {
        this.baixaValor = baixaValor;
    }

    public Double getNormalValor() {
        return normalValor;
    }

    public void setNormalValor(Double normalValor) {
        this.normalValor = normalValor;
    }

    public Double getAltaValor() {
        return altaValor;
    }

    public void setAltaValor(Double altaValor) {
        this.altaValor = altaValor;
    }

    public TipoPressao getTipoPressao() {
        return tipoPressao;
    }

    public void setTipoPressao(TipoPressao tipoPressao) {
        this.tipoPressao = tipoPressao;
    }

    @Override
    public String toString() {
        return "Pressao{" +
                "valor=" + valor +
                ", baixaValor=" + baixaValor +
                ", normalValor=" + normalValor +
                ", altaValor=" + altaValor +
                ", tipoPressao=" + tipoPressao +
                '}';
    }
}
