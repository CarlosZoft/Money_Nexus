package application;

public class Economia {

    private double valor;


    @Override
    public String toString() {
        return "Saldo{" +
                "valor=" + valor +
                '}';
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
