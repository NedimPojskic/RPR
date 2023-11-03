import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        Imenik imenik = new Imenik();

        int opcija;
        try {
            do {
                dajOpcije();
                opcija = skener.nextInt();
                switch (opcija) {
                    case 1: {
                        System.out.println("Unesite ime i prezime:");
                        skener.nextLine();
                        String ime = skener.nextLine();
                        System.out.println("Unesite broj telefona (XXX-XXX):");
                        String broj = skener.nextLine();
                        FiksniBroj b = new FiksniBroj(Grad.SARAJEVO, broj);

                        imenik.dodaj(ime, b);
                        System.out.println("Broj uspjesno dodat u imenik!");
                        continue;
                    }
                    case 2: {
                        System.out.println("Dajte ime po kojem zelite traziti:");
                        skener.nextLine();
                        String ime = skener.nextLine();
                        System.out.println("Broj sa datim imenom je " + imenik.dajBroj(ime));
                        continue;
                    }
                    case 3: {
                        System.out.println("Dajte broj po kojem zelite traziti (XXX-XXX):");
                        skener.nextLine();
                        String broj = skener.nextLine();
                        FiksniBroj b = new FiksniBroj(Grad.SARAJEVO, broj);
                        System.out.println("Osoba sa datim brojem je " + imenik.dajIme(b));
                        continue;
                    }
                    case 4: {
                        System.out.println("Unesite prvo slovo imena po kojem zelite traziti:");
                        skener.nextLine();
                        char slovo = skener.next().charAt(0);
                        System.out.println("Osobe cije ime pocinje sa " + slovo + " su:");
                        System.out.print(imenik.naSlovo(slovo));
                        continue;
                    }
                    case 5: {
                        Set<String> imena = imenik.izGrada(Grad.SARAJEVO);
                        System.out.println("Osobe iz tog grada su:");
                        for (String x : imena) {
                            System.out.println(x);
                        }
                        continue;
                    }
                    case 6: {
                        Set<TelefonskiBroj> brojevi = imenik.izGradaBrojevi(Grad.SARAJEVO);
                        System.out.println("Brojevi iz tog grada su:");
                        for (TelefonskiBroj x : brojevi) {
                            x.ispisi();
                        }
                    }
                }
            } while (opcija != 0);
        }
        catch(NemaBroja e)
        {
            System.out.println(e);
        }
    }

    public static void dajOpcije() {
        System.out.println("Unesite brojeve za odabir opcija (0 za prekid): ");
        System.out.println("1 - Dodaj broj u imenik");
        System.out.println("2 - Daj broj po imenu");
        System.out.println("3 - Daj ime po broju");
        System.out.println("4 - Daj imena po pocetnom slovu");
        System.out.println("5 - Daj set imena po gradovima");
        System.out.println("6 - Daj set brojeva po gradovima");
    }
}