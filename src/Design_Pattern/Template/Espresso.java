package Design_Pattern.Template;

public class Espresso extends Kaffeezubereitung{
    @Override
    protected void tasseHinstellen() {
        System.out.println("Kleine Tasche");
    }

    @Override
    protected void knopfDrucken() {
        System.out.println("Espresso");
    }
}
