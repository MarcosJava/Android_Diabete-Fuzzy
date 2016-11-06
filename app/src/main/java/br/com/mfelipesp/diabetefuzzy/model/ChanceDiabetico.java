package br.com.mfelipesp.diabetefuzzy.model;

import br.com.mfelipesp.diabetefuzzy.enums.TipoChanceDiabetico;
import br.com.mfelipesp.diabetefuzzy.inferencia_nebulosa.RegraNebulosa;

/**
 * Created by markFelipe on 05/11/16.
 */

public class ChanceDiabetico {

    private Double valorPertinencia;
    private Double valorInferencia;
    private TipoChanceDiabetico tipoChanceDiabetico;
    private RegraNebulosa regraNebulosa;

    public ChanceDiabetico(Double valorPertinencia, Double valorInferencia, TipoChanceDiabetico tipoChanceDiabetico, RegraNebulosa regraNebulosa) {
        this.valorPertinencia = valorPertinencia;
        this.valorInferencia = valorInferencia;
        this.tipoChanceDiabetico = tipoChanceDiabetico;
        this.regraNebulosa = regraNebulosa;
    }

    public Double getValorPertinencia() {
        return valorPertinencia;
    }

    public void setValorPertinencia(Double valorPertinencia) {
        this.valorPertinencia = valorPertinencia;
    }

    public Double getValorInferencia() {
        return valorInferencia;
    }

    public void setValorInferencia(Double valorInferencia) {
        this.valorInferencia = valorInferencia;
    }

    public TipoChanceDiabetico getTipoChanceDiabetico() {
        return tipoChanceDiabetico;
    }

    public RegraNebulosa getRegraNebulosa() {
        return regraNebulosa;
    }

    public void setRegraNebulosa(RegraNebulosa regraNebulosa) {
        this.regraNebulosa = regraNebulosa;
    }

    public void setTipoChanceDiabetico(TipoChanceDiabetico tipoChanceDiabetico) {
        this.tipoChanceDiabetico = tipoChanceDiabetico;
    }

    @Override
    public String toString() {
        return "ChanceDiabetico{" +
                "valorPertinencia=" + valorPertinencia +
                ", valorInferencia=" + valorInferencia +
                ", tipoChanceDiabetico=" + tipoChanceDiabetico +
                ", regraNebulosa=" + regraNebulosa +
                '}';
    }
}
