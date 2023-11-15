package org.example;

public class Ocjena {
    LicneInformacije osoba;
    int ocjena;

    public Ocjena(LicneInformacije Osoba, int Ocjena) {
        setOcjena(Ocjena);
        osoba = Osoba;
    }
    public void setOcjena(int x) {
        if(x < 10 && x > 0) {
            ocjena = x;
        }
    }
}
