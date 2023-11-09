package org.example;

import java.io.Serializable;

public class Laptop implements Serializable {
    String brend, model;
    double cijena;
    int hdd, ssd, ram;
    String procesor, grafickaKartica;
    double velicinaEkrana;


    //getteri
    public String getBrend() {return brend;}
    public String getModel() {return model;}
    public double getCijena() {return cijena;}
    public int getHdd() {return hdd;}
    public int getSsd() {return ssd;}
    public int getRam() {return ram;}
    public String getGrafickaKartica() {return grafickaKartica;}
    public String getProcesor() {
        return procesor;
    }
    public double getVelicinaEkrana() {return velicinaEkrana;}

    //setteri
    public void setBrend(String x) {brend = x;}
    public void setModel(String x) {model = x;}
    public void setCijena(double x) {cijena = x;}
    public void setHdd(int x) {hdd = x;}
    public void setSsd(int x) {ssd = x;}
    public void setRam(int x) {ram = x;}
    public void setProcesor(String x) {procesor = x;}
    public void setGrafickaKartica(String x) {grafickaKartica = x;}
    public void setVelicinaEkrana(double x) {velicinaEkrana = x;}


}

