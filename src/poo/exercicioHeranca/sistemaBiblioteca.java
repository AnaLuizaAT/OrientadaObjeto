package poo.exercicioHeranca;

import java.util.ArrayList;
import java.util.List;

public class sistemaBiblioteca {
    public static void main(String[] args) {
        int op = 0;

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        List<Autor> autores = new ArrayList<Autor>();
        List<Livro> livros = new ArrayList<Livro>();

        do {
            System.out.println("Sistema biblioteca \n" +
                    "Escolha uma opção: \n" +
                    "1 - Cadastrar Livro \n" +
                    "2- Cadastrar Funcionario \n" +
                    "3- Cadastrar Estudante \n" +
                    "4- Cadastrar Autor \n" +
                    "5- Realizar Emprestimo \n" +
                    "6- Receber Emprestimo\n");
        } while (op != 0);
    }
}
