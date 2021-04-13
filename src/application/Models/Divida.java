package application.Models;


// Herda class Categoria
public class Divida extends Categoria {

    private int tipo;

    public Divida(String titulo, double valor, int tipo) {
        super(titulo, valor);
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
