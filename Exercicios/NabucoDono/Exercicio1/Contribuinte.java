package Exercicio1;

abstract class Contribuinte {
    private String nome;
    private double rendaBruta;

    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {
        return nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public abstract double calcularImposto();
}