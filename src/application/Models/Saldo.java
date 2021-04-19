package application.Models;

import application.Models.Categoria;

// Herda class Categoria
public class Saldo extends Categoria {

    public Saldo(String titulo, double valor) {
        super(titulo, valor);
    }

    //Exemplo sobrecarga;
    @Override
    public String getTitulo() {
        return super.getTitulo();
    }
    public String toString() {
        return
                "Data : " + this.getData() + ", Descricao : " 
                + getTitulo()  + ", Valor : "
                         + getValor();
              
    }
}
