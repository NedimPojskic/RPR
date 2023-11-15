package org.example;

import java.util.ArrayList;
import java.util.List;

public class InformacijeONastavniku extends LicneInformacije implements Interfejs,MozeOcijeniti {
    String titula;
    List<Ocjena> ocjene = new ArrayList<>();
    public String getTitula() { return titula; }
    public void setTitula(String x) { titula = x; }


    @Override
    public String predstavi() {
        return ime + " " + prezime + ", titula: " + titula;
    }

    @Override
    public Ocjena ocijeni(int x) {
        return null;
    }
}
