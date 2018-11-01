package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj{

    private String telBroj;
    //pokusaj da ne pravim novi niz nego da odmah dodijelim vrijednosti pozivnih brojeva gradu
    public enum Grad {TRAVNIK ("030"), ORAŠJE("031"), ZENICA("032"), SARAJEVO("033"), LIVNO ("034"), TUZLA("035"), MOSTAR("036"), BIHAĆ("037"), GORAŽDE ("038"), ŠIRKOI_BRIJEG("039"), BRČKO("049");
    private String pozivni;
        Grad(String i) {
            this.pozivni = i;
        }
      public String vratiPozivni(){
            return this.pozivni;
      }
    };
    private Grad grad;

    public FiksniBroj (Grad grad, String broj) {
        this.telBroj = broj;
        this.grad = grad;
    }

    @Override
    public String ispisi() {
        String ispis = new String();
        String pozivni = grad.vratiPozivni();
        ispis = ispis + pozivni + "/" + telBroj;
        //String.format("%d %S / %S - %S");
        return ispis;
    }

    @Override
    public int hashCode() {
       return this.ispisi().hashCode();
    }

}
