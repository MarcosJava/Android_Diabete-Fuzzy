package br.com.mfelipesp.diabetefuzzy.model;

import br.com.mfelipesp.diabetefuzzy.enums.TipoIdade;

/**
 * Created by markFelipe on 04/11/16.
 */

public class Idade {

    private Integer valor;
    private Double valorJovem;
    private Double valorAdulto;
    private Double valorIdoso;
    private TipoIdade tipoIdade;

    public Idade() {
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public TipoIdade getTipoIdade() {
        return tipoIdade;
    }

    public void setTipoIdade(TipoIdade tipoIdade) {
        this.tipoIdade = tipoIdade;
    }

    public Double getValorJovem() {
        return valorJovem;
    }

    public void setValorJovem(Double valorJovem) {
        this.valorJovem = valorJovem;
    }

    public Double getValorAdulto() {
        return valorAdulto;
    }

    public void setValorAdulto(Double valorAdulto) {
        this.valorAdulto = valorAdulto;
    }

    public Double getValorIdoso() {
        return valorIdoso;
    }

    public void setValorIdoso(Double valorIdoso) {
        this.valorIdoso = valorIdoso;
    }

    @Override
    public String toString() {
        return "Idade{" +
                "valor=" + valor +
                ", valorJovem=" + valorJovem +
                ", valorAdulto=" + valorAdulto +
                ", valorIdoso=" + valorIdoso +
                ", tipoIdade=" + tipoIdade +
                '}';
    }
}
