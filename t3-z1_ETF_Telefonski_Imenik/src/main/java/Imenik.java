import java.util.*;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik = new HashMap<>();
    public void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime, broj);
    }
    public String dajBroj(String ime) {
        return imenik.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if(entry.getValue() == broj) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String naSlovo(char s) {
        int i = 1;
        String rez = "";
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            String key = entry.getKey();
            if(entry.getKey().charAt(0) == s) {
                rez += i + ". " + entry.getKey() + " - " + entry.getValue().ispisi() + "\n";
                i++;
            }
        }
        return rez;
    }

    public Set<String> izGrada(Grad g) {
        Set<String> skup = new HashSet<>();
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if(entry.getValue() instanceof FiksniBroj) {
                if(((FiksniBroj) entry.getValue()).dajGrad() == g) {
                    skup.add(entry.getKey());
                }
            }
        }
        return skup;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g) {
        Set<TelefonskiBroj> skup = new HashSet<>();
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if(entry.getValue() instanceof FiksniBroj) {
                if(((FiksniBroj) entry.getValue()).dajGrad() == g) {
                    skup.add(entry.getValue());
                }
            }
        }
        return skup;
    }
}