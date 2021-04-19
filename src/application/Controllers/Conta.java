package application.Controllers;
import application.Models.*;

import java.util.*;

public class Conta {
    
    private static List<Saldo> saldos = new ArrayList<Saldo>();
    private static List<Divida> dividas = new ArrayList<Divida>();
    private static List<Saldo> historico = new ArrayList<Saldo>();
    private static List<Divida> fixas = new ArrayList<Divida>();
    private static List<Divida> variaveis = new ArrayList<Divida>();
    private double saldoTotal = 0;
    private int DividaTotal = 0;

    // Crud - saldos

    /**
     *
     * @return Array contendo saldos
     */

    public ArrayList<Double> getSaldos() {
        ArrayList<Double> aux = new ArrayList<Double>();
        for(int i = 0; i < getSizeSaldo(); ++i){
            aux.add(this.saldos.get(i).getValor());
        }
        return aux;
    }

    /**
     *
     * @return Saldo Total
     */
    public double getSaldoTotal(){
        return this.saldoTotal;
    }

    /**
     *
     * @param index Index do Saldo
     * @return  Saldo 
     */
    public Saldo getSaldo(int index) {
        return this.saldos.get(index);
    }

    public int getSizeSaldo(){
        return this.saldos.size();
    }

    public void AdicionaSaldo(String titulo, double valor) {
        Saldo aux = new Saldo(titulo, valor);
        this.saldoTotal += valor;
        this.saldos.add(aux);
        this.historico.add(aux);
    }

    public void editaSaldo(String titulo, double valor, int index) {
        this.saldos.get(index).setTitulo(titulo);
        this.saldos.get(index).setValor(valor);
    }

    public void editaTituloSaldo(String titulo, int index) {
        this.saldos.get(index).setTitulo(titulo);
    }

    public void editaValorSaldo(double valor, int index) { 
        this.saldoTotal -= this.saldos.get(index).getValor();
        this.saldos.get(index).setValor(valor);
        this.saldoTotal += valor;
    }
    public void subSaldo(double valor){
        this.saldoTotal -= valor;
        this.historico.add(new Saldo("Retirada de Saldo",valor*-1));
    }
     public void subSaldo(String titulo,double valor){
        this.saldoTotal -= valor;
        this.historico.add(new Saldo(titulo,valor*-1));
    }
    public void removeSaldo(int index) {
        this.saldos.remove(index);
        this.saldoTotal -= this.saldos.get(index).getValor();
    }

    public void clearSaldos() {
        this.saldos.clear();
        this.saldoTotal = 0;
    }

    // Crud - dividas

    public int getSizeDivida(){
        return this.dividas.size();
    }
    public int getDividaTotal() {
        return this.DividaTotal;
    }
    public ArrayList<Double> getDividas() {
        ArrayList<Double> aux = new ArrayList<Double>();
        for(int i = 0; i< getSizeSaldo(); ++i){
            aux.add(this.saldos.get(i).getValor());
        }
        return aux;
    }
    
    public String lastElementFixas() {
        List <String> aux = this.getDividasFixas(); 
        return aux.get(aux.size()-1);
    }
    
    public String lastElementVariaveis() {
        List <String> aux = this.getDividasVariaveis(); 
        return aux.get(aux.size()-1);
    }
    
    public List<String> getDividasFixas() {
       List<String> aux = new ArrayList<String>();
        for(int i = 0; i< sizeFixas(); ++i){
            aux.add(this.fixas.get(i).toString());
        }
        return aux;
    }

    public List<String> getDividasVariaveis() {
       List<String> aux = new ArrayList<String>();
        for(int i = 0; i< sizeVariaveis(); ++i){
            aux.add(this.variaveis.get(i).toString());
        }
        return aux;
    }
    public Divida getDivida(int index) {
        return this.dividas.get(index);
    }
    
    public String getDividaFixa(int index){
        return this.getDividasFixas().get(index);
    }
    
    public void pagoNaHora(String titulo, double valor){
        Saldo aux1 = new Saldo(titulo, valor*-1);
        this.historico.add(aux1);
    }
    
    public void AdicionaDivida(String titulo, double valor, int tipo) {
        Divida aux = new Divida(titulo, valor, tipo);
        Saldo aux1 = new Saldo(titulo, valor*-1);
        if(tipo == 0 ){
            this.fixas.add(aux);
        }
        if(tipo == 1 ){
            this.variaveis.add(aux);
        }
        this.dividas.add(aux);
        this.historico.add(aux1);
        this.DividaTotal += valor;
    }
    
    public int sizeFixas(){
        return this.fixas.size();
    }
    public int sizeVariaveis(){
        return this.variaveis.size();
    }
    
    public void editaDivida(String titulo, double valor, int tipo, int index) {
        this.dividas.get(index).setTitulo(titulo);
        this.dividas.get(index).setValor(valor);
        this.dividas.get(index).setTipo(tipo);
    }

    public void editaTitulo(String titulo, int index) {
        this.dividas.get(index).setTitulo(titulo);
    }

    public void editaValor(double valor, int index) {
        this.dividas.get(index).setValor(valor);
    }

    public void editaTipo(int tipo, int index) {
        this.dividas.get(index).setTipo(tipo);
    }

    public void removeDividaFixa(int index) {
        this.fixas.remove(index);
    }
    
    public void removeDividaVariavel(int index) {
        this.variaveis.remove(index);
    }

    public void clearDividas() {
        this.dividas.clear();
    }

    // Historico
    public int sizeExtrato () {
        return this.historico.size();
    }
    
    public boolean verificaValor(int index){
        double auxiliar = this.historico.get(index).getValor();
        if(auxiliar > 0){
            return false;
        }
        return true;
    }
    
    public ArrayList<String> getExtrato() {
        ArrayList<String> Datas = new ArrayList<String>();

        for(int i = 0 ; i < this.historico.size(); ++i)
            Datas.add(this.historico.get(i).toString());

        return Datas;
    }

    public ArrayList<String> getDates() {
        ArrayList<String> Datas = new ArrayList<String>();

        for(int i = 0; i < this.historico.size(); ++i) {
            String aux = this.historico.get(i).getData();

            Datas.add(aux);
        }
        return Datas;
    }

}