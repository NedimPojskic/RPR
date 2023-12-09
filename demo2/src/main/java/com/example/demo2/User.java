package com.example.demo2;

public class User {
    String ime, prezime, email, username, password;

    public User(String i, String p, String e, String u, String pass) {
        ime = i; prezime = p; email = e; username = u; password = pass;
    }

    public String getUsername() {
        return username;
    }
}
