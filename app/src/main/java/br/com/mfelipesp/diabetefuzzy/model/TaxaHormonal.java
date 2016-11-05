package br.com.mfelipesp.diabetefuzzy.model;

import br.com.mfelipesp.diabetefuzzy.enums.TipoTaxaHormonal;

/**
 * Created by markFelipe on 04/11/16.
 */

public class TaxaHormonal {

    private Double valor;
    private Double baixaValor;
    private Double normalValor;
    private Double altaValor;

    private TipoTaxaHormonal tipoTaxaHormonal;

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

    public TipoTaxaHormonal getTipoTaxaHormonal() {
        return tipoTaxaHormonal;
    }

    public void setTipoTaxaHormonal(TipoTaxaHormonal tipoTaxaHormonal) {
        this.tipoTaxaHormonal = tipoTaxaHormonal;
    }

    @Override
    public String toString() {
        return "TaxaHormonal{" +
                "valor=" + valor +
                ", baixaValor=" + baixaValor +
                ", normalValor=" + normalValor +
                ", altaValor=" + altaValor +
                ", tipoTaxaHormonal=" + tipoTaxaHormonal +
                '}';
    }
}
