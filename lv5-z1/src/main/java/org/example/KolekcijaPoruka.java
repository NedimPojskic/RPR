package org.example;

import java.util.ArrayList;
import java.util.List;

public class KolekcijaPoruka {
    List<String> poruke = new ArrayList<>();

    public KolekcijaPoruka(List<Interfejs> x) {
        for(int i = 0; i < x.size(); i++) {
            poruke.add(x.get(i).predstavi());
        }
    }

    public List<String> getPoruke() {
        return poruke;
    }

}
