package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj implements Comparable<TelefonskiBroj>{
    protected String telBroj;
    public abstract String ispisi();
    public abstract int hashCode();
    public int compareTo(TelefonskiBroj br) {
        return  this.ispisi().compareTo(br.ispisi());
    }
}
