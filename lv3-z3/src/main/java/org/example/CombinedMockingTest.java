package org.example;

import java.util.HashMap;
import java.util.Map;

class BaznaKlasa {
    private IzvedenaKlasa izvedenaKlasa;

    public BaznaKlasa(IzvedenaKlasa izvedenaKlasa) {
        this.izvedenaKlasa = izvedenaKlasa;
    }

    public String pozoviMetoduIzvedeneKlase() {
        return izvedenaKlasa.izvedenaMetoda();
    }
}

class IzvedenaKlasa {
    public String izvedenaMetoda() {
        return "Ovo je izvedena metoda";
    }
}

class ManualMapMock extends HashMap<String, String> {
    @Override
    public String get(Object key) {
        return super.get(key);
    }
}

class ManualIzvedenaKlasaMock extends IzvedenaKlasa {
    private String expectedResult;

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    @Override
    public String izvedenaMetoda() {
        return expectedResult;
    }
}

public class CombinedMockingTest {

    public static void main(String[] args) {

        testMapWithManualMock();
        testInheritanceWithManualMock();
    }

    private static void testMapWithManualMock() {

        Map<String, String> mapMock = new ManualMapMock();

        mapMock.put("key1", "value1");
        mapMock.put("key2", "value2");

        // Testiranje
        System.out.println(mapMock.get("key1"));  // printa "value1"
        System.out.println(mapMock.get("key2"));  // printa "value2"
    }

    private static void testInheritanceWithManualMock() {

        IzvedenaKlasa izvedenaKlasaMock = new ManualIzvedenaKlasaMock();

        ((ManualIzvedenaKlasaMock) izvedenaKlasaMock).setExpectedResult("Mocked izvedena metoda");
        BaznaKlasa baznaKlasa = new BaznaKlasa(izvedenaKlasaMock);

        // Testiranje
        System.out.println(baznaKlasa.pozoviMetoduIzvedeneKlase());  // ispisuje "Mocked izvedena metoda"
    }
}
