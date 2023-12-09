package com.example.demo2;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;

public class KorisniciModel {
    ObservableList<Korisnik> listaKorisnika = new ObservableListBase<Korisnik>() {
        @Override
        public Korisnik get(int index) {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }
    };

    SimpleObjectProperty<Korisnik> trenutniKorisnik = new SimpleObjectProperty<>();
}
