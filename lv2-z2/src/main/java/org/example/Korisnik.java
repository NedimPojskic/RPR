package org.example;

public class Korisnik extends Osoba {

    public Racun racun;
    public Korisnik(String i, String p) {
        super(i, p);
    }

    void dodajRacun(Racun r) {
        racun = r;
    }

}
