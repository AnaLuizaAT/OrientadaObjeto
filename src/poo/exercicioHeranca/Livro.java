package poo.exercicioHeranca;

import lombok.Data;

import java.time.LocalDate;
import java.util.Scanner;

@Data
public class Livro {
    private String titulo;
    private String editora;
    private LocalDate dataLancamento;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Titulo:\t " + this.titulo
                + "\nEditora\t" + this.editora
                + "\nData Lançamento:\t" + this.dataLancamento;
    }

    public static Livro cadastrarLivro() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o titulo do livro: ");
        String titulo = in.next();
        if (titulo.length() < 2) {
            System.out.println("O titulo deve ter ao menos 2 caracteres");
            return null;
        }
        Livro novoLivro = new Livro(titulo);
        System.out.print("Digite a editora do livro: ");
        novoLivro.setEditora(in.next());
        System.out.print("Digite a data de lançamento (dd/mm/yyyy): ");
        String data = in.next();
        String dtLanc[] = data.split("/");
        if (dtLanc.length != 3) {
            System.out.println("Digite a data corretamente");
            return null;
        }
        int dd = Integer.parseInt(dtLanc[0]);
        int m = Integer.parseInt(dtLanc[1]);
        int y = Integer.parseInt(dtLanc[2]);
        LocalDate d = LocalDate.of(y, m, dd);
        novoLivro.setDataLancamento(d);
        return novoLivro;
    }
}