package application.Controllers;
import application.Models.*;

import java.util.*;
/**
 * Classe Conta para controle de fluxo de caixa
 * @author Carlos Rafael
 * @version 1.0.0
 */
public class Conta {
    
    private static List<Saldo> saldos = new ArrayList<Saldo>();
    private static List<Divida> dividas = new ArrayList<Divida>();
    private static List<Saldo> historico = new ArrayList<Saldo>();
    private static List<Divida> fixas = new ArrayList<Divida>();
    private static List<Divida> variaveis = new ArrayList<Divida>();
    private double saldoTotal = 0;
    private int DividaTotal = 0;

    /**
     * Metodo para obter uma lista com todos os saldos
     * @return Lista Saldos
     */
    public ArrayList<Double> getSaldos() {
        ArrayList<Double> aux = new ArrayList<Double>();
        for(int i = 0; i < getSizeSaldo(); ++i){
            aux.add(this.saldos.get(i).getValor());
        }
        return aux;
    }
    /**
     * Metodo para retornar saldo;
     * @return  Saldo total
     */
    public double getSaldoTotal(){
        return this.saldoTotal;
    }

    /**
     * Metodo para pegar saldo especifico
     * @param index indice na lista
     * @return Saldo especifico
     */
    public Saldo getSaldo(int index) {
        return this.saldos.get(index);
    }
    /**
     * Metodo para obter a quantidada de saldos na lista
     * @return tamanho da lista
     */
    public int getSizeSaldo(){
        return this.saldos.size();
    }
    /**
     * Metodo para adicionar saldo
     * @param titulo Titulo do saldo
     * @param valor  valor do saldo 
     */
    public void AdicionaSaldo(String titulo, double valor) {
        Saldo aux = new Saldo(titulo, valor);
        this.saldoTotal += valor;
        this.saldos.add(aux);
        this.historico.add(aux);
    }
    /**
     * Metodo para editar saldo 
     * @param titulo titulo do saldo
     * @param valor valor do saldo
     * @param index indice da lista
     */
    public void editaSaldo(String titulo, double valor, int index) {
        this.saldos.get(index).setTitulo(titulo);
        this.saldos.get(index).setValor(valor);
    }
    /**
     * Metodo para Editar titulo de um saldo especifico
     * @param titulo titulo do saldo
     * @param index indice na lista
     */
    public void editaTituloSaldo(String titulo, int index) {
        this.saldos.get(index).setTitulo(titulo);
    }
    /**
     * Metodo para Editar Valor de um saldo especifico
     * @param valor valor do saldo
     * @param index indice na lista
     */
    public void editaValorSaldo(double valor, int index) { 
        this.saldoTotal -= this.saldos.get(index).getValor();
        this.saldos.get(index).setValor(valor);
        this.saldoTotal += valor;
    }/**
     * Metodo para retirar saldo
     * @param valor valor do saldo
     */
    public void subSaldo(double valor){
        this.saldoTotal -= valor;
        this.historico.add(new Saldo("Retirada de Saldo",valor*-1));
    }
    /**
     * Metodo para subtrair do saldo total
     * @param valor 
     */
    public void subSaldoTotal(double valor){
        this.saldoTotal -= valor;
    }
    /**
     * Metodo para sum do saldo total 
     * @param valor 
     */
    public void sumSaldoTotal(double valor){
        this.saldoTotal += valor;
    }
    /**
     * Metodo para Adicionar no extrato e subtrair do valor total
     * @param titulo titulo do saldo
     * @param valor valor do saldo
     */
     public void subSaldo(String titulo,double valor){
        this.saldoTotal -= valor;
        this.historico.add(new Saldo(titulo,valor*-1));
    }
     /**
     * Remove saldo especifico
     * @param index indice da lista
     */
    public void removeSaldo(int index) {
        this.saldos.remove(index);
        this.saldoTotal -= this.saldos.get(index).getValor();
    }
    /**
     * Limpa a lista de saldos
     */
    public void clearSaldos() {
        this.saldos.clear();
        this.saldoTotal = 0;
    }
    /**
     * Metodo para obter tamanho da lista divida
     * @return Tamanho da lista divida
     */
    public int getSizeDivida(){
        return this.dividas.size();
    }
    /**
     * Metodo para obter a divida total
     * @return divida total
     */
    public int getDividaTotal() {
        return this.DividaTotal;
    }
    /**
     * Metodo para obter a lista com todas as dividas
     * @return lista de dividas
     */
    public ArrayList<Double> getDividas() {
        ArrayList<Double> aux = new ArrayList<Double>();
        for(int i = 0; i< getSizeSaldo(); ++i){
            aux.add(this.saldos.get(i).getValor());
        }
        return aux;
    }
    /**
     * Metodo para obter a ultima divida fixa adicionada
     * @return ultima divida fixa da lista
     */
    public String lastElementFixas() {
        List <String> aux = this.getDividasFixas(); 
        return aux.get(aux.size()-1);
    }
    /**
     * Metodo para obter a ultima divida variavel adicionada
     * @return ultima divida variavel da lista
     */
    public String lastElementVariaveis() {
        List <String> aux = this.getDividasVariaveis(); 
        return aux.get(aux.size()-1);
    }
    /**
     * Metodo para obter a lista com todas as dividas fixas
     * @return lista de dividas fixas
     */
    public List<String> getDividasFixas() {
       List<String> aux = new ArrayList<String>();
        for(int i = 0; i< sizeFixas(); ++i){
            aux.add(this.fixas.get(i).toString());
        }
        return aux;
    }
    /**
     * Metodo todas as dividas variaveis
     * @return lista com todas as dividas variaveis
     */
    public List<String> getDividasVariaveis() {
       List<String> aux = new ArrayList<String>();
        for(int i = 0; i< sizeVariaveis(); ++i){
            aux.add(this.variaveis.get(i).toString());
        }
        return aux;
    }
    /**
     * Metodo para obter divida especifica
     * @param index indice na lista
     * @return Divida especifica
     */
    public Divida getDivida(int index) {
        return this.dividas.get(index);
    }
    /**
     * Metodo para obter divida fixa especifica
     * @param index indice na lista
     * @return divida fixa especifica
     */
    public String getDividaFixa(int index){
        return this.getDividasFixas().get(index);
    }
    /**
     * Metodo para descontar saldo total quando for adicionado
     * @param titulo da despesa
     * @param valor da despesa
     */
    public void pagoNaHora(String titulo, double valor){
        Saldo aux1 = new Saldo(titulo, valor*-1);
        this.historico.add(aux1);
    }
    /**
     * Metodo para adicionar divida 
     * @param titulo titulo da divida
     * @param valor valor da divida
     * @param tipo tipo de divida
     */
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
    /**
     * Metodo para obter o tamanho da lista dividas fixas
     * @return lista de dividas fixas
     */
    public int sizeFixas(){
        return this.fixas.size();
    }
    /**
     * Metodo para obter o tamanho de lista dividas variaveis 
     * @return lista de dividas variaveis
     */
    public int sizeVariaveis(){
        return this.variaveis.size();
    }
    /**
     * Metodo para editar Divida
     * @param titulo titulo da divida
     * @param valor valor da divida
     * @param tipo tipo de divida
     * @param index indice na lista
     */
    public void editaDivida(String titulo, double valor, int tipo, int index) {
        this.dividas.get(index).setTitulo(titulo);
        this.dividas.get(index).setValor(valor);
        this.dividas.get(index).setTipo(tipo);
    }
    /**
     * Metodo para editar titulo
     * @param titulo titulo
     * @param index indice na lista
     */
    public void editaTitulo(String titulo, int index) {
        this.dividas.get(index).setTitulo(titulo);
    }
    /**
     * Metodo para editar valor
     * @param valor valor da divida 
     * @param index indice na lista
     */
    public void editaValor(double valor, int index) {
        this.dividas.get(index).setValor(valor);
    }
    /**
     * Metodo para editar tipo
     * @param tipo tipo de divida
     * @param index indice na lista
     */
    public void editaTipo(int tipo, int index) {
        this.dividas.get(index).setTipo(tipo);
    }
    /**
     * Metodo para remover divida Fixa
     * @param index indice na lista
     */
    public void removeDividaFixa(int index) {
        this.fixas.remove(index);
    }
    /**
     * Metodo para remover divida variavel
     * @param index indice na lista
     */
    public void removeDividaVariavel(int index) {
        this.variaveis.remove(index);
    }
    /**
     * Metodo para limpar lista de dividas 
     */
    public void clearDividas() {
        this.dividas.clear();
    }

    /**
     * Metodo Para obter tamanho da lista de extrato
     * @return tamanho da lista de extrato
     */
    public int sizeExtrato () {
        return this.historico.size();
    }
    /**
     * Metodo para verificar se o valor é maior que 0
     * @param index indice na lista
     * @return true ou false
     */
    public boolean verificaValor(int index){
        double auxiliar = this.historico.get(index).getValor();
        if(auxiliar > 0){
            return false;
        }
        return true;
    }
    
    /**
     * Metodo para obter todas toStrings de extratos
     * @return todas as toStrings do extrato
     */
    public ArrayList<String> getExtrato() {
        ArrayList<String> Datas = new ArrayList<String>();

        for(int i = 0 ; i < this.historico.size(); ++i)
            Datas.add(this.historico.get(i).toString());

        return Datas;
    }
    /**
     * Metodo para obter todas as datas de movimentação de extrato
     * @return Lista com todas as datas
     */
    public ArrayList<String> getDates() {
        ArrayList<String> Datas = new ArrayList<String>();

        for(int i = 0; i < this.historico.size(); ++i) {
            String aux = this.historico.get(i).getData();

            Datas.add(aux);
        }
        return Datas;
    }

}