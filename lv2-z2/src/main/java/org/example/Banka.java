package org.example;

import java.util.List;

public class Banka {

    long brojRacuna;
    List<Korisnik> korisnici;
    List<Uposlenik> uposlenici;

    public Banka() {}

    public Korisnik kreirajNovogKorisnika(String i, String p) {
        korisnici.add(new Korisnik(i, p));
        return new Korisnik(i, p);
    }

    public Uposlenik kreirajNovogUposlenika(String i, String p) {
        uposlenici.add(new Uposlenik(i, p));
        return new Uposlenik(i, p);
    }

    public Racun kreirajRacunZaKorisnika(Korisnik k) {
        k.dodajRacun(new Racun(0, k));
        return new Racun(0, k);
    }

}
