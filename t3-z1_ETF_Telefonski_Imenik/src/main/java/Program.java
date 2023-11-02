import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);

        int opcija;
        do {
            dajOpcije();
            opcija = skener.nextInt();
            switch(opcija) {
                case 1:
                {
                    System.out.println("Unesite ime i prezime:");
                    String ime = skener.nextLine();
                    System.out.println("Unesite broj telefona (XXX-XXX)");
                }
            }
        } while (opcija != 0);


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