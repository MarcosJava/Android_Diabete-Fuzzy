package br.com.mfelipesp.diabetefuzzy.defuzzyficacao;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.mfelipesp.diabetefuzzy.enums.TipoChanceDiabetico;
import br.com.mfelipesp.diabetefuzzy.inferencia_nebulosa.InferenciaVO;
import br.com.mfelipesp.diabetefuzzy.model.ChanceDiabetico;

/**
 * Created by markFelipe on 05/11/16.
 */

public class Defuzzyficacao {

    private final List<InferenciaVO> lstInferenciaVO;
    private Map<Double, Double> valores = new HashMap<>();

    public Defuzzyficacao(List<InferenciaVO> lstInfereciaVO) {
        this.lstInferenciaVO = lstInfereciaVO;
    }

    public List<ChanceDiabetico> processaValores(){

        List<ChanceDiabetico> chanceDiabeticos = new ArrayList<>();

        for(InferenciaVO inferenciaVO : this.lstInferenciaVO){

            Double resultado = 0D;
            TipoChanceDiabetico tipoChanceDiabetico;

            if(inferenciaVO.getRegraNebulosa().getValor().contains("NAO_TEM")){
                resultado = valorNaoTem(inferenciaVO.getValorMinimoGanho());
                tipoChanceDiabetico = TipoChanceDiabetico.NAO_TEM;

            } else {
                resultado = valorTem(inferenciaVO.getValorMinimoGanho());
                tipoChanceDiabetico = TipoChanceDiabetico.TEM;
            }

            chanceDiabeticos.add(
                    new ChanceDiabetico(resultado,
                                        inferenciaVO.getValorMinimoGanho(),
                                        tipoChanceDiabetico,
                                        inferenciaVO.getRegraNebulosa()));

        }


        return chanceDiabeticos;
    }


    public double valorFinal(List<ChanceDiabetico> lstChanceDiabetico){

        Double dividendo = 0D;
        Double divisor = 0D;

        for(ChanceDiabetico cd : lstChanceDiabetico) {
            dividendo = cd.getValorInferencia() * cd.getValorPertinencia() + dividendo;
            divisor = cd.getValorInferencia() + divisor;

        }

        Double quociente = dividendo/divisor;

        Log.i(" ULTIMO RESULTADO == ", dividendo + "/" + divisor + "=" + quociente);

        return quociente;
    }


    private Double valorTem(Double valor) {

        if(valor == 1){
            return 65D;
        }

        if(valor > 0 && valor < 1){
             // valor = (x-55)/10;
            return (10*valor) + 55;
        }

        if(valor == 0){
            return 55D;
        }
        return 0D;

    }

    private Double valorNaoTem(Double valor) {

        if(valor == 1){
            return 50D;
        }

        if(valor > 0 || valor < 1){
            // valor = (60-x)/10;
            return 60 - (valor * 10);
        }

        if(valor == 0){
            return 61D;
        }

        return 0D;
    }


}
