package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

interface LaptopDao {
    public void dodajLaptopUListu(Laptop laptop) throws IOException;
    public void dodajLaptopUFile(Laptop laptop);
    public Laptop getLaptop(String procesor);
    public void napuniListu(ArrayList<Laptop> laptopi);
    public void vratiPodatkeIzDatoteke();
}

