package org.example;

import java.util.ArrayList;
import java.util.List;

public class KolekcijaImenaIPrezimena extends KolekcijaImena {

    List<String> imena = new ArrayList<String>();
    List<String> prezimena = new ArrayList<String>();

    public int getIndexNajduzegPara() throws MojException {
        if(imena.size() != prezimena.size()) {
            throw new MojException("Broj imena i prezimena mora biti jednak!");
        }

        int rez = 0;
        for(int i = 0; i < imena.size(); i++) {
            if(imena.get(i).length() + prezimena.get(i).length() > rez) {
                rez = i;
            }
        }
        return rez;
    }

    public String getImeIPrezime(int i) throws MojException {
        if(i > imena.size()) {
            throw new MojException("Index van dozvoljenog opsega!");
        }
        return imena.get(i) + " " + prezimena.get(i);
    }

}
