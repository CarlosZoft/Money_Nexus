package application.Controllers;
import application.Models.*;

import java.util.*;

public class Conta {
    private List<Saldo> saldos = new ArrayList<Saldo>();
    private List<Divida> dividas = new ArrayList<Divida>();
    private List<Saldo> historico = new ArrayList<Saldo>();
    private List<String> fixas = new ArrayList<String>();
    private int[] indexInt = new int[]{0,0,0};
    private double saldoTotal = 0;
    private int DividaTotal = 0;

    // Crud - saldos

    public ArrayList<Double> getSaldos() {
        ArrayList<Double> aux = new ArrayList<Double>();
        for(int i = 0; i < getSizeSaldo(); ++i){
            aux.add(this.saldos.get(i).getValor());
        }
        return aux;
    }
    public double getSaldoTotal(){
        return this.saldoTotal;
    }
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
    public List<String> getDividasFixas() {
        
        for (int i = 0 ; i < this.getSizeDivida(); ++i ){
            Divida auxiliar = this.dividas.get(i);
            if (auxiliar.getTipo() == 0)
                    this.fixas.add(auxiliar.toString());
        }
        return this.fixas;
       
    }

    public List<String> getDividasVariaveis() {
            List<String> aux = new ArrayList<String>();
            for (Iterator<Divida> it = this.dividas.iterator(); it.hasNext(); ) {
                if (it.next().getTipo() == 1)
                    aux.add(it.next().toString());
            }
            return aux;
      
    }
    public Divida getDivida(int index) {
        return this.dividas.get(index);
    }
    public void pagoNaHora(String titulo, double valor){
        Saldo aux1 = new Saldo(titulo, valor*-1);
        this.historico.add(aux1);
    }
    public void AdicionaDivida(String titulo, double valor, int tipo) {
        Divida aux = new Divida(titulo, valor, tipo);
        Saldo aux1 = new Saldo(titulo, valor*-1);
        this.dividas.add(aux);
        this.historico.add(aux1);
        this.DividaTotal+=valor;
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

    public void removeDivida(int index) {
        this.dividas.remove(index);
        this.DividaTotal-=this.dividas.get(index).getValor();
    }

    public void clearDividas() {
        this.dividas.clear();
    }

    // Historico

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