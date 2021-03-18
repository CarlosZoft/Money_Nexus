package application.Test;

import application.Models.Usuario;
import application.Models.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int escolhaMenu = 100, op = 0;
        double saldo = 0;
        String nome,titulo = "novo valor";

        Usuario nUser = new Usuario();
        Saldo caixa = new Saldo(titulo, saldo);
        Scanner palavra = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        Divida debito = new Divida(titulo, saldo, 1);
        Economia poupador = new Economia(titulo,saldo);

        System.out.println("insira nome de usuario caso haja um caso não deixe em branco.");
        nome = palavra.nextLine();
        System.out.println("Seja bem vindo " + nome + ".");
        nUser.setNome(nome);

        while (escolhaMenu != 0) {

            System.out.println("Olá " + nome + " o que a Money Nexus pode fazer por você?");
            System.out.println("0 - Sair e encerrar o programa!");
            System.out.println("1 - Adicionar Saldo.");
            System.out.println("2 - Adicionar Divida.");
            System.out.println("3 - Extrato.");
            System.out.println("4 - Verificar dividas parceladas/momentaneas.");
            System.out.println("5 - Adicionar meta economica pessoal");

            escolhaMenu = ler.nextInt();

            switch (escolhaMenu) {
                case 0:
                    System.out.println("BYE BYE!");
                    System.exit(0);
                    break;

                case 1:
                    System.out.println("Qual o valor a ser adicionado");
                    saldo = ler.nextDouble();
                    caixa.setValor(saldo);
                    if(saldo > 0){
                        System.out.println("Sucesso " + saldo +  " foram adicionados!");
                    }
                    else{
                        System.out.println("não são permitidos valores negativos caso haja uma subtração de valores tente com a função dividas!");
                    }
                    break;

                case 2:
                    System.out.println("Qual o motivo/nome da divida:");
                        titulo = palavra.nextLine();
                    debito.setTitulo(titulo);
                    System.out.println("Qual o valor do debito:");
                        saldo = ler.nextDouble();
                    debito.setValor(saldo);
                    System.out.println("Divida de: " + saldo + " com o a razão de: " + titulo + " foram adicionados!");
                    break;

                case 3:
                    System.out.println("Total em caixa: " + caixa.getValor());
                    System.out.println("Total de dividas: " + debito.getValor() + " em nome de: " + debito.getTitulo() + ".");
                    break;

                case 4:
                    System.out.println("Dividas de:" + debito.getValor() + " com o nome de: " + debito.getTitulo() + " pendentes!!!");
                    break;

                case 5:
                    System.out.println("Para qual finalidade será essa economia:");
                        titulo = palavra.nextLine();
                    poupador.setTitulo(titulo);
                    System.out.println("qual o valor a ser atingido:");
                        saldo = ler.nextDouble();
                    poupador.setValor(saldo);
                    System.out.println("Nova economia com fim de " + poupador.getTitulo() + " com meta de: " + poupador.getValor() + " foi adicionada!");
                    break;

                default:
                    System.out.println("Desculpe mas sua opção está fora do intervalo de opções por favor tente de novo!");
                    break;
            }
        }
    }
}