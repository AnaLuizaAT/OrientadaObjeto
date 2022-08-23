package poo.exercicioHeranca.interfaces;

public class TesteInterface {
    public static void main(String[] args) {
        double a = 10, b = 20;
        Triangulo reto = new Triangulo();
        System.out.println("Àrea do triangulo = " + reto.areaTriangulo(a, b));
        System.out.println("Raiz do retangulo = " + reto.raiz(a, b));
    }
}