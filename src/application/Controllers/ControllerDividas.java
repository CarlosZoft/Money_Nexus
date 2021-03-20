package application.Controllers;

import java.util.ArrayList;
import application.Models.*;
import java.time.LocalDate;
/**
 * Controller Para dividas
 *
 * @author  Carlos Rafael
 * @version 1.0
 * @since   2021-03-16
 */
public class ControllerDividas {
    // LIST DIVIDAS
    private ArrayList <Divida> div = new ArrayList<Divida>();


    // METHODS

    public int getSize() { return this.div.size(); }

    public ArrayList<Divida> getAll(){ return this.div; }

    public ArrayList<String> getTitulos(){
        ArrayList <String> aux = new ArrayList<String>();

        for(int i = 0; i < this.getSize(); i++) {
            aux.add(this.div.get(i).getTitulo());
        }
        return aux;
    }

    public ArrayList<Double> getValores(){
        ArrayList <Double> aux = new ArrayList<Double>();

        for(int i = 0; i < this.getSize(); i++) {
            aux.add(this.div.get(i).getValor());
        }
        return aux;
    }


    public String getTitulo(int index) { return this.div.get(index).getTitulo(); }

    public double getTipo(int index) { return this.div.get(index).getTipo(); }

    public double getValor(int index) {
        return this.div.get(index).getValor();
    }


}
