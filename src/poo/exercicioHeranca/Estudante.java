package poo.exercicioHeranca;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Estudante extends Pessoa {
    private String ra;
    private String curso;
    private LocalDate dtInicio; //quando iniciou o curso
}