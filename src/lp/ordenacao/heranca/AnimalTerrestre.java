package lp.ordenacao.heranca;

import lombok.Data;

@Data
public abstract class AnimalTerrestre {
    protected String nome;
    protected String raca;
    protected int idade;

    public abstract void emitirSom();
}
