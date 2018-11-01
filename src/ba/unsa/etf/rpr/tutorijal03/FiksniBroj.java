package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj{

    private String telBroj;
    //pokusaj da ne pravim novi niz nego da odmah dodijelim vrijednosti pozivnih brojeva gradu
    public enum Grad {TRAVNIK (30), ORAŠJE(31), ZENICA(32), SARAJEVO(33), LIVNO (34), TUZLA(35), MOSTAR(36), BIHAĆ(37), GORAŽDE (38), ŠIRKOI_BRIJEG(39), BRČKO(49);
    private int pozivni;
        Grad(int i) {
            this.pozivni = i;
        }
      public int vratiPozivni(){
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
        String pozivni = "0" + grad.vratiPozivni();
        ispis = ispis + pozivni + "/" + telBroj;
        //String.format("%d %S / %S - %S");
        return ispis;
    }

    @Override
    public int hashCode() {
       return this.ispisi().hashCode();
    }

}
