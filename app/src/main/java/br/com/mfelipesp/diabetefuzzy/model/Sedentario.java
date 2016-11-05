package br.com.mfelipesp.diabetefuzzy.model;

import br.com.mfelipesp.diabetefuzzy.enums.TipoSedentario;

/**
 * Created by markFelipe on 04/11/16.
 */

public class Sedentario {

    private TipoSedentario tipoSedentario;

    public TipoSedentario getTipoSedentario() {
        return tipoSedentario;
    }

    public void setTipoSedentario(TipoSedentario tipoSedentario) {
        this.tipoSedentario = tipoSedentario;
    }

    @Override
    public String toString() {
        return "Sedentario{" +
                "tipoSedentario=" + tipoSedentario +
                '}';
    }
}
