package application.Controllers;

import java.util.ArrayList;
import application.Models.*;
import java.time.LocalDate;
import java.util.Locale;
/**
 * 
 * @author Helder Lourenço
 * @version 1.0.0
 */
public class ControllerEconomia {

   
    private ArrayList <Economia> Eco = new ArrayList<Economia>();


   /**
    * Metodo para adicionar nova economia ou somar em uma já existente;
    * @param titulo titulo da economia
    * @param valor valor da economia
    */
    public void AdicionaEconomia(String titulo, double valor) {
        String tituloaux = titulo.toLowerCase();
        int flag = 0;
        for(int i = 0; i<this.getSize(); ++i){
            Economia tituloPesquisa = this.Eco.get(i);
            if(tituloPesquisa.getTitulo().toLowerCase().equals(tituloaux)) {
                this.Eco.get(i).setValor(tituloPesquisa.getValor() + valor);
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            Economia aux  = new Economia(titulo,valor);
            this.Eco.add(aux);
        }
    }
    /**
     * Metodo para editar economia
     * @param titulo titulo da economia 
     * @param valor valor da economia
     * @param index indice na lista
     */
    public void editaEconomia(String titulo, double valor, int index) {
        String tituloaux = titulo.toLowerCase();
        this.Eco.get(index).setTitulo(tituloaux);
        this.Eco.get(index).setValor(valor);
    }
    /**
     * Metodo para editar economia
     * @param titulo titulo da economia
     * @param index indice na lista
     */
    public void editaTituloEconomia(String titulo, int index) {
        String tituloaux = titulo.toLowerCase();
        this.Eco.get(index).setTitulo(tituloaux);
    }
    /**
     * Metodo para editar economia
     * @param valor valor da economia
     * @param index indice na lista
     */
    public void editaValorEconomia(double valor, int index) {
        this.Eco.get(index).setValor(this.Eco.get(index).getValor()+valor);
    }
    /**
     * Metodo para remover economia especifica
     * @param index indice na lista
     */
    public void removeEconomia(int index) {
        this.Eco.remove(index);
    }
    /**
     * Metodo para limpar lista de economias 
     */
    public void clearEconomia() {
        this.Eco.clear();
    }
    /**
     * Metodos para pegar tamanho da lista de economias
     * @return tamanho da lista
     */
    public int getSize() {
        return this.Eco.size();
    }
    /**
     * Metodo para obter todas as toStrings de Economia
     * @return Lista com metodos toString
     */
    public ArrayList<String> getAllEconomias(){
        ArrayList<String> aux = new ArrayList<String>();

        for(int i = 0 ; i<this.getSize(); ++i){
            aux.add(this.Eco.get(i).toString());
        }
        return aux;
    }
    /**
     * Metodo para obter todos os titulos de economia
     * @return lista com titulos de economias adicionadas
     */
    public ArrayList<String> getTitulos(){

        ArrayList <String> aux = new ArrayList<String>();

        for(int i = 0; i < this.getSize(); ++i) {
            aux.add(this.Eco.get(i).getTitulo());
        }

        return aux;
    }
    /**
     * Metodo para obter lista de Valores das economias adicionadas
     * @return Lista de valores das economias adicionadas
     */
    public ArrayList<Double> getValores(){

        ArrayList <Double> aux = new ArrayList<Double>();

        for(int i = 0; i < this.getSize(); ++i) {
            aux.add(this.Eco.get(i).getValor());
        }

        return aux;
    }
    /**
     * Metodo que obtem titulo de economia especifico
     * @param index indice na lista
     * @return Titulo especifico
     */
    public String getTitulo(int index) {
        return this.Eco.get(index).getTitulo();
    }   
    /**
     * Metodo que obtem o valor de economia especifico
     * @param index indice na lista
     * @return retorna valor especifico da economia
     */
    public double getValor(int index) {
        return this.Eco.get(index).getValor();
    }


}