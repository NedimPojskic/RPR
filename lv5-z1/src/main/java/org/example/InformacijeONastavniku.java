package org.example;

public class InformacijeONastavniku extends LicneInformacije implements Interfejs {
    String titula;
    public String getTitula() { return titula; }
    public void setTitula(String x) { titula = x; }


    @Override
    public String predstavi() {
        return ime + " " + prezime + ", titula: " + titula;
    }
}
