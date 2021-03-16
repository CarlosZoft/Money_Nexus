package application.Test;

import application.Models.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int escolhaMenu = 100;
        //variável saldo tem que ser salva em um arquivo está aqui apenas a fim de testes;
        double saldo = 0;
        double bubble;

        String opora = "Atenção chegou chatuba hein";
        Scanner ler = new Scanner(System.in);
        File jhonsons = new File(opora);

        while (escolhaMenu != 0) {
            System.out.println("Bem vindo a Money Nexus o que eu posso fazer por você hoje?");
            System.out.println("0 - Sair e encerrar o programa!");
            System.out.println("1 - Adicionar Saldo.");
            System.out.println("2 - Extrato.");
            System.out.println("3 - verificar dividas parceladas/momentaneas.");
            escolhaMenu = ler.nextInt();
            switch (escolhaMenu) {
                case 0:
                    System.out.println("BYE BYE!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Qual o valor a ser adicionado");
                    bubble = ler.nextDouble();
                    if(bubble > 0){
                        saldo += bubble;
                        System.out.println("Sucesso " + bubble +  " foram adicionados!");
                    }
                    else{
                        System.out.println("não são permitidos valores negativos caso haja uma subtração de valores tente com a função dividas!");
                    }
                    break;
                case 2:
                    System.out.println("Total em caixa:" + saldo);
                    break;
                case 3:
                    System.out.println("Função em desenvolvimento :D!");
                    break;
                    default:
                    System.out.println("Desculpe mas sua opção está fora do intervalo de opções por favor tente de novo!");
                    break;
            }
        }
    }
}