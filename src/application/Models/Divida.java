package application.Models;

import application.Models.Categoria;

public class Divida extends Categoria {
    private int tipo;

    public Divida(String titulo, double valor, int tipo) {
        super(titulo, valor);
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
}
