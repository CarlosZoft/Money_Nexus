package application.Controllers;

import java.util.ArrayList;
import application.Models.*;
import java.time.LocalDate;
/**
 * Controller Para Economias
 *
 * @author  Carlos Rafael
 * @version 1.0
 * @since   2021-03-16
 */
public class ControllerEconomia {

    // LIST ECONOMIAS
    private ArrayList <Economia> Eco = new ArrayList<Economia>();


    // METHODS

    public int getSize() {
        return this.Eco.size();
    }

    public ArrayList<Economia> getAll(){
        return this.Eco;
    }

    public ArrayList<String> getTitulos(){

        ArrayList <String> aux = new ArrayList<String>();

        for(int i = 0; i < this.getSize(); i++) {
            aux.add(this.Eco.get(i).getTitulo());
        }

        return aux;
    }

    public ArrayList<Double> getValores(){

        ArrayList <Double> aux = new ArrayList<Double>();

        for(int i = 0; i < this.getSize(); i++) {
            aux.add(this.Eco.get(i).getValor());
        }

        return aux;
    }

    public ArrayList<LocalDate> getDates(){

        ArrayList <LocalDate> aux = new ArrayList<LocalDate>();

        for(int i = 0; i < this.getSize(); i++) {
            aux.add(this.Eco.get(i).getDate());
        }

        return aux;
    }

    public String getTitulo(int index) {
        return this.Eco.get(index).getTitulo();
    }

    public double getValor(int index) {
        return this.Eco.get(index).getValor();
    }

    public LocalDate getDate(int index) {
        return this.Eco.get(index).getDate();
    }

}