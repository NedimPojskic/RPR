package org.example;

import java.util.ArrayList;
import java.util.List;

public class KolekcijaImena {
    List<String> imena = new ArrayList<>();

    public String getNajduzeIme() {
        String rez = "";
        for(int i = 0; i < imena.size(); i++) {
            if(imena.get(i).length() < rez.length()) {
                rez = imena.get(i);
            }
        }
        return rez;
    }

    public void dodajImeIPrezime(String x) {
        imena.add(x);
    }
}
