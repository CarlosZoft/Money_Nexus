package application.Models;

import application.Models.Categoria;

/**
 * Classe responsavel por objeto economia
 * @author Carlos Rafael
 * @version 1.0.0
 */
    
public class Economia extends Categoria {


    /**
     * Metodo construtor
     * @param titulo titulo de economia
     * @param valor valor de economia
     */
    public Economia(String titulo,double valor) {
        super(titulo, valor);
    }

 
}
