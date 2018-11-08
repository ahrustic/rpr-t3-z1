package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj{

    private String drzava;
    String broj;
    MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }
    @Override
    public String ispisi() {
        String ispis = null;
        String pozivni = drzava;
        ispis = ispis + pozivni + "/" + broj;
        return ispis;
    }

    @Override
    public int hashCode() {
        return this.ispisi().hashCode();
    }
}
