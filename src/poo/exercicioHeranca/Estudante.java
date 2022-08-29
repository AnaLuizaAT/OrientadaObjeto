package poo.exercicioHeranca;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public class Estudante extends Pessoa {
    private String ra;
    private String curso;
    private LocalDate dtInicio; //quando iniciou o curso

    Pessoa novaPessoa = Pessoa.lerPessoa();
}