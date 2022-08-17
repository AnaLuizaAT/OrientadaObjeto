package poo.exercicioHeranca;

import java.util.ArrayList;
import java.util.List;

public class sistemaBiblioteca {
    public static void main(String[] args) {
        int op = 0;

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        List<Autor> autores = new ArrayList<Autor>();
        List<Livro> livros = new ArrayList<Livro>();

        String[] opcoes = {
                "Sistema biblioteca",
                "Escolha uma opção:",
                "1 - Cadastrar Livro",
                "2- Cadastrar Funcionario",
                "3- Cadastrar Estudante",
                "4- Cadastrar Autor",
                "5- Realizar Emprestimo",
                "6- Receber Emprestimo",
        };
    }
}