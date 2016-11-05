package br.com.mfelipesp.diabetefuzzy.model;

import br.com.mfelipesp.diabetefuzzy.enums.TipoBatimentoCardiaco;

/**
 * Created by markFelipe on 04/11/16.
 */

public class BatimentoCardiaco {

    private Double valor;
    private Double baixoValor;
    private Double normalValor;
    private Double altoValor;

    private TipoBatimentoCardiaco tipoBatimentoCardiaco;

    public TipoBatimentoCardiaco getTipoBatimentoCardiaco() {
        return tipoBatimentoCardiaco;
    }

    public void setTipoBatimentoCardiaco(TipoBatimentoCardiaco tipoBatimentoCardiaco) {
        this.tipoBatimentoCardiaco = tipoBatimentoCardiaco;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getBaixoValor() {
        return baixoValor;
    }

    public void setBaixoValor(Double baixoValor) {
        this.baixoValor = baixoValor;
    }

    public Double getNormalValor() {
        return normalValor;
    }

    public void setNormalValor(Double normalValor) {
        this.normalValor = normalValor;
    }

    public Double getAltoValor() {
        return altoValor;
    }

    public void setAltoValor(Double altoValor) {
        this.altoValor = altoValor;
    }

    @Override
    public String toString() {
        return "BatimentoCardiaco{" +
                "valor=" + valor +
                ", baixoValor=" + baixoValor +
                ", normalValor=" + normalValor +
                ", altoValor=" + altoValor +
                '}';
    }
}
