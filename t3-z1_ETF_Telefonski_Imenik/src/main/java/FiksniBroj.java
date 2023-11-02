enum Grad {
    BIHAC("037"),
    ORASJE("031"),
    TUZLA("035"),
    ZENICA("032"),
    GORAZDE("038"),
    TRAVNIK("030"),
    MOSTAR("036"),
    SIROKI_BRIJEG("039"),
    SARAJEVO("033"),
    LIVNO("034"),
    BRCKO("049");

    private String pozivniBroj;

    Grad(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }

    public String dajPozivniBroj() {
        return pozivniBroj;
    }
}
public class FiksniBroj extends TelefonskiBroj {
    String broj;
    public Grad grad;

    public FiksniBroj(Grad g, String b) {
        grad = g;
        broj = b;
    }

    public Grad dajGrad() {
        return grad;
    }

    @Override
    public String ispisi() {
        return grad.dajPozivniBroj() + "/" + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
