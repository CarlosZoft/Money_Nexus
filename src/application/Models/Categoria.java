package application.Models;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



// Class Abstrata:
public abstract class Categoria {

    private String titulo;
    private double valor;
    private Date data =  new Date();// Composição:

    public Categoria(String titulo, double valor) {
        this.titulo = titulo;
        this.valor = valor;
    }
    public Categoria() {}
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(this.data);
    }

    @Override
    public String toString() {
        return "Categoria {" +
                "titulo='" + titulo + '\'' +
                "Data=" + this.getData() +
                ", valor=" + valor +
                '}';
    }
}
