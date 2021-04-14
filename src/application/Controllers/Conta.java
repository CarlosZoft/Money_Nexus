package application.Controllers;
import application.Models.*;

import java.util.*;

public class Conta {
    private List<Saldo> saldos = new ArrayList<Saldo>();
    private List<Divida> dividas = new ArrayList<Divida>();
    private List<Saldo> historico = new ArrayList<Saldo>();
    private int[] indexInt = new int[]{0,0,0};

    // Crud - saldos

    public ArrayList<Double> getSaldos() {
        ArrayList<Double> aux = new ArrayList<Double>();
        for(int i = 0; i < getSizeSaldo(); ++i){
            aux.add(this.saldos.get(i).getValor());
        }
        return aux;
    }

    public Saldo getSaldo(int index) {
        return this.saldos.get(index);
    }

    public int getSizeSaldo(){
        return this.saldos.size();
    }

    public void AdicionaSaldo(String titulo, double valor) {
        Saldo aux = new Saldo(titulo, valor);
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
        this.saldos.get(index).setValor(valor);
    }

    public void removeSaldo(int index) {
        this.saldos.remove(index);
    }

    public void clearSaldos() {
        this.saldos.clear();
    }

    // Crud - dividas

    public int getSizeDivida(){
        return this.dividas.size();
    }

    public ArrayList<Double> getDividas() {
        ArrayList<Double> aux = new ArrayList<Double>();
        for(int i = 0; i< getSizeSaldo(); ++i){
            aux.add(this.saldos.get(i).getValor());
        }
        return aux;
    }

    public ArrayList<String> getDividasFixas() {
        ArrayList<String> aux = new ArrayList<String>();
        for (Iterator<Divida> it = dividas.iterator(); it.hasNext(); ) {
            if (it.next().getTipo() == 1)
                aux.add(it.next().toString());
        }
        return aux;
    }

    public ArrayList<String> getDividasVariaveis() {
        ArrayList<String> aux = new ArrayList<String>();
        for (Iterator<Divida> it = dividas.iterator(); it.hasNext(); ) {
            if (it.next().getTipo() == 2)
                aux.add(it.next().toString());
        }
        return aux;
    }

    public Divida getDivida(int index) {
        return this.dividas.get(index);
    }

    public void AdicionaDivida(String titulo, double valor, int tipo) {
        Divida aux = new Divida(titulo, valor, tipo);
        Saldo aux1 = new Saldo(titulo, valor*-1);
        this.dividas.add(aux);
        this.historico.add(aux1);
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