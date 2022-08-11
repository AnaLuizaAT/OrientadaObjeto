package lp.ordenacao.heranca;

import lombok.Data;

@Data
public class Dono extends Pessoa {
    private AnimalTerrestre animal;
    private int quantidadeDeAnimais;

    public Dono() {
        super(); //chama o construtor da super classe.
    }

    public void alimentarAnimal(Cao animal) {
        System.out.println("Estou alimentando o cao chamado: " + animal.getNome());

    }

    public void alimentarAnimal(Gato animal) {
        System.out.println("Estou alimentando meu gato chamado: " + animal.getNome());
    }

    @Override
    public void andar() {
        this.passos += 2;
        System.out.println("Estou correndo");
    }
}
