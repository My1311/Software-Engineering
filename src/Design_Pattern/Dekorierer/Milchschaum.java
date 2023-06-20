package Design_Pattern.Dekorierer;

public class Milchschaum extends ToppingDekorieren{
    public Milchschaum(Kaffee next) {
        super(next);
    }
    @Override
    double preis() {
        return 0.5 + this.next.preis();
    }
    @Override
    String getBeschreibung() {
        return this.next.getBeschreibung() +" mit Milchschaum ";
    }
}
