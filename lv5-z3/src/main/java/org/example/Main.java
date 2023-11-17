package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        KolekcijaImena kolekcijaImena = new KolekcijaImena();
        System.out.println("Unesi ime i prezime (0 za prekid): ");
        String ime;
        do {
            ime = scanner.nextLine();
            kolekcijaImena.dodajImeIPrezime(ime);
        } while (!Objects.equals(ime, "0"));

        Pobjednik pobjednik = new Pobjednik(kolekcijaImena);



    }
}