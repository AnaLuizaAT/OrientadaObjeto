package poo.exercicioHeranca;

import lombok.Data;

import java.time.LocalDate;

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
        return "Titulo: " + this.titulo;
    }
}