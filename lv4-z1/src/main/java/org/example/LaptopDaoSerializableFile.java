package org.example;

import java.io.*;
import java.util.ArrayList;
public class LaptopDaoSerializableFile implements LaptopDao {

    File file;
    ArrayList<Laptop> laptopi = new ArrayList<>();

    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) {
        try {
            FileOutputStream fos = new FileOutputStream("/home/student/Desktop/");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //write object
            oos.writeObject(laptop);

            //close streams
            oos.close();
            fos.close();

            System.out.println("Serialized data is saved! :D");
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public Laptop getLaptop(String procesor) {
        for(Laptop x : laptopi) {
            if(x.getProcesor() == procesor) {
                return x;
            }
        }   //ovdje treba dodati exception ako ne postoji takav laptop
        return null;
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        this.laptopi = laptopi;
    }

    @Override
    public void vratiPodatkeIzDatoteke() {
        ArrayList<Laptop> rez = new ArrayList<>();
        try {
            Laptop lap = null;

            FileInputStream fis = new FileInputStream("/home/student/Desktop/");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //write object
            lap = (Laptop) ois.readObject();

            //close streams
            ois.close();
            fis.close();
        }
        catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
