package application.Controllers;

import java.util.ArrayList;
import application.Models.*;
import java.time.LocalDate;
/**
 * Controller Para Saldo positivo
 *
 * @author  Carlos Rafael
 * @version 1.0
 * @since   2021-03-16
 */
public class ControllerSaldo {
    // LIST SALDO
    private ArrayList <Saldo> Sal = new ArrayList<Saldo>();


    // METHODS

    public int getSize() {
        return this.Sal.size();
    }

    public ArrayList<Saldo> getAll(){
        return this.Sal;
    }

    public ArrayList<String> getTitulos(){

        ArrayList <String> aux = new ArrayList<String>();

        for(int i = 0; i < this.getSize(); i++) {
            aux.add(this.Sal.get(i).getTitulo());
        }

        return aux;
    }

    public ArrayList<Double> getValores(){

        ArrayList <Double> aux = new ArrayList<Double>();

        for(int i = 0; i < this.getSize(); i++) {
            aux.add(this.Sal.get(i).getValor());
        }

        return aux;
    }

    public ArrayList<LocalDate> getDates(){

        ArrayList <LocalDate> aux = new ArrayList<LocalDate>();

        for(int i = 0; i < this.getSize(); i++) {
            aux.add(this.Sal.get(i).getDate());
        }

        return aux;
    }

    public String getTitulo(int index) {
        return this.Sal.get(index).getTitulo();
    }

    public double getValor(int index) {
        return this.Sal.get(index).getValor();
    }

    public LocalDate getDate(int index) {
        return this.Sal.get(index).getDate();
    }

}