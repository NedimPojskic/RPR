public class MedunarodniBroj extends TelefonskiBroj {
    String drzava, broj;
    public MedunarodniBroj(String d, String b) {
        drzava = d;
        broj = b;
    }

    @Override
    public String ispisi() {
        return drzava + " " + broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
