package org.example;

public class Racun {
    private double stanjeRacuna;
    private boolean odobrenjePrekoracenja = false;
    private long brojRacuna;
    private Osoba korisnikRacuna;

    public Racun(long broj, Osoba o) {
        brojRacuna = broj;
        korisnikRacuna = o;
    }

    private boolean provjeriOdobrenjePrekoracenja(double broj) {
        return odobrenjePrekoracenja;
    }

    public boolean izvrsiUplatu(double kolicina) {
        stanjeRacuna = stanjeRacuna + kolicina;
        return true;
    }

    public boolean izvrsiIsplatu(double kolicina) {
        stanjeRacuna = stanjeRacuna - kolicina;
        return true;
    }

    public void odobriPrekoracenje(double n) {
        odobrenjePrekoracenja = !odobrenjePrekoracenja;
    }

}
