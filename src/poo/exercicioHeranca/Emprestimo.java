package poo.exercicioHeranca;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Emprestimo {
    private Estudante estudante;
    private Funcionario funcionario;
    private Livro livro;
    private LocalDate dtEmprestimo;
    private LocalDate dtDevolucao;
}
