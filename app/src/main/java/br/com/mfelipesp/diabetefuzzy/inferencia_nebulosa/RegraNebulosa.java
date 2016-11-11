package br.com.mfelipesp.diabetefuzzy.inferencia_nebulosa;

/**
 * Created by markFelipe on 05/11/16.
 */

public enum RegraNebulosa {

    REGRA_1("SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = ALTO e Glicemia = ALTA e TaxaHormonal = ALTA e Sendentario = NAO LOGO chanceDiabetico = TEM"),
    REGRA_2("SE idade = JOVEM e pressao = NORMAL e kgComida = MUITO e BatimentoCardiaco = ALTO e Glicemia = NORMAL e TaxaHormonal = ALTA e Sendentario = SIM LOGO chanceDiabetico = TEM"),
    REGRA_3("SE idade = JOVEM e pressao = BAIXA e kgComida = MUITO e BatimentoCardiaco = ALTO e Glicemia = BAIXO e TaxaHormonal = NORMAL e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM"),
    REGRA_4("SE idade = JOVEM e pressao = ALTA e kgComida = POUCO e BatimentoCardiaco = NORMAL e Glicemia = NORMAL e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM"),
    REGRA_5("SE idade = JOVEM e pressao = NORMAL e kgComida = POUCO e BatimentoCardiaco = NORMAL e Glicemia = ALTA e TaxaHormonal = BAIXA e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM"),
    REGRA_6("SE idade = JOVEM e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = NORMAL e Glicemia = BAIXO e TaxaHormonal = BAIXA e Sendentario = SIM LOGO chanceDiabetico = TEM"),
    REGRA_7("SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = BAIXO e Glicemia = ALTA e TaxaHormonal = ALTA e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM"),
    REGRA_8("SE idade = JOVEM e pressao = NORMAL e kgComida = MUITO e BatimentoCardiaco = BAIXO e Glicemia = NORMAL e TaxaHormonal = ALTA e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM"),
    REGRA_9("SE idade = JOVEM e pressao = BAIXA e kgComida = MUITO e BatimentoCardiaco = BAIXO e Glicemia = BAIXO e TaxaHormonal = NORMAL e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM"),
    REGRA_10("SE idade = JOVEM e pressao = ALTA e kgComida = POUCO e BatimentoCardiaco = ALTO e Glicemia = ALTA e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = TEM"),
    REGRA_11("SE idade = ADULTO e pressao = ALTA e kgComida = POUCO e BatimentoCardiaco = ALTO e Glicemia = ALTA e TaxaHormonal = ALTA e Sendentario = NAO LOGO chanceDiabetico = TEM"),
    REGRA_12("SE idade = ADULTO e pressao = NORMAL e kgComida = MUITO e BatimentoCardiaco = NORMAL e Glicemia = ALTA e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM"),
    REGRA_13("SE idade = ADULTO e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = ALTO e Glicemia = ALTA e TaxaHormonal = BAIXA e Sendentario = SIM LOGO chanceDiabetico = TEM"),
    REGRA_14("SE idade = ADULTO e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = NORMAL e Glicemia = NORMAL e TaxaHormonal = ALTA e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM"),
    REGRA_15("SE idade = ADULTO e pressao = NORMAL e kgComida = POUCO e BatimentoCardiaco = ALTO e Glicemia = NORMAL e TaxaHormonal = NORMAL e Sendentario = NAO LOGO chanceDiabetico = TEM"),
    REGRA_16("SE idade = ADULTO e pressao = BAIXA e kgComida = MUITO e BatimentoCardiaco = NORMAL e Glicemia = NORMAL e TaxaHormonal = BAIXA e Sendentario = NAO LOGO chanceDiabetico = TEM"),
    REGRA_17("SE idade = ADULTO e pressao = ALTA e kgComida = POUCO e BatimentoCardiaco = BAIXO e Glicemia = BAIXO e TaxaHormonal = ALTA e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM"),
    REGRA_18("SE idade = ADULTO e pressao = NORMAL e kgComida = MUITO e BatimentoCardiaco = BAIXO e Glicemia = BAIXO e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM"),
    REGRA_19("SE idade = ADULTO e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = BAIXA e Glicemia = BAIXA e TaxaHormonal = BAIXA e Sendentario = NAO chanceDiabetico = TEM"),
    REGRA_20("SE idade = ADULTO e pressao = NORMAL e kgComida = MUITO e BatimentoCardiaco = NORMAL e Glicemia = BAIXO e TaxaHormonal = ALTA e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM"),
    REGRA_21("SE idade = IDOSO e pressao = ALTA e kgComida = POUCO e BatimentoCardiaco = ALTO e Glicemia = BAIXO e TaxaHormonal = ALTA e Sendentario = SIM LOGO chanceDiabetico = TEM"),
    REGRA_22("SE idade = IDOSO e pressao = NORMAL e kgComida = MUITO e BatimentoCardiaco = BAIXO e Glicemia = ALTO e TaxaHormonal = ALTA e Sendentario = NAO LOGO chanceDiabetico = TEM"),
    REGRA_23("SE idade = IDOSO e pressao = BAIXA e kgComida = MUITO e BatimentoCardiaco = NORMAL e Glicemia = NORMAL e TaxaHormonal = ALTA e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM"),
    REGRA_24("SE idade = IDOSO e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = BAIXO e Glicemia = BAIXO e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM"),
    REGRA_25("SE idade = IDOSO e pressao = NORMAL e kgComida = POUCO e BatimentoCardiaco = ALTO e Glicemia = ALTO e TaxaHormonal = NORMAL e Sendentario = NAO LOGO chanceDiabetico = TEM"),
    REGRA_26("SE idade = IDOSO e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = BAIXA e Glicemia = NORMAL e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM"),
    REGRA_27("SE idade = IDOSO e pressao = ALTA e kgComida = POUCO e BatimentoCardiaco = NORMAL e Glicemia = BAIXO e TaxaHormonal = BAIXA e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM"),
    REGRA_28("SE idade = IDOSO e pressao = NORMAL e kgComida = POUCO e BatimentoCardiaco = NORMAL e Glicemia = ALTA e TaxaHormonal = BAIXA e Sendentario = SIM LOGO chanceDiabetico = TEM"),
    REGRA_29("SE idade = IDOSO e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = ALTO e Glicemia = NORMAL e TaxaHormonal = BAIXA e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM"),
    REGRA_30("SE idade = IDOSO e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = ALTO e Glicemia = NORMAL e TaxaHormonal = BAIXA e Sendentario = NAO LOGO chanceDiabetico = TEM"),
    REGRA_31("SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = NORMAL e Glicemia = BAIXA e TaxaHormonal = BAIXA e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM"),
    REGRA_32("SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = ALTO e Glicemia = BAIXA e TaxaHormonal = BAIXA e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM"),
    REGRA_33("SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = BAIXO e Glicemia = ALTA e TaxaHormonal = BAIXA e Sendentario = SIM LOGO chanceDiabetico = TEM"),
    REGRA_34("SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = NORMAL e Glicemia = ALTA e TaxaHormonal = ALTA e Sendentario = SIM LOGO chanceDiabetico = TEM"),
    REGRA_35("SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = BAIXO e Glicemia = ALTA e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = TEM"),
    REGRA_36("SE idade = JOVEM e pressao = ALTA e kgComida = MUITO e BatimentoCardiaco = NORMAL e Glicemia = ALTA e TaxaHormonal = BAIXA e Sendentario = SIM LOGO chanceDiabetico = TEM"),
    REGRA_37("SE idade = JOVEM e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = NORMAL e Glicemia = BAIXO e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = TEM"),
    REGRA_38("SE idade = ADULTO e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = NORMAL e Glicemia = BAIXO e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = TEM"),
    REGRA_39("SE idade = JOVEM e pressao = NORMAL e kgComida = POUCO e BatimentoCardiaco = NORMAL e Glicemia = BAIXO e TaxaHormonal = NORMAL e Sendentario = NAO LOGO chanceDiabetico = TEM"),
    REGRA_40("SE idade = JOVEM e pressao = BAIXA e kgComida = POUCO e BatimentoCardiaco = NORMAL e Glicemia = NORMAL e TaxaHormonal = NORMAL e Sendentario = SIM LOGO chanceDiabetico = NAO_TEM"),
    REGRA_41("SE idade = JOVEM e pressao = NORMAL e kgComida = POUCO e BatimentoCardiaco = NORMAL e Glicemia = NORMAL e TaxaHormonal = NORMAL e Sendentario = NAO LOGO chanceDiabetico = NAO_TEM"),
    REGRA_42("SE Glicemia = ALTA e pressao = ALTA LOGO chanceDiabetico = TEM"),
    REGRA_43("SE Glicemia = ALTA e pressao = NORMAL LOGO chanceDiabetico = TEM"),
    REGRA_44("SE Glicemia = ALTA e pressao = BAIXA LOGO chanceDiabetico = TEM"),
    REGRA_45("SE Glicemia = BAIXA e pressao = ALTA LOGO chanceDiabetico = TEM"),
    REGRA_46("SE Glicemia = BAIXA e pressao = NORMAL LOGO chanceDiabetico = NAO_TEM"),
    REGRA_47("SE Glicemia = BAIXA e pressao = BAIXA LOGO chanceDiabetico = TEM"),
    REGRA_48("SE Glicemia = NORMAL e pressao = BAIXA LOGO chanceDiabetico = NAO_TEM"),
    REGRA_49("SE Glicemia = NORMAL e pressao = NORMAL LOGO chanceDiabetico = NAO_TEM"),
    REGRA_50("SE Glicemia = NORMAL e pressao = ALTA LOGO chanceDiabetico = NAO_TEM"),;
    private String valor;
    RegraNebulosa(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
