package br.com.mfelipesp.diabetefuzzy.model;

import br.com.mfelipesp.diabetefuzzy.enums.TipoIdade;

/**
 * Created by markFelipe on 04/11/16.
 */

public class Idade {

    private Integer valor;
    private Double idadeJovemConjuntoNebuloso;
    private Double idadeAdultoConjuntoNebuloso;
    private Double idadeIdosoConjuntoNebuloso;
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

    public Double getIdadeJovemConjuntoNebuloso() {
        return idadeJovemConjuntoNebuloso;
    }

    public void setIdadeJovemConjuntoNebuloso(Double idadeJovemConjuntoNebuloso) {
        this.idadeJovemConjuntoNebuloso = idadeJovemConjuntoNebuloso;
    }

    public Double getIdadeAdultoConjuntoNebuloso() {
        return idadeAdultoConjuntoNebuloso;
    }

    public void setIdadeAdultoConjuntoNebuloso(Double idadeAdultoConjuntoNebuloso) {
        this.idadeAdultoConjuntoNebuloso = idadeAdultoConjuntoNebuloso;
    }

    public Double getIdadeIdosoConjuntoNebuloso() {
        return idadeIdosoConjuntoNebuloso;
    }

    public void setIdadeIdosoConjuntoNebuloso(Double idadeIdosoConjuntoNebuloso) {
        this.idadeIdosoConjuntoNebuloso = idadeIdosoConjuntoNebuloso;
    }

    @Override
    public String toString() {
        return "Idade{" +
                "valor=" + valor +
                ", idadeJovemConjuntoNebuloso=" + idadeJovemConjuntoNebuloso +
                ", idadeAdultoConjuntoNebuloso=" + idadeAdultoConjuntoNebuloso +
                ", idadeIdosoConjuntoNebuloso=" + idadeIdosoConjuntoNebuloso +
                ", tipoIdade=" + tipoIdade +
                '}';
    }
}
