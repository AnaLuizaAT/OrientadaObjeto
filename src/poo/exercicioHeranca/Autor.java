package poo.exercicioHeranca;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Autor extends Pessoa {
    private String formacao;
    private int qtdLivros; //nunca armazenar isso

    public Autor(String nome, LocalDate dtNascimento, String endereco, String formacao, int qtdLivros) {
        super(nome, dtNascimento, endereco);
        this.formacao = formacao;
        this.qtdLivros = qtdLivros;
    }
}