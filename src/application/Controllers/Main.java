package application.Controllers;
import application.Models.*;
import application.Views.*;

import java.io.IOException;
import java.util.Scanner;

import application.errors.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Conta saldo = new Conta();
        ControllerEconomia poupanca = new ControllerEconomia();
        MainView teste = new MainView(poupanca, saldo);
        teste.setVisible(true);
    }

}
