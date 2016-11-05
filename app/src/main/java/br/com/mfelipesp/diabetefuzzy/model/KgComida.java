package br.com.mfelipesp.diabetefuzzy.model;

import br.com.mfelipesp.diabetefuzzy.enums.TipoKgComida;

/**
 * Created by markFelipe on 04/11/16.
 */

public class KgComida {

    private Double valor;
    private Double poucoValor;
    private Double muitoValor;
    private TipoKgComida tipoKgComida;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getPoucoValor() {
        return poucoValor;
    }

    public void setPoucoValor(Double poucoValor) {
        this.poucoValor = poucoValor;
    }

    public Double getMuitoValor() {
        return muitoValor;
    }

    public void setMuitoValor(Double muitoValor) {
        this.muitoValor = muitoValor;
    }

    public TipoKgComida getTipoKgComida() {
        return tipoKgComida;
    }

    public void setTipoKgComida(TipoKgComida tipoKgComida) {
        this.tipoKgComida = tipoKgComida;
    }

    @Override
    public String toString() {
        return "KgComida{" +
                "valor=" + valor +
                ", poucoValor=" + poucoValor +
                ", muitoValor=" + muitoValor +
                ", tipoKgComida=" + tipoKgComida +
                '}';
    }
}
