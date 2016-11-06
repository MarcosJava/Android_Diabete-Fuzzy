package br.com.mfelipesp.diabetefuzzy.inferencia_nebulosa;

/**
 * Created by markFelipe on 05/11/16.
 */

public class InferenciaVO {

    private RegraNebulosa regraNebulosa;
    private double valorMinimoGanho;

    public InferenciaVO() {

    }

    public InferenciaVO(RegraNebulosa regraNebulosa, double valorMinimoGanho) {

        this.regraNebulosa = regraNebulosa;
        this.valorMinimoGanho = valorMinimoGanho;
    }

    public RegraNebulosa getRegraNebulosa() {
        return regraNebulosa;
    }

    public void setRegraNebulosa(RegraNebulosa regraNebulosa) {
        this.regraNebulosa = regraNebulosa;
    }

    public double getValorMinimoGanho() {
        return valorMinimoGanho;
    }

    public void setValorMinimoGanho(double valorMinimoGanho) {
        this.valorMinimoGanho = valorMinimoGanho;
    }

    @Override
    public String toString() {
        return "InferenciaVO{" +
                "regraNebulosa=" + regraNebulosa.toString() +
                ", valorMinimoGanho=" + valorMinimoGanho +
                '}';
    }
}
