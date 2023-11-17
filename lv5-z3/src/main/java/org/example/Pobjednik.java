package org.example;

public class Pobjednik {
    String ime, prezime;
    int brojZnakova;
    KolekcijaImena kolekcijaImena;

    public Pobjednik(KolekcijaImena k) {
        String temp = k.getNajduzeIme();
        brojZnakova = temp.length();

        boolean pisemIme = true;
        for(int i = 0; i < temp.length(); i++) {
            if(pisemIme) {
                if(temp.charAt(i) == ' ') {
                    pisemIme = false;
                    continue;
                }
                ime += temp.charAt(i);
            } else {
                prezime += temp.charAt(i);
            }
        }
    }
}
