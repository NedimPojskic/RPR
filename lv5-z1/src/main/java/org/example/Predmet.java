package org.example;

public class Predmet  implements  Interfejs {
    String naziv, opis;

    public String getNaziv() { return naziv; }
    public String getOpis() { return opis; }

    public void setNaziv(String x) { naziv = x; }
    public void setOpis(String x) { opis = x; }

    @Override
    public String predstavi() {
        return "Predmet: " + naziv + ", opis: " + opis;
    }
}
