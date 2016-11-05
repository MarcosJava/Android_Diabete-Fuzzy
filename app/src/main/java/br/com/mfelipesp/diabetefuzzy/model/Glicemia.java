package br.com.mfelipesp.diabetefuzzy.model;

import br.com.mfelipesp.diabetefuzzy.enums.TipoGlicemia;

/**
 * Created by markFelipe on 04/11/16.
 */

public class Glicemia {
    private Double valor;
    private Double baixoValor;
    private Double normalValor;
    private Double altoValor;

    private TipoGlicemia tipoGlicemia;

    public TipoGlicemia getTipoGlicemia() {
        return tipoGlicemia;
    }

    public void setTipoGlicemia(TipoGlicemia tipoGlicemia) {
        this.tipoGlicemia = tipoGlicemia;
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
        return "Glicemia{" +
                "valor=" + valor +
                ", baixoValor=" + baixoValor +
                ", normalValor=" + normalValor +
                ", altoValor=" + altoValor +
                '}';
    }
}
