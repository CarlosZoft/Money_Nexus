package application.Controllers;
import application.Models.*;

import java.io.IOException;
import java.util.Scanner;

import application.errors.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Saldo saldo = new Saldo("Salario", 3.000);

        System.out.println(saldo.toString());
    }

}
