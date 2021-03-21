package application.Models;

import application.Models.Categoria;

// Herda class Categoria
public class Economia extends Categoria {

    private double valorAtual;

    public Economia(String titulo,double valor) {

        super(titulo, valor);
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

}
