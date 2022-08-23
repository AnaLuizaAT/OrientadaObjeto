package poo.exercicioHeranca.exception;

import org.w3c.dom.ls.LSOutput;

public class TesteException {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException ex) {
            System.out.println("Erro, frase nula!\nUsando uma frase default");
            frase = "Estou aprendendo";
            novaFrase = frase.toUpperCase();
        } catch (IllegalArgumentException ex) {
            System.out.println("Argumento inválido!");
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);

        String novaMsg = null;
        String msgCaixaAlta;
        try {
            msgCaixaAlta = caixaAlta(novaMsg);
        } catch (NullPointerException e) {
            novaMsg = "Nova frase...";
            msgCaixaAlta = caixaAlta(novaMsg);
            e.printStackTrace();
        }
        System.out.println("Msg Caixa Alta: " + msgCaixaAlta);
    }

    public static String caixaAlta(String msg) throws NullPointerException {
        String ca = msg.toUpperCase();
        return ca;
    }
}