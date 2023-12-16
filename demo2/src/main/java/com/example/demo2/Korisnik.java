package com.example.demo2;

import javafx.beans.property.SimpleStringProperty;

public class Korisnik {
    //String ime, prezime, email, username, password;
    private SimpleStringProperty ime;
    private SimpleStringProperty prezime;
    private SimpleStringProperty email;
    private SimpleStringProperty username;
    private SimpleStringProperty password;

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

    public SimpleStringProperty getIme() {return ime;}
    public SimpleStringProperty getPrezime() {return prezime;}
    public SimpleStringProperty getEmail() {return email;}
    public SimpleStringProperty getUsername() {
        return username;
    }
    public SimpleStringProperty getPassword() {return password;}


    public void setIme(SimpleStringProperty x) {
        ime = x;
    }
    public void setPrezime(SimpleStringProperty x) {
        prezime = x;
    }
    public void setEmail(SimpleStringProperty x) {
        email = x;
    }
    public void setUsername(SimpleStringProperty x) {
        username = x;
    }
    public void setPassword(SimpleStringProperty x) {
        password = x;
    }

    public Korisnik getKorisnik() {
        return this;
    }
}
