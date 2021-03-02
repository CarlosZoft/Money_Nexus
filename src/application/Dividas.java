package application;

public class Dividas extends Categoria{
    private int tipo;

    public Dividas(String titulo, double valor, int tipo) {
        super(titulo, valor);
        this.tipo = tipo;
    }


}
