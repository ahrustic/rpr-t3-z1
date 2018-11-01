package ba.unsa.etf.rpr.tutorijal03;

import ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
    private String imeVlasnika;
    TelefonskiBroj brojVlasnika;
    private Map<String,  TelefonskiBroj> mapa;
    public void dodaj(String ime, TelefonskiBroj broj) {
        mapa.putIfAbsent(ime, broj);
    }

    String dajBroj(String ime) {
        return brojVlasnika.ispisi();
    }

    String dajIme (TelefonskiBroj broj) {
        return imeVlasnika;
    }

    String naSlovo(char s) {
       String brojeviNaSlovo = "";
       int redniBroj = 0;
        for (Map.Entry<String, TelefonskiBroj> el:mapa.entrySet()) {
            String ime = el.getKey();
            TelefonskiBroj broj= el.getValue();
            if (ime.charAt(0) == s) {
                redniBroj++;
                brojeviNaSlovo += "" + redniBroj +". "+ ime + " - " + broj;
            }
        }
        return brojeviNaSlovo;
    }
     Set<String> izGrada(Grad g) {
        Set<String> brojeviIzGrada = new TreeSet<String>();
         for (Map.Entry<String, TelefonskiBroj> el:mapa.entrySet()) {
            TelefonskiBroj broj = el.getValue();
            if (broj.telBroj.charAt(0) == g.vratiPozivni().charAt(0) && broj.telBroj.charAt(1) == g.vratiPozivni().charAt(1) && broj.telBroj.charAt(2) == g.vratiPozivni().charAt(2))
                brojeviIzGrada.add(imeVlasnika);
        }
        return brojeviIzGrada;
    }

    Set<TelefonskiBroj> izGradaBrojevi (Grad g) {
        Set<TelefonskiBroj> brojeviIzGrada = new TreeSet<TelefonskiBroj>();
        for (Map.Entry<String, TelefonskiBroj> el:mapa.entrySet()) {
            TelefonskiBroj broj = el.getValue();

        }
        return brojeviIzGrada;
    }
}
