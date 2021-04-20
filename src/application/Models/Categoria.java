package application.Models;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * Classe Abstrata responsavel por generalizar atributos
 * @author Carlos Rafael 
 * @version 1.0.0
 */
public abstract class Categoria {

    private String titulo;
    private double valor;
    private Date data;
 
    /**
     * Metodo construtor de Categoria
     * @param titulo titulo do objeto
     * @param valor valor do objeto
     */
    public Categoria(String titulo, double valor) {
        this.titulo = titulo;
        this.valor = valor;
        this.data = new Date(); // Composição:
    }
   /**
    * Metodo para obter valor;
    * @return Valor
    */
    public double getValor() {
        return valor;
    }
    /**
     * Metodo para setar valor
     * @param valor valor 
     */
  
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Metodo para obter titulo
     * @return titulo titulo
     */
    public String getTitulo() {
        return titulo;
    }

   /**
    * Metodo para setar titulo
    * @param titulo titulo
    */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   /**
    * Metodo para obter data formatada em string
    * @return Data formatada
    */
    public String getData() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(this.data);
    }
    
    /**
     * Metodo responsavel por modelar saida para o usuario
     * @return string formatada
     */
    @Override
    public String toString() {
        return
                 titulo  + ", "
                         + valor + ", " +
              this.getData();
    }
}
