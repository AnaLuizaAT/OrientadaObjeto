package poo.exercicioHeranca;

import lombok.Data;

import java.time.LocalDate;

@Data
public abstract class Pessoa {
    protected String nome;
    protected LocalDate dtNascimento;
    protected String endereco;

    protected Pessoa() {
    }

    protected Pessoa(String _nome, LocalDate _dtNascimento, String _endereco) {
        this.nome = _nome;
        this.dtNascimento = _dtNascimento;
        this.endereco = _endereco;
    }
}
