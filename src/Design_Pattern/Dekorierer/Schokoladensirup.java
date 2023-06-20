package Design_Pattern.Dekorierer;

public class Schokoladensirup extends ToppingDekorieren{
    public Schokoladensirup(Kaffee next) {
        super(next);
    }

    @Override
    double preis() {
        return 0.75 + this.next.preis();
    }

    @Override
    String getBeschreibung() {
        return this.next.beschreibung +" mit Schokoladensirup";
    }
}
