package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {

    int mobilnaMreza;
    String broj ;

    MobilniBroj(int mobilnaMreza, String broj) {
        if (mobilnaMreza >= 60 && mobilnaMreza <= 67) {
            this.mobilnaMreza = mobilnaMreza;
            this.broj = broj;
        }
        else throw new IllegalArgumentException();
    }

    @Override
    public String ispisi() {
        String ispis = new String();
        String pozivni = "0" + mobilnaMreza;
        ispis = ispis + pozivni + "/" + broj;
        return ispis;
    }

    @Override
    public int hashCode() {
        return this.ispisi().hashCode();
    }
}
