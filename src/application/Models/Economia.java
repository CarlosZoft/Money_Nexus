package application.Models;

import application.Models.Categoria;

// Herda class Categoria
public class Economia extends Categoria {
    private double Meta;

    public Economia(String titulo,double valor, double meta) {
        super(titulo, valor);
        this.Meta = meta;
    }

    public double getMeta() {
        return this.Meta;
    }

    public void setMeta(double valorAtual) {
        this.Meta = valorAtual;
    }
}
