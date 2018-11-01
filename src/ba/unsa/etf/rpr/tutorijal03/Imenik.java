package ba.unsa.etf.rpr.tutorijal03;

import java.util.Map;
import java.util.Set;

public class Imenik {
    private String imeVlasnika;
    TelefonskiBroj brojVlasnika;
    private Map<String,  TelefonskiBroj> mapa;
    public void dodaj(String ime, TelefonskiBroj broj) {

    }

    String dajBroj(String ime) {
        return brojVlasnika.ispisi();
    }

    String dajIme (TelefonskiBroj broj) {
        return imeVlasnika;
    }

    String naSlovo(char s) {

    }
     Set<String> izGrada(FiksniBroj.Grad g) {
        return null;
    }

    Set<TelefonskiBroj> izGradaBrojevi (FiksniBroj.Grad g) {
        return null;
    }
}
