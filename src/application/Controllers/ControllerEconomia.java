package application.Controllers;

import java.util.ArrayList;
import application.Models.*;
import java.time.LocalDate;
import java.util.Locale;

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
    public void AdicionaEconomia(String titulo, double valor, int meta) {
        String tituloaux = titulo.toLowerCase();
        int flag = 0;
        for(int i = 0; i<getSize(); ++i){
            Economia tituloPesquisa = this.Eco.get(i);
            if(tituloPesquisa.getTitulo() == tituloaux) {
                this.Eco.get(i).setValor(tituloPesquisa.getValor() + valor);
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            Economia aux  = new Economia(tituloaux,valor,meta);
            this.Eco.add(aux);
        }
    }

    public void editaEconomia(String titulo, double valor, int index) {
        String tituloaux = titulo.toLowerCase();
        this.Eco.get(index).setTitulo(tituloaux);
        this.Eco.get(index).setValor(valor);
    }

    public void editaTituloEconomia(String titulo, int index) {
        String tituloaux = titulo.toLowerCase();
        this.Eco.get(index).setTitulo(tituloaux);
    }

    public void editaValorEconomia(double valor, int index) {
        this.Eco.get(index).setValor(valor);
    }

    public void removeEconomia(int index) {
        this.Eco.remove(index);
    }

    public void clearEconomia() {
        this.Eco.clear();
    }
    public int getSize() {
        return this.Eco.size();
    }

    public ArrayList<String> getAllEconomias(){
        ArrayList<String> aux = new ArrayList<String>();

        for(int i = 0 ; i<this.getSize(); ++i){
            aux.add(this.Eco.get(i).toString());
        }
        return aux;
    }

    public ArrayList<String> getTitulos(){

        ArrayList <String> aux = new ArrayList<String>();

        for(int i = 0; i < this.getSize(); ++i) {
            aux.add(this.Eco.get(i).getTitulo());
        }

        return aux;
    }

    public ArrayList<Double> getValores(){

        ArrayList <Double> aux = new ArrayList<Double>();

        for(int i = 0; i < this.getSize(); ++i) {
            aux.add(this.Eco.get(i).getValor());
        }

        return aux;
    }



    public String getTitulo(int index) {
        return this.Eco.get(index).getTitulo();
    }

    public double getValor(int index) {
        return this.Eco.get(index).getValor();
    }


}