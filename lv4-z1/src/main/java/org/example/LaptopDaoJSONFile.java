package org.example;

import java.io.File;
import java.util.ArrayList;


public class LaptopDaoJSONFile implements LaptopDao {

    File file;
    ArrayList<Laptop> laptopi = new ArrayList<>();
    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) {

    }

    @Override
    public Laptop getLaptop(String procesor) {

        return null;
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {

    }

    @Override
    public void vratiPodatkeIzDatoteke() {

    }
}
