import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ImenikTest {
    Imenik imenik = new Imenik();
    TelefonskiBroj broj_1 = new MobilniBroj(62, "111-111");
    TelefonskiBroj broj_2 = new MobilniBroj(62, "222-222");
    TelefonskiBroj broj_3 = new MobilniBroj(63, "333-333"); //ovaj necu dodati u imenik tako da ne postoji
    @Test
    void dodaj() {
        imenik.dodaj("Nedim", broj_1);
        imenik.dodaj("Hamza", broj_2);
    }

    @Test
    void dajIme() { //ova metoda ima izuzetak
        try
        {
            imenik.dodaj("Nedim", broj_1);
            imenik.dodaj("Hamza", broj_2);
            System.out.println(imenik.dajIme(broj_1));
            System.out.println(imenik.dajIme(broj_2));
            System.out.println(imenik.dajIme(broj_3));
        }
        catch (NemaBroja e) {
            System.out.println(e);
        }
    }

    @Test
    void naSlovo() {
        imenik.dodaj("Nedim", broj_1);
        imenik.dodaj("Hamza", broj_2);
        System.out.println("Na slovo N: " + imenik.naSlovo('N'));
        System.out.println("Na slovo H: " + imenik.naSlovo('H'));
    }
}