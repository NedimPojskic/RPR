package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double n;
        System.out.println("Unesite broj:");

        n = keyboard.nextInt();

        racunaj hepek = new racunaj(n);

        System.out.println("sinus broja je: " + hepek.dajSinus());
        System.out.println("faktorijel broja je: " + hepek.dajFaktorijel());

    }
}