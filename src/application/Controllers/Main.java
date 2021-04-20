package application.Controllers;
import application.Models.*;
import application.Views.*;

import java.io.IOException;
import java.util.Scanner;

import application.errors.*;
import javax.swing.JOptionPane;
/**
 * 
 * @author Carlos Rafael
 * @version 1.0.0
 */
public class Main {
    
    /**
     * Função que chama a view e Ativa a interface
     * @param args string
     * @throws Exception Caso não consiga rodar a aplicaçao
     */
    
    public static void main(String[] args) throws Exception {
       try{ 
            Conta saldo = new Conta();
            ControllerEconomia poupanca = new ControllerEconomia();
            MainView teste = new MainView(poupanca, saldo);
            teste.setVisible(true);
       }
       catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possível rodar a aplicaçao");
       }
    }

}
