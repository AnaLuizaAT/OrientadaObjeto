package poo.exercicioHeranca;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Funcionario extends Pessoa {
    private String matricula;
    private LocalDate dtAdmissao;
    private String cargo;
}