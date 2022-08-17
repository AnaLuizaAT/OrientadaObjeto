package poo.exercicioHeranca;

import java.time.LocalDate;
import java.time.Month;

public class TesteExercicioHeranca {
    public static void main(String[] args) {

        LocalDate dataNascimento = LocalDate.of(1998, Month.SEPTEMBER, 12);
        Autor beto = new Autor("Ana Luiza", dataNascimento, "Tres Lagoas", "TADS", 5);

        Livro livroPOO = new Livro("Programando em JAVA POO");
        livroPOO.setEditora("Editora Erica");
        LocalDate dataLancamentoPOO = LocalDate.of(2020, Month.APRIL, 22);
        livroPOO.setDataLancamento(dataLancamentoPOO);

        Livro livroNestJS = new Livro("Programando em Nest JS");
        livroNestJS.setEditora("Editora Westminster");
        LocalDate dataLancamentoNestJS = LocalDate.of(2022, Month.JULY, 10);
        livroNestJS.setDataLancamento(dataLancamentoNestJS);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Leticia");
        funcionario.setEndereco("Rua y");
        LocalDate dtNascimentoLeticia = LocalDate.of(2000, Month.SEPTEMBER, 12);
        funcionario.setDtNascimento(dtNascimentoLeticia);
        LocalDate dtAdmissao = LocalDate.of(2005, Month.MAY, 3);
        funcionario.setDtAdmissao(dtAdmissao);
        funcionario.setCargo("Programadora");
        funcionario.setMatricula("1001298");

        Estudante estudante1 = new Estudante();
        estudante1.setNome("Bruno");
        estudante1.setEndereco("Rua H");
        LocalDate dtNascimentoEstudante1 = LocalDate.of(1999, Month.APRIL, 10);
        funcionario.setDtNascimento(dtNascimentoEstudante1);
        estudante1.setRa("001");
        estudante1.setCurso("Computação");
        LocalDate dtInicioCurso = LocalDate.of(2014, Month.FEBRUARY, 3);
        estudante1.setDtInicio(dtInicioCurso);

        Emprestimo emprestimo1 = new Emprestimo();
        emprestimo1.setEstudante(estudante1);
        emprestimo1.setFuncionario(funcionario);
        emprestimo1.setLivro(livroPOO);
        LocalDate dtEmprestimo = LocalDate.of(2022, Month.AUGUST, 16);
        LocalDate dtDevolucao = LocalDate.of(2022, Month.AUGUST, 25);
        emprestimo1.setDtEmprestimo(dtEmprestimo);
        emprestimo1.setDtDevolucao(dtDevolucao);
    }
}