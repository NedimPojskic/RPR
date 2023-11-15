package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InformacijeOStudentu a1 = new InformacijeOStudentu();
        InformacijeONastavniku a2 = new InformacijeONastavniku();
        Predmet matematika = new Predmet();

        a1.setIme("Nedim");
        a1.setPrezime("Pojskic");
        a1.setBrojIndexa("19128");
        a1.setGodinaStudija("2024");

        a2.setIme("Mujo");
        a2.setPrezime("Mujic");
        a2.setTitula("Kralj");

        matematika.setOpis("Jedan od predmeta na fakultetu");
        matematika.setNaziv("Inzinjerska Matematika 1");

        ArrayList<Interfejs> lista = new ArrayList<>();
        lista.add(a1);
        lista.add(a2);
        lista.add(matematika);

        KolekcijaPoruka kolekcija = new KolekcijaPoruka(lista);

        ArrayList<String> poruke = (ArrayList<String>) kolekcija.getPoruke();

        for(int i = 0; i < poruke.size(); i++) {
            System.out.println(poruke.get(i));
        }

    }
}