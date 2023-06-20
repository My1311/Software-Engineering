package Design_Pattern.Dekorierer;

public abstract class ToppingDekorieren extends Kaffee{
    protected Kaffee next;
    public ToppingDekorieren(Kaffee next) {
        this.next = next;
    }
}
