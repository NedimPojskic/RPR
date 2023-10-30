import java.util.*;

import static java.sql.DriverManager.println;

public class Main {
    public static void main(String[] args) {
        FiksniBroj mojBroj = new FiksniBroj(Grad.ZENICA, "063-150");
        System.out.print(mojBroj.ispisi());

    }
}