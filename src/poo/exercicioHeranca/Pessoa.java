package poo.exercicioHeranca;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Scanner;

@Getter
@Setter
public class Pessoa {
    protected String nome;
    protected String endereco;
    protected LocalDate dtNascimento;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, LocalDate dtNascimento, String endereco) {

    }

    @Override
    public String toString() {
        return "Nome:\t " + this.nome
                + "\nEndereço:\t " + this.endereco
                + "\nData Nascimento:\t" + this.dtNascimento;
    }

    public static Pessoa lerPessoa() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome para cadastro: ");
        String nome = teclado.next();
        if (nome.length() < 3) {
            System.out.println("O nome deve ter ao menos 3 letras");
            return null;
        }
        Pessoa novaPessoa = new Pessoa(nome);
        System.out.println("Digite o endereco: ");
        novaPessoa.setEndereco(teclado.next());
        System.out.println("Digite a data de nascimento corretamente (dd/mm/yyyy): ");
        String data = teclado.next();
        String dtNasc[] = data.split("/");
        if (dtNasc.length != 3 ) {
            System.out.println("Digite a data corretamente");
            return null;
        }
        int day = Integer.parseInt(dtNasc[0]);
        int month = Integer.parseInt(dtNasc[1]);
        int year = Integer.parseInt(dtNasc[2]);
        LocalDate data_ = LocalDate.of(year, month, day);
        novaPessoa.setDtNascimento(data_);
        return novaPessoa;
    }
}