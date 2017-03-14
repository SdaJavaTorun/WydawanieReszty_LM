package com.sdajava.wydawaniereszty;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] PLN = {500.0, 200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        double reszta = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj reszte: ");

        try {
            reszta = in.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("Nieprawidlowa wartosc");
            return;
        }
        String wynik = "Reszta\n";

        for (int i = 0; ((i < PLN.length) && (reszta > 0.00)); i++) {
            if (reszta >=  PLN[i]) {
                int a = (int) Math.floor(reszta /  PLN[i]);
                wynik +=  PLN[i] + " PLN x " + a + "\n";
                reszta = (double) Math.round(100 * (reszta - (a *  PLN[i]))) / 100;
            }
        }
        System.out.println(wynik);
    }
}
