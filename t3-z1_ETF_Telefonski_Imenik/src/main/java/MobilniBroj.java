public class MobilniBroj extends TelefonskiBroj {
    int mobilnaMreza;
    String broj;
    public MobilniBroj(int m, String b) {
        mobilnaMreza = m;
        broj = b;
    }


    @Override
    public String ispisi() {
        return "0" + mobilnaMreza + "/" + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
