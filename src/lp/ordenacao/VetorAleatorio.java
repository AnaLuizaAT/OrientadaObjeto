package lp.ordenacao;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class VetorAleatorio {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int vetor[] = new int[20];
        int aleatorioMaximo = 40;
        int aleatorioMinimo = 1;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(aleatorioMaximo - aleatorioMinimo) + aleatorioMinimo;
            System.out.print("\t Vetor[" + i + "] = " + vetor[i]);
        }

        Arrays.sort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
