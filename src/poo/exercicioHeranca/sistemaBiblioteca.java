package poo.exercicioHeranca;

import java.util.Scanner;

public class sistemaBiblioteca {
    private final static String[] opcoes = {
            "|-----------Sistema biblioteca-----------|",
            "|           Escolha uma opção:           |",
            "|----------------------------------------|",
            "| 1 - Cadastrar Livro                    |",
            "| 2 - Cadastrar Funcionario              |",
            "| 3 - Cadastrar Estudante                |",
            "| 4 - Cadastrar Autor                    |",
            "| 5 - Realizar Emprestimo                |",
            "| 6 - Receber Emprestimo                 |",
            "| 0 - SAIR                               |",
            "|----------------------------------------|"
    };
    private static Scanner buffer = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 1;
        while (op != 0) {
            printMenu();
            System.out.println("\n\n");
            op = buffer.nextInt();
            escolha(op);
        }
    }

    private static void printMenu() {
        for (String op : opcoes) {
            System.out.println(op);
        }
    }

    private static void escolha(int op) {
        switch (op) {
            case 1:
                Livro.cadastrarLivro();
                break;
            default:
                System.out.println("Saindo da função escolha");
        }
    }
}