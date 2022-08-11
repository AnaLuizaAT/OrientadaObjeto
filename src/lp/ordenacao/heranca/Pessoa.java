package lp.ordenacao.heranca;

import lombok.Data;

@Data
public abstract class Pessoa {
    protected String nome;
    protected String endereco;
    protected int passos;

    public void andar() {
        this.passos++;
        System.out.println("Andando...");
    }

    public void falar() {
        System.out.println("Falando...");
    }
}
