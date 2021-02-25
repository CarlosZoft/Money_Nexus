package application;
import java.time.LocalDate;

public class Categoria {

    private String titulo;
    private LocalDate date;
    private double valor;

    public Categoria(String titulo, double valor) {
        this.titulo = titulo;
        this.date = LocalDate.now();
        this.valor = valor;
    }

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

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + date + '\'' +
                ", valor=" + valor +
                '}';
    }
}
