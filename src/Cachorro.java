public class Cachorro {

    //ATRIBUTOS
    private String nome; //POR SER LETRA MAIUSCULA SE TORNA UMA CLASSE
    private int idade; //VARIAVEL DO TIPO PRIMITIVO
    private String raca; //CLASSE
    private boolean dono;
    private boolean castrado;
    private double peso;

    public Cachorro() {
    }

    //CONSTRUTORES
    public Cachorro(String nome) {
        System.out.println("Criando o objeto: " + nome);
    }

    //Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca(String raca) {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isDono() {
        return dono;
    }

    public void setDono(boolean dono) {
        this.dono = dono;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // MÉTODOS
    public String toString() {
        return ("Nome: " +
                this.nome +
                "\nIdade: " +
                this.idade +
                "\nRaça: " +
                this.raca +
                "\nDono: " +
                this.dono +
                "\nCastrado: " +
                this.castrado +
                "\nPeso: " +
                this.peso);
    }
}