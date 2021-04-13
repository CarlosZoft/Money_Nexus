package application.Controllers;
import application.Models.*;

import java.util.*;

public class Conta {
    private ArrayList<Saldo> saldos = new ArrayList<Saldo>();
    private ArrayList<Divida> dividas = new ArrayList<Divida>();
    private ArrayList<Saldo> historico = new ArrayList<Saldo>();

    // Crud - saldos

    public ArrayList<Saldo> getSaldos() {
        return this.saldos;
    }

    public Saldo getSaldo(int index) {
        return this.saldos.get(index);
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

    public ArrayList<Divida> getDividas() {
        return this.dividas;
    }

    public ArrayList<Divida> getDividasFixas() {
        ArrayList<Divida> aux = new ArrayList<Divida>();
        for (Iterator<Divida> it = dividas.iterator(); it.hasNext(); ) {
            if (it.next().getTipo() == 1)
                aux.add(it.next());
        }
        return aux;
    }

    public ArrayList<Divida> getDividasVariaveis() {
        ArrayList<Divida> aux = new ArrayList<Divida>();
        for (Iterator<Divida> it = dividas.iterator(); it.hasNext(); ) {
            if (it.next().getTipo() == 2)
                aux.add(it.next());
        }
        return aux;
    }

    public Divida getDivida(int index) {
        return this.dividas.get(index);
    }

    public void AdicionaDivida(String titulo, double valor, int tipo) {
        Divida aux = new Divida(titulo, valor, tipo);
        Saldo aux1 = new Saldo(titulo, valor);
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

    public ArrayList<Saldo> getExtrato() {
        return this.historico;
    }

    public ArrayList<String> getDates() {
        ArrayList<String> Datas = new ArrayList<String>();

        for (int i = 0; i < this.historico.size(); ++i) {
            String aux = this.historico.get(i).getData();

            Datas.add(aux);
        }
        return Datas;
    }

}