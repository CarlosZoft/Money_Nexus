package application.Models;

/**
 * Classe responsavel pelo Divida
 * @author Helder Lourenço
 * @version 1.0.0
 */

public class Divida extends Categoria {
    private int tipo;
    /**
     * Metodo Construtor
     * @param titulo titulo da divida
     * @param valor valor da divida
     * @param tipo tipo de divida
     */
    public Divida(String titulo, double valor, int tipo) {
        super(titulo, valor);
        this.tipo = tipo;
    }
    /**
     * Metodo para obter tipo de divida
     * @return Tipo de divida
     */
    public int getTipo() {
        return tipo;
    }
    /**
     * Metodo para setar tipo de divida
     * @param tipo tipo de divida
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
