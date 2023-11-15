package org.example;

import java.util.ArrayList;
import java.util.List;

public class Predmet  implements  Interfejs,MozeOcijeniti {
    String naziv, opis;
    List<Ocjena> ocjene = new ArrayList<>();

    public String getNaziv() { return naziv; }
    public String getOpis() { return opis; }

    public void setNaziv(String x) { naziv = x; }
    public void setOpis(String x) { opis = x; }

    @Override
    public String predstavi() {
        return "Predmet: " + naziv + ", opis: " + opis;
    }

    @Override
    public Ocjena ocijeni(int x) {
        return null;
    }
}
