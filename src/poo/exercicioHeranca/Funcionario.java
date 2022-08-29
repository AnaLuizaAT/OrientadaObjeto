package poo.exercicioHeranca;


import lombok.Builder;

import java.time.LocalDate;

@Builder
public class Funcionario extends Pessoa {
    private String matricula;
    private LocalDate dtAdmissao;
    private String cargo;

    Pessoa novaPessoa = Pessoa.lerPessoa();
}