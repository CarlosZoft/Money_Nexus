package application.Models;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



// Class Abstrata:
public abstract class Categoria {

    private String titulo;
    private double valor;
    private Date data;
 
    /**
     *
     * @param titulo recebe o titulo
     * @param valor recebe o valor 
     */
    public Categoria(String titulo, double valor) {
        this.titulo = titulo;
        this.valor = valor;
        this.data = new Date(); // Composição:
    }
   
    /**
     *  
     * @return valor;
     */
    public double getValor() {
        return valor;
    }

    /**
     *
     * @param valor recebe valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     *
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     *
     * @param titulo recebe titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     *
     * @return data formatada em string
     */
    public String getData() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(this.data);
    }

    @Override
    public String toString() {
        return
                 titulo  + ", "
                         + valor + ", " +
              this.getData();
    }
}
