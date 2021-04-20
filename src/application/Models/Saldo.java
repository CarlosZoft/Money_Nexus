package application.Models;

import application.Models.Categoria;

/**
 * Classe Responsavel por objeto saldo
 * @author Helder Lourenço
 * @version 1.0.0
 */

public class Saldo extends Categoria {
    
    /**
     * Metodo construtor
     * @param titulo titulo do saldo
     * @param valor valor do saldo
     */
    public Saldo(String titulo, double valor) {
        super(titulo, valor);
    }

    /**
     * Metodo para obter titulo
     * @return titulo titulo 
     */
    @Override
    public String getTitulo() {
        return super.getTitulo();
    }
    /**
     * Metodo para obter string com atributos formatados para saida
     * @return string formatada
     */
    public String toString() {
        return
                "Data : " + this.getData() + ", Descricao : " 
                + getTitulo()  + ", Valor : "
                         + getValor();
              
    }
}
