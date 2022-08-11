package lp.ordenacao.heranca;

import lombok.Data;

@Data
public class Funcionario extends Pessoa {
    private int matricula;

    @Override
    public String toString() {
        return "{ nome = " + this.nome + " matricula = '" + getMatricula() + "'" + "}";
    }
}
