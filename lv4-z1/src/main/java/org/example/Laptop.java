package org.example;

import java.io.Serializable;

public class Laptop implements Serializable {
    String brend, model;
    double cijena;
    int hdd, ssd, ram;
    String procesor, grafickaKartica;
    double velicinaEkrana;

    public String getProcesor() {
        return procesor;
    }

}

