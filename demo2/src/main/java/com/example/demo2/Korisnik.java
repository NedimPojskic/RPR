package com.example.demo2;

import javafx.beans.property.SimpleStringProperty;

public class Korisnik {
    //String ime, prezime, email, username, password;
    private final SimpleStringProperty ime;
    private final SimpleStringProperty prezime;
    private final SimpleStringProperty email;
    private final SimpleStringProperty username;
    private final SimpleStringProperty password;

    public Korisnik() {
        this("", "", "", "", "");
    }
    public Korisnik(final String i, final String p, final String e, final String u, final String pass) {
        this.ime = new SimpleStringProperty(i);
        this.prezime = new SimpleStringProperty(p);
        this.email = new SimpleStringProperty(e);
        this.username = new SimpleStringProperty(u);
        this.password = new SimpleStringProperty(pass);
    }

    public SimpleStringProperty getUsername() {
        return username;
    }
}
